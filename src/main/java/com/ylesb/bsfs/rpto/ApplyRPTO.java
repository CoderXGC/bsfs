/**
 * Copyright (C), 2020-2021, www.ylesb.com
 * FileName: ApplyRPTO
 * Author:   White
 * Date:     2021/4/29 9:34
 * Description: 申请接收封装
 * History:
 */
package com.ylesb.bsfs.rpto;

import lombok.Data;

/**
 *
 * 〈申请接收封装〉
 *
 * @author White
 * @create 2021/4/29
 */
@Data
public class ApplyRPTO {
    private String applyid;
    private String message;
    private String applytime;
    private String starttime;
    private String endtime;
    private String status;
    private String id;
    private String type;
}