package com.just.myblog.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class TagArticle implements Serializable {
	private Integer articleOid;

	private Integer tagOid;

	public Integer getArticleOid() {
		return articleOid;
	}

	public void setArticleOid(Integer articleOid) {
		this.articleOid = articleOid;
	}

	public Integer getTagOid() {
		return tagOid;
	}

	public void setTagOid(Integer tagOid) {
		this.tagOid = tagOid;
	}
}