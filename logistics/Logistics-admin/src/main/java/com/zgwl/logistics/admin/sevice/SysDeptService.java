package com.zgwl.logistics.admin.sevice;

import com.zgwl.logistics.admin.model.SysDept;
import com.zgwl.logistics.common.service.CurdService;

import java.util.List;

/**
 * 机构管理
 *
 * @author xds
 */
public interface SysDeptService extends CurdService<SysDept> {

    /**
     * 查询机构树
     *
     * @param
     * @return
     */
    List<SysDept> findTree();
}
