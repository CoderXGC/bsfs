/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: LoginRQTO
 * Author:   White
 * Date:     2021/4/16 19:15
 * Description: 登录RPTO
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ylesb.bsfs.rpto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 *
 * 〈rpto即response transfer object，是API接口返回数据的包装〉
 *
 * @author White
 * @create 2021/4/16
 */
@Data
public class LoginRPTO {
    private String user_id;
    private String name;
}
