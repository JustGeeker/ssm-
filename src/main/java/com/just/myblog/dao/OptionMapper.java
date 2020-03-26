package com.just.myblog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.just.myblog.domain.Option;
import com.just.myblog.domain.OptionExample;

@Mapper
public interface OptionMapper {
	int countByExample(OptionExample example);

	int deleteByExample(OptionExample example);

	int deleteByPrimaryKey(String optionname);

	int insert(Option record);

	int insertSelective(Option record);

	List<Option> selectByExample(OptionExample example);

	Option selectByPrimaryKey(String optionname);

	int updateByExampleSelective(@Param("record") Option record, @Param("example") OptionExample example);

	int updateByExample(@Param("record") Option record, @Param("example") OptionExample example);

	int updateByPrimaryKeySelective(Option record);

	int updateByPrimaryKey(Option record);
}