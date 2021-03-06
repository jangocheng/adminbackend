package com.info33.adminbackend.system.mapper;

import com.info33.adminbackend.system.entity.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 系统菜单表 Mapper 接口
 * </p>
 *
 * @author alex
 * @since 2018-12-11
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {
    /**
     * 根据roleID获取所有菜单权限
     * @param roleId
     * @return List<SysMenu>
     */
    List<SysMenu> getAllMenuByRoleId(Long roleId);
}
