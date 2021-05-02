package com.ylesb.bsfs.mapper;

import com.ylesb.bsfs.bean.ApplyBean;
import com.ylesb.bsfs.bean.FaceImgUrlBean;
import com.ylesb.bsfs.bean.SignBean;
import com.ylesb.bsfs.bean.UserBean;
import com.ylesb.bsfs.rqto.FindRQTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    UserBean login(@Param("id") String id, @Param("pwd")String pwd);
    UserBean find(@Param("id") String id);
    List<UserBean> findall();
    void addfaceimg(@Param("id") String id, @Param("faceimg")String faceimg);
    List<FaceImgUrlBean> findfaceimg();
    void updatepwd(@Param("id") String id,@Param("pwd")String pwd);
    void addapply(@Param("applyid") String applyid,@Param("message") String message,@Param("starttime") String starttime,@Param("endtime") String endtime,@Param("id") String id,@Param("type") String type,@Param("applytime") String applytime,@Param("time") String time);
    ApplyBean findapply(@Param("id") String id);
    List<ApplyBean> finduserallapply(@Param("id") String id);
    void delapply(@Param("applyid") String applyid);
    List<SignBean> findsignall(@Param("id") String id);
    void updateuser(@Param("id") String id, @Param("telnum")String telnum, @Param("email")String email);
}
