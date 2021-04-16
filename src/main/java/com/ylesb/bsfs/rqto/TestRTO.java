/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: TestRTO
 * Author:   White
 * Date:     2021/4/16 17:13
 * Description: 测试api封装
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ylesb.bsfs.rqto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 *
 * 〈测试api封装〉
 *
 * @author White
 * @create 2021/4/16
 */

@Data
public class TestRTO {
    @NotEmpty(message = "姓名不能为空")
    private String name;

    @NotEmpty(message = "性别不能为空")
    private String sex;
}