package cn.edu.guet.weappdemo.controller;

import cn.edu.guet.weappdemo.bean.Address;
import cn.edu.guet.weappdemo.http.HttpResult;
import cn.edu.guet.weappdemo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/26/0:30
 */
@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;
    @PostMapping("/address/get")//获取地址信息
    public HttpResult get_Address(){

        return HttpResult.ok(addressService.getAddress());
    }

    @PostMapping("/address/update")//修改地址信息
    public HttpResult update_Address(@RequestBody Address address){

        return HttpResult.ok(addressService.updateAddress(address));
    }

    @PostMapping("/address/delete")//删除地址信息
    public HttpResult delete_Address(@RequestBody Address address){
        return HttpResult.ok(addressService.deleteAddress(address.getId()));
    }
    @PostMapping("/address/add")//增加地址信息
    public HttpResult addAddress(@RequestBody Address address){

        return HttpResult.ok(addressService.addAddress(address));
    }
}
