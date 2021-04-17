/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: ActionCode
 * Author:   White
 * Date:     2021/4/16 19:12
 * Description: 请求状态
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ylesb.bsfs.core;

/**
 *
 * 〈请求状态〉
 *
 * @author White
 * @create 2021/4/16
 */
public enum ActionCode {
    ERROR(-1,"用户名密码错误"),
    SUCCESS(200,"请求成功"),
    EXCEPTION(404,"请输入账号密码"),
    VALID(100,"参数校验异常");

    public int code;
    public String message;


    ActionCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
