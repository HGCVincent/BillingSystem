package com.billing.invoice.po;

import java.util.ArrayList;
import java.util.List;

public class CustomerProfileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerProfileExample() {
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

        public Criteria andLangTypeIsNull() {
            addCriterion("LANG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLangTypeIsNotNull() {
            addCriterion("LANG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLangTypeEqualTo(String value) {
            addCriterion("LANG_TYPE =", value, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeNotEqualTo(String value) {
            addCriterion("LANG_TYPE <>", value, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeGreaterThan(String value) {
            addCriterion("LANG_TYPE >", value, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LANG_TYPE >=", value, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeLessThan(String value) {
            addCriterion("LANG_TYPE <", value, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeLessThanOrEqualTo(String value) {
            addCriterion("LANG_TYPE <=", value, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeLike(String value) {
            addCriterion("LANG_TYPE like", value, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeNotLike(String value) {
            addCriterion("LANG_TYPE not like", value, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeIn(List<String> values) {
            addCriterion("LANG_TYPE in", values, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeNotIn(List<String> values) {
            addCriterion("LANG_TYPE not in", values, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeBetween(String value1, String value2) {
            addCriterion("LANG_TYPE between", value1, value2, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeNotBetween(String value1, String value2) {
            addCriterion("LANG_TYPE not between", value1, value2, "langType");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("COUNTRY =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("COUNTRY <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("COUNTRY like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("COUNTRY not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("COUNTRY in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("COUNTY is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("COUNTY is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("COUNTY =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("COUNTY <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("COUNTY >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTY >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("COUNTY <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("COUNTY <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("COUNTY like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("COUNTY not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("COUNTY in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("COUNTY not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("COUNTY between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("COUNTY not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("ADMIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("ADMIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("ADMIN_NAME =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("ADMIN_NAME <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("ADMIN_NAME >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADMIN_NAME >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("ADMIN_NAME <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("ADMIN_NAME <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("ADMIN_NAME like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("ADMIN_NAME not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("ADMIN_NAME in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("ADMIN_NAME not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("ADMIN_NAME between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("ADMIN_NAME not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminTelIsNull() {
            addCriterion("ADMIN_TEL is null");
            return (Criteria) this;
        }

        public Criteria andAdminTelIsNotNull() {
            addCriterion("ADMIN_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andAdminTelEqualTo(String value) {
            addCriterion("ADMIN_TEL =", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelNotEqualTo(String value) {
            addCriterion("ADMIN_TEL <>", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelGreaterThan(String value) {
            addCriterion("ADMIN_TEL >", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelGreaterThanOrEqualTo(String value) {
            addCriterion("ADMIN_TEL >=", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelLessThan(String value) {
            addCriterion("ADMIN_TEL <", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelLessThanOrEqualTo(String value) {
            addCriterion("ADMIN_TEL <=", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelLike(String value) {
            addCriterion("ADMIN_TEL like", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelNotLike(String value) {
            addCriterion("ADMIN_TEL not like", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelIn(List<String> values) {
            addCriterion("ADMIN_TEL in", values, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelNotIn(List<String> values) {
            addCriterion("ADMIN_TEL not in", values, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelBetween(String value1, String value2) {
            addCriterion("ADMIN_TEL between", value1, value2, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelNotBetween(String value1, String value2) {
            addCriterion("ADMIN_TEL not between", value1, value2, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIsNull() {
            addCriterion("ADMIN_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIsNotNull() {
            addCriterion("ADMIN_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEmailEqualTo(String value) {
            addCriterion("ADMIN_EMAIL =", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotEqualTo(String value) {
            addCriterion("ADMIN_EMAIL <>", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailGreaterThan(String value) {
            addCriterion("ADMIN_EMAIL >", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailGreaterThanOrEqualTo(String value) {
            addCriterion("ADMIN_EMAIL >=", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLessThan(String value) {
            addCriterion("ADMIN_EMAIL <", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLessThanOrEqualTo(String value) {
            addCriterion("ADMIN_EMAIL <=", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLike(String value) {
            addCriterion("ADMIN_EMAIL like", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotLike(String value) {
            addCriterion("ADMIN_EMAIL not like", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIn(List<String> values) {
            addCriterion("ADMIN_EMAIL in", values, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotIn(List<String> values) {
            addCriterion("ADMIN_EMAIL not in", values, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailBetween(String value1, String value2) {
            addCriterion("ADMIN_EMAIL between", value1, value2, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotBetween(String value1, String value2) {
            addCriterion("ADMIN_EMAIL not between", value1, value2, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerIsNull() {
            addCriterion("ACCT_BD_OWNER is null");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerIsNotNull() {
            addCriterion("ACCT_BD_OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerEqualTo(String value) {
            addCriterion("ACCT_BD_OWNER =", value, "acctBdOwner");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerNotEqualTo(String value) {
            addCriterion("ACCT_BD_OWNER <>", value, "acctBdOwner");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerGreaterThan(String value) {
            addCriterion("ACCT_BD_OWNER >", value, "acctBdOwner");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_BD_OWNER >=", value, "acctBdOwner");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerLessThan(String value) {
            addCriterion("ACCT_BD_OWNER <", value, "acctBdOwner");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerLessThanOrEqualTo(String value) {
            addCriterion("ACCT_BD_OWNER <=", value, "acctBdOwner");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerLike(String value) {
            addCriterion("ACCT_BD_OWNER like", value, "acctBdOwner");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerNotLike(String value) {
            addCriterion("ACCT_BD_OWNER not like", value, "acctBdOwner");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerIn(List<String> values) {
            addCriterion("ACCT_BD_OWNER in", values, "acctBdOwner");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerNotIn(List<String> values) {
            addCriterion("ACCT_BD_OWNER not in", values, "acctBdOwner");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerBetween(String value1, String value2) {
            addCriterion("ACCT_BD_OWNER between", value1, value2, "acctBdOwner");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerNotBetween(String value1, String value2) {
            addCriterion("ACCT_BD_OWNER not between", value1, value2, "acctBdOwner");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerTelIsNull() {
            addCriterion("ACCT_BD_OWNER_TEL is null");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerTelIsNotNull() {
            addCriterion("ACCT_BD_OWNER_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerTelEqualTo(String value) {
            addCriterion("ACCT_BD_OWNER_TEL =", value, "acctBdOwnerTel");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerTelNotEqualTo(String value) {
            addCriterion("ACCT_BD_OWNER_TEL <>", value, "acctBdOwnerTel");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerTelGreaterThan(String value) {
            addCriterion("ACCT_BD_OWNER_TEL >", value, "acctBdOwnerTel");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerTelGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_BD_OWNER_TEL >=", value, "acctBdOwnerTel");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerTelLessThan(String value) {
            addCriterion("ACCT_BD_OWNER_TEL <", value, "acctBdOwnerTel");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerTelLessThanOrEqualTo(String value) {
            addCriterion("ACCT_BD_OWNER_TEL <=", value, "acctBdOwnerTel");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerTelLike(String value) {
            addCriterion("ACCT_BD_OWNER_TEL like", value, "acctBdOwnerTel");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerTelNotLike(String value) {
            addCriterion("ACCT_BD_OWNER_TEL not like", value, "acctBdOwnerTel");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerTelIn(List<String> values) {
            addCriterion("ACCT_BD_OWNER_TEL in", values, "acctBdOwnerTel");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerTelNotIn(List<String> values) {
            addCriterion("ACCT_BD_OWNER_TEL not in", values, "acctBdOwnerTel");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerTelBetween(String value1, String value2) {
            addCriterion("ACCT_BD_OWNER_TEL between", value1, value2, "acctBdOwnerTel");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerTelNotBetween(String value1, String value2) {
            addCriterion("ACCT_BD_OWNER_TEL not between", value1, value2, "acctBdOwnerTel");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerEmailIsNull() {
            addCriterion("ACCT_BD_OWNER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerEmailIsNotNull() {
            addCriterion("ACCT_BD_OWNER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerEmailEqualTo(String value) {
            addCriterion("ACCT_BD_OWNER_EMAIL =", value, "acctBdOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerEmailNotEqualTo(String value) {
            addCriterion("ACCT_BD_OWNER_EMAIL <>", value, "acctBdOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerEmailGreaterThan(String value) {
            addCriterion("ACCT_BD_OWNER_EMAIL >", value, "acctBdOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_BD_OWNER_EMAIL >=", value, "acctBdOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerEmailLessThan(String value) {
            addCriterion("ACCT_BD_OWNER_EMAIL <", value, "acctBdOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerEmailLessThanOrEqualTo(String value) {
            addCriterion("ACCT_BD_OWNER_EMAIL <=", value, "acctBdOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerEmailLike(String value) {
            addCriterion("ACCT_BD_OWNER_EMAIL like", value, "acctBdOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerEmailNotLike(String value) {
            addCriterion("ACCT_BD_OWNER_EMAIL not like", value, "acctBdOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerEmailIn(List<String> values) {
            addCriterion("ACCT_BD_OWNER_EMAIL in", values, "acctBdOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerEmailNotIn(List<String> values) {
            addCriterion("ACCT_BD_OWNER_EMAIL not in", values, "acctBdOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerEmailBetween(String value1, String value2) {
            addCriterion("ACCT_BD_OWNER_EMAIL between", value1, value2, "acctBdOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andAcctBdOwnerEmailNotBetween(String value1, String value2) {
            addCriterion("ACCT_BD_OWNER_EMAIL not between", value1, value2, "acctBdOwnerEmail");
            return (Criteria) this;
        }

        public Criteria andAddr1IsNull() {
            addCriterion("ADDR1 is null");
            return (Criteria) this;
        }

        public Criteria andAddr1IsNotNull() {
            addCriterion("ADDR1 is not null");
            return (Criteria) this;
        }

        public Criteria andAddr1EqualTo(String value) {
            addCriterion("ADDR1 =", value, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1NotEqualTo(String value) {
            addCriterion("ADDR1 <>", value, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1GreaterThan(String value) {
            addCriterion("ADDR1 >", value, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1GreaterThanOrEqualTo(String value) {
            addCriterion("ADDR1 >=", value, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1LessThan(String value) {
            addCriterion("ADDR1 <", value, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1LessThanOrEqualTo(String value) {
            addCriterion("ADDR1 <=", value, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1Like(String value) {
            addCriterion("ADDR1 like", value, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1NotLike(String value) {
            addCriterion("ADDR1 not like", value, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1In(List<String> values) {
            addCriterion("ADDR1 in", values, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1NotIn(List<String> values) {
            addCriterion("ADDR1 not in", values, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1Between(String value1, String value2) {
            addCriterion("ADDR1 between", value1, value2, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr1NotBetween(String value1, String value2) {
            addCriterion("ADDR1 not between", value1, value2, "addr1");
            return (Criteria) this;
        }

        public Criteria andAddr2IsNull() {
            addCriterion("ADDR2 is null");
            return (Criteria) this;
        }

        public Criteria andAddr2IsNotNull() {
            addCriterion("ADDR2 is not null");
            return (Criteria) this;
        }

        public Criteria andAddr2EqualTo(String value) {
            addCriterion("ADDR2 =", value, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2NotEqualTo(String value) {
            addCriterion("ADDR2 <>", value, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2GreaterThan(String value) {
            addCriterion("ADDR2 >", value, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2GreaterThanOrEqualTo(String value) {
            addCriterion("ADDR2 >=", value, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2LessThan(String value) {
            addCriterion("ADDR2 <", value, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2LessThanOrEqualTo(String value) {
            addCriterion("ADDR2 <=", value, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2Like(String value) {
            addCriterion("ADDR2 like", value, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2NotLike(String value) {
            addCriterion("ADDR2 not like", value, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2In(List<String> values) {
            addCriterion("ADDR2 in", values, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2NotIn(List<String> values) {
            addCriterion("ADDR2 not in", values, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2Between(String value1, String value2) {
            addCriterion("ADDR2 between", value1, value2, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr2NotBetween(String value1, String value2) {
            addCriterion("ADDR2 not between", value1, value2, "addr2");
            return (Criteria) this;
        }

        public Criteria andAddr3IsNull() {
            addCriterion("ADDR3 is null");
            return (Criteria) this;
        }

        public Criteria andAddr3IsNotNull() {
            addCriterion("ADDR3 is not null");
            return (Criteria) this;
        }

        public Criteria andAddr3EqualTo(String value) {
            addCriterion("ADDR3 =", value, "addr3");
            return (Criteria) this;
        }

        public Criteria andAddr3NotEqualTo(String value) {
            addCriterion("ADDR3 <>", value, "addr3");
            return (Criteria) this;
        }

        public Criteria andAddr3GreaterThan(String value) {
            addCriterion("ADDR3 >", value, "addr3");
            return (Criteria) this;
        }

        public Criteria andAddr3GreaterThanOrEqualTo(String value) {
            addCriterion("ADDR3 >=", value, "addr3");
            return (Criteria) this;
        }

        public Criteria andAddr3LessThan(String value) {
            addCriterion("ADDR3 <", value, "addr3");
            return (Criteria) this;
        }

        public Criteria andAddr3LessThanOrEqualTo(String value) {
            addCriterion("ADDR3 <=", value, "addr3");
            return (Criteria) this;
        }

        public Criteria andAddr3Like(String value) {
            addCriterion("ADDR3 like", value, "addr3");
            return (Criteria) this;
        }

        public Criteria andAddr3NotLike(String value) {
            addCriterion("ADDR3 not like", value, "addr3");
            return (Criteria) this;
        }

        public Criteria andAddr3In(List<String> values) {
            addCriterion("ADDR3 in", values, "addr3");
            return (Criteria) this;
        }

        public Criteria andAddr3NotIn(List<String> values) {
            addCriterion("ADDR3 not in", values, "addr3");
            return (Criteria) this;
        }

        public Criteria andAddr3Between(String value1, String value2) {
            addCriterion("ADDR3 between", value1, value2, "addr3");
            return (Criteria) this;
        }

        public Criteria andAddr3NotBetween(String value1, String value2) {
            addCriterion("ADDR3 not between", value1, value2, "addr3");
            return (Criteria) this;
        }

        public Criteria andAddr4IsNull() {
            addCriterion("ADDR4 is null");
            return (Criteria) this;
        }

        public Criteria andAddr4IsNotNull() {
            addCriterion("ADDR4 is not null");
            return (Criteria) this;
        }

        public Criteria andAddr4EqualTo(String value) {
            addCriterion("ADDR4 =", value, "addr4");
            return (Criteria) this;
        }

        public Criteria andAddr4NotEqualTo(String value) {
            addCriterion("ADDR4 <>", value, "addr4");
            return (Criteria) this;
        }

        public Criteria andAddr4GreaterThan(String value) {
            addCriterion("ADDR4 >", value, "addr4");
            return (Criteria) this;
        }

        public Criteria andAddr4GreaterThanOrEqualTo(String value) {
            addCriterion("ADDR4 >=", value, "addr4");
            return (Criteria) this;
        }

        public Criteria andAddr4LessThan(String value) {
            addCriterion("ADDR4 <", value, "addr4");
            return (Criteria) this;
        }

        public Criteria andAddr4LessThanOrEqualTo(String value) {
            addCriterion("ADDR4 <=", value, "addr4");
            return (Criteria) this;
        }

        public Criteria andAddr4Like(String value) {
            addCriterion("ADDR4 like", value, "addr4");
            return (Criteria) this;
        }

        public Criteria andAddr4NotLike(String value) {
            addCriterion("ADDR4 not like", value, "addr4");
            return (Criteria) this;
        }

        public Criteria andAddr4In(List<String> values) {
            addCriterion("ADDR4 in", values, "addr4");
            return (Criteria) this;
        }

        public Criteria andAddr4NotIn(List<String> values) {
            addCriterion("ADDR4 not in", values, "addr4");
            return (Criteria) this;
        }

        public Criteria andAddr4Between(String value1, String value2) {
            addCriterion("ADDR4 between", value1, value2, "addr4");
            return (Criteria) this;
        }

        public Criteria andAddr4NotBetween(String value1, String value2) {
            addCriterion("ADDR4 not between", value1, value2, "addr4");
            return (Criteria) this;
        }

        public Criteria andInvoiceTemplateCodeIsNull() {
            addCriterion("INVOICE_TEMPLATE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTemplateCodeIsNotNull() {
            addCriterion("INVOICE_TEMPLATE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTemplateCodeEqualTo(String value) {
            addCriterion("INVOICE_TEMPLATE_CODE =", value, "invoiceTemplateCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTemplateCodeNotEqualTo(String value) {
            addCriterion("INVOICE_TEMPLATE_CODE <>", value, "invoiceTemplateCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTemplateCodeGreaterThan(String value) {
            addCriterion("INVOICE_TEMPLATE_CODE >", value, "invoiceTemplateCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTemplateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TEMPLATE_CODE >=", value, "invoiceTemplateCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTemplateCodeLessThan(String value) {
            addCriterion("INVOICE_TEMPLATE_CODE <", value, "invoiceTemplateCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTemplateCodeLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TEMPLATE_CODE <=", value, "invoiceTemplateCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTemplateCodeLike(String value) {
            addCriterion("INVOICE_TEMPLATE_CODE like", value, "invoiceTemplateCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTemplateCodeNotLike(String value) {
            addCriterion("INVOICE_TEMPLATE_CODE not like", value, "invoiceTemplateCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTemplateCodeIn(List<String> values) {
            addCriterion("INVOICE_TEMPLATE_CODE in", values, "invoiceTemplateCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTemplateCodeNotIn(List<String> values) {
            addCriterion("INVOICE_TEMPLATE_CODE not in", values, "invoiceTemplateCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTemplateCodeBetween(String value1, String value2) {
            addCriterion("INVOICE_TEMPLATE_CODE between", value1, value2, "invoiceTemplateCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTemplateCodeNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TEMPLATE_CODE not between", value1, value2, "invoiceTemplateCode");
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