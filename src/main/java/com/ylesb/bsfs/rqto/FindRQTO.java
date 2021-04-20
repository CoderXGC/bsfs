/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: FindRQTO
 * Author:   White
 * Date:     2021/4/20 18:05
 * Description: 查找请求数据封装
 * History:
 */
package com.ylesb.bsfs.rqto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 *
 * 〈查找请求数据封装〉
 *
 * @author White
 * @create 2021/4/20
 */
@Data
public class FindRQTO {
    @NotEmpty(message = "id")
    @Length(max = 12,message = "昵称最大长度12")
    private String id;
}