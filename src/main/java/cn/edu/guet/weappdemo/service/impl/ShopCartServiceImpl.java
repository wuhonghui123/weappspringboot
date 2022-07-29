package cn.edu.guet.weappdemo.service.impl;

import cn.edu.guet.weappdemo.bean.ShoppingCart;
import cn.edu.guet.weappdemo.http.HttpResult;
import cn.edu.guet.weappdemo.mapper.ShopCartMapper;
import cn.edu.guet.weappdemo.service.ShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopCartServiceImpl implements ShopCartService {

    @Autowired
    private ShopCartMapper shopCartMapper;

    @Override
    public HttpResult getshopcartList(String user_id) {
     HttpResult   httpResult=shopCartMapper.getshopcartList(user_id);
        return httpResult;
    }

    @Override
    public HttpResult updateshopcart() {
        return null;
    }
}
