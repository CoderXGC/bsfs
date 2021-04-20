/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: LogRQTO
 * Author:   White
 * Date:     2021/4/20 18:29
 * Description: 日志
 * History:
 */
package com.ylesb.bsfs.rqto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 *
 * 〈日志〉
 *
 * @author White
 * @create 2021/4/20
 */
@Data
public class LogRQTO {
    @NotEmpty(message = "id")
    @Length(max = 12,message = "昵称最大长度12")
    private String id;

    @NotEmpty(message = "密码不能为空")
    @Length(max = 100,message = "密码最大长度20")
    private String message;
}