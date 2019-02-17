package com.billing.invoice.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaxInvoiceNumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaxInvoiceNumExample() {
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

        public Criteria andInvIdEqualTo(Long value) {
            addCriterion("INV_ID =", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdNotEqualTo(Long value) {
            addCriterion("INV_ID <>", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdGreaterThan(Long value) {
            addCriterion("INV_ID >", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdGreaterThanOrEqualTo(Long value) {
            addCriterion("INV_ID >=", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdLessThan(Long value) {
            addCriterion("INV_ID <", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdLessThanOrEqualTo(Long value) {
            addCriterion("INV_ID <=", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdIn(List<Long> values) {
            addCriterion("INV_ID in", values, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdNotIn(List<Long> values) {
            addCriterion("INV_ID not in", values, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdBetween(Long value1, Long value2) {
            addCriterion("INV_ID between", value1, value2, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdNotBetween(Long value1, Long value2) {
            addCriterion("INV_ID not between", value1, value2, "invId");
            return (Criteria) this;
        }

        public Criteria andTaxInvTypeIsNull() {
            addCriterion("TAX_INV_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaxInvTypeIsNotNull() {
            addCriterion("TAX_INV_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxInvTypeEqualTo(String value) {
            addCriterion("TAX_INV_TYPE =", value, "taxInvType");
            return (Criteria) this;
        }

        public Criteria andTaxInvTypeNotEqualTo(String value) {
            addCriterion("TAX_INV_TYPE <>", value, "taxInvType");
            return (Criteria) this;
        }

        public Criteria andTaxInvTypeGreaterThan(String value) {
            addCriterion("TAX_INV_TYPE >", value, "taxInvType");
            return (Criteria) this;
        }

        public Criteria andTaxInvTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_INV_TYPE >=", value, "taxInvType");
            return (Criteria) this;
        }

        public Criteria andTaxInvTypeLessThan(String value) {
            addCriterion("TAX_INV_TYPE <", value, "taxInvType");
            return (Criteria) this;
        }

        public Criteria andTaxInvTypeLessThanOrEqualTo(String value) {
            addCriterion("TAX_INV_TYPE <=", value, "taxInvType");
            return (Criteria) this;
        }

        public Criteria andTaxInvTypeLike(String value) {
            addCriterion("TAX_INV_TYPE like", value, "taxInvType");
            return (Criteria) this;
        }

        public Criteria andTaxInvTypeNotLike(String value) {
            addCriterion("TAX_INV_TYPE not like", value, "taxInvType");
            return (Criteria) this;
        }

        public Criteria andTaxInvTypeIn(List<String> values) {
            addCriterion("TAX_INV_TYPE in", values, "taxInvType");
            return (Criteria) this;
        }

        public Criteria andTaxInvTypeNotIn(List<String> values) {
            addCriterion("TAX_INV_TYPE not in", values, "taxInvType");
            return (Criteria) this;
        }

        public Criteria andTaxInvTypeBetween(String value1, String value2) {
            addCriterion("TAX_INV_TYPE between", value1, value2, "taxInvType");
            return (Criteria) this;
        }

        public Criteria andTaxInvTypeNotBetween(String value1, String value2) {
            addCriterion("TAX_INV_TYPE not between", value1, value2, "taxInvType");
            return (Criteria) this;
        }

        public Criteria andOfficeIsNull() {
            addCriterion("OFFICE is null");
            return (Criteria) this;
        }

        public Criteria andOfficeIsNotNull() {
            addCriterion("OFFICE is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeEqualTo(String value) {
            addCriterion("OFFICE =", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotEqualTo(String value) {
            addCriterion("OFFICE <>", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeGreaterThan(String value) {
            addCriterion("OFFICE >", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE >=", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeLessThan(String value) {
            addCriterion("OFFICE <", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeLessThanOrEqualTo(String value) {
            addCriterion("OFFICE <=", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeLike(String value) {
            addCriterion("OFFICE like", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotLike(String value) {
            addCriterion("OFFICE not like", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeIn(List<String> values) {
            addCriterion("OFFICE in", values, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotIn(List<String> values) {
            addCriterion("OFFICE not in", values, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeBetween(String value1, String value2) {
            addCriterion("OFFICE between", value1, value2, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotBetween(String value1, String value2) {
            addCriterion("OFFICE not between", value1, value2, "office");
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

        public Criteria andCreateByIsNull() {
            addCriterion("CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("CREATE_BY =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("CREATE_BY like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("CREATE_BY not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("CREATE_BY in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("CREATE_BY not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("CREATE_BY between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY not between", value1, value2, "createBy");
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

        public Criteria andAssignToIsNull() {
            addCriterion("ASSIGN_TO is null");
            return (Criteria) this;
        }

        public Criteria andAssignToIsNotNull() {
            addCriterion("ASSIGN_TO is not null");
            return (Criteria) this;
        }

        public Criteria andAssignToEqualTo(String value) {
            addCriterion("ASSIGN_TO =", value, "assignTo");
            return (Criteria) this;
        }

        public Criteria andAssignToNotEqualTo(String value) {
            addCriterion("ASSIGN_TO <>", value, "assignTo");
            return (Criteria) this;
        }

        public Criteria andAssignToGreaterThan(String value) {
            addCriterion("ASSIGN_TO >", value, "assignTo");
            return (Criteria) this;
        }

        public Criteria andAssignToGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIGN_TO >=", value, "assignTo");
            return (Criteria) this;
        }

        public Criteria andAssignToLessThan(String value) {
            addCriterion("ASSIGN_TO <", value, "assignTo");
            return (Criteria) this;
        }

        public Criteria andAssignToLessThanOrEqualTo(String value) {
            addCriterion("ASSIGN_TO <=", value, "assignTo");
            return (Criteria) this;
        }

        public Criteria andAssignToLike(String value) {
            addCriterion("ASSIGN_TO like", value, "assignTo");
            return (Criteria) this;
        }

        public Criteria andAssignToNotLike(String value) {
            addCriterion("ASSIGN_TO not like", value, "assignTo");
            return (Criteria) this;
        }

        public Criteria andAssignToIn(List<String> values) {
            addCriterion("ASSIGN_TO in", values, "assignTo");
            return (Criteria) this;
        }

        public Criteria andAssignToNotIn(List<String> values) {
            addCriterion("ASSIGN_TO not in", values, "assignTo");
            return (Criteria) this;
        }

        public Criteria andAssignToBetween(String value1, String value2) {
            addCriterion("ASSIGN_TO between", value1, value2, "assignTo");
            return (Criteria) this;
        }

        public Criteria andAssignToNotBetween(String value1, String value2) {
            addCriterion("ASSIGN_TO not between", value1, value2, "assignTo");
            return (Criteria) this;
        }

        public Criteria andInvIdStatusIsNull() {
            addCriterion("INV_ID_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andInvIdStatusIsNotNull() {
            addCriterion("INV_ID_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andInvIdStatusEqualTo(String value) {
            addCriterion("INV_ID_STATUS =", value, "invIdStatus");
            return (Criteria) this;
        }

        public Criteria andInvIdStatusNotEqualTo(String value) {
            addCriterion("INV_ID_STATUS <>", value, "invIdStatus");
            return (Criteria) this;
        }

        public Criteria andInvIdStatusGreaterThan(String value) {
            addCriterion("INV_ID_STATUS >", value, "invIdStatus");
            return (Criteria) this;
        }

        public Criteria andInvIdStatusGreaterThanOrEqualTo(String value) {
            addCriterion("INV_ID_STATUS >=", value, "invIdStatus");
            return (Criteria) this;
        }

        public Criteria andInvIdStatusLessThan(String value) {
            addCriterion("INV_ID_STATUS <", value, "invIdStatus");
            return (Criteria) this;
        }

        public Criteria andInvIdStatusLessThanOrEqualTo(String value) {
            addCriterion("INV_ID_STATUS <=", value, "invIdStatus");
            return (Criteria) this;
        }

        public Criteria andInvIdStatusLike(String value) {
            addCriterion("INV_ID_STATUS like", value, "invIdStatus");
            return (Criteria) this;
        }

        public Criteria andInvIdStatusNotLike(String value) {
            addCriterion("INV_ID_STATUS not like", value, "invIdStatus");
            return (Criteria) this;
        }

        public Criteria andInvIdStatusIn(List<String> values) {
            addCriterion("INV_ID_STATUS in", values, "invIdStatus");
            return (Criteria) this;
        }

        public Criteria andInvIdStatusNotIn(List<String> values) {
            addCriterion("INV_ID_STATUS not in", values, "invIdStatus");
            return (Criteria) this;
        }

        public Criteria andInvIdStatusBetween(String value1, String value2) {
            addCriterion("INV_ID_STATUS between", value1, value2, "invIdStatus");
            return (Criteria) this;
        }

        public Criteria andInvIdStatusNotBetween(String value1, String value2) {
            addCriterion("INV_ID_STATUS not between", value1, value2, "invIdStatus");
            return (Criteria) this;
        }

        public Criteria andIsUsedIsNull() {
            addCriterion("IS_USED is null");
            return (Criteria) this;
        }

        public Criteria andIsUsedIsNotNull() {
            addCriterion("IS_USED is not null");
            return (Criteria) this;
        }

        public Criteria andIsUsedEqualTo(String value) {
            addCriterion("IS_USED =", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotEqualTo(String value) {
            addCriterion("IS_USED <>", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedGreaterThan(String value) {
            addCriterion("IS_USED >", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_USED >=", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLessThan(String value) {
            addCriterion("IS_USED <", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLessThanOrEqualTo(String value) {
            addCriterion("IS_USED <=", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLike(String value) {
            addCriterion("IS_USED like", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotLike(String value) {
            addCriterion("IS_USED not like", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedIn(List<String> values) {
            addCriterion("IS_USED in", values, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotIn(List<String> values) {
            addCriterion("IS_USED not in", values, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedBetween(String value1, String value2) {
            addCriterion("IS_USED between", value1, value2, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotBetween(String value1, String value2) {
            addCriterion("IS_USED not between", value1, value2, "isUsed");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
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

        public Criteria andSeqIdEqualTo(Integer value) {
            addCriterion("SEQ_ID =", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotEqualTo(Integer value) {
            addCriterion("SEQ_ID <>", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThan(Integer value) {
            addCriterion("SEQ_ID >", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEQ_ID >=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThan(Integer value) {
            addCriterion("SEQ_ID <", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThanOrEqualTo(Integer value) {
            addCriterion("SEQ_ID <=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdIn(List<Integer> values) {
            addCriterion("SEQ_ID in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotIn(List<Integer> values) {
            addCriterion("SEQ_ID not in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdBetween(Integer value1, Integer value2) {
            addCriterion("SEQ_ID between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SEQ_ID not between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andTaxInvBatchIsNull() {
            addCriterion("TAX_INV_BATCH is null");
            return (Criteria) this;
        }

        public Criteria andTaxInvBatchIsNotNull() {
            addCriterion("TAX_INV_BATCH is not null");
            return (Criteria) this;
        }

        public Criteria andTaxInvBatchEqualTo(Integer value) {
            addCriterion("TAX_INV_BATCH =", value, "taxInvBatch");
            return (Criteria) this;
        }

        public Criteria andTaxInvBatchNotEqualTo(Integer value) {
            addCriterion("TAX_INV_BATCH <>", value, "taxInvBatch");
            return (Criteria) this;
        }

        public Criteria andTaxInvBatchGreaterThan(Integer value) {
            addCriterion("TAX_INV_BATCH >", value, "taxInvBatch");
            return (Criteria) this;
        }

        public Criteria andTaxInvBatchGreaterThanOrEqualTo(Integer value) {
            addCriterion("TAX_INV_BATCH >=", value, "taxInvBatch");
            return (Criteria) this;
        }

        public Criteria andTaxInvBatchLessThan(Integer value) {
            addCriterion("TAX_INV_BATCH <", value, "taxInvBatch");
            return (Criteria) this;
        }

        public Criteria andTaxInvBatchLessThanOrEqualTo(Integer value) {
            addCriterion("TAX_INV_BATCH <=", value, "taxInvBatch");
            return (Criteria) this;
        }

        public Criteria andTaxInvBatchIn(List<Integer> values) {
            addCriterion("TAX_INV_BATCH in", values, "taxInvBatch");
            return (Criteria) this;
        }

        public Criteria andTaxInvBatchNotIn(List<Integer> values) {
            addCriterion("TAX_INV_BATCH not in", values, "taxInvBatch");
            return (Criteria) this;
        }

        public Criteria andTaxInvBatchBetween(Integer value1, Integer value2) {
            addCriterion("TAX_INV_BATCH between", value1, value2, "taxInvBatch");
            return (Criteria) this;
        }

        public Criteria andTaxInvBatchNotBetween(Integer value1, Integer value2) {
            addCriterion("TAX_INV_BATCH not between", value1, value2, "taxInvBatch");
            return (Criteria) this;
        }

        public Criteria andTaxDateIsNull() {
            addCriterion("TAX_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTaxDateIsNotNull() {
            addCriterion("TAX_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxDateEqualTo(Date value) {
            addCriterion("TAX_DATE =", value, "taxDate");
            return (Criteria) this;
        }

        public Criteria andTaxDateNotEqualTo(Date value) {
            addCriterion("TAX_DATE <>", value, "taxDate");
            return (Criteria) this;
        }

        public Criteria andTaxDateGreaterThan(Date value) {
            addCriterion("TAX_DATE >", value, "taxDate");
            return (Criteria) this;
        }

        public Criteria andTaxDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TAX_DATE >=", value, "taxDate");
            return (Criteria) this;
        }

        public Criteria andTaxDateLessThan(Date value) {
            addCriterion("TAX_DATE <", value, "taxDate");
            return (Criteria) this;
        }

        public Criteria andTaxDateLessThanOrEqualTo(Date value) {
            addCriterion("TAX_DATE <=", value, "taxDate");
            return (Criteria) this;
        }

        public Criteria andTaxDateIn(List<Date> values) {
            addCriterion("TAX_DATE in", values, "taxDate");
            return (Criteria) this;
        }

        public Criteria andTaxDateNotIn(List<Date> values) {
            addCriterion("TAX_DATE not in", values, "taxDate");
            return (Criteria) this;
        }

        public Criteria andTaxDateBetween(Date value1, Date value2) {
            addCriterion("TAX_DATE between", value1, value2, "taxDate");
            return (Criteria) this;
        }

        public Criteria andTaxDateNotBetween(Date value1, Date value2) {
            addCriterion("TAX_DATE not between", value1, value2, "taxDate");
            return (Criteria) this;
        }

        public Criteria andTaxFromIsNull() {
            addCriterion("TAX_FROM is null");
            return (Criteria) this;
        }

        public Criteria andTaxFromIsNotNull() {
            addCriterion("TAX_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andTaxFromEqualTo(Integer value) {
            addCriterion("TAX_FROM =", value, "taxFrom");
            return (Criteria) this;
        }

        public Criteria andTaxFromNotEqualTo(Integer value) {
            addCriterion("TAX_FROM <>", value, "taxFrom");
            return (Criteria) this;
        }

        public Criteria andTaxFromGreaterThan(Integer value) {
            addCriterion("TAX_FROM >", value, "taxFrom");
            return (Criteria) this;
        }

        public Criteria andTaxFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("TAX_FROM >=", value, "taxFrom");
            return (Criteria) this;
        }

        public Criteria andTaxFromLessThan(Integer value) {
            addCriterion("TAX_FROM <", value, "taxFrom");
            return (Criteria) this;
        }

        public Criteria andTaxFromLessThanOrEqualTo(Integer value) {
            addCriterion("TAX_FROM <=", value, "taxFrom");
            return (Criteria) this;
        }

        public Criteria andTaxFromIn(List<Integer> values) {
            addCriterion("TAX_FROM in", values, "taxFrom");
            return (Criteria) this;
        }

        public Criteria andTaxFromNotIn(List<Integer> values) {
            addCriterion("TAX_FROM not in", values, "taxFrom");
            return (Criteria) this;
        }

        public Criteria andTaxFromBetween(Integer value1, Integer value2) {
            addCriterion("TAX_FROM between", value1, value2, "taxFrom");
            return (Criteria) this;
        }

        public Criteria andTaxFromNotBetween(Integer value1, Integer value2) {
            addCriterion("TAX_FROM not between", value1, value2, "taxFrom");
            return (Criteria) this;
        }

        public Criteria andTaxToIsNull() {
            addCriterion("TAX_TO is null");
            return (Criteria) this;
        }

        public Criteria andTaxToIsNotNull() {
            addCriterion("TAX_TO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxToEqualTo(Integer value) {
            addCriterion("TAX_TO =", value, "taxTo");
            return (Criteria) this;
        }

        public Criteria andTaxToNotEqualTo(Integer value) {
            addCriterion("TAX_TO <>", value, "taxTo");
            return (Criteria) this;
        }

        public Criteria andTaxToGreaterThan(Integer value) {
            addCriterion("TAX_TO >", value, "taxTo");
            return (Criteria) this;
        }

        public Criteria andTaxToGreaterThanOrEqualTo(Integer value) {
            addCriterion("TAX_TO >=", value, "taxTo");
            return (Criteria) this;
        }

        public Criteria andTaxToLessThan(Integer value) {
            addCriterion("TAX_TO <", value, "taxTo");
            return (Criteria) this;
        }

        public Criteria andTaxToLessThanOrEqualTo(Integer value) {
            addCriterion("TAX_TO <=", value, "taxTo");
            return (Criteria) this;
        }

        public Criteria andTaxToIn(List<Integer> values) {
            addCriterion("TAX_TO in", values, "taxTo");
            return (Criteria) this;
        }

        public Criteria andTaxToNotIn(List<Integer> values) {
            addCriterion("TAX_TO not in", values, "taxTo");
            return (Criteria) this;
        }

        public Criteria andTaxToBetween(Integer value1, Integer value2) {
            addCriterion("TAX_TO between", value1, value2, "taxTo");
            return (Criteria) this;
        }

        public Criteria andTaxToNotBetween(Integer value1, Integer value2) {
            addCriterion("TAX_TO not between", value1, value2, "taxTo");
            return (Criteria) this;
        }

        public Criteria andIsRepeatIsNull() {
            addCriterion("IS_REPEAT is null");
            return (Criteria) this;
        }

        public Criteria andIsRepeatIsNotNull() {
            addCriterion("IS_REPEAT is not null");
            return (Criteria) this;
        }

        public Criteria andIsRepeatEqualTo(String value) {
            addCriterion("IS_REPEAT =", value, "isRepeat");
            return (Criteria) this;
        }

        public Criteria andIsRepeatNotEqualTo(String value) {
            addCriterion("IS_REPEAT <>", value, "isRepeat");
            return (Criteria) this;
        }

        public Criteria andIsRepeatGreaterThan(String value) {
            addCriterion("IS_REPEAT >", value, "isRepeat");
            return (Criteria) this;
        }

        public Criteria andIsRepeatGreaterThanOrEqualTo(String value) {
            addCriterion("IS_REPEAT >=", value, "isRepeat");
            return (Criteria) this;
        }

        public Criteria andIsRepeatLessThan(String value) {
            addCriterion("IS_REPEAT <", value, "isRepeat");
            return (Criteria) this;
        }

        public Criteria andIsRepeatLessThanOrEqualTo(String value) {
            addCriterion("IS_REPEAT <=", value, "isRepeat");
            return (Criteria) this;
        }

        public Criteria andIsRepeatLike(String value) {
            addCriterion("IS_REPEAT like", value, "isRepeat");
            return (Criteria) this;
        }

        public Criteria andIsRepeatNotLike(String value) {
            addCriterion("IS_REPEAT not like", value, "isRepeat");
            return (Criteria) this;
        }

        public Criteria andIsRepeatIn(List<String> values) {
            addCriterion("IS_REPEAT in", values, "isRepeat");
            return (Criteria) this;
        }

        public Criteria andIsRepeatNotIn(List<String> values) {
            addCriterion("IS_REPEAT not in", values, "isRepeat");
            return (Criteria) this;
        }

        public Criteria andIsRepeatBetween(String value1, String value2) {
            addCriterion("IS_REPEAT between", value1, value2, "isRepeat");
            return (Criteria) this;
        }

        public Criteria andIsRepeatNotBetween(String value1, String value2) {
            addCriterion("IS_REPEAT not between", value1, value2, "isRepeat");
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