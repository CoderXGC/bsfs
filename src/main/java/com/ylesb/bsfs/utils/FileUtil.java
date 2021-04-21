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
package com.ylesb.bsfs.utils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

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
    /**
     * InputStream 转 File
     *
     * @param ins
     * @param file
     */
    public static void inputStreamToFile(InputStream ins, File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            ins.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getFileName(MultipartFile file) {
        String fileName = file.getOriginalFilename();
        //检查unix样式的路径
        int unixSep = fileName.lastIndexOf('/');
        //检查windows样式的路径
        int winSep = fileName.lastIndexOf('\\');
        //在最可能的点被切断
        int pos = (winSep > unixSep ? winSep : unixSep);
        if (pos != -1)  {
            //找到的任何路径分隔符。
            fileName = fileName.substring(pos + 1);
        }
        return fileName;
    }

}
