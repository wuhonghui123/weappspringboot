package cn.edu.guet.weappdemo.controller;

import cn.edu.guet.weappdemo.bean.Order;
import cn.edu.guet.weappdemo.http.HttpResult;
import cn.edu.guet.weappdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/25/19:01
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;
    @GetMapping("/order/list")//获取用户订单列表
    private HttpResult getOrderList(String user_id){
        return HttpResult.ok(orderService.getOrderList(user_id));
    }

    @PostMapping("/order/delete")//删除用户所选订单
    public HttpResult deleteOrder(String id,String pay_type){
        return HttpResult.ok(orderService.deleteOrder(id, pay_type));
    }

    @PostMapping("/order/update_type")//更新订单状态，确认送达
    public HttpResult updateOrderType(){
        return HttpResult.ok();
    }

    @PostMapping("/order/addorder")//生成订单
    public HttpResult addOrder(Order order){
        return HttpResult.ok(orderService.addOrder(order));
    }
}
