package com.edu.baiedu.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PbCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PbCommentExample() {
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

        public Criteria andCmuuidIsNull() {
            addCriterion("cmUUID is null");
            return (Criteria) this;
        }

        public Criteria andCmuuidIsNotNull() {
            addCriterion("cmUUID is not null");
            return (Criteria) this;
        }

        public Criteria andCmuuidEqualTo(String value) {
            addCriterion("cmUUID =", value, "cmuuid");
            return (Criteria) this;
        }

        public Criteria andCmuuidNotEqualTo(String value) {
            addCriterion("cmUUID <>", value, "cmuuid");
            return (Criteria) this;
        }

        public Criteria andCmuuidGreaterThan(String value) {
            addCriterion("cmUUID >", value, "cmuuid");
            return (Criteria) this;
        }

        public Criteria andCmuuidGreaterThanOrEqualTo(String value) {
            addCriterion("cmUUID >=", value, "cmuuid");
            return (Criteria) this;
        }

        public Criteria andCmuuidLessThan(String value) {
            addCriterion("cmUUID <", value, "cmuuid");
            return (Criteria) this;
        }

        public Criteria andCmuuidLessThanOrEqualTo(String value) {
            addCriterion("cmUUID <=", value, "cmuuid");
            return (Criteria) this;
        }

        public Criteria andCmuuidLike(String value) {
            addCriterion("cmUUID like", value, "cmuuid");
            return (Criteria) this;
        }

        public Criteria andCmuuidNotLike(String value) {
            addCriterion("cmUUID not like", value, "cmuuid");
            return (Criteria) this;
        }

        public Criteria andCmuuidIn(List<String> values) {
            addCriterion("cmUUID in", values, "cmuuid");
            return (Criteria) this;
        }

        public Criteria andCmuuidNotIn(List<String> values) {
            addCriterion("cmUUID not in", values, "cmuuid");
            return (Criteria) this;
        }

        public Criteria andCmuuidBetween(String value1, String value2) {
            addCriterion("cmUUID between", value1, value2, "cmuuid");
            return (Criteria) this;
        }

        public Criteria andCmuuidNotBetween(String value1, String value2) {
            addCriterion("cmUUID not between", value1, value2, "cmuuid");
            return (Criteria) this;
        }

        public Criteria andPostuuidIsNull() {
            addCriterion("postUUID is null");
            return (Criteria) this;
        }

        public Criteria andPostuuidIsNotNull() {
            addCriterion("postUUID is not null");
            return (Criteria) this;
        }

        public Criteria andPostuuidEqualTo(String value) {
            addCriterion("postUUID =", value, "postuuid");
            return (Criteria) this;
        }

        public Criteria andPostuuidNotEqualTo(String value) {
            addCriterion("postUUID <>", value, "postuuid");
            return (Criteria) this;
        }

        public Criteria andPostuuidGreaterThan(String value) {
            addCriterion("postUUID >", value, "postuuid");
            return (Criteria) this;
        }

        public Criteria andPostuuidGreaterThanOrEqualTo(String value) {
            addCriterion("postUUID >=", value, "postuuid");
            return (Criteria) this;
        }

        public Criteria andPostuuidLessThan(String value) {
            addCriterion("postUUID <", value, "postuuid");
            return (Criteria) this;
        }

        public Criteria andPostuuidLessThanOrEqualTo(String value) {
            addCriterion("postUUID <=", value, "postuuid");
            return (Criteria) this;
        }

        public Criteria andPostuuidLike(String value) {
            addCriterion("postUUID like", value, "postuuid");
            return (Criteria) this;
        }

        public Criteria andPostuuidNotLike(String value) {
            addCriterion("postUUID not like", value, "postuuid");
            return (Criteria) this;
        }

        public Criteria andPostuuidIn(List<String> values) {
            addCriterion("postUUID in", values, "postuuid");
            return (Criteria) this;
        }

        public Criteria andPostuuidNotIn(List<String> values) {
            addCriterion("postUUID not in", values, "postuuid");
            return (Criteria) this;
        }

        public Criteria andPostuuidBetween(String value1, String value2) {
            addCriterion("postUUID between", value1, value2, "postuuid");
            return (Criteria) this;
        }

        public Criteria andPostuuidNotBetween(String value1, String value2) {
            addCriterion("postUUID not between", value1, value2, "postuuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidIsNull() {
            addCriterion("userUUID is null");
            return (Criteria) this;
        }

        public Criteria andUseruuidIsNotNull() {
            addCriterion("userUUID is not null");
            return (Criteria) this;
        }

        public Criteria andUseruuidEqualTo(String value) {
            addCriterion("userUUID =", value, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidNotEqualTo(String value) {
            addCriterion("userUUID <>", value, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidGreaterThan(String value) {
            addCriterion("userUUID >", value, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidGreaterThanOrEqualTo(String value) {
            addCriterion("userUUID >=", value, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidLessThan(String value) {
            addCriterion("userUUID <", value, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidLessThanOrEqualTo(String value) {
            addCriterion("userUUID <=", value, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidLike(String value) {
            addCriterion("userUUID like", value, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidNotLike(String value) {
            addCriterion("userUUID not like", value, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidIn(List<String> values) {
            addCriterion("userUUID in", values, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidNotIn(List<String> values) {
            addCriterion("userUUID not in", values, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidBetween(String value1, String value2) {
            addCriterion("userUUID between", value1, value2, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidNotBetween(String value1, String value2) {
            addCriterion("userUUID not between", value1, value2, "useruuid");
            return (Criteria) this;
        }

        public Criteria andCmaudioIsNull() {
            addCriterion("cmAudio is null");
            return (Criteria) this;
        }

        public Criteria andCmaudioIsNotNull() {
            addCriterion("cmAudio is not null");
            return (Criteria) this;
        }

        public Criteria andCmaudioEqualTo(String value) {
            addCriterion("cmAudio =", value, "cmaudio");
            return (Criteria) this;
        }

        public Criteria andCmaudioNotEqualTo(String value) {
            addCriterion("cmAudio <>", value, "cmaudio");
            return (Criteria) this;
        }

        public Criteria andCmaudioGreaterThan(String value) {
            addCriterion("cmAudio >", value, "cmaudio");
            return (Criteria) this;
        }

        public Criteria andCmaudioGreaterThanOrEqualTo(String value) {
            addCriterion("cmAudio >=", value, "cmaudio");
            return (Criteria) this;
        }

        public Criteria andCmaudioLessThan(String value) {
            addCriterion("cmAudio <", value, "cmaudio");
            return (Criteria) this;
        }

        public Criteria andCmaudioLessThanOrEqualTo(String value) {
            addCriterion("cmAudio <=", value, "cmaudio");
            return (Criteria) this;
        }

        public Criteria andCmaudioLike(String value) {
            addCriterion("cmAudio like", value, "cmaudio");
            return (Criteria) this;
        }

        public Criteria andCmaudioNotLike(String value) {
            addCriterion("cmAudio not like", value, "cmaudio");
            return (Criteria) this;
        }

        public Criteria andCmaudioIn(List<String> values) {
            addCriterion("cmAudio in", values, "cmaudio");
            return (Criteria) this;
        }

        public Criteria andCmaudioNotIn(List<String> values) {
            addCriterion("cmAudio not in", values, "cmaudio");
            return (Criteria) this;
        }

        public Criteria andCmaudioBetween(String value1, String value2) {
            addCriterion("cmAudio between", value1, value2, "cmaudio");
            return (Criteria) this;
        }

        public Criteria andCmaudioNotBetween(String value1, String value2) {
            addCriterion("cmAudio not between", value1, value2, "cmaudio");
            return (Criteria) this;
        }

        public Criteria andCmtimeIsNull() {
            addCriterion("cmTime is null");
            return (Criteria) this;
        }

        public Criteria andCmtimeIsNotNull() {
            addCriterion("cmTime is not null");
            return (Criteria) this;
        }

        public Criteria andCmtimeEqualTo(Date value) {
            addCriterion("cmTime =", value, "cmtime");
            return (Criteria) this;
        }

        public Criteria andCmtimeNotEqualTo(Date value) {
            addCriterion("cmTime <>", value, "cmtime");
            return (Criteria) this;
        }

        public Criteria andCmtimeGreaterThan(Date value) {
            addCriterion("cmTime >", value, "cmtime");
            return (Criteria) this;
        }

        public Criteria andCmtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cmTime >=", value, "cmtime");
            return (Criteria) this;
        }

        public Criteria andCmtimeLessThan(Date value) {
            addCriterion("cmTime <", value, "cmtime");
            return (Criteria) this;
        }

        public Criteria andCmtimeLessThanOrEqualTo(Date value) {
            addCriterion("cmTime <=", value, "cmtime");
            return (Criteria) this;
        }

        public Criteria andCmtimeIn(List<Date> values) {
            addCriterion("cmTime in", values, "cmtime");
            return (Criteria) this;
        }

        public Criteria andCmtimeNotIn(List<Date> values) {
            addCriterion("cmTime not in", values, "cmtime");
            return (Criteria) this;
        }

        public Criteria andCmtimeBetween(Date value1, Date value2) {
            addCriterion("cmTime between", value1, value2, "cmtime");
            return (Criteria) this;
        }

        public Criteria andCmtimeNotBetween(Date value1, Date value2) {
            addCriterion("cmTime not between", value1, value2, "cmtime");
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