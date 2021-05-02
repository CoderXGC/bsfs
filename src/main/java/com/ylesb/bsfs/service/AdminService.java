/**
 * Copyright (C), 2020-2021, www.ylesb.com
 * FileName: AdminService
 * Author:   White
 * Date:     2021/4/27 18:21
 * Description: 登录service
 * History:
 */
package com.ylesb.bsfs.service;

import com.ylesb.bsfs.bean.ApplyBean;
import com.ylesb.bsfs.bean.SignBean;
import com.ylesb.bsfs.bean.UserBean;
import com.ylesb.bsfs.rpto.ApplyRPTO;
import com.ylesb.bsfs.rpto.FindRPTO;
import com.ylesb.bsfs.rpto.LoginRPTO;
import com.ylesb.bsfs.rqto.*;

import java.util.List;

/**
 *
 * 〈admin登录service接口〉
 *
 * @author White
 * @create 2021/4/27
 */
public interface AdminService {
    LoginRPTO login(LoginRQTO login);
    LoginRPTO adduser(AddUserRQTO addUserRQTO);
    List<ApplyBean> findallapply();
    ApplyRPTO upaudit(ApplyRQTO applyRQTO);
    List<SignBean> findsignall();
    List<SignBean> findsignalltime(SignRQTO signRQTO);
    LoginRPTO updatesigntime(UserBean userBean);
    FindRPTO deluser(FindRQTO findRQTO);
}