package cn.edu.guet.weappdemo.service.impl;

import cn.edu.guet.weappdemo.bean.OrderFood;
import cn.edu.guet.weappdemo.bean.ShoppingCart;
import cn.edu.guet.weappdemo.mapper.OrderFoodMapper;
import cn.edu.guet.weappdemo.mapper.OrderMapper;
import cn.edu.guet.weappdemo.service.OrderFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderFoodServiceImpl implements OrderFoodService {
    @Autowired
    private OrderFoodMapper orderFoodMapper;
    @Override
    public int AddOrderFoodList(OrderFood orderFood) {
       return orderFoodMapper.AddOrderFoodList(orderFood);
    }

    @Override
    public List<OrderFood> getOrderFood(String order_id) {
        return orderFoodMapper.getOrderFood(order_id);
    }
}
