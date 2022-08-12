package cn.edu.guet.weappdemo.mapper;

import cn.edu.guet.weappdemo.bean.WeChatModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    WeChatModel findUserByNameAndPassword(WeChatModel weChatModel);

    List<WeChatModel> getUserInfo(String openid);

    int insertSelective(WeChatModel weChatModel);

}
