package com.billing.invoice.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoiceItemDescExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvoiceItemDescExample() {
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

        public Criteria andInvDescIdIsNull() {
            addCriterion("INV_DESC_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvDescIdIsNotNull() {
            addCriterion("INV_DESC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvDescIdEqualTo(BigDecimal value) {
            addCriterion("INV_DESC_ID =", value, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvDescIdNotEqualTo(BigDecimal value) {
            addCriterion("INV_DESC_ID <>", value, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvDescIdGreaterThan(BigDecimal value) {
            addCriterion("INV_DESC_ID >", value, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvDescIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INV_DESC_ID >=", value, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvDescIdLessThan(BigDecimal value) {
            addCriterion("INV_DESC_ID <", value, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvDescIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INV_DESC_ID <=", value, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvDescIdIn(List<BigDecimal> values) {
            addCriterion("INV_DESC_ID in", values, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvDescIdNotIn(List<BigDecimal> values) {
            addCriterion("INV_DESC_ID not in", values, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvDescIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INV_DESC_ID between", value1, value2, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvDescIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INV_DESC_ID not between", value1, value2, "invDescId");
            return (Criteria) this;
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

        public Criteria andInvVersionIsNull() {
            addCriterion("INV_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andInvVersionIsNotNull() {
            addCriterion("INV_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andInvVersionEqualTo(BigDecimal value) {
            addCriterion("INV_VERSION =", value, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionNotEqualTo(BigDecimal value) {
            addCriterion("INV_VERSION <>", value, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionGreaterThan(BigDecimal value) {
            addCriterion("INV_VERSION >", value, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INV_VERSION >=", value, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionLessThan(BigDecimal value) {
            addCriterion("INV_VERSION <", value, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INV_VERSION <=", value, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionIn(List<BigDecimal> values) {
            addCriterion("INV_VERSION in", values, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionNotIn(List<BigDecimal> values) {
            addCriterion("INV_VERSION not in", values, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INV_VERSION between", value1, value2, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INV_VERSION not between", value1, value2, "invVersion");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNull() {
            addCriterion("ITEM_DESC is null");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNotNull() {
            addCriterion("ITEM_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescEqualTo(String value) {
            addCriterion("ITEM_DESC =", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotEqualTo(String value) {
            addCriterion("ITEM_DESC <>", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThan(String value) {
            addCriterion("ITEM_DESC >", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_DESC >=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThan(String value) {
            addCriterion("ITEM_DESC <", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThanOrEqualTo(String value) {
            addCriterion("ITEM_DESC <=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLike(String value) {
            addCriterion("ITEM_DESC like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotLike(String value) {
            addCriterion("ITEM_DESC not like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescIn(List<String> values) {
            addCriterion("ITEM_DESC in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotIn(List<String> values) {
            addCriterion("ITEM_DESC not in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescBetween(String value1, String value2) {
            addCriterion("ITEM_DESC between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotBetween(String value1, String value2) {
            addCriterion("ITEM_DESC not between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andActualEndDtIsNull() {
            addCriterion("ACTUAL_END_DT is null");
            return (Criteria) this;
        }

        public Criteria andActualEndDtIsNotNull() {
            addCriterion("ACTUAL_END_DT is not null");
            return (Criteria) this;
        }

        public Criteria andActualEndDtEqualTo(Date value) {
            addCriterion("ACTUAL_END_DT =", value, "actualEndDt");
            return (Criteria) this;
        }

        public Criteria andActualEndDtNotEqualTo(Date value) {
            addCriterion("ACTUAL_END_DT <>", value, "actualEndDt");
            return (Criteria) this;
        }

        public Criteria andActualEndDtGreaterThan(Date value) {
            addCriterion("ACTUAL_END_DT >", value, "actualEndDt");
            return (Criteria) this;
        }

        public Criteria andActualEndDtGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTUAL_END_DT >=", value, "actualEndDt");
            return (Criteria) this;
        }

        public Criteria andActualEndDtLessThan(Date value) {
            addCriterion("ACTUAL_END_DT <", value, "actualEndDt");
            return (Criteria) this;
        }

        public Criteria andActualEndDtLessThanOrEqualTo(Date value) {
            addCriterion("ACTUAL_END_DT <=", value, "actualEndDt");
            return (Criteria) this;
        }

        public Criteria andActualEndDtIn(List<Date> values) {
            addCriterion("ACTUAL_END_DT in", values, "actualEndDt");
            return (Criteria) this;
        }

        public Criteria andActualEndDtNotIn(List<Date> values) {
            addCriterion("ACTUAL_END_DT not in", values, "actualEndDt");
            return (Criteria) this;
        }

        public Criteria andActualEndDtBetween(Date value1, Date value2) {
            addCriterion("ACTUAL_END_DT between", value1, value2, "actualEndDt");
            return (Criteria) this;
        }

        public Criteria andActualEndDtNotBetween(Date value1, Date value2) {
            addCriterion("ACTUAL_END_DT not between", value1, value2, "actualEndDt");
            return (Criteria) this;
        }

        public Criteria andActualStartDtIsNull() {
            addCriterion("ACTUAL_START_DT is null");
            return (Criteria) this;
        }

        public Criteria andActualStartDtIsNotNull() {
            addCriterion("ACTUAL_START_DT is not null");
            return (Criteria) this;
        }

        public Criteria andActualStartDtEqualTo(Date value) {
            addCriterion("ACTUAL_START_DT =", value, "actualStartDt");
            return (Criteria) this;
        }

        public Criteria andActualStartDtNotEqualTo(Date value) {
            addCriterion("ACTUAL_START_DT <>", value, "actualStartDt");
            return (Criteria) this;
        }

        public Criteria andActualStartDtGreaterThan(Date value) {
            addCriterion("ACTUAL_START_DT >", value, "actualStartDt");
            return (Criteria) this;
        }

        public Criteria andActualStartDtGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTUAL_START_DT >=", value, "actualStartDt");
            return (Criteria) this;
        }

        public Criteria andActualStartDtLessThan(Date value) {
            addCriterion("ACTUAL_START_DT <", value, "actualStartDt");
            return (Criteria) this;
        }

        public Criteria andActualStartDtLessThanOrEqualTo(Date value) {
            addCriterion("ACTUAL_START_DT <=", value, "actualStartDt");
            return (Criteria) this;
        }

        public Criteria andActualStartDtIn(List<Date> values) {
            addCriterion("ACTUAL_START_DT in", values, "actualStartDt");
            return (Criteria) this;
        }

        public Criteria andActualStartDtNotIn(List<Date> values) {
            addCriterion("ACTUAL_START_DT not in", values, "actualStartDt");
            return (Criteria) this;
        }

        public Criteria andActualStartDtBetween(Date value1, Date value2) {
            addCriterion("ACTUAL_START_DT between", value1, value2, "actualStartDt");
            return (Criteria) this;
        }

        public Criteria andActualStartDtNotBetween(Date value1, Date value2) {
            addCriterion("ACTUAL_START_DT not between", value1, value2, "actualStartDt");
            return (Criteria) this;
        }

        public Criteria andAmtIsNull() {
            addCriterion("AMT is null");
            return (Criteria) this;
        }

        public Criteria andAmtIsNotNull() {
            addCriterion("AMT is not null");
            return (Criteria) this;
        }

        public Criteria andAmtEqualTo(Integer value) {
            addCriterion("AMT =", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotEqualTo(Integer value) {
            addCriterion("AMT <>", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtGreaterThan(Integer value) {
            addCriterion("AMT >", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("AMT >=", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtLessThan(Integer value) {
            addCriterion("AMT <", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtLessThanOrEqualTo(Integer value) {
            addCriterion("AMT <=", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtIn(List<Integer> values) {
            addCriterion("AMT in", values, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotIn(List<Integer> values) {
            addCriterion("AMT not in", values, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtBetween(Integer value1, Integer value2) {
            addCriterion("AMT between", value1, value2, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("AMT not between", value1, value2, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtCsIsNull() {
            addCriterion("AMT_CS is null");
            return (Criteria) this;
        }

        public Criteria andAmtCsIsNotNull() {
            addCriterion("AMT_CS is not null");
            return (Criteria) this;
        }

        public Criteria andAmtCsEqualTo(Integer value) {
            addCriterion("AMT_CS =", value, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtCsNotEqualTo(Integer value) {
            addCriterion("AMT_CS <>", value, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtCsGreaterThan(Integer value) {
            addCriterion("AMT_CS >", value, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtCsGreaterThanOrEqualTo(Integer value) {
            addCriterion("AMT_CS >=", value, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtCsLessThan(Integer value) {
            addCriterion("AMT_CS <", value, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtCsLessThanOrEqualTo(Integer value) {
            addCriterion("AMT_CS <=", value, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtCsIn(List<Integer> values) {
            addCriterion("AMT_CS in", values, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtCsNotIn(List<Integer> values) {
            addCriterion("AMT_CS not in", values, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtCsBetween(Integer value1, Integer value2) {
            addCriterion("AMT_CS between", value1, value2, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtCsNotBetween(Integer value1, Integer value2) {
            addCriterion("AMT_CS not between", value1, value2, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtUsdIsNull() {
            addCriterion("AMT_USD is null");
            return (Criteria) this;
        }

        public Criteria andAmtUsdIsNotNull() {
            addCriterion("AMT_USD is not null");
            return (Criteria) this;
        }

        public Criteria andAmtUsdEqualTo(Integer value) {
            addCriterion("AMT_USD =", value, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtUsdNotEqualTo(Integer value) {
            addCriterion("AMT_USD <>", value, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtUsdGreaterThan(Integer value) {
            addCriterion("AMT_USD >", value, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtUsdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AMT_USD >=", value, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtUsdLessThan(Integer value) {
            addCriterion("AMT_USD <", value, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtUsdLessThanOrEqualTo(Integer value) {
            addCriterion("AMT_USD <=", value, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtUsdIn(List<Integer> values) {
            addCriterion("AMT_USD in", values, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtUsdNotIn(List<Integer> values) {
            addCriterion("AMT_USD not in", values, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtUsdBetween(Integer value1, Integer value2) {
            addCriterion("AMT_USD between", value1, value2, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtUsdNotBetween(Integer value1, Integer value2) {
            addCriterion("AMT_USD not between", value1, value2, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtVdcIsNull() {
            addCriterion("AMT_VDC is null");
            return (Criteria) this;
        }

        public Criteria andAmtVdcIsNotNull() {
            addCriterion("AMT_VDC is not null");
            return (Criteria) this;
        }

        public Criteria andAmtVdcEqualTo(Integer value) {
            addCriterion("AMT_VDC =", value, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVdcNotEqualTo(Integer value) {
            addCriterion("AMT_VDC <>", value, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVdcGreaterThan(Integer value) {
            addCriterion("AMT_VDC >", value, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVdcGreaterThanOrEqualTo(Integer value) {
            addCriterion("AMT_VDC >=", value, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVdcLessThan(Integer value) {
            addCriterion("AMT_VDC <", value, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVdcLessThanOrEqualTo(Integer value) {
            addCriterion("AMT_VDC <=", value, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVdcIn(List<Integer> values) {
            addCriterion("AMT_VDC in", values, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVdcNotIn(List<Integer> values) {
            addCriterion("AMT_VDC not in", values, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVdcBetween(Integer value1, Integer value2) {
            addCriterion("AMT_VDC between", value1, value2, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVdcNotBetween(Integer value1, Integer value2) {
            addCriterion("AMT_VDC not between", value1, value2, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVerifyFlagIsNull() {
            addCriterion("AMT_VERIFY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAmtVerifyFlagIsNotNull() {
            addCriterion("AMT_VERIFY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAmtVerifyFlagEqualTo(String value) {
            addCriterion("AMT_VERIFY_FLAG =", value, "amtVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andAmtVerifyFlagNotEqualTo(String value) {
            addCriterion("AMT_VERIFY_FLAG <>", value, "amtVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andAmtVerifyFlagGreaterThan(String value) {
            addCriterion("AMT_VERIFY_FLAG >", value, "amtVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andAmtVerifyFlagGreaterThanOrEqualTo(String value) {
            addCriterion("AMT_VERIFY_FLAG >=", value, "amtVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andAmtVerifyFlagLessThan(String value) {
            addCriterion("AMT_VERIFY_FLAG <", value, "amtVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andAmtVerifyFlagLessThanOrEqualTo(String value) {
            addCriterion("AMT_VERIFY_FLAG <=", value, "amtVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andAmtVerifyFlagLike(String value) {
            addCriterion("AMT_VERIFY_FLAG like", value, "amtVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andAmtVerifyFlagNotLike(String value) {
            addCriterion("AMT_VERIFY_FLAG not like", value, "amtVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andAmtVerifyFlagIn(List<String> values) {
            addCriterion("AMT_VERIFY_FLAG in", values, "amtVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andAmtVerifyFlagNotIn(List<String> values) {
            addCriterion("AMT_VERIFY_FLAG not in", values, "amtVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andAmtVerifyFlagBetween(String value1, String value2) {
            addCriterion("AMT_VERIFY_FLAG between", value1, value2, "amtVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andAmtVerifyFlagNotBetween(String value1, String value2) {
            addCriterion("AMT_VERIFY_FLAG not between", value1, value2, "amtVerifyFlag");
            return (Criteria) this;
        }

        public Criteria andBillPeriodFromIsNull() {
            addCriterion("BILL_PERIOD_FROM is null");
            return (Criteria) this;
        }

        public Criteria andBillPeriodFromIsNotNull() {
            addCriterion("BILL_PERIOD_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andBillPeriodFromEqualTo(String value) {
            addCriterion("BILL_PERIOD_FROM =", value, "billPeriodFrom");
            return (Criteria) this;
        }

        public Criteria andBillPeriodFromNotEqualTo(String value) {
            addCriterion("BILL_PERIOD_FROM <>", value, "billPeriodFrom");
            return (Criteria) this;
        }

        public Criteria andBillPeriodFromGreaterThan(String value) {
            addCriterion("BILL_PERIOD_FROM >", value, "billPeriodFrom");
            return (Criteria) this;
        }

        public Criteria andBillPeriodFromGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_PERIOD_FROM >=", value, "billPeriodFrom");
            return (Criteria) this;
        }

        public Criteria andBillPeriodFromLessThan(String value) {
            addCriterion("BILL_PERIOD_FROM <", value, "billPeriodFrom");
            return (Criteria) this;
        }

        public Criteria andBillPeriodFromLessThanOrEqualTo(String value) {
            addCriterion("BILL_PERIOD_FROM <=", value, "billPeriodFrom");
            return (Criteria) this;
        }

        public Criteria andBillPeriodFromLike(String value) {
            addCriterion("BILL_PERIOD_FROM like", value, "billPeriodFrom");
            return (Criteria) this;
        }

        public Criteria andBillPeriodFromNotLike(String value) {
            addCriterion("BILL_PERIOD_FROM not like", value, "billPeriodFrom");
            return (Criteria) this;
        }

        public Criteria andBillPeriodFromIn(List<String> values) {
            addCriterion("BILL_PERIOD_FROM in", values, "billPeriodFrom");
            return (Criteria) this;
        }

        public Criteria andBillPeriodFromNotIn(List<String> values) {
            addCriterion("BILL_PERIOD_FROM not in", values, "billPeriodFrom");
            return (Criteria) this;
        }

        public Criteria andBillPeriodFromBetween(String value1, String value2) {
            addCriterion("BILL_PERIOD_FROM between", value1, value2, "billPeriodFrom");
            return (Criteria) this;
        }

        public Criteria andBillPeriodFromNotBetween(String value1, String value2) {
            addCriterion("BILL_PERIOD_FROM not between", value1, value2, "billPeriodFrom");
            return (Criteria) this;
        }

        public Criteria andBillPeriodToIsNull() {
            addCriterion("BILL_PERIOD_TO is null");
            return (Criteria) this;
        }

        public Criteria andBillPeriodToIsNotNull() {
            addCriterion("BILL_PERIOD_TO is not null");
            return (Criteria) this;
        }

        public Criteria andBillPeriodToEqualTo(String value) {
            addCriterion("BILL_PERIOD_TO =", value, "billPeriodTo");
            return (Criteria) this;
        }

        public Criteria andBillPeriodToNotEqualTo(String value) {
            addCriterion("BILL_PERIOD_TO <>", value, "billPeriodTo");
            return (Criteria) this;
        }

        public Criteria andBillPeriodToGreaterThan(String value) {
            addCriterion("BILL_PERIOD_TO >", value, "billPeriodTo");
            return (Criteria) this;
        }

        public Criteria andBillPeriodToGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_PERIOD_TO >=", value, "billPeriodTo");
            return (Criteria) this;
        }

        public Criteria andBillPeriodToLessThan(String value) {
            addCriterion("BILL_PERIOD_TO <", value, "billPeriodTo");
            return (Criteria) this;
        }

        public Criteria andBillPeriodToLessThanOrEqualTo(String value) {
            addCriterion("BILL_PERIOD_TO <=", value, "billPeriodTo");
            return (Criteria) this;
        }

        public Criteria andBillPeriodToLike(String value) {
            addCriterion("BILL_PERIOD_TO like", value, "billPeriodTo");
            return (Criteria) this;
        }

        public Criteria andBillPeriodToNotLike(String value) {
            addCriterion("BILL_PERIOD_TO not like", value, "billPeriodTo");
            return (Criteria) this;
        }

        public Criteria andBillPeriodToIn(List<String> values) {
            addCriterion("BILL_PERIOD_TO in", values, "billPeriodTo");
            return (Criteria) this;
        }

        public Criteria andBillPeriodToNotIn(List<String> values) {
            addCriterion("BILL_PERIOD_TO not in", values, "billPeriodTo");
            return (Criteria) this;
        }

        public Criteria andBillPeriodToBetween(String value1, String value2) {
            addCriterion("BILL_PERIOD_TO between", value1, value2, "billPeriodTo");
            return (Criteria) this;
        }

        public Criteria andBillPeriodToNotBetween(String value1, String value2) {
            addCriterion("BILL_PERIOD_TO not between", value1, value2, "billPeriodTo");
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

        public Criteria andPaymentItemCodeIsNull() {
            addCriterion("PAYMENT_ITEM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentItemCodeIsNotNull() {
            addCriterion("PAYMENT_ITEM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentItemCodeEqualTo(String value) {
            addCriterion("PAYMENT_ITEM_CODE =", value, "paymentItemCode");
            return (Criteria) this;
        }

        public Criteria andPaymentItemCodeNotEqualTo(String value) {
            addCriterion("PAYMENT_ITEM_CODE <>", value, "paymentItemCode");
            return (Criteria) this;
        }

        public Criteria andPaymentItemCodeGreaterThan(String value) {
            addCriterion("PAYMENT_ITEM_CODE >", value, "paymentItemCode");
            return (Criteria) this;
        }

        public Criteria andPaymentItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_ITEM_CODE >=", value, "paymentItemCode");
            return (Criteria) this;
        }

        public Criteria andPaymentItemCodeLessThan(String value) {
            addCriterion("PAYMENT_ITEM_CODE <", value, "paymentItemCode");
            return (Criteria) this;
        }

        public Criteria andPaymentItemCodeLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_ITEM_CODE <=", value, "paymentItemCode");
            return (Criteria) this;
        }

        public Criteria andPaymentItemCodeLike(String value) {
            addCriterion("PAYMENT_ITEM_CODE like", value, "paymentItemCode");
            return (Criteria) this;
        }

        public Criteria andPaymentItemCodeNotLike(String value) {
            addCriterion("PAYMENT_ITEM_CODE not like", value, "paymentItemCode");
            return (Criteria) this;
        }

        public Criteria andPaymentItemCodeIn(List<String> values) {
            addCriterion("PAYMENT_ITEM_CODE in", values, "paymentItemCode");
            return (Criteria) this;
        }

        public Criteria andPaymentItemCodeNotIn(List<String> values) {
            addCriterion("PAYMENT_ITEM_CODE not in", values, "paymentItemCode");
            return (Criteria) this;
        }

        public Criteria andPaymentItemCodeBetween(String value1, String value2) {
            addCriterion("PAYMENT_ITEM_CODE between", value1, value2, "paymentItemCode");
            return (Criteria) this;
        }

        public Criteria andPaymentItemCodeNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_ITEM_CODE not between", value1, value2, "paymentItemCode");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
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