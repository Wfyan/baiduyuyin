package com.edu.baiedu.dao;

import java.util.ArrayList;
import java.util.List;

public class PbAudioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PbAudioExample() {
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

        public Criteria andAusetuuidIsNull() {
            addCriterion("auSetUUID is null");
            return (Criteria) this;
        }

        public Criteria andAusetuuidIsNotNull() {
            addCriterion("auSetUUID is not null");
            return (Criteria) this;
        }

        public Criteria andAusetuuidEqualTo(String value) {
            addCriterion("auSetUUID =", value, "ausetuuid");
            return (Criteria) this;
        }

        public Criteria andAusetuuidNotEqualTo(String value) {
            addCriterion("auSetUUID <>", value, "ausetuuid");
            return (Criteria) this;
        }

        public Criteria andAusetuuidGreaterThan(String value) {
            addCriterion("auSetUUID >", value, "ausetuuid");
            return (Criteria) this;
        }

        public Criteria andAusetuuidGreaterThanOrEqualTo(String value) {
            addCriterion("auSetUUID >=", value, "ausetuuid");
            return (Criteria) this;
        }

        public Criteria andAusetuuidLessThan(String value) {
            addCriterion("auSetUUID <", value, "ausetuuid");
            return (Criteria) this;
        }

        public Criteria andAusetuuidLessThanOrEqualTo(String value) {
            addCriterion("auSetUUID <=", value, "ausetuuid");
            return (Criteria) this;
        }

        public Criteria andAusetuuidLike(String value) {
            addCriterion("auSetUUID like", value, "ausetuuid");
            return (Criteria) this;
        }

        public Criteria andAusetuuidNotLike(String value) {
            addCriterion("auSetUUID not like", value, "ausetuuid");
            return (Criteria) this;
        }

        public Criteria andAusetuuidIn(List<String> values) {
            addCriterion("auSetUUID in", values, "ausetuuid");
            return (Criteria) this;
        }

        public Criteria andAusetuuidNotIn(List<String> values) {
            addCriterion("auSetUUID not in", values, "ausetuuid");
            return (Criteria) this;
        }

        public Criteria andAusetuuidBetween(String value1, String value2) {
            addCriterion("auSetUUID between", value1, value2, "ausetuuid");
            return (Criteria) this;
        }

