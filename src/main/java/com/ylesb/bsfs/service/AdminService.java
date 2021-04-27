/**
 * Copyright (C), 2020-2021, www.ylesb.com
 * FileName: AdminService
 * Author:   White
 * Date:     2021/4/27 18:21
 * Description: 登录service
 * History:
 */
package com.ylesb.bsfs.service;

import com.ylesb.bsfs.rpto.LoginRPTO;
import com.ylesb.bsfs.rqto.LoginRQTO;

/**
 *
 * 〈admin登录service接口〉
 *
 * @author White
 * @create 2021/4/27
 */
public interface AdminService {
    LoginRPTO login(LoginRQTO login);
}