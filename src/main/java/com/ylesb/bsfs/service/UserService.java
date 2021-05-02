package com.ylesb.bsfs.service;

import com.ylesb.bsfs.bean.ApplyBean;
import com.ylesb.bsfs.bean.FaceImgUrlBean;
import com.ylesb.bsfs.bean.SignBean;
import com.ylesb.bsfs.bean.UserBean;
import com.ylesb.bsfs.rpto.AddFaceimgRPTO;
import com.ylesb.bsfs.rpto.ApplyRPTO;
import com.ylesb.bsfs.rpto.FindRPTO;
import com.ylesb.bsfs.rpto.LoginRPTO;
import com.ylesb.bsfs.rqto.*;

import java.util.List;

public interface UserService {

    LoginRPTO login(LoginRQTO login);
    FindRPTO find(FindRQTO find);
    List<UserBean> findall();
    AddFaceimgRPTO addfaceimg(AddFaceimgRQTO login);
    List<FaceImgUrlBean> findfaceimg();
    LoginRPTO updatepwd(LoginRQTO login);
    ApplyRPTO addapply(ApplyRQTO applyRQTO);
    ApplyRPTO findapply(ApplyRQTO applyRQTO);
    List<ApplyBean> finduserallapply(ApplyRQTO applyRQTO);
    ApplyRPTO delapply(ApplyRQTO applyRQTO);
    List<SignBean> findsignall(FindRQTO findRQTO);
    FindRPTO updateuser(UserBean userBean);
}
