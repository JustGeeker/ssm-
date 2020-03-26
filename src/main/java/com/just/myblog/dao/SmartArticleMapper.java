package com.just.myblog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.just.myblog.domain.SmartArticle;
import com.just.myblog.domain.SmartArticleExample;

@Mapper
public interface SmartArticleMapper {
	int countByExample(SmartArticleExample example);

	int deleteByExample(SmartArticleExample example);

	int deleteByPrimaryKey(Integer oid);

	int insert(SmartArticle record);

	int insertSelective(SmartArticle record);

	List<SmartArticle> selectByExampleWithBLOBs(SmartArticleExample example);

	List<SmartArticle> selectByExample(SmartArticleExample example);

	SmartArticle selectByPrimaryKey(Integer oid);

	int updateByExampleSelective(@Param("record") SmartArticle record, @Param("example") SmartArticleExample example);

	int updateByExampleWithBLOBs(@Param("record") SmartArticle record, @Param("example") SmartArticleExample example);

	int updateByExample(@Param("record") SmartArticle record, @Param("example") SmartArticleExample example);

	int updateByPrimaryKeySelective(SmartArticle record);

	int updateByPrimaryKeyWithBLOBs(SmartArticle record);

	int updateByPrimaryKey(SmartArticle record);
}