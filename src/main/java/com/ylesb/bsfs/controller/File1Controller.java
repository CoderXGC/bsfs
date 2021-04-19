/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: File1Controller
 * Author:   White
 * Date:     2021/4/19 21:49
 * Description: 图片上传
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ylesb.bsfs.controller;

import com.ylesb.bsfs.Utils.FileUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * 〈图片上传〉
 *
 * @author White
 * @create 2021/4/19
 */
@Controller
@RequestMapping("/user")
public class File1Controller {


    @Resource
    HttpServletRequest request;
    @ResponseBody
    //处理文件上传
    @RequestMapping(value="/testuploadimg", method = RequestMethod.POST)
    public String uploadImg(@RequestParam("file") MultipartFile file) {
        String fileName = file.getOriginalFilename();
        //设置文件上传路径
        String filePath = request.getSession().getServletContext().getRealPath("imgupload/");
        String path = System.getProperty("user.dir")+"faceImg/";
        try {
            FileUtil.uploadFile(file.getBytes(), path, fileName);
            return "上传成功";
        } catch (Exception e) {
            return "上传失败";
        }
    }
}