package cn.edu.guet.weappdemo.mapper;

import cn.edu.guet.weappdemo.bean.WeChatModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    WeChatModel findUserByNameAndPassword(WeChatModel weChatModel);

    List<WeChatModel> getUserInfo(String openid);
void pay(@Param("userid") String userid, @Param("price") double price);
    int insertSelective(WeChatModel weChatModel);

}
