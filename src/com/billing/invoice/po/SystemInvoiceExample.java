package com.billing.invoice.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemInvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemInvoiceExample() {
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

        public Criteria andInvIdIsNull() {
            addCriterion("INV_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvIdIsNotNull() {
            addCriterion("INV_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvIdEqualTo(String value) {
            addCriterion("INV_ID =", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdNotEqualTo(String value) {
            addCriterion("INV_ID <>", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdGreaterThan(String value) {
            addCriterion("INV_ID >", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdGreaterThanOrEqualTo(String value) {
            addCriterion("INV_ID >=", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdLessThan(String value) {
            addCriterion("INV_ID <", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdLessThanOrEqualTo(String value) {
            addCriterion("INV_ID <=", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdLike(String value) {
            addCriterion("INV_ID like", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdNotLike(String value) {
            addCriterion("INV_ID not like", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdIn(List<String> values) {
            addCriterion("INV_ID in", values, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdNotIn(List<String> values) {
            addCriterion("INV_ID not in", values, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdBetween(String value1, String value2) {
            addCriterion("INV_ID between", value1, value2, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdNotBetween(String value1, String value2) {
            addCriterion("INV_ID not between", value1, value2, "invId");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("CUST_ID like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("CUST_ID not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthIsNull() {
            addCriterion("CURRENT_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthIsNotNull() {
            addCriterion("CURRENT_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthEqualTo(String value) {
            addCriterion("CURRENT_MONTH =", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthNotEqualTo(String value) {
            addCriterion("CURRENT_MONTH <>", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthGreaterThan(String value) {
            addCriterion("CURRENT_MONTH >", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_MONTH >=", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthLessThan(String value) {
            addCriterion("CURRENT_MONTH <", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_MONTH <=", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthLike(String value) {
            addCriterion("CURRENT_MONTH like", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthNotLike(String value) {
            addCriterion("CURRENT_MONTH not like", value, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthIn(List<String> values) {
            addCriterion("CURRENT_MONTH in", values, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthNotIn(List<String> values) {
            addCriterion("CURRENT_MONTH not in", values, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthBetween(String value1, String value2) {
            addCriterion("CURRENT_MONTH between", value1, value2, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthNotBetween(String value1, String value2) {
            addCriterion("CURRENT_MONTH not between", value1, value2, "currentMonth");
            return (Criteria) this;
        }

        public Criteria andInvVersionIsNull() {
            addCriterion("INV_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andInvVersionIsNotNull() {
            addCriterion("INV_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andInvVersionEqualTo(Short value) {
            addCriterion("INV_VERSION =", value, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionNotEqualTo(Short value) {
            addCriterion("INV_VERSION <>", value, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionGreaterThan(Short value) {
            addCriterion("INV_VERSION >", value, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionGreaterThanOrEqualTo(Short value) {
            addCriterion("INV_VERSION >=", value, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionLessThan(Short value) {
            addCriterion("INV_VERSION <", value, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionLessThanOrEqualTo(Short value) {
            addCriterion("INV_VERSION <=", value, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionIn(List<Short> values) {
            addCriterion("INV_VERSION in", values, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionNotIn(List<Short> values) {
            addCriterion("INV_VERSION not in", values, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionBetween(Short value1, Short value2) {
            addCriterion("INV_VERSION between", value1, value2, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionNotBetween(Short value1, Short value2) {
            addCriterion("INV_VERSION not between", value1, value2, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvRefNoIsNull() {
            addCriterion("INV_REF_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvRefNoIsNotNull() {
            addCriterion("INV_REF_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvRefNoEqualTo(String value) {
            addCriterion("INV_REF_NO =", value, "invRefNo");
            return (Criteria) this;
        }

        public Criteria andInvRefNoNotEqualTo(String value) {
            addCriterion("INV_REF_NO <>", value, "invRefNo");
            return (Criteria) this;
        }

        public Criteria andInvRefNoGreaterThan(String value) {
            addCriterion("INV_REF_NO >", value, "invRefNo");
            return (Criteria) this;
        }

        public Criteria andInvRefNoGreaterThanOrEqualTo(String value) {
            addCriterion("INV_REF_NO >=", value, "invRefNo");
            return (Criteria) this;
        }

        public Criteria andInvRefNoLessThan(String value) {
            addCriterion("INV_REF_NO <", value, "invRefNo");
            return (Criteria) this;
        }

        public Criteria andInvRefNoLessThanOrEqualTo(String value) {
            addCriterion("INV_REF_NO <=", value, "invRefNo");
            return (Criteria) this;
        }

        public Criteria andInvRefNoLike(String value) {
            addCriterion("INV_REF_NO like", value, "invRefNo");
            return (Criteria) this;
        }

        public Criteria andInvRefNoNotLike(String value) {
            addCriterion("INV_REF_NO not like", value, "invRefNo");
            return (Criteria) this;
        }

        public Criteria andInvRefNoIn(List<String> values) {
            addCriterion("INV_REF_NO in", values, "invRefNo");
            return (Criteria) this;
        }

        public Criteria andInvRefNoNotIn(List<String> values) {
            addCriterion("INV_REF_NO not in", values, "invRefNo");
            return (Criteria) this;
        }

        public Criteria andInvRefNoBetween(String value1, String value2) {
            addCriterion("INV_REF_NO between", value1, value2, "invRefNo");
            return (Criteria) this;
        }

        public Criteria andInvRefNoNotBetween(String value1, String value2) {
            addCriterion("INV_REF_NO not between", value1, value2, "invRefNo");
            return (Criteria) this;
        }

        public Criteria andBillCompIsNull() {
            addCriterion("BILL_COMP is null");
            return (Criteria) this;
        }

        public Criteria andBillCompIsNotNull() {
            addCriterion("BILL_COMP is not null");
            return (Criteria) this;
        }

        public Criteria andBillCompEqualTo(String value) {
            addCriterion("BILL_COMP =", value, "billComp");
            return (Criteria) this;
        }

        public Criteria andBillCompNotEqualTo(String value) {
            addCriterion("BILL_COMP <>", value, "billComp");
            return (Criteria) this;
        }

        public Criteria andBillCompGreaterThan(String value) {
            addCriterion("BILL_COMP >", value, "billComp");
            return (Criteria) this;
        }

        public Criteria andBillCompGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_COMP >=", value, "billComp");
            return (Criteria) this;
        }

        public Criteria andBillCompLessThan(String value) {
            addCriterion("BILL_COMP <", value, "billComp");
            return (Criteria) this;
        }

        public Criteria andBillCompLessThanOrEqualTo(String value) {
            addCriterion("BILL_COMP <=", value, "billComp");
            return (Criteria) this;
        }

        public Criteria andBillCompLike(String value) {
            addCriterion("BILL_COMP like", value, "billComp");
            return (Criteria) this;
        }

        public Criteria andBillCompNotLike(String value) {
            addCriterion("BILL_COMP not like", value, "billComp");
            return (Criteria) this;
        }

        public Criteria andBillCompIn(List<String> values) {
            addCriterion("BILL_COMP in", values, "billComp");
            return (Criteria) this;
        }

        public Criteria andBillCompNotIn(List<String> values) {
            addCriterion("BILL_COMP not in", values, "billComp");
            return (Criteria) this;
        }

        public Criteria andBillCompBetween(String value1, String value2) {
            addCriterion("BILL_COMP between", value1, value2, "billComp");
            return (Criteria) this;
        }

        public Criteria andBillCompNotBetween(String value1, String value2) {
            addCriterion("BILL_COMP not between", value1, value2, "billComp");
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

        public Criteria andInvStatusIsNull() {
            addCriterion("INV_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andInvStatusIsNotNull() {
            addCriterion("INV_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andInvStatusEqualTo(String value) {
            addCriterion("INV_STATUS =", value, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusNotEqualTo(String value) {
            addCriterion("INV_STATUS <>", value, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusGreaterThan(String value) {
            addCriterion("INV_STATUS >", value, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusGreaterThanOrEqualTo(String value) {
            addCriterion("INV_STATUS >=", value, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusLessThan(String value) {
            addCriterion("INV_STATUS <", value, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusLessThanOrEqualTo(String value) {
            addCriterion("INV_STATUS <=", value, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusLike(String value) {
            addCriterion("INV_STATUS like", value, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusNotLike(String value) {
            addCriterion("INV_STATUS not like", value, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusIn(List<String> values) {
            addCriterion("INV_STATUS in", values, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusNotIn(List<String> values) {
            addCriterion("INV_STATUS not in", values, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusBetween(String value1, String value2) {
            addCriterion("INV_STATUS between", value1, value2, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusNotBetween(String value1, String value2) {
            addCriterion("INV_STATUS not between", value1, value2, "invStatus");
            return (Criteria) this;
        }

        public Criteria andModifyByIsNull() {
            addCriterion("MODIFY_BY is null");
            return (Criteria) this;
        }

        public Criteria andModifyByIsNotNull() {
            addCriterion("MODIFY_BY is not null");
            return (Criteria) this;
        }

        public Criteria andModifyByEqualTo(String value) {
            addCriterion("MODIFY_BY =", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotEqualTo(String value) {
            addCriterion("MODIFY_BY <>", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByGreaterThan(String value) {
            addCriterion("MODIFY_BY >", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_BY >=", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLessThan(String value) {
            addCriterion("MODIFY_BY <", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_BY <=", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLike(String value) {
            addCriterion("MODIFY_BY like", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotLike(String value) {
            addCriterion("MODIFY_BY not like", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByIn(List<String> values) {
            addCriterion("MODIFY_BY in", values, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotIn(List<String> values) {
            addCriterion("MODIFY_BY not in", values, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByBetween(String value1, String value2) {
            addCriterion("MODIFY_BY between", value1, value2, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotBetween(String value1, String value2) {
            addCriterion("MODIFY_BY not between", value1, value2, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyDtIsNull() {
            addCriterion("MODIFY_DT is null");
            return (Criteria) this;
        }

        public Criteria andModifyDtIsNotNull() {
            addCriterion("MODIFY_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDtEqualTo(Date value) {
            addCriterion("MODIFY_DT =", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtNotEqualTo(Date value) {
            addCriterion("MODIFY_DT <>", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtGreaterThan(Date value) {
            addCriterion("MODIFY_DT >", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DT >=", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtLessThan(Date value) {
            addCriterion("MODIFY_DT <", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DT <=", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtIn(List<Date> values) {
            addCriterion("MODIFY_DT in", values, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtNotIn(List<Date> values) {
            addCriterion("MODIFY_DT not in", values, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DT between", value1, value2, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DT not between", value1, value2, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andSeqIdIsNull() {
            addCriterion("SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeqIdIsNotNull() {
            addCriterion("SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeqIdEqualTo(BigDecimal value) {
            addCriterion("SEQ_ID =", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotEqualTo(BigDecimal value) {
            addCriterion("SEQ_ID <>", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThan(BigDecimal value) {
            addCriterion("SEQ_ID >", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQ_ID >=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThan(BigDecimal value) {
            addCriterion("SEQ_ID <", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQ_ID <=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdIn(List<BigDecimal> values) {
            addCriterion("SEQ_ID in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotIn(List<BigDecimal> values) {
            addCriterion("SEQ_ID not in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQ_ID between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQ_ID not between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andIsLatestVerIsNull() {
            addCriterion("IS_LATEST_VER is null");
            return (Criteria) this;
        }

        public Criteria andIsLatestVerIsNotNull() {
            addCriterion("IS_LATEST_VER is not null");
            return (Criteria) this;
        }

        public Criteria andIsLatestVerEqualTo(String value) {
            addCriterion("IS_LATEST_VER =", value, "isLatestVer");
            return (Criteria) this;
        }

        public Criteria andIsLatestVerNotEqualTo(String value) {
            addCriterion("IS_LATEST_VER <>", value, "isLatestVer");
            return (Criteria) this;
        }

        public Criteria andIsLatestVerGreaterThan(String value) {
            addCriterion("IS_LATEST_VER >", value, "isLatestVer");
            return (Criteria) this;
        }

        public Criteria andIsLatestVerGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LATEST_VER >=", value, "isLatestVer");
            return (Criteria) this;
        }

        public Criteria andIsLatestVerLessThan(String value) {
            addCriterion("IS_LATEST_VER <", value, "isLatestVer");
            return (Criteria) this;
        }

        public Criteria andIsLatestVerLessThanOrEqualTo(String value) {
            addCriterion("IS_LATEST_VER <=", value, "isLatestVer");
            return (Criteria) this;
        }

        public Criteria andIsLatestVerLike(String value) {
            addCriterion("IS_LATEST_VER like", value, "isLatestVer");
            return (Criteria) this;
        }

        public Criteria andIsLatestVerNotLike(String value) {
            addCriterion("IS_LATEST_VER not like", value, "isLatestVer");
            return (Criteria) this;
        }

        public Criteria andIsLatestVerIn(List<String> values) {
            addCriterion("IS_LATEST_VER in", values, "isLatestVer");
            return (Criteria) this;
        }

        public Criteria andIsLatestVerNotIn(List<String> values) {
            addCriterion("IS_LATEST_VER not in", values, "isLatestVer");
            return (Criteria) this;
        }

        public Criteria andIsLatestVerBetween(String value1, String value2) {
            addCriterion("IS_LATEST_VER between", value1, value2, "isLatestVer");
            return (Criteria) this;
        }

        public Criteria andIsLatestVerNotBetween(String value1, String value2) {
            addCriterion("IS_LATEST_VER not between", value1, value2, "isLatestVer");
            return (Criteria) this;
        }

        public Criteria andInvSendOutDtIsNull() {
            addCriterion("INV_SEND_OUT_DT is null");
            return (Criteria) this;
        }

        public Criteria andInvSendOutDtIsNotNull() {
            addCriterion("INV_SEND_OUT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andInvSendOutDtEqualTo(Date value) {
            addCriterion("INV_SEND_OUT_DT =", value, "invSendOutDt");
            return (Criteria) this;
        }

        public Criteria andInvSendOutDtNotEqualTo(Date value) {
            addCriterion("INV_SEND_OUT_DT <>", value, "invSendOutDt");
            return (Criteria) this;
        }

        public Criteria andInvSendOutDtGreaterThan(Date value) {
            addCriterion("INV_SEND_OUT_DT >", value, "invSendOutDt");
            return (Criteria) this;
        }

        public Criteria andInvSendOutDtGreaterThanOrEqualTo(Date value) {
            addCriterion("INV_SEND_OUT_DT >=", value, "invSendOutDt");
            return (Criteria) this;
        }

        public Criteria andInvSendOutDtLessThan(Date value) {
            addCriterion("INV_SEND_OUT_DT <", value, "invSendOutDt");
            return (Criteria) this;
        }

        public Criteria andInvSendOutDtLessThanOrEqualTo(Date value) {
            addCriterion("INV_SEND_OUT_DT <=", value, "invSendOutDt");
            return (Criteria) this;
        }

        public Criteria andInvSendOutDtIn(List<Date> values) {
            addCriterion("INV_SEND_OUT_DT in", values, "invSendOutDt");
            return (Criteria) this;
        }

        public Criteria andInvSendOutDtNotIn(List<Date> values) {
            addCriterion("INV_SEND_OUT_DT not in", values, "invSendOutDt");
            return (Criteria) this;
        }

        public Criteria andInvSendOutDtBetween(Date value1, Date value2) {
            addCriterion("INV_SEND_OUT_DT between", value1, value2, "invSendOutDt");
            return (Criteria) this;
        }

        public Criteria andInvSendOutDtNotBetween(Date value1, Date value2) {
            addCriterion("INV_SEND_OUT_DT not between", value1, value2, "invSendOutDt");
            return (Criteria) this;
        }

        public Criteria andInvDueDtIsNull() {
            addCriterion("INV_DUE_DT is null");
            return (Criteria) this;
        }

        public Criteria andInvDueDtIsNotNull() {
            addCriterion("INV_DUE_DT is not null");
            return (Criteria) this;
        }

        public Criteria andInvDueDtEqualTo(Date value) {
            addCriterion("INV_DUE_DT =", value, "invDueDt");
            return (Criteria) this;
        }

        public Criteria andInvDueDtNotEqualTo(Date value) {
            addCriterion("INV_DUE_DT <>", value, "invDueDt");
            return (Criteria) this;
        }

        public Criteria andInvDueDtGreaterThan(Date value) {
            addCriterion("INV_DUE_DT >", value, "invDueDt");
            return (Criteria) this;
        }

        public Criteria andInvDueDtGreaterThanOrEqualTo(Date value) {
            addCriterion("INV_DUE_DT >=", value, "invDueDt");
            return (Criteria) this;
        }

        public Criteria andInvDueDtLessThan(Date value) {
            addCriterion("INV_DUE_DT <", value, "invDueDt");
            return (Criteria) this;
        }

        public Criteria andInvDueDtLessThanOrEqualTo(Date value) {
            addCriterion("INV_DUE_DT <=", value, "invDueDt");
            return (Criteria) this;
        }

        public Criteria andInvDueDtIn(List<Date> values) {
            addCriterion("INV_DUE_DT in", values, "invDueDt");
            return (Criteria) this;
        }

        public Criteria andInvDueDtNotIn(List<Date> values) {
            addCriterion("INV_DUE_DT not in", values, "invDueDt");
            return (Criteria) this;
        }

        public Criteria andInvDueDtBetween(Date value1, Date value2) {
            addCriterion("INV_DUE_DT between", value1, value2, "invDueDt");
            return (Criteria) this;
        }

        public Criteria andInvDueDtNotBetween(Date value1, Date value2) {
            addCriterion("INV_DUE_DT not between", value1, value2, "invDueDt");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameIsNull() {
            addCriterion("ATTACHMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameIsNotNull() {
            addCriterion("ATTACHMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameEqualTo(String value) {
            addCriterion("ATTACHMENT_NAME =", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotEqualTo(String value) {
            addCriterion("ATTACHMENT_NAME <>", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameGreaterThan(String value) {
            addCriterion("ATTACHMENT_NAME >", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACHMENT_NAME >=", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameLessThan(String value) {
            addCriterion("ATTACHMENT_NAME <", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameLessThanOrEqualTo(String value) {
            addCriterion("ATTACHMENT_NAME <=", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameLike(String value) {
            addCriterion("ATTACHMENT_NAME like", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotLike(String value) {
            addCriterion("ATTACHMENT_NAME not like", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameIn(List<String> values) {
            addCriterion("ATTACHMENT_NAME in", values, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotIn(List<String> values) {
            addCriterion("ATTACHMENT_NAME not in", values, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameBetween(String value1, String value2) {
            addCriterion("ATTACHMENT_NAME between", value1, value2, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotBetween(String value1, String value2) {
            addCriterion("ATTACHMENT_NAME not between", value1, value2, "attachmentName");
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