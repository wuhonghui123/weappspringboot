package cn.edu.guet.weappdemo.controller;

import cn.edu.guet.weappdemo.http.HttpResult;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/26/0:30
 */
public class AddressController {
    @PostMapping("/address/add")//添加地址信息
    public HttpResult add_Address(){

        return HttpResult.ok();
    }

    @PostMapping("/address/update")//修改地址信息
    public HttpResult update_Address(){
        return HttpResult.ok();
    }

    @PostMapping("/address/delete")//删除地址信息
    public HttpResult delete_Address(){
        return HttpResult.ok();
    }
}
