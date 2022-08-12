package cn.edu.guet.weappdemo.service;


import cn.edu.guet.weappdemo.bean.WeChatModel;

import java.util.List;


public interface UserService {
    WeChatModel findUserByNameAndPassword(WeChatModel weChatModel);



    List<WeChatModel> getUserInfo(String openid);


    int register(WeChatModel weChatModel);
}

