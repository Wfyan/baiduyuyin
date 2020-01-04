package com.edu.baiedu.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PbRegisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PbRegisterExample() {
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

        public Criteria andReguuidIsNull() {
            addCriterion("regUUID is null");
            return (Criteria) this;
        }

        public Criteria andReguuidIsNotNull() {
            addCriterion("regUUID is not null");
            return (Criteria) this;
        }

        public Criteria andReguuidEqualTo(String value) {
            addCriterion("regUUID =", value, "reguuid");
            return (Criteria) this;
        }

        public Criteria andReguuidNotEqualTo(String value) {
            addCriterion("regUUID <>", value, "reguuid");
            return (Criteria) this;
        }

        public Criteria andReguuidGreaterThan(String value) {
            addCriterion("regUUID >", value, "reguuid");
            return (Criteria) this;
        }

        public Criteria andReguuidGreaterThanOrEqualTo(String value) {
            addCriterion("regUUID >=", value, "reguuid");
            return (Criteria) this;
        }

        public Criteria andReguuidLessThan(String value) {
            addCriterion("regUUID <", value, "reguuid");
            return (Criteria) this;
        }

        public Criteria andReguuidLessThanOrEqualTo(String value) {
            addCriterion("regUUID <=", value, "reguuid");
            return (Criteria) this;
        }

        public Criteria andReguuidLike(String value) {
            addCriterion("regUUID like", value, "reguuid");
            return (Criteria) this;
        }

        public Criteria andReguuidNotLike(String value) {
            addCriterion("regUUID not like", value, "reguuid");
            return (Criteria) this;
        }

        public Criteria andReguuidIn(List<String> values) {
            addCriterion("regUUID in", values, "reguuid");
            return (Criteria) this;
        }

        public Criteria andReguuidNotIn(List<String> values) {
            addCriterion("regUUID not in", values, "reguuid");
            return (Criteria) this;
        }

        public Criteria andReguuidBetween(String value1, String value2) {
            addCriterion("regUUID between", value1, value2, "reguuid");
            return (Criteria) this;
        }

        public Criteria andReguuidNotBetween(String value1, String value2) {
            addCriterion("regUUID not between", value1, value2, "reguuid");
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

        public Criteria andRegsexIsNull() {
            addCriterion("regSex is null");
            return (Criteria) this;
        }

        public Criteria andRegsexIsNotNull() {
            addCriterion("regSex is not null");
            return (Criteria) this;
        }

        public Criteria andRegsexEqualTo(String value) {
            addCriterion("regSex =", value, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexNotEqualTo(String value) {
            addCriterion("regSex <>", value, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexGreaterThan(String value) {
            addCriterion("regSex >", value, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexGreaterThanOrEqualTo(String value) {
            addCriterion("regSex >=", value, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexLessThan(String value) {
            addCriterion("regSex <", value, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexLessThanOrEqualTo(String value) {
            addCriterion("regSex <=", value, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexLike(String value) {
            addCriterion("regSex like", value, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexNotLike(String value) {
            addCriterion("regSex not like", value, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexIn(List<String> values) {
            addCriterion("regSex in", values, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexNotIn(List<String> values) {
            addCriterion("regSex not in", values, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexBetween(String value1, String value2) {
            addCriterion("regSex between", value1, value2, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexNotBetween(String value1, String value2) {
            addCriterion("regSex not between", value1, value2, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegageIsNull() {
            addCriterion("regAge is null");
            return (Criteria) this;
        }

        public Criteria andRegageIsNotNull() {
            addCriterion("regAge is not null");
            return (Criteria) this;
        }

        public Criteria andRegageEqualTo(Integer value) {
            addCriterion("regAge =", value, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageNotEqualTo(Integer value) {
            addCriterion("regAge <>", value, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageGreaterThan(Integer value) {
            addCriterion("regAge >", value, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageGreaterThanOrEqualTo(Integer value) {
            addCriterion("regAge >=", value, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageLessThan(Integer value) {
            addCriterion("regAge <", value, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageLessThanOrEqualTo(Integer value) {
            addCriterion("regAge <=", value, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageIn(List<Integer> values) {
            addCriterion("regAge in", values, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageNotIn(List<Integer> values) {
            addCriterion("regAge not in", values, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageBetween(Integer value1, Integer value2) {
            addCriterion("regAge between", value1, value2, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageNotBetween(Integer value1, Integer value2) {
            addCriterion("regAge not between", value1, value2, "regage");
            return (Criteria) this;
        }

        public Criteria andRegemialIsNull() {
            addCriterion("regEmial is null");
            return (Criteria) this;
        }

        public Criteria andRegemialIsNotNull() {
            addCriterion("regEmial is not null");
            return (Criteria) this;
        }

        public Criteria andRegemialEqualTo(String value) {
            addCriterion("regEmial =", value, "regemial");
            return (Criteria) this;
        }

        public Criteria andRegemialNotEqualTo(String value) {
            addCriterion("regEmial <>", value, "regemial");
            return (Criteria) this;
        }

        public Criteria andRegemialGreaterThan(String value) {
            addCriterion("regEmial >", value, "regemial");
            return (Criteria) this;
        }

        public Criteria andRegemialGreaterThanOrEqualTo(String value) {
            addCriterion("regEmial >=", value, "regemial");
            return (Criteria) this;
        }

        public Criteria andRegemialLessThan(String value) {
            addCriterion("regEmial <", value, "regemial");
            return (Criteria) this;
        }

        public Criteria andRegemialLessThanOrEqualTo(String value) {
            addCriterion("regEmial <=", value, "regemial");
            return (Criteria) this;
        }

        public Criteria andRegemialLike(String value) {
            addCriterion("regEmial like", value, "regemial");
            return (Criteria) this;
        }

        public Criteria andRegemialNotLike(String value) {
            addCriterion("regEmial not like", value, "regemial");
            return (Criteria) this;
        }

        public Criteria andRegemialIn(List<String> values) {
            addCriterion("regEmial in", values, "regemial");
            return (Criteria) this;
        }

        public Criteria andRegemialNotIn(List<String> values) {
            addCriterion("regEmial not in", values, "regemial");
            return (Criteria) this;
        }

        public Criteria andRegemialBetween(String value1, String value2) {
            addCriterion("regEmial between", value1, value2, "regemial");
            return (Criteria) this;
        }

        public Criteria andRegemialNotBetween(String value1, String value2) {
            addCriterion("regEmial not between", value1, value2, "regemial");
            return (Criteria) this;
        }

        public Criteria andRegphotoIsNull() {
            addCriterion("regPhoto is null");
            return (Criteria) this;
        }

        public Criteria andRegphotoIsNotNull() {
            addCriterion("regPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andRegphotoEqualTo(String value) {
            addCriterion("regPhoto =", value, "regphoto");
            return (Criteria) this;
        }

        public Criteria andRegphotoNotEqualTo(String value) {
            addCriterion("regPhoto <>", value, "regphoto");
            return (Criteria) this;
        }

        public Criteria andRegphotoGreaterThan(String value) {
            addCriterion("regPhoto >", value, "regphoto");
            return (Criteria) this;
        }

        public Criteria andRegphotoGreaterThanOrEqualTo(String value) {
            addCriterion("regPhoto >=", value, "regphoto");
            return (Criteria) this;
        }

        public Criteria andRegphotoLessThan(String value) {
            addCriterion("regPhoto <", value, "regphoto");
            return (Criteria) this;
        }

        public Criteria andRegphotoLessThanOrEqualTo(String value) {
            addCriterion("regPhoto <=", value, "regphoto");
            return (Criteria) this;
        }

        public Criteria andRegphotoLike(String value) {
            addCriterion("regPhoto like", value, "regphoto");
            return (Criteria) this;
        }

        public Criteria andRegphotoNotLike(String value) {
            addCriterion("regPhoto not like", value, "regphoto");
            return (Criteria) this;
        }

        public Criteria andRegphotoIn(List<String> values) {
            addCriterion("regPhoto in", values, "regphoto");
            return (Criteria) this;
        }

        public Criteria andRegphotoNotIn(List<String> values) {
            addCriterion("regPhoto not in", values, "regphoto");
            return (Criteria) this;
        }

        public Criteria andRegphotoBetween(String value1, String value2) {
            addCriterion("regPhoto between", value1, value2, "regphoto");
            return (Criteria) this;
        }

        public Criteria andRegphotoNotBetween(String value1, String value2) {
            addCriterion("regPhoto not between", value1, value2, "regphoto");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNull() {
            addCriterion("regTime is null");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNotNull() {
            addCriterion("regTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegtimeEqualTo(Date value) {
            addCriterion("regTime =", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotEqualTo(Date value) {
            addCriterion("regTime <>", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThan(Date value) {
            addCriterion("regTime >", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("regTime >=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThan(Date value) {
            addCriterion("regTime <", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("regTime <=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeIn(List<Date> values) {
            addCriterion("regTime in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotIn(List<Date> values) {
            addCriterion("regTime not in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeBetween(Date value1, Date value2) {
            addCriterion("regTime between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("regTime not between", value1, value2, "regtime");
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