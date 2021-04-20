/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: LogService
 * Author:   White
 * Date:     2021/4/20 18:43
 * Description: rizhi
 * History:
 */
package com.ylesb.bsfs.service;

import com.ylesb.bsfs.rpto.LogRPTO;
import com.ylesb.bsfs.rqto.LogRQTO;

/**
 *
 * 〈日志〉
 *
 * @author White
 * @create 2021/4/20
 */
public interface LogService {
    LogRPTO add(LogRQTO add);
}