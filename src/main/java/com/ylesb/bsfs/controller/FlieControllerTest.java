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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * 〈图片上传测试接口最初版〉
 *
 * @author White
 * @create 2021/4/19
 */
@Controller
@RequestMapping("/usertest")
public class FlieControllerTest {


    @Resource
    HttpServletRequest request;
    @ResponseBody
    //处理文件上传
    @RequestMapping(value="/uploadimg", method = RequestMethod.POST)
    public RPTO uploadImg(@RequestParam("file") MultipartFile file) {
        FileRPTO fileRPTO=new FileRPTO();
        Url url=new Url();
        String fileName = file.getOriginalFilename();
        //设置文件上传路径
        String path = System.getProperty("user.dir")+"/faceImg/";
        try {
            FileUtil.uploadFile(file.getBytes(), path, fileName);
            fileRPTO.setUrl(url.getHomeurl()+"/faceImg/"+fileName);
            return new RPTO<>(ActionCode.SUCCESS,fileRPTO);
        } catch (Exception e) {
            return new RPTO<>("上传错误请联系管理员！");
        }
    }
}