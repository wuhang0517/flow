package com.citic.sign.model;

import java.util.ArrayList;
import java.util.List;

public class SysPlatInchanRelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysPlatInchanRelExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andCMainRefIsNull() {
            addCriterion("C_MAIN_REF is null");
            return (Criteria) this;
        }

        public Criteria andCMainRefIsNotNull() {
            addCriterion("C_MAIN_REF is not null");
            return (Criteria) this;
        }

        public Criteria andCMainRefEqualTo(String value) {
            addCriterion("C_MAIN_REF =", value, "cMainRef");
            return (Criteria) this;
        }

        public Criteria andCMainRefNotEqualTo(String value) {
            addCriterion("C_MAIN_REF <>", value, "cMainRef");
            return (Criteria) this;
        }

        public Criteria andCMainRefGreaterThan(String value) {
            addCriterion("C_MAIN_REF >", value, "cMainRef");
            return (Criteria) this;
        }

        public Criteria andCMainRefGreaterThanOrEqualTo(String value) {
            addCriterion("C_MAIN_REF >=", value, "cMainRef");
            return (Criteria) this;
        }

        public Criteria andCMainRefLessThan(String value) {
            addCriterion("C_MAIN_REF <", value, "cMainRef");
            return (Criteria) this;
        }

        public Criteria andCMainRefLessThanOrEqualTo(String value) {
            addCriterion("C_MAIN_REF <=", value, "cMainRef");
            return (Criteria) this;
        }

        public Criteria andCMainRefLike(String value) {
            addCriterion("C_MAIN_REF like", value, "cMainRef");
            return (Criteria) this;
        }

        public Criteria andCMainRefNotLike(String value) {
            addCriterion("C_MAIN_REF not like", value, "cMainRef");
            return (Criteria) this;
        }

        public Criteria andCMainRefIn(List<String> values) {
            addCriterion("C_MAIN_REF in", values, "cMainRef");
            return (Criteria) this;
        }

        public Criteria andCMainRefNotIn(List<String> values) {
            addCriterion("C_MAIN_REF not in", values, "cMainRef");
            return (Criteria) this;
        }

        public Criteria andCMainRefBetween(String value1, String value2) {
            addCriterion("C_MAIN_REF between", value1, value2, "cMainRef");
            return (Criteria) this;
        }

        public Criteria andCMainRefNotBetween(String value1, String value2) {
            addCriterion("C_MAIN_REF not between", value1, value2, "cMainRef");
            return (Criteria) this;
        }

        public Criteria andCustAcNoIsNull() {
            addCriterion("CUST_AC_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustAcNoIsNotNull() {
            addCriterion("CUST_AC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustAcNoEqualTo(String value) {
            addCriterion("CUST_AC_NO =", value, "custAcNo");
            return (Criteria) this;
        }

        public Criteria andCustAcNoNotEqualTo(String value) {
            addCriterion("CUST_AC_NO <>", value, "custAcNo");
            return (Criteria) this;
        }

        public Criteria andCustAcNoGreaterThan(String value) {
            addCriterion("CUST_AC_NO >", value, "custAcNo");
            return (Criteria) this;
        }

        public Criteria andCustAcNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_AC_NO >=", value, "custAcNo");
            return (Criteria) this;
        }

        public Criteria andCustAcNoLessThan(String value) {
            addCriterion("CUST_AC_NO <", value, "custAcNo");
            return (Criteria) this;
        }

        public Criteria andCustAcNoLessThanOrEqualTo(String value) {
            addCriterion("CUST_AC_NO <=", value, "custAcNo");
            return (Criteria) this;
        }

        public Criteria andCustAcNoLike(String value) {
            addCriterion("CUST_AC_NO like", value, "custAcNo");
            return (Criteria) this;
        }

        public Criteria andCustAcNoNotLike(String value) {
            addCriterion("CUST_AC_NO not like", value, "custAcNo");
            return (Criteria) this;
        }

        public Criteria andCustAcNoIn(List<String> values) {
            addCriterion("CUST_AC_NO in", values, "custAcNo");
            return (Criteria) this;
        }

        public Criteria andCustAcNoNotIn(List<String> values) {
            addCriterion("CUST_AC_NO not in", values, "custAcNo");
            return (Criteria) this;
        }

        public Criteria andCustAcNoBetween(String value1, String value2) {
            addCriterion("CUST_AC_NO between", value1, value2, "custAcNo");
            return (Criteria) this;
        }

        public Criteria andCustAcNoNotBetween(String value1, String value2) {
            addCriterion("CUST_AC_NO not between", value1, value2, "custAcNo");
            return (Criteria) this;
        }

        public Criteria andChgCustAcCcyIsNull() {
            addCriterion("CHG_CUST_AC_CCY is null");
            return (Criteria) this;
        }

        public Criteria andChgCustAcCcyIsNotNull() {
            addCriterion("CHG_CUST_AC_CCY is not null");
            return (Criteria) this;
        }

        public Criteria andChgCustAcCcyEqualTo(String value) {
            addCriterion("CHG_CUST_AC_CCY =", value, "chgCustAcCcy");
            return (Criteria) this;
        }

        public Criteria andChgCustAcCcyNotEqualTo(String value) {
            addCriterion("CHG_CUST_AC_CCY <>", value, "chgCustAcCcy");
            return (Criteria) this;
        }

        public Criteria andChgCustAcCcyGreaterThan(String value) {
            addCriterion("CHG_CUST_AC_CCY >", value, "chgCustAcCcy");
            return (Criteria) this;
        }

        public Criteria andChgCustAcCcyGreaterThanOrEqualTo(String value) {
            addCriterion("CHG_CUST_AC_CCY >=", value, "chgCustAcCcy");
            return (Criteria) this;
        }

        public Criteria andChgCustAcCcyLessThan(String value) {
            addCriterion("CHG_CUST_AC_CCY <", value, "chgCustAcCcy");
            return (Criteria) this;
        }

        public Criteria andChgCustAcCcyLessThanOrEqualTo(String value) {
            addCriterion("CHG_CUST_AC_CCY <=", value, "chgCustAcCcy");
            return (Criteria) this;
        }

        public Criteria andChgCustAcCcyLike(String value) {
            addCriterion("CHG_CUST_AC_CCY like", value, "chgCustAcCcy");
            return (Criteria) this;
        }

        public Criteria andChgCustAcCcyNotLike(String value) {
            addCriterion("CHG_CUST_AC_CCY not like", value, "chgCustAcCcy");
            return (Criteria) this;
        }

        public Criteria andChgCustAcCcyIn(List<String> values) {
            addCriterion("CHG_CUST_AC_CCY in", values, "chgCustAcCcy");
            return (Criteria) this;
        }

        public Criteria andChgCustAcCcyNotIn(List<String> values) {
            addCriterion("CHG_CUST_AC_CCY not in", values, "chgCustAcCcy");
            return (Criteria) this;
        }

        public Criteria andChgCustAcCcyBetween(String value1, String value2) {
            addCriterion("CHG_CUST_AC_CCY between", value1, value2, "chgCustAcCcy");
            return (Criteria) this;
        }

        public Criteria andChgCustAcCcyNotBetween(String value1, String value2) {
            addCriterion("CHG_CUST_AC_CCY not between", value1, value2, "chgCustAcCcy");
            return (Criteria) this;
        }

        public Criteria andCustAcSubIsNull() {
            addCriterion("CUST_AC_SUB is null");
            return (Criteria) this;
        }

        public Criteria andCustAcSubIsNotNull() {
            addCriterion("CUST_AC_SUB is not null");
            return (Criteria) this;
        }

        public Criteria andCustAcSubEqualTo(String value) {
            addCriterion("CUST_AC_SUB =", value, "custAcSub");
            return (Criteria) this;
        }

        public Criteria andCustAcSubNotEqualTo(String value) {
            addCriterion("CUST_AC_SUB <>", value, "custAcSub");
            return (Criteria) this;
        }

        public Criteria andCustAcSubGreaterThan(String value) {
            addCriterion("CUST_AC_SUB >", value, "custAcSub");
            return (Criteria) this;
        }

        public Criteria andCustAcSubGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_AC_SUB >=", value, "custAcSub");
            return (Criteria) this;
        }

        public Criteria andCustAcSubLessThan(String value) {
            addCriterion("CUST_AC_SUB <", value, "custAcSub");
            return (Criteria) this;
        }

        public Criteria andCustAcSubLessThanOrEqualTo(String value) {
            addCriterion("CUST_AC_SUB <=", value, "custAcSub");
            return (Criteria) this;
        }

        public Criteria andCustAcSubLike(String value) {
            addCriterion("CUST_AC_SUB like", value, "custAcSub");
            return (Criteria) this;
        }

        public Criteria andCustAcSubNotLike(String value) {
            addCriterion("CUST_AC_SUB not like", value, "custAcSub");
            return (Criteria) this;
        }

        public Criteria andCustAcSubIn(List<String> values) {
            addCriterion("CUST_AC_SUB in", values, "custAcSub");
            return (Criteria) this;
        }

        public Criteria andCustAcSubNotIn(List<String> values) {
            addCriterion("CUST_AC_SUB not in", values, "custAcSub");
            return (Criteria) this;
        }

        public Criteria andCustAcSubBetween(String value1, String value2) {
            addCriterion("CUST_AC_SUB between", value1, value2, "custAcSub");
            return (Criteria) this;
        }

        public Criteria andCustAcSubNotBetween(String value1, String value2) {
            addCriterion("CUST_AC_SUB not between", value1, value2, "custAcSub");
            return (Criteria) this;
        }

        public Criteria andCancelAcctIsNull() {
            addCriterion("CANCEL_ACCT is null");
            return (Criteria) this;
        }

        public Criteria andCancelAcctIsNotNull() {
            addCriterion("CANCEL_ACCT is not null");
            return (Criteria) this;
        }

        public Criteria andCancelAcctEqualTo(String value) {
            addCriterion("CANCEL_ACCT =", value, "cancelAcct");
            return (Criteria) this;
        }

        public Criteria andCancelAcctNotEqualTo(String value) {
            addCriterion("CANCEL_ACCT <>", value, "cancelAcct");
            return (Criteria) this;
        }

        public Criteria andCancelAcctGreaterThan(String value) {
            addCriterion("CANCEL_ACCT >", value, "cancelAcct");
            return (Criteria) this;
        }

        public Criteria andCancelAcctGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_ACCT >=", value, "cancelAcct");
            return (Criteria) this;
        }

        public Criteria andCancelAcctLessThan(String value) {
            addCriterion("CANCEL_ACCT <", value, "cancelAcct");
            return (Criteria) this;
        }

        public Criteria andCancelAcctLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_ACCT <=", value, "cancelAcct");
            return (Criteria) this;
        }

        public Criteria andCancelAcctLike(String value) {
            addCriterion("CANCEL_ACCT like", value, "cancelAcct");
            return (Criteria) this;
        }

        public Criteria andCancelAcctNotLike(String value) {
            addCriterion("CANCEL_ACCT not like", value, "cancelAcct");
            return (Criteria) this;
        }

        public Criteria andCancelAcctIn(List<String> values) {
            addCriterion("CANCEL_ACCT in", values, "cancelAcct");
            return (Criteria) this;
        }

        public Criteria andCancelAcctNotIn(List<String> values) {
            addCriterion("CANCEL_ACCT not in", values, "cancelAcct");
            return (Criteria) this;
        }

        public Criteria andCancelAcctBetween(String value1, String value2) {
            addCriterion("CANCEL_ACCT between", value1, value2, "cancelAcct");
            return (Criteria) this;
        }

        public Criteria andCancelAcctNotBetween(String value1, String value2) {
            addCriterion("CANCEL_ACCT not between", value1, value2, "cancelAcct");
            return (Criteria) this;
        }

        public Criteria andChgCustAcTypeIsNull() {
            addCriterion("CHG_CUST_AC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andChgCustAcTypeIsNotNull() {
            addCriterion("CHG_CUST_AC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChgCustAcTypeEqualTo(String value) {
            addCriterion("CHG_CUST_AC_TYPE =", value, "chgCustAcType");
            return (Criteria) this;
        }

        public Criteria andChgCustAcTypeNotEqualTo(String value) {
            addCriterion("CHG_CUST_AC_TYPE <>", value, "chgCustAcType");
            return (Criteria) this;
        }

        public Criteria andChgCustAcTypeGreaterThan(String value) {
            addCriterion("CHG_CUST_AC_TYPE >", value, "chgCustAcType");
            return (Criteria) this;
        }

        public Criteria andChgCustAcTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHG_CUST_AC_TYPE >=", value, "chgCustAcType");
            return (Criteria) this;
        }

        public Criteria andChgCustAcTypeLessThan(String value) {
            addCriterion("CHG_CUST_AC_TYPE <", value, "chgCustAcType");
            return (Criteria) this;
        }

        public Criteria andChgCustAcTypeLessThanOrEqualTo(String value) {
            addCriterion("CHG_CUST_AC_TYPE <=", value, "chgCustAcType");
            return (Criteria) this;
        }

        public Criteria andChgCustAcTypeLike(String value) {
            addCriterion("CHG_CUST_AC_TYPE like", value, "chgCustAcType");
            return (Criteria) this;
        }

        public Criteria andChgCustAcTypeNotLike(String value) {
            addCriterion("CHG_CUST_AC_TYPE not like", value, "chgCustAcType");
            return (Criteria) this;
        }

        public Criteria andChgCustAcTypeIn(List<String> values) {
            addCriterion("CHG_CUST_AC_TYPE in", values, "chgCustAcType");
            return (Criteria) this;
        }

        public Criteria andChgCustAcTypeNotIn(List<String> values) {
            addCriterion("CHG_CUST_AC_TYPE not in", values, "chgCustAcType");
            return (Criteria) this;
        }

        public Criteria andChgCustAcTypeBetween(String value1, String value2) {
            addCriterion("CHG_CUST_AC_TYPE between", value1, value2, "chgCustAcType");
            return (Criteria) this;
        }

        public Criteria andChgCustAcTypeNotBetween(String value1, String value2) {
            addCriterion("CHG_CUST_AC_TYPE not between", value1, value2, "chgCustAcType");
            return (Criteria) this;
        }
    }

    /**
     */
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