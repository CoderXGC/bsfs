/**
 * Copyright (C), 2020-2021, www.ylesb.com
 * FileName: AdminBean
 * Author:   White
 * Date:     2021/4/27 18:14
 * Description: 管理员实体类
 * History:
 */
package com.ylesb.bsfs.bean;

import lombok.Data;

/**
 *
 * 〈管理员实体类〉
 *
 * @author White
 * @create 2021/4/27
 */
@Data
public class AdminBean
{
  private String id;
  private String pwd;
  private String name;
  private String signintime;
  private String signouttime;
  private int did;

}