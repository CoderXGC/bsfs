/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: UploadUtils
 * Author:   White
 * Date:     2021/4/19 22:00
 * Description: 上传文件
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ylesb.bsfs.utils;

import java.io.File;

/**
 *
 * 〈上传文件〉
 *
 * @author White
 * @create 2021/4/19
 */
public class UploadUtils {
    // 项目根路径下的目录  -- SpringBoot static 目录相当于是根路径下（SpringBoot 默认）
    public final static String IMG_PATH_PREFIX = "static/upload/imgs";

    public static File getImgDirFile(){

        // 构建上传文件的存放 "文件夹" 路径
        String fileDirPath = new String("src/main/resources/" + IMG_PATH_PREFIX);

        File fileDir = new File(fileDirPath);
        if(!fileDir.exists()){
            // 递归生成文件夹
            fileDir.mkdirs();
        }
        return fileDir;
    }

}