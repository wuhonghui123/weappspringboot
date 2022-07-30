package cn.edu.guet.weappdemo.service;

import cn.edu.guet.weappdemo.bean.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrderList(String user_id);
    int addOrder(Order order);
    int deleteOrder(String id,String pay_type);
}
