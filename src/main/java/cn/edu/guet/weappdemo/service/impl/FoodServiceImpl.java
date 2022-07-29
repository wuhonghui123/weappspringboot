package cn.edu.guet.weappdemo.service.impl;

import cn.edu.guet.weappdemo.bean.Food;
import cn.edu.guet.weappdemo.mapper.FoodMapper;
import cn.edu.guet.weappdemo.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/27/23:53
 */
@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodMapper foodMapper;
    @Override
    public List<Food> getFoodList() {
        return foodMapper.getFoodList();
    }
}
