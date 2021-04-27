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
import com.ylesb.bsfs.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
}