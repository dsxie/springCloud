package com.zgwl.logistics.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zgwl.logistics.admin.model.SysUserRole;

public interface SysUserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);

    List<SysUserRole> findUserRoles(@Param(value = "userId") Long userId);

    int deleteByUserId(@Param(value = "userId") Long userId);
}