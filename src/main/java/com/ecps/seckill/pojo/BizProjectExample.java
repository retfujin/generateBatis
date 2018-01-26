package com.ecps.seckill.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BizProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BizProjectExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andChangeStateIsNull() {
            addCriterion("change_state is null");
            return (Criteria) this;
        }

        public Criteria andChangeStateIsNotNull() {
            addCriterion("change_state is not null");
            return (Criteria) this;
        }

        public Criteria andChangeStateEqualTo(String value) {
            addCriterion("change_state =", value, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateNotEqualTo(String value) {
            addCriterion("change_state <>", value, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateGreaterThan(String value) {
            addCriterion("change_state >", value, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateGreaterThanOrEqualTo(String value) {
            addCriterion("change_state >=", value, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateLessThan(String value) {
            addCriterion("change_state <", value, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateLessThanOrEqualTo(String value) {
            addCriterion("change_state <=", value, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateLike(String value) {
            addCriterion("change_state like", value, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateNotLike(String value) {
            addCriterion("change_state not like", value, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateIn(List<String> values) {
            addCriterion("change_state in", values, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateNotIn(List<String> values) {
            addCriterion("change_state not in", values, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateBetween(String value1, String value2) {
            addCriterion("change_state between", value1, value2, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateNotBetween(String value1, String value2) {
            addCriterion("change_state not between", value1, value2, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeIdIsNull() {
            addCriterion("change_id is null");
            return (Criteria) this;
        }

        public Criteria andChangeIdIsNotNull() {
            addCriterion("change_id is not null");
            return (Criteria) this;
        }

        public Criteria andChangeIdEqualTo(String value) {
            addCriterion("change_id =", value, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdNotEqualTo(String value) {
            addCriterion("change_id <>", value, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdGreaterThan(String value) {
            addCriterion("change_id >", value, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdGreaterThanOrEqualTo(String value) {
            addCriterion("change_id >=", value, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdLessThan(String value) {
            addCriterion("change_id <", value, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdLessThanOrEqualTo(String value) {
            addCriterion("change_id <=", value, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdLike(String value) {
            addCriterion("change_id like", value, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdNotLike(String value) {
            addCriterion("change_id not like", value, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdIn(List<String> values) {
            addCriterion("change_id in", values, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdNotIn(List<String> values) {
            addCriterion("change_id not in", values, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdBetween(String value1, String value2) {
            addCriterion("change_id between", value1, value2, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdNotBetween(String value1, String value2) {
            addCriterion("change_id not between", value1, value2, "changeId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("customer_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("customer_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(String value) {
            addCriterion("customer_type =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(String value) {
            addCriterion("customer_type <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(String value) {
            addCriterion("customer_type >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_type >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(String value) {
            addCriterion("customer_type <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(String value) {
            addCriterion("customer_type <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLike(String value) {
            addCriterion("customer_type like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotLike(String value) {
            addCriterion("customer_type not like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<String> values) {
            addCriterion("customer_type in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<String> values) {
            addCriterion("customer_type not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(String value1, String value2) {
            addCriterion("customer_type between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(String value1, String value2) {
            addCriterion("customer_type not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andOfficeIdIsNull() {
            addCriterion("office_id is null");
            return (Criteria) this;
        }

        public Criteria andOfficeIdIsNotNull() {
            addCriterion("office_id is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeIdEqualTo(String value) {
            addCriterion("office_id =", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdNotEqualTo(String value) {
            addCriterion("office_id <>", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdGreaterThan(String value) {
            addCriterion("office_id >", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdGreaterThanOrEqualTo(String value) {
            addCriterion("office_id >=", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdLessThan(String value) {
            addCriterion("office_id <", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdLessThanOrEqualTo(String value) {
            addCriterion("office_id <=", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdLike(String value) {
            addCriterion("office_id like", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdNotLike(String value) {
            addCriterion("office_id not like", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdIn(List<String> values) {
            addCriterion("office_id in", values, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdNotIn(List<String> values) {
            addCriterion("office_id not in", values, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdBetween(String value1, String value2) {
            addCriterion("office_id between", value1, value2, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdNotBetween(String value1, String value2) {
            addCriterion("office_id not between", value1, value2, "officeId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("business_type like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("business_type not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("product_type like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("product_type not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andBusiCodeIsNull() {
            addCriterion("busi_code is null");
            return (Criteria) this;
        }

        public Criteria andBusiCodeIsNotNull() {
            addCriterion("busi_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusiCodeEqualTo(String value) {
            addCriterion("busi_code =", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotEqualTo(String value) {
            addCriterion("busi_code <>", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeGreaterThan(String value) {
            addCriterion("busi_code >", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeGreaterThanOrEqualTo(String value) {
            addCriterion("busi_code >=", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeLessThan(String value) {
            addCriterion("busi_code <", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeLessThanOrEqualTo(String value) {
            addCriterion("busi_code <=", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeLike(String value) {
            addCriterion("busi_code like", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotLike(String value) {
            addCriterion("busi_code not like", value, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeIn(List<String> values) {
            addCriterion("busi_code in", values, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotIn(List<String> values) {
            addCriterion("busi_code not in", values, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeBetween(String value1, String value2) {
            addCriterion("busi_code between", value1, value2, "busiCode");
            return (Criteria) this;
        }

        public Criteria andBusiCodeNotBetween(String value1, String value2) {
            addCriterion("busi_code not between", value1, value2, "busiCode");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountIsNull() {
            addCriterion("financing_amount is null");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountIsNotNull() {
            addCriterion("financing_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountEqualTo(BigDecimal value) {
            addCriterion("financing_amount =", value, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountNotEqualTo(BigDecimal value) {
            addCriterion("financing_amount <>", value, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountGreaterThan(BigDecimal value) {
            addCriterion("financing_amount >", value, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("financing_amount >=", value, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountLessThan(BigDecimal value) {
            addCriterion("financing_amount <", value, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("financing_amount <=", value, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountIn(List<BigDecimal> values) {
            addCriterion("financing_amount in", values, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountNotIn(List<BigDecimal> values) {
            addCriterion("financing_amount not in", values, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("financing_amount between", value1, value2, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("financing_amount not between", value1, value2, "financingAmount");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNull() {
            addCriterion("time_limit is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNotNull() {
            addCriterion("time_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEqualTo(Integer value) {
            addCriterion("time_limit =", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotEqualTo(Integer value) {
            addCriterion("time_limit <>", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThan(Integer value) {
            addCriterion("time_limit >", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_limit >=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThan(Integer value) {
            addCriterion("time_limit <", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThanOrEqualTo(Integer value) {
            addCriterion("time_limit <=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIn(List<Integer> values) {
            addCriterion("time_limit in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotIn(List<Integer> values) {
            addCriterion("time_limit not in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitBetween(Integer value1, Integer value2) {
            addCriterion("time_limit between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("time_limit not between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andFinancingPurposesIsNull() {
            addCriterion("financing_purposes is null");
            return (Criteria) this;
        }

        public Criteria andFinancingPurposesIsNotNull() {
            addCriterion("financing_purposes is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingPurposesEqualTo(String value) {
            addCriterion("financing_purposes =", value, "financingPurposes");
            return (Criteria) this;
        }

        public Criteria andFinancingPurposesNotEqualTo(String value) {
            addCriterion("financing_purposes <>", value, "financingPurposes");
            return (Criteria) this;
        }

        public Criteria andFinancingPurposesGreaterThan(String value) {
            addCriterion("financing_purposes >", value, "financingPurposes");
            return (Criteria) this;
        }

        public Criteria andFinancingPurposesGreaterThanOrEqualTo(String value) {
            addCriterion("financing_purposes >=", value, "financingPurposes");
            return (Criteria) this;
        }

        public Criteria andFinancingPurposesLessThan(String value) {
            addCriterion("financing_purposes <", value, "financingPurposes");
            return (Criteria) this;
        }

        public Criteria andFinancingPurposesLessThanOrEqualTo(String value) {
            addCriterion("financing_purposes <=", value, "financingPurposes");
            return (Criteria) this;
        }

        public Criteria andFinancingPurposesLike(String value) {
            addCriterion("financing_purposes like", value, "financingPurposes");
            return (Criteria) this;
        }

        public Criteria andFinancingPurposesNotLike(String value) {
            addCriterion("financing_purposes not like", value, "financingPurposes");
            return (Criteria) this;
        }

        public Criteria andFinancingPurposesIn(List<String> values) {
            addCriterion("financing_purposes in", values, "financingPurposes");
            return (Criteria) this;
        }

        public Criteria andFinancingPurposesNotIn(List<String> values) {
            addCriterion("financing_purposes not in", values, "financingPurposes");
            return (Criteria) this;
        }

        public Criteria andFinancingPurposesBetween(String value1, String value2) {
            addCriterion("financing_purposes between", value1, value2, "financingPurposes");
            return (Criteria) this;
        }

        public Criteria andFinancingPurposesNotBetween(String value1, String value2) {
            addCriterion("financing_purposes not between", value1, value2, "financingPurposes");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderIsNull() {
            addCriterion("project_leader is null");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderIsNotNull() {
            addCriterion("project_leader is not null");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderEqualTo(String value) {
            addCriterion("project_leader =", value, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNotEqualTo(String value) {
            addCriterion("project_leader <>", value, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderGreaterThan(String value) {
            addCriterion("project_leader >", value, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("project_leader >=", value, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderLessThan(String value) {
            addCriterion("project_leader <", value, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderLessThanOrEqualTo(String value) {
            addCriterion("project_leader <=", value, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderLike(String value) {
            addCriterion("project_leader like", value, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNotLike(String value) {
            addCriterion("project_leader not like", value, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderIn(List<String> values) {
            addCriterion("project_leader in", values, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNotIn(List<String> values) {
            addCriterion("project_leader not in", values, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderBetween(String value1, String value2) {
            addCriterion("project_leader between", value1, value2, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNotBetween(String value1, String value2) {
            addCriterion("project_leader not between", value1, value2, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectManageraIsNull() {
            addCriterion("project_managera is null");
            return (Criteria) this;
        }

        public Criteria andProjectManageraIsNotNull() {
            addCriterion("project_managera is not null");
            return (Criteria) this;
        }

        public Criteria andProjectManageraEqualTo(String value) {
            addCriterion("project_managera =", value, "projectManagera");
            return (Criteria) this;
        }

        public Criteria andProjectManageraNotEqualTo(String value) {
            addCriterion("project_managera <>", value, "projectManagera");
            return (Criteria) this;
        }

        public Criteria andProjectManageraGreaterThan(String value) {
            addCriterion("project_managera >", value, "projectManagera");
            return (Criteria) this;
        }

        public Criteria andProjectManageraGreaterThanOrEqualTo(String value) {
            addCriterion("project_managera >=", value, "projectManagera");
            return (Criteria) this;
        }

        public Criteria andProjectManageraLessThan(String value) {
            addCriterion("project_managera <", value, "projectManagera");
            return (Criteria) this;
        }

        public Criteria andProjectManageraLessThanOrEqualTo(String value) {
            addCriterion("project_managera <=", value, "projectManagera");
            return (Criteria) this;
        }

        public Criteria andProjectManageraLike(String value) {
            addCriterion("project_managera like", value, "projectManagera");
            return (Criteria) this;
        }

        public Criteria andProjectManageraNotLike(String value) {
            addCriterion("project_managera not like", value, "projectManagera");
            return (Criteria) this;
        }

        public Criteria andProjectManageraIn(List<String> values) {
            addCriterion("project_managera in", values, "projectManagera");
            return (Criteria) this;
        }

        public Criteria andProjectManageraNotIn(List<String> values) {
            addCriterion("project_managera not in", values, "projectManagera");
            return (Criteria) this;
        }

        public Criteria andProjectManageraBetween(String value1, String value2) {
            addCriterion("project_managera between", value1, value2, "projectManagera");
            return (Criteria) this;
        }

        public Criteria andProjectManageraNotBetween(String value1, String value2) {
            addCriterion("project_managera not between", value1, value2, "projectManagera");
            return (Criteria) this;
        }

        public Criteria andProjectManagerbIsNull() {
            addCriterion("project_managerb is null");
            return (Criteria) this;
        }

        public Criteria andProjectManagerbIsNotNull() {
            addCriterion("project_managerb is not null");
            return (Criteria) this;
        }

        public Criteria andProjectManagerbEqualTo(String value) {
            addCriterion("project_managerb =", value, "projectManagerb");
            return (Criteria) this;
        }

        public Criteria andProjectManagerbNotEqualTo(String value) {
            addCriterion("project_managerb <>", value, "projectManagerb");
            return (Criteria) this;
        }

        public Criteria andProjectManagerbGreaterThan(String value) {
            addCriterion("project_managerb >", value, "projectManagerb");
            return (Criteria) this;
        }

        public Criteria andProjectManagerbGreaterThanOrEqualTo(String value) {
            addCriterion("project_managerb >=", value, "projectManagerb");
            return (Criteria) this;
        }

        public Criteria andProjectManagerbLessThan(String value) {
            addCriterion("project_managerb <", value, "projectManagerb");
            return (Criteria) this;
        }

        public Criteria andProjectManagerbLessThanOrEqualTo(String value) {
            addCriterion("project_managerb <=", value, "projectManagerb");
            return (Criteria) this;
        }

        public Criteria andProjectManagerbLike(String value) {
            addCriterion("project_managerb like", value, "projectManagerb");
            return (Criteria) this;
        }

        public Criteria andProjectManagerbNotLike(String value) {
            addCriterion("project_managerb not like", value, "projectManagerb");
            return (Criteria) this;
        }

        public Criteria andProjectManagerbIn(List<String> values) {
            addCriterion("project_managerb in", values, "projectManagerb");
            return (Criteria) this;
        }

        public Criteria andProjectManagerbNotIn(List<String> values) {
            addCriterion("project_managerb not in", values, "projectManagerb");
            return (Criteria) this;
        }

        public Criteria andProjectManagerbBetween(String value1, String value2) {
            addCriterion("project_managerb between", value1, value2, "projectManagerb");
            return (Criteria) this;
        }

        public Criteria andProjectManagerbNotBetween(String value1, String value2) {
            addCriterion("project_managerb not between", value1, value2, "projectManagerb");
            return (Criteria) this;
        }

        public Criteria andIsUrgentIsNull() {
            addCriterion("is_urgent is null");
            return (Criteria) this;
        }

        public Criteria andIsUrgentIsNotNull() {
            addCriterion("is_urgent is not null");
            return (Criteria) this;
        }

        public Criteria andIsUrgentEqualTo(String value) {
            addCriterion("is_urgent =", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentNotEqualTo(String value) {
            addCriterion("is_urgent <>", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentGreaterThan(String value) {
            addCriterion("is_urgent >", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentGreaterThanOrEqualTo(String value) {
            addCriterion("is_urgent >=", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentLessThan(String value) {
            addCriterion("is_urgent <", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentLessThanOrEqualTo(String value) {
            addCriterion("is_urgent <=", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentLike(String value) {
            addCriterion("is_urgent like", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentNotLike(String value) {
            addCriterion("is_urgent not like", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentIn(List<String> values) {
            addCriterion("is_urgent in", values, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentNotIn(List<String> values) {
            addCriterion("is_urgent not in", values, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentBetween(String value1, String value2) {
            addCriterion("is_urgent between", value1, value2, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentNotBetween(String value1, String value2) {
            addCriterion("is_urgent not between", value1, value2, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andRentTypeIsNull() {
            addCriterion("rent_type is null");
            return (Criteria) this;
        }

        public Criteria andRentTypeIsNotNull() {
            addCriterion("rent_type is not null");
            return (Criteria) this;
        }

        public Criteria andRentTypeEqualTo(String value) {
            addCriterion("rent_type =", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotEqualTo(String value) {
            addCriterion("rent_type <>", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeGreaterThan(String value) {
            addCriterion("rent_type >", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rent_type >=", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeLessThan(String value) {
            addCriterion("rent_type <", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeLessThanOrEqualTo(String value) {
            addCriterion("rent_type <=", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeLike(String value) {
            addCriterion("rent_type like", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotLike(String value) {
            addCriterion("rent_type not like", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeIn(List<String> values) {
            addCriterion("rent_type in", values, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotIn(List<String> values) {
            addCriterion("rent_type not in", values, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeBetween(String value1, String value2) {
            addCriterion("rent_type between", value1, value2, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotBetween(String value1, String value2) {
            addCriterion("rent_type not between", value1, value2, "rentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodIsNull() {
            addCriterion("repayment_method is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodIsNotNull() {
            addCriterion("repayment_method is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodEqualTo(String value) {
            addCriterion("repayment_method =", value, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodNotEqualTo(String value) {
            addCriterion("repayment_method <>", value, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodGreaterThan(String value) {
            addCriterion("repayment_method >", value, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_method >=", value, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodLessThan(String value) {
            addCriterion("repayment_method <", value, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodLessThanOrEqualTo(String value) {
            addCriterion("repayment_method <=", value, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodLike(String value) {
            addCriterion("repayment_method like", value, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodNotLike(String value) {
            addCriterion("repayment_method not like", value, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodIn(List<String> values) {
            addCriterion("repayment_method in", values, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodNotIn(List<String> values) {
            addCriterion("repayment_method not in", values, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodBetween(String value1, String value2) {
            addCriterion("repayment_method between", value1, value2, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodNotBetween(String value1, String value2) {
            addCriterion("repayment_method not between", value1, value2, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPayFrequencyIsNull() {
            addCriterion("pay_frequency is null");
            return (Criteria) this;
        }

        public Criteria andPayFrequencyIsNotNull() {
            addCriterion("pay_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andPayFrequencyEqualTo(Integer value) {
            addCriterion("pay_frequency =", value, "payFrequency");
            return (Criteria) this;
        }

        public Criteria andPayFrequencyNotEqualTo(Integer value) {
            addCriterion("pay_frequency <>", value, "payFrequency");
            return (Criteria) this;
        }

        public Criteria andPayFrequencyGreaterThan(Integer value) {
            addCriterion("pay_frequency >", value, "payFrequency");
            return (Criteria) this;
        }

        public Criteria andPayFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_frequency >=", value, "payFrequency");
            return (Criteria) this;
        }

        public Criteria andPayFrequencyLessThan(Integer value) {
            addCriterion("pay_frequency <", value, "payFrequency");
            return (Criteria) this;
        }

        public Criteria andPayFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("pay_frequency <=", value, "payFrequency");
            return (Criteria) this;
        }

        public Criteria andPayFrequencyIn(List<Integer> values) {
            addCriterion("pay_frequency in", values, "payFrequency");
            return (Criteria) this;
        }

        public Criteria andPayFrequencyNotIn(List<Integer> values) {
            addCriterion("pay_frequency not in", values, "payFrequency");
            return (Criteria) this;
        }

        public Criteria andPayFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("pay_frequency between", value1, value2, "payFrequency");
            return (Criteria) this;
        }

        public Criteria andPayFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_frequency not between", value1, value2, "payFrequency");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentProportionIsNull() {
            addCriterion("balance_payment_proportion is null");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentProportionIsNotNull() {
            addCriterion("balance_payment_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentProportionEqualTo(Float value) {
            addCriterion("balance_payment_proportion =", value, "balancePaymentProportion");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentProportionNotEqualTo(Float value) {
            addCriterion("balance_payment_proportion <>", value, "balancePaymentProportion");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentProportionGreaterThan(Float value) {
            addCriterion("balance_payment_proportion >", value, "balancePaymentProportion");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentProportionGreaterThanOrEqualTo(Float value) {
            addCriterion("balance_payment_proportion >=", value, "balancePaymentProportion");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentProportionLessThan(Float value) {
            addCriterion("balance_payment_proportion <", value, "balancePaymentProportion");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentProportionLessThanOrEqualTo(Float value) {
            addCriterion("balance_payment_proportion <=", value, "balancePaymentProportion");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentProportionIn(List<Float> values) {
            addCriterion("balance_payment_proportion in", values, "balancePaymentProportion");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentProportionNotIn(List<Float> values) {
            addCriterion("balance_payment_proportion not in", values, "balancePaymentProportion");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentProportionBetween(Float value1, Float value2) {
            addCriterion("balance_payment_proportion between", value1, value2, "balancePaymentProportion");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentProportionNotBetween(Float value1, Float value2) {
            addCriterion("balance_payment_proportion not between", value1, value2, "balancePaymentProportion");
            return (Criteria) this;
        }

        public Criteria andEarningsRatioIsNull() {
            addCriterion("earnings_ratio is null");
            return (Criteria) this;
        }

        public Criteria andEarningsRatioIsNotNull() {
            addCriterion("earnings_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andEarningsRatioEqualTo(Float value) {
            addCriterion("earnings_ratio =", value, "earningsRatio");
            return (Criteria) this;
        }

        public Criteria andEarningsRatioNotEqualTo(Float value) {
            addCriterion("earnings_ratio <>", value, "earningsRatio");
            return (Criteria) this;
        }

        public Criteria andEarningsRatioGreaterThan(Float value) {
            addCriterion("earnings_ratio >", value, "earningsRatio");
            return (Criteria) this;
        }

        public Criteria andEarningsRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("earnings_ratio >=", value, "earningsRatio");
            return (Criteria) this;
        }

        public Criteria andEarningsRatioLessThan(Float value) {
            addCriterion("earnings_ratio <", value, "earningsRatio");
            return (Criteria) this;
        }

        public Criteria andEarningsRatioLessThanOrEqualTo(Float value) {
            addCriterion("earnings_ratio <=", value, "earningsRatio");
            return (Criteria) this;
        }

        public Criteria andEarningsRatioIn(List<Float> values) {
            addCriterion("earnings_ratio in", values, "earningsRatio");
            return (Criteria) this;
        }

        public Criteria andEarningsRatioNotIn(List<Float> values) {
            addCriterion("earnings_ratio not in", values, "earningsRatio");
            return (Criteria) this;
        }

        public Criteria andEarningsRatioBetween(Float value1, Float value2) {
            addCriterion("earnings_ratio between", value1, value2, "earningsRatio");
            return (Criteria) this;
        }

        public Criteria andEarningsRatioNotBetween(Float value1, Float value2) {
            addCriterion("earnings_ratio not between", value1, value2, "earningsRatio");
            return (Criteria) this;
        }

        public Criteria andPaymentRatioIsNull() {
            addCriterion("payment_ratio is null");
            return (Criteria) this;
        }

        public Criteria andPaymentRatioIsNotNull() {
            addCriterion("payment_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentRatioEqualTo(Float value) {
            addCriterion("payment_ratio =", value, "paymentRatio");
            return (Criteria) this;
        }

        public Criteria andPaymentRatioNotEqualTo(Float value) {
            addCriterion("payment_ratio <>", value, "paymentRatio");
            return (Criteria) this;
        }

        public Criteria andPaymentRatioGreaterThan(Float value) {
            addCriterion("payment_ratio >", value, "paymentRatio");
            return (Criteria) this;
        }

        public Criteria andPaymentRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("payment_ratio >=", value, "paymentRatio");
            return (Criteria) this;
        }

        public Criteria andPaymentRatioLessThan(Float value) {
            addCriterion("payment_ratio <", value, "paymentRatio");
            return (Criteria) this;
        }

        public Criteria andPaymentRatioLessThanOrEqualTo(Float value) {
            addCriterion("payment_ratio <=", value, "paymentRatio");
            return (Criteria) this;
        }

        public Criteria andPaymentRatioIn(List<Float> values) {
            addCriterion("payment_ratio in", values, "paymentRatio");
            return (Criteria) this;
        }

        public Criteria andPaymentRatioNotIn(List<Float> values) {
            addCriterion("payment_ratio not in", values, "paymentRatio");
            return (Criteria) this;
        }

        public Criteria andPaymentRatioBetween(Float value1, Float value2) {
            addCriterion("payment_ratio between", value1, value2, "paymentRatio");
            return (Criteria) this;
        }

        public Criteria andPaymentRatioNotBetween(Float value1, Float value2) {
            addCriterion("payment_ratio not between", value1, value2, "paymentRatio");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentAmountIsNull() {
            addCriterion("balance_payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentAmountIsNotNull() {
            addCriterion("balance_payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentAmountEqualTo(BigDecimal value) {
            addCriterion("balance_payment_amount =", value, "balancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentAmountNotEqualTo(BigDecimal value) {
            addCriterion("balance_payment_amount <>", value, "balancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentAmountGreaterThan(BigDecimal value) {
            addCriterion("balance_payment_amount >", value, "balancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance_payment_amount >=", value, "balancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentAmountLessThan(BigDecimal value) {
            addCriterion("balance_payment_amount <", value, "balancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance_payment_amount <=", value, "balancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentAmountIn(List<BigDecimal> values) {
            addCriterion("balance_payment_amount in", values, "balancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentAmountNotIn(List<BigDecimal> values) {
            addCriterion("balance_payment_amount not in", values, "balancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance_payment_amount between", value1, value2, "balancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance_payment_amount not between", value1, value2, "balancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("discount_amount =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("discount_amount <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("discount_amount >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(BigDecimal value) {
            addCriterion("discount_amount <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("discount_amount in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("discount_amount not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayIsNull() {
            addCriterion("repayment_way is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayIsNotNull() {
            addCriterion("repayment_way is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayEqualTo(String value) {
            addCriterion("repayment_way =", value, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayNotEqualTo(String value) {
            addCriterion("repayment_way <>", value, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayGreaterThan(String value) {
            addCriterion("repayment_way >", value, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_way >=", value, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayLessThan(String value) {
            addCriterion("repayment_way <", value, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayLessThanOrEqualTo(String value) {
            addCriterion("repayment_way <=", value, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayLike(String value) {
            addCriterion("repayment_way like", value, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayNotLike(String value) {
            addCriterion("repayment_way not like", value, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayIn(List<String> values) {
            addCriterion("repayment_way in", values, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayNotIn(List<String> values) {
            addCriterion("repayment_way not in", values, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayBetween(String value1, String value2) {
            addCriterion("repayment_way between", value1, value2, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayNotBetween(String value1, String value2) {
            addCriterion("repayment_way not between", value1, value2, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateIsNull() {
            addCriterion("annual_interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateIsNotNull() {
            addCriterion("annual_interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateEqualTo(Float value) {
            addCriterion("annual_interest_rate =", value, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateNotEqualTo(Float value) {
            addCriterion("annual_interest_rate <>", value, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateGreaterThan(Float value) {
            addCriterion("annual_interest_rate >", value, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateGreaterThanOrEqualTo(Float value) {
            addCriterion("annual_interest_rate >=", value, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateLessThan(Float value) {
            addCriterion("annual_interest_rate <", value, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateLessThanOrEqualTo(Float value) {
            addCriterion("annual_interest_rate <=", value, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateIn(List<Float> values) {
            addCriterion("annual_interest_rate in", values, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateNotIn(List<Float> values) {
            addCriterion("annual_interest_rate not in", values, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateBetween(Float value1, Float value2) {
            addCriterion("annual_interest_rate between", value1, value2, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andAnnualInterestRateNotBetween(Float value1, Float value2) {
            addCriterion("annual_interest_rate not between", value1, value2, "annualInterestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateTypeIsNull() {
            addCriterion("interest_rate_type is null");
            return (Criteria) this;
        }

        public Criteria andInterestRateTypeIsNotNull() {
            addCriterion("interest_rate_type is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRateTypeEqualTo(String value) {
            addCriterion("interest_rate_type =", value, "interestRateType");
            return (Criteria) this;
        }

        public Criteria andInterestRateTypeNotEqualTo(String value) {
            addCriterion("interest_rate_type <>", value, "interestRateType");
            return (Criteria) this;
        }

        public Criteria andInterestRateTypeGreaterThan(String value) {
            addCriterion("interest_rate_type >", value, "interestRateType");
            return (Criteria) this;
        }

        public Criteria andInterestRateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("interest_rate_type >=", value, "interestRateType");
            return (Criteria) this;
        }

        public Criteria andInterestRateTypeLessThan(String value) {
            addCriterion("interest_rate_type <", value, "interestRateType");
            return (Criteria) this;
        }

        public Criteria andInterestRateTypeLessThanOrEqualTo(String value) {
            addCriterion("interest_rate_type <=", value, "interestRateType");
            return (Criteria) this;
        }

        public Criteria andInterestRateTypeLike(String value) {
            addCriterion("interest_rate_type like", value, "interestRateType");
            return (Criteria) this;
        }

        public Criteria andInterestRateTypeNotLike(String value) {
            addCriterion("interest_rate_type not like", value, "interestRateType");
            return (Criteria) this;
        }

        public Criteria andInterestRateTypeIn(List<String> values) {
            addCriterion("interest_rate_type in", values, "interestRateType");
            return (Criteria) this;
        }

        public Criteria andInterestRateTypeNotIn(List<String> values) {
            addCriterion("interest_rate_type not in", values, "interestRateType");
            return (Criteria) this;
        }

        public Criteria andInterestRateTypeBetween(String value1, String value2) {
            addCriterion("interest_rate_type between", value1, value2, "interestRateType");
            return (Criteria) this;
        }

        public Criteria andInterestRateTypeNotBetween(String value1, String value2) {
            addCriterion("interest_rate_type not between", value1, value2, "interestRateType");
            return (Criteria) this;
        }

        public Criteria andRentalItemPropertiesIsNull() {
            addCriterion("rental_item_properties is null");
            return (Criteria) this;
        }

        public Criteria andRentalItemPropertiesIsNotNull() {
            addCriterion("rental_item_properties is not null");
            return (Criteria) this;
        }

        public Criteria andRentalItemPropertiesEqualTo(String value) {
            addCriterion("rental_item_properties =", value, "rentalItemProperties");
            return (Criteria) this;
        }

        public Criteria andRentalItemPropertiesNotEqualTo(String value) {
            addCriterion("rental_item_properties <>", value, "rentalItemProperties");
            return (Criteria) this;
        }

        public Criteria andRentalItemPropertiesGreaterThan(String value) {
            addCriterion("rental_item_properties >", value, "rentalItemProperties");
            return (Criteria) this;
        }

        public Criteria andRentalItemPropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("rental_item_properties >=", value, "rentalItemProperties");
            return (Criteria) this;
        }

        public Criteria andRentalItemPropertiesLessThan(String value) {
            addCriterion("rental_item_properties <", value, "rentalItemProperties");
            return (Criteria) this;
        }

        public Criteria andRentalItemPropertiesLessThanOrEqualTo(String value) {
            addCriterion("rental_item_properties <=", value, "rentalItemProperties");
            return (Criteria) this;
        }

        public Criteria andRentalItemPropertiesLike(String value) {
            addCriterion("rental_item_properties like", value, "rentalItemProperties");
            return (Criteria) this;
        }

        public Criteria andRentalItemPropertiesNotLike(String value) {
            addCriterion("rental_item_properties not like", value, "rentalItemProperties");
            return (Criteria) this;
        }

        public Criteria andRentalItemPropertiesIn(List<String> values) {
            addCriterion("rental_item_properties in", values, "rentalItemProperties");
            return (Criteria) this;
        }

        public Criteria andRentalItemPropertiesNotIn(List<String> values) {
            addCriterion("rental_item_properties not in", values, "rentalItemProperties");
            return (Criteria) this;
        }

        public Criteria andRentalItemPropertiesBetween(String value1, String value2) {
            addCriterion("rental_item_properties between", value1, value2, "rentalItemProperties");
            return (Criteria) this;
        }

        public Criteria andRentalItemPropertiesNotBetween(String value1, String value2) {
            addCriterion("rental_item_properties not between", value1, value2, "rentalItemProperties");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentRateIsNull() {
            addCriterion("first_payment_rate is null");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentRateIsNotNull() {
            addCriterion("first_payment_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentRateEqualTo(Float value) {
            addCriterion("first_payment_rate =", value, "firstPaymentRate");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentRateNotEqualTo(Float value) {
            addCriterion("first_payment_rate <>", value, "firstPaymentRate");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentRateGreaterThan(Float value) {
            addCriterion("first_payment_rate >", value, "firstPaymentRate");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentRateGreaterThanOrEqualTo(Float value) {
            addCriterion("first_payment_rate >=", value, "firstPaymentRate");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentRateLessThan(Float value) {
            addCriterion("first_payment_rate <", value, "firstPaymentRate");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentRateLessThanOrEqualTo(Float value) {
            addCriterion("first_payment_rate <=", value, "firstPaymentRate");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentRateIn(List<Float> values) {
            addCriterion("first_payment_rate in", values, "firstPaymentRate");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentRateNotIn(List<Float> values) {
            addCriterion("first_payment_rate not in", values, "firstPaymentRate");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentRateBetween(Float value1, Float value2) {
            addCriterion("first_payment_rate between", value1, value2, "firstPaymentRate");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentRateNotBetween(Float value1, Float value2) {
            addCriterion("first_payment_rate not between", value1, value2, "firstPaymentRate");
            return (Criteria) this;
        }

        public Criteria andFirstRentIsNull() {
            addCriterion("first_rent is null");
            return (Criteria) this;
        }

        public Criteria andFirstRentIsNotNull() {
            addCriterion("first_rent is not null");
            return (Criteria) this;
        }

        public Criteria andFirstRentEqualTo(BigDecimal value) {
            addCriterion("first_rent =", value, "firstRent");
            return (Criteria) this;
        }

        public Criteria andFirstRentNotEqualTo(BigDecimal value) {
            addCriterion("first_rent <>", value, "firstRent");
            return (Criteria) this;
        }

        public Criteria andFirstRentGreaterThan(BigDecimal value) {
            addCriterion("first_rent >", value, "firstRent");
            return (Criteria) this;
        }

        public Criteria andFirstRentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_rent >=", value, "firstRent");
            return (Criteria) this;
        }

        public Criteria andFirstRentLessThan(BigDecimal value) {
            addCriterion("first_rent <", value, "firstRent");
            return (Criteria) this;
        }

        public Criteria andFirstRentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_rent <=", value, "firstRent");
            return (Criteria) this;
        }

        public Criteria andFirstRentIn(List<BigDecimal> values) {
            addCriterion("first_rent in", values, "firstRent");
            return (Criteria) this;
        }

        public Criteria andFirstRentNotIn(List<BigDecimal> values) {
            addCriterion("first_rent not in", values, "firstRent");
            return (Criteria) this;
        }

        public Criteria andFirstRentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_rent between", value1, value2, "firstRent");
            return (Criteria) this;
        }

        public Criteria andFirstRentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_rent not between", value1, value2, "firstRent");
            return (Criteria) this;
        }

        public Criteria andRentaloutWayIsNull() {
            addCriterion("rentalout_way is null");
            return (Criteria) this;
        }

        public Criteria andRentaloutWayIsNotNull() {
            addCriterion("rentalout_way is not null");
            return (Criteria) this;
        }

        public Criteria andRentaloutWayEqualTo(String value) {
            addCriterion("rentalout_way =", value, "rentaloutWay");
            return (Criteria) this;
        }

        public Criteria andRentaloutWayNotEqualTo(String value) {
            addCriterion("rentalout_way <>", value, "rentaloutWay");
            return (Criteria) this;
        }

        public Criteria andRentaloutWayGreaterThan(String value) {
            addCriterion("rentalout_way >", value, "rentaloutWay");
            return (Criteria) this;
        }

        public Criteria andRentaloutWayGreaterThanOrEqualTo(String value) {
            addCriterion("rentalout_way >=", value, "rentaloutWay");
            return (Criteria) this;
        }

        public Criteria andRentaloutWayLessThan(String value) {
            addCriterion("rentalout_way <", value, "rentaloutWay");
            return (Criteria) this;
        }

        public Criteria andRentaloutWayLessThanOrEqualTo(String value) {
            addCriterion("rentalout_way <=", value, "rentaloutWay");
            return (Criteria) this;
        }

        public Criteria andRentaloutWayLike(String value) {
            addCriterion("rentalout_way like", value, "rentaloutWay");
            return (Criteria) this;
        }

        public Criteria andRentaloutWayNotLike(String value) {
            addCriterion("rentalout_way not like", value, "rentaloutWay");
            return (Criteria) this;
        }

        public Criteria andRentaloutWayIn(List<String> values) {
            addCriterion("rentalout_way in", values, "rentaloutWay");
            return (Criteria) this;
        }

        public Criteria andRentaloutWayNotIn(List<String> values) {
            addCriterion("rentalout_way not in", values, "rentaloutWay");
            return (Criteria) this;
        }

        public Criteria andRentaloutWayBetween(String value1, String value2) {
            addCriterion("rentalout_way between", value1, value2, "rentaloutWay");
            return (Criteria) this;
        }

        public Criteria andRentaloutWayNotBetween(String value1, String value2) {
            addCriterion("rentalout_way not between", value1, value2, "rentaloutWay");
            return (Criteria) this;
        }

        public Criteria andMarginRateIsNull() {
            addCriterion("margin_rate is null");
            return (Criteria) this;
        }

        public Criteria andMarginRateIsNotNull() {
            addCriterion("margin_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMarginRateEqualTo(Float value) {
            addCriterion("margin_rate =", value, "marginRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateNotEqualTo(Float value) {
            addCriterion("margin_rate <>", value, "marginRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateGreaterThan(Float value) {
            addCriterion("margin_rate >", value, "marginRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateGreaterThanOrEqualTo(Float value) {
            addCriterion("margin_rate >=", value, "marginRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateLessThan(Float value) {
            addCriterion("margin_rate <", value, "marginRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateLessThanOrEqualTo(Float value) {
            addCriterion("margin_rate <=", value, "marginRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateIn(List<Float> values) {
            addCriterion("margin_rate in", values, "marginRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateNotIn(List<Float> values) {
            addCriterion("margin_rate not in", values, "marginRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateBetween(Float value1, Float value2) {
            addCriterion("margin_rate between", value1, value2, "marginRate");
            return (Criteria) this;
        }

        public Criteria andMarginRateNotBetween(Float value1, Float value2) {
            addCriterion("margin_rate not between", value1, value2, "marginRate");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNull() {
            addCriterion("deposit_amount is null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNotNull() {
            addCriterion("deposit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountEqualTo(BigDecimal value) {
            addCriterion("deposit_amount =", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotEqualTo(BigDecimal value) {
            addCriterion("deposit_amount <>", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThan(BigDecimal value) {
            addCriterion("deposit_amount >", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_amount >=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThan(BigDecimal value) {
            addCriterion("deposit_amount <", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_amount <=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIn(List<BigDecimal> values) {
            addCriterion("deposit_amount in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotIn(List<BigDecimal> values) {
            addCriterion("deposit_amount not in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_amount between", value1, value2, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_amount not between", value1, value2, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andMarginApproachIsNull() {
            addCriterion("margin_approach is null");
            return (Criteria) this;
        }

        public Criteria andMarginApproachIsNotNull() {
            addCriterion("margin_approach is not null");
            return (Criteria) this;
        }

        public Criteria andMarginApproachEqualTo(String value) {
            addCriterion("margin_approach =", value, "marginApproach");
            return (Criteria) this;
        }

        public Criteria andMarginApproachNotEqualTo(String value) {
            addCriterion("margin_approach <>", value, "marginApproach");
            return (Criteria) this;
        }

        public Criteria andMarginApproachGreaterThan(String value) {
            addCriterion("margin_approach >", value, "marginApproach");
            return (Criteria) this;
        }

        public Criteria andMarginApproachGreaterThanOrEqualTo(String value) {
            addCriterion("margin_approach >=", value, "marginApproach");
            return (Criteria) this;
        }

        public Criteria andMarginApproachLessThan(String value) {
            addCriterion("margin_approach <", value, "marginApproach");
            return (Criteria) this;
        }

        public Criteria andMarginApproachLessThanOrEqualTo(String value) {
            addCriterion("margin_approach <=", value, "marginApproach");
            return (Criteria) this;
        }

        public Criteria andMarginApproachLike(String value) {
            addCriterion("margin_approach like", value, "marginApproach");
            return (Criteria) this;
        }

        public Criteria andMarginApproachNotLike(String value) {
            addCriterion("margin_approach not like", value, "marginApproach");
            return (Criteria) this;
        }

        public Criteria andMarginApproachIn(List<String> values) {
            addCriterion("margin_approach in", values, "marginApproach");
            return (Criteria) this;
        }

        public Criteria andMarginApproachNotIn(List<String> values) {
            addCriterion("margin_approach not in", values, "marginApproach");
            return (Criteria) this;
        }

        public Criteria andMarginApproachBetween(String value1, String value2) {
            addCriterion("margin_approach between", value1, value2, "marginApproach");
            return (Criteria) this;
        }

        public Criteria andMarginApproachNotBetween(String value1, String value2) {
            addCriterion("margin_approach not between", value1, value2, "marginApproach");
            return (Criteria) this;
        }

        public Criteria andCooperationagencyIsNull() {
            addCriterion("cooperationAgency is null");
            return (Criteria) this;
        }

        public Criteria andCooperationagencyIsNotNull() {
            addCriterion("cooperationAgency is not null");
            return (Criteria) this;
        }

        public Criteria andCooperationagencyEqualTo(String value) {
            addCriterion("cooperationAgency =", value, "cooperationagency");
            return (Criteria) this;
        }

        public Criteria andCooperationagencyNotEqualTo(String value) {
            addCriterion("cooperationAgency <>", value, "cooperationagency");
            return (Criteria) this;
        }

        public Criteria andCooperationagencyGreaterThan(String value) {
            addCriterion("cooperationAgency >", value, "cooperationagency");
            return (Criteria) this;
        }

        public Criteria andCooperationagencyGreaterThanOrEqualTo(String value) {
            addCriterion("cooperationAgency >=", value, "cooperationagency");
            return (Criteria) this;
        }

        public Criteria andCooperationagencyLessThan(String value) {
            addCriterion("cooperationAgency <", value, "cooperationagency");
            return (Criteria) this;
        }

        public Criteria andCooperationagencyLessThanOrEqualTo(String value) {
            addCriterion("cooperationAgency <=", value, "cooperationagency");
            return (Criteria) this;
        }

        public Criteria andCooperationagencyLike(String value) {
            addCriterion("cooperationAgency like", value, "cooperationagency");
            return (Criteria) this;
        }

        public Criteria andCooperationagencyNotLike(String value) {
            addCriterion("cooperationAgency not like", value, "cooperationagency");
            return (Criteria) this;
        }

        public Criteria andCooperationagencyIn(List<String> values) {
            addCriterion("cooperationAgency in", values, "cooperationagency");
            return (Criteria) this;
        }

        public Criteria andCooperationagencyNotIn(List<String> values) {
            addCriterion("cooperationAgency not in", values, "cooperationagency");
            return (Criteria) this;
        }

        public Criteria andCooperationagencyBetween(String value1, String value2) {
            addCriterion("cooperationAgency between", value1, value2, "cooperationagency");
            return (Criteria) this;
        }

        public Criteria andCooperationagencyNotBetween(String value1, String value2) {
            addCriterion("cooperationAgency not between", value1, value2, "cooperationagency");
            return (Criteria) this;
        }

        public Criteria andAssuremeantypeIsNull() {
            addCriterion("assureMeanType is null");
            return (Criteria) this;
        }

        public Criteria andAssuremeantypeIsNotNull() {
            addCriterion("assureMeanType is not null");
            return (Criteria) this;
        }

        public Criteria andAssuremeantypeEqualTo(String value) {
            addCriterion("assureMeanType =", value, "assuremeantype");
            return (Criteria) this;
        }

        public Criteria andAssuremeantypeNotEqualTo(String value) {
            addCriterion("assureMeanType <>", value, "assuremeantype");
            return (Criteria) this;
        }

        public Criteria andAssuremeantypeGreaterThan(String value) {
            addCriterion("assureMeanType >", value, "assuremeantype");
            return (Criteria) this;
        }

        public Criteria andAssuremeantypeGreaterThanOrEqualTo(String value) {
            addCriterion("assureMeanType >=", value, "assuremeantype");
            return (Criteria) this;
        }

        public Criteria andAssuremeantypeLessThan(String value) {
            addCriterion("assureMeanType <", value, "assuremeantype");
            return (Criteria) this;
        }

        public Criteria andAssuremeantypeLessThanOrEqualTo(String value) {
            addCriterion("assureMeanType <=", value, "assuremeantype");
            return (Criteria) this;
        }

        public Criteria andAssuremeantypeLike(String value) {
            addCriterion("assureMeanType like", value, "assuremeantype");
            return (Criteria) this;
        }

        public Criteria andAssuremeantypeNotLike(String value) {
            addCriterion("assureMeanType not like", value, "assuremeantype");
            return (Criteria) this;
        }

        public Criteria andAssuremeantypeIn(List<String> values) {
            addCriterion("assureMeanType in", values, "assuremeantype");
            return (Criteria) this;
        }

        public Criteria andAssuremeantypeNotIn(List<String> values) {
            addCriterion("assureMeanType not in", values, "assuremeantype");
            return (Criteria) this;
        }

        public Criteria andAssuremeantypeBetween(String value1, String value2) {
            addCriterion("assureMeanType between", value1, value2, "assuremeantype");
            return (Criteria) this;
        }

        public Criteria andAssuremeantypeNotBetween(String value1, String value2) {
            addCriterion("assureMeanType not between", value1, value2, "assuremeantype");
            return (Criteria) this;
        }

        public Criteria andMarginSurplusIsNull() {
            addCriterion("margin_surplus is null");
            return (Criteria) this;
        }

        public Criteria andMarginSurplusIsNotNull() {
            addCriterion("margin_surplus is not null");
            return (Criteria) this;
        }

        public Criteria andMarginSurplusEqualTo(BigDecimal value) {
            addCriterion("margin_surplus =", value, "marginSurplus");
            return (Criteria) this;
        }

        public Criteria andMarginSurplusNotEqualTo(BigDecimal value) {
            addCriterion("margin_surplus <>", value, "marginSurplus");
            return (Criteria) this;
        }

        public Criteria andMarginSurplusGreaterThan(BigDecimal value) {
            addCriterion("margin_surplus >", value, "marginSurplus");
            return (Criteria) this;
        }

        public Criteria andMarginSurplusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("margin_surplus >=", value, "marginSurplus");
            return (Criteria) this;
        }

        public Criteria andMarginSurplusLessThan(BigDecimal value) {
            addCriterion("margin_surplus <", value, "marginSurplus");
            return (Criteria) this;
        }

        public Criteria andMarginSurplusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("margin_surplus <=", value, "marginSurplus");
            return (Criteria) this;
        }

        public Criteria andMarginSurplusIn(List<BigDecimal> values) {
            addCriterion("margin_surplus in", values, "marginSurplus");
            return (Criteria) this;
        }

        public Criteria andMarginSurplusNotIn(List<BigDecimal> values) {
            addCriterion("margin_surplus not in", values, "marginSurplus");
            return (Criteria) this;
        }

        public Criteria andMarginSurplusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("margin_surplus between", value1, value2, "marginSurplus");
            return (Criteria) this;
        }

        public Criteria andMarginSurplusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("margin_surplus not between", value1, value2, "marginSurplus");
            return (Criteria) this;
        }

        public Criteria andIsApplyFlagIsNull() {
            addCriterion("is_apply_flag is null");
            return (Criteria) this;
        }

        public Criteria andIsApplyFlagIsNotNull() {
            addCriterion("is_apply_flag is not null");
            return (Criteria) this;
        }

        public Criteria andIsApplyFlagEqualTo(String value) {
            addCriterion("is_apply_flag =", value, "isApplyFlag");
            return (Criteria) this;
        }

        public Criteria andIsApplyFlagNotEqualTo(String value) {
            addCriterion("is_apply_flag <>", value, "isApplyFlag");
            return (Criteria) this;
        }

        public Criteria andIsApplyFlagGreaterThan(String value) {
            addCriterion("is_apply_flag >", value, "isApplyFlag");
            return (Criteria) this;
        }

        public Criteria andIsApplyFlagGreaterThanOrEqualTo(String value) {
            addCriterion("is_apply_flag >=", value, "isApplyFlag");
            return (Criteria) this;
        }

        public Criteria andIsApplyFlagLessThan(String value) {
            addCriterion("is_apply_flag <", value, "isApplyFlag");
            return (Criteria) this;
        }

        public Criteria andIsApplyFlagLessThanOrEqualTo(String value) {
            addCriterion("is_apply_flag <=", value, "isApplyFlag");
            return (Criteria) this;
        }

        public Criteria andIsApplyFlagLike(String value) {
            addCriterion("is_apply_flag like", value, "isApplyFlag");
            return (Criteria) this;
        }

        public Criteria andIsApplyFlagNotLike(String value) {
            addCriterion("is_apply_flag not like", value, "isApplyFlag");
            return (Criteria) this;
        }

        public Criteria andIsApplyFlagIn(List<String> values) {
            addCriterion("is_apply_flag in", values, "isApplyFlag");
            return (Criteria) this;
        }

        public Criteria andIsApplyFlagNotIn(List<String> values) {
            addCriterion("is_apply_flag not in", values, "isApplyFlag");
            return (Criteria) this;
        }

        public Criteria andIsApplyFlagBetween(String value1, String value2) {
            addCriterion("is_apply_flag between", value1, value2, "isApplyFlag");
            return (Criteria) this;
        }

        public Criteria andIsApplyFlagNotBetween(String value1, String value2) {
            addCriterion("is_apply_flag not between", value1, value2, "isApplyFlag");
            return (Criteria) this;
        }

        public Criteria andIsReturnFlagIsNull() {
            addCriterion("is_return_flag is null");
            return (Criteria) this;
        }

        public Criteria andIsReturnFlagIsNotNull() {
            addCriterion("is_return_flag is not null");
            return (Criteria) this;
        }

        public Criteria andIsReturnFlagEqualTo(String value) {
            addCriterion("is_return_flag =", value, "isReturnFlag");
            return (Criteria) this;
        }

        public Criteria andIsReturnFlagNotEqualTo(String value) {
            addCriterion("is_return_flag <>", value, "isReturnFlag");
            return (Criteria) this;
        }

        public Criteria andIsReturnFlagGreaterThan(String value) {
            addCriterion("is_return_flag >", value, "isReturnFlag");
            return (Criteria) this;
        }

        public Criteria andIsReturnFlagGreaterThanOrEqualTo(String value) {
            addCriterion("is_return_flag >=", value, "isReturnFlag");
            return (Criteria) this;
        }

        public Criteria andIsReturnFlagLessThan(String value) {
            addCriterion("is_return_flag <", value, "isReturnFlag");
            return (Criteria) this;
        }

        public Criteria andIsReturnFlagLessThanOrEqualTo(String value) {
            addCriterion("is_return_flag <=", value, "isReturnFlag");
            return (Criteria) this;
        }

        public Criteria andIsReturnFlagLike(String value) {
            addCriterion("is_return_flag like", value, "isReturnFlag");
            return (Criteria) this;
        }

        public Criteria andIsReturnFlagNotLike(String value) {
            addCriterion("is_return_flag not like", value, "isReturnFlag");
            return (Criteria) this;
        }

        public Criteria andIsReturnFlagIn(List<String> values) {
            addCriterion("is_return_flag in", values, "isReturnFlag");
            return (Criteria) this;
        }

        public Criteria andIsReturnFlagNotIn(List<String> values) {
            addCriterion("is_return_flag not in", values, "isReturnFlag");
            return (Criteria) this;
        }

        public Criteria andIsReturnFlagBetween(String value1, String value2) {
            addCriterion("is_return_flag between", value1, value2, "isReturnFlag");
            return (Criteria) this;
        }

        public Criteria andIsReturnFlagNotBetween(String value1, String value2) {
            addCriterion("is_return_flag not between", value1, value2, "isReturnFlag");
            return (Criteria) this;
        }

        public Criteria andNominalCostIsNull() {
            addCriterion("nominal_cost is null");
            return (Criteria) this;
        }

        public Criteria andNominalCostIsNotNull() {
            addCriterion("nominal_cost is not null");
            return (Criteria) this;
        }

        public Criteria andNominalCostEqualTo(BigDecimal value) {
            addCriterion("nominal_cost =", value, "nominalCost");
            return (Criteria) this;
        }

        public Criteria andNominalCostNotEqualTo(BigDecimal value) {
            addCriterion("nominal_cost <>", value, "nominalCost");
            return (Criteria) this;
        }

        public Criteria andNominalCostGreaterThan(BigDecimal value) {
            addCriterion("nominal_cost >", value, "nominalCost");
            return (Criteria) this;
        }

        public Criteria andNominalCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nominal_cost >=", value, "nominalCost");
            return (Criteria) this;
        }

        public Criteria andNominalCostLessThan(BigDecimal value) {
            addCriterion("nominal_cost <", value, "nominalCost");
            return (Criteria) this;
        }

        public Criteria andNominalCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nominal_cost <=", value, "nominalCost");
            return (Criteria) this;
        }

        public Criteria andNominalCostIn(List<BigDecimal> values) {
            addCriterion("nominal_cost in", values, "nominalCost");
            return (Criteria) this;
        }

        public Criteria andNominalCostNotIn(List<BigDecimal> values) {
            addCriterion("nominal_cost not in", values, "nominalCost");
            return (Criteria) this;
        }

        public Criteria andNominalCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nominal_cost between", value1, value2, "nominalCost");
            return (Criteria) this;
        }

        public Criteria andNominalCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nominal_cost not between", value1, value2, "nominalCost");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeIsNull() {
            addCriterion("currency_type is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeIsNotNull() {
            addCriterion("currency_type is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeEqualTo(String value) {
            addCriterion("currency_type =", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotEqualTo(String value) {
            addCriterion("currency_type <>", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeGreaterThan(String value) {
            addCriterion("currency_type >", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("currency_type >=", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeLessThan(String value) {
            addCriterion("currency_type <", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeLessThanOrEqualTo(String value) {
            addCriterion("currency_type <=", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeLike(String value) {
            addCriterion("currency_type like", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotLike(String value) {
            addCriterion("currency_type not like", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeIn(List<String> values) {
            addCriterion("currency_type in", values, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotIn(List<String> values) {
            addCriterion("currency_type not in", values, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeBetween(String value1, String value2) {
            addCriterion("currency_type between", value1, value2, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotBetween(String value1, String value2) {
            addCriterion("currency_type not between", value1, value2, "currencyType");
            return (Criteria) this;
        }

        public Criteria andDeclarationAuthorizationIsNull() {
            addCriterion("declaration_authorization is null");
            return (Criteria) this;
        }

        public Criteria andDeclarationAuthorizationIsNotNull() {
            addCriterion("declaration_authorization is not null");
            return (Criteria) this;
        }

        public Criteria andDeclarationAuthorizationEqualTo(String value) {
            addCriterion("declaration_authorization =", value, "declarationAuthorization");
            return (Criteria) this;
        }

        public Criteria andDeclarationAuthorizationNotEqualTo(String value) {
            addCriterion("declaration_authorization <>", value, "declarationAuthorization");
            return (Criteria) this;
        }

        public Criteria andDeclarationAuthorizationGreaterThan(String value) {
            addCriterion("declaration_authorization >", value, "declarationAuthorization");
            return (Criteria) this;
        }

        public Criteria andDeclarationAuthorizationGreaterThanOrEqualTo(String value) {
            addCriterion("declaration_authorization >=", value, "declarationAuthorization");
            return (Criteria) this;
        }

        public Criteria andDeclarationAuthorizationLessThan(String value) {
            addCriterion("declaration_authorization <", value, "declarationAuthorization");
            return (Criteria) this;
        }

        public Criteria andDeclarationAuthorizationLessThanOrEqualTo(String value) {
            addCriterion("declaration_authorization <=", value, "declarationAuthorization");
            return (Criteria) this;
        }

        public Criteria andDeclarationAuthorizationLike(String value) {
            addCriterion("declaration_authorization like", value, "declarationAuthorization");
            return (Criteria) this;
        }

        public Criteria andDeclarationAuthorizationNotLike(String value) {
            addCriterion("declaration_authorization not like", value, "declarationAuthorization");
            return (Criteria) this;
        }

        public Criteria andDeclarationAuthorizationIn(List<String> values) {
            addCriterion("declaration_authorization in", values, "declarationAuthorization");
            return (Criteria) this;
        }

        public Criteria andDeclarationAuthorizationNotIn(List<String> values) {
            addCriterion("declaration_authorization not in", values, "declarationAuthorization");
            return (Criteria) this;
        }

        public Criteria andDeclarationAuthorizationBetween(String value1, String value2) {
            addCriterion("declaration_authorization between", value1, value2, "declarationAuthorization");
            return (Criteria) this;
        }

        public Criteria andDeclarationAuthorizationNotBetween(String value1, String value2) {
            addCriterion("declaration_authorization not between", value1, value2, "declarationAuthorization");
            return (Criteria) this;
        }

        public Criteria andGuidePriceIsNull() {
            addCriterion("guide_price is null");
            return (Criteria) this;
        }

        public Criteria andGuidePriceIsNotNull() {
            addCriterion("guide_price is not null");
            return (Criteria) this;
        }

        public Criteria andGuidePriceEqualTo(BigDecimal value) {
            addCriterion("guide_price =", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotEqualTo(BigDecimal value) {
            addCriterion("guide_price <>", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceGreaterThan(BigDecimal value) {
            addCriterion("guide_price >", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("guide_price >=", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceLessThan(BigDecimal value) {
            addCriterion("guide_price <", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("guide_price <=", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceIn(List<BigDecimal> values) {
            addCriterion("guide_price in", values, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotIn(List<BigDecimal> values) {
            addCriterion("guide_price not in", values, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("guide_price between", value1, value2, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("guide_price not between", value1, value2, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andClientTakePriceIsNull() {
            addCriterion("client_take_price is null");
            return (Criteria) this;
        }

        public Criteria andClientTakePriceIsNotNull() {
            addCriterion("client_take_price is not null");
            return (Criteria) this;
        }

        public Criteria andClientTakePriceEqualTo(BigDecimal value) {
            addCriterion("client_take_price =", value, "clientTakePrice");
            return (Criteria) this;
        }

        public Criteria andClientTakePriceNotEqualTo(BigDecimal value) {
            addCriterion("client_take_price <>", value, "clientTakePrice");
            return (Criteria) this;
        }

        public Criteria andClientTakePriceGreaterThan(BigDecimal value) {
            addCriterion("client_take_price >", value, "clientTakePrice");
            return (Criteria) this;
        }

        public Criteria andClientTakePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("client_take_price >=", value, "clientTakePrice");
            return (Criteria) this;
        }

        public Criteria andClientTakePriceLessThan(BigDecimal value) {
            addCriterion("client_take_price <", value, "clientTakePrice");
            return (Criteria) this;
        }

        public Criteria andClientTakePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("client_take_price <=", value, "clientTakePrice");
            return (Criteria) this;
        }

        public Criteria andClientTakePriceIn(List<BigDecimal> values) {
            addCriterion("client_take_price in", values, "clientTakePrice");
            return (Criteria) this;
        }

        public Criteria andClientTakePriceNotIn(List<BigDecimal> values) {
            addCriterion("client_take_price not in", values, "clientTakePrice");
            return (Criteria) this;
        }

        public Criteria andClientTakePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("client_take_price between", value1, value2, "clientTakePrice");
            return (Criteria) this;
        }

        public Criteria andClientTakePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("client_take_price not between", value1, value2, "clientTakePrice");
            return (Criteria) this;
        }

        public Criteria andCompanyTakePriceIsNull() {
            addCriterion("company_take_price is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTakePriceIsNotNull() {
            addCriterion("company_take_price is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTakePriceEqualTo(BigDecimal value) {
            addCriterion("company_take_price =", value, "companyTakePrice");
            return (Criteria) this;
        }

        public Criteria andCompanyTakePriceNotEqualTo(BigDecimal value) {
            addCriterion("company_take_price <>", value, "companyTakePrice");
            return (Criteria) this;
        }

        public Criteria andCompanyTakePriceGreaterThan(BigDecimal value) {
            addCriterion("company_take_price >", value, "companyTakePrice");
            return (Criteria) this;
        }

        public Criteria andCompanyTakePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("company_take_price >=", value, "companyTakePrice");
            return (Criteria) this;
        }

        public Criteria andCompanyTakePriceLessThan(BigDecimal value) {
            addCriterion("company_take_price <", value, "companyTakePrice");
            return (Criteria) this;
        }

        public Criteria andCompanyTakePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("company_take_price <=", value, "companyTakePrice");
            return (Criteria) this;
        }

        public Criteria andCompanyTakePriceIn(List<BigDecimal> values) {
            addCriterion("company_take_price in", values, "companyTakePrice");
            return (Criteria) this;
        }

        public Criteria andCompanyTakePriceNotIn(List<BigDecimal> values) {
            addCriterion("company_take_price not in", values, "companyTakePrice");
            return (Criteria) this;
        }

        public Criteria andCompanyTakePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("company_take_price between", value1, value2, "companyTakePrice");
            return (Criteria) this;
        }

        public Criteria andCompanyTakePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("company_take_price not between", value1, value2, "companyTakePrice");
            return (Criteria) this;
        }

        public Criteria andProjectStateIsNull() {
            addCriterion("project_state is null");
            return (Criteria) this;
        }

        public Criteria andProjectStateIsNotNull() {
            addCriterion("project_state is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStateEqualTo(String value) {
            addCriterion("project_state =", value, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateNotEqualTo(String value) {
            addCriterion("project_state <>", value, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateGreaterThan(String value) {
            addCriterion("project_state >", value, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateGreaterThanOrEqualTo(String value) {
            addCriterion("project_state >=", value, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateLessThan(String value) {
            addCriterion("project_state <", value, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateLessThanOrEqualTo(String value) {
            addCriterion("project_state <=", value, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateLike(String value) {
            addCriterion("project_state like", value, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateNotLike(String value) {
            addCriterion("project_state not like", value, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateIn(List<String> values) {
            addCriterion("project_state in", values, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateNotIn(List<String> values) {
            addCriterion("project_state not in", values, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateBetween(String value1, String value2) {
            addCriterion("project_state between", value1, value2, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateNotBetween(String value1, String value2) {
            addCriterion("project_state not between", value1, value2, "projectState");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andExt1IsNull() {
            addCriterion("ext1 is null");
            return (Criteria) this;
        }

        public Criteria andExt1IsNotNull() {
            addCriterion("ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andExt1EqualTo(String value) {
            addCriterion("ext1 =", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotEqualTo(String value) {
            addCriterion("ext1 <>", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThan(String value) {
            addCriterion("ext1 >", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThanOrEqualTo(String value) {
            addCriterion("ext1 >=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThan(String value) {
            addCriterion("ext1 <", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThanOrEqualTo(String value) {
            addCriterion("ext1 <=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Like(String value) {
            addCriterion("ext1 like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotLike(String value) {
            addCriterion("ext1 not like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1In(List<String> values) {
            addCriterion("ext1 in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotIn(List<String> values) {
            addCriterion("ext1 not in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Between(String value1, String value2) {
            addCriterion("ext1 between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotBetween(String value1, String value2) {
            addCriterion("ext1 not between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt2IsNull() {
            addCriterion("ext2 is null");
            return (Criteria) this;
        }

        public Criteria andExt2IsNotNull() {
            addCriterion("ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andExt2EqualTo(String value) {
            addCriterion("ext2 =", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotEqualTo(String value) {
            addCriterion("ext2 <>", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThan(String value) {
            addCriterion("ext2 >", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThanOrEqualTo(String value) {
            addCriterion("ext2 >=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThan(String value) {
            addCriterion("ext2 <", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThanOrEqualTo(String value) {
            addCriterion("ext2 <=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Like(String value) {
            addCriterion("ext2 like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotLike(String value) {
            addCriterion("ext2 not like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2In(List<String> values) {
            addCriterion("ext2 in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotIn(List<String> values) {
            addCriterion("ext2 not in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Between(String value1, String value2) {
            addCriterion("ext2 between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotBetween(String value1, String value2) {
            addCriterion("ext2 not between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt3IsNull() {
            addCriterion("ext3 is null");
            return (Criteria) this;
        }

        public Criteria andExt3IsNotNull() {
            addCriterion("ext3 is not null");
            return (Criteria) this;
        }

        public Criteria andExt3EqualTo(String value) {
            addCriterion("ext3 =", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotEqualTo(String value) {
            addCriterion("ext3 <>", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThan(String value) {
            addCriterion("ext3 >", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThanOrEqualTo(String value) {
            addCriterion("ext3 >=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThan(String value) {
            addCriterion("ext3 <", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThanOrEqualTo(String value) {
            addCriterion("ext3 <=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Like(String value) {
            addCriterion("ext3 like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotLike(String value) {
            addCriterion("ext3 not like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3In(List<String> values) {
            addCriterion("ext3 in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotIn(List<String> values) {
            addCriterion("ext3 not in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Between(String value1, String value2) {
            addCriterion("ext3 between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotBetween(String value1, String value2) {
            addCriterion("ext3 not between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt4IsNull() {
            addCriterion("ext4 is null");
            return (Criteria) this;
        }

        public Criteria andExt4IsNotNull() {
            addCriterion("ext4 is not null");
            return (Criteria) this;
        }

        public Criteria andExt4EqualTo(Integer value) {
            addCriterion("ext4 =", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotEqualTo(Integer value) {
            addCriterion("ext4 <>", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThan(Integer value) {
            addCriterion("ext4 >", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThanOrEqualTo(Integer value) {
            addCriterion("ext4 >=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThan(Integer value) {
            addCriterion("ext4 <", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThanOrEqualTo(Integer value) {
            addCriterion("ext4 <=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4In(List<Integer> values) {
            addCriterion("ext4 in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotIn(List<Integer> values) {
            addCriterion("ext4 not in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Between(Integer value1, Integer value2) {
            addCriterion("ext4 between", value1, value2, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotBetween(Integer value1, Integer value2) {
            addCriterion("ext4 not between", value1, value2, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt5IsNull() {
            addCriterion("ext5 is null");
            return (Criteria) this;
        }

        public Criteria andExt5IsNotNull() {
            addCriterion("ext5 is not null");
            return (Criteria) this;
        }

        public Criteria andExt5EqualTo(Integer value) {
            addCriterion("ext5 =", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotEqualTo(Integer value) {
            addCriterion("ext5 <>", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5GreaterThan(Integer value) {
            addCriterion("ext5 >", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5GreaterThanOrEqualTo(Integer value) {
            addCriterion("ext5 >=", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5LessThan(Integer value) {
            addCriterion("ext5 <", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5LessThanOrEqualTo(Integer value) {
            addCriterion("ext5 <=", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5In(List<Integer> values) {
            addCriterion("ext5 in", values, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotIn(List<Integer> values) {
            addCriterion("ext5 not in", values, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5Between(Integer value1, Integer value2) {
            addCriterion("ext5 between", value1, value2, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotBetween(Integer value1, Integer value2) {
            addCriterion("ext5 not between", value1, value2, "ext5");
            return (Criteria) this;
        }

        public Criteria andIsDraftIsNull() {
            addCriterion("is_draft is null");
            return (Criteria) this;
        }

        public Criteria andIsDraftIsNotNull() {
            addCriterion("is_draft is not null");
            return (Criteria) this;
        }

        public Criteria andIsDraftEqualTo(String value) {
            addCriterion("is_draft =", value, "isDraft");
            return (Criteria) this;
        }

        public Criteria andIsDraftNotEqualTo(String value) {
            addCriterion("is_draft <>", value, "isDraft");
            return (Criteria) this;
        }

        public Criteria andIsDraftGreaterThan(String value) {
            addCriterion("is_draft >", value, "isDraft");
            return (Criteria) this;
        }

        public Criteria andIsDraftGreaterThanOrEqualTo(String value) {
            addCriterion("is_draft >=", value, "isDraft");
            return (Criteria) this;
        }

        public Criteria andIsDraftLessThan(String value) {
            addCriterion("is_draft <", value, "isDraft");
            return (Criteria) this;
        }

        public Criteria andIsDraftLessThanOrEqualTo(String value) {
            addCriterion("is_draft <=", value, "isDraft");
            return (Criteria) this;
        }

        public Criteria andIsDraftLike(String value) {
            addCriterion("is_draft like", value, "isDraft");
            return (Criteria) this;
        }

        public Criteria andIsDraftNotLike(String value) {
            addCriterion("is_draft not like", value, "isDraft");
            return (Criteria) this;
        }

        public Criteria andIsDraftIn(List<String> values) {
            addCriterion("is_draft in", values, "isDraft");
            return (Criteria) this;
        }

        public Criteria andIsDraftNotIn(List<String> values) {
            addCriterion("is_draft not in", values, "isDraft");
            return (Criteria) this;
        }

        public Criteria andIsDraftBetween(String value1, String value2) {
            addCriterion("is_draft between", value1, value2, "isDraft");
            return (Criteria) this;
        }

        public Criteria andIsDraftNotBetween(String value1, String value2) {
            addCriterion("is_draft not between", value1, value2, "isDraft");
            return (Criteria) this;
        }

        public Criteria andLoanFinancingAmountIsNull() {
            addCriterion("loan_financing_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoanFinancingAmountIsNotNull() {
            addCriterion("loan_financing_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanFinancingAmountEqualTo(String value) {
            addCriterion("loan_financing_amount =", value, "loanFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andLoanFinancingAmountNotEqualTo(String value) {
            addCriterion("loan_financing_amount <>", value, "loanFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andLoanFinancingAmountGreaterThan(String value) {
            addCriterion("loan_financing_amount >", value, "loanFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andLoanFinancingAmountGreaterThanOrEqualTo(String value) {
            addCriterion("loan_financing_amount >=", value, "loanFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andLoanFinancingAmountLessThan(String value) {
            addCriterion("loan_financing_amount <", value, "loanFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andLoanFinancingAmountLessThanOrEqualTo(String value) {
            addCriterion("loan_financing_amount <=", value, "loanFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andLoanFinancingAmountLike(String value) {
            addCriterion("loan_financing_amount like", value, "loanFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andLoanFinancingAmountNotLike(String value) {
            addCriterion("loan_financing_amount not like", value, "loanFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andLoanFinancingAmountIn(List<String> values) {
            addCriterion("loan_financing_amount in", values, "loanFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andLoanFinancingAmountNotIn(List<String> values) {
            addCriterion("loan_financing_amount not in", values, "loanFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andLoanFinancingAmountBetween(String value1, String value2) {
            addCriterion("loan_financing_amount between", value1, value2, "loanFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andLoanFinancingAmountNotBetween(String value1, String value2) {
            addCriterion("loan_financing_amount not between", value1, value2, "loanFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andLoanTimeLimitIsNull() {
            addCriterion("loan_time_limit is null");
            return (Criteria) this;
        }

        public Criteria andLoanTimeLimitIsNotNull() {
            addCriterion("loan_time_limit is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTimeLimitEqualTo(Float value) {
            addCriterion("loan_time_limit =", value, "loanTimeLimit");
            return (Criteria) this;
        }

        public Criteria andLoanTimeLimitNotEqualTo(Float value) {
            addCriterion("loan_time_limit <>", value, "loanTimeLimit");
            return (Criteria) this;
        }

        public Criteria andLoanTimeLimitGreaterThan(Float value) {
            addCriterion("loan_time_limit >", value, "loanTimeLimit");
            return (Criteria) this;
        }

        public Criteria andLoanTimeLimitGreaterThanOrEqualTo(Float value) {
            addCriterion("loan_time_limit >=", value, "loanTimeLimit");
            return (Criteria) this;
        }

        public Criteria andLoanTimeLimitLessThan(Float value) {
            addCriterion("loan_time_limit <", value, "loanTimeLimit");
            return (Criteria) this;
        }

        public Criteria andLoanTimeLimitLessThanOrEqualTo(Float value) {
            addCriterion("loan_time_limit <=", value, "loanTimeLimit");
            return (Criteria) this;
        }

        public Criteria andLoanTimeLimitIn(List<Float> values) {
            addCriterion("loan_time_limit in", values, "loanTimeLimit");
            return (Criteria) this;
        }

        public Criteria andLoanTimeLimitNotIn(List<Float> values) {
            addCriterion("loan_time_limit not in", values, "loanTimeLimit");
            return (Criteria) this;
        }

        public Criteria andLoanTimeLimitBetween(Float value1, Float value2) {
            addCriterion("loan_time_limit between", value1, value2, "loanTimeLimit");
            return (Criteria) this;
        }

        public Criteria andLoanTimeLimitNotBetween(Float value1, Float value2) {
            addCriterion("loan_time_limit not between", value1, value2, "loanTimeLimit");
            return (Criteria) this;
        }

        public Criteria andLoanAnnualInterestRateIsNull() {
            addCriterion("loan_annual_interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andLoanAnnualInterestRateIsNotNull() {
            addCriterion("loan_annual_interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAnnualInterestRateEqualTo(Float value) {
            addCriterion("loan_annual_interest_rate =", value, "loanAnnualInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanAnnualInterestRateNotEqualTo(Float value) {
            addCriterion("loan_annual_interest_rate <>", value, "loanAnnualInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanAnnualInterestRateGreaterThan(Float value) {
            addCriterion("loan_annual_interest_rate >", value, "loanAnnualInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanAnnualInterestRateGreaterThanOrEqualTo(Float value) {
            addCriterion("loan_annual_interest_rate >=", value, "loanAnnualInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanAnnualInterestRateLessThan(Float value) {
            addCriterion("loan_annual_interest_rate <", value, "loanAnnualInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanAnnualInterestRateLessThanOrEqualTo(Float value) {
            addCriterion("loan_annual_interest_rate <=", value, "loanAnnualInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanAnnualInterestRateIn(List<Float> values) {
            addCriterion("loan_annual_interest_rate in", values, "loanAnnualInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanAnnualInterestRateNotIn(List<Float> values) {
            addCriterion("loan_annual_interest_rate not in", values, "loanAnnualInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanAnnualInterestRateBetween(Float value1, Float value2) {
            addCriterion("loan_annual_interest_rate between", value1, value2, "loanAnnualInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanAnnualInterestRateNotBetween(Float value1, Float value2) {
            addCriterion("loan_annual_interest_rate not between", value1, value2, "loanAnnualInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanRepaymentMethodIsNull() {
            addCriterion("loan_repayment_method is null");
            return (Criteria) this;
        }

        public Criteria andLoanRepaymentMethodIsNotNull() {
            addCriterion("loan_repayment_method is not null");
            return (Criteria) this;
        }

        public Criteria andLoanRepaymentMethodEqualTo(String value) {
            addCriterion("loan_repayment_method =", value, "loanRepaymentMethod");
            return (Criteria) this;
        }

        public Criteria andLoanRepaymentMethodNotEqualTo(String value) {
            addCriterion("loan_repayment_method <>", value, "loanRepaymentMethod");
            return (Criteria) this;
        }

        public Criteria andLoanRepaymentMethodGreaterThan(String value) {
            addCriterion("loan_repayment_method >", value, "loanRepaymentMethod");
            return (Criteria) this;
        }

        public Criteria andLoanRepaymentMethodGreaterThanOrEqualTo(String value) {
            addCriterion("loan_repayment_method >=", value, "loanRepaymentMethod");
            return (Criteria) this;
        }

        public Criteria andLoanRepaymentMethodLessThan(String value) {
            addCriterion("loan_repayment_method <", value, "loanRepaymentMethod");
            return (Criteria) this;
        }

        public Criteria andLoanRepaymentMethodLessThanOrEqualTo(String value) {
            addCriterion("loan_repayment_method <=", value, "loanRepaymentMethod");
            return (Criteria) this;
        }

        public Criteria andLoanRepaymentMethodLike(String value) {
            addCriterion("loan_repayment_method like", value, "loanRepaymentMethod");
            return (Criteria) this;
        }

        public Criteria andLoanRepaymentMethodNotLike(String value) {
            addCriterion("loan_repayment_method not like", value, "loanRepaymentMethod");
            return (Criteria) this;
        }

        public Criteria andLoanRepaymentMethodIn(List<String> values) {
            addCriterion("loan_repayment_method in", values, "loanRepaymentMethod");
            return (Criteria) this;
        }

        public Criteria andLoanRepaymentMethodNotIn(List<String> values) {
            addCriterion("loan_repayment_method not in", values, "loanRepaymentMethod");
            return (Criteria) this;
        }

        public Criteria andLoanRepaymentMethodBetween(String value1, String value2) {
            addCriterion("loan_repayment_method between", value1, value2, "loanRepaymentMethod");
            return (Criteria) this;
        }

        public Criteria andLoanRepaymentMethodNotBetween(String value1, String value2) {
            addCriterion("loan_repayment_method not between", value1, value2, "loanRepaymentMethod");
            return (Criteria) this;
        }

        public Criteria andLoanPayFrequencyIsNull() {
            addCriterion("loan_pay_frequency is null");
            return (Criteria) this;
        }

        public Criteria andLoanPayFrequencyIsNotNull() {
            addCriterion("loan_pay_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPayFrequencyEqualTo(Integer value) {
            addCriterion("loan_pay_frequency =", value, "loanPayFrequency");
            return (Criteria) this;
        }

        public Criteria andLoanPayFrequencyNotEqualTo(Integer value) {
            addCriterion("loan_pay_frequency <>", value, "loanPayFrequency");
            return (Criteria) this;
        }

        public Criteria andLoanPayFrequencyGreaterThan(Integer value) {
            addCriterion("loan_pay_frequency >", value, "loanPayFrequency");
            return (Criteria) this;
        }

        public Criteria andLoanPayFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_pay_frequency >=", value, "loanPayFrequency");
            return (Criteria) this;
        }

        public Criteria andLoanPayFrequencyLessThan(Integer value) {
            addCriterion("loan_pay_frequency <", value, "loanPayFrequency");
            return (Criteria) this;
        }

        public Criteria andLoanPayFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("loan_pay_frequency <=", value, "loanPayFrequency");
            return (Criteria) this;
        }

        public Criteria andLoanPayFrequencyIn(List<Integer> values) {
            addCriterion("loan_pay_frequency in", values, "loanPayFrequency");
            return (Criteria) this;
        }

        public Criteria andLoanPayFrequencyNotIn(List<Integer> values) {
            addCriterion("loan_pay_frequency not in", values, "loanPayFrequency");
            return (Criteria) this;
        }

        public Criteria andLoanPayFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("loan_pay_frequency between", value1, value2, "loanPayFrequency");
            return (Criteria) this;
        }

        public Criteria andLoanPayFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_pay_frequency not between", value1, value2, "loanPayFrequency");
            return (Criteria) this;
        }

        public Criteria andLoanProductTypeIsNull() {
            addCriterion("loan_product_type is null");
            return (Criteria) this;
        }

        public Criteria andLoanProductTypeIsNotNull() {
            addCriterion("loan_product_type is not null");
            return (Criteria) this;
        }

        public Criteria andLoanProductTypeEqualTo(String value) {
            addCriterion("loan_product_type =", value, "loanProductType");
            return (Criteria) this;
        }

        public Criteria andLoanProductTypeNotEqualTo(String value) {
            addCriterion("loan_product_type <>", value, "loanProductType");
            return (Criteria) this;
        }

        public Criteria andLoanProductTypeGreaterThan(String value) {
            addCriterion("loan_product_type >", value, "loanProductType");
            return (Criteria) this;
        }

        public Criteria andLoanProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("loan_product_type >=", value, "loanProductType");
            return (Criteria) this;
        }

        public Criteria andLoanProductTypeLessThan(String value) {
            addCriterion("loan_product_type <", value, "loanProductType");
            return (Criteria) this;
        }

        public Criteria andLoanProductTypeLessThanOrEqualTo(String value) {
            addCriterion("loan_product_type <=", value, "loanProductType");
            return (Criteria) this;
        }

        public Criteria andLoanProductTypeLike(String value) {
            addCriterion("loan_product_type like", value, "loanProductType");
            return (Criteria) this;
        }

        public Criteria andLoanProductTypeNotLike(String value) {
            addCriterion("loan_product_type not like", value, "loanProductType");
            return (Criteria) this;
        }

        public Criteria andLoanProductTypeIn(List<String> values) {
            addCriterion("loan_product_type in", values, "loanProductType");
            return (Criteria) this;
        }

        public Criteria andLoanProductTypeNotIn(List<String> values) {
            addCriterion("loan_product_type not in", values, "loanProductType");
            return (Criteria) this;
        }

        public Criteria andLoanProductTypeBetween(String value1, String value2) {
            addCriterion("loan_product_type between", value1, value2, "loanProductType");
            return (Criteria) this;
        }

        public Criteria andLoanProductTypeNotBetween(String value1, String value2) {
            addCriterion("loan_product_type not between", value1, value2, "loanProductType");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdIsNull() {
            addCriterion("operate_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdIsNotNull() {
            addCriterion("operate_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdEqualTo(String value) {
            addCriterion("operate_user_id =", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotEqualTo(String value) {
            addCriterion("operate_user_id <>", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdGreaterThan(String value) {
            addCriterion("operate_user_id >", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("operate_user_id >=", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdLessThan(String value) {
            addCriterion("operate_user_id <", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdLessThanOrEqualTo(String value) {
            addCriterion("operate_user_id <=", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdLike(String value) {
            addCriterion("operate_user_id like", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotLike(String value) {
            addCriterion("operate_user_id not like", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdIn(List<String> values) {
            addCriterion("operate_user_id in", values, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotIn(List<String> values) {
            addCriterion("operate_user_id not in", values, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdBetween(String value1, String value2) {
            addCriterion("operate_user_id between", value1, value2, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotBetween(String value1, String value2) {
            addCriterion("operate_user_id not between", value1, value2, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNull() {
            addCriterion("operate_time is null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNotNull() {
            addCriterion("operate_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeEqualTo(Date value) {
            addCriterion("operate_time =", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotEqualTo(Date value) {
            addCriterion("operate_time <>", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThan(Date value) {
            addCriterion("operate_time >", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operate_time >=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThan(Date value) {
            addCriterion("operate_time <", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThanOrEqualTo(Date value) {
            addCriterion("operate_time <=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIn(List<Date> values) {
            addCriterion("operate_time in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotIn(List<Date> values) {
            addCriterion("operate_time not in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeBetween(Date value1, Date value2) {
            addCriterion("operate_time between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotBetween(Date value1, Date value2) {
            addCriterion("operate_time not between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andIsCalculationInterestIncludeLastdayIsNull() {
            addCriterion("is_calculation_Interest_include_lastDay is null");
            return (Criteria) this;
        }

        public Criteria andIsCalculationInterestIncludeLastdayIsNotNull() {
            addCriterion("is_calculation_Interest_include_lastDay is not null");
            return (Criteria) this;
        }

        public Criteria andIsCalculationInterestIncludeLastdayEqualTo(String value) {
            addCriterion("is_calculation_Interest_include_lastDay =", value, "isCalculationInterestIncludeLastday");
            return (Criteria) this;
        }

        public Criteria andIsCalculationInterestIncludeLastdayNotEqualTo(String value) {
            addCriterion("is_calculation_Interest_include_lastDay <>", value, "isCalculationInterestIncludeLastday");
            return (Criteria) this;
        }

        public Criteria andIsCalculationInterestIncludeLastdayGreaterThan(String value) {
            addCriterion("is_calculation_Interest_include_lastDay >", value, "isCalculationInterestIncludeLastday");
            return (Criteria) this;
        }

        public Criteria andIsCalculationInterestIncludeLastdayGreaterThanOrEqualTo(String value) {
            addCriterion("is_calculation_Interest_include_lastDay >=", value, "isCalculationInterestIncludeLastday");
            return (Criteria) this;
        }

        public Criteria andIsCalculationInterestIncludeLastdayLessThan(String value) {
            addCriterion("is_calculation_Interest_include_lastDay <", value, "isCalculationInterestIncludeLastday");
            return (Criteria) this;
        }

        public Criteria andIsCalculationInterestIncludeLastdayLessThanOrEqualTo(String value) {
            addCriterion("is_calculation_Interest_include_lastDay <=", value, "isCalculationInterestIncludeLastday");
            return (Criteria) this;
        }

        public Criteria andIsCalculationInterestIncludeLastdayLike(String value) {
            addCriterion("is_calculation_Interest_include_lastDay like", value, "isCalculationInterestIncludeLastday");
            return (Criteria) this;
        }

        public Criteria andIsCalculationInterestIncludeLastdayNotLike(String value) {
            addCriterion("is_calculation_Interest_include_lastDay not like", value, "isCalculationInterestIncludeLastday");
            return (Criteria) this;
        }

        public Criteria andIsCalculationInterestIncludeLastdayIn(List<String> values) {
            addCriterion("is_calculation_Interest_include_lastDay in", values, "isCalculationInterestIncludeLastday");
            return (Criteria) this;
        }

        public Criteria andIsCalculationInterestIncludeLastdayNotIn(List<String> values) {
            addCriterion("is_calculation_Interest_include_lastDay not in", values, "isCalculationInterestIncludeLastday");
            return (Criteria) this;
        }

        public Criteria andIsCalculationInterestIncludeLastdayBetween(String value1, String value2) {
            addCriterion("is_calculation_Interest_include_lastDay between", value1, value2, "isCalculationInterestIncludeLastday");
            return (Criteria) this;
        }

        public Criteria andIsCalculationInterestIncludeLastdayNotBetween(String value1, String value2) {
            addCriterion("is_calculation_Interest_include_lastDay not between", value1, value2, "isCalculationInterestIncludeLastday");
            return (Criteria) this;
        }

        public Criteria andIsFixedRepaymentDayIsNull() {
            addCriterion("is_fixed_repayment_day is null");
            return (Criteria) this;
        }

        public Criteria andIsFixedRepaymentDayIsNotNull() {
            addCriterion("is_fixed_repayment_day is not null");
            return (Criteria) this;
        }

        public Criteria andIsFixedRepaymentDayEqualTo(String value) {
            addCriterion("is_fixed_repayment_day =", value, "isFixedRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andIsFixedRepaymentDayNotEqualTo(String value) {
            addCriterion("is_fixed_repayment_day <>", value, "isFixedRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andIsFixedRepaymentDayGreaterThan(String value) {
            addCriterion("is_fixed_repayment_day >", value, "isFixedRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andIsFixedRepaymentDayGreaterThanOrEqualTo(String value) {
            addCriterion("is_fixed_repayment_day >=", value, "isFixedRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andIsFixedRepaymentDayLessThan(String value) {
            addCriterion("is_fixed_repayment_day <", value, "isFixedRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andIsFixedRepaymentDayLessThanOrEqualTo(String value) {
            addCriterion("is_fixed_repayment_day <=", value, "isFixedRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andIsFixedRepaymentDayLike(String value) {
            addCriterion("is_fixed_repayment_day like", value, "isFixedRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andIsFixedRepaymentDayNotLike(String value) {
            addCriterion("is_fixed_repayment_day not like", value, "isFixedRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andIsFixedRepaymentDayIn(List<String> values) {
            addCriterion("is_fixed_repayment_day in", values, "isFixedRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andIsFixedRepaymentDayNotIn(List<String> values) {
            addCriterion("is_fixed_repayment_day not in", values, "isFixedRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andIsFixedRepaymentDayBetween(String value1, String value2) {
            addCriterion("is_fixed_repayment_day between", value1, value2, "isFixedRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andIsFixedRepaymentDayNotBetween(String value1, String value2) {
            addCriterion("is_fixed_repayment_day not between", value1, value2, "isFixedRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andFixedRepaymentDateIsNull() {
            addCriterion("fixed_repayment_date is null");
            return (Criteria) this;
        }

        public Criteria andFixedRepaymentDateIsNotNull() {
            addCriterion("fixed_repayment_date is not null");
            return (Criteria) this;
        }

        public Criteria andFixedRepaymentDateEqualTo(Date value) {
            addCriterion("fixed_repayment_date =", value, "fixedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andFixedRepaymentDateNotEqualTo(Date value) {
            addCriterion("fixed_repayment_date <>", value, "fixedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andFixedRepaymentDateGreaterThan(Date value) {
            addCriterion("fixed_repayment_date >", value, "fixedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andFixedRepaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("fixed_repayment_date >=", value, "fixedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andFixedRepaymentDateLessThan(Date value) {
            addCriterion("fixed_repayment_date <", value, "fixedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andFixedRepaymentDateLessThanOrEqualTo(Date value) {
            addCriterion("fixed_repayment_date <=", value, "fixedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andFixedRepaymentDateIn(List<Date> values) {
            addCriterion("fixed_repayment_date in", values, "fixedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andFixedRepaymentDateNotIn(List<Date> values) {
            addCriterion("fixed_repayment_date not in", values, "fixedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andFixedRepaymentDateBetween(Date value1, Date value2) {
            addCriterion("fixed_repayment_date between", value1, value2, "fixedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andFixedRepaymentDateNotBetween(Date value1, Date value2) {
            addCriterion("fixed_repayment_date not between", value1, value2, "fixedRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andNotFullmonthRepaymentDayIsNull() {
            addCriterion("not_fullmonth_repayment_day is null");
            return (Criteria) this;
        }

        public Criteria andNotFullmonthRepaymentDayIsNotNull() {
            addCriterion("not_fullmonth_repayment_day is not null");
            return (Criteria) this;
        }

        public Criteria andNotFullmonthRepaymentDayEqualTo(String value) {
            addCriterion("not_fullmonth_repayment_day =", value, "notFullmonthRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andNotFullmonthRepaymentDayNotEqualTo(String value) {
            addCriterion("not_fullmonth_repayment_day <>", value, "notFullmonthRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andNotFullmonthRepaymentDayGreaterThan(String value) {
            addCriterion("not_fullmonth_repayment_day >", value, "notFullmonthRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andNotFullmonthRepaymentDayGreaterThanOrEqualTo(String value) {
            addCriterion("not_fullmonth_repayment_day >=", value, "notFullmonthRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andNotFullmonthRepaymentDayLessThan(String value) {
            addCriterion("not_fullmonth_repayment_day <", value, "notFullmonthRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andNotFullmonthRepaymentDayLessThanOrEqualTo(String value) {
            addCriterion("not_fullmonth_repayment_day <=", value, "notFullmonthRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andNotFullmonthRepaymentDayLike(String value) {
            addCriterion("not_fullmonth_repayment_day like", value, "notFullmonthRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andNotFullmonthRepaymentDayNotLike(String value) {
            addCriterion("not_fullmonth_repayment_day not like", value, "notFullmonthRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andNotFullmonthRepaymentDayIn(List<String> values) {
            addCriterion("not_fullmonth_repayment_day in", values, "notFullmonthRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andNotFullmonthRepaymentDayNotIn(List<String> values) {
            addCriterion("not_fullmonth_repayment_day not in", values, "notFullmonthRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andNotFullmonthRepaymentDayBetween(String value1, String value2) {
            addCriterion("not_fullmonth_repayment_day between", value1, value2, "notFullmonthRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andNotFullmonthRepaymentDayNotBetween(String value1, String value2) {
            addCriterion("not_fullmonth_repayment_day not between", value1, value2, "notFullmonthRepaymentDay");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeIsNull() {
            addCriterion("penalty_charge is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeIsNotNull() {
            addCriterion("penalty_charge is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeEqualTo(String value) {
            addCriterion("penalty_charge =", value, "penaltyCharge");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeNotEqualTo(String value) {
            addCriterion("penalty_charge <>", value, "penaltyCharge");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeGreaterThan(String value) {
            addCriterion("penalty_charge >", value, "penaltyCharge");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeGreaterThanOrEqualTo(String value) {
            addCriterion("penalty_charge >=", value, "penaltyCharge");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeLessThan(String value) {
            addCriterion("penalty_charge <", value, "penaltyCharge");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeLessThanOrEqualTo(String value) {
            addCriterion("penalty_charge <=", value, "penaltyCharge");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeLike(String value) {
            addCriterion("penalty_charge like", value, "penaltyCharge");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeNotLike(String value) {
            addCriterion("penalty_charge not like", value, "penaltyCharge");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeIn(List<String> values) {
            addCriterion("penalty_charge in", values, "penaltyCharge");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeNotIn(List<String> values) {
            addCriterion("penalty_charge not in", values, "penaltyCharge");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeBetween(String value1, String value2) {
            addCriterion("penalty_charge between", value1, value2, "penaltyCharge");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeNotBetween(String value1, String value2) {
            addCriterion("penalty_charge not between", value1, value2, "penaltyCharge");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeGraceDaysIsNull() {
            addCriterion("penalty_charge_grace_days is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeGraceDaysIsNotNull() {
            addCriterion("penalty_charge_grace_days is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeGraceDaysEqualTo(Integer value) {
            addCriterion("penalty_charge_grace_days =", value, "penaltyChargeGraceDays");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeGraceDaysNotEqualTo(Integer value) {
            addCriterion("penalty_charge_grace_days <>", value, "penaltyChargeGraceDays");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeGraceDaysGreaterThan(Integer value) {
            addCriterion("penalty_charge_grace_days >", value, "penaltyChargeGraceDays");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeGraceDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("penalty_charge_grace_days >=", value, "penaltyChargeGraceDays");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeGraceDaysLessThan(Integer value) {
            addCriterion("penalty_charge_grace_days <", value, "penaltyChargeGraceDays");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeGraceDaysLessThanOrEqualTo(Integer value) {
            addCriterion("penalty_charge_grace_days <=", value, "penaltyChargeGraceDays");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeGraceDaysIn(List<Integer> values) {
            addCriterion("penalty_charge_grace_days in", values, "penaltyChargeGraceDays");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeGraceDaysNotIn(List<Integer> values) {
            addCriterion("penalty_charge_grace_days not in", values, "penaltyChargeGraceDays");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeGraceDaysBetween(Integer value1, Integer value2) {
            addCriterion("penalty_charge_grace_days between", value1, value2, "penaltyChargeGraceDays");
            return (Criteria) this;
        }

        public Criteria andPenaltyChargeGraceDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("penalty_charge_grace_days not between", value1, value2, "penaltyChargeGraceDays");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateIsNull() {
            addCriterion("penalty_rate is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateIsNotNull() {
            addCriterion("penalty_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateEqualTo(Float value) {
            addCriterion("penalty_rate =", value, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateNotEqualTo(Float value) {
            addCriterion("penalty_rate <>", value, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateGreaterThan(Float value) {
            addCriterion("penalty_rate >", value, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateGreaterThanOrEqualTo(Float value) {
            addCriterion("penalty_rate >=", value, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateLessThan(Float value) {
            addCriterion("penalty_rate <", value, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateLessThanOrEqualTo(Float value) {
            addCriterion("penalty_rate <=", value, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateIn(List<Float> values) {
            addCriterion("penalty_rate in", values, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateNotIn(List<Float> values) {
            addCriterion("penalty_rate not in", values, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateBetween(Float value1, Float value2) {
            addCriterion("penalty_rate between", value1, value2, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateNotBetween(Float value1, Float value2) {
            addCriterion("penalty_rate not between", value1, value2, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andLateGraceDaysIsNull() {
            addCriterion("late_grace_days is null");
            return (Criteria) this;
        }

        public Criteria andLateGraceDaysIsNotNull() {
            addCriterion("late_grace_days is not null");
            return (Criteria) this;
        }

        public Criteria andLateGraceDaysEqualTo(Integer value) {
            addCriterion("late_grace_days =", value, "lateGraceDays");
            return (Criteria) this;
        }

        public Criteria andLateGraceDaysNotEqualTo(Integer value) {
            addCriterion("late_grace_days <>", value, "lateGraceDays");
            return (Criteria) this;
        }

        public Criteria andLateGraceDaysGreaterThan(Integer value) {
            addCriterion("late_grace_days >", value, "lateGraceDays");
            return (Criteria) this;
        }

        public Criteria andLateGraceDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("late_grace_days >=", value, "lateGraceDays");
            return (Criteria) this;
        }

        public Criteria andLateGraceDaysLessThan(Integer value) {
            addCriterion("late_grace_days <", value, "lateGraceDays");
            return (Criteria) this;
        }

        public Criteria andLateGraceDaysLessThanOrEqualTo(Integer value) {
            addCriterion("late_grace_days <=", value, "lateGraceDays");
            return (Criteria) this;
        }

        public Criteria andLateGraceDaysIn(List<Integer> values) {
            addCriterion("late_grace_days in", values, "lateGraceDays");
            return (Criteria) this;
        }

        public Criteria andLateGraceDaysNotIn(List<Integer> values) {
            addCriterion("late_grace_days not in", values, "lateGraceDays");
            return (Criteria) this;
        }

        public Criteria andLateGraceDaysBetween(Integer value1, Integer value2) {
            addCriterion("late_grace_days between", value1, value2, "lateGraceDays");
            return (Criteria) this;
        }

        public Criteria andLateGraceDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("late_grace_days not between", value1, value2, "lateGraceDays");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestCalculationMethodIsNull() {
            addCriterion("payment_plan_interest_calculation_method is null");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestCalculationMethodIsNotNull() {
            addCriterion("payment_plan_interest_calculation_method is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestCalculationMethodEqualTo(String value) {
            addCriterion("payment_plan_interest_calculation_method =", value, "paymentPlanInterestCalculationMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestCalculationMethodNotEqualTo(String value) {
            addCriterion("payment_plan_interest_calculation_method <>", value, "paymentPlanInterestCalculationMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestCalculationMethodGreaterThan(String value) {
            addCriterion("payment_plan_interest_calculation_method >", value, "paymentPlanInterestCalculationMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestCalculationMethodGreaterThanOrEqualTo(String value) {
            addCriterion("payment_plan_interest_calculation_method >=", value, "paymentPlanInterestCalculationMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestCalculationMethodLessThan(String value) {
            addCriterion("payment_plan_interest_calculation_method <", value, "paymentPlanInterestCalculationMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestCalculationMethodLessThanOrEqualTo(String value) {
            addCriterion("payment_plan_interest_calculation_method <=", value, "paymentPlanInterestCalculationMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestCalculationMethodLike(String value) {
            addCriterion("payment_plan_interest_calculation_method like", value, "paymentPlanInterestCalculationMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestCalculationMethodNotLike(String value) {
            addCriterion("payment_plan_interest_calculation_method not like", value, "paymentPlanInterestCalculationMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestCalculationMethodIn(List<String> values) {
            addCriterion("payment_plan_interest_calculation_method in", values, "paymentPlanInterestCalculationMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestCalculationMethodNotIn(List<String> values) {
            addCriterion("payment_plan_interest_calculation_method not in", values, "paymentPlanInterestCalculationMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestCalculationMethodBetween(String value1, String value2) {
            addCriterion("payment_plan_interest_calculation_method between", value1, value2, "paymentPlanInterestCalculationMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestCalculationMethodNotBetween(String value1, String value2) {
            addCriterion("payment_plan_interest_calculation_method not between", value1, value2, "paymentPlanInterestCalculationMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestHandleMethodIsNull() {
            addCriterion("payment_plan_interest_handle_method is null");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestHandleMethodIsNotNull() {
            addCriterion("payment_plan_interest_handle_method is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestHandleMethodEqualTo(String value) {
            addCriterion("payment_plan_interest_handle_method =", value, "paymentPlanInterestHandleMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestHandleMethodNotEqualTo(String value) {
            addCriterion("payment_plan_interest_handle_method <>", value, "paymentPlanInterestHandleMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestHandleMethodGreaterThan(String value) {
            addCriterion("payment_plan_interest_handle_method >", value, "paymentPlanInterestHandleMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestHandleMethodGreaterThanOrEqualTo(String value) {
            addCriterion("payment_plan_interest_handle_method >=", value, "paymentPlanInterestHandleMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestHandleMethodLessThan(String value) {
            addCriterion("payment_plan_interest_handle_method <", value, "paymentPlanInterestHandleMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestHandleMethodLessThanOrEqualTo(String value) {
            addCriterion("payment_plan_interest_handle_method <=", value, "paymentPlanInterestHandleMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestHandleMethodLike(String value) {
            addCriterion("payment_plan_interest_handle_method like", value, "paymentPlanInterestHandleMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestHandleMethodNotLike(String value) {
            addCriterion("payment_plan_interest_handle_method not like", value, "paymentPlanInterestHandleMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestHandleMethodIn(List<String> values) {
            addCriterion("payment_plan_interest_handle_method in", values, "paymentPlanInterestHandleMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestHandleMethodNotIn(List<String> values) {
            addCriterion("payment_plan_interest_handle_method not in", values, "paymentPlanInterestHandleMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestHandleMethodBetween(String value1, String value2) {
            addCriterion("payment_plan_interest_handle_method between", value1, value2, "paymentPlanInterestHandleMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentPlanInterestHandleMethodNotBetween(String value1, String value2) {
            addCriterion("payment_plan_interest_handle_method not between", value1, value2, "paymentPlanInterestHandleMethod");
            return (Criteria) this;
        }

        public Criteria andPenaltyPenaltyHandMethodIsNull() {
            addCriterion("penalty_penalty_hand_method is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyPenaltyHandMethodIsNotNull() {
            addCriterion("penalty_penalty_hand_method is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyPenaltyHandMethodEqualTo(String value) {
            addCriterion("penalty_penalty_hand_method =", value, "penaltyPenaltyHandMethod");
            return (Criteria) this;
        }

        public Criteria andPenaltyPenaltyHandMethodNotEqualTo(String value) {
            addCriterion("penalty_penalty_hand_method <>", value, "penaltyPenaltyHandMethod");
            return (Criteria) this;
        }

        public Criteria andPenaltyPenaltyHandMethodGreaterThan(String value) {
            addCriterion("penalty_penalty_hand_method >", value, "penaltyPenaltyHandMethod");
            return (Criteria) this;
        }

        public Criteria andPenaltyPenaltyHandMethodGreaterThanOrEqualTo(String value) {
            addCriterion("penalty_penalty_hand_method >=", value, "penaltyPenaltyHandMethod");
            return (Criteria) this;
        }

        public Criteria andPenaltyPenaltyHandMethodLessThan(String value) {
            addCriterion("penalty_penalty_hand_method <", value, "penaltyPenaltyHandMethod");
            return (Criteria) this;
        }

        public Criteria andPenaltyPenaltyHandMethodLessThanOrEqualTo(String value) {
            addCriterion("penalty_penalty_hand_method <=", value, "penaltyPenaltyHandMethod");
            return (Criteria) this;
        }

        public Criteria andPenaltyPenaltyHandMethodLike(String value) {
            addCriterion("penalty_penalty_hand_method like", value, "penaltyPenaltyHandMethod");
            return (Criteria) this;
        }

        public Criteria andPenaltyPenaltyHandMethodNotLike(String value) {
            addCriterion("penalty_penalty_hand_method not like", value, "penaltyPenaltyHandMethod");
            return (Criteria) this;
        }

        public Criteria andPenaltyPenaltyHandMethodIn(List<String> values) {
            addCriterion("penalty_penalty_hand_method in", values, "penaltyPenaltyHandMethod");
            return (Criteria) this;
        }

        public Criteria andPenaltyPenaltyHandMethodNotIn(List<String> values) {
            addCriterion("penalty_penalty_hand_method not in", values, "penaltyPenaltyHandMethod");
            return (Criteria) this;
        }

        public Criteria andPenaltyPenaltyHandMethodBetween(String value1, String value2) {
            addCriterion("penalty_penalty_hand_method between", value1, value2, "penaltyPenaltyHandMethod");
            return (Criteria) this;
        }

        public Criteria andPenaltyPenaltyHandMethodNotBetween(String value1, String value2) {
            addCriterion("penalty_penalty_hand_method not between", value1, value2, "penaltyPenaltyHandMethod");
            return (Criteria) this;
        }

        public Criteria andRecoverLessSterilisationRuleIsNull() {
            addCriterion("recover_less_sterilisation_rule is null");
            return (Criteria) this;
        }

        public Criteria andRecoverLessSterilisationRuleIsNotNull() {
            addCriterion("recover_less_sterilisation_rule is not null");
            return (Criteria) this;
        }

        public Criteria andRecoverLessSterilisationRuleEqualTo(String value) {
            addCriterion("recover_less_sterilisation_rule =", value, "recoverLessSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverLessSterilisationRuleNotEqualTo(String value) {
            addCriterion("recover_less_sterilisation_rule <>", value, "recoverLessSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverLessSterilisationRuleGreaterThan(String value) {
            addCriterion("recover_less_sterilisation_rule >", value, "recoverLessSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverLessSterilisationRuleGreaterThanOrEqualTo(String value) {
            addCriterion("recover_less_sterilisation_rule >=", value, "recoverLessSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverLessSterilisationRuleLessThan(String value) {
            addCriterion("recover_less_sterilisation_rule <", value, "recoverLessSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverLessSterilisationRuleLessThanOrEqualTo(String value) {
            addCriterion("recover_less_sterilisation_rule <=", value, "recoverLessSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverLessSterilisationRuleLike(String value) {
            addCriterion("recover_less_sterilisation_rule like", value, "recoverLessSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverLessSterilisationRuleNotLike(String value) {
            addCriterion("recover_less_sterilisation_rule not like", value, "recoverLessSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverLessSterilisationRuleIn(List<String> values) {
            addCriterion("recover_less_sterilisation_rule in", values, "recoverLessSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverLessSterilisationRuleNotIn(List<String> values) {
            addCriterion("recover_less_sterilisation_rule not in", values, "recoverLessSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverLessSterilisationRuleBetween(String value1, String value2) {
            addCriterion("recover_less_sterilisation_rule between", value1, value2, "recoverLessSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverLessSterilisationRuleNotBetween(String value1, String value2) {
            addCriterion("recover_less_sterilisation_rule not between", value1, value2, "recoverLessSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverMoreSterilisationRuleIsNull() {
            addCriterion("recover_more_sterilisation_rule is null");
            return (Criteria) this;
        }

        public Criteria andRecoverMoreSterilisationRuleIsNotNull() {
            addCriterion("recover_more_sterilisation_rule is not null");
            return (Criteria) this;
        }

        public Criteria andRecoverMoreSterilisationRuleEqualTo(String value) {
            addCriterion("recover_more_sterilisation_rule =", value, "recoverMoreSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverMoreSterilisationRuleNotEqualTo(String value) {
            addCriterion("recover_more_sterilisation_rule <>", value, "recoverMoreSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverMoreSterilisationRuleGreaterThan(String value) {
            addCriterion("recover_more_sterilisation_rule >", value, "recoverMoreSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverMoreSterilisationRuleGreaterThanOrEqualTo(String value) {
            addCriterion("recover_more_sterilisation_rule >=", value, "recoverMoreSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverMoreSterilisationRuleLessThan(String value) {
            addCriterion("recover_more_sterilisation_rule <", value, "recoverMoreSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverMoreSterilisationRuleLessThanOrEqualTo(String value) {
            addCriterion("recover_more_sterilisation_rule <=", value, "recoverMoreSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverMoreSterilisationRuleLike(String value) {
            addCriterion("recover_more_sterilisation_rule like", value, "recoverMoreSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverMoreSterilisationRuleNotLike(String value) {
            addCriterion("recover_more_sterilisation_rule not like", value, "recoverMoreSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverMoreSterilisationRuleIn(List<String> values) {
            addCriterion("recover_more_sterilisation_rule in", values, "recoverMoreSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverMoreSterilisationRuleNotIn(List<String> values) {
            addCriterion("recover_more_sterilisation_rule not in", values, "recoverMoreSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverMoreSterilisationRuleBetween(String value1, String value2) {
            addCriterion("recover_more_sterilisation_rule between", value1, value2, "recoverMoreSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andRecoverMoreSterilisationRuleNotBetween(String value1, String value2) {
            addCriterion("recover_more_sterilisation_rule not between", value1, value2, "recoverMoreSterilisationRule");
            return (Criteria) this;
        }

        public Criteria andProjectEndStateIsNull() {
            addCriterion("project_end_state is null");
            return (Criteria) this;
        }

        public Criteria andProjectEndStateIsNotNull() {
            addCriterion("project_end_state is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEndStateEqualTo(String value) {
            addCriterion("project_end_state =", value, "projectEndState");
            return (Criteria) this;
        }

        public Criteria andProjectEndStateNotEqualTo(String value) {
            addCriterion("project_end_state <>", value, "projectEndState");
            return (Criteria) this;
        }

        public Criteria andProjectEndStateGreaterThan(String value) {
            addCriterion("project_end_state >", value, "projectEndState");
            return (Criteria) this;
        }

        public Criteria andProjectEndStateGreaterThanOrEqualTo(String value) {
            addCriterion("project_end_state >=", value, "projectEndState");
            return (Criteria) this;
        }

        public Criteria andProjectEndStateLessThan(String value) {
            addCriterion("project_end_state <", value, "projectEndState");
            return (Criteria) this;
        }

        public Criteria andProjectEndStateLessThanOrEqualTo(String value) {
            addCriterion("project_end_state <=", value, "projectEndState");
            return (Criteria) this;
        }

        public Criteria andProjectEndStateLike(String value) {
            addCriterion("project_end_state like", value, "projectEndState");
            return (Criteria) this;
        }

        public Criteria andProjectEndStateNotLike(String value) {
            addCriterion("project_end_state not like", value, "projectEndState");
            return (Criteria) this;
        }

        public Criteria andProjectEndStateIn(List<String> values) {
            addCriterion("project_end_state in", values, "projectEndState");
            return (Criteria) this;
        }

        public Criteria andProjectEndStateNotIn(List<String> values) {
            addCriterion("project_end_state not in", values, "projectEndState");
            return (Criteria) this;
        }

        public Criteria andProjectEndStateBetween(String value1, String value2) {
            addCriterion("project_end_state between", value1, value2, "projectEndState");
            return (Criteria) this;
        }

        public Criteria andProjectEndStateNotBetween(String value1, String value2) {
            addCriterion("project_end_state not between", value1, value2, "projectEndState");
            return (Criteria) this;
        }

        public Criteria andCurrentAuditLinkIsNull() {
            addCriterion("current_audit_link is null");
            return (Criteria) this;
        }

        public Criteria andCurrentAuditLinkIsNotNull() {
            addCriterion("current_audit_link is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentAuditLinkEqualTo(String value) {
            addCriterion("current_audit_link =", value, "currentAuditLink");
            return (Criteria) this;
        }

        public Criteria andCurrentAuditLinkNotEqualTo(String value) {
            addCriterion("current_audit_link <>", value, "currentAuditLink");
            return (Criteria) this;
        }

        public Criteria andCurrentAuditLinkGreaterThan(String value) {
            addCriterion("current_audit_link >", value, "currentAuditLink");
            return (Criteria) this;
        }

        public Criteria andCurrentAuditLinkGreaterThanOrEqualTo(String value) {
            addCriterion("current_audit_link >=", value, "currentAuditLink");
            return (Criteria) this;
        }

        public Criteria andCurrentAuditLinkLessThan(String value) {
            addCriterion("current_audit_link <", value, "currentAuditLink");
            return (Criteria) this;
        }

        public Criteria andCurrentAuditLinkLessThanOrEqualTo(String value) {
            addCriterion("current_audit_link <=", value, "currentAuditLink");
            return (Criteria) this;
        }

        public Criteria andCurrentAuditLinkLike(String value) {
            addCriterion("current_audit_link like", value, "currentAuditLink");
            return (Criteria) this;
        }

        public Criteria andCurrentAuditLinkNotLike(String value) {
            addCriterion("current_audit_link not like", value, "currentAuditLink");
            return (Criteria) this;
        }

        public Criteria andCurrentAuditLinkIn(List<String> values) {
            addCriterion("current_audit_link in", values, "currentAuditLink");
            return (Criteria) this;
        }

        public Criteria andCurrentAuditLinkNotIn(List<String> values) {
            addCriterion("current_audit_link not in", values, "currentAuditLink");
            return (Criteria) this;
        }

        public Criteria andCurrentAuditLinkBetween(String value1, String value2) {
            addCriterion("current_audit_link between", value1, value2, "currentAuditLink");
            return (Criteria) this;
        }

        public Criteria andCurrentAuditLinkNotBetween(String value1, String value2) {
            addCriterion("current_audit_link not between", value1, value2, "currentAuditLink");
            return (Criteria) this;
        }

        public Criteria andLastAuditOpinionIsNull() {
            addCriterion("last_audit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andLastAuditOpinionIsNotNull() {
            addCriterion("last_audit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andLastAuditOpinionEqualTo(String value) {
            addCriterion("last_audit_opinion =", value, "lastAuditOpinion");
            return (Criteria) this;
        }

        public Criteria andLastAuditOpinionNotEqualTo(String value) {
            addCriterion("last_audit_opinion <>", value, "lastAuditOpinion");
            return (Criteria) this;
        }

        public Criteria andLastAuditOpinionGreaterThan(String value) {
            addCriterion("last_audit_opinion >", value, "lastAuditOpinion");
            return (Criteria) this;
        }

        public Criteria andLastAuditOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("last_audit_opinion >=", value, "lastAuditOpinion");
            return (Criteria) this;
        }

        public Criteria andLastAuditOpinionLessThan(String value) {
            addCriterion("last_audit_opinion <", value, "lastAuditOpinion");
            return (Criteria) this;
        }

        public Criteria andLastAuditOpinionLessThanOrEqualTo(String value) {
            addCriterion("last_audit_opinion <=", value, "lastAuditOpinion");
            return (Criteria) this;
        }

        public Criteria andLastAuditOpinionLike(String value) {
            addCriterion("last_audit_opinion like", value, "lastAuditOpinion");
            return (Criteria) this;
        }

        public Criteria andLastAuditOpinionNotLike(String value) {
            addCriterion("last_audit_opinion not like", value, "lastAuditOpinion");
            return (Criteria) this;
        }

        public Criteria andLastAuditOpinionIn(List<String> values) {
            addCriterion("last_audit_opinion in", values, "lastAuditOpinion");
            return (Criteria) this;
        }

        public Criteria andLastAuditOpinionNotIn(List<String> values) {
            addCriterion("last_audit_opinion not in", values, "lastAuditOpinion");
            return (Criteria) this;
        }

        public Criteria andLastAuditOpinionBetween(String value1, String value2) {
            addCriterion("last_audit_opinion between", value1, value2, "lastAuditOpinion");
            return (Criteria) this;
        }

        public Criteria andLastAuditOpinionNotBetween(String value1, String value2) {
            addCriterion("last_audit_opinion not between", value1, value2, "lastAuditOpinion");
            return (Criteria) this;
        }

        public Criteria andResponsibleInvestigationStateIsNull() {
            addCriterion("responsible_investigation_state is null");
            return (Criteria) this;
        }

        public Criteria andResponsibleInvestigationStateIsNotNull() {
            addCriterion("responsible_investigation_state is not null");
            return (Criteria) this;
        }

        public Criteria andResponsibleInvestigationStateEqualTo(String value) {
            addCriterion("responsible_investigation_state =", value, "responsibleInvestigationState");
            return (Criteria) this;
        }

        public Criteria andResponsibleInvestigationStateNotEqualTo(String value) {
            addCriterion("responsible_investigation_state <>", value, "responsibleInvestigationState");
            return (Criteria) this;
        }

        public Criteria andResponsibleInvestigationStateGreaterThan(String value) {
            addCriterion("responsible_investigation_state >", value, "responsibleInvestigationState");
            return (Criteria) this;
        }

        public Criteria andResponsibleInvestigationStateGreaterThanOrEqualTo(String value) {
            addCriterion("responsible_investigation_state >=", value, "responsibleInvestigationState");
            return (Criteria) this;
        }

        public Criteria andResponsibleInvestigationStateLessThan(String value) {
            addCriterion("responsible_investigation_state <", value, "responsibleInvestigationState");
            return (Criteria) this;
        }

        public Criteria andResponsibleInvestigationStateLessThanOrEqualTo(String value) {
            addCriterion("responsible_investigation_state <=", value, "responsibleInvestigationState");
            return (Criteria) this;
        }

        public Criteria andResponsibleInvestigationStateLike(String value) {
            addCriterion("responsible_investigation_state like", value, "responsibleInvestigationState");
            return (Criteria) this;
        }

        public Criteria andResponsibleInvestigationStateNotLike(String value) {
            addCriterion("responsible_investigation_state not like", value, "responsibleInvestigationState");
            return (Criteria) this;
        }

        public Criteria andResponsibleInvestigationStateIn(List<String> values) {
            addCriterion("responsible_investigation_state in", values, "responsibleInvestigationState");
            return (Criteria) this;
        }

        public Criteria andResponsibleInvestigationStateNotIn(List<String> values) {
            addCriterion("responsible_investigation_state not in", values, "responsibleInvestigationState");
            return (Criteria) this;
        }

        public Criteria andResponsibleInvestigationStateBetween(String value1, String value2) {
            addCriterion("responsible_investigation_state between", value1, value2, "responsibleInvestigationState");
            return (Criteria) this;
        }

        public Criteria andResponsibleInvestigationStateNotBetween(String value1, String value2) {
            addCriterion("responsible_investigation_state not between", value1, value2, "responsibleInvestigationState");
            return (Criteria) this;
        }

        public Criteria andRiskInvestigationStateIsNull() {
            addCriterion("risk_investigation_state is null");
            return (Criteria) this;
        }

        public Criteria andRiskInvestigationStateIsNotNull() {
            addCriterion("risk_investigation_state is not null");
            return (Criteria) this;
        }

        public Criteria andRiskInvestigationStateEqualTo(String value) {
            addCriterion("risk_investigation_state =", value, "riskInvestigationState");
            return (Criteria) this;
        }

        public Criteria andRiskInvestigationStateNotEqualTo(String value) {
            addCriterion("risk_investigation_state <>", value, "riskInvestigationState");
            return (Criteria) this;
        }

        public Criteria andRiskInvestigationStateGreaterThan(String value) {
            addCriterion("risk_investigation_state >", value, "riskInvestigationState");
            return (Criteria) this;
        }

        public Criteria andRiskInvestigationStateGreaterThanOrEqualTo(String value) {
            addCriterion("risk_investigation_state >=", value, "riskInvestigationState");
            return (Criteria) this;
        }

        public Criteria andRiskInvestigationStateLessThan(String value) {
            addCriterion("risk_investigation_state <", value, "riskInvestigationState");
            return (Criteria) this;
        }

        public Criteria andRiskInvestigationStateLessThanOrEqualTo(String value) {
            addCriterion("risk_investigation_state <=", value, "riskInvestigationState");
            return (Criteria) this;
        }

        public Criteria andRiskInvestigationStateLike(String value) {
            addCriterion("risk_investigation_state like", value, "riskInvestigationState");
            return (Criteria) this;
        }

        public Criteria andRiskInvestigationStateNotLike(String value) {
            addCriterion("risk_investigation_state not like", value, "riskInvestigationState");
            return (Criteria) this;
        }

        public Criteria andRiskInvestigationStateIn(List<String> values) {
            addCriterion("risk_investigation_state in", values, "riskInvestigationState");
            return (Criteria) this;
        }

        public Criteria andRiskInvestigationStateNotIn(List<String> values) {
            addCriterion("risk_investigation_state not in", values, "riskInvestigationState");
            return (Criteria) this;
        }

        public Criteria andRiskInvestigationStateBetween(String value1, String value2) {
            addCriterion("risk_investigation_state between", value1, value2, "riskInvestigationState");
            return (Criteria) this;
        }

        public Criteria andRiskInvestigationStateNotBetween(String value1, String value2) {
            addCriterion("risk_investigation_state not between", value1, value2, "riskInvestigationState");
            return (Criteria) this;
        }

        public Criteria andPendingWillAllocateStateIsNull() {
            addCriterion("pending_will_allocate_state is null");
            return (Criteria) this;
        }

        public Criteria andPendingWillAllocateStateIsNotNull() {
            addCriterion("pending_will_allocate_state is not null");
            return (Criteria) this;
        }

        public Criteria andPendingWillAllocateStateEqualTo(String value) {
            addCriterion("pending_will_allocate_state =", value, "pendingWillAllocateState");
            return (Criteria) this;
        }

        public Criteria andPendingWillAllocateStateNotEqualTo(String value) {
            addCriterion("pending_will_allocate_state <>", value, "pendingWillAllocateState");
            return (Criteria) this;
        }

        public Criteria andPendingWillAllocateStateGreaterThan(String value) {
            addCriterion("pending_will_allocate_state >", value, "pendingWillAllocateState");
            return (Criteria) this;
        }

        public Criteria andPendingWillAllocateStateGreaterThanOrEqualTo(String value) {
            addCriterion("pending_will_allocate_state >=", value, "pendingWillAllocateState");
            return (Criteria) this;
        }

        public Criteria andPendingWillAllocateStateLessThan(String value) {
            addCriterion("pending_will_allocate_state <", value, "pendingWillAllocateState");
            return (Criteria) this;
        }

        public Criteria andPendingWillAllocateStateLessThanOrEqualTo(String value) {
            addCriterion("pending_will_allocate_state <=", value, "pendingWillAllocateState");
            return (Criteria) this;
        }

        public Criteria andPendingWillAllocateStateLike(String value) {
            addCriterion("pending_will_allocate_state like", value, "pendingWillAllocateState");
            return (Criteria) this;
        }

        public Criteria andPendingWillAllocateStateNotLike(String value) {
            addCriterion("pending_will_allocate_state not like", value, "pendingWillAllocateState");
            return (Criteria) this;
        }

        public Criteria andPendingWillAllocateStateIn(List<String> values) {
            addCriterion("pending_will_allocate_state in", values, "pendingWillAllocateState");
            return (Criteria) this;
        }

        public Criteria andPendingWillAllocateStateNotIn(List<String> values) {
            addCriterion("pending_will_allocate_state not in", values, "pendingWillAllocateState");
            return (Criteria) this;
        }

        public Criteria andPendingWillAllocateStateBetween(String value1, String value2) {
            addCriterion("pending_will_allocate_state between", value1, value2, "pendingWillAllocateState");
            return (Criteria) this;
        }

        public Criteria andPendingWillAllocateStateNotBetween(String value1, String value2) {
            addCriterion("pending_will_allocate_state not between", value1, value2, "pendingWillAllocateState");
            return (Criteria) this;
        }

        public Criteria andPayAuditStateIsNull() {
            addCriterion("pay_audit_state is null");
            return (Criteria) this;
        }

        public Criteria andPayAuditStateIsNotNull() {
            addCriterion("pay_audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andPayAuditStateEqualTo(String value) {
            addCriterion("pay_audit_state =", value, "payAuditState");
            return (Criteria) this;
        }

        public Criteria andPayAuditStateNotEqualTo(String value) {
            addCriterion("pay_audit_state <>", value, "payAuditState");
            return (Criteria) this;
        }

        public Criteria andPayAuditStateGreaterThan(String value) {
            addCriterion("pay_audit_state >", value, "payAuditState");
            return (Criteria) this;
        }

        public Criteria andPayAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("pay_audit_state >=", value, "payAuditState");
            return (Criteria) this;
        }

        public Criteria andPayAuditStateLessThan(String value) {
            addCriterion("pay_audit_state <", value, "payAuditState");
            return (Criteria) this;
        }

        public Criteria andPayAuditStateLessThanOrEqualTo(String value) {
            addCriterion("pay_audit_state <=", value, "payAuditState");
            return (Criteria) this;
        }

        public Criteria andPayAuditStateLike(String value) {
            addCriterion("pay_audit_state like", value, "payAuditState");
            return (Criteria) this;
        }

        public Criteria andPayAuditStateNotLike(String value) {
            addCriterion("pay_audit_state not like", value, "payAuditState");
            return (Criteria) this;
        }

        public Criteria andPayAuditStateIn(List<String> values) {
            addCriterion("pay_audit_state in", values, "payAuditState");
            return (Criteria) this;
        }

        public Criteria andPayAuditStateNotIn(List<String> values) {
            addCriterion("pay_audit_state not in", values, "payAuditState");
            return (Criteria) this;
        }

        public Criteria andPayAuditStateBetween(String value1, String value2) {
            addCriterion("pay_audit_state between", value1, value2, "payAuditState");
            return (Criteria) this;
        }

        public Criteria andPayAuditStateNotBetween(String value1, String value2) {
            addCriterion("pay_audit_state not between", value1, value2, "payAuditState");
            return (Criteria) this;
        }

        public Criteria andFileDataStateIsNull() {
            addCriterion("file_data_state is null");
            return (Criteria) this;
        }

        public Criteria andFileDataStateIsNotNull() {
            addCriterion("file_data_state is not null");
            return (Criteria) this;
        }

        public Criteria andFileDataStateEqualTo(String value) {
            addCriterion("file_data_state =", value, "fileDataState");
            return (Criteria) this;
        }

        public Criteria andFileDataStateNotEqualTo(String value) {
            addCriterion("file_data_state <>", value, "fileDataState");
            return (Criteria) this;
        }

        public Criteria andFileDataStateGreaterThan(String value) {
            addCriterion("file_data_state >", value, "fileDataState");
            return (Criteria) this;
        }

        public Criteria andFileDataStateGreaterThanOrEqualTo(String value) {
            addCriterion("file_data_state >=", value, "fileDataState");
            return (Criteria) this;
        }

        public Criteria andFileDataStateLessThan(String value) {
            addCriterion("file_data_state <", value, "fileDataState");
            return (Criteria) this;
        }

        public Criteria andFileDataStateLessThanOrEqualTo(String value) {
            addCriterion("file_data_state <=", value, "fileDataState");
            return (Criteria) this;
        }

        public Criteria andFileDataStateLike(String value) {
            addCriterion("file_data_state like", value, "fileDataState");
            return (Criteria) this;
        }

        public Criteria andFileDataStateNotLike(String value) {
            addCriterion("file_data_state not like", value, "fileDataState");
            return (Criteria) this;
        }

        public Criteria andFileDataStateIn(List<String> values) {
            addCriterion("file_data_state in", values, "fileDataState");
            return (Criteria) this;
        }

        public Criteria andFileDataStateNotIn(List<String> values) {
            addCriterion("file_data_state not in", values, "fileDataState");
            return (Criteria) this;
        }

        public Criteria andFileDataStateBetween(String value1, String value2) {
            addCriterion("file_data_state between", value1, value2, "fileDataState");
            return (Criteria) this;
        }

        public Criteria andFileDataStateNotBetween(String value1, String value2) {
            addCriterion("file_data_state not between", value1, value2, "fileDataState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andBusinessVarietyIsNull() {
            addCriterion("business_variety is null");
            return (Criteria) this;
        }

        public Criteria andBusinessVarietyIsNotNull() {
            addCriterion("business_variety is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessVarietyEqualTo(Integer value) {
            addCriterion("business_variety =", value, "businessVariety");
            return (Criteria) this;
        }

        public Criteria andBusinessVarietyNotEqualTo(Integer value) {
            addCriterion("business_variety <>", value, "businessVariety");
            return (Criteria) this;
        }

        public Criteria andBusinessVarietyGreaterThan(Integer value) {
            addCriterion("business_variety >", value, "businessVariety");
            return (Criteria) this;
        }

        public Criteria andBusinessVarietyGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_variety >=", value, "businessVariety");
            return (Criteria) this;
        }

        public Criteria andBusinessVarietyLessThan(Integer value) {
            addCriterion("business_variety <", value, "businessVariety");
            return (Criteria) this;
        }

        public Criteria andBusinessVarietyLessThanOrEqualTo(Integer value) {
            addCriterion("business_variety <=", value, "businessVariety");
            return (Criteria) this;
        }

        public Criteria andBusinessVarietyIn(List<Integer> values) {
            addCriterion("business_variety in", values, "businessVariety");
            return (Criteria) this;
        }

        public Criteria andBusinessVarietyNotIn(List<Integer> values) {
            addCriterion("business_variety not in", values, "businessVariety");
            return (Criteria) this;
        }

        public Criteria andBusinessVarietyBetween(Integer value1, Integer value2) {
            addCriterion("business_variety between", value1, value2, "businessVariety");
            return (Criteria) this;
        }

        public Criteria andBusinessVarietyNotBetween(Integer value1, Integer value2) {
            addCriterion("business_variety not between", value1, value2, "businessVariety");
            return (Criteria) this;
        }

        public Criteria andDateOfApplicationIsNull() {
            addCriterion("date_of_application is null");
            return (Criteria) this;
        }

        public Criteria andDateOfApplicationIsNotNull() {
            addCriterion("date_of_application is not null");
            return (Criteria) this;
        }

        public Criteria andDateOfApplicationEqualTo(Date value) {
            addCriterion("date_of_application =", value, "dateOfApplication");
            return (Criteria) this;
        }

        public Criteria andDateOfApplicationNotEqualTo(Date value) {
            addCriterion("date_of_application <>", value, "dateOfApplication");
            return (Criteria) this;
        }

        public Criteria andDateOfApplicationGreaterThan(Date value) {
            addCriterion("date_of_application >", value, "dateOfApplication");
            return (Criteria) this;
        }

        public Criteria andDateOfApplicationGreaterThanOrEqualTo(Date value) {
            addCriterion("date_of_application >=", value, "dateOfApplication");
            return (Criteria) this;
        }

        public Criteria andDateOfApplicationLessThan(Date value) {
            addCriterion("date_of_application <", value, "dateOfApplication");
            return (Criteria) this;
        }

        public Criteria andDateOfApplicationLessThanOrEqualTo(Date value) {
            addCriterion("date_of_application <=", value, "dateOfApplication");
            return (Criteria) this;
        }

        public Criteria andDateOfApplicationIn(List<Date> values) {
            addCriterion("date_of_application in", values, "dateOfApplication");
            return (Criteria) this;
        }

        public Criteria andDateOfApplicationNotIn(List<Date> values) {
            addCriterion("date_of_application not in", values, "dateOfApplication");
            return (Criteria) this;
        }

        public Criteria andDateOfApplicationBetween(Date value1, Date value2) {
            addCriterion("date_of_application between", value1, value2, "dateOfApplication");
            return (Criteria) this;
        }

        public Criteria andDateOfApplicationNotBetween(Date value1, Date value2) {
            addCriterion("date_of_application not between", value1, value2, "dateOfApplication");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIsNull() {
            addCriterion("repayment_date is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIsNotNull() {
            addCriterion("repayment_date is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateEqualTo(Date value) {
            addCriterion("repayment_date =", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotEqualTo(Date value) {
            addCriterion("repayment_date <>", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateGreaterThan(Date value) {
            addCriterion("repayment_date >", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("repayment_date >=", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateLessThan(Date value) {
            addCriterion("repayment_date <", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateLessThanOrEqualTo(Date value) {
            addCriterion("repayment_date <=", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIn(List<Date> values) {
            addCriterion("repayment_date in", values, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotIn(List<Date> values) {
            addCriterion("repayment_date not in", values, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateBetween(Date value1, Date value2) {
            addCriterion("repayment_date between", value1, value2, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotBetween(Date value1, Date value2) {
            addCriterion("repayment_date not between", value1, value2, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andCalTailIsNull() {
            addCriterion("cal_tail is null");
            return (Criteria) this;
        }

        public Criteria andCalTailIsNotNull() {
            addCriterion("cal_tail is not null");
            return (Criteria) this;
        }

        public Criteria andCalTailEqualTo(Integer value) {
            addCriterion("cal_tail =", value, "calTail");
            return (Criteria) this;
        }

        public Criteria andCalTailNotEqualTo(Integer value) {
            addCriterion("cal_tail <>", value, "calTail");
            return (Criteria) this;
        }

        public Criteria andCalTailGreaterThan(Integer value) {
            addCriterion("cal_tail >", value, "calTail");
            return (Criteria) this;
        }

        public Criteria andCalTailGreaterThanOrEqualTo(Integer value) {
            addCriterion("cal_tail >=", value, "calTail");
            return (Criteria) this;
        }

        public Criteria andCalTailLessThan(Integer value) {
            addCriterion("cal_tail <", value, "calTail");
            return (Criteria) this;
        }

        public Criteria andCalTailLessThanOrEqualTo(Integer value) {
            addCriterion("cal_tail <=", value, "calTail");
            return (Criteria) this;
        }

        public Criteria andCalTailIn(List<Integer> values) {
            addCriterion("cal_tail in", values, "calTail");
            return (Criteria) this;
        }

        public Criteria andCalTailNotIn(List<Integer> values) {
            addCriterion("cal_tail not in", values, "calTail");
            return (Criteria) this;
        }

        public Criteria andCalTailBetween(Integer value1, Integer value2) {
            addCriterion("cal_tail between", value1, value2, "calTail");
            return (Criteria) this;
        }

        public Criteria andCalTailNotBetween(Integer value1, Integer value2) {
            addCriterion("cal_tail not between", value1, value2, "calTail");
            return (Criteria) this;
        }

        public Criteria andBaseInterestTypeIsNull() {
            addCriterion("base_interest_type is null");
            return (Criteria) this;
        }

        public Criteria andBaseInterestTypeIsNotNull() {
            addCriterion("base_interest_type is not null");
            return (Criteria) this;
        }

        public Criteria andBaseInterestTypeEqualTo(Integer value) {
            addCriterion("base_interest_type =", value, "baseInterestType");
            return (Criteria) this;
        }

        public Criteria andBaseInterestTypeNotEqualTo(Integer value) {
            addCriterion("base_interest_type <>", value, "baseInterestType");
            return (Criteria) this;
        }

        public Criteria andBaseInterestTypeGreaterThan(Integer value) {
            addCriterion("base_interest_type >", value, "baseInterestType");
            return (Criteria) this;
        }

        public Criteria andBaseInterestTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("base_interest_type >=", value, "baseInterestType");
            return (Criteria) this;
        }

        public Criteria andBaseInterestTypeLessThan(Integer value) {
            addCriterion("base_interest_type <", value, "baseInterestType");
            return (Criteria) this;
        }

        public Criteria andBaseInterestTypeLessThanOrEqualTo(Integer value) {
            addCriterion("base_interest_type <=", value, "baseInterestType");
            return (Criteria) this;
        }

        public Criteria andBaseInterestTypeIn(List<Integer> values) {
            addCriterion("base_interest_type in", values, "baseInterestType");
            return (Criteria) this;
        }

        public Criteria andBaseInterestTypeNotIn(List<Integer> values) {
            addCriterion("base_interest_type not in", values, "baseInterestType");
            return (Criteria) this;
        }

        public Criteria andBaseInterestTypeBetween(Integer value1, Integer value2) {
            addCriterion("base_interest_type between", value1, value2, "baseInterestType");
            return (Criteria) this;
        }

        public Criteria andBaseInterestTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("base_interest_type not between", value1, value2, "baseInterestType");
            return (Criteria) this;
        }

        public Criteria andInterestRateIsNull() {
            addCriterion("interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andInterestRateIsNotNull() {
            addCriterion("interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRateEqualTo(Float value) {
            addCriterion("interest_rate =", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotEqualTo(Float value) {
            addCriterion("interest_rate <>", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateGreaterThan(Float value) {
            addCriterion("interest_rate >", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateGreaterThanOrEqualTo(Float value) {
            addCriterion("interest_rate >=", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateLessThan(Float value) {
            addCriterion("interest_rate <", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateLessThanOrEqualTo(Float value) {
            addCriterion("interest_rate <=", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateIn(List<Float> values) {
            addCriterion("interest_rate in", values, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotIn(List<Float> values) {
            addCriterion("interest_rate not in", values, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateBetween(Float value1, Float value2) {
            addCriterion("interest_rate between", value1, value2, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotBetween(Float value1, Float value2) {
            addCriterion("interest_rate not between", value1, value2, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateFloatingIsNull() {
            addCriterion("interest_rate_floating is null");
            return (Criteria) this;
        }

        public Criteria andInterestRateFloatingIsNotNull() {
            addCriterion("interest_rate_floating is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRateFloatingEqualTo(Float value) {
            addCriterion("interest_rate_floating =", value, "interestRateFloating");
            return (Criteria) this;
        }

        public Criteria andInterestRateFloatingNotEqualTo(Float value) {
            addCriterion("interest_rate_floating <>", value, "interestRateFloating");
            return (Criteria) this;
        }

        public Criteria andInterestRateFloatingGreaterThan(Float value) {
            addCriterion("interest_rate_floating >", value, "interestRateFloating");
            return (Criteria) this;
        }

        public Criteria andInterestRateFloatingGreaterThanOrEqualTo(Float value) {
            addCriterion("interest_rate_floating >=", value, "interestRateFloating");
            return (Criteria) this;
        }

        public Criteria andInterestRateFloatingLessThan(Float value) {
            addCriterion("interest_rate_floating <", value, "interestRateFloating");
            return (Criteria) this;
        }

        public Criteria andInterestRateFloatingLessThanOrEqualTo(Float value) {
            addCriterion("interest_rate_floating <=", value, "interestRateFloating");
            return (Criteria) this;
        }

        public Criteria andInterestRateFloatingIn(List<Float> values) {
            addCriterion("interest_rate_floating in", values, "interestRateFloating");
            return (Criteria) this;
        }

        public Criteria andInterestRateFloatingNotIn(List<Float> values) {
            addCriterion("interest_rate_floating not in", values, "interestRateFloating");
            return (Criteria) this;
        }

        public Criteria andInterestRateFloatingBetween(Float value1, Float value2) {
            addCriterion("interest_rate_floating between", value1, value2, "interestRateFloating");
            return (Criteria) this;
        }

        public Criteria andInterestRateFloatingNotBetween(Float value1, Float value2) {
            addCriterion("interest_rate_floating not between", value1, value2, "interestRateFloating");
            return (Criteria) this;
        }

        public Criteria andManagementRateIsNull() {
            addCriterion("management_rate is null");
            return (Criteria) this;
        }

        public Criteria andManagementRateIsNotNull() {
            addCriterion("management_rate is not null");
            return (Criteria) this;
        }

        public Criteria andManagementRateEqualTo(Float value) {
            addCriterion("management_rate =", value, "managementRate");
            return (Criteria) this;
        }

        public Criteria andManagementRateNotEqualTo(Float value) {
            addCriterion("management_rate <>", value, "managementRate");
            return (Criteria) this;
        }

        public Criteria andManagementRateGreaterThan(Float value) {
            addCriterion("management_rate >", value, "managementRate");
            return (Criteria) this;
        }

        public Criteria andManagementRateGreaterThanOrEqualTo(Float value) {
            addCriterion("management_rate >=", value, "managementRate");
            return (Criteria) this;
        }

        public Criteria andManagementRateLessThan(Float value) {
            addCriterion("management_rate <", value, "managementRate");
            return (Criteria) this;
        }

        public Criteria andManagementRateLessThanOrEqualTo(Float value) {
            addCriterion("management_rate <=", value, "managementRate");
            return (Criteria) this;
        }

        public Criteria andManagementRateIn(List<Float> values) {
            addCriterion("management_rate in", values, "managementRate");
            return (Criteria) this;
        }

        public Criteria andManagementRateNotIn(List<Float> values) {
            addCriterion("management_rate not in", values, "managementRate");
            return (Criteria) this;
        }

        public Criteria andManagementRateBetween(Float value1, Float value2) {
            addCriterion("management_rate between", value1, value2, "managementRate");
            return (Criteria) this;
        }

        public Criteria andManagementRateNotBetween(Float value1, Float value2) {
            addCriterion("management_rate not between", value1, value2, "managementRate");
            return (Criteria) this;
        }

        public Criteria andCalInterestCycleIsNull() {
            addCriterion("cal_interest_cycle is null");
            return (Criteria) this;
        }

        public Criteria andCalInterestCycleIsNotNull() {
            addCriterion("cal_interest_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andCalInterestCycleEqualTo(Integer value) {
            addCriterion("cal_interest_cycle =", value, "calInterestCycle");
            return (Criteria) this;
        }

        public Criteria andCalInterestCycleNotEqualTo(Integer value) {
            addCriterion("cal_interest_cycle <>", value, "calInterestCycle");
            return (Criteria) this;
        }

        public Criteria andCalInterestCycleGreaterThan(Integer value) {
            addCriterion("cal_interest_cycle >", value, "calInterestCycle");
            return (Criteria) this;
        }

        public Criteria andCalInterestCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("cal_interest_cycle >=", value, "calInterestCycle");
            return (Criteria) this;
        }

        public Criteria andCalInterestCycleLessThan(Integer value) {
            addCriterion("cal_interest_cycle <", value, "calInterestCycle");
            return (Criteria) this;
        }

        public Criteria andCalInterestCycleLessThanOrEqualTo(Integer value) {
            addCriterion("cal_interest_cycle <=", value, "calInterestCycle");
            return (Criteria) this;
        }

        public Criteria andCalInterestCycleIn(List<Integer> values) {
            addCriterion("cal_interest_cycle in", values, "calInterestCycle");
            return (Criteria) this;
        }

        public Criteria andCalInterestCycleNotIn(List<Integer> values) {
            addCriterion("cal_interest_cycle not in", values, "calInterestCycle");
            return (Criteria) this;
        }

        public Criteria andCalInterestCycleBetween(Integer value1, Integer value2) {
            addCriterion("cal_interest_cycle between", value1, value2, "calInterestCycle");
            return (Criteria) this;
        }

        public Criteria andCalInterestCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("cal_interest_cycle not between", value1, value2, "calInterestCycle");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestRateFloatIsNull() {
            addCriterion("overdue_interest_rate_float is null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestRateFloatIsNotNull() {
            addCriterion("overdue_interest_rate_float is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestRateFloatEqualTo(Float value) {
            addCriterion("overdue_interest_rate_float =", value, "overdueInterestRateFloat");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestRateFloatNotEqualTo(Float value) {
            addCriterion("overdue_interest_rate_float <>", value, "overdueInterestRateFloat");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestRateFloatGreaterThan(Float value) {
            addCriterion("overdue_interest_rate_float >", value, "overdueInterestRateFloat");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestRateFloatGreaterThanOrEqualTo(Float value) {
            addCriterion("overdue_interest_rate_float >=", value, "overdueInterestRateFloat");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestRateFloatLessThan(Float value) {
            addCriterion("overdue_interest_rate_float <", value, "overdueInterestRateFloat");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestRateFloatLessThanOrEqualTo(Float value) {
            addCriterion("overdue_interest_rate_float <=", value, "overdueInterestRateFloat");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestRateFloatIn(List<Float> values) {
            addCriterion("overdue_interest_rate_float in", values, "overdueInterestRateFloat");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestRateFloatNotIn(List<Float> values) {
            addCriterion("overdue_interest_rate_float not in", values, "overdueInterestRateFloat");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestRateFloatBetween(Float value1, Float value2) {
            addCriterion("overdue_interest_rate_float between", value1, value2, "overdueInterestRateFloat");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestRateFloatNotBetween(Float value1, Float value2) {
            addCriterion("overdue_interest_rate_float not between", value1, value2, "overdueInterestRateFloat");
            return (Criteria) this;
        }

        public Criteria andInterestRateDescriptionIsNull() {
            addCriterion("interest_rate_description is null");
            return (Criteria) this;
        }

        public Criteria andInterestRateDescriptionIsNotNull() {
            addCriterion("interest_rate_description is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRateDescriptionEqualTo(String value) {
            addCriterion("interest_rate_description =", value, "interestRateDescription");
            return (Criteria) this;
        }

        public Criteria andInterestRateDescriptionNotEqualTo(String value) {
            addCriterion("interest_rate_description <>", value, "interestRateDescription");
            return (Criteria) this;
        }

        public Criteria andInterestRateDescriptionGreaterThan(String value) {
            addCriterion("interest_rate_description >", value, "interestRateDescription");
            return (Criteria) this;
        }

        public Criteria andInterestRateDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("interest_rate_description >=", value, "interestRateDescription");
            return (Criteria) this;
        }

        public Criteria andInterestRateDescriptionLessThan(String value) {
            addCriterion("interest_rate_description <", value, "interestRateDescription");
            return (Criteria) this;
        }

        public Criteria andInterestRateDescriptionLessThanOrEqualTo(String value) {
            addCriterion("interest_rate_description <=", value, "interestRateDescription");
            return (Criteria) this;
        }

        public Criteria andInterestRateDescriptionLike(String value) {
            addCriterion("interest_rate_description like", value, "interestRateDescription");
            return (Criteria) this;
        }

        public Criteria andInterestRateDescriptionNotLike(String value) {
            addCriterion("interest_rate_description not like", value, "interestRateDescription");
            return (Criteria) this;
        }

        public Criteria andInterestRateDescriptionIn(List<String> values) {
            addCriterion("interest_rate_description in", values, "interestRateDescription");
            return (Criteria) this;
        }

        public Criteria andInterestRateDescriptionNotIn(List<String> values) {
            addCriterion("interest_rate_description not in", values, "interestRateDescription");
            return (Criteria) this;
        }

        public Criteria andInterestRateDescriptionBetween(String value1, String value2) {
            addCriterion("interest_rate_description between", value1, value2, "interestRateDescription");
            return (Criteria) this;
        }

        public Criteria andInterestRateDescriptionNotBetween(String value1, String value2) {
            addCriterion("interest_rate_description not between", value1, value2, "interestRateDescription");
            return (Criteria) this;
        }

        public Criteria andLoanInvestmentIsNull() {
            addCriterion("loan_investment is null");
            return (Criteria) this;
        }

        public Criteria andLoanInvestmentIsNotNull() {
            addCriterion("loan_investment is not null");
            return (Criteria) this;
        }

        public Criteria andLoanInvestmentEqualTo(Integer value) {
            addCriterion("loan_investment =", value, "loanInvestment");
            return (Criteria) this;
        }

        public Criteria andLoanInvestmentNotEqualTo(Integer value) {
            addCriterion("loan_investment <>", value, "loanInvestment");
            return (Criteria) this;
        }

        public Criteria andLoanInvestmentGreaterThan(Integer value) {
            addCriterion("loan_investment >", value, "loanInvestment");
            return (Criteria) this;
        }

        public Criteria andLoanInvestmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_investment >=", value, "loanInvestment");
            return (Criteria) this;
        }

        public Criteria andLoanInvestmentLessThan(Integer value) {
            addCriterion("loan_investment <", value, "loanInvestment");
            return (Criteria) this;
        }

        public Criteria andLoanInvestmentLessThanOrEqualTo(Integer value) {
            addCriterion("loan_investment <=", value, "loanInvestment");
            return (Criteria) this;
        }

        public Criteria andLoanInvestmentIn(List<Integer> values) {
            addCriterion("loan_investment in", values, "loanInvestment");
            return (Criteria) this;
        }

        public Criteria andLoanInvestmentNotIn(List<Integer> values) {
            addCriterion("loan_investment not in", values, "loanInvestment");
            return (Criteria) this;
        }

        public Criteria andLoanInvestmentBetween(Integer value1, Integer value2) {
            addCriterion("loan_investment between", value1, value2, "loanInvestment");
            return (Criteria) this;
        }

        public Criteria andLoanInvestmentNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_investment not between", value1, value2, "loanInvestment");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationIsNull() {
            addCriterion("loan_application is null");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationIsNotNull() {
            addCriterion("loan_application is not null");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationEqualTo(Integer value) {
            addCriterion("loan_application =", value, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationNotEqualTo(Integer value) {
            addCriterion("loan_application <>", value, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationGreaterThan(Integer value) {
            addCriterion("loan_application >", value, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_application >=", value, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationLessThan(Integer value) {
            addCriterion("loan_application <", value, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationLessThanOrEqualTo(Integer value) {
            addCriterion("loan_application <=", value, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationIn(List<Integer> values) {
            addCriterion("loan_application in", values, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationNotIn(List<Integer> values) {
            addCriterion("loan_application not in", values, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationBetween(Integer value1, Integer value2) {
            addCriterion("loan_application between", value1, value2, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_application not between", value1, value2, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andInterestChargeIsNull() {
            addCriterion("interest_charge is null");
            return (Criteria) this;
        }

        public Criteria andInterestChargeIsNotNull() {
            addCriterion("interest_charge is not null");
            return (Criteria) this;
        }

        public Criteria andInterestChargeEqualTo(Integer value) {
            addCriterion("interest_charge =", value, "interestCharge");
            return (Criteria) this;
        }

        public Criteria andInterestChargeNotEqualTo(Integer value) {
            addCriterion("interest_charge <>", value, "interestCharge");
            return (Criteria) this;
        }

        public Criteria andInterestChargeGreaterThan(Integer value) {
            addCriterion("interest_charge >", value, "interestCharge");
            return (Criteria) this;
        }

        public Criteria andInterestChargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("interest_charge >=", value, "interestCharge");
            return (Criteria) this;
        }

        public Criteria andInterestChargeLessThan(Integer value) {
            addCriterion("interest_charge <", value, "interestCharge");
            return (Criteria) this;
        }

        public Criteria andInterestChargeLessThanOrEqualTo(Integer value) {
            addCriterion("interest_charge <=", value, "interestCharge");
            return (Criteria) this;
        }

        public Criteria andInterestChargeIn(List<Integer> values) {
            addCriterion("interest_charge in", values, "interestCharge");
            return (Criteria) this;
        }

        public Criteria andInterestChargeNotIn(List<Integer> values) {
            addCriterion("interest_charge not in", values, "interestCharge");
            return (Criteria) this;
        }

        public Criteria andInterestChargeBetween(Integer value1, Integer value2) {
            addCriterion("interest_charge between", value1, value2, "interestCharge");
            return (Criteria) this;
        }

        public Criteria andInterestChargeNotBetween(Integer value1, Integer value2) {
            addCriterion("interest_charge not between", value1, value2, "interestCharge");
            return (Criteria) this;
        }

        public Criteria andInterestChargeReturnIsNull() {
            addCriterion("interest_charge_return is null");
            return (Criteria) this;
        }

        public Criteria andInterestChargeReturnIsNotNull() {
            addCriterion("interest_charge_return is not null");
            return (Criteria) this;
        }

        public Criteria andInterestChargeReturnEqualTo(Integer value) {
            addCriterion("interest_charge_return =", value, "interestChargeReturn");
            return (Criteria) this;
        }

        public Criteria andInterestChargeReturnNotEqualTo(Integer value) {
            addCriterion("interest_charge_return <>", value, "interestChargeReturn");
            return (Criteria) this;
        }

        public Criteria andInterestChargeReturnGreaterThan(Integer value) {
            addCriterion("interest_charge_return >", value, "interestChargeReturn");
            return (Criteria) this;
        }

        public Criteria andInterestChargeReturnGreaterThanOrEqualTo(Integer value) {
            addCriterion("interest_charge_return >=", value, "interestChargeReturn");
            return (Criteria) this;
        }

        public Criteria andInterestChargeReturnLessThan(Integer value) {
            addCriterion("interest_charge_return <", value, "interestChargeReturn");
            return (Criteria) this;
        }

        public Criteria andInterestChargeReturnLessThanOrEqualTo(Integer value) {
            addCriterion("interest_charge_return <=", value, "interestChargeReturn");
            return (Criteria) this;
        }

        public Criteria andInterestChargeReturnIn(List<Integer> values) {
            addCriterion("interest_charge_return in", values, "interestChargeReturn");
            return (Criteria) this;
        }

        public Criteria andInterestChargeReturnNotIn(List<Integer> values) {
            addCriterion("interest_charge_return not in", values, "interestChargeReturn");
            return (Criteria) this;
        }

        public Criteria andInterestChargeReturnBetween(Integer value1, Integer value2) {
            addCriterion("interest_charge_return between", value1, value2, "interestChargeReturn");
            return (Criteria) this;
        }

        public Criteria andInterestChargeReturnNotBetween(Integer value1, Integer value2) {
            addCriterion("interest_charge_return not between", value1, value2, "interestChargeReturn");
            return (Criteria) this;
        }

        public Criteria andMainCoordinatorIsNull() {
            addCriterion("main_coordinator is null");
            return (Criteria) this;
        }

        public Criteria andMainCoordinatorIsNotNull() {
            addCriterion("main_coordinator is not null");
            return (Criteria) this;
        }

        public Criteria andMainCoordinatorEqualTo(String value) {
            addCriterion("main_coordinator =", value, "mainCoordinator");
            return (Criteria) this;
        }

        public Criteria andMainCoordinatorNotEqualTo(String value) {
            addCriterion("main_coordinator <>", value, "mainCoordinator");
            return (Criteria) this;
        }

        public Criteria andMainCoordinatorGreaterThan(String value) {
            addCriterion("main_coordinator >", value, "mainCoordinator");
            return (Criteria) this;
        }

        public Criteria andMainCoordinatorGreaterThanOrEqualTo(String value) {
            addCriterion("main_coordinator >=", value, "mainCoordinator");
            return (Criteria) this;
        }

        public Criteria andMainCoordinatorLessThan(String value) {
            addCriterion("main_coordinator <", value, "mainCoordinator");
            return (Criteria) this;
        }

        public Criteria andMainCoordinatorLessThanOrEqualTo(String value) {
            addCriterion("main_coordinator <=", value, "mainCoordinator");
            return (Criteria) this;
        }

        public Criteria andMainCoordinatorLike(String value) {
            addCriterion("main_coordinator like", value, "mainCoordinator");
            return (Criteria) this;
        }

        public Criteria andMainCoordinatorNotLike(String value) {
            addCriterion("main_coordinator not like", value, "mainCoordinator");
            return (Criteria) this;
        }

        public Criteria andMainCoordinatorIn(List<String> values) {
            addCriterion("main_coordinator in", values, "mainCoordinator");
            return (Criteria) this;
        }

        public Criteria andMainCoordinatorNotIn(List<String> values) {
            addCriterion("main_coordinator not in", values, "mainCoordinator");
            return (Criteria) this;
        }

        public Criteria andMainCoordinatorBetween(String value1, String value2) {
            addCriterion("main_coordinator between", value1, value2, "mainCoordinator");
            return (Criteria) this;
        }

        public Criteria andMainCoordinatorNotBetween(String value1, String value2) {
            addCriterion("main_coordinator not between", value1, value2, "mainCoordinator");
            return (Criteria) this;
        }

        public Criteria andAssistantCoordinatorIsNull() {
            addCriterion("assistant_coordinator is null");
            return (Criteria) this;
        }

        public Criteria andAssistantCoordinatorIsNotNull() {
            addCriterion("assistant_coordinator is not null");
            return (Criteria) this;
        }

        public Criteria andAssistantCoordinatorEqualTo(String value) {
            addCriterion("assistant_coordinator =", value, "assistantCoordinator");
            return (Criteria) this;
        }

        public Criteria andAssistantCoordinatorNotEqualTo(String value) {
            addCriterion("assistant_coordinator <>", value, "assistantCoordinator");
            return (Criteria) this;
        }

        public Criteria andAssistantCoordinatorGreaterThan(String value) {
            addCriterion("assistant_coordinator >", value, "assistantCoordinator");
            return (Criteria) this;
        }

        public Criteria andAssistantCoordinatorGreaterThanOrEqualTo(String value) {
            addCriterion("assistant_coordinator >=", value, "assistantCoordinator");
            return (Criteria) this;
        }

        public Criteria andAssistantCoordinatorLessThan(String value) {
            addCriterion("assistant_coordinator <", value, "assistantCoordinator");
            return (Criteria) this;
        }

        public Criteria andAssistantCoordinatorLessThanOrEqualTo(String value) {
            addCriterion("assistant_coordinator <=", value, "assistantCoordinator");
            return (Criteria) this;
        }

        public Criteria andAssistantCoordinatorLike(String value) {
            addCriterion("assistant_coordinator like", value, "assistantCoordinator");
            return (Criteria) this;
        }

        public Criteria andAssistantCoordinatorNotLike(String value) {
            addCriterion("assistant_coordinator not like", value, "assistantCoordinator");
            return (Criteria) this;
        }

        public Criteria andAssistantCoordinatorIn(List<String> values) {
            addCriterion("assistant_coordinator in", values, "assistantCoordinator");
            return (Criteria) this;
        }

        public Criteria andAssistantCoordinatorNotIn(List<String> values) {
            addCriterion("assistant_coordinator not in", values, "assistantCoordinator");
            return (Criteria) this;
        }

        public Criteria andAssistantCoordinatorBetween(String value1, String value2) {
            addCriterion("assistant_coordinator between", value1, value2, "assistantCoordinator");
            return (Criteria) this;
        }

        public Criteria andAssistantCoordinatorNotBetween(String value1, String value2) {
            addCriterion("assistant_coordinator not between", value1, value2, "assistantCoordinator");
            return (Criteria) this;
        }

        public Criteria andSupplementaryExplanationIsNull() {
            addCriterion("supplementary_explanation is null");
            return (Criteria) this;
        }

        public Criteria andSupplementaryExplanationIsNotNull() {
            addCriterion("supplementary_explanation is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementaryExplanationEqualTo(String value) {
            addCriterion("supplementary_explanation =", value, "supplementaryExplanation");
            return (Criteria) this;
        }

        public Criteria andSupplementaryExplanationNotEqualTo(String value) {
            addCriterion("supplementary_explanation <>", value, "supplementaryExplanation");
            return (Criteria) this;
        }

        public Criteria andSupplementaryExplanationGreaterThan(String value) {
            addCriterion("supplementary_explanation >", value, "supplementaryExplanation");
            return (Criteria) this;
        }

        public Criteria andSupplementaryExplanationGreaterThanOrEqualTo(String value) {
            addCriterion("supplementary_explanation >=", value, "supplementaryExplanation");
            return (Criteria) this;
        }

        public Criteria andSupplementaryExplanationLessThan(String value) {
            addCriterion("supplementary_explanation <", value, "supplementaryExplanation");
            return (Criteria) this;
        }

        public Criteria andSupplementaryExplanationLessThanOrEqualTo(String value) {
            addCriterion("supplementary_explanation <=", value, "supplementaryExplanation");
            return (Criteria) this;
        }

        public Criteria andSupplementaryExplanationLike(String value) {
            addCriterion("supplementary_explanation like", value, "supplementaryExplanation");
            return (Criteria) this;
        }

        public Criteria andSupplementaryExplanationNotLike(String value) {
            addCriterion("supplementary_explanation not like", value, "supplementaryExplanation");
            return (Criteria) this;
        }

        public Criteria andSupplementaryExplanationIn(List<String> values) {
            addCriterion("supplementary_explanation in", values, "supplementaryExplanation");
            return (Criteria) this;
        }

        public Criteria andSupplementaryExplanationNotIn(List<String> values) {
            addCriterion("supplementary_explanation not in", values, "supplementaryExplanation");
            return (Criteria) this;
        }

        public Criteria andSupplementaryExplanationBetween(String value1, String value2) {
            addCriterion("supplementary_explanation between", value1, value2, "supplementaryExplanation");
            return (Criteria) this;
        }

        public Criteria andSupplementaryExplanationNotBetween(String value1, String value2) {
            addCriterion("supplementary_explanation not between", value1, value2, "supplementaryExplanation");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIsNull() {
            addCriterion("credit_amount is null");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIsNotNull() {
            addCriterion("credit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCreditAmountEqualTo(BigDecimal value) {
            addCriterion("credit_amount =", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotEqualTo(BigDecimal value) {
            addCriterion("credit_amount <>", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountGreaterThan(BigDecimal value) {
            addCriterion("credit_amount >", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_amount >=", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountLessThan(BigDecimal value) {
            addCriterion("credit_amount <", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_amount <=", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIn(List<BigDecimal> values) {
            addCriterion("credit_amount in", values, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotIn(List<BigDecimal> values) {
            addCriterion("credit_amount not in", values, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_amount between", value1, value2, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_amount not between", value1, value2, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIsNull() {
            addCriterion("credit_limit is null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIsNotNull() {
            addCriterion("credit_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitEqualTo(String value) {
            addCriterion("credit_limit =", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotEqualTo(String value) {
            addCriterion("credit_limit <>", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitGreaterThan(String value) {
            addCriterion("credit_limit >", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitGreaterThanOrEqualTo(String value) {
            addCriterion("credit_limit >=", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLessThan(String value) {
            addCriterion("credit_limit <", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLessThanOrEqualTo(String value) {
            addCriterion("credit_limit <=", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLike(String value) {
            addCriterion("credit_limit like", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotLike(String value) {
            addCriterion("credit_limit not like", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIn(List<String> values) {
            addCriterion("credit_limit in", values, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotIn(List<String> values) {
            addCriterion("credit_limit not in", values, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitBetween(String value1, String value2) {
            addCriterion("credit_limit between", value1, value2, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotBetween(String value1, String value2) {
            addCriterion("credit_limit not between", value1, value2, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCurrentHanderInterestIsNull() {
            addCriterion("current_hander_interest is null");
            return (Criteria) this;
        }

        public Criteria andCurrentHanderInterestIsNotNull() {
            addCriterion("current_hander_interest is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentHanderInterestEqualTo(String value) {
            addCriterion("current_hander_interest =", value, "currentHanderInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentHanderInterestNotEqualTo(String value) {
            addCriterion("current_hander_interest <>", value, "currentHanderInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentHanderInterestGreaterThan(String value) {
            addCriterion("current_hander_interest >", value, "currentHanderInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentHanderInterestGreaterThanOrEqualTo(String value) {
            addCriterion("current_hander_interest >=", value, "currentHanderInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentHanderInterestLessThan(String value) {
            addCriterion("current_hander_interest <", value, "currentHanderInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentHanderInterestLessThanOrEqualTo(String value) {
            addCriterion("current_hander_interest <=", value, "currentHanderInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentHanderInterestLike(String value) {
            addCriterion("current_hander_interest like", value, "currentHanderInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentHanderInterestNotLike(String value) {
            addCriterion("current_hander_interest not like", value, "currentHanderInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentHanderInterestIn(List<String> values) {
            addCriterion("current_hander_interest in", values, "currentHanderInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentHanderInterestNotIn(List<String> values) {
            addCriterion("current_hander_interest not in", values, "currentHanderInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentHanderInterestBetween(String value1, String value2) {
            addCriterion("current_hander_interest between", value1, value2, "currentHanderInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentHanderInterestNotBetween(String value1, String value2) {
            addCriterion("current_hander_interest not between", value1, value2, "currentHanderInterest");
            return (Criteria) this;
        }

        public Criteria andIsRemoteIsNull() {
            addCriterion("is_remote is null");
            return (Criteria) this;
        }

        public Criteria andIsRemoteIsNotNull() {
            addCriterion("is_remote is not null");
            return (Criteria) this;
        }

        public Criteria andIsRemoteEqualTo(String value) {
            addCriterion("is_remote =", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteNotEqualTo(String value) {
            addCriterion("is_remote <>", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteGreaterThan(String value) {
            addCriterion("is_remote >", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteGreaterThanOrEqualTo(String value) {
            addCriterion("is_remote >=", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteLessThan(String value) {
            addCriterion("is_remote <", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteLessThanOrEqualTo(String value) {
            addCriterion("is_remote <=", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteLike(String value) {
            addCriterion("is_remote like", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteNotLike(String value) {
            addCriterion("is_remote not like", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteIn(List<String> values) {
            addCriterion("is_remote in", values, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteNotIn(List<String> values) {
            addCriterion("is_remote not in", values, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteBetween(String value1, String value2) {
            addCriterion("is_remote between", value1, value2, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteNotBetween(String value1, String value2) {
            addCriterion("is_remote not between", value1, value2, "isRemote");
            return (Criteria) this;
        }

        public Criteria andProjectManagercIsNull() {
            addCriterion("project_managerc is null");
            return (Criteria) this;
        }

        public Criteria andProjectManagercIsNotNull() {
            addCriterion("project_managerc is not null");
            return (Criteria) this;
        }

        public Criteria andProjectManagercEqualTo(String value) {
            addCriterion("project_managerc =", value, "projectManagerc");
            return (Criteria) this;
        }

        public Criteria andProjectManagercNotEqualTo(String value) {
            addCriterion("project_managerc <>", value, "projectManagerc");
            return (Criteria) this;
        }

        public Criteria andProjectManagercGreaterThan(String value) {
            addCriterion("project_managerc >", value, "projectManagerc");
            return (Criteria) this;
        }

        public Criteria andProjectManagercGreaterThanOrEqualTo(String value) {
            addCriterion("project_managerc >=", value, "projectManagerc");
            return (Criteria) this;
        }

        public Criteria andProjectManagercLessThan(String value) {
            addCriterion("project_managerc <", value, "projectManagerc");
            return (Criteria) this;
        }

        public Criteria andProjectManagercLessThanOrEqualTo(String value) {
            addCriterion("project_managerc <=", value, "projectManagerc");
            return (Criteria) this;
        }

        public Criteria andProjectManagercLike(String value) {
            addCriterion("project_managerc like", value, "projectManagerc");
            return (Criteria) this;
        }

        public Criteria andProjectManagercNotLike(String value) {
            addCriterion("project_managerc not like", value, "projectManagerc");
            return (Criteria) this;
        }

        public Criteria andProjectManagercIn(List<String> values) {
            addCriterion("project_managerc in", values, "projectManagerc");
            return (Criteria) this;
        }

        public Criteria andProjectManagercNotIn(List<String> values) {
            addCriterion("project_managerc not in", values, "projectManagerc");
            return (Criteria) this;
        }

        public Criteria andProjectManagercBetween(String value1, String value2) {
            addCriterion("project_managerc between", value1, value2, "projectManagerc");
            return (Criteria) this;
        }

        public Criteria andProjectManagercNotBetween(String value1, String value2) {
            addCriterion("project_managerc not between", value1, value2, "projectManagerc");
            return (Criteria) this;
        }

        public Criteria andRiskOfficerIsNull() {
            addCriterion("risk_officer is null");
            return (Criteria) this;
        }

        public Criteria andRiskOfficerIsNotNull() {
            addCriterion("risk_officer is not null");
            return (Criteria) this;
        }

        public Criteria andRiskOfficerEqualTo(String value) {
            addCriterion("risk_officer =", value, "riskOfficer");
            return (Criteria) this;
        }

        public Criteria andRiskOfficerNotEqualTo(String value) {
            addCriterion("risk_officer <>", value, "riskOfficer");
            return (Criteria) this;
        }

        public Criteria andRiskOfficerGreaterThan(String value) {
            addCriterion("risk_officer >", value, "riskOfficer");
            return (Criteria) this;
        }

        public Criteria andRiskOfficerGreaterThanOrEqualTo(String value) {
            addCriterion("risk_officer >=", value, "riskOfficer");
            return (Criteria) this;
        }

        public Criteria andRiskOfficerLessThan(String value) {
            addCriterion("risk_officer <", value, "riskOfficer");
            return (Criteria) this;
        }

        public Criteria andRiskOfficerLessThanOrEqualTo(String value) {
            addCriterion("risk_officer <=", value, "riskOfficer");
            return (Criteria) this;
        }

        public Criteria andRiskOfficerLike(String value) {
            addCriterion("risk_officer like", value, "riskOfficer");
            return (Criteria) this;
        }

        public Criteria andRiskOfficerNotLike(String value) {
            addCriterion("risk_officer not like", value, "riskOfficer");
            return (Criteria) this;
        }

        public Criteria andRiskOfficerIn(List<String> values) {
            addCriterion("risk_officer in", values, "riskOfficer");
            return (Criteria) this;
        }

        public Criteria andRiskOfficerNotIn(List<String> values) {
            addCriterion("risk_officer not in", values, "riskOfficer");
            return (Criteria) this;
        }

        public Criteria andRiskOfficerBetween(String value1, String value2) {
            addCriterion("risk_officer between", value1, value2, "riskOfficer");
            return (Criteria) this;
        }

        public Criteria andRiskOfficerNotBetween(String value1, String value2) {
            addCriterion("risk_officer not between", value1, value2, "riskOfficer");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountIsNull() {
            addCriterion("capital_amount is null");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountIsNotNull() {
            addCriterion("capital_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountEqualTo(String value) {
            addCriterion("capital_amount =", value, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountNotEqualTo(String value) {
            addCriterion("capital_amount <>", value, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountGreaterThan(String value) {
            addCriterion("capital_amount >", value, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountGreaterThanOrEqualTo(String value) {
            addCriterion("capital_amount >=", value, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountLessThan(String value) {
            addCriterion("capital_amount <", value, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountLessThanOrEqualTo(String value) {
            addCriterion("capital_amount <=", value, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountLike(String value) {
            addCriterion("capital_amount like", value, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountNotLike(String value) {
            addCriterion("capital_amount not like", value, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountIn(List<String> values) {
            addCriterion("capital_amount in", values, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountNotIn(List<String> values) {
            addCriterion("capital_amount not in", values, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountBetween(String value1, String value2) {
            addCriterion("capital_amount between", value1, value2, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountNotBetween(String value1, String value2) {
            addCriterion("capital_amount not between", value1, value2, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andInDepositAmountIsNull() {
            addCriterion("in_deposit_amount is null");
            return (Criteria) this;
        }

        public Criteria andInDepositAmountIsNotNull() {
            addCriterion("in_deposit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInDepositAmountEqualTo(BigDecimal value) {
            addCriterion("in_deposit_amount =", value, "inDepositAmount");
            return (Criteria) this;
        }

        public Criteria andInDepositAmountNotEqualTo(BigDecimal value) {
            addCriterion("in_deposit_amount <>", value, "inDepositAmount");
            return (Criteria) this;
        }

        public Criteria andInDepositAmountGreaterThan(BigDecimal value) {
            addCriterion("in_deposit_amount >", value, "inDepositAmount");
            return (Criteria) this;
        }

        public Criteria andInDepositAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("in_deposit_amount >=", value, "inDepositAmount");
            return (Criteria) this;
        }

        public Criteria andInDepositAmountLessThan(BigDecimal value) {
            addCriterion("in_deposit_amount <", value, "inDepositAmount");
            return (Criteria) this;
        }

        public Criteria andInDepositAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("in_deposit_amount <=", value, "inDepositAmount");
            return (Criteria) this;
        }

        public Criteria andInDepositAmountIn(List<BigDecimal> values) {
            addCriterion("in_deposit_amount in", values, "inDepositAmount");
            return (Criteria) this;
        }

        public Criteria andInDepositAmountNotIn(List<BigDecimal> values) {
            addCriterion("in_deposit_amount not in", values, "inDepositAmount");
            return (Criteria) this;
        }

        public Criteria andInDepositAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("in_deposit_amount between", value1, value2, "inDepositAmount");
            return (Criteria) this;
        }

        public Criteria andInDepositAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("in_deposit_amount not between", value1, value2, "inDepositAmount");
            return (Criteria) this;
        }

        public Criteria andOutDepositAmountIsNull() {
            addCriterion("out_deposit_amount is null");
            return (Criteria) this;
        }

        public Criteria andOutDepositAmountIsNotNull() {
            addCriterion("out_deposit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOutDepositAmountEqualTo(BigDecimal value) {
            addCriterion("out_deposit_amount =", value, "outDepositAmount");
            return (Criteria) this;
        }

        public Criteria andOutDepositAmountNotEqualTo(BigDecimal value) {
            addCriterion("out_deposit_amount <>", value, "outDepositAmount");
            return (Criteria) this;
        }

        public Criteria andOutDepositAmountGreaterThan(BigDecimal value) {
            addCriterion("out_deposit_amount >", value, "outDepositAmount");
            return (Criteria) this;
        }

        public Criteria andOutDepositAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("out_deposit_amount >=", value, "outDepositAmount");
            return (Criteria) this;
        }

        public Criteria andOutDepositAmountLessThan(BigDecimal value) {
            addCriterion("out_deposit_amount <", value, "outDepositAmount");
            return (Criteria) this;
        }

        public Criteria andOutDepositAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("out_deposit_amount <=", value, "outDepositAmount");
            return (Criteria) this;
        }

        public Criteria andOutDepositAmountIn(List<BigDecimal> values) {
            addCriterion("out_deposit_amount in", values, "outDepositAmount");
            return (Criteria) this;
        }

        public Criteria andOutDepositAmountNotIn(List<BigDecimal> values) {
            addCriterion("out_deposit_amount not in", values, "outDepositAmount");
            return (Criteria) this;
        }

        public Criteria andOutDepositAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("out_deposit_amount between", value1, value2, "outDepositAmount");
            return (Criteria) this;
        }

        public Criteria andOutDepositAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("out_deposit_amount not between", value1, value2, "outDepositAmount");
            return (Criteria) this;
        }

        public Criteria andRealDepositAmountIsNull() {
            addCriterion("real_deposit_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealDepositAmountIsNotNull() {
            addCriterion("real_deposit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealDepositAmountEqualTo(BigDecimal value) {
            addCriterion("real_deposit_amount =", value, "realDepositAmount");
            return (Criteria) this;
        }

        public Criteria andRealDepositAmountNotEqualTo(BigDecimal value) {
            addCriterion("real_deposit_amount <>", value, "realDepositAmount");
            return (Criteria) this;
        }

        public Criteria andRealDepositAmountGreaterThan(BigDecimal value) {
            addCriterion("real_deposit_amount >", value, "realDepositAmount");
            return (Criteria) this;
        }

        public Criteria andRealDepositAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_deposit_amount >=", value, "realDepositAmount");
            return (Criteria) this;
        }

        public Criteria andRealDepositAmountLessThan(BigDecimal value) {
            addCriterion("real_deposit_amount <", value, "realDepositAmount");
            return (Criteria) this;
        }

        public Criteria andRealDepositAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_deposit_amount <=", value, "realDepositAmount");
            return (Criteria) this;
        }

        public Criteria andRealDepositAmountIn(List<BigDecimal> values) {
            addCriterion("real_deposit_amount in", values, "realDepositAmount");
            return (Criteria) this;
        }

        public Criteria andRealDepositAmountNotIn(List<BigDecimal> values) {
            addCriterion("real_deposit_amount not in", values, "realDepositAmount");
            return (Criteria) this;
        }

        public Criteria andRealDepositAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_deposit_amount between", value1, value2, "realDepositAmount");
            return (Criteria) this;
        }

        public Criteria andRealDepositAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_deposit_amount not between", value1, value2, "realDepositAmount");
            return (Criteria) this;
        }

        public Criteria andBackDepositAmountIsNull() {
            addCriterion("back_deposit_amount is null");
            return (Criteria) this;
        }

        public Criteria andBackDepositAmountIsNotNull() {
            addCriterion("back_deposit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBackDepositAmountEqualTo(BigDecimal value) {
            addCriterion("back_deposit_amount =", value, "backDepositAmount");
            return (Criteria) this;
        }

        public Criteria andBackDepositAmountNotEqualTo(BigDecimal value) {
            addCriterion("back_deposit_amount <>", value, "backDepositAmount");
            return (Criteria) this;
        }

        public Criteria andBackDepositAmountGreaterThan(BigDecimal value) {
            addCriterion("back_deposit_amount >", value, "backDepositAmount");
            return (Criteria) this;
        }

        public Criteria andBackDepositAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("back_deposit_amount >=", value, "backDepositAmount");
            return (Criteria) this;
        }

        public Criteria andBackDepositAmountLessThan(BigDecimal value) {
            addCriterion("back_deposit_amount <", value, "backDepositAmount");
            return (Criteria) this;
        }

        public Criteria andBackDepositAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("back_deposit_amount <=", value, "backDepositAmount");
            return (Criteria) this;
        }

        public Criteria andBackDepositAmountIn(List<BigDecimal> values) {
            addCriterion("back_deposit_amount in", values, "backDepositAmount");
            return (Criteria) this;
        }

        public Criteria andBackDepositAmountNotIn(List<BigDecimal> values) {
            addCriterion("back_deposit_amount not in", values, "backDepositAmount");
            return (Criteria) this;
        }

        public Criteria andBackDepositAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("back_deposit_amount between", value1, value2, "backDepositAmount");
            return (Criteria) this;
        }

        public Criteria andBackDepositAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("back_deposit_amount not between", value1, value2, "backDepositAmount");
            return (Criteria) this;
        }

        public Criteria andSelectIdsIsNull() {
            addCriterion("select_ids is null");
            return (Criteria) this;
        }

        public Criteria andSelectIdsIsNotNull() {
            addCriterion("select_ids is not null");
            return (Criteria) this;
        }

        public Criteria andSelectIdsEqualTo(String value) {
            addCriterion("select_ids =", value, "selectIds");
            return (Criteria) this;
        }

        public Criteria andSelectIdsNotEqualTo(String value) {
            addCriterion("select_ids <>", value, "selectIds");
            return (Criteria) this;
        }

        public Criteria andSelectIdsGreaterThan(String value) {
            addCriterion("select_ids >", value, "selectIds");
            return (Criteria) this;
        }

        public Criteria andSelectIdsGreaterThanOrEqualTo(String value) {
            addCriterion("select_ids >=", value, "selectIds");
            return (Criteria) this;
        }

        public Criteria andSelectIdsLessThan(String value) {
            addCriterion("select_ids <", value, "selectIds");
            return (Criteria) this;
        }

        public Criteria andSelectIdsLessThanOrEqualTo(String value) {
            addCriterion("select_ids <=", value, "selectIds");
            return (Criteria) this;
        }

        public Criteria andSelectIdsLike(String value) {
            addCriterion("select_ids like", value, "selectIds");
            return (Criteria) this;
        }

        public Criteria andSelectIdsNotLike(String value) {
            addCriterion("select_ids not like", value, "selectIds");
            return (Criteria) this;
        }

        public Criteria andSelectIdsIn(List<String> values) {
            addCriterion("select_ids in", values, "selectIds");
            return (Criteria) this;
        }

        public Criteria andSelectIdsNotIn(List<String> values) {
            addCriterion("select_ids not in", values, "selectIds");
            return (Criteria) this;
        }

        public Criteria andSelectIdsBetween(String value1, String value2) {
            addCriterion("select_ids between", value1, value2, "selectIds");
            return (Criteria) this;
        }

        public Criteria andSelectIdsNotBetween(String value1, String value2) {
            addCriterion("select_ids not between", value1, value2, "selectIds");
            return (Criteria) this;
        }

        public Criteria andSelectNamesIsNull() {
            addCriterion("select_names is null");
            return (Criteria) this;
        }

        public Criteria andSelectNamesIsNotNull() {
            addCriterion("select_names is not null");
            return (Criteria) this;
        }

        public Criteria andSelectNamesEqualTo(String value) {
            addCriterion("select_names =", value, "selectNames");
            return (Criteria) this;
        }

        public Criteria andSelectNamesNotEqualTo(String value) {
            addCriterion("select_names <>", value, "selectNames");
            return (Criteria) this;
        }

        public Criteria andSelectNamesGreaterThan(String value) {
            addCriterion("select_names >", value, "selectNames");
            return (Criteria) this;
        }

        public Criteria andSelectNamesGreaterThanOrEqualTo(String value) {
            addCriterion("select_names >=", value, "selectNames");
            return (Criteria) this;
        }

        public Criteria andSelectNamesLessThan(String value) {
            addCriterion("select_names <", value, "selectNames");
            return (Criteria) this;
        }

        public Criteria andSelectNamesLessThanOrEqualTo(String value) {
            addCriterion("select_names <=", value, "selectNames");
            return (Criteria) this;
        }

        public Criteria andSelectNamesLike(String value) {
            addCriterion("select_names like", value, "selectNames");
            return (Criteria) this;
        }

        public Criteria andSelectNamesNotLike(String value) {
            addCriterion("select_names not like", value, "selectNames");
            return (Criteria) this;
        }

        public Criteria andSelectNamesIn(List<String> values) {
            addCriterion("select_names in", values, "selectNames");
            return (Criteria) this;
        }

        public Criteria andSelectNamesNotIn(List<String> values) {
            addCriterion("select_names not in", values, "selectNames");
            return (Criteria) this;
        }

        public Criteria andSelectNamesBetween(String value1, String value2) {
            addCriterion("select_names between", value1, value2, "selectNames");
            return (Criteria) this;
        }

        public Criteria andSelectNamesNotBetween(String value1, String value2) {
            addCriterion("select_names not between", value1, value2, "selectNames");
            return (Criteria) this;
        }

        public Criteria andApplyAmountIsNull() {
            addCriterion("apply_amount is null");
            return (Criteria) this;
        }

        public Criteria andApplyAmountIsNotNull() {
            addCriterion("apply_amount is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAmountEqualTo(BigDecimal value) {
            addCriterion("apply_amount =", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountNotEqualTo(BigDecimal value) {
            addCriterion("apply_amount <>", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountGreaterThan(BigDecimal value) {
            addCriterion("apply_amount >", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("apply_amount >=", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountLessThan(BigDecimal value) {
            addCriterion("apply_amount <", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("apply_amount <=", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountIn(List<BigDecimal> values) {
            addCriterion("apply_amount in", values, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountNotIn(List<BigDecimal> values) {
            addCriterion("apply_amount not in", values, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apply_amount between", value1, value2, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apply_amount not between", value1, value2, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andAuditTgDateIsNull() {
            addCriterion("audit_tg_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditTgDateIsNotNull() {
            addCriterion("audit_tg_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTgDateEqualTo(Date value) {
            addCriterion("audit_tg_date =", value, "auditTgDate");
            return (Criteria) this;
        }

        public Criteria andAuditTgDateNotEqualTo(Date value) {
            addCriterion("audit_tg_date <>", value, "auditTgDate");
            return (Criteria) this;
        }

        public Criteria andAuditTgDateGreaterThan(Date value) {
            addCriterion("audit_tg_date >", value, "auditTgDate");
            return (Criteria) this;
        }

        public Criteria andAuditTgDateGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_tg_date >=", value, "auditTgDate");
            return (Criteria) this;
        }

        public Criteria andAuditTgDateLessThan(Date value) {
            addCriterion("audit_tg_date <", value, "auditTgDate");
            return (Criteria) this;
        }

        public Criteria andAuditTgDateLessThanOrEqualTo(Date value) {
            addCriterion("audit_tg_date <=", value, "auditTgDate");
            return (Criteria) this;
        }

        public Criteria andAuditTgDateIn(List<Date> values) {
            addCriterion("audit_tg_date in", values, "auditTgDate");
            return (Criteria) this;
        }

        public Criteria andAuditTgDateNotIn(List<Date> values) {
            addCriterion("audit_tg_date not in", values, "auditTgDate");
            return (Criteria) this;
        }

        public Criteria andAuditTgDateBetween(Date value1, Date value2) {
            addCriterion("audit_tg_date between", value1, value2, "auditTgDate");
            return (Criteria) this;
        }

        public Criteria andAuditTgDateNotBetween(Date value1, Date value2) {
            addCriterion("audit_tg_date not between", value1, value2, "auditTgDate");
            return (Criteria) this;
        }

        public Criteria andCreditStartIsNull() {
            addCriterion("credit_start is null");
            return (Criteria) this;
        }

        public Criteria andCreditStartIsNotNull() {
            addCriterion("credit_start is not null");
            return (Criteria) this;
        }

        public Criteria andCreditStartEqualTo(Date value) {
            addCriterion("credit_start =", value, "creditStart");
            return (Criteria) this;
        }

        public Criteria andCreditStartNotEqualTo(Date value) {
            addCriterion("credit_start <>", value, "creditStart");
            return (Criteria) this;
        }

        public Criteria andCreditStartGreaterThan(Date value) {
            addCriterion("credit_start >", value, "creditStart");
            return (Criteria) this;
        }

        public Criteria andCreditStartGreaterThanOrEqualTo(Date value) {
            addCriterion("credit_start >=", value, "creditStart");
            return (Criteria) this;
        }

        public Criteria andCreditStartLessThan(Date value) {
            addCriterion("credit_start <", value, "creditStart");
            return (Criteria) this;
        }

        public Criteria andCreditStartLessThanOrEqualTo(Date value) {
            addCriterion("credit_start <=", value, "creditStart");
            return (Criteria) this;
        }

        public Criteria andCreditStartIn(List<Date> values) {
            addCriterion("credit_start in", values, "creditStart");
            return (Criteria) this;
        }

        public Criteria andCreditStartNotIn(List<Date> values) {
            addCriterion("credit_start not in", values, "creditStart");
            return (Criteria) this;
        }

        public Criteria andCreditStartBetween(Date value1, Date value2) {
            addCriterion("credit_start between", value1, value2, "creditStart");
            return (Criteria) this;
        }

        public Criteria andCreditStartNotBetween(Date value1, Date value2) {
            addCriterion("credit_start not between", value1, value2, "creditStart");
            return (Criteria) this;
        }

        public Criteria andCreditEndIsNull() {
            addCriterion("credit_end is null");
            return (Criteria) this;
        }

        public Criteria andCreditEndIsNotNull() {
            addCriterion("credit_end is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEndEqualTo(Date value) {
            addCriterion("credit_end =", value, "creditEnd");
            return (Criteria) this;
        }

        public Criteria andCreditEndNotEqualTo(Date value) {
            addCriterion("credit_end <>", value, "creditEnd");
            return (Criteria) this;
        }

        public Criteria andCreditEndGreaterThan(Date value) {
            addCriterion("credit_end >", value, "creditEnd");
            return (Criteria) this;
        }

        public Criteria andCreditEndGreaterThanOrEqualTo(Date value) {
            addCriterion("credit_end >=", value, "creditEnd");
            return (Criteria) this;
        }

        public Criteria andCreditEndLessThan(Date value) {
            addCriterion("credit_end <", value, "creditEnd");
            return (Criteria) this;
        }

        public Criteria andCreditEndLessThanOrEqualTo(Date value) {
            addCriterion("credit_end <=", value, "creditEnd");
            return (Criteria) this;
        }

        public Criteria andCreditEndIn(List<Date> values) {
            addCriterion("credit_end in", values, "creditEnd");
            return (Criteria) this;
        }

        public Criteria andCreditEndNotIn(List<Date> values) {
            addCriterion("credit_end not in", values, "creditEnd");
            return (Criteria) this;
        }

        public Criteria andCreditEndBetween(Date value1, Date value2) {
            addCriterion("credit_end between", value1, value2, "creditEnd");
            return (Criteria) this;
        }

        public Criteria andCreditEndNotBetween(Date value1, Date value2) {
            addCriterion("credit_end not between", value1, value2, "creditEnd");
            return (Criteria) this;
        }

        public Criteria andTimeLimitTypeIsNull() {
            addCriterion("time_limit_type is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitTypeIsNotNull() {
            addCriterion("time_limit_type is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitTypeEqualTo(String value) {
            addCriterion("time_limit_type =", value, "timeLimitType");
            return (Criteria) this;
        }

        public Criteria andTimeLimitTypeNotEqualTo(String value) {
            addCriterion("time_limit_type <>", value, "timeLimitType");
            return (Criteria) this;
        }

        public Criteria andTimeLimitTypeGreaterThan(String value) {
            addCriterion("time_limit_type >", value, "timeLimitType");
            return (Criteria) this;
        }

        public Criteria andTimeLimitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("time_limit_type >=", value, "timeLimitType");
            return (Criteria) this;
        }

        public Criteria andTimeLimitTypeLessThan(String value) {
            addCriterion("time_limit_type <", value, "timeLimitType");
            return (Criteria) this;
        }

        public Criteria andTimeLimitTypeLessThanOrEqualTo(String value) {
            addCriterion("time_limit_type <=", value, "timeLimitType");
            return (Criteria) this;
        }

        public Criteria andTimeLimitTypeLike(String value) {
            addCriterion("time_limit_type like", value, "timeLimitType");
            return (Criteria) this;
        }

        public Criteria andTimeLimitTypeNotLike(String value) {
            addCriterion("time_limit_type not like", value, "timeLimitType");
            return (Criteria) this;
        }

        public Criteria andTimeLimitTypeIn(List<String> values) {
            addCriterion("time_limit_type in", values, "timeLimitType");
            return (Criteria) this;
        }

        public Criteria andTimeLimitTypeNotIn(List<String> values) {
            addCriterion("time_limit_type not in", values, "timeLimitType");
            return (Criteria) this;
        }

        public Criteria andTimeLimitTypeBetween(String value1, String value2) {
            addCriterion("time_limit_type between", value1, value2, "timeLimitType");
            return (Criteria) this;
        }

        public Criteria andTimeLimitTypeNotBetween(String value1, String value2) {
            addCriterion("time_limit_type not between", value1, value2, "timeLimitType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNull() {
            addCriterion("project_type is null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNotNull() {
            addCriterion("project_type is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeEqualTo(String value) {
            addCriterion("project_type =", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotEqualTo(String value) {
            addCriterion("project_type <>", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThan(String value) {
            addCriterion("project_type >", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("project_type >=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThan(String value) {
            addCriterion("project_type <", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThanOrEqualTo(String value) {
            addCriterion("project_type <=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLike(String value) {
            addCriterion("project_type like", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotLike(String value) {
            addCriterion("project_type not like", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIn(List<String> values) {
            addCriterion("project_type in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotIn(List<String> values) {
            addCriterion("project_type not in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeBetween(String value1, String value2) {
            addCriterion("project_type between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotBetween(String value1, String value2) {
            addCriterion("project_type not between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andChangeStrIsNull() {
            addCriterion("change_str is null");
            return (Criteria) this;
        }

        public Criteria andChangeStrIsNotNull() {
            addCriterion("change_str is not null");
            return (Criteria) this;
        }

        public Criteria andChangeStrEqualTo(String value) {
            addCriterion("change_str =", value, "changeStr");
            return (Criteria) this;
        }

        public Criteria andChangeStrNotEqualTo(String value) {
            addCriterion("change_str <>", value, "changeStr");
            return (Criteria) this;
        }

        public Criteria andChangeStrGreaterThan(String value) {
            addCriterion("change_str >", value, "changeStr");
            return (Criteria) this;
        }

        public Criteria andChangeStrGreaterThanOrEqualTo(String value) {
            addCriterion("change_str >=", value, "changeStr");
            return (Criteria) this;
        }

        public Criteria andChangeStrLessThan(String value) {
            addCriterion("change_str <", value, "changeStr");
            return (Criteria) this;
        }

        public Criteria andChangeStrLessThanOrEqualTo(String value) {
            addCriterion("change_str <=", value, "changeStr");
            return (Criteria) this;
        }

        public Criteria andChangeStrLike(String value) {
            addCriterion("change_str like", value, "changeStr");
            return (Criteria) this;
        }

        public Criteria andChangeStrNotLike(String value) {
            addCriterion("change_str not like", value, "changeStr");
            return (Criteria) this;
        }

        public Criteria andChangeStrIn(List<String> values) {
            addCriterion("change_str in", values, "changeStr");
            return (Criteria) this;
        }

        public Criteria andChangeStrNotIn(List<String> values) {
            addCriterion("change_str not in", values, "changeStr");
            return (Criteria) this;
        }

        public Criteria andChangeStrBetween(String value1, String value2) {
            addCriterion("change_str between", value1, value2, "changeStr");
            return (Criteria) this;
        }

        public Criteria andChangeStrNotBetween(String value1, String value2) {
            addCriterion("change_str not between", value1, value2, "changeStr");
            return (Criteria) this;
        }

        public Criteria andProductSchemeIdIsNull() {
            addCriterion("product_scheme_id is null");
            return (Criteria) this;
        }

        public Criteria andProductSchemeIdIsNotNull() {
            addCriterion("product_scheme_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductSchemeIdEqualTo(String value) {
            addCriterion("product_scheme_id =", value, "productSchemeId");
            return (Criteria) this;
        }

        public Criteria andProductSchemeIdNotEqualTo(String value) {
            addCriterion("product_scheme_id <>", value, "productSchemeId");
            return (Criteria) this;
        }

        public Criteria andProductSchemeIdGreaterThan(String value) {
            addCriterion("product_scheme_id >", value, "productSchemeId");
            return (Criteria) this;
        }

        public Criteria andProductSchemeIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_scheme_id >=", value, "productSchemeId");
            return (Criteria) this;
        }

        public Criteria andProductSchemeIdLessThan(String value) {
            addCriterion("product_scheme_id <", value, "productSchemeId");
            return (Criteria) this;
        }

        public Criteria andProductSchemeIdLessThanOrEqualTo(String value) {
            addCriterion("product_scheme_id <=", value, "productSchemeId");
            return (Criteria) this;
        }

        public Criteria andProductSchemeIdLike(String value) {
            addCriterion("product_scheme_id like", value, "productSchemeId");
            return (Criteria) this;
        }

        public Criteria andProductSchemeIdNotLike(String value) {
            addCriterion("product_scheme_id not like", value, "productSchemeId");
            return (Criteria) this;
        }

        public Criteria andProductSchemeIdIn(List<String> values) {
            addCriterion("product_scheme_id in", values, "productSchemeId");
            return (Criteria) this;
        }

        public Criteria andProductSchemeIdNotIn(List<String> values) {
            addCriterion("product_scheme_id not in", values, "productSchemeId");
            return (Criteria) this;
        }

        public Criteria andProductSchemeIdBetween(String value1, String value2) {
            addCriterion("product_scheme_id between", value1, value2, "productSchemeId");
            return (Criteria) this;
        }

        public Criteria andProductSchemeIdNotBetween(String value1, String value2) {
            addCriterion("product_scheme_id not between", value1, value2, "productSchemeId");
            return (Criteria) this;
        }

        public Criteria andCommLoanerStrIsNull() {
            addCriterion("comm_loaner_str is null");
            return (Criteria) this;
        }

        public Criteria andCommLoanerStrIsNotNull() {
            addCriterion("comm_loaner_str is not null");
            return (Criteria) this;
        }

        public Criteria andCommLoanerStrEqualTo(String value) {
            addCriterion("comm_loaner_str =", value, "commLoanerStr");
            return (Criteria) this;
        }

        public Criteria andCommLoanerStrNotEqualTo(String value) {
            addCriterion("comm_loaner_str <>", value, "commLoanerStr");
            return (Criteria) this;
        }

        public Criteria andCommLoanerStrGreaterThan(String value) {
            addCriterion("comm_loaner_str >", value, "commLoanerStr");
            return (Criteria) this;
        }

        public Criteria andCommLoanerStrGreaterThanOrEqualTo(String value) {
            addCriterion("comm_loaner_str >=", value, "commLoanerStr");
            return (Criteria) this;
        }

        public Criteria andCommLoanerStrLessThan(String value) {
            addCriterion("comm_loaner_str <", value, "commLoanerStr");
            return (Criteria) this;
        }

        public Criteria andCommLoanerStrLessThanOrEqualTo(String value) {
            addCriterion("comm_loaner_str <=", value, "commLoanerStr");
            return (Criteria) this;
        }

        public Criteria andCommLoanerStrLike(String value) {
            addCriterion("comm_loaner_str like", value, "commLoanerStr");
            return (Criteria) this;
        }

        public Criteria andCommLoanerStrNotLike(String value) {
            addCriterion("comm_loaner_str not like", value, "commLoanerStr");
            return (Criteria) this;
        }

        public Criteria andCommLoanerStrIn(List<String> values) {
            addCriterion("comm_loaner_str in", values, "commLoanerStr");
            return (Criteria) this;
        }

        public Criteria andCommLoanerStrNotIn(List<String> values) {
            addCriterion("comm_loaner_str not in", values, "commLoanerStr");
            return (Criteria) this;
        }

        public Criteria andCommLoanerStrBetween(String value1, String value2) {
            addCriterion("comm_loaner_str between", value1, value2, "commLoanerStr");
            return (Criteria) this;
        }

        public Criteria andCommLoanerStrNotBetween(String value1, String value2) {
            addCriterion("comm_loaner_str not between", value1, value2, "commLoanerStr");
            return (Criteria) this;
        }

        public Criteria andProductSchemeCodeIsNull() {
            addCriterion("product_scheme_code is null");
            return (Criteria) this;
        }

        public Criteria andProductSchemeCodeIsNotNull() {
            addCriterion("product_scheme_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductSchemeCodeEqualTo(String value) {
            addCriterion("product_scheme_code =", value, "productSchemeCode");
            return (Criteria) this;
        }

        public Criteria andProductSchemeCodeNotEqualTo(String value) {
            addCriterion("product_scheme_code <>", value, "productSchemeCode");
            return (Criteria) this;
        }

        public Criteria andProductSchemeCodeGreaterThan(String value) {
            addCriterion("product_scheme_code >", value, "productSchemeCode");
            return (Criteria) this;
        }

        public Criteria andProductSchemeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_scheme_code >=", value, "productSchemeCode");
            return (Criteria) this;
        }

        public Criteria andProductSchemeCodeLessThan(String value) {
            addCriterion("product_scheme_code <", value, "productSchemeCode");
            return (Criteria) this;
        }

        public Criteria andProductSchemeCodeLessThanOrEqualTo(String value) {
            addCriterion("product_scheme_code <=", value, "productSchemeCode");
            return (Criteria) this;
        }

        public Criteria andProductSchemeCodeLike(String value) {
            addCriterion("product_scheme_code like", value, "productSchemeCode");
            return (Criteria) this;
        }

        public Criteria andProductSchemeCodeNotLike(String value) {
            addCriterion("product_scheme_code not like", value, "productSchemeCode");
            return (Criteria) this;
        }

        public Criteria andProductSchemeCodeIn(List<String> values) {
            addCriterion("product_scheme_code in", values, "productSchemeCode");
            return (Criteria) this;
        }

        public Criteria andProductSchemeCodeNotIn(List<String> values) {
            addCriterion("product_scheme_code not in", values, "productSchemeCode");
            return (Criteria) this;
        }

        public Criteria andProductSchemeCodeBetween(String value1, String value2) {
            addCriterion("product_scheme_code between", value1, value2, "productSchemeCode");
            return (Criteria) this;
        }

        public Criteria andProductSchemeCodeNotBetween(String value1, String value2) {
            addCriterion("product_scheme_code not between", value1, value2, "productSchemeCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameIsNull() {
            addCriterion("borrower_name is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameIsNotNull() {
            addCriterion("borrower_name is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameEqualTo(String value) {
            addCriterion("borrower_name =", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameNotEqualTo(String value) {
            addCriterion("borrower_name <>", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameGreaterThan(String value) {
            addCriterion("borrower_name >", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameGreaterThanOrEqualTo(String value) {
            addCriterion("borrower_name >=", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameLessThan(String value) {
            addCriterion("borrower_name <", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameLessThanOrEqualTo(String value) {
            addCriterion("borrower_name <=", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameLike(String value) {
            addCriterion("borrower_name like", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameNotLike(String value) {
            addCriterion("borrower_name not like", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameIn(List<String> values) {
            addCriterion("borrower_name in", values, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameNotIn(List<String> values) {
            addCriterion("borrower_name not in", values, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameBetween(String value1, String value2) {
            addCriterion("borrower_name between", value1, value2, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameNotBetween(String value1, String value2) {
            addCriterion("borrower_name not between", value1, value2, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andProductSchemeNameIsNull() {
            addCriterion("product_scheme_name is null");
            return (Criteria) this;
        }

        public Criteria andProductSchemeNameIsNotNull() {
            addCriterion("product_scheme_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductSchemeNameEqualTo(String value) {
            addCriterion("product_scheme_name =", value, "productSchemeName");
            return (Criteria) this;
        }

        public Criteria andProductSchemeNameNotEqualTo(String value) {
            addCriterion("product_scheme_name <>", value, "productSchemeName");
            return (Criteria) this;
        }

        public Criteria andProductSchemeNameGreaterThan(String value) {
            addCriterion("product_scheme_name >", value, "productSchemeName");
            return (Criteria) this;
        }

        public Criteria andProductSchemeNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_scheme_name >=", value, "productSchemeName");
            return (Criteria) this;
        }

        public Criteria andProductSchemeNameLessThan(String value) {
            addCriterion("product_scheme_name <", value, "productSchemeName");
            return (Criteria) this;
        }

        public Criteria andProductSchemeNameLessThanOrEqualTo(String value) {
            addCriterion("product_scheme_name <=", value, "productSchemeName");
            return (Criteria) this;
        }

        public Criteria andProductSchemeNameLike(String value) {
            addCriterion("product_scheme_name like", value, "productSchemeName");
            return (Criteria) this;
        }

        public Criteria andProductSchemeNameNotLike(String value) {
            addCriterion("product_scheme_name not like", value, "productSchemeName");
            return (Criteria) this;
        }

        public Criteria andProductSchemeNameIn(List<String> values) {
            addCriterion("product_scheme_name in", values, "productSchemeName");
            return (Criteria) this;
        }

        public Criteria andProductSchemeNameNotIn(List<String> values) {
            addCriterion("product_scheme_name not in", values, "productSchemeName");
            return (Criteria) this;
        }

        public Criteria andProductSchemeNameBetween(String value1, String value2) {
            addCriterion("product_scheme_name between", value1, value2, "productSchemeName");
            return (Criteria) this;
        }

        public Criteria andProductSchemeNameNotBetween(String value1, String value2) {
            addCriterion("product_scheme_name not between", value1, value2, "productSchemeName");
            return (Criteria) this;
        }

        public Criteria andChannelSideIsNull() {
            addCriterion("channel_side is null");
            return (Criteria) this;
        }

        public Criteria andChannelSideIsNotNull() {
            addCriterion("channel_side is not null");
            return (Criteria) this;
        }

        public Criteria andChannelSideEqualTo(String value) {
            addCriterion("channel_side =", value, "channelSide");
            return (Criteria) this;
        }

        public Criteria andChannelSideNotEqualTo(String value) {
            addCriterion("channel_side <>", value, "channelSide");
            return (Criteria) this;
        }

        public Criteria andChannelSideGreaterThan(String value) {
            addCriterion("channel_side >", value, "channelSide");
            return (Criteria) this;
        }

        public Criteria andChannelSideGreaterThanOrEqualTo(String value) {
            addCriterion("channel_side >=", value, "channelSide");
            return (Criteria) this;
        }

        public Criteria andChannelSideLessThan(String value) {
            addCriterion("channel_side <", value, "channelSide");
            return (Criteria) this;
        }

        public Criteria andChannelSideLessThanOrEqualTo(String value) {
            addCriterion("channel_side <=", value, "channelSide");
            return (Criteria) this;
        }

        public Criteria andChannelSideLike(String value) {
            addCriterion("channel_side like", value, "channelSide");
            return (Criteria) this;
        }

        public Criteria andChannelSideNotLike(String value) {
            addCriterion("channel_side not like", value, "channelSide");
            return (Criteria) this;
        }

        public Criteria andChannelSideIn(List<String> values) {
            addCriterion("channel_side in", values, "channelSide");
            return (Criteria) this;
        }

        public Criteria andChannelSideNotIn(List<String> values) {
            addCriterion("channel_side not in", values, "channelSide");
            return (Criteria) this;
        }

        public Criteria andChannelSideBetween(String value1, String value2) {
            addCriterion("channel_side between", value1, value2, "channelSide");
            return (Criteria) this;
        }

        public Criteria andChannelSideNotBetween(String value1, String value2) {
            addCriterion("channel_side not between", value1, value2, "channelSide");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceIsNull() {
            addCriterion("channel_relevance is null");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceIsNotNull() {
            addCriterion("channel_relevance is not null");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceEqualTo(String value) {
            addCriterion("channel_relevance =", value, "channelRelevance");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceNotEqualTo(String value) {
            addCriterion("channel_relevance <>", value, "channelRelevance");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceGreaterThan(String value) {
            addCriterion("channel_relevance >", value, "channelRelevance");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceGreaterThanOrEqualTo(String value) {
            addCriterion("channel_relevance >=", value, "channelRelevance");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceLessThan(String value) {
            addCriterion("channel_relevance <", value, "channelRelevance");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceLessThanOrEqualTo(String value) {
            addCriterion("channel_relevance <=", value, "channelRelevance");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceLike(String value) {
            addCriterion("channel_relevance like", value, "channelRelevance");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceNotLike(String value) {
            addCriterion("channel_relevance not like", value, "channelRelevance");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceIn(List<String> values) {
            addCriterion("channel_relevance in", values, "channelRelevance");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceNotIn(List<String> values) {
            addCriterion("channel_relevance not in", values, "channelRelevance");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceBetween(String value1, String value2) {
            addCriterion("channel_relevance between", value1, value2, "channelRelevance");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceNotBetween(String value1, String value2) {
            addCriterion("channel_relevance not between", value1, value2, "channelRelevance");
            return (Criteria) this;
        }

        public Criteria andBorrowCustomerSourceIsNull() {
            addCriterion("borrow_customer_source is null");
            return (Criteria) this;
        }

        public Criteria andBorrowCustomerSourceIsNotNull() {
            addCriterion("borrow_customer_source is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowCustomerSourceEqualTo(String value) {
            addCriterion("borrow_customer_source =", value, "borrowCustomerSource");
            return (Criteria) this;
        }

        public Criteria andBorrowCustomerSourceNotEqualTo(String value) {
            addCriterion("borrow_customer_source <>", value, "borrowCustomerSource");
            return (Criteria) this;
        }

        public Criteria andBorrowCustomerSourceGreaterThan(String value) {
            addCriterion("borrow_customer_source >", value, "borrowCustomerSource");
            return (Criteria) this;
        }

        public Criteria andBorrowCustomerSourceGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_customer_source >=", value, "borrowCustomerSource");
            return (Criteria) this;
        }

        public Criteria andBorrowCustomerSourceLessThan(String value) {
            addCriterion("borrow_customer_source <", value, "borrowCustomerSource");
            return (Criteria) this;
        }

        public Criteria andBorrowCustomerSourceLessThanOrEqualTo(String value) {
            addCriterion("borrow_customer_source <=", value, "borrowCustomerSource");
            return (Criteria) this;
        }

        public Criteria andBorrowCustomerSourceLike(String value) {
            addCriterion("borrow_customer_source like", value, "borrowCustomerSource");
            return (Criteria) this;
        }

        public Criteria andBorrowCustomerSourceNotLike(String value) {
            addCriterion("borrow_customer_source not like", value, "borrowCustomerSource");
            return (Criteria) this;
        }

        public Criteria andBorrowCustomerSourceIn(List<String> values) {
            addCriterion("borrow_customer_source in", values, "borrowCustomerSource");
            return (Criteria) this;
        }

        public Criteria andBorrowCustomerSourceNotIn(List<String> values) {
            addCriterion("borrow_customer_source not in", values, "borrowCustomerSource");
            return (Criteria) this;
        }

        public Criteria andBorrowCustomerSourceBetween(String value1, String value2) {
            addCriterion("borrow_customer_source between", value1, value2, "borrowCustomerSource");
            return (Criteria) this;
        }

        public Criteria andBorrowCustomerSourceNotBetween(String value1, String value2) {
            addCriterion("borrow_customer_source not between", value1, value2, "borrowCustomerSource");
            return (Criteria) this;
        }

        public Criteria andBorrowerCardIsNull() {
            addCriterion("borrower_card is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerCardIsNotNull() {
            addCriterion("borrower_card is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerCardEqualTo(String value) {
            addCriterion("borrower_card =", value, "borrowerCard");
            return (Criteria) this;
        }

        public Criteria andBorrowerCardNotEqualTo(String value) {
            addCriterion("borrower_card <>", value, "borrowerCard");
            return (Criteria) this;
        }

        public Criteria andBorrowerCardGreaterThan(String value) {
            addCriterion("borrower_card >", value, "borrowerCard");
            return (Criteria) this;
        }

        public Criteria andBorrowerCardGreaterThanOrEqualTo(String value) {
            addCriterion("borrower_card >=", value, "borrowerCard");
            return (Criteria) this;
        }

        public Criteria andBorrowerCardLessThan(String value) {
            addCriterion("borrower_card <", value, "borrowerCard");
            return (Criteria) this;
        }

        public Criteria andBorrowerCardLessThanOrEqualTo(String value) {
            addCriterion("borrower_card <=", value, "borrowerCard");
            return (Criteria) this;
        }

        public Criteria andBorrowerCardLike(String value) {
            addCriterion("borrower_card like", value, "borrowerCard");
            return (Criteria) this;
        }

        public Criteria andBorrowerCardNotLike(String value) {
            addCriterion("borrower_card not like", value, "borrowerCard");
            return (Criteria) this;
        }

        public Criteria andBorrowerCardIn(List<String> values) {
            addCriterion("borrower_card in", values, "borrowerCard");
            return (Criteria) this;
        }

        public Criteria andBorrowerCardNotIn(List<String> values) {
            addCriterion("borrower_card not in", values, "borrowerCard");
            return (Criteria) this;
        }

        public Criteria andBorrowerCardBetween(String value1, String value2) {
            addCriterion("borrower_card between", value1, value2, "borrowerCard");
            return (Criteria) this;
        }

        public Criteria andBorrowerCardNotBetween(String value1, String value2) {
            addCriterion("borrower_card not between", value1, value2, "borrowerCard");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceIsNull() {
            addCriterion("repayment_source is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceIsNotNull() {
            addCriterion("repayment_source is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceEqualTo(String value) {
            addCriterion("repayment_source =", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceNotEqualTo(String value) {
            addCriterion("repayment_source <>", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceGreaterThan(String value) {
            addCriterion("repayment_source >", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_source >=", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceLessThan(String value) {
            addCriterion("repayment_source <", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceLessThanOrEqualTo(String value) {
            addCriterion("repayment_source <=", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceLike(String value) {
            addCriterion("repayment_source like", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceNotLike(String value) {
            addCriterion("repayment_source not like", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceIn(List<String> values) {
            addCriterion("repayment_source in", values, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceNotIn(List<String> values) {
            addCriterion("repayment_source not in", values, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceBetween(String value1, String value2) {
            addCriterion("repayment_source between", value1, value2, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceNotBetween(String value1, String value2) {
            addCriterion("repayment_source not between", value1, value2, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andCarStyleIsNull() {
            addCriterion("car_style is null");
            return (Criteria) this;
        }

        public Criteria andCarStyleIsNotNull() {
            addCriterion("car_style is not null");
            return (Criteria) this;
        }

        public Criteria andCarStyleEqualTo(String value) {
            addCriterion("car_style =", value, "carStyle");
            return (Criteria) this;
        }

        public Criteria andCarStyleNotEqualTo(String value) {
            addCriterion("car_style <>", value, "carStyle");
            return (Criteria) this;
        }

        public Criteria andCarStyleGreaterThan(String value) {
            addCriterion("car_style >", value, "carStyle");
            return (Criteria) this;
        }

        public Criteria andCarStyleGreaterThanOrEqualTo(String value) {
            addCriterion("car_style >=", value, "carStyle");
            return (Criteria) this;
        }

        public Criteria andCarStyleLessThan(String value) {
            addCriterion("car_style <", value, "carStyle");
            return (Criteria) this;
        }

        public Criteria andCarStyleLessThanOrEqualTo(String value) {
            addCriterion("car_style <=", value, "carStyle");
            return (Criteria) this;
        }

        public Criteria andCarStyleLike(String value) {
            addCriterion("car_style like", value, "carStyle");
            return (Criteria) this;
        }

        public Criteria andCarStyleNotLike(String value) {
            addCriterion("car_style not like", value, "carStyle");
            return (Criteria) this;
        }

        public Criteria andCarStyleIn(List<String> values) {
            addCriterion("car_style in", values, "carStyle");
            return (Criteria) this;
        }

        public Criteria andCarStyleNotIn(List<String> values) {
            addCriterion("car_style not in", values, "carStyle");
            return (Criteria) this;
        }

        public Criteria andCarStyleBetween(String value1, String value2) {
            addCriterion("car_style between", value1, value2, "carStyle");
            return (Criteria) this;
        }

        public Criteria andCarStyleNotBetween(String value1, String value2) {
            addCriterion("car_style not between", value1, value2, "carStyle");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNull() {
            addCriterion("channel_name is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("channel_name =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("channel_name <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("channel_name >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("channel_name >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("channel_name <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("channel_name <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("channel_name like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("channel_name not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("channel_name in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("channel_name not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("channel_name between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("channel_name not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelBankAccountIsNull() {
            addCriterion("channel_bank_account is null");
            return (Criteria) this;
        }

        public Criteria andChannelBankAccountIsNotNull() {
            addCriterion("channel_bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andChannelBankAccountEqualTo(String value) {
            addCriterion("channel_bank_account =", value, "channelBankAccount");
            return (Criteria) this;
        }

        public Criteria andChannelBankAccountNotEqualTo(String value) {
            addCriterion("channel_bank_account <>", value, "channelBankAccount");
            return (Criteria) this;
        }

        public Criteria andChannelBankAccountGreaterThan(String value) {
            addCriterion("channel_bank_account >", value, "channelBankAccount");
            return (Criteria) this;
        }

        public Criteria andChannelBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("channel_bank_account >=", value, "channelBankAccount");
            return (Criteria) this;
        }

        public Criteria andChannelBankAccountLessThan(String value) {
            addCriterion("channel_bank_account <", value, "channelBankAccount");
            return (Criteria) this;
        }

        public Criteria andChannelBankAccountLessThanOrEqualTo(String value) {
            addCriterion("channel_bank_account <=", value, "channelBankAccount");
            return (Criteria) this;
        }

        public Criteria andChannelBankAccountLike(String value) {
            addCriterion("channel_bank_account like", value, "channelBankAccount");
            return (Criteria) this;
        }

        public Criteria andChannelBankAccountNotLike(String value) {
            addCriterion("channel_bank_account not like", value, "channelBankAccount");
            return (Criteria) this;
        }

        public Criteria andChannelBankAccountIn(List<String> values) {
            addCriterion("channel_bank_account in", values, "channelBankAccount");
            return (Criteria) this;
        }

        public Criteria andChannelBankAccountNotIn(List<String> values) {
            addCriterion("channel_bank_account not in", values, "channelBankAccount");
            return (Criteria) this;
        }

        public Criteria andChannelBankAccountBetween(String value1, String value2) {
            addCriterion("channel_bank_account between", value1, value2, "channelBankAccount");
            return (Criteria) this;
        }

        public Criteria andChannelBankAccountNotBetween(String value1, String value2) {
            addCriterion("channel_bank_account not between", value1, value2, "channelBankAccount");
            return (Criteria) this;
        }

        public Criteria andNakedCarPriceIsNull() {
            addCriterion("naked_car_price is null");
            return (Criteria) this;
        }

        public Criteria andNakedCarPriceIsNotNull() {
            addCriterion("naked_car_price is not null");
            return (Criteria) this;
        }

        public Criteria andNakedCarPriceEqualTo(BigDecimal value) {
            addCriterion("naked_car_price =", value, "nakedCarPrice");
            return (Criteria) this;
        }

        public Criteria andNakedCarPriceNotEqualTo(BigDecimal value) {
            addCriterion("naked_car_price <>", value, "nakedCarPrice");
            return (Criteria) this;
        }

        public Criteria andNakedCarPriceGreaterThan(BigDecimal value) {
            addCriterion("naked_car_price >", value, "nakedCarPrice");
            return (Criteria) this;
        }

        public Criteria andNakedCarPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("naked_car_price >=", value, "nakedCarPrice");
            return (Criteria) this;
        }

        public Criteria andNakedCarPriceLessThan(BigDecimal value) {
            addCriterion("naked_car_price <", value, "nakedCarPrice");
            return (Criteria) this;
        }

        public Criteria andNakedCarPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("naked_car_price <=", value, "nakedCarPrice");
            return (Criteria) this;
        }

        public Criteria andNakedCarPriceIn(List<BigDecimal> values) {
            addCriterion("naked_car_price in", values, "nakedCarPrice");
            return (Criteria) this;
        }

        public Criteria andNakedCarPriceNotIn(List<BigDecimal> values) {
            addCriterion("naked_car_price not in", values, "nakedCarPrice");
            return (Criteria) this;
        }

        public Criteria andNakedCarPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("naked_car_price between", value1, value2, "nakedCarPrice");
            return (Criteria) this;
        }

        public Criteria andNakedCarPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("naked_car_price not between", value1, value2, "nakedCarPrice");
            return (Criteria) this;
        }

        public Criteria andDownRepaymentPriceIsNull() {
            addCriterion("down_repayment_price is null");
            return (Criteria) this;
        }

        public Criteria andDownRepaymentPriceIsNotNull() {
            addCriterion("down_repayment_price is not null");
            return (Criteria) this;
        }

        public Criteria andDownRepaymentPriceEqualTo(BigDecimal value) {
            addCriterion("down_repayment_price =", value, "downRepaymentPrice");
            return (Criteria) this;
        }

        public Criteria andDownRepaymentPriceNotEqualTo(BigDecimal value) {
            addCriterion("down_repayment_price <>", value, "downRepaymentPrice");
            return (Criteria) this;
        }

        public Criteria andDownRepaymentPriceGreaterThan(BigDecimal value) {
            addCriterion("down_repayment_price >", value, "downRepaymentPrice");
            return (Criteria) this;
        }

        public Criteria andDownRepaymentPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("down_repayment_price >=", value, "downRepaymentPrice");
            return (Criteria) this;
        }

        public Criteria andDownRepaymentPriceLessThan(BigDecimal value) {
            addCriterion("down_repayment_price <", value, "downRepaymentPrice");
            return (Criteria) this;
        }

        public Criteria andDownRepaymentPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("down_repayment_price <=", value, "downRepaymentPrice");
            return (Criteria) this;
        }

        public Criteria andDownRepaymentPriceIn(List<BigDecimal> values) {
            addCriterion("down_repayment_price in", values, "downRepaymentPrice");
            return (Criteria) this;
        }

        public Criteria andDownRepaymentPriceNotIn(List<BigDecimal> values) {
            addCriterion("down_repayment_price not in", values, "downRepaymentPrice");
            return (Criteria) this;
        }

        public Criteria andDownRepaymentPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("down_repayment_price between", value1, value2, "downRepaymentPrice");
            return (Criteria) this;
        }

        public Criteria andDownRepaymentPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("down_repayment_price not between", value1, value2, "downRepaymentPrice");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerMethodIsNull() {
            addCriterion("brokerage_server_method is null");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerMethodIsNotNull() {
            addCriterion("brokerage_server_method is not null");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerMethodEqualTo(String value) {
            addCriterion("brokerage_server_method =", value, "brokerageServerMethod");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerMethodNotEqualTo(String value) {
            addCriterion("brokerage_server_method <>", value, "brokerageServerMethod");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerMethodGreaterThan(String value) {
            addCriterion("brokerage_server_method >", value, "brokerageServerMethod");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerMethodGreaterThanOrEqualTo(String value) {
            addCriterion("brokerage_server_method >=", value, "brokerageServerMethod");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerMethodLessThan(String value) {
            addCriterion("brokerage_server_method <", value, "brokerageServerMethod");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerMethodLessThanOrEqualTo(String value) {
            addCriterion("brokerage_server_method <=", value, "brokerageServerMethod");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerMethodLike(String value) {
            addCriterion("brokerage_server_method like", value, "brokerageServerMethod");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerMethodNotLike(String value) {
            addCriterion("brokerage_server_method not like", value, "brokerageServerMethod");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerMethodIn(List<String> values) {
            addCriterion("brokerage_server_method in", values, "brokerageServerMethod");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerMethodNotIn(List<String> values) {
            addCriterion("brokerage_server_method not in", values, "brokerageServerMethod");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerMethodBetween(String value1, String value2) {
            addCriterion("brokerage_server_method between", value1, value2, "brokerageServerMethod");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerMethodNotBetween(String value1, String value2) {
            addCriterion("brokerage_server_method not between", value1, value2, "brokerageServerMethod");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerRateIsNull() {
            addCriterion("brokerage_server_rate is null");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerRateIsNotNull() {
            addCriterion("brokerage_server_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerRateEqualTo(BigDecimal value) {
            addCriterion("brokerage_server_rate =", value, "brokerageServerRate");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerRateNotEqualTo(BigDecimal value) {
            addCriterion("brokerage_server_rate <>", value, "brokerageServerRate");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerRateGreaterThan(BigDecimal value) {
            addCriterion("brokerage_server_rate >", value, "brokerageServerRate");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("brokerage_server_rate >=", value, "brokerageServerRate");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerRateLessThan(BigDecimal value) {
            addCriterion("brokerage_server_rate <", value, "brokerageServerRate");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("brokerage_server_rate <=", value, "brokerageServerRate");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerRateIn(List<BigDecimal> values) {
            addCriterion("brokerage_server_rate in", values, "brokerageServerRate");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerRateNotIn(List<BigDecimal> values) {
            addCriterion("brokerage_server_rate not in", values, "brokerageServerRate");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("brokerage_server_rate between", value1, value2, "brokerageServerRate");
            return (Criteria) this;
        }

        public Criteria andBrokerageServerRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("brokerage_server_rate not between", value1, value2, "brokerageServerRate");
            return (Criteria) this;
        }

        public Criteria andRepayInterestMethodIsNull() {
            addCriterion("repay_interest_method is null");
            return (Criteria) this;
        }

        public Criteria andRepayInterestMethodIsNotNull() {
            addCriterion("repay_interest_method is not null");
            return (Criteria) this;
        }

        public Criteria andRepayInterestMethodEqualTo(String value) {
            addCriterion("repay_interest_method =", value, "repayInterestMethod");
            return (Criteria) this;
        }

        public Criteria andRepayInterestMethodNotEqualTo(String value) {
            addCriterion("repay_interest_method <>", value, "repayInterestMethod");
            return (Criteria) this;
        }

        public Criteria andRepayInterestMethodGreaterThan(String value) {
            addCriterion("repay_interest_method >", value, "repayInterestMethod");
            return (Criteria) this;
        }

        public Criteria andRepayInterestMethodGreaterThanOrEqualTo(String value) {
            addCriterion("repay_interest_method >=", value, "repayInterestMethod");
            return (Criteria) this;
        }

        public Criteria andRepayInterestMethodLessThan(String value) {
            addCriterion("repay_interest_method <", value, "repayInterestMethod");
            return (Criteria) this;
        }

        public Criteria andRepayInterestMethodLessThanOrEqualTo(String value) {
            addCriterion("repay_interest_method <=", value, "repayInterestMethod");
            return (Criteria) this;
        }

        public Criteria andRepayInterestMethodLike(String value) {
            addCriterion("repay_interest_method like", value, "repayInterestMethod");
            return (Criteria) this;
        }

        public Criteria andRepayInterestMethodNotLike(String value) {
            addCriterion("repay_interest_method not like", value, "repayInterestMethod");
            return (Criteria) this;
        }

        public Criteria andRepayInterestMethodIn(List<String> values) {
            addCriterion("repay_interest_method in", values, "repayInterestMethod");
            return (Criteria) this;
        }

        public Criteria andRepayInterestMethodNotIn(List<String> values) {
            addCriterion("repay_interest_method not in", values, "repayInterestMethod");
            return (Criteria) this;
        }

        public Criteria andRepayInterestMethodBetween(String value1, String value2) {
            addCriterion("repay_interest_method between", value1, value2, "repayInterestMethod");
            return (Criteria) this;
        }

        public Criteria andRepayInterestMethodNotBetween(String value1, String value2) {
            addCriterion("repay_interest_method not between", value1, value2, "repayInterestMethod");
            return (Criteria) this;
        }

        public Criteria andChannelServerMethodIsNull() {
            addCriterion("channel_server_method is null");
            return (Criteria) this;
        }

        public Criteria andChannelServerMethodIsNotNull() {
            addCriterion("channel_server_method is not null");
            return (Criteria) this;
        }

        public Criteria andChannelServerMethodEqualTo(String value) {
            addCriterion("channel_server_method =", value, "channelServerMethod");
            return (Criteria) this;
        }

        public Criteria andChannelServerMethodNotEqualTo(String value) {
            addCriterion("channel_server_method <>", value, "channelServerMethod");
            return (Criteria) this;
        }

        public Criteria andChannelServerMethodGreaterThan(String value) {
            addCriterion("channel_server_method >", value, "channelServerMethod");
            return (Criteria) this;
        }

        public Criteria andChannelServerMethodGreaterThanOrEqualTo(String value) {
            addCriterion("channel_server_method >=", value, "channelServerMethod");
            return (Criteria) this;
        }

        public Criteria andChannelServerMethodLessThan(String value) {
            addCriterion("channel_server_method <", value, "channelServerMethod");
            return (Criteria) this;
        }

        public Criteria andChannelServerMethodLessThanOrEqualTo(String value) {
            addCriterion("channel_server_method <=", value, "channelServerMethod");
            return (Criteria) this;
        }

        public Criteria andChannelServerMethodLike(String value) {
            addCriterion("channel_server_method like", value, "channelServerMethod");
            return (Criteria) this;
        }

        public Criteria andChannelServerMethodNotLike(String value) {
            addCriterion("channel_server_method not like", value, "channelServerMethod");
            return (Criteria) this;
        }

        public Criteria andChannelServerMethodIn(List<String> values) {
            addCriterion("channel_server_method in", values, "channelServerMethod");
            return (Criteria) this;
        }

        public Criteria andChannelServerMethodNotIn(List<String> values) {
            addCriterion("channel_server_method not in", values, "channelServerMethod");
            return (Criteria) this;
        }

        public Criteria andChannelServerMethodBetween(String value1, String value2) {
            addCriterion("channel_server_method between", value1, value2, "channelServerMethod");
            return (Criteria) this;
        }

        public Criteria andChannelServerMethodNotBetween(String value1, String value2) {
            addCriterion("channel_server_method not between", value1, value2, "channelServerMethod");
            return (Criteria) this;
        }

        public Criteria andChannelServerRateIsNull() {
            addCriterion("channel_server_rate is null");
            return (Criteria) this;
        }

        public Criteria andChannelServerRateIsNotNull() {
            addCriterion("channel_server_rate is not null");
            return (Criteria) this;
        }

        public Criteria andChannelServerRateEqualTo(BigDecimal value) {
            addCriterion("channel_server_rate =", value, "channelServerRate");
            return (Criteria) this;
        }

        public Criteria andChannelServerRateNotEqualTo(BigDecimal value) {
            addCriterion("channel_server_rate <>", value, "channelServerRate");
            return (Criteria) this;
        }

        public Criteria andChannelServerRateGreaterThan(BigDecimal value) {
            addCriterion("channel_server_rate >", value, "channelServerRate");
            return (Criteria) this;
        }

        public Criteria andChannelServerRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("channel_server_rate >=", value, "channelServerRate");
            return (Criteria) this;
        }

        public Criteria andChannelServerRateLessThan(BigDecimal value) {
            addCriterion("channel_server_rate <", value, "channelServerRate");
            return (Criteria) this;
        }

        public Criteria andChannelServerRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("channel_server_rate <=", value, "channelServerRate");
            return (Criteria) this;
        }

        public Criteria andChannelServerRateIn(List<BigDecimal> values) {
            addCriterion("channel_server_rate in", values, "channelServerRate");
            return (Criteria) this;
        }

        public Criteria andChannelServerRateNotIn(List<BigDecimal> values) {
            addCriterion("channel_server_rate not in", values, "channelServerRate");
            return (Criteria) this;
        }

        public Criteria andChannelServerRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("channel_server_rate between", value1, value2, "channelServerRate");
            return (Criteria) this;
        }

        public Criteria andChannelServerRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("channel_server_rate not between", value1, value2, "channelServerRate");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerMethodIsNull() {
            addCriterion("pneumatic_server_method is null");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerMethodIsNotNull() {
            addCriterion("pneumatic_server_method is not null");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerMethodEqualTo(String value) {
            addCriterion("pneumatic_server_method =", value, "pneumaticServerMethod");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerMethodNotEqualTo(String value) {
            addCriterion("pneumatic_server_method <>", value, "pneumaticServerMethod");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerMethodGreaterThan(String value) {
            addCriterion("pneumatic_server_method >", value, "pneumaticServerMethod");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerMethodGreaterThanOrEqualTo(String value) {
            addCriterion("pneumatic_server_method >=", value, "pneumaticServerMethod");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerMethodLessThan(String value) {
            addCriterion("pneumatic_server_method <", value, "pneumaticServerMethod");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerMethodLessThanOrEqualTo(String value) {
            addCriterion("pneumatic_server_method <=", value, "pneumaticServerMethod");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerMethodLike(String value) {
            addCriterion("pneumatic_server_method like", value, "pneumaticServerMethod");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerMethodNotLike(String value) {
            addCriterion("pneumatic_server_method not like", value, "pneumaticServerMethod");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerMethodIn(List<String> values) {
            addCriterion("pneumatic_server_method in", values, "pneumaticServerMethod");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerMethodNotIn(List<String> values) {
            addCriterion("pneumatic_server_method not in", values, "pneumaticServerMethod");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerMethodBetween(String value1, String value2) {
            addCriterion("pneumatic_server_method between", value1, value2, "pneumaticServerMethod");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerMethodNotBetween(String value1, String value2) {
            addCriterion("pneumatic_server_method not between", value1, value2, "pneumaticServerMethod");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerRateIsNull() {
            addCriterion("pneumatic_server_rate is null");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerRateIsNotNull() {
            addCriterion("pneumatic_server_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerRateEqualTo(BigDecimal value) {
            addCriterion("pneumatic_server_rate =", value, "pneumaticServerRate");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerRateNotEqualTo(BigDecimal value) {
            addCriterion("pneumatic_server_rate <>", value, "pneumaticServerRate");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerRateGreaterThan(BigDecimal value) {
            addCriterion("pneumatic_server_rate >", value, "pneumaticServerRate");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pneumatic_server_rate >=", value, "pneumaticServerRate");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerRateLessThan(BigDecimal value) {
            addCriterion("pneumatic_server_rate <", value, "pneumaticServerRate");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pneumatic_server_rate <=", value, "pneumaticServerRate");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerRateIn(List<BigDecimal> values) {
            addCriterion("pneumatic_server_rate in", values, "pneumaticServerRate");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerRateNotIn(List<BigDecimal> values) {
            addCriterion("pneumatic_server_rate not in", values, "pneumaticServerRate");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pneumatic_server_rate between", value1, value2, "pneumaticServerRate");
            return (Criteria) this;
        }

        public Criteria andPneumaticServerRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pneumatic_server_rate not between", value1, value2, "pneumaticServerRate");
            return (Criteria) this;
        }

        public Criteria andMarginRatioIsNull() {
            addCriterion("margin_ratio is null");
            return (Criteria) this;
        }

        public Criteria andMarginRatioIsNotNull() {
            addCriterion("margin_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andMarginRatioEqualTo(BigDecimal value) {
            addCriterion("margin_ratio =", value, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioNotEqualTo(BigDecimal value) {
            addCriterion("margin_ratio <>", value, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioGreaterThan(BigDecimal value) {
            addCriterion("margin_ratio >", value, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("margin_ratio >=", value, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioLessThan(BigDecimal value) {
            addCriterion("margin_ratio <", value, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("margin_ratio <=", value, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioIn(List<BigDecimal> values) {
            addCriterion("margin_ratio in", values, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioNotIn(List<BigDecimal> values) {
            addCriterion("margin_ratio not in", values, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("margin_ratio between", value1, value2, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("margin_ratio not between", value1, value2, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginMethodIsNull() {
            addCriterion("margin_method is null");
            return (Criteria) this;
        }

        public Criteria andMarginMethodIsNotNull() {
            addCriterion("margin_method is not null");
            return (Criteria) this;
        }

        public Criteria andMarginMethodEqualTo(String value) {
            addCriterion("margin_method =", value, "marginMethod");
            return (Criteria) this;
        }

        public Criteria andMarginMethodNotEqualTo(String value) {
            addCriterion("margin_method <>", value, "marginMethod");
            return (Criteria) this;
        }

        public Criteria andMarginMethodGreaterThan(String value) {
            addCriterion("margin_method >", value, "marginMethod");
            return (Criteria) this;
        }

        public Criteria andMarginMethodGreaterThanOrEqualTo(String value) {
            addCriterion("margin_method >=", value, "marginMethod");
            return (Criteria) this;
        }

        public Criteria andMarginMethodLessThan(String value) {
            addCriterion("margin_method <", value, "marginMethod");
            return (Criteria) this;
        }

        public Criteria andMarginMethodLessThanOrEqualTo(String value) {
            addCriterion("margin_method <=", value, "marginMethod");
            return (Criteria) this;
        }

        public Criteria andMarginMethodLike(String value) {
            addCriterion("margin_method like", value, "marginMethod");
            return (Criteria) this;
        }

        public Criteria andMarginMethodNotLike(String value) {
            addCriterion("margin_method not like", value, "marginMethod");
            return (Criteria) this;
        }

        public Criteria andMarginMethodIn(List<String> values) {
            addCriterion("margin_method in", values, "marginMethod");
            return (Criteria) this;
        }

        public Criteria andMarginMethodNotIn(List<String> values) {
            addCriterion("margin_method not in", values, "marginMethod");
            return (Criteria) this;
        }

        public Criteria andMarginMethodBetween(String value1, String value2) {
            addCriterion("margin_method between", value1, value2, "marginMethod");
            return (Criteria) this;
        }

        public Criteria andMarginMethodNotBetween(String value1, String value2) {
            addCriterion("margin_method not between", value1, value2, "marginMethod");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldIsNull() {
            addCriterion("investors_yield is null");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldIsNotNull() {
            addCriterion("investors_yield is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldEqualTo(BigDecimal value) {
            addCriterion("investors_yield =", value, "investorsYield");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldNotEqualTo(BigDecimal value) {
            addCriterion("investors_yield <>", value, "investorsYield");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldGreaterThan(BigDecimal value) {
            addCriterion("investors_yield >", value, "investorsYield");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("investors_yield >=", value, "investorsYield");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldLessThan(BigDecimal value) {
            addCriterion("investors_yield <", value, "investorsYield");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldLessThanOrEqualTo(BigDecimal value) {
            addCriterion("investors_yield <=", value, "investorsYield");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldIn(List<BigDecimal> values) {
            addCriterion("investors_yield in", values, "investorsYield");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldNotIn(List<BigDecimal> values) {
            addCriterion("investors_yield not in", values, "investorsYield");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("investors_yield between", value1, value2, "investorsYield");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("investors_yield not between", value1, value2, "investorsYield");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldNameIsNull() {
            addCriterion("investors_yield_name is null");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldNameIsNotNull() {
            addCriterion("investors_yield_name is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldNameEqualTo(BigDecimal value) {
            addCriterion("investors_yield_name =", value, "investorsYieldName");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldNameNotEqualTo(BigDecimal value) {
            addCriterion("investors_yield_name <>", value, "investorsYieldName");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldNameGreaterThan(BigDecimal value) {
            addCriterion("investors_yield_name >", value, "investorsYieldName");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldNameGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("investors_yield_name >=", value, "investorsYieldName");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldNameLessThan(BigDecimal value) {
            addCriterion("investors_yield_name <", value, "investorsYieldName");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldNameLessThanOrEqualTo(BigDecimal value) {
            addCriterion("investors_yield_name <=", value, "investorsYieldName");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldNameIn(List<BigDecimal> values) {
            addCriterion("investors_yield_name in", values, "investorsYieldName");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldNameNotIn(List<BigDecimal> values) {
            addCriterion("investors_yield_name not in", values, "investorsYieldName");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldNameBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("investors_yield_name between", value1, value2, "investorsYieldName");
            return (Criteria) this;
        }

        public Criteria andInvestorsYieldNameNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("investors_yield_name not between", value1, value2, "investorsYieldName");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostIsNull() {
            addCriterion("borrower_cost is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostIsNotNull() {
            addCriterion("borrower_cost is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostEqualTo(BigDecimal value) {
            addCriterion("borrower_cost =", value, "borrowerCost");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostNotEqualTo(BigDecimal value) {
            addCriterion("borrower_cost <>", value, "borrowerCost");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostGreaterThan(BigDecimal value) {
            addCriterion("borrower_cost >", value, "borrowerCost");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrower_cost >=", value, "borrowerCost");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostLessThan(BigDecimal value) {
            addCriterion("borrower_cost <", value, "borrowerCost");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrower_cost <=", value, "borrowerCost");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostIn(List<BigDecimal> values) {
            addCriterion("borrower_cost in", values, "borrowerCost");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostNotIn(List<BigDecimal> values) {
            addCriterion("borrower_cost not in", values, "borrowerCost");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrower_cost between", value1, value2, "borrowerCost");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrower_cost not between", value1, value2, "borrowerCost");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostNameIsNull() {
            addCriterion("borrower_cost_name is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostNameIsNotNull() {
            addCriterion("borrower_cost_name is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostNameEqualTo(BigDecimal value) {
            addCriterion("borrower_cost_name =", value, "borrowerCostName");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostNameNotEqualTo(BigDecimal value) {
            addCriterion("borrower_cost_name <>", value, "borrowerCostName");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostNameGreaterThan(BigDecimal value) {
            addCriterion("borrower_cost_name >", value, "borrowerCostName");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostNameGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrower_cost_name >=", value, "borrowerCostName");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostNameLessThan(BigDecimal value) {
            addCriterion("borrower_cost_name <", value, "borrowerCostName");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostNameLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrower_cost_name <=", value, "borrowerCostName");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostNameIn(List<BigDecimal> values) {
            addCriterion("borrower_cost_name in", values, "borrowerCostName");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostNameNotIn(List<BigDecimal> values) {
            addCriterion("borrower_cost_name not in", values, "borrowerCostName");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostNameBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrower_cost_name between", value1, value2, "borrowerCostName");
            return (Criteria) this;
        }

        public Criteria andBorrowerCostNameNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrower_cost_name not between", value1, value2, "borrowerCostName");
            return (Criteria) this;
        }

        public Criteria andPrepaymentIsNull() {
            addCriterion("prepayment is null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentIsNotNull() {
            addCriterion("prepayment is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentEqualTo(String value) {
            addCriterion("prepayment =", value, "prepayment");
            return (Criteria) this;
        }

        public Criteria andPrepaymentNotEqualTo(String value) {
            addCriterion("prepayment <>", value, "prepayment");
            return (Criteria) this;
        }

        public Criteria andPrepaymentGreaterThan(String value) {
            addCriterion("prepayment >", value, "prepayment");
            return (Criteria) this;
        }

        public Criteria andPrepaymentGreaterThanOrEqualTo(String value) {
            addCriterion("prepayment >=", value, "prepayment");
            return (Criteria) this;
        }

        public Criteria andPrepaymentLessThan(String value) {
            addCriterion("prepayment <", value, "prepayment");
            return (Criteria) this;
        }

        public Criteria andPrepaymentLessThanOrEqualTo(String value) {
            addCriterion("prepayment <=", value, "prepayment");
            return (Criteria) this;
        }

        public Criteria andPrepaymentLike(String value) {
            addCriterion("prepayment like", value, "prepayment");
            return (Criteria) this;
        }

        public Criteria andPrepaymentNotLike(String value) {
            addCriterion("prepayment not like", value, "prepayment");
            return (Criteria) this;
        }

        public Criteria andPrepaymentIn(List<String> values) {
            addCriterion("prepayment in", values, "prepayment");
            return (Criteria) this;
        }

        public Criteria andPrepaymentNotIn(List<String> values) {
            addCriterion("prepayment not in", values, "prepayment");
            return (Criteria) this;
        }

        public Criteria andPrepaymentBetween(String value1, String value2) {
            addCriterion("prepayment between", value1, value2, "prepayment");
            return (Criteria) this;
        }

        public Criteria andPrepaymentNotBetween(String value1, String value2) {
            addCriterion("prepayment not between", value1, value2, "prepayment");
            return (Criteria) this;
        }

        public Criteria andPrepaymentExplainIsNull() {
            addCriterion("prepayment_explain is null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentExplainIsNotNull() {
            addCriterion("prepayment_explain is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentExplainEqualTo(String value) {
            addCriterion("prepayment_explain =", value, "prepaymentExplain");
            return (Criteria) this;
        }

        public Criteria andPrepaymentExplainNotEqualTo(String value) {
            addCriterion("prepayment_explain <>", value, "prepaymentExplain");
            return (Criteria) this;
        }

        public Criteria andPrepaymentExplainGreaterThan(String value) {
            addCriterion("prepayment_explain >", value, "prepaymentExplain");
            return (Criteria) this;
        }

        public Criteria andPrepaymentExplainGreaterThanOrEqualTo(String value) {
            addCriterion("prepayment_explain >=", value, "prepaymentExplain");
            return (Criteria) this;
        }

        public Criteria andPrepaymentExplainLessThan(String value) {
            addCriterion("prepayment_explain <", value, "prepaymentExplain");
            return (Criteria) this;
        }

        public Criteria andPrepaymentExplainLessThanOrEqualTo(String value) {
            addCriterion("prepayment_explain <=", value, "prepaymentExplain");
            return (Criteria) this;
        }

        public Criteria andPrepaymentExplainLike(String value) {
            addCriterion("prepayment_explain like", value, "prepaymentExplain");
            return (Criteria) this;
        }

        public Criteria andPrepaymentExplainNotLike(String value) {
            addCriterion("prepayment_explain not like", value, "prepaymentExplain");
            return (Criteria) this;
        }

        public Criteria andPrepaymentExplainIn(List<String> values) {
            addCriterion("prepayment_explain in", values, "prepaymentExplain");
            return (Criteria) this;
        }

        public Criteria andPrepaymentExplainNotIn(List<String> values) {
            addCriterion("prepayment_explain not in", values, "prepaymentExplain");
            return (Criteria) this;
        }

        public Criteria andPrepaymentExplainBetween(String value1, String value2) {
            addCriterion("prepayment_explain between", value1, value2, "prepaymentExplain");
            return (Criteria) this;
        }

        public Criteria andPrepaymentExplainNotBetween(String value1, String value2) {
            addCriterion("prepayment_explain not between", value1, value2, "prepaymentExplain");
            return (Criteria) this;
        }

        public Criteria andGracePeriodIsNull() {
            addCriterion("grace_period is null");
            return (Criteria) this;
        }

        public Criteria andGracePeriodIsNotNull() {
            addCriterion("grace_period is not null");
            return (Criteria) this;
        }

        public Criteria andGracePeriodEqualTo(String value) {
            addCriterion("grace_period =", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodNotEqualTo(String value) {
            addCriterion("grace_period <>", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodGreaterThan(String value) {
            addCriterion("grace_period >", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodGreaterThanOrEqualTo(String value) {
            addCriterion("grace_period >=", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodLessThan(String value) {
            addCriterion("grace_period <", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodLessThanOrEqualTo(String value) {
            addCriterion("grace_period <=", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodLike(String value) {
            addCriterion("grace_period like", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodNotLike(String value) {
            addCriterion("grace_period not like", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodIn(List<String> values) {
            addCriterion("grace_period in", values, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodNotIn(List<String> values) {
            addCriterion("grace_period not in", values, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodBetween(String value1, String value2) {
            addCriterion("grace_period between", value1, value2, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodNotBetween(String value1, String value2) {
            addCriterion("grace_period not between", value1, value2, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andDebtConstraintIsNull() {
            addCriterion("debt_constraint is null");
            return (Criteria) this;
        }

        public Criteria andDebtConstraintIsNotNull() {
            addCriterion("debt_constraint is not null");
            return (Criteria) this;
        }

        public Criteria andDebtConstraintEqualTo(String value) {
            addCriterion("debt_constraint =", value, "debtConstraint");
            return (Criteria) this;
        }

        public Criteria andDebtConstraintNotEqualTo(String value) {
            addCriterion("debt_constraint <>", value, "debtConstraint");
            return (Criteria) this;
        }

        public Criteria andDebtConstraintGreaterThan(String value) {
            addCriterion("debt_constraint >", value, "debtConstraint");
            return (Criteria) this;
        }

        public Criteria andDebtConstraintGreaterThanOrEqualTo(String value) {
            addCriterion("debt_constraint >=", value, "debtConstraint");
            return (Criteria) this;
        }

        public Criteria andDebtConstraintLessThan(String value) {
            addCriterion("debt_constraint <", value, "debtConstraint");
            return (Criteria) this;
        }

        public Criteria andDebtConstraintLessThanOrEqualTo(String value) {
            addCriterion("debt_constraint <=", value, "debtConstraint");
            return (Criteria) this;
        }

        public Criteria andDebtConstraintLike(String value) {
            addCriterion("debt_constraint like", value, "debtConstraint");
            return (Criteria) this;
        }

        public Criteria andDebtConstraintNotLike(String value) {
            addCriterion("debt_constraint not like", value, "debtConstraint");
            return (Criteria) this;
        }

        public Criteria andDebtConstraintIn(List<String> values) {
            addCriterion("debt_constraint in", values, "debtConstraint");
            return (Criteria) this;
        }

        public Criteria andDebtConstraintNotIn(List<String> values) {
            addCriterion("debt_constraint not in", values, "debtConstraint");
            return (Criteria) this;
        }

        public Criteria andDebtConstraintBetween(String value1, String value2) {
            addCriterion("debt_constraint between", value1, value2, "debtConstraint");
            return (Criteria) this;
        }

        public Criteria andDebtConstraintNotBetween(String value1, String value2) {
            addCriterion("debt_constraint not between", value1, value2, "debtConstraint");
            return (Criteria) this;
        }

        public Criteria andProjectManagerIsNull() {
            addCriterion("project_manager is null");
            return (Criteria) this;
        }

        public Criteria andProjectManagerIsNotNull() {
            addCriterion("project_manager is not null");
            return (Criteria) this;
        }

        public Criteria andProjectManagerEqualTo(String value) {
            addCriterion("project_manager =", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerNotEqualTo(String value) {
            addCriterion("project_manager <>", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGreaterThan(String value) {
            addCriterion("project_manager >", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGreaterThanOrEqualTo(String value) {
            addCriterion("project_manager >=", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerLessThan(String value) {
            addCriterion("project_manager <", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerLessThanOrEqualTo(String value) {
            addCriterion("project_manager <=", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerLike(String value) {
            addCriterion("project_manager like", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerNotLike(String value) {
            addCriterion("project_manager not like", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerIn(List<String> values) {
            addCriterion("project_manager in", values, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerNotIn(List<String> values) {
            addCriterion("project_manager not in", values, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerBetween(String value1, String value2) {
            addCriterion("project_manager between", value1, value2, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerNotBetween(String value1, String value2) {
            addCriterion("project_manager not between", value1, value2, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectAssistantIsNull() {
            addCriterion("project_assistant is null");
            return (Criteria) this;
        }

        public Criteria andProjectAssistantIsNotNull() {
            addCriterion("project_assistant is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAssistantEqualTo(String value) {
            addCriterion("project_assistant =", value, "projectAssistant");
            return (Criteria) this;
        }

        public Criteria andProjectAssistantNotEqualTo(String value) {
            addCriterion("project_assistant <>", value, "projectAssistant");
            return (Criteria) this;
        }

        public Criteria andProjectAssistantGreaterThan(String value) {
            addCriterion("project_assistant >", value, "projectAssistant");
            return (Criteria) this;
        }

        public Criteria andProjectAssistantGreaterThanOrEqualTo(String value) {
            addCriterion("project_assistant >=", value, "projectAssistant");
            return (Criteria) this;
        }

        public Criteria andProjectAssistantLessThan(String value) {
            addCriterion("project_assistant <", value, "projectAssistant");
            return (Criteria) this;
        }

        public Criteria andProjectAssistantLessThanOrEqualTo(String value) {
            addCriterion("project_assistant <=", value, "projectAssistant");
            return (Criteria) this;
        }

        public Criteria andProjectAssistantLike(String value) {
            addCriterion("project_assistant like", value, "projectAssistant");
            return (Criteria) this;
        }

        public Criteria andProjectAssistantNotLike(String value) {
            addCriterion("project_assistant not like", value, "projectAssistant");
            return (Criteria) this;
        }

        public Criteria andProjectAssistantIn(List<String> values) {
            addCriterion("project_assistant in", values, "projectAssistant");
            return (Criteria) this;
        }

        public Criteria andProjectAssistantNotIn(List<String> values) {
            addCriterion("project_assistant not in", values, "projectAssistant");
            return (Criteria) this;
        }

        public Criteria andProjectAssistantBetween(String value1, String value2) {
            addCriterion("project_assistant between", value1, value2, "projectAssistant");
            return (Criteria) this;
        }

        public Criteria andProjectAssistantNotBetween(String value1, String value2) {
            addCriterion("project_assistant not between", value1, value2, "projectAssistant");
            return (Criteria) this;
        }

        public Criteria andProductManagerIsNull() {
            addCriterion("product_manager is null");
            return (Criteria) this;
        }

        public Criteria andProductManagerIsNotNull() {
            addCriterion("product_manager is not null");
            return (Criteria) this;
        }

        public Criteria andProductManagerEqualTo(String value) {
            addCriterion("product_manager =", value, "productManager");
            return (Criteria) this;
        }

        public Criteria andProductManagerNotEqualTo(String value) {
            addCriterion("product_manager <>", value, "productManager");
            return (Criteria) this;
        }

        public Criteria andProductManagerGreaterThan(String value) {
            addCriterion("product_manager >", value, "productManager");
            return (Criteria) this;
        }

        public Criteria andProductManagerGreaterThanOrEqualTo(String value) {
            addCriterion("product_manager >=", value, "productManager");
            return (Criteria) this;
        }

        public Criteria andProductManagerLessThan(String value) {
            addCriterion("product_manager <", value, "productManager");
            return (Criteria) this;
        }

        public Criteria andProductManagerLessThanOrEqualTo(String value) {
            addCriterion("product_manager <=", value, "productManager");
            return (Criteria) this;
        }

        public Criteria andProductManagerLike(String value) {
            addCriterion("product_manager like", value, "productManager");
            return (Criteria) this;
        }

        public Criteria andProductManagerNotLike(String value) {
            addCriterion("product_manager not like", value, "productManager");
            return (Criteria) this;
        }

        public Criteria andProductManagerIn(List<String> values) {
            addCriterion("product_manager in", values, "productManager");
            return (Criteria) this;
        }

        public Criteria andProductManagerNotIn(List<String> values) {
            addCriterion("product_manager not in", values, "productManager");
            return (Criteria) this;
        }

        public Criteria andProductManagerBetween(String value1, String value2) {
            addCriterion("product_manager between", value1, value2, "productManager");
            return (Criteria) this;
        }

        public Criteria andProductManagerNotBetween(String value1, String value2) {
            addCriterion("product_manager not between", value1, value2, "productManager");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNull() {
            addCriterion("loan_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNotNull() {
            addCriterion("loan_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanIdEqualTo(String value) {
            addCriterion("loan_id =", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotEqualTo(String value) {
            addCriterion("loan_id <>", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThan(String value) {
            addCriterion("loan_id >", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThanOrEqualTo(String value) {
            addCriterion("loan_id >=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThan(String value) {
            addCriterion("loan_id <", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThanOrEqualTo(String value) {
            addCriterion("loan_id <=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLike(String value) {
            addCriterion("loan_id like", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotLike(String value) {
            addCriterion("loan_id not like", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIn(List<String> values) {
            addCriterion("loan_id in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotIn(List<String> values) {
            addCriterion("loan_id not in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdBetween(String value1, String value2) {
            addCriterion("loan_id between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotBetween(String value1, String value2) {
            addCriterion("loan_id not between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanTitleIsNull() {
            addCriterion("loan_title is null");
            return (Criteria) this;
        }

        public Criteria andLoanTitleIsNotNull() {
            addCriterion("loan_title is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTitleEqualTo(String value) {
            addCriterion("loan_title =", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleNotEqualTo(String value) {
            addCriterion("loan_title <>", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleGreaterThan(String value) {
            addCriterion("loan_title >", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleGreaterThanOrEqualTo(String value) {
            addCriterion("loan_title >=", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleLessThan(String value) {
            addCriterion("loan_title <", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleLessThanOrEqualTo(String value) {
            addCriterion("loan_title <=", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleLike(String value) {
            addCriterion("loan_title like", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleNotLike(String value) {
            addCriterion("loan_title not like", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleIn(List<String> values) {
            addCriterion("loan_title in", values, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleNotIn(List<String> values) {
            addCriterion("loan_title not in", values, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleBetween(String value1, String value2) {
            addCriterion("loan_title between", value1, value2, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleNotBetween(String value1, String value2) {
            addCriterion("loan_title not between", value1, value2, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andQlrUserIdIsNull() {
            addCriterion("qlr_user_id is null");
            return (Criteria) this;
        }

        public Criteria andQlrUserIdIsNotNull() {
            addCriterion("qlr_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andQlrUserIdEqualTo(String value) {
            addCriterion("qlr_user_id =", value, "qlrUserId");
            return (Criteria) this;
        }

        public Criteria andQlrUserIdNotEqualTo(String value) {
            addCriterion("qlr_user_id <>", value, "qlrUserId");
            return (Criteria) this;
        }

        public Criteria andQlrUserIdGreaterThan(String value) {
            addCriterion("qlr_user_id >", value, "qlrUserId");
            return (Criteria) this;
        }

        public Criteria andQlrUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("qlr_user_id >=", value, "qlrUserId");
            return (Criteria) this;
        }

        public Criteria andQlrUserIdLessThan(String value) {
            addCriterion("qlr_user_id <", value, "qlrUserId");
            return (Criteria) this;
        }

        public Criteria andQlrUserIdLessThanOrEqualTo(String value) {
            addCriterion("qlr_user_id <=", value, "qlrUserId");
            return (Criteria) this;
        }

        public Criteria andQlrUserIdLike(String value) {
            addCriterion("qlr_user_id like", value, "qlrUserId");
            return (Criteria) this;
        }

        public Criteria andQlrUserIdNotLike(String value) {
            addCriterion("qlr_user_id not like", value, "qlrUserId");
            return (Criteria) this;
        }

        public Criteria andQlrUserIdIn(List<String> values) {
            addCriterion("qlr_user_id in", values, "qlrUserId");
            return (Criteria) this;
        }

        public Criteria andQlrUserIdNotIn(List<String> values) {
            addCriterion("qlr_user_id not in", values, "qlrUserId");
            return (Criteria) this;
        }

        public Criteria andQlrUserIdBetween(String value1, String value2) {
            addCriterion("qlr_user_id between", value1, value2, "qlrUserId");
            return (Criteria) this;
        }

        public Criteria andQlrUserIdNotBetween(String value1, String value2) {
            addCriterion("qlr_user_id not between", value1, value2, "qlrUserId");
            return (Criteria) this;
        }

        public Criteria andContractUrlIsNull() {
            addCriterion("contract_url is null");
            return (Criteria) this;
        }

        public Criteria andContractUrlIsNotNull() {
            addCriterion("contract_url is not null");
            return (Criteria) this;
        }

        public Criteria andContractUrlEqualTo(String value) {
            addCriterion("contract_url =", value, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlNotEqualTo(String value) {
            addCriterion("contract_url <>", value, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlGreaterThan(String value) {
            addCriterion("contract_url >", value, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlGreaterThanOrEqualTo(String value) {
            addCriterion("contract_url >=", value, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlLessThan(String value) {
            addCriterion("contract_url <", value, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlLessThanOrEqualTo(String value) {
            addCriterion("contract_url <=", value, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlLike(String value) {
            addCriterion("contract_url like", value, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlNotLike(String value) {
            addCriterion("contract_url not like", value, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlIn(List<String> values) {
            addCriterion("contract_url in", values, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlNotIn(List<String> values) {
            addCriterion("contract_url not in", values, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlBetween(String value1, String value2) {
            addCriterion("contract_url between", value1, value2, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlNotBetween(String value1, String value2) {
            addCriterion("contract_url not between", value1, value2, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andQlrApplyStatusIsNull() {
            addCriterion("qlr_apply_status is null");
            return (Criteria) this;
        }

        public Criteria andQlrApplyStatusIsNotNull() {
            addCriterion("qlr_apply_status is not null");
            return (Criteria) this;
        }

        public Criteria andQlrApplyStatusEqualTo(String value) {
            addCriterion("qlr_apply_status =", value, "qlrApplyStatus");
            return (Criteria) this;
        }

        public Criteria andQlrApplyStatusNotEqualTo(String value) {
            addCriterion("qlr_apply_status <>", value, "qlrApplyStatus");
            return (Criteria) this;
        }

        public Criteria andQlrApplyStatusGreaterThan(String value) {
            addCriterion("qlr_apply_status >", value, "qlrApplyStatus");
            return (Criteria) this;
        }

        public Criteria andQlrApplyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("qlr_apply_status >=", value, "qlrApplyStatus");
            return (Criteria) this;
        }

        public Criteria andQlrApplyStatusLessThan(String value) {
            addCriterion("qlr_apply_status <", value, "qlrApplyStatus");
            return (Criteria) this;
        }

        public Criteria andQlrApplyStatusLessThanOrEqualTo(String value) {
            addCriterion("qlr_apply_status <=", value, "qlrApplyStatus");
            return (Criteria) this;
        }

        public Criteria andQlrApplyStatusLike(String value) {
            addCriterion("qlr_apply_status like", value, "qlrApplyStatus");
            return (Criteria) this;
        }

        public Criteria andQlrApplyStatusNotLike(String value) {
            addCriterion("qlr_apply_status not like", value, "qlrApplyStatus");
            return (Criteria) this;
        }

        public Criteria andQlrApplyStatusIn(List<String> values) {
            addCriterion("qlr_apply_status in", values, "qlrApplyStatus");
            return (Criteria) this;
        }

        public Criteria andQlrApplyStatusNotIn(List<String> values) {
            addCriterion("qlr_apply_status not in", values, "qlrApplyStatus");
            return (Criteria) this;
        }

        public Criteria andQlrApplyStatusBetween(String value1, String value2) {
            addCriterion("qlr_apply_status between", value1, value2, "qlrApplyStatus");
            return (Criteria) this;
        }

        public Criteria andQlrApplyStatusNotBetween(String value1, String value2) {
            addCriterion("qlr_apply_status not between", value1, value2, "qlrApplyStatus");
            return (Criteria) this;
        }

        public Criteria andChannelSideIdIsNull() {
            addCriterion("channel_side_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelSideIdIsNotNull() {
            addCriterion("channel_side_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelSideIdEqualTo(String value) {
            addCriterion("channel_side_id =", value, "channelSideId");
            return (Criteria) this;
        }

        public Criteria andChannelSideIdNotEqualTo(String value) {
            addCriterion("channel_side_id <>", value, "channelSideId");
            return (Criteria) this;
        }

        public Criteria andChannelSideIdGreaterThan(String value) {
            addCriterion("channel_side_id >", value, "channelSideId");
            return (Criteria) this;
        }

        public Criteria andChannelSideIdGreaterThanOrEqualTo(String value) {
            addCriterion("channel_side_id >=", value, "channelSideId");
            return (Criteria) this;
        }

        public Criteria andChannelSideIdLessThan(String value) {
            addCriterion("channel_side_id <", value, "channelSideId");
            return (Criteria) this;
        }

        public Criteria andChannelSideIdLessThanOrEqualTo(String value) {
            addCriterion("channel_side_id <=", value, "channelSideId");
            return (Criteria) this;
        }

        public Criteria andChannelSideIdLike(String value) {
            addCriterion("channel_side_id like", value, "channelSideId");
            return (Criteria) this;
        }

        public Criteria andChannelSideIdNotLike(String value) {
            addCriterion("channel_side_id not like", value, "channelSideId");
            return (Criteria) this;
        }

        public Criteria andChannelSideIdIn(List<String> values) {
            addCriterion("channel_side_id in", values, "channelSideId");
            return (Criteria) this;
        }

        public Criteria andChannelSideIdNotIn(List<String> values) {
            addCriterion("channel_side_id not in", values, "channelSideId");
            return (Criteria) this;
        }

        public Criteria andChannelSideIdBetween(String value1, String value2) {
            addCriterion("channel_side_id between", value1, value2, "channelSideId");
            return (Criteria) this;
        }

        public Criteria andChannelSideIdNotBetween(String value1, String value2) {
            addCriterion("channel_side_id not between", value1, value2, "channelSideId");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceIdIsNull() {
            addCriterion("channel_relevance_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceIdIsNotNull() {
            addCriterion("channel_relevance_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceIdEqualTo(String value) {
            addCriterion("channel_relevance_id =", value, "channelRelevanceId");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceIdNotEqualTo(String value) {
            addCriterion("channel_relevance_id <>", value, "channelRelevanceId");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceIdGreaterThan(String value) {
            addCriterion("channel_relevance_id >", value, "channelRelevanceId");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("channel_relevance_id >=", value, "channelRelevanceId");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceIdLessThan(String value) {
            addCriterion("channel_relevance_id <", value, "channelRelevanceId");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceIdLessThanOrEqualTo(String value) {
            addCriterion("channel_relevance_id <=", value, "channelRelevanceId");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceIdLike(String value) {
            addCriterion("channel_relevance_id like", value, "channelRelevanceId");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceIdNotLike(String value) {
            addCriterion("channel_relevance_id not like", value, "channelRelevanceId");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceIdIn(List<String> values) {
            addCriterion("channel_relevance_id in", values, "channelRelevanceId");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceIdNotIn(List<String> values) {
            addCriterion("channel_relevance_id not in", values, "channelRelevanceId");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceIdBetween(String value1, String value2) {
            addCriterion("channel_relevance_id between", value1, value2, "channelRelevanceId");
            return (Criteria) this;
        }

        public Criteria andChannelRelevanceIdNotBetween(String value1, String value2) {
            addCriterion("channel_relevance_id not between", value1, value2, "channelRelevanceId");
            return (Criteria) this;
        }

        public Criteria andLoanUseRemarkIsNull() {
            addCriterion("loan_use_remark is null");
            return (Criteria) this;
        }

        public Criteria andLoanUseRemarkIsNotNull() {
            addCriterion("loan_use_remark is not null");
            return (Criteria) this;
        }

        public Criteria andLoanUseRemarkEqualTo(String value) {
            addCriterion("loan_use_remark =", value, "loanUseRemark");
            return (Criteria) this;
        }

        public Criteria andLoanUseRemarkNotEqualTo(String value) {
            addCriterion("loan_use_remark <>", value, "loanUseRemark");
            return (Criteria) this;
        }

        public Criteria andLoanUseRemarkGreaterThan(String value) {
            addCriterion("loan_use_remark >", value, "loanUseRemark");
            return (Criteria) this;
        }

        public Criteria andLoanUseRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("loan_use_remark >=", value, "loanUseRemark");
            return (Criteria) this;
        }

        public Criteria andLoanUseRemarkLessThan(String value) {
            addCriterion("loan_use_remark <", value, "loanUseRemark");
            return (Criteria) this;
        }

        public Criteria andLoanUseRemarkLessThanOrEqualTo(String value) {
            addCriterion("loan_use_remark <=", value, "loanUseRemark");
            return (Criteria) this;
        }

        public Criteria andLoanUseRemarkLike(String value) {
            addCriterion("loan_use_remark like", value, "loanUseRemark");
            return (Criteria) this;
        }

        public Criteria andLoanUseRemarkNotLike(String value) {
            addCriterion("loan_use_remark not like", value, "loanUseRemark");
            return (Criteria) this;
        }

        public Criteria andLoanUseRemarkIn(List<String> values) {
            addCriterion("loan_use_remark in", values, "loanUseRemark");
            return (Criteria) this;
        }

        public Criteria andLoanUseRemarkNotIn(List<String> values) {
            addCriterion("loan_use_remark not in", values, "loanUseRemark");
            return (Criteria) this;
        }

        public Criteria andLoanUseRemarkBetween(String value1, String value2) {
            addCriterion("loan_use_remark between", value1, value2, "loanUseRemark");
            return (Criteria) this;
        }

        public Criteria andLoanUseRemarkNotBetween(String value1, String value2) {
            addCriterion("loan_use_remark not between", value1, value2, "loanUseRemark");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMeasureRemarkIsNull() {
            addCriterion("guarantee_measure_remark is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMeasureRemarkIsNotNull() {
            addCriterion("guarantee_measure_remark is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMeasureRemarkEqualTo(String value) {
            addCriterion("guarantee_measure_remark =", value, "guaranteeMeasureRemark");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMeasureRemarkNotEqualTo(String value) {
            addCriterion("guarantee_measure_remark <>", value, "guaranteeMeasureRemark");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMeasureRemarkGreaterThan(String value) {
            addCriterion("guarantee_measure_remark >", value, "guaranteeMeasureRemark");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMeasureRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("guarantee_measure_remark >=", value, "guaranteeMeasureRemark");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMeasureRemarkLessThan(String value) {
            addCriterion("guarantee_measure_remark <", value, "guaranteeMeasureRemark");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMeasureRemarkLessThanOrEqualTo(String value) {
            addCriterion("guarantee_measure_remark <=", value, "guaranteeMeasureRemark");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMeasureRemarkLike(String value) {
            addCriterion("guarantee_measure_remark like", value, "guaranteeMeasureRemark");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMeasureRemarkNotLike(String value) {
            addCriterion("guarantee_measure_remark not like", value, "guaranteeMeasureRemark");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMeasureRemarkIn(List<String> values) {
            addCriterion("guarantee_measure_remark in", values, "guaranteeMeasureRemark");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMeasureRemarkNotIn(List<String> values) {
            addCriterion("guarantee_measure_remark not in", values, "guaranteeMeasureRemark");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMeasureRemarkBetween(String value1, String value2) {
            addCriterion("guarantee_measure_remark between", value1, value2, "guaranteeMeasureRemark");
            return (Criteria) this;
        }

        public Criteria andGuaranteeMeasureRemarkNotBetween(String value1, String value2) {
            addCriterion("guarantee_measure_remark not between", value1, value2, "guaranteeMeasureRemark");
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