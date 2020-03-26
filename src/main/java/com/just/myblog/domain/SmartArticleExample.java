package com.just.myblog.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SmartArticleExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public SmartArticleExample() {
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
			addCriterion("oid is null");
			return (Criteria) this;
		}

		public Criteria andOidIsNotNull() {
			addCriterion("oid is not null");
			return (Criteria) this;
		}

		public Criteria andOidEqualTo(Integer value) {
			addCriterion("oid =", value, "oid");
			return (Criteria) this;
		}

		public Criteria andOidNotEqualTo(Integer value) {
			addCriterion("oid <>", value, "oid");
			return (Criteria) this;
		}

		public Criteria andOidGreaterThan(Integer value) {
			addCriterion("oid >", value, "oid");
			return (Criteria) this;
		}

		public Criteria andOidGreaterThanOrEqualTo(Integer value) {
			addCriterion("oid >=", value, "oid");
			return (Criteria) this;
		}

		public Criteria andOidLessThan(Integer value) {
			addCriterion("oid <", value, "oid");
			return (Criteria) this;
		}

		public Criteria andOidLessThanOrEqualTo(Integer value) {
			addCriterion("oid <=", value, "oid");
			return (Criteria) this;
		}

		public Criteria andOidIn(List<Integer> values) {
			addCriterion("oid in", values, "oid");
			return (Criteria) this;
		}

		public Criteria andOidNotIn(List<Integer> values) {
			addCriterion("oid not in", values, "oid");
			return (Criteria) this;
		}

		public Criteria andOidBetween(Integer value1, Integer value2) {
			addCriterion("oid between", value1, value2, "oid");
			return (Criteria) this;
		}

		public Criteria andOidNotBetween(Integer value1, Integer value2) {
			addCriterion("oid not between", value1, value2, "oid");
			return (Criteria) this;
		}

		public Criteria andArticleidIsNull() {
			addCriterion("articleId is null");
			return (Criteria) this;
		}

		public Criteria andArticleidIsNotNull() {
			addCriterion("articleId is not null");
			return (Criteria) this;
		}

		public Criteria andArticleidEqualTo(String value) {
			addCriterion("articleId =", value, "articleid");
			return (Criteria) this;
		}

		public Criteria andArticleidNotEqualTo(String value) {
			addCriterion("articleId <>", value, "articleid");
			return (Criteria) this;
		}

		public Criteria andArticleidGreaterThan(String value) {
			addCriterion("articleId >", value, "articleid");
			return (Criteria) this;
		}

		public Criteria andArticleidGreaterThanOrEqualTo(String value) {
			addCriterion("articleId >=", value, "articleid");
			return (Criteria) this;
		}

		public Criteria andArticleidLessThan(String value) {
			addCriterion("articleId <", value, "articleid");
			return (Criteria) this;
		}

		public Criteria andArticleidLessThanOrEqualTo(String value) {
			addCriterion("articleId <=", value, "articleid");
			return (Criteria) this;
		}

		public Criteria andArticleidLike(String value) {
			addCriterion("articleId like", value, "articleid");
			return (Criteria) this;
		}

		public Criteria andArticleidNotLike(String value) {
			addCriterion("articleId not like", value, "articleid");
			return (Criteria) this;
		}

		public Criteria andArticleidIn(List<String> values) {
			addCriterion("articleId in", values, "articleid");
			return (Criteria) this;
		}

		public Criteria andArticleidNotIn(List<String> values) {
			addCriterion("articleId not in", values, "articleid");
			return (Criteria) this;
		}

		public Criteria andArticleidBetween(String value1, String value2) {
			addCriterion("articleId between", value1, value2, "articleid");
			return (Criteria) this;
		}

		public Criteria andArticleidNotBetween(String value1, String value2) {
			addCriterion("articleId not between", value1, value2, "articleid");
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

		public Criteria andArticlerandomdoubleIsNull() {
			addCriterion("articleRandomDouble is null");
			return (Criteria) this;
		}

		public Criteria andArticlerandomdoubleIsNotNull() {
			addCriterion("articleRandomDouble is not null");
			return (Criteria) this;
		}

		public Criteria andArticlerandomdoubleEqualTo(Integer value) {
			addCriterion("articleRandomDouble =", value, "articlerandomdouble");
			return (Criteria) this;
		}

		public Criteria andArticlerandomdoubleNotEqualTo(Integer value) {
			addCriterion("articleRandomDouble <>", value, "articlerandomdouble");
			return (Criteria) this;
		}

		public Criteria andArticlerandomdoubleGreaterThan(Integer value) {
			addCriterion("articleRandomDouble >", value, "articlerandomdouble");
			return (Criteria) this;
		}

		public Criteria andArticlerandomdoubleGreaterThanOrEqualTo(Integer value) {
			addCriterion("articleRandomDouble >=", value, "articlerandomdouble");
			return (Criteria) this;
		}

		public Criteria andArticlerandomdoubleLessThan(Integer value) {
			addCriterion("articleRandomDouble <", value, "articlerandomdouble");
			return (Criteria) this;
		}

		public Criteria andArticlerandomdoubleLessThanOrEqualTo(Integer value) {
			addCriterion("articleRandomDouble <=", value, "articlerandomdouble");
			return (Criteria) this;
		}

		public Criteria andArticlerandomdoubleIn(List<Integer> values) {
			addCriterion("articleRandomDouble in", values, "articlerandomdouble");
			return (Criteria) this;
		}

		public Criteria andArticlerandomdoubleNotIn(List<Integer> values) {
			addCriterion("articleRandomDouble not in", values, "articlerandomdouble");
			return (Criteria) this;
		}

		public Criteria andArticlerandomdoubleBetween(Integer value1, Integer value2) {
			addCriterion("articleRandomDouble between", value1, value2, "articlerandomdouble");
			return (Criteria) this;
		}

		public Criteria andArticlerandomdoubleNotBetween(Integer value1, Integer value2) {
			addCriterion("articleRandomDouble not between", value1, value2, "articlerandomdouble");
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