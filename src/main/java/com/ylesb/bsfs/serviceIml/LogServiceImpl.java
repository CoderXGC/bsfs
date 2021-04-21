/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: LogServiceImpl
 * Author:   White
 * Date:     2021/4/20 18:45
 * Description:
 * History:
 */
package com.ylesb.bsfs.serviceIml;

import com.ylesb.bsfs.bean.LogBean;
import com.ylesb.bsfs.bean.UserBean;
import com.ylesb.bsfs.mapper.LogMapper;
import com.ylesb.bsfs.mapper.UserMapper;
import com.ylesb.bsfs.rpto.LogRPTO;
import com.ylesb.bsfs.rpto.LoginRPTO;
import com.ylesb.bsfs.rqto.LogRQTO;
import com.ylesb.bsfs.service.LogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * 〈日志〉
 *
 * @author White
 * @create 2021/4/20
 */
@Slf4j
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogMapper logMapper;
    @Override
    public LogRPTO add(LogRQTO add) {
//        LogBean log = logMapper.add(add.getId(),add.getMessage());
        logMapper.add(add.getId(),add.getMessage());
        String log="";
        if(log == null){
            return null;
        }
        LogRPTO rpto = new LogRPTO();
        rpto.setId(log.toString());
        rpto.setMessage(log.toString());
        return rpto;
    }
}