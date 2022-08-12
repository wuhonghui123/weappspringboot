package cn.edu.guet.weappdemo.controller;

import cn.edu.guet.weappdemo.bean.Order;
import cn.edu.guet.weappdemo.http.HttpResult;
import cn.edu.guet.weappdemo.service.OrderService;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    private HttpResult getOrderList(String id,String user_id,String order_type,String pay_type,String create_time){
        return HttpResult.ok(orderService.getOrderList(id,user_id,order_type,pay_type,create_time));
    }

    @PostMapping("/order/delete")//删除用户所选订单
    public HttpResult deleteOrder(String id,String pay_type){
        return HttpResult.ok(orderService.deleteOrder(id, pay_type));
    }

    @GetMapping("/order/update_type")//更新订单状态，确认送达
    public HttpResult updateOrderType(String order_id,String user_id,String order_type){
        System.out.println(orderService.updateOrder(order_id, user_id, order_type)+"######"+order_type+order_id);
        return HttpResult.ok(orderService.getOrderList(null,user_id,null,null,null));
    }

    @PostMapping("/order/addorder")//生成订单
    public HttpResult addOrder(Order order){
        return HttpResult.ok(orderService.addOrder(order));
    }
    @GetMapping("/order/search")
    public HttpResult orderUserList(String order_id,String user_id){
        System.out.println("结果看这"+orderService.orderUserList(order_id,user_id));
        return HttpResult.ok(orderService.orderUserList(order_id,user_id));
    }
}
