package cn.edu.guet.weappdemo.controller;

import cn.edu.guet.weappdemo.http.HttpResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/25/19:01
 */
@RestController
public class ComboController {
    @GetMapping("/combo/list")//获取套餐列表
    public HttpResult getComboList(){
        return HttpResult.ok();
    }

    @GetMapping("/combo/get_combo")
    public HttpResult getCombo(){
        return HttpResult.ok();
    }

    @GetMapping("/combo/combo_Food_list")//获取套餐包含食物的列表
    public HttpResult getComboFoodList(){
        return HttpResult.ok();
    }

}
