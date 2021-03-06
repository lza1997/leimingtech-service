package com.leimingtech.service.module.report.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.leimingtech.core.entity.base.BalanceReport;
import com.leimingtech.service.module.report.dao.BalanceReportDao;
import com.leimingtech.service.module.report.dao.mapper.BalanceReportMapper;

@Component
public class BalanceReportDaoImpl implements BalanceReportDao{

	@Autowired
	private BalanceReportMapper balanceReportMapper;

	@Override
	public List<BalanceReport> getHaveBalanced(BalanceReport balanceReport) {
		// TODO Auto-generated method stub
		return balanceReportMapper.getHaveBalanced(balanceReport);
	}

}
