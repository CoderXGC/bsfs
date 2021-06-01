/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: UserBean
 * Author:   White
 * Date:     2021/4/16 15:13
 * Description: 用户Bean
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ylesb.bsfs.bean;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 *
 * 〈用户Bean〉
 *
 * @author White
 * @create 2021/4/16
 */
@Data
@ApiModel(" 用户模型")
public class UserBean  {

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