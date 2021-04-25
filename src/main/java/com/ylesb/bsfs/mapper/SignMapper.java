/**
 * Copyright (C), 2020-2021, www.ylesb.com
 * FileName: SignMapper
 * Author:   White
 * Date:     2021/4/23 16:22
 * Description: 签到mapper
 * History:
 */
package com.ylesb.bsfs.mapper;

import com.ylesb.bsfs.bean.SignBean;
import com.ylesb.bsfs.rqto.SignRQTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 *
 * 〈签到mapper〉
 *
 * @author White
 * @create 2021/4/23
 */
@Mapper
public interface SignMapper {
    void signin(@Param("id") String id, @Param("signid") String signid,@Param("flag") String flag, @Param("signintime") String signintime, @Param("daytime") String daytime, @Param("did") int did, @Param("machine") String machine,@Param("signouttime") String signouttime);
    SignBean findsign(@Param("id")String id,@Param("signid") String signid);
    void signout(@Param("id") String id, @Param("signid") String signid, @Param("daytime") String daytime, @Param("machine") String machine,@Param("signouttime") String signouttime);

}