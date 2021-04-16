/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: RPTO
 * Author:   White
 * Date:     2021/4/16 19:13
 * Description: 协议类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ylesb.bsfs.rpto;

import com.ylesb.bsfs.core.ActionCode;
import lombok.Data;

/**
 *
 * 〈协议类〉
 *
 * @author White
 * @create 2021/4/16
 */
@Data
public class RPTO<T> {
    private int code;
    private String message;
    private T data;

    public RPTO(String message){
        this(ActionCode.ERROR,message,null);
    }
    public RPTO(ActionCode action){
        this(action,null);
    }
    public RPTO(ActionCode action,T data){
        this(action.code,action.message,data);
    }
    public RPTO(ActionCode action,String message,T data){
        this(action.code,message,data);
    }
    public RPTO(int code, String message) {
        this(code,message,null);
    }
    public RPTO(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}