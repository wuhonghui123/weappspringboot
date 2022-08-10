package cn.edu.guet.weappdemo.service.impl;

import cn.edu.guet.weappdemo.bean.WeChatModel;
import cn.edu.guet.weappdemo.mapper.ClassMapper;
import cn.edu.guet.weappdemo.mapper.UserMapper;
import cn.edu.guet.weappdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;


@Service("userService")
public class UserServiceImpl implements UserService {

    UserMapper userMapper;
    @Override
    public WeChatModel findUserByNameAndPassword(WeChatModel weChatModel) {
        return userMapper.findUserByNameAndPassword(weChatModel);
    }


    @Override
    public WeChatModel findUserDetail(String openid) {
        return userMapper.findUserDetail(openid);
    }
}



