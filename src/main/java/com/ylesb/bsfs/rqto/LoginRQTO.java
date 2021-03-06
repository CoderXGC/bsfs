/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: LoginRQTO
 * Author:   White
 * Date:     2021/4/16 19:21
 * Description: 登录输出
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ylesb.bsfs.rqto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 *
 * 〈rqto即request transfer object，是API接口请求数据的包装〉
 *
 * @author White
 * @create 2021/4/16
 */
@Data
public class LoginRQTO {


    private String id;

    private String password;


}
