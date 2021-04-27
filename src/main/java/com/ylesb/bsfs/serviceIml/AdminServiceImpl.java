/**
 * Copyright (C), 2020-2021, www.ylesb.com
 * FileName: AdminServiceImpl
 * Author:   White
 * Date:     2021/4/27 18:22
 * Description: admin
 * History:
 */
package com.ylesb.bsfs.serviceIml;

import com.ylesb.bsfs.bean.AdminBean;
import com.ylesb.bsfs.bean.UserBean;
import com.ylesb.bsfs.mapper.AdminMapper;
import com.ylesb.bsfs.rpto.LoginRPTO;
import com.ylesb.bsfs.rqto.LoginRQTO;
import com.ylesb.bsfs.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * 〈admin〉
 *
 * @author White
 * @create 2021/4/27
 */
@Slf4j
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public LoginRPTO login(LoginRQTO login) {
        AdminBean admin = adminMapper.login(login.getId(),login.getPassword());
        if(admin == null){
            return null;
        }
        LoginRPTO rpto = new LoginRPTO();
        rpto.setUser_id(admin.getId());
        rpto.setName(admin.getName());
        return rpto;
    }
}