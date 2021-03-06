package com.info33.adminbackend.system.entity;

import java.time.LocalDateTime;
import com.info33.adminbackend.system.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统菜单表
 * </p>
 *
 * @author alex
 * @since 2018-12-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SysMenu extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 父ID
     */
    private Long parentId;

    /**
     * 菜单code
     */
    private String menuCode;

    /**
     * 类型（MENU菜单,ACTION链接,BUTTON按钮）
     */
    private String menuType;

    /**
     * 名称
     */
    private String menuName;

    /**
     * 级别
     */
    private Integer menuLevel;

    /**
     * 权限字符串
     */
    private String menuPermission;

    /**
     * 图标
     */
    private String menuIcon;

    /**
     * 链接地址
     */
    private String menuAction;

    /**
     * 跳转url
     */
    private String url;

    /**
     * url名称
     */
    private String urlName;

    /**
     * 路由名
     */
    private String name;

    /**
     * 组件名
     */
    private String component;

    /**
     * 是否跳转 1可跳 0不可
     */
    @TableField("isSkip")
    private String isSkip;


}
