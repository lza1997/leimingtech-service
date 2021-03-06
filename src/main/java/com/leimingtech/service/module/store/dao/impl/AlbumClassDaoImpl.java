package com.leimingtech.service.module.store.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.leimingtech.core.entity.base.AlbumClass;
import com.leimingtech.service.module.store.dao.AlbumClassDao;
import com.leimingtech.service.module.store.dao.mapper.AlbumClassMapper;

/**
 * @author llf
 * @Package com.leimingtech.service.module.store.dao.impl
 * @Description:
 * @date 2014/12/11 16:26
 */
@Repository
public class AlbumClassDaoImpl  implements AlbumClassDao{

    @Resource
    private AlbumClassMapper albumClassMapper;
    /**
     * 保存
     *
     * @param albumClass
     */
    @Override
    public void save(AlbumClass albumClass) {
        albumClassMapper.save(albumClass);
    }
}
