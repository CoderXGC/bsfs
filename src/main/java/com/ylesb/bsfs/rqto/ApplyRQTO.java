/**
 * Copyright (C), 2020-2021, www.ylesb.com
 * FileName: ApplyRQTO
 * Author:   White
 * Date:     2021/4/29 9:35
 * Description: 申请封装请求
 * History:
 */
package com.ylesb.bsfs.rqto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 *
 * 〈申请封装请求〉
 *
 * @author White
 * @create 2021/4/29
 */
@Data
public class ApplyRQTO {
    private String applyid;
    private String message;
    private String starttime;
    private String endtime;
    private String applytime;
    private String status;
    private String id;
    private String type;
    private String time;
}