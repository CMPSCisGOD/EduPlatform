package com.lagou.service;

import com.lagou.domain.ResourceCategory;

import java.util.List;

public interface ResourceCategoryService {

    /*
        查询所有资源分类
     */
    public List<ResourceCategory> findAllResourceCategory();


    void saveResourceCategory(ResourceCategory resourceCategory);

    void updateResourceCategory(ResourceCategory resourceCategory);

    void deleteResourceCategory(Integer id);
}
