package com.zgwl.logistics.admin.sevice;

import com.zgwl.logistics.admin.model.SysDict;
import com.zgwl.logistics.common.service.CurdService;

import java.util.List;

/**
 * 字典管理
 *
 * @author xds
 */
public interface SysDictService extends CurdService<SysDict> {

    /**
     * 根据名称查询
     *
     * @param lable
     * @return
     */
    List<SysDict> findByLable(String lable);
}
