package com.leimingtech.service.module.coupon.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.leimingtech.core.entity.base.Cart;
import com.leimingtech.core.entity.base.CouponMember;
import com.leimingtech.core.entity.base.Goods;
import com.leimingtech.core.entity.searchbean.CouponSearch;
import com.leimingtech.core.entity.vo.CartVo;
import com.leimingtech.service.module.coupon.dao.CouponMemberDao;
import com.leimingtech.service.module.coupon.service.CouponMemberService;

/**
 * 会员领取优惠券接口实现
 * @author kviuff
 * @date 2015-07-31 16:00:00
 */
@Service
public class CouponMemberServiceImpl implements CouponMemberService {

	@Resource
	private CouponMemberDao couponMemberDao;
	/**
	 * 保存领取优惠券
	 * @param couponMember
	 */
	public void saveCouponMember(CouponMember couponMember) {
		couponMemberDao.saveCouponMember(couponMember);
	}

	/**
	 * 根据会员id获取所领取的优惠券数量
	 * @param memberId
	 * @return
	 */
	public int getCouponMemberCount(Integer couponId) {
		return couponMemberDao.getCouponMemberCount(couponId);
	}

	/**
	 * 根据会员id和店铺id获取优惠券列表
	 * @param memberId
	 * @param storeId
	 * @return
	 */
	public List<CouponMember> getCouponListByMemberIdAndStoreId(CouponSearch couponSearch) {
		return couponMemberDao.getCouponListByMemberIdAndStoreId(couponSearch);
	}

	/**
	 * 修改是否已使用状态
	 * @param couponMember
	 */
	public void updateCouponMember(CouponMember couponMember) {
		couponMemberDao.updateCouponMember(couponMember);
	}
	/**
	 * 通过用户id、店铺和商品的列表获取优惠券列表
	 * @param memberId
	 * @param storeIds
	 * @param list
	 * @return
	 */
	public List<CouponMember> findCouponsByConditions(Integer memberId,String storeIds,List<Goods> list){
		String goodsClassIds = "";
		String sp = "";
		for (Goods goods : list) {
			Integer gcId = goods.getGcId();
			goodsClassIds = sp + gcId;
			sp = ",";
		}
		return couponMemberDao.findCouponsByConditions(memberId,storeIds,goodsClassIds);
	}
	
	/**
	 * 根据条件获取会员优惠券
	 * @param memberId
	 * @param storeIds
	 * @param goodsClassIds
	 * @param currentTimeMillis 查询时间戳,优惠券生效时间段查询
	 * @return
	 */
	public List<CouponMember> findCouponMemberByConditions(Integer memberId,
			String storeIds, String goodsClassIds, long currentTimeMillis){
		return couponMemberDao.findCouponMemberByConditions(memberId, storeIds, goodsClassIds, currentTimeMillis);
	}
}
