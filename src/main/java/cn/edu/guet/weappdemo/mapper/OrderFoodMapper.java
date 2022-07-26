package cn.edu.guet.weappdemo.mapper;

import cn.edu.guet.weappdemo.bean.OrderFood;
import cn.edu.guet.weappdemo.bean.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/26/20:18
 */
@Mapper
public interface OrderFoodMapper {
   int AddOrderFoodList(OrderFood orderFood);
   List<OrderFood> getOrderFood(@Param("order_id") String order_id);
}
