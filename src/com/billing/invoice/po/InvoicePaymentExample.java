package com.billing.invoice.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoicePaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvoicePaymentExample() {
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

        public Criteria andPaymentSeqIsNull() {
            addCriterion("PAYMENT_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andPaymentSeqIsNotNull() {
            addCriterion("PAYMENT_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentSeqEqualTo(Integer value) {
            addCriterion("PAYMENT_SEQ =", value, "paymentSeq");
            return (Criteria) this;
        }

        public Criteria andPaymentSeqNotEqualTo(Integer value) {
            addCriterion("PAYMENT_SEQ <>", value, "paymentSeq");
            return (Criteria) this;
        }

        public Criteria andPaymentSeqGreaterThan(Integer value) {
            addCriterion("PAYMENT_SEQ >", value, "paymentSeq");
            return (Criteria) this;
        }

        public Criteria andPaymentSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_SEQ >=", value, "paymentSeq");
            return (Criteria) this;
        }

        public Criteria andPaymentSeqLessThan(Integer value) {
            addCriterion("PAYMENT_SEQ <", value, "paymentSeq");
            return (Criteria) this;
        }

        public Criteria andPaymentSeqLessThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_SEQ <=", value, "paymentSeq");
            return (Criteria) this;
        }

        public Criteria andPaymentSeqIn(List<Integer> values) {
            addCriterion("PAYMENT_SEQ in", values, "paymentSeq");
            return (Criteria) this;
        }

        public Criteria andPaymentSeqNotIn(List<Integer> values) {
            addCriterion("PAYMENT_SEQ not in", values, "paymentSeq");
            return (Criteria) this;
        }

        public Criteria andPaymentSeqBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_SEQ between", value1, value2, "paymentSeq");
            return (Criteria) this;
        }

        public Criteria andPaymentSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_SEQ not between", value1, value2, "paymentSeq");
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

        public Criteria andPaymentAmtIsNull() {
            addCriterion("PAYMENT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmtIsNotNull() {
            addCriterion("PAYMENT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmtEqualTo(Float value) {
            addCriterion("PAYMENT_AMT =", value, "paymentAmt");
            return (Criteria) this;
        }

        public Criteria andPaymentAmtNotEqualTo(Float value) {
            addCriterion("PAYMENT_AMT <>", value, "paymentAmt");
            return (Criteria) this;
        }

        public Criteria andPaymentAmtGreaterThan(Float value) {
            addCriterion("PAYMENT_AMT >", value, "paymentAmt");
            return (Criteria) this;
        }

        public Criteria andPaymentAmtGreaterThanOrEqualTo(Float value) {
            addCriterion("PAYMENT_AMT >=", value, "paymentAmt");
            return (Criteria) this;
        }

        public Criteria andPaymentAmtLessThan(Float value) {
            addCriterion("PAYMENT_AMT <", value, "paymentAmt");
            return (Criteria) this;
        }

        public Criteria andPaymentAmtLessThanOrEqualTo(Float value) {
            addCriterion("PAYMENT_AMT <=", value, "paymentAmt");
            return (Criteria) this;
        }

        public Criteria andPaymentAmtIn(List<Float> values) {
            addCriterion("PAYMENT_AMT in", values, "paymentAmt");
            return (Criteria) this;
        }

        public Criteria andPaymentAmtNotIn(List<Float> values) {
            addCriterion("PAYMENT_AMT not in", values, "paymentAmt");
            return (Criteria) this;
        }

        public Criteria andPaymentAmtBetween(Float value1, Float value2) {
            addCriterion("PAYMENT_AMT between", value1, value2, "paymentAmt");
            return (Criteria) this;
        }

        public Criteria andPaymentAmtNotBetween(Float value1, Float value2) {
            addCriterion("PAYMENT_AMT not between", value1, value2, "paymentAmt");
            return (Criteria) this;
        }

        public Criteria andPaymentCurrencyIsNull() {
            addCriterion("PAYMENT_CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCurrencyIsNotNull() {
            addCriterion("PAYMENT_CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCurrencyEqualTo(String value) {
            addCriterion("PAYMENT_CURRENCY =", value, "paymentCurrency");
            return (Criteria) this;
        }

        public Criteria andPaymentCurrencyNotEqualTo(String value) {
            addCriterion("PAYMENT_CURRENCY <>", value, "paymentCurrency");
            return (Criteria) this;
        }

        public Criteria andPaymentCurrencyGreaterThan(String value) {
            addCriterion("PAYMENT_CURRENCY >", value, "paymentCurrency");
            return (Criteria) this;
        }

        public Criteria andPaymentCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_CURRENCY >=", value, "paymentCurrency");
            return (Criteria) this;
        }

        public Criteria andPaymentCurrencyLessThan(String value) {
            addCriterion("PAYMENT_CURRENCY <", value, "paymentCurrency");
            return (Criteria) this;
        }

        public Criteria andPaymentCurrencyLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_CURRENCY <=", value, "paymentCurrency");
            return (Criteria) this;
        }

        public Criteria andPaymentCurrencyLike(String value) {
            addCriterion("PAYMENT_CURRENCY like", value, "paymentCurrency");
            return (Criteria) this;
        }

        public Criteria andPaymentCurrencyNotLike(String value) {
            addCriterion("PAYMENT_CURRENCY not like", value, "paymentCurrency");
            return (Criteria) this;
        }

        public Criteria andPaymentCurrencyIn(List<String> values) {
            addCriterion("PAYMENT_CURRENCY in", values, "paymentCurrency");
            return (Criteria) this;
        }

        public Criteria andPaymentCurrencyNotIn(List<String> values) {
            addCriterion("PAYMENT_CURRENCY not in", values, "paymentCurrency");
            return (Criteria) this;
        }

        public Criteria andPaymentCurrencyBetween(String value1, String value2) {
            addCriterion("PAYMENT_CURRENCY between", value1, value2, "paymentCurrency");
            return (Criteria) this;
        }

        public Criteria andPaymentCurrencyNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_CURRENCY not between", value1, value2, "paymentCurrency");
            return (Criteria) this;
        }

        public Criteria andDateOfSettlementIsNull() {
            addCriterion("DATE_OF_SETTLEMENT is null");
            return (Criteria) this;
        }

        public Criteria andDateOfSettlementIsNotNull() {
            addCriterion("DATE_OF_SETTLEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDateOfSettlementEqualTo(Date value) {
            addCriterion("DATE_OF_SETTLEMENT =", value, "dateOfSettlement");
            return (Criteria) this;
        }

        public Criteria andDateOfSettlementNotEqualTo(Date value) {
            addCriterion("DATE_OF_SETTLEMENT <>", value, "dateOfSettlement");
            return (Criteria) this;
        }

        public Criteria andDateOfSettlementGreaterThan(Date value) {
            addCriterion("DATE_OF_SETTLEMENT >", value, "dateOfSettlement");
            return (Criteria) this;
        }

        public Criteria andDateOfSettlementGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_OF_SETTLEMENT >=", value, "dateOfSettlement");
            return (Criteria) this;
        }

        public Criteria andDateOfSettlementLessThan(Date value) {
            addCriterion("DATE_OF_SETTLEMENT <", value, "dateOfSettlement");
            return (Criteria) this;
        }

        public Criteria andDateOfSettlementLessThanOrEqualTo(Date value) {
            addCriterion("DATE_OF_SETTLEMENT <=", value, "dateOfSettlement");
            return (Criteria) this;
        }

        public Criteria andDateOfSettlementIn(List<Date> values) {
            addCriterion("DATE_OF_SETTLEMENT in", values, "dateOfSettlement");
            return (Criteria) this;
        }

        public Criteria andDateOfSettlementNotIn(List<Date> values) {
            addCriterion("DATE_OF_SETTLEMENT not in", values, "dateOfSettlement");
            return (Criteria) this;
        }

        public Criteria andDateOfSettlementBetween(Date value1, Date value2) {
            addCriterion("DATE_OF_SETTLEMENT between", value1, value2, "dateOfSettlement");
            return (Criteria) this;
        }

        public Criteria andDateOfSettlementNotBetween(Date value1, Date value2) {
            addCriterion("DATE_OF_SETTLEMENT not between", value1, value2, "dateOfSettlement");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkIsNull() {
            addCriterion("SETTLEMENT_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkIsNotNull() {
            addCriterion("SETTLEMENT_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkEqualTo(String value) {
            addCriterion("SETTLEMENT_REMARK =", value, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkNotEqualTo(String value) {
            addCriterion("SETTLEMENT_REMARK <>", value, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkGreaterThan(String value) {
            addCriterion("SETTLEMENT_REMARK >", value, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_REMARK >=", value, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkLessThan(String value) {
            addCriterion("SETTLEMENT_REMARK <", value, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_REMARK <=", value, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkLike(String value) {
            addCriterion("SETTLEMENT_REMARK like", value, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkNotLike(String value) {
            addCriterion("SETTLEMENT_REMARK not like", value, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkIn(List<String> values) {
            addCriterion("SETTLEMENT_REMARK in", values, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkNotIn(List<String> values) {
            addCriterion("SETTLEMENT_REMARK not in", values, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_REMARK between", value1, value2, "settlementRemark");
            return (Criteria) this;
        }

        public Criteria andSettlementRemarkNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_REMARK not between", value1, value2, "settlementRemark");
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

        public Criteria andModifyDateIsNull() {
            addCriterion("MODIFY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("MODIFY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("MODIFY_DATE =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("MODIFY_DATE <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("MODIFY_DATE >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATE >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("MODIFY_DATE <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATE <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("MODIFY_DATE in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("MODIFY_DATE not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATE between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATE not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNull() {
            addCriterion("PAYMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNotNull() {
            addCriterion("PAYMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateEqualTo(Date value) {
            addCriterion("PAYMENT_DATE =", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotEqualTo(Date value) {
            addCriterion("PAYMENT_DATE <>", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThan(Date value) {
            addCriterion("PAYMENT_DATE >", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PAYMENT_DATE >=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThan(Date value) {
            addCriterion("PAYMENT_DATE <", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThanOrEqualTo(Date value) {
            addCriterion("PAYMENT_DATE <=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIn(List<Date> values) {
            addCriterion("PAYMENT_DATE in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotIn(List<Date> values) {
            addCriterion("PAYMENT_DATE not in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateBetween(Date value1, Date value2) {
            addCriterion("PAYMENT_DATE between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotBetween(Date value1, Date value2) {
            addCriterion("PAYMENT_DATE not between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPayerIsNull() {
            addCriterion("PAYER is null");
            return (Criteria) this;
        }

        public Criteria andPayerIsNotNull() {
            addCriterion("PAYER is not null");
            return (Criteria) this;
        }

        public Criteria andPayerEqualTo(String value) {
            addCriterion("PAYER =", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotEqualTo(String value) {
            addCriterion("PAYER <>", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThan(String value) {
            addCriterion("PAYER >", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER >=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThan(String value) {
            addCriterion("PAYER <", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThanOrEqualTo(String value) {
            addCriterion("PAYER <=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLike(String value) {
            addCriterion("PAYER like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotLike(String value) {
            addCriterion("PAYER not like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerIn(List<String> values) {
            addCriterion("PAYER in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotIn(List<String> values) {
            addCriterion("PAYER not in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerBetween(String value1, String value2) {
            addCriterion("PAYER between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotBetween(String value1, String value2) {
            addCriterion("PAYER not between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerAccountIsNull() {
            addCriterion("PAYER_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPayerAccountIsNotNull() {
            addCriterion("PAYER_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPayerAccountEqualTo(String value) {
            addCriterion("PAYER_ACCOUNT =", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountNotEqualTo(String value) {
            addCriterion("PAYER_ACCOUNT <>", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountGreaterThan(String value) {
            addCriterion("PAYER_ACCOUNT >", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_ACCOUNT >=", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountLessThan(String value) {
            addCriterion("PAYER_ACCOUNT <", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountLessThanOrEqualTo(String value) {
            addCriterion("PAYER_ACCOUNT <=", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountLike(String value) {
            addCriterion("PAYER_ACCOUNT like", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountNotLike(String value) {
            addCriterion("PAYER_ACCOUNT not like", value, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountIn(List<String> values) {
            addCriterion("PAYER_ACCOUNT in", values, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountNotIn(List<String> values) {
            addCriterion("PAYER_ACCOUNT not in", values, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountBetween(String value1, String value2) {
            addCriterion("PAYER_ACCOUNT between", value1, value2, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andPayerAccountNotBetween(String value1, String value2) {
            addCriterion("PAYER_ACCOUNT not between", value1, value2, "payerAccount");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("VERSION not between", value1, value2, "version");
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

        public Criteria andPaymentIdIsNull() {
            addCriterion("PAYMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("PAYMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(Integer value) {
            addCriterion("PAYMENT_ID =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(Integer value) {
            addCriterion("PAYMENT_ID <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(Integer value) {
            addCriterion("PAYMENT_ID >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_ID >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(Integer value) {
            addCriterion("PAYMENT_ID <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_ID <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<Integer> values) {
            addCriterion("PAYMENT_ID in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<Integer> values) {
            addCriterion("PAYMENT_ID not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_ID between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_ID not between", value1, value2, "paymentId");
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

        public Criteria andOutstandingAmtIsNull() {
            addCriterion("OUTSTANDING_AMT is null");
            return (Criteria) this;
        }

        public Criteria andOutstandingAmtIsNotNull() {
            addCriterion("OUTSTANDING_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andOutstandingAmtEqualTo(String value) {
            addCriterion("OUTSTANDING_AMT =", value, "outstandingAmt");
            return (Criteria) this;
        }

        public Criteria andOutstandingAmtNotEqualTo(String value) {
            addCriterion("OUTSTANDING_AMT <>", value, "outstandingAmt");
            return (Criteria) this;
        }

        public Criteria andOutstandingAmtGreaterThan(String value) {
            addCriterion("OUTSTANDING_AMT >", value, "outstandingAmt");
            return (Criteria) this;
        }

        public Criteria andOutstandingAmtGreaterThanOrEqualTo(String value) {
            addCriterion("OUTSTANDING_AMT >=", value, "outstandingAmt");
            return (Criteria) this;
        }

        public Criteria andOutstandingAmtLessThan(String value) {
            addCriterion("OUTSTANDING_AMT <", value, "outstandingAmt");
            return (Criteria) this;
        }

        public Criteria andOutstandingAmtLessThanOrEqualTo(String value) {
            addCriterion("OUTSTANDING_AMT <=", value, "outstandingAmt");
            return (Criteria) this;
        }

        public Criteria andOutstandingAmtLike(String value) {
            addCriterion("OUTSTANDING_AMT like", value, "outstandingAmt");
            return (Criteria) this;
        }

        public Criteria andOutstandingAmtNotLike(String value) {
            addCriterion("OUTSTANDING_AMT not like", value, "outstandingAmt");
            return (Criteria) this;
        }

        public Criteria andOutstandingAmtIn(List<String> values) {
            addCriterion("OUTSTANDING_AMT in", values, "outstandingAmt");
            return (Criteria) this;
        }

        public Criteria andOutstandingAmtNotIn(List<String> values) {
            addCriterion("OUTSTANDING_AMT not in", values, "outstandingAmt");
            return (Criteria) this;
        }

        public Criteria andOutstandingAmtBetween(String value1, String value2) {
            addCriterion("OUTSTANDING_AMT between", value1, value2, "outstandingAmt");
            return (Criteria) this;
        }

        public Criteria andOutstandingAmtNotBetween(String value1, String value2) {
            addCriterion("OUTSTANDING_AMT not between", value1, value2, "outstandingAmt");
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