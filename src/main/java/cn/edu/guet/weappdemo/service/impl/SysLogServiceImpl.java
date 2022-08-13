package cn.edu.guet.weappdemo.service.impl;

import cn.edu.guet.weappdemo.service.SysLogService;
import cn.edu.guet.weappdemo.bean.SysLog;
import org.springframework.stereotype.Service;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/13/14:29
 */
@Service
public class SysLogServiceImpl implements SysLogService {
    @Override
    public void save(SysLog sysLog) {
        System.out.println(sysLog);
    }
}
