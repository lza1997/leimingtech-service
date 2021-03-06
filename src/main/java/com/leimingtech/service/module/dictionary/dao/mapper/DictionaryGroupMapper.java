package com.leimingtech.service.module.dictionary.dao.mapper;

import java.util.List;

import com.leimingtech.core.entity.base.DictionaryGroup;
import com.leimingtech.core.orm.mybatis.SqlMapper;
import com.leimingtech.service.utils.page.Pager;

@SqlMapper
public interface DictionaryGroupMapper {
	
	void save(DictionaryGroup dictionaryGroup);
	void update(DictionaryGroup dictionaryGroup);
	void delete(Integer groupId);
	/**
	 * 根据字典组id查询字典组实体
	 * @param groupId
	 * @return
	 */
	DictionaryGroup findByGroupId(Integer groupId);
	/**
	 * 总数查询
	 * @param pager
	 * @return
	 */
	public int countGroupidList(DictionaryGroup dictionaryGroup);
	/**
	 * 分页列表
	 * @param pager
	 * @return
	 */
	public List<DictionaryGroup> queryGroupidList(Pager pager);
	
	public DictionaryGroup selectGroupByGroupCode(String groupCode);
}
