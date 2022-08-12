package cn.edu.guet.weappdemo.service.impl;

import cn.edu.guet.weappdemo.bean.Commend;
import cn.edu.guet.weappdemo.mapper.CommendMapper;
import cn.edu.guet.weappdemo.service.CommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class CommendServicelmpl implements CommendService {
    @Autowired
    private CommendMapper commendMapper;
    @Override
    public List<Commend> getCommend() {
        return commendMapper.getCommend();
    }

    @Override
    public List<Commend> getOrderCommend() {
        return commendMapper.getOrderCommend();
    }

    @Override
    public List<Commend> getUserCommend(String openid) {
        return commendMapper.getUserCommend(openid);
    }

    @Override
    public int addCommend(Commend commend) {
        Date date = new Date();//获取当前系统时间
        Timestamp create_time = new Timestamp(date.getTime());
        commend.setComments_time(create_time);
        return commendMapper.addCommend(commend);
    }

    @Override
    public int deleteCommend(String id) {
        return commendMapper.deleteCommend(id);
    }

    @Override
    public int updateCommend(Commend commend) {
        return commendMapper.updateCommend(commend);
    }
}
