/**
 * Copyright (C), 2020-2021, www.ylesb.com
 * FileName: SignService
 * Author:   White
 * Date:     2021/4/23 16:29
 * Description: 签到service
 * History:
 */
package com.ylesb.bsfs.service;

import com.ylesb.bsfs.bean.FaceImgUrlBean;
import com.ylesb.bsfs.rpto.SignRPTO;
import com.ylesb.bsfs.rqto.SignRQTO;

import java.util.List;

/**
 *
 * 〈签到service接口〉
 *
 * @author White
 * @create 2021/4/23
 */
public interface SignService
{
    SignRPTO sign(SignRQTO signRQTO);
    SignRPTO findsign(SignRQTO signRQTO);
}