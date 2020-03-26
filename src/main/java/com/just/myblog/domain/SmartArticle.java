package com.just.myblog.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class SmartArticle  implements Serializable {
	private Integer oid;

	private String articleid;

	private String title;

	private Integer articlerandomdouble;

	private String content;

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public String getArticleid() {
		return articleid;
	}

	public void setArticleid(String articleid) {
		this.articleid = articleid == null ? null : articleid.trim();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public Integer getArticlerandomdouble() {
		return articlerandomdouble;
	}

	public void setArticlerandomdouble(Integer articlerandomdouble) {
		this.articlerandomdouble = articlerandomdouble;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}
}