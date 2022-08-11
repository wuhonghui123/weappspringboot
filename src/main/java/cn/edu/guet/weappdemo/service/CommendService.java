package cn.edu.guet.weappdemo.service;


import cn.edu.guet.weappdemo.bean.Commend;

import java.util.List;

public interface CommendService {
    List<Commend> getCommend();
    List<Commend> getOrderCommend();
    List<Commend> getUserCommend(String openid);
    int updateCommend(Commend commend);
    int deleteCommend(String id);
    int addCommend(Commend commend);
}
