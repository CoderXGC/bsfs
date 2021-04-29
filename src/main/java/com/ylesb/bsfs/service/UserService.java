package com.ylesb.bsfs.service;

import com.ylesb.bsfs.bean.ApplyBean;
import com.ylesb.bsfs.bean.FaceImgUrlBean;
import com.ylesb.bsfs.bean.UserBean;
import com.ylesb.bsfs.rpto.AddFaceimgRPTO;
import com.ylesb.bsfs.rpto.ApplyRPTO;
import com.ylesb.bsfs.rpto.FindRPTO;
import com.ylesb.bsfs.rpto.LoginRPTO;
import com.ylesb.bsfs.rqto.AddFaceimgRQTO;
import com.ylesb.bsfs.rqto.ApplyRQTO;
import com.ylesb.bsfs.rqto.FindRQTO;
import com.ylesb.bsfs.rqto.LoginRQTO;

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
    List<ApplyBean> findallapply();
    List<ApplyBean> finduserallapply(ApplyRQTO applyRQTO);
}
