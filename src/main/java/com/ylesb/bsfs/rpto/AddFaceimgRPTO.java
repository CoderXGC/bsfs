/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: AddFaceimgRPTO
 * Author:   White
 * Date:     2021/4/21 21:54
 * Description: 添加人脸图片数据请求数据包装
 * History:
 */
package com.ylesb.bsfs.rpto;

import lombok.Data;

/**
 *
 * 〈添加人脸图片数据请求返回数据包装〉
 *
 * @author White
 * @create 2021/4/21
 */
@Data
public class AddFaceimgRPTO {
    private String id;
    private String faceimg;
}