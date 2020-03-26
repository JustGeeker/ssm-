package com.just.myblog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.just.myblog.domain.TagArticle;
import com.just.myblog.domain.TagArticleExample;

@Mapper
public interface TagArticleMapper {
	int countByExample(TagArticleExample example);

	int deleteByExample(TagArticleExample example);

	int insert(TagArticle record);

	int insertSelective(TagArticle record);

	List<TagArticle> selectByExample(TagArticleExample example);

	int updateByExampleSelective(@Param("record") TagArticle record, @Param("example") TagArticleExample example);

	int updateByExample(@Param("record") TagArticle record, @Param("example") TagArticleExample example);
}