package com.zgwl.logistics.admin.sevice;

import com.zgwl.logistics.admin.model.SysUser;
import com.zgwl.logistics.admin.model.SysUserRole;
import com.zgwl.logistics.common.service.CurdService;

import java.util.List;
import java.util.Set;

/**
 * 用户管理
 *
 * @author xds
 */
public interface SysUserService extends CurdService<SysUser> {

    SysUser findByName(String username);

    /**
     * 查找用户的菜单权限标识集合
     *
     * @param userName
     * @return
     */
    Set<String> findPermissions(String userName);

    /**
     * 查找用户的角色集合
     *
     * @param
     * @return
     */
    List<SysUserRole> findUserRoles(Long userId);

}
