package com.just.myblog.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ArticleExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ArticleExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andOidIsNull() {
			addCriterion("oId is null");
			return (Criteria) this;
		}

		public Criteria andOidIsNotNull() {
			addCriterion("oId is not null");
			return (Criteria) this;
		}

		public Criteria andOidEqualTo(Integer value) {
			addCriterion("oId =", value, "oid");
			return (Criteria) this;
		}

		public Criteria andOidNotEqualTo(Integer value) {
			addCriterion("oId <>", value, "oid");
			return (Criteria) this;
		}

		public Criteria andOidGreaterThan(Integer value) {
			addCriterion("oId >", value, "oid");
			return (Criteria) this;
		}

		public Criteria andOidGreaterThanOrEqualTo(Integer value) {
			addCriterion("oId >=", value, "oid");
			return (Criteria) this;
		}

		public Criteria andOidLessThan(Integer value) {
			addCriterion("oId <", value, "oid");
			return (Criteria) this;
		}

		public Criteria andOidLessThanOrEqualTo(Integer value) {
			addCriterion("oId <=", value, "oid");
			return (Criteria) this;
		}

		public Criteria andOidIn(List<Integer> values) {
			addCriterion("oId in", values, "oid");
			return (Criteria) this;
		}

		public Criteria andOidNotIn(List<Integer> values) {
			addCriterion("oId not in", values, "oid");
			return (Criteria) this;
		}

		public Criteria andOidBetween(Integer value1, Integer value2) {
			addCriterion("oId between", value1, value2, "oid");
			return (Criteria) this;
		}

		public Criteria andOidNotBetween(Integer value1, Integer value2) {
			addCriterion("oId not between", value1, value2, "oid");
			return (Criteria) this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andAbsIsNull() {
			addCriterion("abs is null");
			return (Criteria) this;
		}

		public Criteria andAbsIsNotNull() {
			addCriterion("abs is not null");
			return (Criteria) this;
		}

		public Criteria andAbsEqualTo(String value) {
			addCriterion("abs =", value, "abs");
			return (Criteria) this;
		}

		public Criteria andAbsNotEqualTo(String value) {
			addCriterion("abs <>", value, "abs");
			return (Criteria) this;
		}

		public Criteria andAbsGreaterThan(String value) {
			addCriterion("abs >", value, "abs");
			return (Criteria) this;
		}

		public Criteria andAbsGreaterThanOrEqualTo(String value) {
			addCriterion("abs >=", value, "abs");
			return (Criteria) this;
		}

		public Criteria andAbsLessThan(String value) {
			addCriterion("abs <", value, "abs");
			return (Criteria) this;
		}

		public Criteria andAbsLessThanOrEqualTo(String value) {
			addCriterion("abs <=", value, "abs");
			return (Criteria) this;
		}

		public Criteria andAbsLike(String value) {
			addCriterion("abs like", value, "abs");
			return (Criteria) this;
		}

		public Criteria andAbsNotLike(String value) {
			addCriterion("abs not like", value, "abs");
			return (Criteria) this;
		}

		public Criteria andAbsIn(List<String> values) {
			addCriterion("abs in", values, "abs");
			return (Criteria) this;
		}

		public Criteria andAbsNotIn(List<String> values) {
			addCriterion("abs not in", values, "abs");
			return (Criteria) this;
		}

		public Criteria andAbsBetween(String value1, String value2) {
			addCriterion("abs between", value1, value2, "abs");
			return (Criteria) this;
		}

		public Criteria andAbsNotBetween(String value1, String value2) {
			addCriterion("abs not between", value1, value2, "abs");
			return (Criteria) this;
		}

		public Criteria andAuthoridIsNull() {
			addCriterion("authorId is null");
			return (Criteria) this;
		}

		public Criteria andAuthoridIsNotNull() {
			addCriterion("authorId is not null");
			return (Criteria) this;
		}

		public Criteria andAuthoridEqualTo(Integer value) {
			addCriterion("authorId =", value, "authorid");
			return (Criteria) this;
		}

		public Criteria andAuthoridNotEqualTo(Integer value) {
			addCriterion("authorId <>", value, "authorid");
			return (Criteria) this;
		}

		public Criteria andAuthoridGreaterThan(Integer value) {
			addCriterion("authorId >", value, "authorid");
			return (Criteria) this;
		}

		public Criteria andAuthoridGreaterThanOrEqualTo(Integer value) {
			addCriterion("authorId >=", value, "authorid");
			return (Criteria) this;
		}

		public Criteria andAuthoridLessThan(Integer value) {
			addCriterion("authorId <", value, "authorid");
			return (Criteria) this;
		}

		public Criteria andAuthoridLessThanOrEqualTo(Integer value) {
			addCriterion("authorId <=", value, "authorid");
			return (Criteria) this;
		}

		public Criteria andAuthoridIn(List<Integer> values) {
			addCriterion("authorId in", values, "authorid");
			return (Criteria) this;
		}

		public Criteria andAuthoridNotIn(List<Integer> values) {
			addCriterion("authorId not in", values, "authorid");
			return (Criteria) this;
		}

		public Criteria andAuthoridBetween(Integer value1, Integer value2) {
			addCriterion("authorId between", value1, value2, "authorid");
			return (Criteria) this;
		}

		public Criteria andAuthoridNotBetween(Integer value1, Integer value2) {
			addCriterion("authorId not between", value1, value2, "authorid");
			return (Criteria) this;
		}

		public Criteria andCommentcountIsNull() {
			addCriterion("commentCount is null");
			return (Criteria) this;
		}

		public Criteria andCommentcountIsNotNull() {
			addCriterion("commentCount is not null");
			return (Criteria) this;
		}

		public Criteria andCommentcountEqualTo(Integer value) {
			addCriterion("commentCount =", value, "commentcount");
			return (Criteria) this;
		}

		public Criteria andCommentcountNotEqualTo(Integer value) {
			addCriterion("commentCount <>", value, "commentcount");
			return (Criteria) this;
		}

		public Criteria andCommentcountGreaterThan(Integer value) {
			addCriterion("commentCount >", value, "commentcount");
			return (Criteria) this;
		}

		public Criteria andCommentcountGreaterThanOrEqualTo(Integer value) {
			addCriterion("commentCount >=", value, "commentcount");
			return (Criteria) this;
		}

		public Criteria andCommentcountLessThan(Integer value) {
			addCriterion("commentCount <", value, "commentcount");
			return (Criteria) this;
		}

		public Criteria andCommentcountLessThanOrEqualTo(Integer value) {
			addCriterion("commentCount <=", value, "commentcount");
			return (Criteria) this;
		}

		public Criteria andCommentcountIn(List<Integer> values) {
			addCriterion("commentCount in", values, "commentcount");
			return (Criteria) this;
		}

		public Criteria andCommentcountNotIn(List<Integer> values) {
			addCriterion("commentCount not in", values, "commentcount");
			return (Criteria) this;
		}

		public Criteria andCommentcountBetween(Integer value1, Integer value2) {
			addCriterion("commentCount between", value1, value2, "commentcount");
			return (Criteria) this;
		}

		public Criteria andCommentcountNotBetween(Integer value1, Integer value2) {
			addCriterion("commentCount not between", value1, value2, "commentcount");
			return (Criteria) this;
		}

		public Criteria andViewcountIsNull() {
			addCriterion("viewCount is null");
			return (Criteria) this;
		}

		public Criteria andViewcountIsNotNull() {
			addCriterion("viewCount is not null");
			return (Criteria) this;
		}

		public Criteria andViewcountEqualTo(Integer value) {
			addCriterion("viewCount =", value, "viewcount");
			return (Criteria) this;
		}

		public Criteria andViewcountNotEqualTo(Integer value) {
			addCriterion("viewCount <>", value, "viewcount");
			return (Criteria) this;
		}

		public Criteria andViewcountGreaterThan(Integer value) {
			addCriterion("viewCount >", value, "viewcount");
			return (Criteria) this;
		}

		public Criteria andViewcountGreaterThanOrEqualTo(Integer value) {
			addCriterion("viewCount >=", value, "viewcount");
			return (Criteria) this;
		}

		public Criteria andViewcountLessThan(Integer value) {
			addCriterion("viewCount <", value, "viewcount");
			return (Criteria) this;
		}

		public Criteria andViewcountLessThanOrEqualTo(Integer value) {
			addCriterion("viewCount <=", value, "viewcount");
			return (Criteria) this;
		}

		public Criteria andViewcountIn(List<Integer> values) {
			addCriterion("viewCount in", values, "viewcount");
			return (Criteria) this;
		}

		public Criteria andViewcountNotIn(List<Integer> values) {
			addCriterion("viewCount not in", values, "viewcount");
			return (Criteria) this;
		}

		public Criteria andViewcountBetween(Integer value1, Integer value2) {
			addCriterion("viewCount between", value1, value2, "viewcount");
			return (Criteria) this;
		}

		public Criteria andViewcountNotBetween(Integer value1, Integer value2) {
			addCriterion("viewCount not between", value1, value2, "viewcount");
			return (Criteria) this;
		}

		public Criteria andContentsIsNull() {
			addCriterion("contents is null");
			return (Criteria) this;
		}

		public Criteria andContentsIsNotNull() {
			addCriterion("contents is not null");
			return (Criteria) this;
		}

		public Criteria andContentsEqualTo(String value) {
			addCriterion("contents =", value, "contents");
			return (Criteria) this;
		}

		public Criteria andContentsNotEqualTo(String value) {
			addCriterion("contents <>", value, "contents");
			return (Criteria) this;
		}

		public Criteria andContentsGreaterThan(String value) {
			addCriterion("contents >", value, "contents");
			return (Criteria) this;
		}

		public Criteria andContentsGreaterThanOrEqualTo(String value) {
			addCriterion("contents >=", value, "contents");
			return (Criteria) this;
		}

		public Criteria andContentsLessThan(String value) {
			addCriterion("contents <", value, "contents");
			return (Criteria) this;
		}

		public Criteria andContentsLessThanOrEqualTo(String value) {
			addCriterion("contents <=", value, "contents");
			return (Criteria) this;
		}

		public Criteria andContentsLike(String value) {
			addCriterion("contents like", value, "contents");
			return (Criteria) this;
		}

		public Criteria andContentsNotLike(String value) {
			addCriterion("contents not like", value, "contents");
			return (Criteria) this;
		}

		public Criteria andContentsIn(List<String> values) {
			addCriterion("contents in", values, "contents");
			return (Criteria) this;
		}

		public Criteria andContentsNotIn(List<String> values) {
			addCriterion("contents not in", values, "contents");
			return (Criteria) this;
		}

		public Criteria andContentsBetween(String value1, String value2) {
			addCriterion("contents between", value1, value2, "contents");
			return (Criteria) this;
		}

		public Criteria andContentsNotBetween(String value1, String value2) {
			addCriterion("contents not between", value1, value2, "contents");
			return (Criteria) this;
		}

		public Criteria andHaspublishedIsNull() {
			addCriterion("hasPublished is null");
			return (Criteria) this;
		}

		public Criteria andHaspublishedIsNotNull() {
			addCriterion("hasPublished is not null");
			return (Criteria) this;
		}

		public Criteria andHaspublishedEqualTo(String value) {
			addCriterion("hasPublished =", value, "haspublished");
			return (Criteria) this;
		}

		public Criteria andHaspublishedNotEqualTo(String value) {
			addCriterion("hasPublished <>", value, "haspublished");
			return (Criteria) this;
		}

		public Criteria andHaspublishedGreaterThan(String value) {
			addCriterion("hasPublished >", value, "haspublished");
			return (Criteria) this;
		}

		public Criteria andHaspublishedGreaterThanOrEqualTo(String value) {
			addCriterion("hasPublished >=", value, "haspublished");
			return (Criteria) this;
		}

		public Criteria andHaspublishedLessThan(String value) {
			addCriterion("hasPublished <", value, "haspublished");
			return (Criteria) this;
		}

		public Criteria andHaspublishedLessThanOrEqualTo(String value) {
			addCriterion("hasPublished <=", value, "haspublished");
			return (Criteria) this;
		}

		public Criteria andHaspublishedLike(String value) {
			addCriterion("hasPublished like", value, "haspublished");
			return (Criteria) this;
		}

		public Criteria andHaspublishedNotLike(String value) {
			addCriterion("hasPublished not like", value, "haspublished");
			return (Criteria) this;
		}

		public Criteria andHaspublishedIn(List<String> values) {
			addCriterion("hasPublished in", values, "haspublished");
			return (Criteria) this;
		}

		public Criteria andHaspublishedNotIn(List<String> values) {
			addCriterion("hasPublished not in", values, "haspublished");
			return (Criteria) this;
		}

		public Criteria andHaspublishedBetween(String value1, String value2) {
			addCriterion("hasPublished between", value1, value2, "haspublished");
			return (Criteria) this;
		}

		public Criteria andHaspublishedNotBetween(String value1, String value2) {
			addCriterion("hasPublished not between", value1, value2, "haspublished");
			return (Criteria) this;
		}

		public Criteria andIspublishedIsNull() {
			addCriterion("isPublished is null");
			return (Criteria) this;
		}

		public Criteria andIspublishedIsNotNull() {
			addCriterion("isPublished is not null");
			return (Criteria) this;
		}

		public Criteria andIspublishedEqualTo(String value) {
			addCriterion("isPublished =", value, "ispublished");
			return (Criteria) this;
		}

		public Criteria andIspublishedNotEqualTo(String value) {
			addCriterion("isPublished <>", value, "ispublished");
			return (Criteria) this;
		}

		public Criteria andIspublishedGreaterThan(String value) {
			addCriterion("isPublished >", value, "ispublished");
			return (Criteria) this;
		}

		public Criteria andIspublishedGreaterThanOrEqualTo(String value) {
			addCriterion("isPublished >=", value, "ispublished");
			return (Criteria) this;
		}

		public Criteria andIspublishedLessThan(String value) {
			addCriterion("isPublished <", value, "ispublished");
			return (Criteria) this;
		}

		public Criteria andIspublishedLessThanOrEqualTo(String value) {
			addCriterion("isPublished <=", value, "ispublished");
			return (Criteria) this;
		}

		public Criteria andIspublishedLike(String value) {
			addCriterion("isPublished like", value, "ispublished");
			return (Criteria) this;
		}

		public Criteria andIspublishedNotLike(String value) {
			addCriterion("isPublished not like", value, "ispublished");
			return (Criteria) this;
		}

		public Criteria andIspublishedIn(List<String> values) {
			addCriterion("isPublished in", values, "ispublished");
			return (Criteria) this;
		}

		public Criteria andIspublishedNotIn(List<String> values) {
			addCriterion("isPublished not in", values, "ispublished");
			return (Criteria) this;
		}

		public Criteria andIspublishedBetween(String value1, String value2) {
			addCriterion("isPublished between", value1, value2, "ispublished");
			return (Criteria) this;
		}

		public Criteria andIspublishedNotBetween(String value1, String value2) {
			addCriterion("isPublished not between", value1, value2, "ispublished");
			return (Criteria) this;
		}

		public Criteria andPuttopIsNull() {
			addCriterion("putTop is null");
			return (Criteria) this;
		}

		public Criteria andPuttopIsNotNull() {
			addCriterion("putTop is not null");
			return (Criteria) this;
		}

		public Criteria andPuttopEqualTo(String value) {
			addCriterion("putTop =", value, "puttop");
			return (Criteria) this;
		}

		public Criteria andPuttopNotEqualTo(String value) {
			addCriterion("putTop <>", value, "puttop");
			return (Criteria) this;
		}

		public Criteria andPuttopGreaterThan(String value) {
			addCriterion("putTop >", value, "puttop");
			return (Criteria) this;
		}

		public Criteria andPuttopGreaterThanOrEqualTo(String value) {
			addCriterion("putTop >=", value, "puttop");
			return (Criteria) this;
		}

		public Criteria andPuttopLessThan(String value) {
			addCriterion("putTop <", value, "puttop");
			return (Criteria) this;
		}

		public Criteria andPuttopLessThanOrEqualTo(String value) {
			addCriterion("putTop <=", value, "puttop");
			return (Criteria) this;
		}

		public Criteria andPuttopLike(String value) {
			addCriterion("putTop like", value, "puttop");
			return (Criteria) this;
		}

		public Criteria andPuttopNotLike(String value) {
			addCriterion("putTop not like", value, "puttop");
			return (Criteria) this;
		}

		public Criteria andPuttopIn(List<String> values) {
			addCriterion("putTop in", values, "puttop");
			return (Criteria) this;
		}

		public Criteria andPuttopNotIn(List<String> values) {
			addCriterion("putTop not in", values, "puttop");
			return (Criteria) this;
		}

		public Criteria andPuttopBetween(String value1, String value2) {
			addCriterion("putTop between", value1, value2, "puttop");
			return (Criteria) this;
		}

		public Criteria andPuttopNotBetween(String value1, String value2) {
			addCriterion("putTop not between", value1, value2, "puttop");
			return (Criteria) this;
		}

		public Criteria andCreatedIsNull() {
			addCriterion("created is null");
			return (Criteria) this;
		}

		public Criteria andCreatedIsNotNull() {
			addCriterion("created is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedEqualTo(Long value) {
			addCriterion("created =", value, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedNotEqualTo(Long value) {
			addCriterion("created <>", value, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedGreaterThan(Long value) {
			addCriterion("created >", value, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedGreaterThanOrEqualTo(Long value) {
			addCriterion("created >=", value, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedLessThan(Long value) {
			addCriterion("created <", value, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedLessThanOrEqualTo(Long value) {
			addCriterion("created <=", value, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedIn(List<Long> values) {
			addCriterion("created in", values, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedNotIn(List<Long> values) {
			addCriterion("created not in", values, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedBetween(Long value1, Long value2) {
			addCriterion("created between", value1, value2, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedNotBetween(Long value1, Long value2) {
			addCriterion("created not between", value1, value2, "created");
			return (Criteria) this;
		}

		public Criteria andUpdatedIsNull() {
			addCriterion("updated is null");
			return (Criteria) this;
		}

		public Criteria andUpdatedIsNotNull() {
			addCriterion("updated is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatedEqualTo(Long value) {
			addCriterion("updated =", value, "updated");
			return (Criteria) this;
		}

		public Criteria andUpdatedNotEqualTo(Long value) {
			addCriterion("updated <>", value, "updated");
			return (Criteria) this;
		}

		public Criteria andUpdatedGreaterThan(Long value) {
			addCriterion("updated >", value, "updated");
			return (Criteria) this;
		}

		public Criteria andUpdatedGreaterThanOrEqualTo(Long value) {
			addCriterion("updated >=", value, "updated");
			return (Criteria) this;
		}

		public Criteria andUpdatedLessThan(Long value) {
			addCriterion("updated <", value, "updated");
			return (Criteria) this;
		}

		public Criteria andUpdatedLessThanOrEqualTo(Long value) {
			addCriterion("updated <=", value, "updated");
			return (Criteria) this;
		}

		public Criteria andUpdatedIn(List<Long> values) {
			addCriterion("updated in", values, "updated");
			return (Criteria) this;
		}

		public Criteria andUpdatedNotIn(List<Long> values) {
			addCriterion("updated not in", values, "updated");
			return (Criteria) this;
		}

		public Criteria andUpdatedBetween(Long value1, Long value2) {
			addCriterion("updated between", value1, value2, "updated");
			return (Criteria) this;
		}

		public Criteria andUpdatedNotBetween(Long value1, Long value2) {
			addCriterion("updated not between", value1, value2, "updated");
			return (Criteria) this;
		}

		public Criteria andRandomdoubleIsNull() {
			addCriterion("randomDouble is null");
			return (Criteria) this;
		}

		public Criteria andRandomdoubleIsNotNull() {
			addCriterion("randomDouble is not null");
			return (Criteria) this;
		}

		public Criteria andRandomdoubleEqualTo(Double value) {
			addCriterion("randomDouble =", value, "randomdouble");
			return (Criteria) this;
		}

		public Criteria andRandomdoubleNotEqualTo(Double value) {
			addCriterion("randomDouble <>", value, "randomdouble");
			return (Criteria) this;
		}

		public Criteria andRandomdoubleGreaterThan(Double value) {
			addCriterion("randomDouble >", value, "randomdouble");
			return (Criteria) this;
		}

		public Criteria andRandomdoubleGreaterThanOrEqualTo(Double value) {
			addCriterion("randomDouble >=", value, "randomdouble");
			return (Criteria) this;
		}

		public Criteria andRandomdoubleLessThan(Double value) {
			addCriterion("randomDouble <", value, "randomdouble");
			return (Criteria) this;
		}

		public Criteria andRandomdoubleLessThanOrEqualTo(Double value) {
			addCriterion("randomDouble <=", value, "randomdouble");
			return (Criteria) this;
		}

		public Criteria andRandomdoubleIn(List<Double> values) {
			addCriterion("randomDouble in", values, "randomdouble");
			return (Criteria) this;
		}

		public Criteria andRandomdoubleNotIn(List<Double> values) {
			addCriterion("randomDouble not in", values, "randomdouble");
			return (Criteria) this;
		}

		public Criteria andRandomdoubleBetween(Double value1, Double value2) {
			addCriterion("randomDouble between", value1, value2, "randomdouble");
			return (Criteria) this;
		}

		public Criteria andRandomdoubleNotBetween(Double value1, Double value2) {
			addCriterion("randomDouble not between", value1, value2, "randomdouble");
			return (Criteria) this;
		}

		public Criteria andCommentableIsNull() {
			addCriterion("commentable is null");
			return (Criteria) this;
		}

		public Criteria andCommentableIsNotNull() {
			addCriterion("commentable is not null");
			return (Criteria) this;
		}

		public Criteria andCommentableEqualTo(String value) {
			addCriterion("commentable =", value, "commentable");
			return (Criteria) this;
		}

		public Criteria andCommentableNotEqualTo(String value) {
			addCriterion("commentable <>", value, "commentable");
			return (Criteria) this;
		}

		public Criteria andCommentableGreaterThan(String value) {
			addCriterion("commentable >", value, "commentable");
			return (Criteria) this;
		}

		public Criteria andCommentableGreaterThanOrEqualTo(String value) {
			addCriterion("commentable >=", value, "commentable");
			return (Criteria) this;
		}

		public Criteria andCommentableLessThan(String value) {
			addCriterion("commentable <", value, "commentable");
			return (Criteria) this;
		}

		public Criteria andCommentableLessThanOrEqualTo(String value) {
			addCriterion("commentable <=", value, "commentable");
			return (Criteria) this;
		}

		public Criteria andCommentableLike(String value) {
			addCriterion("commentable like", value, "commentable");
			return (Criteria) this;
		}

		public Criteria andCommentableNotLike(String value) {
			addCriterion("commentable not like", value, "commentable");
			return (Criteria) this;
		}

		public Criteria andCommentableIn(List<String> values) {
			addCriterion("commentable in", values, "commentable");
			return (Criteria) this;
		}

		public Criteria andCommentableNotIn(List<String> values) {
			addCriterion("commentable not in", values, "commentable");
			return (Criteria) this;
		}

		public Criteria andCommentableBetween(String value1, String value2) {
			addCriterion("commentable between", value1, value2, "commentable");
			return (Criteria) this;
		}

		public Criteria andCommentableNotBetween(String value1, String value2) {
			addCriterion("commentable not between", value1, value2, "commentable");
			return (Criteria) this;
		}

		public Criteria andImgnameIsNull() {
			addCriterion("imgName is null");
			return (Criteria) this;
		}

		public Criteria andImgnameIsNotNull() {
			addCriterion("imgName is not null");
			return (Criteria) this;
		}

		public Criteria andImgnameEqualTo(String value) {
			addCriterion("imgName =", value, "imgname");
			return (Criteria) this;
		}

		public Criteria andImgnameNotEqualTo(String value) {
			addCriterion("imgName <>", value, "imgname");
			return (Criteria) this;
		}

		public Criteria andImgnameGreaterThan(String value) {
			addCriterion("imgName >", value, "imgname");
			return (Criteria) this;
		}

		public Criteria andImgnameGreaterThanOrEqualTo(String value) {
			addCriterion("imgName >=", value, "imgname");
			return (Criteria) this;
		}

		public Criteria andImgnameLessThan(String value) {
			addCriterion("imgName <", value, "imgname");
			return (Criteria) this;
		}

		public Criteria andImgnameLessThanOrEqualTo(String value) {
			addCriterion("imgName <=", value, "imgname");
			return (Criteria) this;
		}

		public Criteria andImgnameLike(String value) {
			addCriterion("imgName like", value, "imgname");
			return (Criteria) this;
		}

		public Criteria andImgnameNotLike(String value) {
			addCriterion("imgName not like", value, "imgname");
			return (Criteria) this;
		}

		public Criteria andImgnameIn(List<String> values) {
			addCriterion("imgName in", values, "imgname");
			return (Criteria) this;
		}

		public Criteria andImgnameNotIn(List<String> values) {
			addCriterion("imgName not in", values, "imgname");
			return (Criteria) this;
		}

		public Criteria andImgnameBetween(String value1, String value2) {
			addCriterion("imgName between", value1, value2, "imgname");
			return (Criteria) this;
		}

		public Criteria andImgnameNotBetween(String value1, String value2) {
			addCriterion("imgName not between", value1, value2, "imgname");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}