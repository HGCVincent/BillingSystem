package com.billing.invoice.po;

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

        public Criteria andInvDescIdIsNull() {
            addCriterion("INV_DESC_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvDescIdIsNotNull() {
            addCriterion("INV_DESC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvDescIdEqualTo(Long value) {
            addCriterion("INV_DESC_ID =", value, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvDescIdNotEqualTo(Long value) {
            addCriterion("INV_DESC_ID <>", value, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvDescIdGreaterThan(Long value) {
            addCriterion("INV_DESC_ID >", value, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvDescIdGreaterThanOrEqualTo(Long value) {
            addCriterion("INV_DESC_ID >=", value, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvDescIdLessThan(Long value) {
            addCriterion("INV_DESC_ID <", value, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvDescIdLessThanOrEqualTo(Long value) {
            addCriterion("INV_DESC_ID <=", value, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvDescIdIn(List<Long> values) {
            addCriterion("INV_DESC_ID in", values, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvDescIdNotIn(List<Long> values) {
            addCriterion("INV_DESC_ID not in", values, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvDescIdBetween(Long value1, Long value2) {
            addCriterion("INV_DESC_ID between", value1, value2, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvDescIdNotBetween(Long value1, Long value2) {
            addCriterion("INV_DESC_ID not between", value1, value2, "invDescId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIsNull() {
            addCriterion("INVOICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIsNotNull() {
            addCriterion("INVOICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdEqualTo(String value) {
            addCriterion("INVOICE_ID =", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotEqualTo(String value) {
            addCriterion("INVOICE_ID <>", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdGreaterThan(String value) {
            addCriterion("INVOICE_ID >", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_ID >=", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLessThan(String value) {
            addCriterion("INVOICE_ID <", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_ID <=", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLike(String value) {
            addCriterion("INVOICE_ID like", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotLike(String value) {
            addCriterion("INVOICE_ID not like", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIn(List<String> values) {
            addCriterion("INVOICE_ID in", values, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotIn(List<String> values) {
            addCriterion("INVOICE_ID not in", values, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdBetween(String value1, String value2) {
            addCriterion("INVOICE_ID between", value1, value2, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotBetween(String value1, String value2) {
            addCriterion("INVOICE_ID not between", value1, value2, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("CUSTOMER_ID like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("CUSTOMER_ID not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
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

        public Criteria andItemCurrencyIsNull() {
            addCriterion("ITEM_CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andItemCurrencyIsNotNull() {
            addCriterion("ITEM_CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andItemCurrencyEqualTo(String value) {
            addCriterion("ITEM_CURRENCY =", value, "itemCurrency");
            return (Criteria) this;
        }

        public Criteria andItemCurrencyNotEqualTo(String value) {
            addCriterion("ITEM_CURRENCY <>", value, "itemCurrency");
            return (Criteria) this;
        }

        public Criteria andItemCurrencyGreaterThan(String value) {
            addCriterion("ITEM_CURRENCY >", value, "itemCurrency");
            return (Criteria) this;
        }

        public Criteria andItemCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_CURRENCY >=", value, "itemCurrency");
            return (Criteria) this;
        }

        public Criteria andItemCurrencyLessThan(String value) {
            addCriterion("ITEM_CURRENCY <", value, "itemCurrency");
            return (Criteria) this;
        }

        public Criteria andItemCurrencyLessThanOrEqualTo(String value) {
            addCriterion("ITEM_CURRENCY <=", value, "itemCurrency");
            return (Criteria) this;
        }

        public Criteria andItemCurrencyLike(String value) {
            addCriterion("ITEM_CURRENCY like", value, "itemCurrency");
            return (Criteria) this;
        }

        public Criteria andItemCurrencyNotLike(String value) {
            addCriterion("ITEM_CURRENCY not like", value, "itemCurrency");
            return (Criteria) this;
        }

        public Criteria andItemCurrencyIn(List<String> values) {
            addCriterion("ITEM_CURRENCY in", values, "itemCurrency");
            return (Criteria) this;
        }

        public Criteria andItemCurrencyNotIn(List<String> values) {
            addCriterion("ITEM_CURRENCY not in", values, "itemCurrency");
            return (Criteria) this;
        }

        public Criteria andItemCurrencyBetween(String value1, String value2) {
            addCriterion("ITEM_CURRENCY between", value1, value2, "itemCurrency");
            return (Criteria) this;
        }

        public Criteria andItemCurrencyNotBetween(String value1, String value2) {
            addCriterion("ITEM_CURRENCY not between", value1, value2, "itemCurrency");
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

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andItemAmtIsNull() {
            addCriterion("ITEM_AMT is null");
            return (Criteria) this;
        }

        public Criteria andItemAmtIsNotNull() {
            addCriterion("ITEM_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andItemAmtEqualTo(Long value) {
            addCriterion("ITEM_AMT =", value, "itemAmt");
            return (Criteria) this;
        }

        public Criteria andItemAmtNotEqualTo(Long value) {
            addCriterion("ITEM_AMT <>", value, "itemAmt");
            return (Criteria) this;
        }

        public Criteria andItemAmtGreaterThan(Long value) {
            addCriterion("ITEM_AMT >", value, "itemAmt");
            return (Criteria) this;
        }

        public Criteria andItemAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("ITEM_AMT >=", value, "itemAmt");
            return (Criteria) this;
        }

        public Criteria andItemAmtLessThan(Long value) {
            addCriterion("ITEM_AMT <", value, "itemAmt");
            return (Criteria) this;
        }

        public Criteria andItemAmtLessThanOrEqualTo(Long value) {
            addCriterion("ITEM_AMT <=", value, "itemAmt");
            return (Criteria) this;
        }

        public Criteria andItemAmtIn(List<Long> values) {
            addCriterion("ITEM_AMT in", values, "itemAmt");
            return (Criteria) this;
        }

        public Criteria andItemAmtNotIn(List<Long> values) {
            addCriterion("ITEM_AMT not in", values, "itemAmt");
            return (Criteria) this;
        }

        public Criteria andItemAmtBetween(Long value1, Long value2) {
            addCriterion("ITEM_AMT between", value1, value2, "itemAmt");
            return (Criteria) this;
        }

        public Criteria andItemAmtNotBetween(Long value1, Long value2) {
            addCriterion("ITEM_AMT not between", value1, value2, "itemAmt");
            return (Criteria) this;
        }

        public Criteria andItemCurrentMonthIsNull() {
            addCriterion("ITEM_CURRENT_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andItemCurrentMonthIsNotNull() {
            addCriterion("ITEM_CURRENT_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andItemCurrentMonthEqualTo(String value) {
            addCriterion("ITEM_CURRENT_MONTH =", value, "itemCurrentMonth");
            return (Criteria) this;
        }

        public Criteria andItemCurrentMonthNotEqualTo(String value) {
            addCriterion("ITEM_CURRENT_MONTH <>", value, "itemCurrentMonth");
            return (Criteria) this;
        }

        public Criteria andItemCurrentMonthGreaterThan(String value) {
            addCriterion("ITEM_CURRENT_MONTH >", value, "itemCurrentMonth");
            return (Criteria) this;
        }

        public Criteria andItemCurrentMonthGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_CURRENT_MONTH >=", value, "itemCurrentMonth");
            return (Criteria) this;
        }

        public Criteria andItemCurrentMonthLessThan(String value) {
            addCriterion("ITEM_CURRENT_MONTH <", value, "itemCurrentMonth");
            return (Criteria) this;
        }

        public Criteria andItemCurrentMonthLessThanOrEqualTo(String value) {
            addCriterion("ITEM_CURRENT_MONTH <=", value, "itemCurrentMonth");
            return (Criteria) this;
        }

        public Criteria andItemCurrentMonthLike(String value) {
            addCriterion("ITEM_CURRENT_MONTH like", value, "itemCurrentMonth");
            return (Criteria) this;
        }

        public Criteria andItemCurrentMonthNotLike(String value) {
            addCriterion("ITEM_CURRENT_MONTH not like", value, "itemCurrentMonth");
            return (Criteria) this;
        }

        public Criteria andItemCurrentMonthIn(List<String> values) {
            addCriterion("ITEM_CURRENT_MONTH in", values, "itemCurrentMonth");
            return (Criteria) this;
        }

        public Criteria andItemCurrentMonthNotIn(List<String> values) {
            addCriterion("ITEM_CURRENT_MONTH not in", values, "itemCurrentMonth");
            return (Criteria) this;
        }

        public Criteria andItemCurrentMonthBetween(String value1, String value2) {
            addCriterion("ITEM_CURRENT_MONTH between", value1, value2, "itemCurrentMonth");
            return (Criteria) this;
        }

        public Criteria andItemCurrentMonthNotBetween(String value1, String value2) {
            addCriterion("ITEM_CURRENT_MONTH not between", value1, value2, "itemCurrentMonth");
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

        public Criteria andInvVersionIsNull() {
            addCriterion("INV_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andInvVersionIsNotNull() {
            addCriterion("INV_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andInvVersionEqualTo(Integer value) {
            addCriterion("INV_VERSION =", value, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionNotEqualTo(Integer value) {
            addCriterion("INV_VERSION <>", value, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionGreaterThan(Integer value) {
            addCriterion("INV_VERSION >", value, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("INV_VERSION >=", value, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionLessThan(Integer value) {
            addCriterion("INV_VERSION <", value, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionLessThanOrEqualTo(Integer value) {
            addCriterion("INV_VERSION <=", value, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionIn(List<Integer> values) {
            addCriterion("INV_VERSION in", values, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionNotIn(List<Integer> values) {
            addCriterion("INV_VERSION not in", values, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionBetween(Integer value1, Integer value2) {
            addCriterion("INV_VERSION between", value1, value2, "invVersion");
            return (Criteria) this;
        }

        public Criteria andInvVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("INV_VERSION not between", value1, value2, "invVersion");
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

        public Criteria andAmtCsIsNull() {
            addCriterion("AMT_CS is null");
            return (Criteria) this;
        }

        public Criteria andAmtCsIsNotNull() {
            addCriterion("AMT_CS is not null");
            return (Criteria) this;
        }

        public Criteria andAmtCsEqualTo(Long value) {
            addCriterion("AMT_CS =", value, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtCsNotEqualTo(Long value) {
            addCriterion("AMT_CS <>", value, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtCsGreaterThan(Long value) {
            addCriterion("AMT_CS >", value, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtCsGreaterThanOrEqualTo(Long value) {
            addCriterion("AMT_CS >=", value, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtCsLessThan(Long value) {
            addCriterion("AMT_CS <", value, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtCsLessThanOrEqualTo(Long value) {
            addCriterion("AMT_CS <=", value, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtCsIn(List<Long> values) {
            addCriterion("AMT_CS in", values, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtCsNotIn(List<Long> values) {
            addCriterion("AMT_CS not in", values, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtCsBetween(Long value1, Long value2) {
            addCriterion("AMT_CS between", value1, value2, "amtCs");
            return (Criteria) this;
        }

        public Criteria andAmtCsNotBetween(Long value1, Long value2) {
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

        public Criteria andAmtUsdEqualTo(Long value) {
            addCriterion("AMT_USD =", value, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtUsdNotEqualTo(Long value) {
            addCriterion("AMT_USD <>", value, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtUsdGreaterThan(Long value) {
            addCriterion("AMT_USD >", value, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtUsdGreaterThanOrEqualTo(Long value) {
            addCriterion("AMT_USD >=", value, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtUsdLessThan(Long value) {
            addCriterion("AMT_USD <", value, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtUsdLessThanOrEqualTo(Long value) {
            addCriterion("AMT_USD <=", value, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtUsdIn(List<Long> values) {
            addCriterion("AMT_USD in", values, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtUsdNotIn(List<Long> values) {
            addCriterion("AMT_USD not in", values, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtUsdBetween(Long value1, Long value2) {
            addCriterion("AMT_USD between", value1, value2, "amtUsd");
            return (Criteria) this;
        }

        public Criteria andAmtUsdNotBetween(Long value1, Long value2) {
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

        public Criteria andAmtVdcEqualTo(Long value) {
            addCriterion("AMT_VDC =", value, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVdcNotEqualTo(Long value) {
            addCriterion("AMT_VDC <>", value, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVdcGreaterThan(Long value) {
            addCriterion("AMT_VDC >", value, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVdcGreaterThanOrEqualTo(Long value) {
            addCriterion("AMT_VDC >=", value, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVdcLessThan(Long value) {
            addCriterion("AMT_VDC <", value, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVdcLessThanOrEqualTo(Long value) {
            addCriterion("AMT_VDC <=", value, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVdcIn(List<Long> values) {
            addCriterion("AMT_VDC in", values, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVdcNotIn(List<Long> values) {
            addCriterion("AMT_VDC not in", values, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVdcBetween(Long value1, Long value2) {
            addCriterion("AMT_VDC between", value1, value2, "amtVdc");
            return (Criteria) this;
        }

        public Criteria andAmtVdcNotBetween(Long value1, Long value2) {
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