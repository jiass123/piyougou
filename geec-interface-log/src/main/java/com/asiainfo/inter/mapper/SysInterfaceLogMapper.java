package com.asiainfo.inter.mapper;

import com.asiainfo.inter.entity.SysInterfaceLog;
import org.apache.ibatis.annotations.Param;

/**
 * 接口日志表
 * 
 * @author jiass
 * @email jiass@asianfo.com
 * @date 2019-04-30 16:06:15
 */
public interface SysInterfaceLogMapper{

    Integer insertLog(SysInterfaceLog sysInterfaceLog);

    SysInterfaceLog selectByPrimaryKey(@Param("id") Integer key);

    void updateLog(SysInterfaceLog sysInterfaceLog);

    void createTable();
}
