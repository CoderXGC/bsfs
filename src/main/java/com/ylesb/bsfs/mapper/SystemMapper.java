package com.ylesb.bsfs.mapper;

import com.ylesb.bsfs.bean.LogBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SystemMapper {
    void addlog(@Param("id") String id, @Param("message")String message);
}
