package cn.edu.guet.weappdemo.controller;

import cn.edu.guet.weappdemo.http.HttpResult;
import cn.edu.guet.weappdemo.service.ShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/25/19:46
 */
public class ShopCartController {
    @Autowired
    private ShopCartService shopCartService;
    @Autowired
    private HttpResult httpResult;

    @GetMapping("/shopcart/list")//用户登录获取用户的购物车
    public HttpResult getshopcartList(@RequestParam String user_id){
        httpResult=shopCartService.getshopcartList(user_id);
        System.out.println(httpResult);
        return HttpResult.ok(httpResult);
    }

    @GetMapping("/shopcart/update")//用户提交订单或退出的时候更新购物车,先删除购物车里用户的数据再添加购物车数据
    public HttpResult updateshopcart(){
        return HttpResult.ok();
    }

}
