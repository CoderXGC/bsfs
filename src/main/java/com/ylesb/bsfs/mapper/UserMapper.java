package com.ylesb.bsfs.mapper;

import com.ylesb.bsfs.bean.ApplyBean;
import com.ylesb.bsfs.bean.FaceImgUrlBean;
import com.ylesb.bsfs.bean.UserBean;
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
    void addapply(@Param("appylyid") String appylyid,@Param("message") String message,@Param("starttime") String starttime,@Param("endtime") String endtime);

}
