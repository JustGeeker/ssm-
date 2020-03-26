package com.just.myblog.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TagExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TagExample() {
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

		public Criteria andPublishedrefcountIsNull() {
			addCriterion("publishedRefCount is null");
			return (Criteria) this;
		}

		public Criteria andPublishedrefcountIsNotNull() {
			addCriterion("publishedRefCount is not null");
			return (Criteria) this;
		}

		public Criteria andPublishedrefcountEqualTo(Integer value) {
			addCriterion("publishedRefCount =", value, "publishedrefcount");
			return (Criteria) this;
		}

		public Criteria andPublishedrefcountNotEqualTo(Integer value) {
			addCriterion("publishedRefCount <>", value, "publishedrefcount");
			return (Criteria) this;
		}

		public Criteria andPublishedrefcountGreaterThan(Integer value) {
			addCriterion("publishedRefCount >", value, "publishedrefcount");
			return (Criteria) this;
		}

		public Criteria andPublishedrefcountGreaterThanOrEqualTo(Integer value) {
			addCriterion("publishedRefCount >=", value, "publishedrefcount");
			return (Criteria) this;
		}

		public Criteria andPublishedrefcountLessThan(Integer value) {
			addCriterion("publishedRefCount <", value, "publishedrefcount");
			return (Criteria) this;
		}

		public Criteria andPublishedrefcountLessThanOrEqualTo(Integer value) {
			addCriterion("publishedRefCount <=", value, "publishedrefcount");
			return (Criteria) this;
		}

		public Criteria andPublishedrefcountIn(List<Integer> values) {
			addCriterion("publishedRefCount in", values, "publishedrefcount");
			return (Criteria) this;
		}

		public Criteria andPublishedrefcountNotIn(List<Integer> values) {
			addCriterion("publishedRefCount not in", values, "publishedrefcount");
			return (Criteria) this;
		}

		public Criteria andPublishedrefcountBetween(Integer value1, Integer value2) {
			addCriterion("publishedRefCount between", value1, value2, "publishedrefcount");
			return (Criteria) this;
		}

		public Criteria andPublishedrefcountNotBetween(Integer value1, Integer value2) {
			addCriterion("publishedRefCount not between", value1, value2, "publishedrefcount");
			return (Criteria) this;
		}

		public Criteria andReferencecountIsNull() {
			addCriterion("referenceCount is null");
			return (Criteria) this;
		}

		public Criteria andReferencecountIsNotNull() {
			addCriterion("referenceCount is not null");
			return (Criteria) this;
		}

		public Criteria andReferencecountEqualTo(Integer value) {
			addCriterion("referenceCount =", value, "referencecount");
			return (Criteria) this;
		}

		public Criteria andReferencecountNotEqualTo(Integer value) {
			addCriterion("referenceCount <>", value, "referencecount");
			return (Criteria) this;
		}

		public Criteria andReferencecountGreaterThan(Integer value) {
			addCriterion("referenceCount >", value, "referencecount");
			return (Criteria) this;
		}

		public Criteria andReferencecountGreaterThanOrEqualTo(Integer value) {
			addCriterion("referenceCount >=", value, "referencecount");
			return (Criteria) this;
		}

		public Criteria andReferencecountLessThan(Integer value) {
			addCriterion("referenceCount <", value, "referencecount");
			return (Criteria) this;
		}

		public Criteria andReferencecountLessThanOrEqualTo(Integer value) {
			addCriterion("referenceCount <=", value, "referencecount");
			return (Criteria) this;
		}

		public Criteria andReferencecountIn(List<Integer> values) {
			addCriterion("referenceCount in", values, "referencecount");
			return (Criteria) this;
		}

		public Criteria andReferencecountNotIn(List<Integer> values) {
			addCriterion("referenceCount not in", values, "referencecount");
			return (Criteria) this;
		}

		public Criteria andReferencecountBetween(Integer value1, Integer value2) {
			addCriterion("referenceCount between", value1, value2, "referencecount");
			return (Criteria) this;
		}

		public Criteria andReferencecountNotBetween(Integer value1, Integer value2) {
			addCriterion("referenceCount not between", value1, value2, "referencecount");
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