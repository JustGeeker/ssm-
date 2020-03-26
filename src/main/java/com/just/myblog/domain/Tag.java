package com.just.myblog.domain;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@ToString
public class Tag  implements Serializable {
	private Integer oid;

	private Integer publishedrefcount;

	private Integer referencecount;

	private String title;

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Integer getPublishedrefcount() {
		return publishedrefcount;
	}

	public void setPublishedrefcount(Integer publishedrefcount) {
		this.publishedrefcount = publishedrefcount;
	}

	public Integer getReferencecount() {
		return referencecount;
	}

	public void setReferencecount(Integer referencecount) {
		this.referencecount = referencecount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}
}