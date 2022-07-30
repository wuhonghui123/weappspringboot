package cn.edu.guet.weappdemo.service.impl;

import cn.edu.guet.weappdemo.bean.Order;
import cn.edu.guet.weappdemo.mapper.OrderMapper;
import cn.edu.guet.weappdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public List<Order> getOrderList(String user_id) {
        return orderMapper.getOrderList(user_id);
    }

    @Override
    public int addOrder(Order order) {
        return orderMapper.addOrder(order);
    }

    @Override
    public int deleteOrder(String id, String pay_type) {
        return orderMapper.deleteOrder(id, pay_type);
    }
}
