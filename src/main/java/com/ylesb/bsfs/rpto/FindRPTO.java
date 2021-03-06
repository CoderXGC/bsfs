/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: FindRPTO
 * Author:   White
 * Date:     2021/4/20 18:04
 * Description: 查找返回faceimg
 * History:
 */
package com.ylesb.bsfs.rpto;

import lombok.Data;

import java.util.List;

/**
 *
 * 〈查找返回faceimg〉
 *
 * @author White
 * @create 2021/4/20
 */
@Data
public class FindRPTO {
    private String id;
    private String name;
    private String faceimg;
    private String pwd;
    private int did;
    private String signintime;
    private String signouttime;
    private String telnum;
    private String email;
    private String role;
}