package cn.edu.guet.weappdemo.mapper;

import cn.edu.guet.weappdemo.bean.WeChatModel;

public interface UserMapper {

    WeChatModel findUserByNameAndPassword(WeChatModel weChatModel);

    WeChatModel findUserDetail(String openid);

}
