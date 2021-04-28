/**
 * Copyright (C), 2020-2021, www.ylesb.com
 * FileName: ApplyBean
 * Author:   White
 * Date:     2021/4/28 21:27
 * Description: 申请实体类
 * History:
 */
package com.ylesb.bsfs.bean;

import lombok.Data;

/**
 *
 * 〈申请实体类〉
 *
 * @author White
 * @create 2021/4/28
 */
@Data
public class ApplyBean {
 private String applyid;
    private String message;
    private String approve;
    private String starttime;
    private String endtime;
    private String status;
    private String id;
}