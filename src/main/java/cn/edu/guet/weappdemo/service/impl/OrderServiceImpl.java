package cn.edu.guet.weappdemo.service.impl;

import cn.edu.guet.weappdemo.bean.Order;
import cn.edu.guet.weappdemo.bean.OrderUser;
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
    public List<Order> getOrderList(String id,String user_id,String order_type,String pay_type,String create_time) {
        return orderMapper.getOrderList(id,user_id,order_type,pay_type,create_time);
    }
    @Override
    public int addOrder(Order order) {
        return orderMapper.addOrder(order);
    }

    @Override
    public int deleteOrder(String id, String pay_type) {
        return orderMapper.deleteOrder(id, pay_type);
    }

    @Override
    public List<OrderUser> orderUserList(String order_id, String user_id) {
        return orderMapper.orderUserList(order_id, user_id);
    }

    @Override
    public int updateOrder(String order_id, String user_id, String order_type) {
        return orderMapper.updateOrder(order_id, user_id, order_type);
    }
}
