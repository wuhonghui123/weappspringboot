package cn.edu.guet.weappdemo.mapper;

import cn.edu.guet.weappdemo.http.HttpResult;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/26/20:19
 */
@Mapper
public interface ShopCartMapper {
    HttpResult getshopcartList(String user_id);

    HttpResult updateshopcart();

}
