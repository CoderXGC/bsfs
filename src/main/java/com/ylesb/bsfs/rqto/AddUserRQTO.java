/**
 * Copyright (C), 2020-2021, www.ylesb.com
 * FileName: AddUser
 * Author:   White
 * Date:     2021/5/2 9:23
 * Description: 添加用户数据封装
 * History:
 */
package com.ylesb.bsfs.rqto;

import lombok.Data;

/**
 *
 * 〈添加用户数据封装〉
 *
 * @author White
 * @create 2021/5/2
 */
@Data
public class AddUserRQTO {
    private String id;
    private String name;
    private String faceimg;
    private String pwd;
    private int did;
    private String signintime;
    private String signouttime;
    private String telnum;
    private String email;
}