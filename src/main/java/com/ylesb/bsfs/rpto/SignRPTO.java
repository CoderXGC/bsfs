/**
 * Copyright (C), 2020-2021, www.ylesb.com
 * FileName: SignRPTO
 * Author:   White
 * Date:     2021/4/23 16:25
 * Description: 签到返回数据封装
 * History:
 */
package com.ylesb.bsfs.rpto;

import lombok.Data;

/**
 *
 * 〈签到返回数据封装〉
 *
 * @author White
 * @create 2021/4/23
 */
@Data
public class SignRPTO {
    private String user_id;
    private String name;
    private String signintime;
    private String signouttime;
    private String signid;
}