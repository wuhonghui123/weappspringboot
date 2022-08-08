package cn.edu.guet.weappdemo.controller;


import cn.edu.guet.weappdemo.http.HttpResult;
import cn.edu.guet.weappdemo.service.ClassService;
import cn.edu.guet.weappdemo.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/25/18:59
 */
@RestController
public class FoodController {
    @Autowired
    private FoodService foodService;
    @Autowired
    private ClassService classService;
    @GetMapping("/food/list")//获取食物列表
    public HttpResult getFoodList(){
        return HttpResult.ok(foodService.getFoodList());
    }
    @GetMapping("/food/classification_list")//获取食物分类列表
    public HttpResult getClassificationList(){
        return HttpResult.ok(classService.getClassList());
    }


}
