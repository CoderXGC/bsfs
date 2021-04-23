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

import com.ylesb.bsfs.utils.FileUtil;
import com.ylesb.bsfs.core.ActionCode;
import com.ylesb.bsfs.core.Url;
import com.ylesb.bsfs.rpto.FileRPTO;
import com.ylesb.bsfs.rpto.RPTO;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.*;

import static com.ylesb.bsfs.utils.FileUtil.inputStreamToFile;

/**
 *
 * 〈图片上传〉
 *
 * @author White
 * @create 2021/4/19
 */
@Controller
@RequestMapping("/user")
public class FileController {


    @Resource
    HttpServletRequest request;
    @ResponseBody
    //处理文件上传
    @RequestMapping(value="/uploadimg", method = RequestMethod.POST)
    public RPTO uploadImg(@RequestParam("file") MultipartFile file,@RequestParam("id") String id ) throws FileNotFoundException {
        FileRPTO fileRPTO=new FileRPTO();
        Url url=new Url();
        //String fileName = file.getOriginalFilename();//可能出现问题。
        String fileName=FileUtil.getFileName(file); ;
        //设置文件上传路径
        String path = ClassUtils.getDefaultClassLoader().getResource("static").getPath()+"/faceImg/";
      //  String path = System.getProperty("user.dir")+"/faceImg/";
     //   String imgUrl = ResourceUtils.getURL("classpath:").getPath() + "static/imgGallery/" + newName;
        File toFile = null;
        try {
            if (file.equals("") || file.getSize() <= 0) {
                file = null;
            } else {
                InputStream ins = null;
                ins = file.getInputStream();
                toFile = new File(path+id+fileName);
                fileRPTO.setUrl(url.getHomeurl()+"/faceImg/"+id+fileName);
                inputStreamToFile(ins, toFile);
                ins.close();
            }
            return new RPTO<>(ActionCode.SUCCESS,fileRPTO);
        } catch (IOException e) {
            e.printStackTrace();
            return new RPTO<>("上传错误请联系管理员");
        }
    }
}