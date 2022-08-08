package cn.edu.guet.weappdemo.mapper;

import cn.edu.guet.weappdemo.bean.ShoppingCart;
import cn.edu.guet.weappdemo.http.HttpResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/26/20:19
 */
@Mapper
public interface ShopCartMapper {
    List<ShoppingCart> getshopcartList(String user_id);
    int deleteshopcart(String user_id,String food_id);
    int addshopcart(ShoppingCart shoppingCart);

}
