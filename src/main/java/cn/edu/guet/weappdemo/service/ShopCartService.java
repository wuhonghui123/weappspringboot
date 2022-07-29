package cn.edu.guet.weappdemo.service;

import cn.edu.guet.weappdemo.http.HttpResult;
import org.springframework.web.bind.annotation.GetMapping;

public interface ShopCartService {

    HttpResult getshopcartList(String user_id);


    HttpResult updateshopcart();
}
