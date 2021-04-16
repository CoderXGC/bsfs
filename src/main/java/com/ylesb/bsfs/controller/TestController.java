/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: TestController
 * Author:   White
 * Date:     2021/4/16 15:52
 * Description: 测试接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ylesb.bsfs.controller;

import com.ylesb.bsfs.rqto.TestRTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 * 〈测试接口〉
 *
 * @author White
 * @create 2021/4/16
 */

@Controller
@RequestMapping("api")
public class TestController {
    @ResponseBody
    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public TestRTO test(@RequestBody TestRTO test) {
        return test;
    }



}
