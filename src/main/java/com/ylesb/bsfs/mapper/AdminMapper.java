/**
 * Copyright (C), 2020-2021, www.ylesb.com
 * FileName: AdminMapper
 * Author:   White
 * Date:     2021/4/27 18:18
 * Description: 管理员mapper
 * History:
 */
package com.ylesb.bsfs.mapper;

import com.ylesb.bsfs.bean.AdminBean;
import com.ylesb.bsfs.bean.ApplyBean;
import com.ylesb.bsfs.bean.SignBean;
import com.ylesb.bsfs.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * 〈管理员mapper〉
 *
 * @author White
 * @create 2021/4/27
 */
@Mapper
public interface AdminMapper {
    AdminBean login(@Param("id") String id, @Param("pwd")String pwd);
    void adduser(@Param("id") String id,@Param("name") String name,@Param("did") int did);
  //  void adduser(@Param("id") String id,@Param("name") String name,@Param("pwd") String pwd,@Param("did") int did,@Param("signintime") String signintime,@Param("signouttime") String signouttime,@Param("telnum") String telnum,@Param("email") String email);
    List<ApplyBean> findallapply();
    void upaudit(@Param("applyid") String applyid,@Param("status")String status);
    List<SignBean> findsignall();
    List<SignBean> findsignalltime(@Param("daytime") String daytime);
    void updatesigntime(@Param("signintime") String signintime,@Param("signouttime")String signouttime);
    void deluser(@Param("id") String id);

}