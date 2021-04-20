package com.ylesb.bsfs.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LogMapper {
    void add(@Param("id") String id, @Param("message")String message);
}
