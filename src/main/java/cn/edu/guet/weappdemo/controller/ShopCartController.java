package cn.edu.guet.weappdemo.controller;

import cn.edu.guet.weappdemo.bean.ShoppingCart;
import cn.edu.guet.weappdemo.http.HttpResult;
import cn.edu.guet.weappdemo.service.ShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/25/19:46
 */

@RestController
public class ShopCartController {
    @Autowired
    private ShopCartService shopCartService;

    @GetMapping("shopcart/list")//用户登录获取用户的购物车
//    public HttpResult getshopcartList(@RequestBody ShoppingCart shoppingCart){
    public HttpResult getshopcartList(String user_id){
//        String user_id=shoppingCart.getUser_id();
        System.out.println(user_id);
     List<ShoppingCart> Result=shopCartService.getshopcartList(user_id);
        System.out.println("控制器"+Result);
        return HttpResult.ok(Result);
    }

    @GetMapping("shopcart/add")//用户提交订单或退出的时候更新购物车,先删除购物车里用户的数据再添加购物车数据
    public HttpResult addshopcart(@RequestBody List<ShoppingCart> shoppingCartList){
        System.out.println(shoppingCartList);
        for (int i=0;i<shoppingCartList.size();i++){
           ShoppingCart shoppingCart= shoppingCartList.get(i);
           shopCartService.addshopcart(shoppingCart);
        }
        return HttpResult.ok(shoppingCartList.size());
    }

    @GetMapping("shopcart/delete")//用户提交订单或退出的时候更新购物车,先删除购物车里用户的数据再添加购物车数据
    public HttpResult deleteshopcart(@RequestBody ShoppingCart shoppingCart){
        String user_id=shoppingCart.getUser_id();
       int Result= shopCartService.deleteshopcart(user_id);
        return HttpResult.ok(Result);
    }
}
