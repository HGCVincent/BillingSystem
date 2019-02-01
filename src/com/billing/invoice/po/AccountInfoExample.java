package com.billing.invoice.po;

import java.util.ArrayList;
import java.util.List;

public class AccountInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountInfoExample() {
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

        public Criteria andAccountIdIsNull() {
            addCriterion("ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Long value) {
            addCriterion("ACCOUNT_ID =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Long value) {
            addCriterion("ACCOUNT_ID <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Long value) {
            addCriterion("ACCOUNT_ID >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCOUNT_ID >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Long value) {
            addCriterion("ACCOUNT_ID <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("ACCOUNT_ID <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Long> values) {
            addCriterion("ACCOUNT_ID in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Long> values) {
            addCriterion("ACCOUNT_ID not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Long value1, Long value2) {
            addCriterion("ACCOUNT_ID between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("ACCOUNT_ID not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("CUST_NAME =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("CUST_NAME <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("CUST_NAME >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NAME >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("CUST_NAME <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_NAME <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("CUST_NAME like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("CUST_NAME not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("CUST_NAME in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("CUST_NAME not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("CUST_NAME between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("CUST_NAME not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andTaxInvNameIsNull() {
            addCriterion("TAX_INV_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaxInvNameIsNotNull() {
            addCriterion("TAX_INV_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaxInvNameEqualTo(String value) {
            addCriterion("TAX_INV_NAME =", value, "taxInvName");
            return (Criteria) this;
        }

        public Criteria andTaxInvNameNotEqualTo(String value) {
            addCriterion("TAX_INV_NAME <>", value, "taxInvName");
            return (Criteria) this;
        }

        public Criteria andTaxInvNameGreaterThan(String value) {
            addCriterion("TAX_INV_NAME >", value, "taxInvName");
            return (Criteria) this;
        }

        public Criteria andTaxInvNameGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_INV_NAME >=", value, "taxInvName");
            return (Criteria) this;
        }

        public Criteria andTaxInvNameLessThan(String value) {
            addCriterion("TAX_INV_NAME <", value, "taxInvName");
            return (Criteria) this;
        }

        public Criteria andTaxInvNameLessThanOrEqualTo(String value) {
            addCriterion("TAX_INV_NAME <=", value, "taxInvName");
            return (Criteria) this;
        }

        public Criteria andTaxInvNameLike(String value) {
            addCriterion("TAX_INV_NAME like", value, "taxInvName");
            return (Criteria) this;
        }

        public Criteria andTaxInvNameNotLike(String value) {
            addCriterion("TAX_INV_NAME not like", value, "taxInvName");
            return (Criteria) this;
        }

        public Criteria andTaxInvNameIn(List<String> values) {
            addCriterion("TAX_INV_NAME in", values, "taxInvName");
            return (Criteria) this;
        }

        public Criteria andTaxInvNameNotIn(List<String> values) {
            addCriterion("TAX_INV_NAME not in", values, "taxInvName");
            return (Criteria) this;
        }

        public Criteria andTaxInvNameBetween(String value1, String value2) {
            addCriterion("TAX_INV_NAME between", value1, value2, "taxInvName");
            return (Criteria) this;
        }

        public Criteria andTaxInvNameNotBetween(String value1, String value2) {
            addCriterion("TAX_INV_NAME not between", value1, value2, "taxInvName");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("BANK_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("BANK_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("BANK_ACCOUNT =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("BANK_ACCOUNT >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("BANK_ACCOUNT <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("BANK_ACCOUNT like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("BANK_ACCOUNT not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("BANK_ACCOUNT in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("BANK_ACCOUNT not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNull() {
            addCriterion("ISDEFAULT is null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNotNull() {
            addCriterion("ISDEFAULT is not null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultEqualTo(String value) {
            addCriterion("ISDEFAULT =", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotEqualTo(String value) {
            addCriterion("ISDEFAULT <>", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThan(String value) {
            addCriterion("ISDEFAULT >", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThanOrEqualTo(String value) {
            addCriterion("ISDEFAULT >=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThan(String value) {
            addCriterion("ISDEFAULT <", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThanOrEqualTo(String value) {
            addCriterion("ISDEFAULT <=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLike(String value) {
            addCriterion("ISDEFAULT like", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotLike(String value) {
            addCriterion("ISDEFAULT not like", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIn(List<String> values) {
            addCriterion("ISDEFAULT in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotIn(List<String> values) {
            addCriterion("ISDEFAULT not in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultBetween(String value1, String value2) {
            addCriterion("ISDEFAULT between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotBetween(String value1, String value2) {
            addCriterion("ISDEFAULT not between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("CURRENCY =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("CURRENCY <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("CURRENCY >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("CURRENCY <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("CURRENCY like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("CURRENCY not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("CURRENCY in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("CURRENCY not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("CURRENCY between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("CURRENCY not between", value1, value2, "currency");
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