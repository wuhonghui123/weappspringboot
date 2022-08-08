package cn.edu.guet.weappdemo.service;

import cn.edu.guet.weappdemo.bean.ShoppingCart;
import cn.edu.guet.weappdemo.http.HttpResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ShopCartService {

    List<ShoppingCart> getshopcartList(String user_id);
    int deleteshopcart(String user_id,String food_id);
   int addshopcart(ShoppingCart shoppingCart);
}
