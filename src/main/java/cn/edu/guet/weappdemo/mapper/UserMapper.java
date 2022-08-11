package cn.edu.guet.weappdemo.mapper;

import cn.edu.guet.weappdemo.bean.WeChatModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    WeChatModel findUserByNameAndPassword(WeChatModel weChatModel);

    WeChatModel findUserDetail(String openid);

    int insertSelective(WeChatModel weChatModel);

}
