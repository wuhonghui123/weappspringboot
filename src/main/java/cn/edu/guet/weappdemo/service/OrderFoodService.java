package cn.edu.guet.weappdemo.service;

import cn.edu.guet.weappdemo.bean.OrderFood;
import cn.edu.guet.weappdemo.bean.ShoppingCart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderFoodService {
    int AddOrderFoodList(OrderFood orderFood);
    List<OrderFood> getOrderFood(String order_id);
}
