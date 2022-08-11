package cn.edu.guet.weappdemo.service;


import cn.edu.guet.weappdemo.bean.WeChatModel;


public interface UserService {
    WeChatModel findUserByNameAndPassword(WeChatModel weChatModel);



    WeChatModel findUserDetail(String openid);


    int register(WeChatModel weChatModel);
}

