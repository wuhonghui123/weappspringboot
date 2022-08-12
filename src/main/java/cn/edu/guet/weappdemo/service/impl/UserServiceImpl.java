package cn.edu.guet.weappdemo.service.impl;

import cn.edu.guet.weappdemo.bean.WeChatModel;
import cn.edu.guet.weappdemo.mapper.ClassMapper;
import cn.edu.guet.weappdemo.mapper.UserMapper;
import cn.edu.guet.weappdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.util.List;


@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public WeChatModel findUserByNameAndPassword(WeChatModel weChatModel) {
        return userMapper.findUserByNameAndPassword(weChatModel);
    }

    @Override
    public List<WeChatModel> getUserInfo(String openid) {
        return userMapper.getUserInfo(openid);
    }


    @Override
    public int register(WeChatModel weChatModel) {
        return userMapper.insertSelective(weChatModel);
    }
}



