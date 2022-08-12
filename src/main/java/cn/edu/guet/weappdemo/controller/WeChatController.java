package cn.edu.guet.weappdemo.controller;


import cn.edu.guet.weappdemo.bean.WeChatModel;
import cn.edu.guet.weappdemo.http.HttpResult;
import cn.edu.guet.weappdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

@RestController
@CrossOrigin
@Slf4j
public class WeChatController {

    String appid = "wx08c35624c8d66f8f";

    String secret = "5af656eca6285b99581958e88e91a7a0";
    @Autowired
    UserService userService;


    @GetMapping("/users/wxlogin")
    public String wxLogin(@RequestParam("code") String code) {
        log.info("\n\n>>>>> 微信code ={}\n\n", code);

        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appid + "&secret=" + secret + "&js_code=" + code + "&grant_type=authorization_code";
        url = String.format(url, appid, secret, code);

        StringBuffer resultBuffer = null;
        try {
            URL localURL = new URL(url);
            URLConnection connection = localURL.openConnection();
            HttpURLConnection httpURLConnection = (HttpURLConnection) connection;

            httpURLConnection.setRequestProperty("Accept-Charset", "utf-8");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");

            InputStream inputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader reader = null;
            String tempLine = null;

            resultBuffer = new StringBuffer();
            //响应失败
            if (httpURLConnection.getResponseCode() >= 300) {
                log.error("\n\n>>>>>> 微信授权请求失败, Response code is " + httpURLConnection.getResponseCode());
                System.out.println("出错");
            }
            try {
                inputStream = httpURLConnection.getInputStream();
                inputStreamReader = new InputStreamReader(inputStream);
                reader = new BufferedReader(inputStreamReader);

                while ((tempLine = reader.readLine()) != null) {
                    resultBuffer.append(tempLine);
                }

            } finally {
                if (reader != null) {
                    reader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Exception e) {
            System.out.println("出错");
        }
        log.info("\n\n >>>>>> 微信授权结果：{}", resultBuffer.toString() + "\n");
        return resultBuffer.toString();
    }

    //登录
    @GetMapping("/users")
    public WeChatModel login(WeChatModel weChatModel) {
        log.info("登录用户：{}", weChatModel);
        WeChatModel user = this.userService.findUserByNameAndPassword(weChatModel);
        if (user == null) {
            System.out.println("出错");
        }
        return user;
    }

    //注册
    @PostMapping("/users/register")
    public String register(@RequestBody WeChatModel weChatModel) {
        log.info("注册用户：{}", weChatModel);
        try {
            int i = userService.register(weChatModel);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "注册成功";
    }

    //根据用户的itemcode查询用户的信息
    @GetMapping("/getUserInfo")
    public HttpResult getUserDetail(String openid) {
        return HttpResult.ok(userService.getUserInfo(openid));
    }
}
