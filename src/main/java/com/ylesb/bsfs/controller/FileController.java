/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: FileController
 * Author:   White
 * Date:     2021/4/19 21:47
 * Description: 上传人脸信息
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ylesb.bsfs.controller;

//import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import com.ylesb.bsfs.Utils.UploadUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.*;
/**
 *
 * 〈上传人脸信息〉
 *
 * @author White
 * @create 2021/4/19
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 文件上传
 */
@Controller
@ResponseBody
@RequestMapping("/upload")
public class FileController {

//    @GetMapping(value = "/file")
//    public String file() {
//        return "file";
//    }
//
//    @PostMapping(value = "/fileUpload")
//    public String fileUpload(@RequestParam(value = "file") MultipartFile file, Model model, HttpServletRequest request) {
//        if (file.isEmpty()) {
//            System.out.println("文件为空空");
//        }
//        String fileName = file.getOriginalFilename();  // 文件名
//        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
//        String filePath = "D://temp-rainy//"; // 上传后的路径
//        fileName = UUID.randomUUID() + suffixName; // 新文件名
//        File dest = new File(filePath + fileName);
//        if (!dest.getParentFile().exists()) {
//            dest.getParentFile().mkdirs();
//        }
//        try {
//            file.transferTo(dest);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String filename = "/temp-rainy/" + fileName;
//        model.addAttribute("filename", filename);
//        return "file";
//    }

public void fileupload(@RequestParam("imgFile")MultipartFile imgFile, HttpServletRequest request, HttpSession session) {



    // 拿到文件名
    String filename = imgFile.getOriginalFilename();

    // 存放上传图片的文件夹
    File fileDir = UploadUtils.getImgDirFile();
    // 输出文件夹绝对路径  -- 这里的绝对路径是相当于当前项目的路径而不是“容器”路径
    System.out.println(fileDir.getAbsolutePath());

    try {
        // 构建真实的文件路径
        File newFile = new File(fileDir.getAbsolutePath() + File.separator + filename);
        System.out.println(newFile.getAbsolutePath());

        // 上传图片到 -》 “绝对路径”
        imgFile.transferTo(newFile);


    } catch (IOException e) {
        e.printStackTrace();
    }

}

}