        public Criteria andAusetuuidNotBetween(String value1, String value2) {
            addCriterion("auSetUUID not between", value1, value2, "ausetuuid");
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

        public Criteria andAusetspdIsNull() {
            addCriterion("auSetSpd is null");
            return (Criteria) this;
        }

        public Criteria andAusetspdIsNotNull() {
            addCriterion("auSetSpd is not null");
            return (Criteria) this;
        }

        public Criteria andAusetspdEqualTo(Integer value) {
            addCriterion("auSetSpd =", value, "ausetspd");
            return (Criteria) this;
        }

        public Criteria andAusetspdNotEqualTo(Integer value) {
            addCriterion("auSetSpd <>", value, "ausetspd");
            return (Criteria) this;
        }

        public Criteria andAusetspdGreaterThan(Integer value) {
            addCriterion("auSetSpd >", value, "ausetspd");
            return (Criteria) this;
        }

        public Criteria andAusetspdGreaterThanOrEqualTo(Integer value) {
            addCriterion("auSetSpd >=", value, "ausetspd");
            return (Criteria) this;
        }

        public Criteria andAusetspdLessThan(Integer value) {
            addCriterion("auSetSpd <", value, "ausetspd");
            return (Criteria) this;
        }

        public Criteria andAusetspdLessThanOrEqualTo(Integer value) {
            addCriterion("auSetSpd <=", value, "ausetspd");
            return (Criteria) this;
        }

        public Criteria andAusetspdIn(List<Integer> values) {
            addCriterion("auSetSpd in", values, "ausetspd");
            return (Criteria) this;
        }

        public Criteria andAusetspdNotIn(List<Integer> values) {
            addCriterion("auSetSpd not in", values, "ausetspd");
            return (Criteria) this;
        }

        public Criteria andAusetspdBetween(Integer value1, Integer value2) {
            addCriterion("auSetSpd between", value1, value2, "ausetspd");
            return (Criteria) this;
        }

        public Criteria andAusetspdNotBetween(Integer value1, Integer value2) {
            addCriterion("auSetSpd not between", value1, value2, "ausetspd");
            return (Criteria) this;
        }

        public Criteria andAusetpitIsNull() {
            addCriterion("auSetPit is null");
            return (Criteria) this;
        }

        public Criteria andAusetpitIsNotNull() {
            addCriterion("auSetPit is not null");
            return (Criteria) this;
        }

        public Criteria andAusetpitEqualTo(Integer value) {
            addCriterion("auSetPit =", value, "ausetpit");
            return (Criteria) this;
        }

        public Criteria andAusetpitNotEqualTo(Integer value) {
            addCriterion("auSetPit <>", value, "ausetpit");
            return (Criteria) this;
        }

        public Criteria andAusetpitGreaterThan(Integer value) {
            addCriterion("auSetPit >", value, "ausetpit");
            return (Criteria) this;
        }

        public Criteria andAusetpitGreaterThanOrEqualTo(Integer value) {
            addCriterion("auSetPit >=", value, "ausetpit");
            return (Criteria) this;
        }

        public Criteria andAusetpitLessThan(Integer value) {
            addCriterion("auSetPit <", value, "ausetpit");
            return (Criteria) this;
        }

        public Criteria andAusetpitLessThanOrEqualTo(Integer value) {
            addCriterion("auSetPit <=", value, "ausetpit");
            return (Criteria) this;
        }

        public Criteria andAusetpitIn(List<Integer> values) {
            addCriterion("auSetPit in", values, "ausetpit");
            return (Criteria) this;
        }

        public Criteria andAusetpitNotIn(List<Integer> values) {
            addCriterion("auSetPit not in", values, "ausetpit");
            return (Criteria) this;
        }

        public Criteria andAusetpitBetween(Integer value1, Integer value2) {
            addCriterion("auSetPit between", value1, value2, "ausetpit");
            return (Criteria) this;
        }

        public Criteria andAusetpitNotBetween(Integer value1, Integer value2) {
            addCriterion("auSetPit not between", value1, value2, "ausetpit");
            return (Criteria) this;
        }

        public Criteria andAusetvolIsNull() {
            addCriterion("auSetVol is null");
            return (Criteria) this;
        }

        public Criteria andAusetvolIsNotNull() {
            addCriterion("auSetVol is not null");
            return (Criteria) this;
        }

        public Criteria andAusetvolEqualTo(Integer value) {
            addCriterion("auSetVol =", value, "ausetvol");
            return (Criteria) this;
        }

        public Criteria andAusetvolNotEqualTo(Integer value) {
            addCriterion("auSetVol <>", value, "ausetvol");
            return (Criteria) this;
        }

        public Criteria andAusetvolGreaterThan(Integer value) {
            addCriterion("auSetVol >", value, "ausetvol");
            return (Criteria) this;
        }

        public Criteria andAusetvolGreaterThanOrEqualTo(Integer value) {
            addCriterion("auSetVol >=", value, "ausetvol");
            return (Criteria) this;
        }

        public Criteria andAusetvolLessThan(Integer value) {
            addCriterion("auSetVol <", value, "ausetvol");
            return (Criteria) this;
        }

        public Criteria andAusetvolLessThanOrEqualTo(Integer value) {
            addCriterion("auSetVol <=", value, "ausetvol");
            return (Criteria) this;
        }

        public Criteria andAusetvolIn(List<Integer> values) {
            addCriterion("auSetVol in", values, "ausetvol");
            return (Criteria) this;
        }

        public Criteria andAusetvolNotIn(List<Integer> values) {
            addCriterion("auSetVol not in", values, "ausetvol");
            return (Criteria) this;
        }

        public Criteria andAusetvolBetween(Integer value1, Integer value2) {
            addCriterion("auSetVol between", value1, value2, "ausetvol");
            return (Criteria) this;
        }

        public Criteria andAusetvolNotBetween(Integer value1, Integer value2) {
            addCriterion("auSetVol not between", value1, value2, "ausetvol");
            return (Criteria) this;
        }

        public Criteria andAusetvoiperIsNull() {
            addCriterion("auSetVoiPer is null");
            return (Criteria) this;
        }

        public Criteria andAusetvoiperIsNotNull() {
            addCriterion("auSetVoiPer is not null");
            return (Criteria) this;
        }

        public Criteria andAusetvoiperEqualTo(Integer value) {
            addCriterion("auSetVoiPer =", value, "ausetvoiper");
            return (Criteria) this;
        }

        public Criteria andAusetvoiperNotEqualTo(Integer value) {
            addCriterion("auSetVoiPer <>", value, "ausetvoiper");
            return (Criteria) this;
        }

        public Criteria andAusetvoiperGreaterThan(Integer value) {
            addCriterion("auSetVoiPer >", value, "ausetvoiper");
            return (Criteria) this;
        }

        public Criteria andAusetvoiperGreaterThanOrEqualTo(Integer value) {
            addCriterion("auSetVoiPer >=", value, "ausetvoiper");
            return (Criteria) this;
        }

        public Criteria andAusetvoiperLessThan(Integer value) {
            addCriterion("auSetVoiPer <", value, "ausetvoiper");
            return (Criteria) this;
        }

        public Criteria andAusetvoiperLessThanOrEqualTo(Integer value) {
            addCriterion("auSetVoiPer <=", value, "ausetvoiper");
            return (Criteria) this;
        }

        public Criteria andAusetvoiperIn(List<Integer> values) {
            addCriterion("auSetVoiPer in", values, "ausetvoiper");
            return (Criteria) this;
        }

        public Criteria andAusetvoiperNotIn(List<Integer> values) {
            addCriterion("auSetVoiPer not in", values, "ausetvoiper");
            return (Criteria) this;
        }

        public Criteria andAusetvoiperBetween(Integer value1, Integer value2) {
            addCriterion("auSetVoiPer between", value1, value2, "ausetvoiper");
            return (Criteria) this;
        }

        public Criteria andAusetvoiperNotBetween(Integer value1, Integer value2) {
            addCriterion("auSetVoiPer not between", value1, value2, "ausetvoiper");
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