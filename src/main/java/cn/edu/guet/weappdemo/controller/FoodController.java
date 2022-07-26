package cn.edu.guet.weappdemo.controller;

import cn.edu.guet.weappdemo.http.HttpResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/25/18:59
 */
public class FoodController {
    @GetMapping("/food/list")//获取状态为发布的食物列表
    public HttpResult getFoodList(){
        return HttpResult.ok();
    }

    @GetMapping("/food/classification_list")//获取食物分类列表
    public HttpResult getClassificationList(){
        return HttpResult.ok();
    }

}
