package com.just.myblog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.just.myblog.domain.TagSmartArticle;
import com.just.myblog.domain.TagSmartArticleExample;

@Mapper
public interface TagSmartArticleMapper {
	int countByExample(TagSmartArticleExample example);

	int deleteByExample(TagSmartArticleExample example);

	int insert(TagSmartArticle record);

	int insertSelective(TagSmartArticle record);

	List<TagSmartArticle> selectByExample(TagSmartArticleExample example);

	int updateByExampleSelective(@Param("record") TagSmartArticle record,
                                 @Param("example") TagSmartArticleExample example);

	int updateByExample(@Param("record") TagSmartArticle record, @Param("example") TagSmartArticleExample example);
}