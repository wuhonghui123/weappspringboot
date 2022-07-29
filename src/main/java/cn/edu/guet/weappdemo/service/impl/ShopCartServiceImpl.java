package cn.edu.guet.weappdemo.service.impl;

import cn.edu.guet.weappdemo.bean.ShoppingCart;
import cn.edu.guet.weappdemo.mapper.ShopCartMapper;
import cn.edu.guet.weappdemo.service.ShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopCartServiceImpl implements ShopCartService {

    @Autowired
    private ShopCartMapper shopCartMapper;

    @Override
    public List<ShoppingCart> getshopcartList(String user_id) {
     List<ShoppingCart>  Result=shopCartMapper.getshopcartList(user_id);
        System.out.println(Result);
        return Result;
    }

    @Override
    public int deleteshopcart(String user_id) {
        int Result=shopCartMapper.deleteshopcart(user_id);
        return Result;
    }

    @Override
    public int addshopcart(ShoppingCart shoppingCart) {
        int Result=shopCartMapper.addshopcart(shoppingCart);
        return Result;
    }
}
