/**
 * Copyright (C), 2020-2021, www.ylesb.com
 * FileName: NoticeBean
 * Author:   White
 * Date:     2021/4/30 22:38
 * Description: 公告实体类
 * History:
 */
package com.ylesb.bsfs.bean;

import lombok.Data;

/**
 *
 * 〈公告实体类〉
 *
 * @author White
 * @create 2021/4/30
 */
@Data
public class NoticeBean {
    private String id;
    private String message;
    private String time;
    private int did;
    private String issuid;
}