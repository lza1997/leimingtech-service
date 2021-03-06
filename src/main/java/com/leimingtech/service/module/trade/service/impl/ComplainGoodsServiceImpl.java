package com.leimingtech.service.module.trade.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.leimingtech.core.entity.base.ComplainGoods;
import com.leimingtech.service.module.trade.dao.ComplainGoodsDao;
import com.leimingtech.service.module.trade.service.ComplainGoodsService;

/**
 * Created by rabook on 2014/12/21.
 */
@Service
public class ComplainGoodsServiceImpl implements ComplainGoodsService{

    @Resource
    private ComplainGoodsDao complainGoodsDao;

    @Override
    public List<ComplainGoods> findByComplainId(int id) {
        return complainGoodsDao.findByComplainId(id);
    }
}
