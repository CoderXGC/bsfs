/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: AddFaceimgRQTO
 * Author:   White
 * Date:     2021/4/21 21:55
 * Description: 添加人脸图片请求信息包装
 * History:
 */
package com.ylesb.bsfs.rqto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 *
 * 〈添加人脸图片请求信息包装〉
 *
 * @author White
 * @create 2021/4/21
 */
@Data
public class AddFaceimgRQTO {

    @NotEmpty(message = "id")
    @Length(max = 12,message = "昵称最大长度12")
    private String id;
    @NotEmpty(message = "上传图像不能为空")
    @Length(max = 100,message = "密码最大长度20")
    private String faceimg;
}