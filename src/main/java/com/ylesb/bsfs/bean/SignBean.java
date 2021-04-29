/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: SignBean
 * Author:   White
 * Date:     2021/4/23 16:12
 * Description: 登录实体类
 * History:
 */
package com.ylesb.bsfs.bean;
import lombok.Data;

/**
 *
 * 〈签到实体类〉
 *
 * @author White
 * @create 2021/4/23
 */
@Data
public class SignBean {
    private String id;
    private String signid;
    private String latetime;
    private String signintime;
    private String daytime;
    private int did;
    private String machine;
    private String signouttime;
}