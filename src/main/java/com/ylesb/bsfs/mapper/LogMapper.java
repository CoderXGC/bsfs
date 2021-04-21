package com.ylesb.bsfs.mapper;

import com.ylesb.bsfs.bean.LogBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LogMapper {
    void add(@Param("id") String id, @Param("message")String message);
}
