package cn.edu.guet.weappdemo.controller;

import cn.edu.guet.weappdemo.bean.ShoppingCart;
import cn.edu.guet.weappdemo.http.HttpResult;
import cn.edu.guet.weappdemo.service.ShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/25/19:46
 */

@Controller
public class ShopCartController {
    @Autowired
    private ShopCartService shopCartService;

    @GetMapping("shopcart/list")//用户登录获取用户的购物车
    public HttpResult getshopcartList(@RequestBody ShoppingCart shoppingCart){
        String user_id=shoppingCart.getUser_id();
        System.out.println(user_id);
     HttpResult   httpResult=shopCartService.getshopcartList(user_id);
        System.out.println(httpResult);
        return HttpResult.ok(httpResult);
    }

    @GetMapping("shopcart/update")//用户提交订单或退出的时候更新购物车,先删除购物车里用户的数据再添加购物车数据
    public HttpResult updateshopcart(){
        System.out.println("jjjj");

        return HttpResult.ok();
    }

}
