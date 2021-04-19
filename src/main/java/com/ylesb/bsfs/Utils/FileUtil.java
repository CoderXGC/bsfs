/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: FileUtil
 * Author:   White
 * Date:     2021/4/19 21:50
 * Description: 文件上传工具类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ylesb.bsfs.Utils;
import java.io.File;
import java.io.FileOutputStream;
/**
 *
 * 〈文件上传工具类〉
 *
 * @author White
 * @create 2021/4/19
 */
public class FileUtil {

    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
    }

}
