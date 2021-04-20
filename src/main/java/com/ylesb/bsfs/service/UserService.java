package com.ylesb.bsfs.service;

import com.ylesb.bsfs.bean.UserBean;
import com.ylesb.bsfs.rpto.FindRPTO;
import com.ylesb.bsfs.rpto.LoginRPTO;
import com.ylesb.bsfs.rqto.FindRQTO;
import com.ylesb.bsfs.rqto.LoginRQTO;

public interface UserService {

    LoginRPTO login(LoginRQTO login);
    FindRPTO find(FindRQTO find);
}
