package com.lagou.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 菜单类
 * */
public class Menu {

    //主键id
    private Integer id;

    //父菜单id
    private int parentId;

    //菜单路径
    private String href;

    //菜单图标
    private String icon;

    //菜单名称
    private String name;

    //描述
    private String description;

    //排序号
    private int orderNum;

    //是否展示
    private int shown;

    //菜单层级，从0开始
    private int level;

    //创建时间
    private Date createdTime;

    //更新时间
    private Date updatedTime;

    //创建人
    private String createdBy;

    //更新人
    private String updatedBy;


    /**
     * 实现自关联,表示子菜单
     * */
    private List<Menu> subMenuList = new ArrayList<>();

    public List<Menu> getSubMenuList() {
        return subMenuList;
    }

    public void setSubMenuList(List<Menu> subMenuList) {
        this.subMenuList = subMenuList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getShown() {
        return shown;
    }

    public void setShown(int shown) {
        this.shown = shown;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }


    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", href='" + href + '\'' +
                ", icon='" + icon + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", orderNum=" + orderNum +
                ", shown=" + shown +
                ", level=" + level +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                '}';
    }
}
