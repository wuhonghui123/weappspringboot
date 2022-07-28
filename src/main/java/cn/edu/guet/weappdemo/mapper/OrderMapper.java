package cn.edu.guet.weappdemo.mapper;

import cn.edu.guet.weappdemo.bean.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/26/20:19
 */
@Mapper
public interface OrderMapper {
    List<Order> getOrderList(String user_id);
    int addOrder(Order order);
    int deleteOrder(String id,String pay_type);
}