package com.just.myblog.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Article implements Serializable {
	private Integer oid;

	private String title;

	private String abs;

	private Integer authorid;

	private Integer commentcount;

	private Integer viewcount;

	private String contents;

	private String haspublished;

	private String ispublished;

	private String puttop;

	private Long created;

	private Long updated;

	private Double randomdouble;

	private String commentable;

	private String imgname;

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public String getAbs() {
		return abs;
	}

	public void setAbs(String abs) {
		this.abs = abs == null ? null : abs.trim();
	}

	public Integer getAuthorid() {
		return authorid;
	}

	public void setAuthorid(Integer authorid) {
		this.authorid = authorid;
	}

	public Integer getCommentcount() {
		return commentcount;
	}

	public void setCommentcount(Integer commentcount) {
		this.commentcount = commentcount;
	}

	public Integer getViewcount() {
		return viewcount;
	}

	public void setViewcount(Integer viewcount) {
		this.viewcount = viewcount;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents == null ? null : contents.trim();
	}

	public String getHaspublished() {
		return haspublished;
	}

	public void setHaspublished(String haspublished) {
		this.haspublished = haspublished == null ? null : haspublished.trim();
	}

	public String getIspublished() {
		return ispublished;
	}

	public void setIspublished(String ispublished) {
		this.ispublished = ispublished == null ? null : ispublished.trim();
	}

	public String getPuttop() {
		return puttop;
	}

	public void setPuttop(String puttop) {
		this.puttop = puttop == null ? null : puttop.trim();
	}

	public Long getCreated() {
		return created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

	public Long getUpdated() {
		return updated;
	}

	public void setUpdated(Long updated) {
		this.updated = updated;
	}

	public Double getRandomdouble() {
		return randomdouble;
	}

	public void setRandomdouble(Double randomdouble) {
		this.randomdouble = randomdouble;
	}

	public String getCommentable() {
		return commentable;
	}

	public void setCommentable(String commentable) {
		this.commentable = commentable == null ? null : commentable.trim();
	}

	public String getImgname() {
		return imgname;
	}

	public void setImgname(String imgname) {
		this.imgname = imgname == null ? null : imgname.trim();
	}
}