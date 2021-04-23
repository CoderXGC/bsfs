/**
 * Copyright (C), 2020-2021, www.ylesb.com
 * FileName: SignRQTO
 * Author:   White
 * Date:     2021/4/23 16:25
 * Description: 签到登录请求数据封装
 * History:
 */
package com.ylesb.bsfs.rqto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 *
 * 〈签到登录请求数据封装〉
 *
 * @author White
 * @create 2021/4/23
 */
@Data
public class SignRQTO {
    @NotEmpty(message = "id")
    @Length(max = 12,message = "昵称最大长度12")
    private String id;
    @NotEmpty(message = "signid")
    @Length(max = 100,message = "签到最大数据100")

    private String signid;

    private String flag;

    private String signintime;

    private String daytime;

    private int did;

    private String machine;
    private String signouttime;
}