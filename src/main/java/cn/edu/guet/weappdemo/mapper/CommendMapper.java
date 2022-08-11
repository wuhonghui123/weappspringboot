package cn.edu.guet.weappdemo.mapper;

import cn.edu.guet.weappdemo.bean.Commend;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/26/20:18
 */
@Mapper
public interface CommendMapper {
    List<Commend> getCommend();
    List<Commend> getOrderCommend();
    List<Commend> getUserCommend(String openid);
    int updateCommend(Commend commend);
    int deleteCommend(String id);
    int addCommend(Commend commend);
}
