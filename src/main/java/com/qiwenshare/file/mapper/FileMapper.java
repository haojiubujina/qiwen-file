package com.qiwenshare.file.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qiwenshare.file.domain.FileBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FileMapper extends BaseMapper<FileBean> {


    void batchInsertFile(List<FileBean> fileBeanList);
//    void updateFile(FileBean fileBean);






}
