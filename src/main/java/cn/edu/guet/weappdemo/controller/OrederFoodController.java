package cn.edu.guet.weappdemo.controller;

import cn.edu.guet.weappdemo.bean.OrderFood;
import cn.edu.guet.weappdemo.bean.ShoppingCart;
import cn.edu.guet.weappdemo.http.HttpResult;
import cn.edu.guet.weappdemo.service.OrderFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrederFoodController {
    @Autowired
    private OrderFoodService orderFoodService;
    @PostMapping("orderFood/add")//用户提交订单或退出的时候更新购物车,先删除购物车里用户的数据再添加购物车数据
    public HttpResult AddOrderFoodList(@RequestBody OrderFood orderFood){
        System.out.println(orderFood);
        int Result= orderFoodService.AddOrderFoodList(orderFood);
        return HttpResult.ok(Result);
    }
}
