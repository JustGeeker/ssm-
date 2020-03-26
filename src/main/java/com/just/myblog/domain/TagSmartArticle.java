package com.just.myblog.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class TagSmartArticle implements Serializable {
	private Integer smartOid;

	private Integer tagOid;

	public Integer getSmartOid() {
		return smartOid;
	}

	public void setSmartOid(Integer smartOid) {
		this.smartOid = smartOid;
	}

	public Integer getTagOid() {
		return tagOid;
	}

	public void setTagOid(Integer tagOid) {
		this.tagOid = tagOid;
	}
}