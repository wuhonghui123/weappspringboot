package cn.edu.guet.weappdemo.mapper;

import cn.edu.guet.weappdemo.bean.Food;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/26/20:16
 */
@Mapper
public interface FoodMapper {
    List<Food> getFoodList();
//    int addFood(Food food);
//    int deleFood(String id);
//    int updteFood(Food food);
}
