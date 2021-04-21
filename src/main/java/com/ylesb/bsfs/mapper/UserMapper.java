package com.ylesb.bsfs.mapper;

import com.ylesb.bsfs.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserMapper {
    UserBean login(@Param("id") String id, @Param("pwd")String pwd);
    UserBean find(@Param("id") String id);
    void addfaceimg(@Param("id") String id, @Param("faceimg")String faceimg);
}
