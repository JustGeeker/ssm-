package com.just.myblog.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TagSmartArticleExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TagSmartArticleExample() {
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

		public Criteria andSmartOidIsNull() {
			addCriterion("smart_oid is null");
			return (Criteria) this;
		}

		public Criteria andSmartOidIsNotNull() {
			addCriterion("smart_oid is not null");
			return (Criteria) this;
		}

		public Criteria andSmartOidEqualTo(Integer value) {
			addCriterion("smart_oid =", value, "smartOid");
			return (Criteria) this;
		}

		public Criteria andSmartOidNotEqualTo(Integer value) {
			addCriterion("smart_oid <>", value, "smartOid");
			return (Criteria) this;
		}

		public Criteria andSmartOidGreaterThan(Integer value) {
			addCriterion("smart_oid >", value, "smartOid");
			return (Criteria) this;
		}

		public Criteria andSmartOidGreaterThanOrEqualTo(Integer value) {
			addCriterion("smart_oid >=", value, "smartOid");
			return (Criteria) this;
		}

		public Criteria andSmartOidLessThan(Integer value) {
			addCriterion("smart_oid <", value, "smartOid");
			return (Criteria) this;
		}

		public Criteria andSmartOidLessThanOrEqualTo(Integer value) {
			addCriterion("smart_oid <=", value, "smartOid");
			return (Criteria) this;
		}

		public Criteria andSmartOidIn(List<Integer> values) {
			addCriterion("smart_oid in", values, "smartOid");
			return (Criteria) this;
		}

		public Criteria andSmartOidNotIn(List<Integer> values) {
			addCriterion("smart_oid not in", values, "smartOid");
			return (Criteria) this;
		}

		public Criteria andSmartOidBetween(Integer value1, Integer value2) {
			addCriterion("smart_oid between", value1, value2, "smartOid");
			return (Criteria) this;
		}

		public Criteria andSmartOidNotBetween(Integer value1, Integer value2) {
			addCriterion("smart_oid not between", value1, value2, "smartOid");
			return (Criteria) this;
		}

		public Criteria andTagOidIsNull() {
			addCriterion("tag_oid is null");
			return (Criteria) this;
		}

		public Criteria andTagOidIsNotNull() {
			addCriterion("tag_oid is not null");
			return (Criteria) this;
		}

		public Criteria andTagOidEqualTo(Integer value) {
			addCriterion("tag_oid =", value, "tagOid");
			return (Criteria) this;
		}

		public Criteria andTagOidNotEqualTo(Integer value) {
			addCriterion("tag_oid <>", value, "tagOid");
			return (Criteria) this;
		}

		public Criteria andTagOidGreaterThan(Integer value) {
			addCriterion("tag_oid >", value, "tagOid");
			return (Criteria) this;
		}

		public Criteria andTagOidGreaterThanOrEqualTo(Integer value) {
			addCriterion("tag_oid >=", value, "tagOid");
			return (Criteria) this;
		}

		public Criteria andTagOidLessThan(Integer value) {
			addCriterion("tag_oid <", value, "tagOid");
			return (Criteria) this;
		}

		public Criteria andTagOidLessThanOrEqualTo(Integer value) {
			addCriterion("tag_oid <=", value, "tagOid");
			return (Criteria) this;
		}

		public Criteria andTagOidIn(List<Integer> values) {
			addCriterion("tag_oid in", values, "tagOid");
			return (Criteria) this;
		}

		public Criteria andTagOidNotIn(List<Integer> values) {
			addCriterion("tag_oid not in", values, "tagOid");
			return (Criteria) this;
		}

		public Criteria andTagOidBetween(Integer value1, Integer value2) {
			addCriterion("tag_oid between", value1, value2, "tagOid");
			return (Criteria) this;
		}

		public Criteria andTagOidNotBetween(Integer value1, Integer value2) {
			addCriterion("tag_oid not between", value1, value2, "tagOid");
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