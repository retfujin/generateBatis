package com.ecps.seckill.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BizProjectDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BizProjectDetailExample() {
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

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
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

        public Criteria andFormerNameIsNull() {
            addCriterion("former_name is null");
            return (Criteria) this;
        }

        public Criteria andFormerNameIsNotNull() {
            addCriterion("former_name is not null");
            return (Criteria) this;
        }

        public Criteria andFormerNameEqualTo(String value) {
            addCriterion("former_name =", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameNotEqualTo(String value) {
            addCriterion("former_name <>", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameGreaterThan(String value) {
            addCriterion("former_name >", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameGreaterThanOrEqualTo(String value) {
            addCriterion("former_name >=", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameLessThan(String value) {
            addCriterion("former_name <", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameLessThanOrEqualTo(String value) {
            addCriterion("former_name <=", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameLike(String value) {
            addCriterion("former_name like", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameNotLike(String value) {
            addCriterion("former_name not like", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameIn(List<String> values) {
            addCriterion("former_name in", values, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameNotIn(List<String> values) {
            addCriterion("former_name not in", values, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameBetween(String value1, String value2) {
            addCriterion("former_name between", value1, value2, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameNotBetween(String value1, String value2) {
            addCriterion("former_name not between", value1, value2, "formerName");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberIsNull() {
            addCriterion("certificate_number is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberIsNotNull() {
            addCriterion("certificate_number is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberEqualTo(String value) {
            addCriterion("certificate_number =", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotEqualTo(String value) {
            addCriterion("certificate_number <>", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberGreaterThan(String value) {
            addCriterion("certificate_number >", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_number >=", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberLessThan(String value) {
            addCriterion("certificate_number <", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberLessThanOrEqualTo(String value) {
            addCriterion("certificate_number <=", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberLike(String value) {
            addCriterion("certificate_number like", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotLike(String value) {
            addCriterion("certificate_number not like", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberIn(List<String> values) {
            addCriterion("certificate_number in", values, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotIn(List<String> values) {
            addCriterion("certificate_number not in", values, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberBetween(String value1, String value2) {
            addCriterion("certificate_number between", value1, value2, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotBetween(String value1, String value2) {
            addCriterion("certificate_number not between", value1, value2, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("marital_status is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(String value) {
            addCriterion("marital_status =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(String value) {
            addCriterion("marital_status <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(String value) {
            addCriterion("marital_status >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("marital_status >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(String value) {
            addCriterion("marital_status <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(String value) {
            addCriterion("marital_status <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLike(String value) {
            addCriterion("marital_status like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotLike(String value) {
            addCriterion("marital_status not like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<String> values) {
            addCriterion("marital_status in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<String> values) {
            addCriterion("marital_status not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(String value1, String value2) {
            addCriterion("marital_status between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(String value1, String value2) {
            addCriterion("marital_status not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andHasChildrenIsNull() {
            addCriterion("has_children is null");
            return (Criteria) this;
        }

        public Criteria andHasChildrenIsNotNull() {
            addCriterion("has_children is not null");
            return (Criteria) this;
        }

        public Criteria andHasChildrenEqualTo(String value) {
            addCriterion("has_children =", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenNotEqualTo(String value) {
            addCriterion("has_children <>", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenGreaterThan(String value) {
            addCriterion("has_children >", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenGreaterThanOrEqualTo(String value) {
            addCriterion("has_children >=", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenLessThan(String value) {
            addCriterion("has_children <", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenLessThanOrEqualTo(String value) {
            addCriterion("has_children <=", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenLike(String value) {
            addCriterion("has_children like", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenNotLike(String value) {
            addCriterion("has_children not like", value, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenIn(List<String> values) {
            addCriterion("has_children in", values, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenNotIn(List<String> values) {
            addCriterion("has_children not in", values, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenBetween(String value1, String value2) {
            addCriterion("has_children between", value1, value2, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andHasChildrenNotBetween(String value1, String value2) {
            addCriterion("has_children not between", value1, value2, "hasChildren");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumberIsNull() {
            addCriterion("mobile_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumberIsNotNull() {
            addCriterion("mobile_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumberEqualTo(String value) {
            addCriterion("mobile_phone_number =", value, "mobilePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumberNotEqualTo(String value) {
            addCriterion("mobile_phone_number <>", value, "mobilePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumberGreaterThan(String value) {
            addCriterion("mobile_phone_number >", value, "mobilePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_phone_number >=", value, "mobilePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumberLessThan(String value) {
            addCriterion("mobile_phone_number <", value, "mobilePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("mobile_phone_number <=", value, "mobilePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumberLike(String value) {
            addCriterion("mobile_phone_number like", value, "mobilePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumberNotLike(String value) {
            addCriterion("mobile_phone_number not like", value, "mobilePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumberIn(List<String> values) {
            addCriterion("mobile_phone_number in", values, "mobilePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumberNotIn(List<String> values) {
            addCriterion("mobile_phone_number not in", values, "mobilePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumberBetween(String value1, String value2) {
            addCriterion("mobile_phone_number between", value1, value2, "mobilePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumberNotBetween(String value1, String value2) {
            addCriterion("mobile_phone_number not between", value1, value2, "mobilePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatDetailIsNull() {
            addCriterion("census_register_seat_detail is null");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatDetailIsNotNull() {
            addCriterion("census_register_seat_detail is not null");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatDetailEqualTo(String value) {
            addCriterion("census_register_seat_detail =", value, "censusRegisterSeatDetail");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatDetailNotEqualTo(String value) {
            addCriterion("census_register_seat_detail <>", value, "censusRegisterSeatDetail");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatDetailGreaterThan(String value) {
            addCriterion("census_register_seat_detail >", value, "censusRegisterSeatDetail");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatDetailGreaterThanOrEqualTo(String value) {
            addCriterion("census_register_seat_detail >=", value, "censusRegisterSeatDetail");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatDetailLessThan(String value) {
            addCriterion("census_register_seat_detail <", value, "censusRegisterSeatDetail");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatDetailLessThanOrEqualTo(String value) {
            addCriterion("census_register_seat_detail <=", value, "censusRegisterSeatDetail");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatDetailLike(String value) {
            addCriterion("census_register_seat_detail like", value, "censusRegisterSeatDetail");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatDetailNotLike(String value) {
            addCriterion("census_register_seat_detail not like", value, "censusRegisterSeatDetail");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatDetailIn(List<String> values) {
            addCriterion("census_register_seat_detail in", values, "censusRegisterSeatDetail");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatDetailNotIn(List<String> values) {
            addCriterion("census_register_seat_detail not in", values, "censusRegisterSeatDetail");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatDetailBetween(String value1, String value2) {
            addCriterion("census_register_seat_detail between", value1, value2, "censusRegisterSeatDetail");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatDetailNotBetween(String value1, String value2) {
            addCriterion("census_register_seat_detail not between", value1, value2, "censusRegisterSeatDetail");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatCountiesIsNull() {
            addCriterion("census_register_seat_counties is null");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatCountiesIsNotNull() {
            addCriterion("census_register_seat_counties is not null");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatCountiesEqualTo(String value) {
            addCriterion("census_register_seat_counties =", value, "censusRegisterSeatCounties");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatCountiesNotEqualTo(String value) {
            addCriterion("census_register_seat_counties <>", value, "censusRegisterSeatCounties");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatCountiesGreaterThan(String value) {
            addCriterion("census_register_seat_counties >", value, "censusRegisterSeatCounties");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatCountiesGreaterThanOrEqualTo(String value) {
            addCriterion("census_register_seat_counties >=", value, "censusRegisterSeatCounties");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatCountiesLessThan(String value) {
            addCriterion("census_register_seat_counties <", value, "censusRegisterSeatCounties");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatCountiesLessThanOrEqualTo(String value) {
            addCriterion("census_register_seat_counties <=", value, "censusRegisterSeatCounties");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatCountiesLike(String value) {
            addCriterion("census_register_seat_counties like", value, "censusRegisterSeatCounties");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatCountiesNotLike(String value) {
            addCriterion("census_register_seat_counties not like", value, "censusRegisterSeatCounties");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatCountiesIn(List<String> values) {
            addCriterion("census_register_seat_counties in", values, "censusRegisterSeatCounties");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatCountiesNotIn(List<String> values) {
            addCriterion("census_register_seat_counties not in", values, "censusRegisterSeatCounties");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatCountiesBetween(String value1, String value2) {
            addCriterion("census_register_seat_counties between", value1, value2, "censusRegisterSeatCounties");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatCountiesNotBetween(String value1, String value2) {
            addCriterion("census_register_seat_counties not between", value1, value2, "censusRegisterSeatCounties");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterTypeIsNull() {
            addCriterion("census_register_type is null");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterTypeIsNotNull() {
            addCriterion("census_register_type is not null");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterTypeEqualTo(String value) {
            addCriterion("census_register_type =", value, "censusRegisterType");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterTypeNotEqualTo(String value) {
            addCriterion("census_register_type <>", value, "censusRegisterType");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterTypeGreaterThan(String value) {
            addCriterion("census_register_type >", value, "censusRegisterType");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("census_register_type >=", value, "censusRegisterType");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterTypeLessThan(String value) {
            addCriterion("census_register_type <", value, "censusRegisterType");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterTypeLessThanOrEqualTo(String value) {
            addCriterion("census_register_type <=", value, "censusRegisterType");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterTypeLike(String value) {
            addCriterion("census_register_type like", value, "censusRegisterType");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterTypeNotLike(String value) {
            addCriterion("census_register_type not like", value, "censusRegisterType");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterTypeIn(List<String> values) {
            addCriterion("census_register_type in", values, "censusRegisterType");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterTypeNotIn(List<String> values) {
            addCriterion("census_register_type not in", values, "censusRegisterType");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterTypeBetween(String value1, String value2) {
            addCriterion("census_register_type between", value1, value2, "censusRegisterType");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterTypeNotBetween(String value1, String value2) {
            addCriterion("census_register_type not between", value1, value2, "censusRegisterType");
            return (Criteria) this;
        }

        public Criteria andFtelephoneIsNull() {
            addCriterion("ftelephone is null");
            return (Criteria) this;
        }

        public Criteria andFtelephoneIsNotNull() {
            addCriterion("ftelephone is not null");
            return (Criteria) this;
        }

        public Criteria andFtelephoneEqualTo(String value) {
            addCriterion("ftelephone =", value, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneNotEqualTo(String value) {
            addCriterion("ftelephone <>", value, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneGreaterThan(String value) {
            addCriterion("ftelephone >", value, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("ftelephone >=", value, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneLessThan(String value) {
            addCriterion("ftelephone <", value, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneLessThanOrEqualTo(String value) {
            addCriterion("ftelephone <=", value, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneLike(String value) {
            addCriterion("ftelephone like", value, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneNotLike(String value) {
            addCriterion("ftelephone not like", value, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneIn(List<String> values) {
            addCriterion("ftelephone in", values, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneNotIn(List<String> values) {
            addCriterion("ftelephone not in", values, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneBetween(String value1, String value2) {
            addCriterion("ftelephone between", value1, value2, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andFtelephoneNotBetween(String value1, String value2) {
            addCriterion("ftelephone not between", value1, value2, "ftelephone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationIsNull() {
            addCriterion("other_contact_information is null");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationIsNotNull() {
            addCriterion("other_contact_information is not null");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationEqualTo(String value) {
            addCriterion("other_contact_information =", value, "otherContactInformation");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationNotEqualTo(String value) {
            addCriterion("other_contact_information <>", value, "otherContactInformation");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationGreaterThan(String value) {
            addCriterion("other_contact_information >", value, "otherContactInformation");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationGreaterThanOrEqualTo(String value) {
            addCriterion("other_contact_information >=", value, "otherContactInformation");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationLessThan(String value) {
            addCriterion("other_contact_information <", value, "otherContactInformation");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationLessThanOrEqualTo(String value) {
            addCriterion("other_contact_information <=", value, "otherContactInformation");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationLike(String value) {
            addCriterion("other_contact_information like", value, "otherContactInformation");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationNotLike(String value) {
            addCriterion("other_contact_information not like", value, "otherContactInformation");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationIn(List<String> values) {
            addCriterion("other_contact_information in", values, "otherContactInformation");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationNotIn(List<String> values) {
            addCriterion("other_contact_information not in", values, "otherContactInformation");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationBetween(String value1, String value2) {
            addCriterion("other_contact_information between", value1, value2, "otherContactInformation");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationNotBetween(String value1, String value2) {
            addCriterion("other_contact_information not between", value1, value2, "otherContactInformation");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationValueIsNull() {
            addCriterion("other_contact_information_value is null");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationValueIsNotNull() {
            addCriterion("other_contact_information_value is not null");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationValueEqualTo(String value) {
            addCriterion("other_contact_information_value =", value, "otherContactInformationValue");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationValueNotEqualTo(String value) {
            addCriterion("other_contact_information_value <>", value, "otherContactInformationValue");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationValueGreaterThan(String value) {
            addCriterion("other_contact_information_value >", value, "otherContactInformationValue");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationValueGreaterThanOrEqualTo(String value) {
            addCriterion("other_contact_information_value >=", value, "otherContactInformationValue");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationValueLessThan(String value) {
            addCriterion("other_contact_information_value <", value, "otherContactInformationValue");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationValueLessThanOrEqualTo(String value) {
            addCriterion("other_contact_information_value <=", value, "otherContactInformationValue");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationValueLike(String value) {
            addCriterion("other_contact_information_value like", value, "otherContactInformationValue");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationValueNotLike(String value) {
            addCriterion("other_contact_information_value not like", value, "otherContactInformationValue");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationValueIn(List<String> values) {
            addCriterion("other_contact_information_value in", values, "otherContactInformationValue");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationValueNotIn(List<String> values) {
            addCriterion("other_contact_information_value not in", values, "otherContactInformationValue");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationValueBetween(String value1, String value2) {
            addCriterion("other_contact_information_value between", value1, value2, "otherContactInformationValue");
            return (Criteria) this;
        }

        public Criteria andOtherContactInformationValueNotBetween(String value1, String value2) {
            addCriterion("other_contact_information_value not between", value1, value2, "otherContactInformationValue");
            return (Criteria) this;
        }

        public Criteria andCurrentlyCheckinTimeIsNull() {
            addCriterion("currently_checkin_time is null");
            return (Criteria) this;
        }

        public Criteria andCurrentlyCheckinTimeIsNotNull() {
            addCriterion("currently_checkin_time is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentlyCheckinTimeEqualTo(Date value) {
            addCriterion("currently_checkin_time =", value, "currentlyCheckinTime");
            return (Criteria) this;
        }

        public Criteria andCurrentlyCheckinTimeNotEqualTo(Date value) {
            addCriterion("currently_checkin_time <>", value, "currentlyCheckinTime");
            return (Criteria) this;
        }

        public Criteria andCurrentlyCheckinTimeGreaterThan(Date value) {
            addCriterion("currently_checkin_time >", value, "currentlyCheckinTime");
            return (Criteria) this;
        }

        public Criteria andCurrentlyCheckinTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("currently_checkin_time >=", value, "currentlyCheckinTime");
            return (Criteria) this;
        }

        public Criteria andCurrentlyCheckinTimeLessThan(Date value) {
            addCriterion("currently_checkin_time <", value, "currentlyCheckinTime");
            return (Criteria) this;
        }

        public Criteria andCurrentlyCheckinTimeLessThanOrEqualTo(Date value) {
            addCriterion("currently_checkin_time <=", value, "currentlyCheckinTime");
            return (Criteria) this;
        }

        public Criteria andCurrentlyCheckinTimeIn(List<Date> values) {
            addCriterion("currently_checkin_time in", values, "currentlyCheckinTime");
            return (Criteria) this;
        }

        public Criteria andCurrentlyCheckinTimeNotIn(List<Date> values) {
            addCriterion("currently_checkin_time not in", values, "currentlyCheckinTime");
            return (Criteria) this;
        }

        public Criteria andCurrentlyCheckinTimeBetween(Date value1, Date value2) {
            addCriterion("currently_checkin_time between", value1, value2, "currentlyCheckinTime");
            return (Criteria) this;
        }

        public Criteria andCurrentlyCheckinTimeNotBetween(Date value1, Date value2) {
            addCriterion("currently_checkin_time not between", value1, value2, "currentlyCheckinTime");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceCountiesIsNull() {
            addCriterion("correspondence_counties is null");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceCountiesIsNotNull() {
            addCriterion("correspondence_counties is not null");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceCountiesEqualTo(String value) {
            addCriterion("correspondence_counties =", value, "correspondenceCounties");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceCountiesNotEqualTo(String value) {
            addCriterion("correspondence_counties <>", value, "correspondenceCounties");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceCountiesGreaterThan(String value) {
            addCriterion("correspondence_counties >", value, "correspondenceCounties");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceCountiesGreaterThanOrEqualTo(String value) {
            addCriterion("correspondence_counties >=", value, "correspondenceCounties");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceCountiesLessThan(String value) {
            addCriterion("correspondence_counties <", value, "correspondenceCounties");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceCountiesLessThanOrEqualTo(String value) {
            addCriterion("correspondence_counties <=", value, "correspondenceCounties");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceCountiesLike(String value) {
            addCriterion("correspondence_counties like", value, "correspondenceCounties");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceCountiesNotLike(String value) {
            addCriterion("correspondence_counties not like", value, "correspondenceCounties");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceCountiesIn(List<String> values) {
            addCriterion("correspondence_counties in", values, "correspondenceCounties");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceCountiesNotIn(List<String> values) {
            addCriterion("correspondence_counties not in", values, "correspondenceCounties");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceCountiesBetween(String value1, String value2) {
            addCriterion("correspondence_counties between", value1, value2, "correspondenceCounties");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceCountiesNotBetween(String value1, String value2) {
            addCriterion("correspondence_counties not between", value1, value2, "correspondenceCounties");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceDetailAddressIsNull() {
            addCriterion("correspondence_detail_address is null");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceDetailAddressIsNotNull() {
            addCriterion("correspondence_detail_address is not null");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceDetailAddressEqualTo(String value) {
            addCriterion("correspondence_detail_address =", value, "correspondenceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceDetailAddressNotEqualTo(String value) {
            addCriterion("correspondence_detail_address <>", value, "correspondenceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceDetailAddressGreaterThan(String value) {
            addCriterion("correspondence_detail_address >", value, "correspondenceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("correspondence_detail_address >=", value, "correspondenceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceDetailAddressLessThan(String value) {
            addCriterion("correspondence_detail_address <", value, "correspondenceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("correspondence_detail_address <=", value, "correspondenceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceDetailAddressLike(String value) {
            addCriterion("correspondence_detail_address like", value, "correspondenceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceDetailAddressNotLike(String value) {
            addCriterion("correspondence_detail_address not like", value, "correspondenceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceDetailAddressIn(List<String> values) {
            addCriterion("correspondence_detail_address in", values, "correspondenceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceDetailAddressNotIn(List<String> values) {
            addCriterion("correspondence_detail_address not in", values, "correspondenceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceDetailAddressBetween(String value1, String value2) {
            addCriterion("correspondence_detail_address between", value1, value2, "correspondenceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCorrespondenceDetailAddressNotBetween(String value1, String value2) {
            addCriterion("correspondence_detail_address not between", value1, value2, "correspondenceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCommunicationsCodeIsNull() {
            addCriterion("communications_code is null");
            return (Criteria) this;
        }

        public Criteria andCommunicationsCodeIsNotNull() {
            addCriterion("communications_code is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicationsCodeEqualTo(String value) {
            addCriterion("communications_code =", value, "communicationsCode");
            return (Criteria) this;
        }

        public Criteria andCommunicationsCodeNotEqualTo(String value) {
            addCriterion("communications_code <>", value, "communicationsCode");
            return (Criteria) this;
        }

        public Criteria andCommunicationsCodeGreaterThan(String value) {
            addCriterion("communications_code >", value, "communicationsCode");
            return (Criteria) this;
        }

        public Criteria andCommunicationsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("communications_code >=", value, "communicationsCode");
            return (Criteria) this;
        }

        public Criteria andCommunicationsCodeLessThan(String value) {
            addCriterion("communications_code <", value, "communicationsCode");
            return (Criteria) this;
        }

        public Criteria andCommunicationsCodeLessThanOrEqualTo(String value) {
            addCriterion("communications_code <=", value, "communicationsCode");
            return (Criteria) this;
        }

        public Criteria andCommunicationsCodeLike(String value) {
            addCriterion("communications_code like", value, "communicationsCode");
            return (Criteria) this;
        }

        public Criteria andCommunicationsCodeNotLike(String value) {
            addCriterion("communications_code not like", value, "communicationsCode");
            return (Criteria) this;
        }

        public Criteria andCommunicationsCodeIn(List<String> values) {
            addCriterion("communications_code in", values, "communicationsCode");
            return (Criteria) this;
        }

        public Criteria andCommunicationsCodeNotIn(List<String> values) {
            addCriterion("communications_code not in", values, "communicationsCode");
            return (Criteria) this;
        }

        public Criteria andCommunicationsCodeBetween(String value1, String value2) {
            addCriterion("communications_code between", value1, value2, "communicationsCode");
            return (Criteria) this;
        }

        public Criteria andCommunicationsCodeNotBetween(String value1, String value2) {
            addCriterion("communications_code not between", value1, value2, "communicationsCode");
            return (Criteria) this;
        }

        public Criteria andWorkUnitsIsNull() {
            addCriterion("work_units is null");
            return (Criteria) this;
        }

        public Criteria andWorkUnitsIsNotNull() {
            addCriterion("work_units is not null");
            return (Criteria) this;
        }

        public Criteria andWorkUnitsEqualTo(String value) {
            addCriterion("work_units =", value, "workUnits");
            return (Criteria) this;
        }

        public Criteria andWorkUnitsNotEqualTo(String value) {
            addCriterion("work_units <>", value, "workUnits");
            return (Criteria) this;
        }

        public Criteria andWorkUnitsGreaterThan(String value) {
            addCriterion("work_units >", value, "workUnits");
            return (Criteria) this;
        }

        public Criteria andWorkUnitsGreaterThanOrEqualTo(String value) {
            addCriterion("work_units >=", value, "workUnits");
            return (Criteria) this;
        }

        public Criteria andWorkUnitsLessThan(String value) {
            addCriterion("work_units <", value, "workUnits");
            return (Criteria) this;
        }

        public Criteria andWorkUnitsLessThanOrEqualTo(String value) {
            addCriterion("work_units <=", value, "workUnits");
            return (Criteria) this;
        }

        public Criteria andWorkUnitsLike(String value) {
            addCriterion("work_units like", value, "workUnits");
            return (Criteria) this;
        }

        public Criteria andWorkUnitsNotLike(String value) {
            addCriterion("work_units not like", value, "workUnits");
            return (Criteria) this;
        }

        public Criteria andWorkUnitsIn(List<String> values) {
            addCriterion("work_units in", values, "workUnits");
            return (Criteria) this;
        }

        public Criteria andWorkUnitsNotIn(List<String> values) {
            addCriterion("work_units not in", values, "workUnits");
            return (Criteria) this;
        }

        public Criteria andWorkUnitsBetween(String value1, String value2) {
            addCriterion("work_units between", value1, value2, "workUnits");
            return (Criteria) this;
        }

        public Criteria andWorkUnitsNotBetween(String value1, String value2) {
            addCriterion("work_units not between", value1, value2, "workUnits");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIsNull() {
            addCriterion("unit_type is null");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIsNotNull() {
            addCriterion("unit_type is not null");
            return (Criteria) this;
        }

        public Criteria andUnitTypeEqualTo(String value) {
            addCriterion("unit_type =", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotEqualTo(String value) {
            addCriterion("unit_type <>", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThan(String value) {
            addCriterion("unit_type >", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("unit_type >=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThan(String value) {
            addCriterion("unit_type <", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThanOrEqualTo(String value) {
            addCriterion("unit_type <=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLike(String value) {
            addCriterion("unit_type like", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotLike(String value) {
            addCriterion("unit_type not like", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIn(List<String> values) {
            addCriterion("unit_type in", values, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotIn(List<String> values) {
            addCriterion("unit_type not in", values, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeBetween(String value1, String value2) {
            addCriterion("unit_type between", value1, value2, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotBetween(String value1, String value2) {
            addCriterion("unit_type not between", value1, value2, "unitType");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypesIsNull() {
            addCriterion("professional_types is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypesIsNotNull() {
            addCriterion("professional_types is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypesEqualTo(String value) {
            addCriterion("professional_types =", value, "professionalTypes");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypesNotEqualTo(String value) {
            addCriterion("professional_types <>", value, "professionalTypes");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypesGreaterThan(String value) {
            addCriterion("professional_types >", value, "professionalTypes");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypesGreaterThanOrEqualTo(String value) {
            addCriterion("professional_types >=", value, "professionalTypes");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypesLessThan(String value) {
            addCriterion("professional_types <", value, "professionalTypes");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypesLessThanOrEqualTo(String value) {
            addCriterion("professional_types <=", value, "professionalTypes");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypesLike(String value) {
            addCriterion("professional_types like", value, "professionalTypes");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypesNotLike(String value) {
            addCriterion("professional_types not like", value, "professionalTypes");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypesIn(List<String> values) {
            addCriterion("professional_types in", values, "professionalTypes");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypesNotIn(List<String> values) {
            addCriterion("professional_types not in", values, "professionalTypes");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypesBetween(String value1, String value2) {
            addCriterion("professional_types between", value1, value2, "professionalTypes");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypesNotBetween(String value1, String value2) {
            addCriterion("professional_types not between", value1, value2, "professionalTypes");
            return (Criteria) this;
        }

        public Criteria andUnitCountiesIsNull() {
            addCriterion("unit_counties is null");
            return (Criteria) this;
        }

        public Criteria andUnitCountiesIsNotNull() {
            addCriterion("unit_counties is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCountiesEqualTo(String value) {
            addCriterion("unit_counties =", value, "unitCounties");
            return (Criteria) this;
        }

        public Criteria andUnitCountiesNotEqualTo(String value) {
            addCriterion("unit_counties <>", value, "unitCounties");
            return (Criteria) this;
        }

        public Criteria andUnitCountiesGreaterThan(String value) {
            addCriterion("unit_counties >", value, "unitCounties");
            return (Criteria) this;
        }

        public Criteria andUnitCountiesGreaterThanOrEqualTo(String value) {
            addCriterion("unit_counties >=", value, "unitCounties");
            return (Criteria) this;
        }

        public Criteria andUnitCountiesLessThan(String value) {
            addCriterion("unit_counties <", value, "unitCounties");
            return (Criteria) this;
        }

        public Criteria andUnitCountiesLessThanOrEqualTo(String value) {
            addCriterion("unit_counties <=", value, "unitCounties");
            return (Criteria) this;
        }

        public Criteria andUnitCountiesLike(String value) {
            addCriterion("unit_counties like", value, "unitCounties");
            return (Criteria) this;
        }

        public Criteria andUnitCountiesNotLike(String value) {
            addCriterion("unit_counties not like", value, "unitCounties");
            return (Criteria) this;
        }

        public Criteria andUnitCountiesIn(List<String> values) {
            addCriterion("unit_counties in", values, "unitCounties");
            return (Criteria) this;
        }

        public Criteria andUnitCountiesNotIn(List<String> values) {
            addCriterion("unit_counties not in", values, "unitCounties");
            return (Criteria) this;
        }

        public Criteria andUnitCountiesBetween(String value1, String value2) {
            addCriterion("unit_counties between", value1, value2, "unitCounties");
            return (Criteria) this;
        }

        public Criteria andUnitCountiesNotBetween(String value1, String value2) {
            addCriterion("unit_counties not between", value1, value2, "unitCounties");
            return (Criteria) this;
        }

        public Criteria andUnitAddressIsNull() {
            addCriterion("unit_address is null");
            return (Criteria) this;
        }

        public Criteria andUnitAddressIsNotNull() {
            addCriterion("unit_address is not null");
            return (Criteria) this;
        }

        public Criteria andUnitAddressEqualTo(String value) {
            addCriterion("unit_address =", value, "unitAddress");
            return (Criteria) this;
        }

        public Criteria andUnitAddressNotEqualTo(String value) {
            addCriterion("unit_address <>", value, "unitAddress");
            return (Criteria) this;
        }

        public Criteria andUnitAddressGreaterThan(String value) {
            addCriterion("unit_address >", value, "unitAddress");
            return (Criteria) this;
        }

        public Criteria andUnitAddressGreaterThanOrEqualTo(String value) {
            addCriterion("unit_address >=", value, "unitAddress");
            return (Criteria) this;
        }

        public Criteria andUnitAddressLessThan(String value) {
            addCriterion("unit_address <", value, "unitAddress");
            return (Criteria) this;
        }

        public Criteria andUnitAddressLessThanOrEqualTo(String value) {
            addCriterion("unit_address <=", value, "unitAddress");
            return (Criteria) this;
        }

        public Criteria andUnitAddressLike(String value) {
            addCriterion("unit_address like", value, "unitAddress");
            return (Criteria) this;
        }

        public Criteria andUnitAddressNotLike(String value) {
            addCriterion("unit_address not like", value, "unitAddress");
            return (Criteria) this;
        }

        public Criteria andUnitAddressIn(List<String> values) {
            addCriterion("unit_address in", values, "unitAddress");
            return (Criteria) this;
        }

        public Criteria andUnitAddressNotIn(List<String> values) {
            addCriterion("unit_address not in", values, "unitAddress");
            return (Criteria) this;
        }

        public Criteria andUnitAddressBetween(String value1, String value2) {
            addCriterion("unit_address between", value1, value2, "unitAddress");
            return (Criteria) this;
        }

        public Criteria andUnitAddressNotBetween(String value1, String value2) {
            addCriterion("unit_address not between", value1, value2, "unitAddress");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneIsNull() {
            addCriterion("unit_phone is null");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneIsNotNull() {
            addCriterion("unit_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneEqualTo(String value) {
            addCriterion("unit_phone =", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneNotEqualTo(String value) {
            addCriterion("unit_phone <>", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneGreaterThan(String value) {
            addCriterion("unit_phone >", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("unit_phone >=", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneLessThan(String value) {
            addCriterion("unit_phone <", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneLessThanOrEqualTo(String value) {
            addCriterion("unit_phone <=", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneLike(String value) {
            addCriterion("unit_phone like", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneNotLike(String value) {
            addCriterion("unit_phone not like", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneIn(List<String> values) {
            addCriterion("unit_phone in", values, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneNotIn(List<String> values) {
            addCriterion("unit_phone not in", values, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneBetween(String value1, String value2) {
            addCriterion("unit_phone between", value1, value2, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneNotBetween(String value1, String value2) {
            addCriterion("unit_phone not between", value1, value2, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNull() {
            addCriterion("in_time is null");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNotNull() {
            addCriterion("in_time is not null");
            return (Criteria) this;
        }

        public Criteria andInTimeEqualTo(Date value) {
            addCriterion("in_time =", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotEqualTo(Date value) {
            addCriterion("in_time <>", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThan(Date value) {
            addCriterion("in_time >", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("in_time >=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThan(Date value) {
            addCriterion("in_time <", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThanOrEqualTo(Date value) {
            addCriterion("in_time <=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeIn(List<Date> values) {
            addCriterion("in_time in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotIn(List<Date> values) {
            addCriterion("in_time not in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeBetween(Date value1, Date value2) {
            addCriterion("in_time between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotBetween(Date value1, Date value2) {
            addCriterion("in_time not between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andWorkTitleIsNull() {
            addCriterion("work_title is null");
            return (Criteria) this;
        }

        public Criteria andWorkTitleIsNotNull() {
            addCriterion("work_title is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTitleEqualTo(String value) {
            addCriterion("work_title =", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleNotEqualTo(String value) {
            addCriterion("work_title <>", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleGreaterThan(String value) {
            addCriterion("work_title >", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleGreaterThanOrEqualTo(String value) {
            addCriterion("work_title >=", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleLessThan(String value) {
            addCriterion("work_title <", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleLessThanOrEqualTo(String value) {
            addCriterion("work_title <=", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleLike(String value) {
            addCriterion("work_title like", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleNotLike(String value) {
            addCriterion("work_title not like", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleIn(List<String> values) {
            addCriterion("work_title in", values, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleNotIn(List<String> values) {
            addCriterion("work_title not in", values, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleBetween(String value1, String value2) {
            addCriterion("work_title between", value1, value2, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleNotBetween(String value1, String value2) {
            addCriterion("work_title not between", value1, value2, "workTitle");
            return (Criteria) this;
        }

        public Criteria andHighestRecordFormalIsNull() {
            addCriterion("highest_record_formal is null");
            return (Criteria) this;
        }

        public Criteria andHighestRecordFormalIsNotNull() {
            addCriterion("highest_record_formal is not null");
            return (Criteria) this;
        }

        public Criteria andHighestRecordFormalEqualTo(String value) {
            addCriterion("highest_record_formal =", value, "highestRecordFormal");
            return (Criteria) this;
        }

        public Criteria andHighestRecordFormalNotEqualTo(String value) {
            addCriterion("highest_record_formal <>", value, "highestRecordFormal");
            return (Criteria) this;
        }

        public Criteria andHighestRecordFormalGreaterThan(String value) {
            addCriterion("highest_record_formal >", value, "highestRecordFormal");
            return (Criteria) this;
        }

        public Criteria andHighestRecordFormalGreaterThanOrEqualTo(String value) {
            addCriterion("highest_record_formal >=", value, "highestRecordFormal");
            return (Criteria) this;
        }

        public Criteria andHighestRecordFormalLessThan(String value) {
            addCriterion("highest_record_formal <", value, "highestRecordFormal");
            return (Criteria) this;
        }

        public Criteria andHighestRecordFormalLessThanOrEqualTo(String value) {
            addCriterion("highest_record_formal <=", value, "highestRecordFormal");
            return (Criteria) this;
        }

        public Criteria andHighestRecordFormalLike(String value) {
            addCriterion("highest_record_formal like", value, "highestRecordFormal");
            return (Criteria) this;
        }

        public Criteria andHighestRecordFormalNotLike(String value) {
            addCriterion("highest_record_formal not like", value, "highestRecordFormal");
            return (Criteria) this;
        }

        public Criteria andHighestRecordFormalIn(List<String> values) {
            addCriterion("highest_record_formal in", values, "highestRecordFormal");
            return (Criteria) this;
        }

        public Criteria andHighestRecordFormalNotIn(List<String> values) {
            addCriterion("highest_record_formal not in", values, "highestRecordFormal");
            return (Criteria) this;
        }

        public Criteria andHighestRecordFormalBetween(String value1, String value2) {
            addCriterion("highest_record_formal between", value1, value2, "highestRecordFormal");
            return (Criteria) this;
        }

        public Criteria andHighestRecordFormalNotBetween(String value1, String value2) {
            addCriterion("highest_record_formal not between", value1, value2, "highestRecordFormal");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNull() {
            addCriterion("certificate is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNotNull() {
            addCriterion("certificate is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateEqualTo(String value) {
            addCriterion("certificate =", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotEqualTo(String value) {
            addCriterion("certificate <>", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThan(String value) {
            addCriterion("certificate >", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("certificate >=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThan(String value) {
            addCriterion("certificate <", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThanOrEqualTo(String value) {
            addCriterion("certificate <=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLike(String value) {
            addCriterion("certificate like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotLike(String value) {
            addCriterion("certificate not like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateIn(List<String> values) {
            addCriterion("certificate in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotIn(List<String> values) {
            addCriterion("certificate not in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateBetween(String value1, String value2) {
            addCriterion("certificate between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotBetween(String value1, String value2) {
            addCriterion("certificate not between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andNowHousingAreaIsNull() {
            addCriterion("now_housing_area is null");
            return (Criteria) this;
        }

        public Criteria andNowHousingAreaIsNotNull() {
            addCriterion("now_housing_area is not null");
            return (Criteria) this;
        }

        public Criteria andNowHousingAreaEqualTo(String value) {
            addCriterion("now_housing_area =", value, "nowHousingArea");
            return (Criteria) this;
        }

        public Criteria andNowHousingAreaNotEqualTo(String value) {
            addCriterion("now_housing_area <>", value, "nowHousingArea");
            return (Criteria) this;
        }

        public Criteria andNowHousingAreaGreaterThan(String value) {
            addCriterion("now_housing_area >", value, "nowHousingArea");
            return (Criteria) this;
        }

        public Criteria andNowHousingAreaGreaterThanOrEqualTo(String value) {
            addCriterion("now_housing_area >=", value, "nowHousingArea");
            return (Criteria) this;
        }

        public Criteria andNowHousingAreaLessThan(String value) {
            addCriterion("now_housing_area <", value, "nowHousingArea");
            return (Criteria) this;
        }

        public Criteria andNowHousingAreaLessThanOrEqualTo(String value) {
            addCriterion("now_housing_area <=", value, "nowHousingArea");
            return (Criteria) this;
        }

        public Criteria andNowHousingAreaLike(String value) {
            addCriterion("now_housing_area like", value, "nowHousingArea");
            return (Criteria) this;
        }

        public Criteria andNowHousingAreaNotLike(String value) {
            addCriterion("now_housing_area not like", value, "nowHousingArea");
            return (Criteria) this;
        }

        public Criteria andNowHousingAreaIn(List<String> values) {
            addCriterion("now_housing_area in", values, "nowHousingArea");
            return (Criteria) this;
        }

        public Criteria andNowHousingAreaNotIn(List<String> values) {
            addCriterion("now_housing_area not in", values, "nowHousingArea");
            return (Criteria) this;
        }

        public Criteria andNowHousingAreaBetween(String value1, String value2) {
            addCriterion("now_housing_area between", value1, value2, "nowHousingArea");
            return (Criteria) this;
        }

        public Criteria andNowHousingAreaNotBetween(String value1, String value2) {
            addCriterion("now_housing_area not between", value1, value2, "nowHousingArea");
            return (Criteria) this;
        }

        public Criteria andHousingTypeIsNull() {
            addCriterion("housing_type is null");
            return (Criteria) this;
        }

        public Criteria andHousingTypeIsNotNull() {
            addCriterion("housing_type is not null");
            return (Criteria) this;
        }

        public Criteria andHousingTypeEqualTo(String value) {
            addCriterion("housing_type =", value, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeNotEqualTo(String value) {
            addCriterion("housing_type <>", value, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeGreaterThan(String value) {
            addCriterion("housing_type >", value, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("housing_type >=", value, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeLessThan(String value) {
            addCriterion("housing_type <", value, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeLessThanOrEqualTo(String value) {
            addCriterion("housing_type <=", value, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeLike(String value) {
            addCriterion("housing_type like", value, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeNotLike(String value) {
            addCriterion("housing_type not like", value, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeIn(List<String> values) {
            addCriterion("housing_type in", values, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeNotIn(List<String> values) {
            addCriterion("housing_type not in", values, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeBetween(String value1, String value2) {
            addCriterion("housing_type between", value1, value2, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeNotBetween(String value1, String value2) {
            addCriterion("housing_type not between", value1, value2, "housingType");
            return (Criteria) this;
        }

        public Criteria andHasCarIsNull() {
            addCriterion("has_car is null");
            return (Criteria) this;
        }

        public Criteria andHasCarIsNotNull() {
            addCriterion("has_car is not null");
            return (Criteria) this;
        }

        public Criteria andHasCarEqualTo(String value) {
            addCriterion("has_car =", value, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarNotEqualTo(String value) {
            addCriterion("has_car <>", value, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarGreaterThan(String value) {
            addCriterion("has_car >", value, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarGreaterThanOrEqualTo(String value) {
            addCriterion("has_car >=", value, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarLessThan(String value) {
            addCriterion("has_car <", value, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarLessThanOrEqualTo(String value) {
            addCriterion("has_car <=", value, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarLike(String value) {
            addCriterion("has_car like", value, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarNotLike(String value) {
            addCriterion("has_car not like", value, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarIn(List<String> values) {
            addCriterion("has_car in", values, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarNotIn(List<String> values) {
            addCriterion("has_car not in", values, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarBetween(String value1, String value2) {
            addCriterion("has_car between", value1, value2, "hasCar");
            return (Criteria) this;
        }

        public Criteria andHasCarNotBetween(String value1, String value2) {
            addCriterion("has_car not between", value1, value2, "hasCar");
            return (Criteria) this;
        }

        public Criteria andVehicleFlatcardIsNull() {
            addCriterion("vehicle_flatcard is null");
            return (Criteria) this;
        }

        public Criteria andVehicleFlatcardIsNotNull() {
            addCriterion("vehicle_flatcard is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleFlatcardEqualTo(String value) {
            addCriterion("vehicle_flatcard =", value, "vehicleFlatcard");
            return (Criteria) this;
        }

        public Criteria andVehicleFlatcardNotEqualTo(String value) {
            addCriterion("vehicle_flatcard <>", value, "vehicleFlatcard");
            return (Criteria) this;
        }

        public Criteria andVehicleFlatcardGreaterThan(String value) {
            addCriterion("vehicle_flatcard >", value, "vehicleFlatcard");
            return (Criteria) this;
        }

        public Criteria andVehicleFlatcardGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_flatcard >=", value, "vehicleFlatcard");
            return (Criteria) this;
        }

        public Criteria andVehicleFlatcardLessThan(String value) {
            addCriterion("vehicle_flatcard <", value, "vehicleFlatcard");
            return (Criteria) this;
        }

        public Criteria andVehicleFlatcardLessThanOrEqualTo(String value) {
            addCriterion("vehicle_flatcard <=", value, "vehicleFlatcard");
            return (Criteria) this;
        }

        public Criteria andVehicleFlatcardLike(String value) {
            addCriterion("vehicle_flatcard like", value, "vehicleFlatcard");
            return (Criteria) this;
        }

        public Criteria andVehicleFlatcardNotLike(String value) {
            addCriterion("vehicle_flatcard not like", value, "vehicleFlatcard");
            return (Criteria) this;
        }

        public Criteria andVehicleFlatcardIn(List<String> values) {
            addCriterion("vehicle_flatcard in", values, "vehicleFlatcard");
            return (Criteria) this;
        }

        public Criteria andVehicleFlatcardNotIn(List<String> values) {
            addCriterion("vehicle_flatcard not in", values, "vehicleFlatcard");
            return (Criteria) this;
        }

        public Criteria andVehicleFlatcardBetween(String value1, String value2) {
            addCriterion("vehicle_flatcard between", value1, value2, "vehicleFlatcard");
            return (Criteria) this;
        }

        public Criteria andVehicleFlatcardNotBetween(String value1, String value2) {
            addCriterion("vehicle_flatcard not between", value1, value2, "vehicleFlatcard");
            return (Criteria) this;
        }

        public Criteria andPersonalMonthlyIncomeIsNull() {
            addCriterion("personal_monthly_income is null");
            return (Criteria) this;
        }

        public Criteria andPersonalMonthlyIncomeIsNotNull() {
            addCriterion("personal_monthly_income is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalMonthlyIncomeEqualTo(BigDecimal value) {
            addCriterion("personal_monthly_income =", value, "personalMonthlyIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalMonthlyIncomeNotEqualTo(BigDecimal value) {
            addCriterion("personal_monthly_income <>", value, "personalMonthlyIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalMonthlyIncomeGreaterThan(BigDecimal value) {
            addCriterion("personal_monthly_income >", value, "personalMonthlyIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalMonthlyIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("personal_monthly_income >=", value, "personalMonthlyIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalMonthlyIncomeLessThan(BigDecimal value) {
            addCriterion("personal_monthly_income <", value, "personalMonthlyIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalMonthlyIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("personal_monthly_income <=", value, "personalMonthlyIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalMonthlyIncomeIn(List<BigDecimal> values) {
            addCriterion("personal_monthly_income in", values, "personalMonthlyIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalMonthlyIncomeNotIn(List<BigDecimal> values) {
            addCriterion("personal_monthly_income not in", values, "personalMonthlyIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalMonthlyIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("personal_monthly_income between", value1, value2, "personalMonthlyIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalMonthlyIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("personal_monthly_income not between", value1, value2, "personalMonthlyIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalIncomeIsNull() {
            addCriterion("personal_income is null");
            return (Criteria) this;
        }

        public Criteria andPersonalIncomeIsNotNull() {
            addCriterion("personal_income is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalIncomeEqualTo(BigDecimal value) {
            addCriterion("personal_income =", value, "personalIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalIncomeNotEqualTo(BigDecimal value) {
            addCriterion("personal_income <>", value, "personalIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalIncomeGreaterThan(BigDecimal value) {
            addCriterion("personal_income >", value, "personalIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("personal_income >=", value, "personalIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalIncomeLessThan(BigDecimal value) {
            addCriterion("personal_income <", value, "personalIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("personal_income <=", value, "personalIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalIncomeIn(List<BigDecimal> values) {
            addCriterion("personal_income in", values, "personalIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalIncomeNotIn(List<BigDecimal> values) {
            addCriterion("personal_income not in", values, "personalIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("personal_income between", value1, value2, "personalIncome");
            return (Criteria) this;
        }

        public Criteria andPersonalIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("personal_income not between", value1, value2, "personalIncome");
            return (Criteria) this;
        }

        public Criteria andNaturalPersonTypeIsNull() {
            addCriterion("natural_person_type is null");
            return (Criteria) this;
        }

        public Criteria andNaturalPersonTypeIsNotNull() {
            addCriterion("natural_person_type is not null");
            return (Criteria) this;
        }

        public Criteria andNaturalPersonTypeEqualTo(String value) {
            addCriterion("natural_person_type =", value, "naturalPersonType");
            return (Criteria) this;
        }

        public Criteria andNaturalPersonTypeNotEqualTo(String value) {
            addCriterion("natural_person_type <>", value, "naturalPersonType");
            return (Criteria) this;
        }

        public Criteria andNaturalPersonTypeGreaterThan(String value) {
            addCriterion("natural_person_type >", value, "naturalPersonType");
            return (Criteria) this;
        }

        public Criteria andNaturalPersonTypeGreaterThanOrEqualTo(String value) {
            addCriterion("natural_person_type >=", value, "naturalPersonType");
            return (Criteria) this;
        }

        public Criteria andNaturalPersonTypeLessThan(String value) {
            addCriterion("natural_person_type <", value, "naturalPersonType");
            return (Criteria) this;
        }

        public Criteria andNaturalPersonTypeLessThanOrEqualTo(String value) {
            addCriterion("natural_person_type <=", value, "naturalPersonType");
            return (Criteria) this;
        }

        public Criteria andNaturalPersonTypeLike(String value) {
            addCriterion("natural_person_type like", value, "naturalPersonType");
            return (Criteria) this;
        }

        public Criteria andNaturalPersonTypeNotLike(String value) {
            addCriterion("natural_person_type not like", value, "naturalPersonType");
            return (Criteria) this;
        }

        public Criteria andNaturalPersonTypeIn(List<String> values) {
            addCriterion("natural_person_type in", values, "naturalPersonType");
            return (Criteria) this;
        }

        public Criteria andNaturalPersonTypeNotIn(List<String> values) {
            addCriterion("natural_person_type not in", values, "naturalPersonType");
            return (Criteria) this;
        }

        public Criteria andNaturalPersonTypeBetween(String value1, String value2) {
            addCriterion("natural_person_type between", value1, value2, "naturalPersonType");
            return (Criteria) this;
        }

        public Criteria andNaturalPersonTypeNotBetween(String value1, String value2) {
            addCriterion("natural_person_type not between", value1, value2, "naturalPersonType");
            return (Criteria) this;
        }

        public Criteria andClientAreaTypeIsNull() {
            addCriterion("client_area_type is null");
            return (Criteria) this;
        }

        public Criteria andClientAreaTypeIsNotNull() {
            addCriterion("client_area_type is not null");
            return (Criteria) this;
        }

        public Criteria andClientAreaTypeEqualTo(String value) {
            addCriterion("client_area_type =", value, "clientAreaType");
            return (Criteria) this;
        }

        public Criteria andClientAreaTypeNotEqualTo(String value) {
            addCriterion("client_area_type <>", value, "clientAreaType");
            return (Criteria) this;
        }

        public Criteria andClientAreaTypeGreaterThan(String value) {
            addCriterion("client_area_type >", value, "clientAreaType");
            return (Criteria) this;
        }

        public Criteria andClientAreaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("client_area_type >=", value, "clientAreaType");
            return (Criteria) this;
        }

        public Criteria andClientAreaTypeLessThan(String value) {
            addCriterion("client_area_type <", value, "clientAreaType");
            return (Criteria) this;
        }

        public Criteria andClientAreaTypeLessThanOrEqualTo(String value) {
            addCriterion("client_area_type <=", value, "clientAreaType");
            return (Criteria) this;
        }

        public Criteria andClientAreaTypeLike(String value) {
            addCriterion("client_area_type like", value, "clientAreaType");
            return (Criteria) this;
        }

        public Criteria andClientAreaTypeNotLike(String value) {
            addCriterion("client_area_type not like", value, "clientAreaType");
            return (Criteria) this;
        }

        public Criteria andClientAreaTypeIn(List<String> values) {
            addCriterion("client_area_type in", values, "clientAreaType");
            return (Criteria) this;
        }

        public Criteria andClientAreaTypeNotIn(List<String> values) {
            addCriterion("client_area_type not in", values, "clientAreaType");
            return (Criteria) this;
        }

        public Criteria andClientAreaTypeBetween(String value1, String value2) {
            addCriterion("client_area_type between", value1, value2, "clientAreaType");
            return (Criteria) this;
        }

        public Criteria andClientAreaTypeNotBetween(String value1, String value2) {
            addCriterion("client_area_type not between", value1, value2, "clientAreaType");
            return (Criteria) this;
        }

        public Criteria andGroupStaffIsNull() {
            addCriterion("group_staff is null");
            return (Criteria) this;
        }

        public Criteria andGroupStaffIsNotNull() {
            addCriterion("group_staff is not null");
            return (Criteria) this;
        }

        public Criteria andGroupStaffEqualTo(String value) {
            addCriterion("group_staff =", value, "groupStaff");
            return (Criteria) this;
        }

        public Criteria andGroupStaffNotEqualTo(String value) {
            addCriterion("group_staff <>", value, "groupStaff");
            return (Criteria) this;
        }

        public Criteria andGroupStaffGreaterThan(String value) {
            addCriterion("group_staff >", value, "groupStaff");
            return (Criteria) this;
        }

        public Criteria andGroupStaffGreaterThanOrEqualTo(String value) {
            addCriterion("group_staff >=", value, "groupStaff");
            return (Criteria) this;
        }

        public Criteria andGroupStaffLessThan(String value) {
            addCriterion("group_staff <", value, "groupStaff");
            return (Criteria) this;
        }

        public Criteria andGroupStaffLessThanOrEqualTo(String value) {
            addCriterion("group_staff <=", value, "groupStaff");
            return (Criteria) this;
        }

        public Criteria andGroupStaffLike(String value) {
            addCriterion("group_staff like", value, "groupStaff");
            return (Criteria) this;
        }

        public Criteria andGroupStaffNotLike(String value) {
            addCriterion("group_staff not like", value, "groupStaff");
            return (Criteria) this;
        }

        public Criteria andGroupStaffIn(List<String> values) {
            addCriterion("group_staff in", values, "groupStaff");
            return (Criteria) this;
        }

        public Criteria andGroupStaffNotIn(List<String> values) {
            addCriterion("group_staff not in", values, "groupStaff");
            return (Criteria) this;
        }

        public Criteria andGroupStaffBetween(String value1, String value2) {
            addCriterion("group_staff between", value1, value2, "groupStaff");
            return (Criteria) this;
        }

        public Criteria andGroupStaffNotBetween(String value1, String value2) {
            addCriterion("group_staff not between", value1, value2, "groupStaff");
            return (Criteria) this;
        }

        public Criteria andComprehensiveImpressionIsNull() {
            addCriterion("comprehensive_impression is null");
            return (Criteria) this;
        }

        public Criteria andComprehensiveImpressionIsNotNull() {
            addCriterion("comprehensive_impression is not null");
            return (Criteria) this;
        }

        public Criteria andComprehensiveImpressionEqualTo(String value) {
            addCriterion("comprehensive_impression =", value, "comprehensiveImpression");
            return (Criteria) this;
        }

        public Criteria andComprehensiveImpressionNotEqualTo(String value) {
            addCriterion("comprehensive_impression <>", value, "comprehensiveImpression");
            return (Criteria) this;
        }

        public Criteria andComprehensiveImpressionGreaterThan(String value) {
            addCriterion("comprehensive_impression >", value, "comprehensiveImpression");
            return (Criteria) this;
        }

        public Criteria andComprehensiveImpressionGreaterThanOrEqualTo(String value) {
            addCriterion("comprehensive_impression >=", value, "comprehensiveImpression");
            return (Criteria) this;
        }

        public Criteria andComprehensiveImpressionLessThan(String value) {
            addCriterion("comprehensive_impression <", value, "comprehensiveImpression");
            return (Criteria) this;
        }

        public Criteria andComprehensiveImpressionLessThanOrEqualTo(String value) {
            addCriterion("comprehensive_impression <=", value, "comprehensiveImpression");
            return (Criteria) this;
        }

        public Criteria andComprehensiveImpressionLike(String value) {
            addCriterion("comprehensive_impression like", value, "comprehensiveImpression");
            return (Criteria) this;
        }

        public Criteria andComprehensiveImpressionNotLike(String value) {
            addCriterion("comprehensive_impression not like", value, "comprehensiveImpression");
            return (Criteria) this;
        }

        public Criteria andComprehensiveImpressionIn(List<String> values) {
            addCriterion("comprehensive_impression in", values, "comprehensiveImpression");
            return (Criteria) this;
        }

        public Criteria andComprehensiveImpressionNotIn(List<String> values) {
            addCriterion("comprehensive_impression not in", values, "comprehensiveImpression");
            return (Criteria) this;
        }

        public Criteria andComprehensiveImpressionBetween(String value1, String value2) {
            addCriterion("comprehensive_impression between", value1, value2, "comprehensiveImpression");
            return (Criteria) this;
        }

        public Criteria andComprehensiveImpressionNotBetween(String value1, String value2) {
            addCriterion("comprehensive_impression not between", value1, value2, "comprehensiveImpression");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceIsNull() {
            addCriterion("customer_source is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceIsNotNull() {
            addCriterion("customer_source is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceEqualTo(String value) {
            addCriterion("customer_source =", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotEqualTo(String value) {
            addCriterion("customer_source <>", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceGreaterThan(String value) {
            addCriterion("customer_source >", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceGreaterThanOrEqualTo(String value) {
            addCriterion("customer_source >=", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceLessThan(String value) {
            addCriterion("customer_source <", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceLessThanOrEqualTo(String value) {
            addCriterion("customer_source <=", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceLike(String value) {
            addCriterion("customer_source like", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotLike(String value) {
            addCriterion("customer_source not like", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceIn(List<String> values) {
            addCriterion("customer_source in", values, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotIn(List<String> values) {
            addCriterion("customer_source not in", values, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceBetween(String value1, String value2) {
            addCriterion("customer_source between", value1, value2, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotBetween(String value1, String value2) {
            addCriterion("customer_source not between", value1, value2, "customerSource");
            return (Criteria) this;
        }

        public Criteria andAddedIsNull() {
            addCriterion("added is null");
            return (Criteria) this;
        }

        public Criteria andAddedIsNotNull() {
            addCriterion("added is not null");
            return (Criteria) this;
        }

        public Criteria andAddedEqualTo(String value) {
            addCriterion("added =", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedNotEqualTo(String value) {
            addCriterion("added <>", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedGreaterThan(String value) {
            addCriterion("added >", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedGreaterThanOrEqualTo(String value) {
            addCriterion("added >=", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedLessThan(String value) {
            addCriterion("added <", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedLessThanOrEqualTo(String value) {
            addCriterion("added <=", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedLike(String value) {
            addCriterion("added like", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedNotLike(String value) {
            addCriterion("added not like", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedIn(List<String> values) {
            addCriterion("added in", values, "added");
            return (Criteria) this;
        }

        public Criteria andAddedNotIn(List<String> values) {
            addCriterion("added not in", values, "added");
            return (Criteria) this;
        }

        public Criteria andAddedBetween(String value1, String value2) {
            addCriterion("added between", value1, value2, "added");
            return (Criteria) this;
        }

        public Criteria andAddedNotBetween(String value1, String value2) {
            addCriterion("added not between", value1, value2, "added");
            return (Criteria) this;
        }

        public Criteria andFamilyAssetsIsNull() {
            addCriterion("family_assets is null");
            return (Criteria) this;
        }

        public Criteria andFamilyAssetsIsNotNull() {
            addCriterion("family_assets is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyAssetsEqualTo(BigDecimal value) {
            addCriterion("family_assets =", value, "familyAssets");
            return (Criteria) this;
        }

        public Criteria andFamilyAssetsNotEqualTo(BigDecimal value) {
            addCriterion("family_assets <>", value, "familyAssets");
            return (Criteria) this;
        }

        public Criteria andFamilyAssetsGreaterThan(BigDecimal value) {
            addCriterion("family_assets >", value, "familyAssets");
            return (Criteria) this;
        }

        public Criteria andFamilyAssetsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("family_assets >=", value, "familyAssets");
            return (Criteria) this;
        }

        public Criteria andFamilyAssetsLessThan(BigDecimal value) {
            addCriterion("family_assets <", value, "familyAssets");
            return (Criteria) this;
        }

        public Criteria andFamilyAssetsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("family_assets <=", value, "familyAssets");
            return (Criteria) this;
        }

        public Criteria andFamilyAssetsIn(List<BigDecimal> values) {
            addCriterion("family_assets in", values, "familyAssets");
            return (Criteria) this;
        }

        public Criteria andFamilyAssetsNotIn(List<BigDecimal> values) {
            addCriterion("family_assets not in", values, "familyAssets");
            return (Criteria) this;
        }

        public Criteria andFamilyAssetsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("family_assets between", value1, value2, "familyAssets");
            return (Criteria) this;
        }

        public Criteria andFamilyAssetsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("family_assets not between", value1, value2, "familyAssets");
            return (Criteria) this;
        }

        public Criteria andMonthLiabilitiesIsNull() {
            addCriterion("month_liabilities is null");
            return (Criteria) this;
        }

        public Criteria andMonthLiabilitiesIsNotNull() {
            addCriterion("month_liabilities is not null");
            return (Criteria) this;
        }

        public Criteria andMonthLiabilitiesEqualTo(BigDecimal value) {
            addCriterion("month_liabilities =", value, "monthLiabilities");
            return (Criteria) this;
        }

        public Criteria andMonthLiabilitiesNotEqualTo(BigDecimal value) {
            addCriterion("month_liabilities <>", value, "monthLiabilities");
            return (Criteria) this;
        }

        public Criteria andMonthLiabilitiesGreaterThan(BigDecimal value) {
            addCriterion("month_liabilities >", value, "monthLiabilities");
            return (Criteria) this;
        }

        public Criteria andMonthLiabilitiesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("month_liabilities >=", value, "monthLiabilities");
            return (Criteria) this;
        }

        public Criteria andMonthLiabilitiesLessThan(BigDecimal value) {
            addCriterion("month_liabilities <", value, "monthLiabilities");
            return (Criteria) this;
        }

        public Criteria andMonthLiabilitiesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("month_liabilities <=", value, "monthLiabilities");
            return (Criteria) this;
        }

        public Criteria andMonthLiabilitiesIn(List<BigDecimal> values) {
            addCriterion("month_liabilities in", values, "monthLiabilities");
            return (Criteria) this;
        }

        public Criteria andMonthLiabilitiesNotIn(List<BigDecimal> values) {
            addCriterion("month_liabilities not in", values, "monthLiabilities");
            return (Criteria) this;
        }

        public Criteria andMonthLiabilitiesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("month_liabilities between", value1, value2, "monthLiabilities");
            return (Criteria) this;
        }

        public Criteria andMonthLiabilitiesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("month_liabilities not between", value1, value2, "monthLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesIsNull() {
            addCriterion("total_liabilities is null");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesIsNotNull() {
            addCriterion("total_liabilities is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesEqualTo(BigDecimal value) {
            addCriterion("total_liabilities =", value, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesNotEqualTo(BigDecimal value) {
            addCriterion("total_liabilities <>", value, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesGreaterThan(BigDecimal value) {
            addCriterion("total_liabilities >", value, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_liabilities >=", value, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesLessThan(BigDecimal value) {
            addCriterion("total_liabilities <", value, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_liabilities <=", value, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesIn(List<BigDecimal> values) {
            addCriterion("total_liabilities in", values, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesNotIn(List<BigDecimal> values) {
            addCriterion("total_liabilities not in", values, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_liabilities between", value1, value2, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_liabilities not between", value1, value2, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatIsNull() {
            addCriterion("census_register_seat is null");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatIsNotNull() {
            addCriterion("census_register_seat is not null");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatEqualTo(String value) {
            addCriterion("census_register_seat =", value, "censusRegisterSeat");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatNotEqualTo(String value) {
            addCriterion("census_register_seat <>", value, "censusRegisterSeat");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatGreaterThan(String value) {
            addCriterion("census_register_seat >", value, "censusRegisterSeat");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatGreaterThanOrEqualTo(String value) {
            addCriterion("census_register_seat >=", value, "censusRegisterSeat");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatLessThan(String value) {
            addCriterion("census_register_seat <", value, "censusRegisterSeat");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatLessThanOrEqualTo(String value) {
            addCriterion("census_register_seat <=", value, "censusRegisterSeat");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatLike(String value) {
            addCriterion("census_register_seat like", value, "censusRegisterSeat");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatNotLike(String value) {
            addCriterion("census_register_seat not like", value, "censusRegisterSeat");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatIn(List<String> values) {
            addCriterion("census_register_seat in", values, "censusRegisterSeat");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatNotIn(List<String> values) {
            addCriterion("census_register_seat not in", values, "censusRegisterSeat");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatBetween(String value1, String value2) {
            addCriterion("census_register_seat between", value1, value2, "censusRegisterSeat");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterSeatNotBetween(String value1, String value2) {
            addCriterion("census_register_seat not between", value1, value2, "censusRegisterSeat");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNull() {
            addCriterion("merchant_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNotNull() {
            addCriterion("merchant_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameEqualTo(String value) {
            addCriterion("merchant_name =", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotEqualTo(String value) {
            addCriterion("merchant_name <>", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThan(String value) {
            addCriterion("merchant_name >", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_name >=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThan(String value) {
            addCriterion("merchant_name <", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThanOrEqualTo(String value) {
            addCriterion("merchant_name <=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLike(String value) {
            addCriterion("merchant_name like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotLike(String value) {
            addCriterion("merchant_name not like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIn(List<String> values) {
            addCriterion("merchant_name in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotIn(List<String> values) {
            addCriterion("merchant_name not in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameBetween(String value1, String value2) {
            addCriterion("merchant_name between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotBetween(String value1, String value2) {
            addCriterion("merchant_name not between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNull() {
            addCriterion("business_scope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNotNull() {
            addCriterion("business_scope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeEqualTo(String value) {
            addCriterion("business_scope =", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotEqualTo(String value) {
            addCriterion("business_scope <>", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThan(String value) {
            addCriterion("business_scope >", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("business_scope >=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThan(String value) {
            addCriterion("business_scope <", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("business_scope <=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLike(String value) {
            addCriterion("business_scope like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotLike(String value) {
            addCriterion("business_scope not like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIn(List<String> values) {
            addCriterion("business_scope in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotIn(List<String> values) {
            addCriterion("business_scope not in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeBetween(String value1, String value2) {
            addCriterion("business_scope between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("business_scope not between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessOperatorIsNull() {
            addCriterion("business_operator is null");
            return (Criteria) this;
        }

        public Criteria andBusinessOperatorIsNotNull() {
            addCriterion("business_operator is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessOperatorEqualTo(String value) {
            addCriterion("business_operator =", value, "businessOperator");
            return (Criteria) this;
        }

        public Criteria andBusinessOperatorNotEqualTo(String value) {
            addCriterion("business_operator <>", value, "businessOperator");
            return (Criteria) this;
        }

        public Criteria andBusinessOperatorGreaterThan(String value) {
            addCriterion("business_operator >", value, "businessOperator");
            return (Criteria) this;
        }

        public Criteria andBusinessOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("business_operator >=", value, "businessOperator");
            return (Criteria) this;
        }

        public Criteria andBusinessOperatorLessThan(String value) {
            addCriterion("business_operator <", value, "businessOperator");
            return (Criteria) this;
        }

        public Criteria andBusinessOperatorLessThanOrEqualTo(String value) {
            addCriterion("business_operator <=", value, "businessOperator");
            return (Criteria) this;
        }

        public Criteria andBusinessOperatorLike(String value) {
            addCriterion("business_operator like", value, "businessOperator");
            return (Criteria) this;
        }

        public Criteria andBusinessOperatorNotLike(String value) {
            addCriterion("business_operator not like", value, "businessOperator");
            return (Criteria) this;
        }

        public Criteria andBusinessOperatorIn(List<String> values) {
            addCriterion("business_operator in", values, "businessOperator");
            return (Criteria) this;
        }

        public Criteria andBusinessOperatorNotIn(List<String> values) {
            addCriterion("business_operator not in", values, "businessOperator");
            return (Criteria) this;
        }

        public Criteria andBusinessOperatorBetween(String value1, String value2) {
            addCriterion("business_operator between", value1, value2, "businessOperator");
            return (Criteria) this;
        }

        public Criteria andBusinessOperatorNotBetween(String value1, String value2) {
            addCriterion("business_operator not between", value1, value2, "businessOperator");
            return (Criteria) this;
        }

        public Criteria andStockholderNumIsNull() {
            addCriterion("stockholder_num is null");
            return (Criteria) this;
        }

        public Criteria andStockholderNumIsNotNull() {
            addCriterion("stockholder_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockholderNumEqualTo(Integer value) {
            addCriterion("stockholder_num =", value, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andStockholderNumNotEqualTo(Integer value) {
            addCriterion("stockholder_num <>", value, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andStockholderNumGreaterThan(Integer value) {
            addCriterion("stockholder_num >", value, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andStockholderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockholder_num >=", value, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andStockholderNumLessThan(Integer value) {
            addCriterion("stockholder_num <", value, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andStockholderNumLessThanOrEqualTo(Integer value) {
            addCriterion("stockholder_num <=", value, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andStockholderNumIn(List<Integer> values) {
            addCriterion("stockholder_num in", values, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andStockholderNumNotIn(List<Integer> values) {
            addCriterion("stockholder_num not in", values, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andStockholderNumBetween(Integer value1, Integer value2) {
            addCriterion("stockholder_num between", value1, value2, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andStockholderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("stockholder_num not between", value1, value2, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andOperateAddrIsNull() {
            addCriterion("operate_addr is null");
            return (Criteria) this;
        }

        public Criteria andOperateAddrIsNotNull() {
            addCriterion("operate_addr is not null");
            return (Criteria) this;
        }

        public Criteria andOperateAddrEqualTo(String value) {
            addCriterion("operate_addr =", value, "operateAddr");
            return (Criteria) this;
        }

        public Criteria andOperateAddrNotEqualTo(String value) {
            addCriterion("operate_addr <>", value, "operateAddr");
            return (Criteria) this;
        }

        public Criteria andOperateAddrGreaterThan(String value) {
            addCriterion("operate_addr >", value, "operateAddr");
            return (Criteria) this;
        }

        public Criteria andOperateAddrGreaterThanOrEqualTo(String value) {
            addCriterion("operate_addr >=", value, "operateAddr");
            return (Criteria) this;
        }

        public Criteria andOperateAddrLessThan(String value) {
            addCriterion("operate_addr <", value, "operateAddr");
            return (Criteria) this;
        }

        public Criteria andOperateAddrLessThanOrEqualTo(String value) {
            addCriterion("operate_addr <=", value, "operateAddr");
            return (Criteria) this;
        }

        public Criteria andOperateAddrLike(String value) {
            addCriterion("operate_addr like", value, "operateAddr");
            return (Criteria) this;
        }

        public Criteria andOperateAddrNotLike(String value) {
            addCriterion("operate_addr not like", value, "operateAddr");
            return (Criteria) this;
        }

        public Criteria andOperateAddrIn(List<String> values) {
            addCriterion("operate_addr in", values, "operateAddr");
            return (Criteria) this;
        }

        public Criteria andOperateAddrNotIn(List<String> values) {
            addCriterion("operate_addr not in", values, "operateAddr");
            return (Criteria) this;
        }

        public Criteria andOperateAddrBetween(String value1, String value2) {
            addCriterion("operate_addr between", value1, value2, "operateAddr");
            return (Criteria) this;
        }

        public Criteria andOperateAddrNotBetween(String value1, String value2) {
            addCriterion("operate_addr not between", value1, value2, "operateAddr");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumIsNull() {
            addCriterion("employee_num is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumIsNotNull() {
            addCriterion("employee_num is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumEqualTo(Integer value) {
            addCriterion("employee_num =", value, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumNotEqualTo(Integer value) {
            addCriterion("employee_num <>", value, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumGreaterThan(Integer value) {
            addCriterion("employee_num >", value, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee_num >=", value, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumLessThan(Integer value) {
            addCriterion("employee_num <", value, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumLessThanOrEqualTo(Integer value) {
            addCriterion("employee_num <=", value, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumIn(List<Integer> values) {
            addCriterion("employee_num in", values, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumNotIn(List<Integer> values) {
            addCriterion("employee_num not in", values, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumBetween(Integer value1, Integer value2) {
            addCriterion("employee_num between", value1, value2, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("employee_num not between", value1, value2, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andOrganizeStyleIsNull() {
            addCriterion("organize_style is null");
            return (Criteria) this;
        }

        public Criteria andOrganizeStyleIsNotNull() {
            addCriterion("organize_style is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizeStyleEqualTo(String value) {
            addCriterion("organize_style =", value, "organizeStyle");
            return (Criteria) this;
        }

        public Criteria andOrganizeStyleNotEqualTo(String value) {
            addCriterion("organize_style <>", value, "organizeStyle");
            return (Criteria) this;
        }

        public Criteria andOrganizeStyleGreaterThan(String value) {
            addCriterion("organize_style >", value, "organizeStyle");
            return (Criteria) this;
        }

        public Criteria andOrganizeStyleGreaterThanOrEqualTo(String value) {
            addCriterion("organize_style >=", value, "organizeStyle");
            return (Criteria) this;
        }

        public Criteria andOrganizeStyleLessThan(String value) {
            addCriterion("organize_style <", value, "organizeStyle");
            return (Criteria) this;
        }

        public Criteria andOrganizeStyleLessThanOrEqualTo(String value) {
            addCriterion("organize_style <=", value, "organizeStyle");
            return (Criteria) this;
        }

        public Criteria andOrganizeStyleLike(String value) {
            addCriterion("organize_style like", value, "organizeStyle");
            return (Criteria) this;
        }

        public Criteria andOrganizeStyleNotLike(String value) {
            addCriterion("organize_style not like", value, "organizeStyle");
            return (Criteria) this;
        }

        public Criteria andOrganizeStyleIn(List<String> values) {
            addCriterion("organize_style in", values, "organizeStyle");
            return (Criteria) this;
        }

        public Criteria andOrganizeStyleNotIn(List<String> values) {
            addCriterion("organize_style not in", values, "organizeStyle");
            return (Criteria) this;
        }

        public Criteria andOrganizeStyleBetween(String value1, String value2) {
            addCriterion("organize_style between", value1, value2, "organizeStyle");
            return (Criteria) this;
        }

        public Criteria andOrganizeStyleNotBetween(String value1, String value2) {
            addCriterion("organize_style not between", value1, value2, "organizeStyle");
            return (Criteria) this;
        }

        public Criteria andOperateStartTimeIsNull() {
            addCriterion("operate_start_time is null");
            return (Criteria) this;
        }

        public Criteria andOperateStartTimeIsNotNull() {
            addCriterion("operate_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperateStartTimeEqualTo(Date value) {
            addCriterion("operate_start_time =", value, "operateStartTime");
            return (Criteria) this;
        }

        public Criteria andOperateStartTimeNotEqualTo(Date value) {
            addCriterion("operate_start_time <>", value, "operateStartTime");
            return (Criteria) this;
        }

        public Criteria andOperateStartTimeGreaterThan(Date value) {
            addCriterion("operate_start_time >", value, "operateStartTime");
            return (Criteria) this;
        }

        public Criteria andOperateStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operate_start_time >=", value, "operateStartTime");
            return (Criteria) this;
        }

        public Criteria andOperateStartTimeLessThan(Date value) {
            addCriterion("operate_start_time <", value, "operateStartTime");
            return (Criteria) this;
        }

        public Criteria andOperateStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("operate_start_time <=", value, "operateStartTime");
            return (Criteria) this;
        }

        public Criteria andOperateStartTimeIn(List<Date> values) {
            addCriterion("operate_start_time in", values, "operateStartTime");
            return (Criteria) this;
        }

        public Criteria andOperateStartTimeNotIn(List<Date> values) {
            addCriterion("operate_start_time not in", values, "operateStartTime");
            return (Criteria) this;
        }

        public Criteria andOperateStartTimeBetween(Date value1, Date value2) {
            addCriterion("operate_start_time between", value1, value2, "operateStartTime");
            return (Criteria) this;
        }

        public Criteria andOperateStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("operate_start_time not between", value1, value2, "operateStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessProductionIsNull() {
            addCriterion("business_production is null");
            return (Criteria) this;
        }

        public Criteria andBusinessProductionIsNotNull() {
            addCriterion("business_production is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessProductionEqualTo(String value) {
            addCriterion("business_production =", value, "businessProduction");
            return (Criteria) this;
        }

        public Criteria andBusinessProductionNotEqualTo(String value) {
            addCriterion("business_production <>", value, "businessProduction");
            return (Criteria) this;
        }

        public Criteria andBusinessProductionGreaterThan(String value) {
            addCriterion("business_production >", value, "businessProduction");
            return (Criteria) this;
        }

        public Criteria andBusinessProductionGreaterThanOrEqualTo(String value) {
            addCriterion("business_production >=", value, "businessProduction");
            return (Criteria) this;
        }

        public Criteria andBusinessProductionLessThan(String value) {
            addCriterion("business_production <", value, "businessProduction");
            return (Criteria) this;
        }

        public Criteria andBusinessProductionLessThanOrEqualTo(String value) {
            addCriterion("business_production <=", value, "businessProduction");
            return (Criteria) this;
        }

        public Criteria andBusinessProductionLike(String value) {
            addCriterion("business_production like", value, "businessProduction");
            return (Criteria) this;
        }

        public Criteria andBusinessProductionNotLike(String value) {
            addCriterion("business_production not like", value, "businessProduction");
            return (Criteria) this;
        }

        public Criteria andBusinessProductionIn(List<String> values) {
            addCriterion("business_production in", values, "businessProduction");
            return (Criteria) this;
        }

        public Criteria andBusinessProductionNotIn(List<String> values) {
            addCriterion("business_production not in", values, "businessProduction");
            return (Criteria) this;
        }

        public Criteria andBusinessProductionBetween(String value1, String value2) {
            addCriterion("business_production between", value1, value2, "businessProduction");
            return (Criteria) this;
        }

        public Criteria andBusinessProductionNotBetween(String value1, String value2) {
            addCriterion("business_production not between", value1, value2, "businessProduction");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andDetailDescIsNull() {
            addCriterion("detail_desc is null");
            return (Criteria) this;
        }

        public Criteria andDetailDescIsNotNull() {
            addCriterion("detail_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDetailDescEqualTo(String value) {
            addCriterion("detail_desc =", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescNotEqualTo(String value) {
            addCriterion("detail_desc <>", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescGreaterThan(String value) {
            addCriterion("detail_desc >", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescGreaterThanOrEqualTo(String value) {
            addCriterion("detail_desc >=", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescLessThan(String value) {
            addCriterion("detail_desc <", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescLessThanOrEqualTo(String value) {
            addCriterion("detail_desc <=", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescLike(String value) {
            addCriterion("detail_desc like", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescNotLike(String value) {
            addCriterion("detail_desc not like", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescIn(List<String> values) {
            addCriterion("detail_desc in", values, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescNotIn(List<String> values) {
            addCriterion("detail_desc not in", values, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescBetween(String value1, String value2) {
            addCriterion("detail_desc between", value1, value2, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescNotBetween(String value1, String value2) {
            addCriterion("detail_desc not between", value1, value2, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesIsNull() {
            addCriterion("monthly_sales is null");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesIsNotNull() {
            addCriterion("monthly_sales is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesEqualTo(String value) {
            addCriterion("monthly_sales =", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesNotEqualTo(String value) {
            addCriterion("monthly_sales <>", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesGreaterThan(String value) {
            addCriterion("monthly_sales >", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesGreaterThanOrEqualTo(String value) {
            addCriterion("monthly_sales >=", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesLessThan(String value) {
            addCriterion("monthly_sales <", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesLessThanOrEqualTo(String value) {
            addCriterion("monthly_sales <=", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesLike(String value) {
            addCriterion("monthly_sales like", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesNotLike(String value) {
            addCriterion("monthly_sales not like", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesIn(List<String> values) {
            addCriterion("monthly_sales in", values, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesNotIn(List<String> values) {
            addCriterion("monthly_sales not in", values, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesBetween(String value1, String value2) {
            addCriterion("monthly_sales between", value1, value2, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesNotBetween(String value1, String value2) {
            addCriterion("monthly_sales not between", value1, value2, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginRateIsNull() {
            addCriterion("gross_profit_margin_rate is null");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginRateIsNotNull() {
            addCriterion("gross_profit_margin_rate is not null");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginRateEqualTo(BigDecimal value) {
            addCriterion("gross_profit_margin_rate =", value, "grossProfitMarginRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginRateNotEqualTo(BigDecimal value) {
            addCriterion("gross_profit_margin_rate <>", value, "grossProfitMarginRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginRateGreaterThan(BigDecimal value) {
            addCriterion("gross_profit_margin_rate >", value, "grossProfitMarginRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gross_profit_margin_rate >=", value, "grossProfitMarginRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginRateLessThan(BigDecimal value) {
            addCriterion("gross_profit_margin_rate <", value, "grossProfitMarginRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gross_profit_margin_rate <=", value, "grossProfitMarginRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginRateIn(List<BigDecimal> values) {
            addCriterion("gross_profit_margin_rate in", values, "grossProfitMarginRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginRateNotIn(List<BigDecimal> values) {
            addCriterion("gross_profit_margin_rate not in", values, "grossProfitMarginRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gross_profit_margin_rate between", value1, value2, "grossProfitMarginRate");
            return (Criteria) this;
        }

        public Criteria andGrossProfitMarginRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gross_profit_margin_rate not between", value1, value2, "grossProfitMarginRate");
            return (Criteria) this;
        }

        public Criteria andNetIncomeRateIsNull() {
            addCriterion("net_income_rate is null");
            return (Criteria) this;
        }

        public Criteria andNetIncomeRateIsNotNull() {
            addCriterion("net_income_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNetIncomeRateEqualTo(BigDecimal value) {
            addCriterion("net_income_rate =", value, "netIncomeRate");
            return (Criteria) this;
        }

        public Criteria andNetIncomeRateNotEqualTo(BigDecimal value) {
            addCriterion("net_income_rate <>", value, "netIncomeRate");
            return (Criteria) this;
        }

        public Criteria andNetIncomeRateGreaterThan(BigDecimal value) {
            addCriterion("net_income_rate >", value, "netIncomeRate");
            return (Criteria) this;
        }

        public Criteria andNetIncomeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("net_income_rate >=", value, "netIncomeRate");
            return (Criteria) this;
        }

        public Criteria andNetIncomeRateLessThan(BigDecimal value) {
            addCriterion("net_income_rate <", value, "netIncomeRate");
            return (Criteria) this;
        }

        public Criteria andNetIncomeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("net_income_rate <=", value, "netIncomeRate");
            return (Criteria) this;
        }

        public Criteria andNetIncomeRateIn(List<BigDecimal> values) {
            addCriterion("net_income_rate in", values, "netIncomeRate");
            return (Criteria) this;
        }

        public Criteria andNetIncomeRateNotIn(List<BigDecimal> values) {
            addCriterion("net_income_rate not in", values, "netIncomeRate");
            return (Criteria) this;
        }

        public Criteria andNetIncomeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_income_rate between", value1, value2, "netIncomeRate");
            return (Criteria) this;
        }

        public Criteria andNetIncomeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_income_rate not between", value1, value2, "netIncomeRate");
            return (Criteria) this;
        }

        public Criteria andFamilyMonthlyExpensesIsNull() {
            addCriterion("family_monthly_expenses is null");
            return (Criteria) this;
        }

        public Criteria andFamilyMonthlyExpensesIsNotNull() {
            addCriterion("family_monthly_expenses is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyMonthlyExpensesEqualTo(BigDecimal value) {
            addCriterion("family_monthly_expenses =", value, "familyMonthlyExpenses");
            return (Criteria) this;
        }

        public Criteria andFamilyMonthlyExpensesNotEqualTo(BigDecimal value) {
            addCriterion("family_monthly_expenses <>", value, "familyMonthlyExpenses");
            return (Criteria) this;
        }

        public Criteria andFamilyMonthlyExpensesGreaterThan(BigDecimal value) {
            addCriterion("family_monthly_expenses >", value, "familyMonthlyExpenses");
            return (Criteria) this;
        }

        public Criteria andFamilyMonthlyExpensesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("family_monthly_expenses >=", value, "familyMonthlyExpenses");
            return (Criteria) this;
        }

        public Criteria andFamilyMonthlyExpensesLessThan(BigDecimal value) {
            addCriterion("family_monthly_expenses <", value, "familyMonthlyExpenses");
            return (Criteria) this;
        }

        public Criteria andFamilyMonthlyExpensesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("family_monthly_expenses <=", value, "familyMonthlyExpenses");
            return (Criteria) this;
        }

        public Criteria andFamilyMonthlyExpensesIn(List<BigDecimal> values) {
            addCriterion("family_monthly_expenses in", values, "familyMonthlyExpenses");
            return (Criteria) this;
        }

        public Criteria andFamilyMonthlyExpensesNotIn(List<BigDecimal> values) {
            addCriterion("family_monthly_expenses not in", values, "familyMonthlyExpenses");
            return (Criteria) this;
        }

        public Criteria andFamilyMonthlyExpensesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("family_monthly_expenses between", value1, value2, "familyMonthlyExpenses");
            return (Criteria) this;
        }

        public Criteria andFamilyMonthlyExpensesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("family_monthly_expenses not between", value1, value2, "familyMonthlyExpenses");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryIsNull() {
            addCriterion("current_inventory is null");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryIsNotNull() {
            addCriterion("current_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryEqualTo(BigDecimal value) {
            addCriterion("current_inventory =", value, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryNotEqualTo(BigDecimal value) {
            addCriterion("current_inventory <>", value, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryGreaterThan(BigDecimal value) {
            addCriterion("current_inventory >", value, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_inventory >=", value, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryLessThan(BigDecimal value) {
            addCriterion("current_inventory <", value, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_inventory <=", value, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryIn(List<BigDecimal> values) {
            addCriterion("current_inventory in", values, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryNotIn(List<BigDecimal> values) {
            addCriterion("current_inventory not in", values, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_inventory between", value1, value2, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_inventory not between", value1, value2, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableIsNull() {
            addCriterion("accounts_receivable is null");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableIsNotNull() {
            addCriterion("accounts_receivable is not null");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableEqualTo(BigDecimal value) {
            addCriterion("accounts_receivable =", value, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableNotEqualTo(BigDecimal value) {
            addCriterion("accounts_receivable <>", value, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableGreaterThan(BigDecimal value) {
            addCriterion("accounts_receivable >", value, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("accounts_receivable >=", value, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableLessThan(BigDecimal value) {
            addCriterion("accounts_receivable <", value, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("accounts_receivable <=", value, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableIn(List<BigDecimal> values) {
            addCriterion("accounts_receivable in", values, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableNotIn(List<BigDecimal> values) {
            addCriterion("accounts_receivable not in", values, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accounts_receivable between", value1, value2, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accounts_receivable not between", value1, value2, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableIsNull() {
            addCriterion("accounts_payable is null");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableIsNotNull() {
            addCriterion("accounts_payable is not null");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableEqualTo(BigDecimal value) {
            addCriterion("accounts_payable =", value, "accountsPayable");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableNotEqualTo(BigDecimal value) {
            addCriterion("accounts_payable <>", value, "accountsPayable");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableGreaterThan(BigDecimal value) {
            addCriterion("accounts_payable >", value, "accountsPayable");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("accounts_payable >=", value, "accountsPayable");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableLessThan(BigDecimal value) {
            addCriterion("accounts_payable <", value, "accountsPayable");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("accounts_payable <=", value, "accountsPayable");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableIn(List<BigDecimal> values) {
            addCriterion("accounts_payable in", values, "accountsPayable");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableNotIn(List<BigDecimal> values) {
            addCriterion("accounts_payable not in", values, "accountsPayable");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accounts_payable between", value1, value2, "accountsPayable");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accounts_payable not between", value1, value2, "accountsPayable");
            return (Criteria) this;
        }

        public Criteria andOtherRevenueIsNull() {
            addCriterion("other_revenue is null");
            return (Criteria) this;
        }

        public Criteria andOtherRevenueIsNotNull() {
            addCriterion("other_revenue is not null");
            return (Criteria) this;
        }

        public Criteria andOtherRevenueEqualTo(String value) {
            addCriterion("other_revenue =", value, "otherRevenue");
            return (Criteria) this;
        }

        public Criteria andOtherRevenueNotEqualTo(String value) {
            addCriterion("other_revenue <>", value, "otherRevenue");
            return (Criteria) this;
        }

        public Criteria andOtherRevenueGreaterThan(String value) {
            addCriterion("other_revenue >", value, "otherRevenue");
            return (Criteria) this;
        }

        public Criteria andOtherRevenueGreaterThanOrEqualTo(String value) {
            addCriterion("other_revenue >=", value, "otherRevenue");
            return (Criteria) this;
        }

        public Criteria andOtherRevenueLessThan(String value) {
            addCriterion("other_revenue <", value, "otherRevenue");
            return (Criteria) this;
        }

        public Criteria andOtherRevenueLessThanOrEqualTo(String value) {
            addCriterion("other_revenue <=", value, "otherRevenue");
            return (Criteria) this;
        }

        public Criteria andOtherRevenueLike(String value) {
            addCriterion("other_revenue like", value, "otherRevenue");
            return (Criteria) this;
        }

        public Criteria andOtherRevenueNotLike(String value) {
            addCriterion("other_revenue not like", value, "otherRevenue");
            return (Criteria) this;
        }

        public Criteria andOtherRevenueIn(List<String> values) {
            addCriterion("other_revenue in", values, "otherRevenue");
            return (Criteria) this;
        }

        public Criteria andOtherRevenueNotIn(List<String> values) {
            addCriterion("other_revenue not in", values, "otherRevenue");
            return (Criteria) this;
        }

        public Criteria andOtherRevenueBetween(String value1, String value2) {
            addCriterion("other_revenue between", value1, value2, "otherRevenue");
            return (Criteria) this;
        }

        public Criteria andOtherRevenueNotBetween(String value1, String value2) {
            addCriterion("other_revenue not between", value1, value2, "otherRevenue");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNull() {
            addCriterion("work_time is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNotNull() {
            addCriterion("work_time is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEqualTo(String value) {
            addCriterion("work_time =", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotEqualTo(String value) {
            addCriterion("work_time <>", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThan(String value) {
            addCriterion("work_time >", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("work_time >=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThan(String value) {
            addCriterion("work_time <", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThanOrEqualTo(String value) {
            addCriterion("work_time <=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLike(String value) {
            addCriterion("work_time like", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotLike(String value) {
            addCriterion("work_time not like", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIn(List<String> values) {
            addCriterion("work_time in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotIn(List<String> values) {
            addCriterion("work_time not in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeBetween(String value1, String value2) {
            addCriterion("work_time between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotBetween(String value1, String value2) {
            addCriterion("work_time not between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andContacts1IsNull() {
            addCriterion("contacts1 is null");
            return (Criteria) this;
        }

        public Criteria andContacts1IsNotNull() {
            addCriterion("contacts1 is not null");
            return (Criteria) this;
        }

        public Criteria andContacts1EqualTo(String value) {
            addCriterion("contacts1 =", value, "contacts1");
            return (Criteria) this;
        }

        public Criteria andContacts1NotEqualTo(String value) {
            addCriterion("contacts1 <>", value, "contacts1");
            return (Criteria) this;
        }

        public Criteria andContacts1GreaterThan(String value) {
            addCriterion("contacts1 >", value, "contacts1");
            return (Criteria) this;
        }

        public Criteria andContacts1GreaterThanOrEqualTo(String value) {
            addCriterion("contacts1 >=", value, "contacts1");
            return (Criteria) this;
        }

        public Criteria andContacts1LessThan(String value) {
            addCriterion("contacts1 <", value, "contacts1");
            return (Criteria) this;
        }

        public Criteria andContacts1LessThanOrEqualTo(String value) {
            addCriterion("contacts1 <=", value, "contacts1");
            return (Criteria) this;
        }

        public Criteria andContacts1Like(String value) {
            addCriterion("contacts1 like", value, "contacts1");
            return (Criteria) this;
        }

        public Criteria andContacts1NotLike(String value) {
            addCriterion("contacts1 not like", value, "contacts1");
            return (Criteria) this;
        }

        public Criteria andContacts1In(List<String> values) {
            addCriterion("contacts1 in", values, "contacts1");
            return (Criteria) this;
        }

        public Criteria andContacts1NotIn(List<String> values) {
            addCriterion("contacts1 not in", values, "contacts1");
            return (Criteria) this;
        }

        public Criteria andContacts1Between(String value1, String value2) {
            addCriterion("contacts1 between", value1, value2, "contacts1");
            return (Criteria) this;
        }

        public Criteria andContacts1NotBetween(String value1, String value2) {
            addCriterion("contacts1 not between", value1, value2, "contacts1");
            return (Criteria) this;
        }

        public Criteria andContacts2IsNull() {
            addCriterion("contacts2 is null");
            return (Criteria) this;
        }

        public Criteria andContacts2IsNotNull() {
            addCriterion("contacts2 is not null");
            return (Criteria) this;
        }

        public Criteria andContacts2EqualTo(String value) {
            addCriterion("contacts2 =", value, "contacts2");
            return (Criteria) this;
        }

        public Criteria andContacts2NotEqualTo(String value) {
            addCriterion("contacts2 <>", value, "contacts2");
            return (Criteria) this;
        }

        public Criteria andContacts2GreaterThan(String value) {
            addCriterion("contacts2 >", value, "contacts2");
            return (Criteria) this;
        }

        public Criteria andContacts2GreaterThanOrEqualTo(String value) {
            addCriterion("contacts2 >=", value, "contacts2");
            return (Criteria) this;
        }

        public Criteria andContacts2LessThan(String value) {
            addCriterion("contacts2 <", value, "contacts2");
            return (Criteria) this;
        }

        public Criteria andContacts2LessThanOrEqualTo(String value) {
            addCriterion("contacts2 <=", value, "contacts2");
            return (Criteria) this;
        }

        public Criteria andContacts2Like(String value) {
            addCriterion("contacts2 like", value, "contacts2");
            return (Criteria) this;
        }

        public Criteria andContacts2NotLike(String value) {
            addCriterion("contacts2 not like", value, "contacts2");
            return (Criteria) this;
        }

        public Criteria andContacts2In(List<String> values) {
            addCriterion("contacts2 in", values, "contacts2");
            return (Criteria) this;
        }

        public Criteria andContacts2NotIn(List<String> values) {
            addCriterion("contacts2 not in", values, "contacts2");
            return (Criteria) this;
        }

        public Criteria andContacts2Between(String value1, String value2) {
            addCriterion("contacts2 between", value1, value2, "contacts2");
            return (Criteria) this;
        }

        public Criteria andContacts2NotBetween(String value1, String value2) {
            addCriterion("contacts2 not between", value1, value2, "contacts2");
            return (Criteria) this;
        }

        public Criteria andContacts3IsNull() {
            addCriterion("contacts3 is null");
            return (Criteria) this;
        }

        public Criteria andContacts3IsNotNull() {
            addCriterion("contacts3 is not null");
            return (Criteria) this;
        }

        public Criteria andContacts3EqualTo(String value) {
            addCriterion("contacts3 =", value, "contacts3");
            return (Criteria) this;
        }

        public Criteria andContacts3NotEqualTo(String value) {
            addCriterion("contacts3 <>", value, "contacts3");
            return (Criteria) this;
        }

        public Criteria andContacts3GreaterThan(String value) {
            addCriterion("contacts3 >", value, "contacts3");
            return (Criteria) this;
        }

        public Criteria andContacts3GreaterThanOrEqualTo(String value) {
            addCriterion("contacts3 >=", value, "contacts3");
            return (Criteria) this;
        }

        public Criteria andContacts3LessThan(String value) {
            addCriterion("contacts3 <", value, "contacts3");
            return (Criteria) this;
        }

        public Criteria andContacts3LessThanOrEqualTo(String value) {
            addCriterion("contacts3 <=", value, "contacts3");
            return (Criteria) this;
        }

        public Criteria andContacts3Like(String value) {
            addCriterion("contacts3 like", value, "contacts3");
            return (Criteria) this;
        }

        public Criteria andContacts3NotLike(String value) {
            addCriterion("contacts3 not like", value, "contacts3");
            return (Criteria) this;
        }

        public Criteria andContacts3In(List<String> values) {
            addCriterion("contacts3 in", values, "contacts3");
            return (Criteria) this;
        }

        public Criteria andContacts3NotIn(List<String> values) {
            addCriterion("contacts3 not in", values, "contacts3");
            return (Criteria) this;
        }

        public Criteria andContacts3Between(String value1, String value2) {
            addCriterion("contacts3 between", value1, value2, "contacts3");
            return (Criteria) this;
        }

        public Criteria andContacts3NotBetween(String value1, String value2) {
            addCriterion("contacts3 not between", value1, value2, "contacts3");
            return (Criteria) this;
        }

        public Criteria andContactsTel1IsNull() {
            addCriterion("contacts_tel1 is null");
            return (Criteria) this;
        }

        public Criteria andContactsTel1IsNotNull() {
            addCriterion("contacts_tel1 is not null");
            return (Criteria) this;
        }

        public Criteria andContactsTel1EqualTo(String value) {
            addCriterion("contacts_tel1 =", value, "contactsTel1");
            return (Criteria) this;
        }

        public Criteria andContactsTel1NotEqualTo(String value) {
            addCriterion("contacts_tel1 <>", value, "contactsTel1");
            return (Criteria) this;
        }

        public Criteria andContactsTel1GreaterThan(String value) {
            addCriterion("contacts_tel1 >", value, "contactsTel1");
            return (Criteria) this;
        }

        public Criteria andContactsTel1GreaterThanOrEqualTo(String value) {
            addCriterion("contacts_tel1 >=", value, "contactsTel1");
            return (Criteria) this;
        }

        public Criteria andContactsTel1LessThan(String value) {
            addCriterion("contacts_tel1 <", value, "contactsTel1");
            return (Criteria) this;
        }

        public Criteria andContactsTel1LessThanOrEqualTo(String value) {
            addCriterion("contacts_tel1 <=", value, "contactsTel1");
            return (Criteria) this;
        }

        public Criteria andContactsTel1Like(String value) {
            addCriterion("contacts_tel1 like", value, "contactsTel1");
            return (Criteria) this;
        }

        public Criteria andContactsTel1NotLike(String value) {
            addCriterion("contacts_tel1 not like", value, "contactsTel1");
            return (Criteria) this;
        }

        public Criteria andContactsTel1In(List<String> values) {
            addCriterion("contacts_tel1 in", values, "contactsTel1");
            return (Criteria) this;
        }

        public Criteria andContactsTel1NotIn(List<String> values) {
            addCriterion("contacts_tel1 not in", values, "contactsTel1");
            return (Criteria) this;
        }

        public Criteria andContactsTel1Between(String value1, String value2) {
            addCriterion("contacts_tel1 between", value1, value2, "contactsTel1");
            return (Criteria) this;
        }

        public Criteria andContactsTel1NotBetween(String value1, String value2) {
            addCriterion("contacts_tel1 not between", value1, value2, "contactsTel1");
            return (Criteria) this;
        }

        public Criteria andContactsTel2IsNull() {
            addCriterion("contacts_tel2 is null");
            return (Criteria) this;
        }

        public Criteria andContactsTel2IsNotNull() {
            addCriterion("contacts_tel2 is not null");
            return (Criteria) this;
        }

        public Criteria andContactsTel2EqualTo(String value) {
            addCriterion("contacts_tel2 =", value, "contactsTel2");
            return (Criteria) this;
        }

        public Criteria andContactsTel2NotEqualTo(String value) {
            addCriterion("contacts_tel2 <>", value, "contactsTel2");
            return (Criteria) this;
        }

        public Criteria andContactsTel2GreaterThan(String value) {
            addCriterion("contacts_tel2 >", value, "contactsTel2");
            return (Criteria) this;
        }

        public Criteria andContactsTel2GreaterThanOrEqualTo(String value) {
            addCriterion("contacts_tel2 >=", value, "contactsTel2");
            return (Criteria) this;
        }

        public Criteria andContactsTel2LessThan(String value) {
            addCriterion("contacts_tel2 <", value, "contactsTel2");
            return (Criteria) this;
        }

        public Criteria andContactsTel2LessThanOrEqualTo(String value) {
            addCriterion("contacts_tel2 <=", value, "contactsTel2");
            return (Criteria) this;
        }

        public Criteria andContactsTel2Like(String value) {
            addCriterion("contacts_tel2 like", value, "contactsTel2");
            return (Criteria) this;
        }

        public Criteria andContactsTel2NotLike(String value) {
            addCriterion("contacts_tel2 not like", value, "contactsTel2");
            return (Criteria) this;
        }

        public Criteria andContactsTel2In(List<String> values) {
            addCriterion("contacts_tel2 in", values, "contactsTel2");
            return (Criteria) this;
        }

        public Criteria andContactsTel2NotIn(List<String> values) {
            addCriterion("contacts_tel2 not in", values, "contactsTel2");
            return (Criteria) this;
        }

        public Criteria andContactsTel2Between(String value1, String value2) {
            addCriterion("contacts_tel2 between", value1, value2, "contactsTel2");
            return (Criteria) this;
        }

        public Criteria andContactsTel2NotBetween(String value1, String value2) {
            addCriterion("contacts_tel2 not between", value1, value2, "contactsTel2");
            return (Criteria) this;
        }

        public Criteria andContactsTel3IsNull() {
            addCriterion("contacts_tel3 is null");
            return (Criteria) this;
        }

        public Criteria andContactsTel3IsNotNull() {
            addCriterion("contacts_tel3 is not null");
            return (Criteria) this;
        }

        public Criteria andContactsTel3EqualTo(String value) {
            addCriterion("contacts_tel3 =", value, "contactsTel3");
            return (Criteria) this;
        }

        public Criteria andContactsTel3NotEqualTo(String value) {
            addCriterion("contacts_tel3 <>", value, "contactsTel3");
            return (Criteria) this;
        }

        public Criteria andContactsTel3GreaterThan(String value) {
            addCriterion("contacts_tel3 >", value, "contactsTel3");
            return (Criteria) this;
        }

        public Criteria andContactsTel3GreaterThanOrEqualTo(String value) {
            addCriterion("contacts_tel3 >=", value, "contactsTel3");
            return (Criteria) this;
        }

        public Criteria andContactsTel3LessThan(String value) {
            addCriterion("contacts_tel3 <", value, "contactsTel3");
            return (Criteria) this;
        }

        public Criteria andContactsTel3LessThanOrEqualTo(String value) {
            addCriterion("contacts_tel3 <=", value, "contactsTel3");
            return (Criteria) this;
        }

        public Criteria andContactsTel3Like(String value) {
            addCriterion("contacts_tel3 like", value, "contactsTel3");
            return (Criteria) this;
        }

        public Criteria andContactsTel3NotLike(String value) {
            addCriterion("contacts_tel3 not like", value, "contactsTel3");
            return (Criteria) this;
        }

        public Criteria andContactsTel3In(List<String> values) {
            addCriterion("contacts_tel3 in", values, "contactsTel3");
            return (Criteria) this;
        }

        public Criteria andContactsTel3NotIn(List<String> values) {
            addCriterion("contacts_tel3 not in", values, "contactsTel3");
            return (Criteria) this;
        }

        public Criteria andContactsTel3Between(String value1, String value2) {
            addCriterion("contacts_tel3 between", value1, value2, "contactsTel3");
            return (Criteria) this;
        }

        public Criteria andContactsTel3NotBetween(String value1, String value2) {
            addCriterion("contacts_tel3 not between", value1, value2, "contactsTel3");
            return (Criteria) this;
        }

        public Criteria andContactsRelation1IsNull() {
            addCriterion("contacts_relation1 is null");
            return (Criteria) this;
        }

        public Criteria andContactsRelation1IsNotNull() {
            addCriterion("contacts_relation1 is not null");
            return (Criteria) this;
        }

        public Criteria andContactsRelation1EqualTo(String value) {
            addCriterion("contacts_relation1 =", value, "contactsRelation1");
            return (Criteria) this;
        }

        public Criteria andContactsRelation1NotEqualTo(String value) {
            addCriterion("contacts_relation1 <>", value, "contactsRelation1");
            return (Criteria) this;
        }

        public Criteria andContactsRelation1GreaterThan(String value) {
            addCriterion("contacts_relation1 >", value, "contactsRelation1");
            return (Criteria) this;
        }

        public Criteria andContactsRelation1GreaterThanOrEqualTo(String value) {
            addCriterion("contacts_relation1 >=", value, "contactsRelation1");
            return (Criteria) this;
        }

        public Criteria andContactsRelation1LessThan(String value) {
            addCriterion("contacts_relation1 <", value, "contactsRelation1");
            return (Criteria) this;
        }

        public Criteria andContactsRelation1LessThanOrEqualTo(String value) {
            addCriterion("contacts_relation1 <=", value, "contactsRelation1");
            return (Criteria) this;
        }

        public Criteria andContactsRelation1Like(String value) {
            addCriterion("contacts_relation1 like", value, "contactsRelation1");
            return (Criteria) this;
        }

        public Criteria andContactsRelation1NotLike(String value) {
            addCriterion("contacts_relation1 not like", value, "contactsRelation1");
            return (Criteria) this;
        }

        public Criteria andContactsRelation1In(List<String> values) {
            addCriterion("contacts_relation1 in", values, "contactsRelation1");
            return (Criteria) this;
        }

        public Criteria andContactsRelation1NotIn(List<String> values) {
            addCriterion("contacts_relation1 not in", values, "contactsRelation1");
            return (Criteria) this;
        }

        public Criteria andContactsRelation1Between(String value1, String value2) {
            addCriterion("contacts_relation1 between", value1, value2, "contactsRelation1");
            return (Criteria) this;
        }

        public Criteria andContactsRelation1NotBetween(String value1, String value2) {
            addCriterion("contacts_relation1 not between", value1, value2, "contactsRelation1");
            return (Criteria) this;
        }

        public Criteria andContactsRelation2IsNull() {
            addCriterion("contacts_relation2 is null");
            return (Criteria) this;
        }

        public Criteria andContactsRelation2IsNotNull() {
            addCriterion("contacts_relation2 is not null");
            return (Criteria) this;
        }

        public Criteria andContactsRelation2EqualTo(String value) {
            addCriterion("contacts_relation2 =", value, "contactsRelation2");
            return (Criteria) this;
        }

        public Criteria andContactsRelation2NotEqualTo(String value) {
            addCriterion("contacts_relation2 <>", value, "contactsRelation2");
            return (Criteria) this;
        }

        public Criteria andContactsRelation2GreaterThan(String value) {
            addCriterion("contacts_relation2 >", value, "contactsRelation2");
            return (Criteria) this;
        }

        public Criteria andContactsRelation2GreaterThanOrEqualTo(String value) {
            addCriterion("contacts_relation2 >=", value, "contactsRelation2");
            return (Criteria) this;
        }

        public Criteria andContactsRelation2LessThan(String value) {
            addCriterion("contacts_relation2 <", value, "contactsRelation2");
            return (Criteria) this;
        }

        public Criteria andContactsRelation2LessThanOrEqualTo(String value) {
            addCriterion("contacts_relation2 <=", value, "contactsRelation2");
            return (Criteria) this;
        }

        public Criteria andContactsRelation2Like(String value) {
            addCriterion("contacts_relation2 like", value, "contactsRelation2");
            return (Criteria) this;
        }

        public Criteria andContactsRelation2NotLike(String value) {
            addCriterion("contacts_relation2 not like", value, "contactsRelation2");
            return (Criteria) this;
        }

        public Criteria andContactsRelation2In(List<String> values) {
            addCriterion("contacts_relation2 in", values, "contactsRelation2");
            return (Criteria) this;
        }

        public Criteria andContactsRelation2NotIn(List<String> values) {
            addCriterion("contacts_relation2 not in", values, "contactsRelation2");
            return (Criteria) this;
        }

        public Criteria andContactsRelation2Between(String value1, String value2) {
            addCriterion("contacts_relation2 between", value1, value2, "contactsRelation2");
            return (Criteria) this;
        }

        public Criteria andContactsRelation2NotBetween(String value1, String value2) {
            addCriterion("contacts_relation2 not between", value1, value2, "contactsRelation2");
            return (Criteria) this;
        }

        public Criteria andContactsRelation3IsNull() {
            addCriterion("contacts_relation3 is null");
            return (Criteria) this;
        }

        public Criteria andContactsRelation3IsNotNull() {
            addCriterion("contacts_relation3 is not null");
            return (Criteria) this;
        }

        public Criteria andContactsRelation3EqualTo(String value) {
            addCriterion("contacts_relation3 =", value, "contactsRelation3");
            return (Criteria) this;
        }

        public Criteria andContactsRelation3NotEqualTo(String value) {
            addCriterion("contacts_relation3 <>", value, "contactsRelation3");
            return (Criteria) this;
        }

        public Criteria andContactsRelation3GreaterThan(String value) {
            addCriterion("contacts_relation3 >", value, "contactsRelation3");
            return (Criteria) this;
        }

        public Criteria andContactsRelation3GreaterThanOrEqualTo(String value) {
            addCriterion("contacts_relation3 >=", value, "contactsRelation3");
            return (Criteria) this;
        }

        public Criteria andContactsRelation3LessThan(String value) {
            addCriterion("contacts_relation3 <", value, "contactsRelation3");
            return (Criteria) this;
        }

        public Criteria andContactsRelation3LessThanOrEqualTo(String value) {
            addCriterion("contacts_relation3 <=", value, "contactsRelation3");
            return (Criteria) this;
        }

        public Criteria andContactsRelation3Like(String value) {
            addCriterion("contacts_relation3 like", value, "contactsRelation3");
            return (Criteria) this;
        }

        public Criteria andContactsRelation3NotLike(String value) {
            addCriterion("contacts_relation3 not like", value, "contactsRelation3");
            return (Criteria) this;
        }

        public Criteria andContactsRelation3In(List<String> values) {
            addCriterion("contacts_relation3 in", values, "contactsRelation3");
            return (Criteria) this;
        }

        public Criteria andContactsRelation3NotIn(List<String> values) {
            addCriterion("contacts_relation3 not in", values, "contactsRelation3");
            return (Criteria) this;
        }

        public Criteria andContactsRelation3Between(String value1, String value2) {
            addCriterion("contacts_relation3 between", value1, value2, "contactsRelation3");
            return (Criteria) this;
        }

        public Criteria andContactsRelation3NotBetween(String value1, String value2) {
            addCriterion("contacts_relation3 not between", value1, value2, "contactsRelation3");
            return (Criteria) this;
        }

        public Criteria andLoanUseIsNull() {
            addCriterion("loan_use is null");
            return (Criteria) this;
        }

        public Criteria andLoanUseIsNotNull() {
            addCriterion("loan_use is not null");
            return (Criteria) this;
        }

        public Criteria andLoanUseEqualTo(String value) {
            addCriterion("loan_use =", value, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseNotEqualTo(String value) {
            addCriterion("loan_use <>", value, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseGreaterThan(String value) {
            addCriterion("loan_use >", value, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseGreaterThanOrEqualTo(String value) {
            addCriterion("loan_use >=", value, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseLessThan(String value) {
            addCriterion("loan_use <", value, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseLessThanOrEqualTo(String value) {
            addCriterion("loan_use <=", value, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseLike(String value) {
            addCriterion("loan_use like", value, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseNotLike(String value) {
            addCriterion("loan_use not like", value, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseIn(List<String> values) {
            addCriterion("loan_use in", values, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseNotIn(List<String> values) {
            addCriterion("loan_use not in", values, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseBetween(String value1, String value2) {
            addCriterion("loan_use between", value1, value2, "loanUse");
            return (Criteria) this;
        }

        public Criteria andLoanUseNotBetween(String value1, String value2) {
            addCriterion("loan_use not between", value1, value2, "loanUse");
            return (Criteria) this;
        }

        public Criteria andAnnex1IsNull() {
            addCriterion("annex1 is null");
            return (Criteria) this;
        }

        public Criteria andAnnex1IsNotNull() {
            addCriterion("annex1 is not null");
            return (Criteria) this;
        }

        public Criteria andAnnex1EqualTo(String value) {
            addCriterion("annex1 =", value, "annex1");
            return (Criteria) this;
        }

        public Criteria andAnnex1NotEqualTo(String value) {
            addCriterion("annex1 <>", value, "annex1");
            return (Criteria) this;
        }

        public Criteria andAnnex1GreaterThan(String value) {
            addCriterion("annex1 >", value, "annex1");
            return (Criteria) this;
        }

        public Criteria andAnnex1GreaterThanOrEqualTo(String value) {
            addCriterion("annex1 >=", value, "annex1");
            return (Criteria) this;
        }

        public Criteria andAnnex1LessThan(String value) {
            addCriterion("annex1 <", value, "annex1");
            return (Criteria) this;
        }

        public Criteria andAnnex1LessThanOrEqualTo(String value) {
            addCriterion("annex1 <=", value, "annex1");
            return (Criteria) this;
        }

        public Criteria andAnnex1Like(String value) {
            addCriterion("annex1 like", value, "annex1");
            return (Criteria) this;
        }

        public Criteria andAnnex1NotLike(String value) {
            addCriterion("annex1 not like", value, "annex1");
            return (Criteria) this;
        }

        public Criteria andAnnex1In(List<String> values) {
            addCriterion("annex1 in", values, "annex1");
            return (Criteria) this;
        }

        public Criteria andAnnex1NotIn(List<String> values) {
            addCriterion("annex1 not in", values, "annex1");
            return (Criteria) this;
        }

        public Criteria andAnnex1Between(String value1, String value2) {
            addCriterion("annex1 between", value1, value2, "annex1");
            return (Criteria) this;
        }

        public Criteria andAnnex1NotBetween(String value1, String value2) {
            addCriterion("annex1 not between", value1, value2, "annex1");
            return (Criteria) this;
        }

        public Criteria andAnnex2IsNull() {
            addCriterion("annex2 is null");
            return (Criteria) this;
        }

        public Criteria andAnnex2IsNotNull() {
            addCriterion("annex2 is not null");
            return (Criteria) this;
        }

        public Criteria andAnnex2EqualTo(String value) {
            addCriterion("annex2 =", value, "annex2");
            return (Criteria) this;
        }

        public Criteria andAnnex2NotEqualTo(String value) {
            addCriterion("annex2 <>", value, "annex2");
            return (Criteria) this;
        }

        public Criteria andAnnex2GreaterThan(String value) {
            addCriterion("annex2 >", value, "annex2");
            return (Criteria) this;
        }

        public Criteria andAnnex2GreaterThanOrEqualTo(String value) {
            addCriterion("annex2 >=", value, "annex2");
            return (Criteria) this;
        }

        public Criteria andAnnex2LessThan(String value) {
            addCriterion("annex2 <", value, "annex2");
            return (Criteria) this;
        }

        public Criteria andAnnex2LessThanOrEqualTo(String value) {
            addCriterion("annex2 <=", value, "annex2");
            return (Criteria) this;
        }

        public Criteria andAnnex2Like(String value) {
            addCriterion("annex2 like", value, "annex2");
            return (Criteria) this;
        }

        public Criteria andAnnex2NotLike(String value) {
            addCriterion("annex2 not like", value, "annex2");
            return (Criteria) this;
        }

        public Criteria andAnnex2In(List<String> values) {
            addCriterion("annex2 in", values, "annex2");
            return (Criteria) this;
        }

        public Criteria andAnnex2NotIn(List<String> values) {
            addCriterion("annex2 not in", values, "annex2");
            return (Criteria) this;
        }

        public Criteria andAnnex2Between(String value1, String value2) {
            addCriterion("annex2 between", value1, value2, "annex2");
            return (Criteria) this;
        }

        public Criteria andAnnex2NotBetween(String value1, String value2) {
            addCriterion("annex2 not between", value1, value2, "annex2");
            return (Criteria) this;
        }

        public Criteria andAnnex3IsNull() {
            addCriterion("annex3 is null");
            return (Criteria) this;
        }

        public Criteria andAnnex3IsNotNull() {
            addCriterion("annex3 is not null");
            return (Criteria) this;
        }

        public Criteria andAnnex3EqualTo(String value) {
            addCriterion("annex3 =", value, "annex3");
            return (Criteria) this;
        }

        public Criteria andAnnex3NotEqualTo(String value) {
            addCriterion("annex3 <>", value, "annex3");
            return (Criteria) this;
        }

        public Criteria andAnnex3GreaterThan(String value) {
            addCriterion("annex3 >", value, "annex3");
            return (Criteria) this;
        }

        public Criteria andAnnex3GreaterThanOrEqualTo(String value) {
            addCriterion("annex3 >=", value, "annex3");
            return (Criteria) this;
        }

        public Criteria andAnnex3LessThan(String value) {
            addCriterion("annex3 <", value, "annex3");
            return (Criteria) this;
        }

        public Criteria andAnnex3LessThanOrEqualTo(String value) {
            addCriterion("annex3 <=", value, "annex3");
            return (Criteria) this;
        }

        public Criteria andAnnex3Like(String value) {
            addCriterion("annex3 like", value, "annex3");
            return (Criteria) this;
        }

        public Criteria andAnnex3NotLike(String value) {
            addCriterion("annex3 not like", value, "annex3");
            return (Criteria) this;
        }

        public Criteria andAnnex3In(List<String> values) {
            addCriterion("annex3 in", values, "annex3");
            return (Criteria) this;
        }

        public Criteria andAnnex3NotIn(List<String> values) {
            addCriterion("annex3 not in", values, "annex3");
            return (Criteria) this;
        }

        public Criteria andAnnex3Between(String value1, String value2) {
            addCriterion("annex3 between", value1, value2, "annex3");
            return (Criteria) this;
        }

        public Criteria andAnnex3NotBetween(String value1, String value2) {
            addCriterion("annex3 not between", value1, value2, "annex3");
            return (Criteria) this;
        }

        public Criteria andAnnex4IsNull() {
            addCriterion("annex4 is null");
            return (Criteria) this;
        }

        public Criteria andAnnex4IsNotNull() {
            addCriterion("annex4 is not null");
            return (Criteria) this;
        }

        public Criteria andAnnex4EqualTo(String value) {
            addCriterion("annex4 =", value, "annex4");
            return (Criteria) this;
        }

        public Criteria andAnnex4NotEqualTo(String value) {
            addCriterion("annex4 <>", value, "annex4");
            return (Criteria) this;
        }

        public Criteria andAnnex4GreaterThan(String value) {
            addCriterion("annex4 >", value, "annex4");
            return (Criteria) this;
        }

        public Criteria andAnnex4GreaterThanOrEqualTo(String value) {
            addCriterion("annex4 >=", value, "annex4");
            return (Criteria) this;
        }

        public Criteria andAnnex4LessThan(String value) {
            addCriterion("annex4 <", value, "annex4");
            return (Criteria) this;
        }

        public Criteria andAnnex4LessThanOrEqualTo(String value) {
            addCriterion("annex4 <=", value, "annex4");
            return (Criteria) this;
        }

        public Criteria andAnnex4Like(String value) {
            addCriterion("annex4 like", value, "annex4");
            return (Criteria) this;
        }

        public Criteria andAnnex4NotLike(String value) {
            addCriterion("annex4 not like", value, "annex4");
            return (Criteria) this;
        }

        public Criteria andAnnex4In(List<String> values) {
            addCriterion("annex4 in", values, "annex4");
            return (Criteria) this;
        }

        public Criteria andAnnex4NotIn(List<String> values) {
            addCriterion("annex4 not in", values, "annex4");
            return (Criteria) this;
        }

        public Criteria andAnnex4Between(String value1, String value2) {
            addCriterion("annex4 between", value1, value2, "annex4");
            return (Criteria) this;
        }

        public Criteria andAnnex4NotBetween(String value1, String value2) {
            addCriterion("annex4 not between", value1, value2, "annex4");
            return (Criteria) this;
        }

        public Criteria andAnnex5IsNull() {
            addCriterion("annex5 is null");
            return (Criteria) this;
        }

        public Criteria andAnnex5IsNotNull() {
            addCriterion("annex5 is not null");
            return (Criteria) this;
        }

        public Criteria andAnnex5EqualTo(String value) {
            addCriterion("annex5 =", value, "annex5");
            return (Criteria) this;
        }

        public Criteria andAnnex5NotEqualTo(String value) {
            addCriterion("annex5 <>", value, "annex5");
            return (Criteria) this;
        }

        public Criteria andAnnex5GreaterThan(String value) {
            addCriterion("annex5 >", value, "annex5");
            return (Criteria) this;
        }

        public Criteria andAnnex5GreaterThanOrEqualTo(String value) {
            addCriterion("annex5 >=", value, "annex5");
            return (Criteria) this;
        }

        public Criteria andAnnex5LessThan(String value) {
            addCriterion("annex5 <", value, "annex5");
            return (Criteria) this;
        }

        public Criteria andAnnex5LessThanOrEqualTo(String value) {
            addCriterion("annex5 <=", value, "annex5");
            return (Criteria) this;
        }

        public Criteria andAnnex5Like(String value) {
            addCriterion("annex5 like", value, "annex5");
            return (Criteria) this;
        }

        public Criteria andAnnex5NotLike(String value) {
            addCriterion("annex5 not like", value, "annex5");
            return (Criteria) this;
        }

        public Criteria andAnnex5In(List<String> values) {
            addCriterion("annex5 in", values, "annex5");
            return (Criteria) this;
        }

        public Criteria andAnnex5NotIn(List<String> values) {
            addCriterion("annex5 not in", values, "annex5");
            return (Criteria) this;
        }

        public Criteria andAnnex5Between(String value1, String value2) {
            addCriterion("annex5 between", value1, value2, "annex5");
            return (Criteria) this;
        }

        public Criteria andAnnex5NotBetween(String value1, String value2) {
            addCriterion("annex5 not between", value1, value2, "annex5");
            return (Criteria) this;
        }

        public Criteria andAnnex6IsNull() {
            addCriterion("annex6 is null");
            return (Criteria) this;
        }

        public Criteria andAnnex6IsNotNull() {
            addCriterion("annex6 is not null");
            return (Criteria) this;
        }

        public Criteria andAnnex6EqualTo(String value) {
            addCriterion("annex6 =", value, "annex6");
            return (Criteria) this;
        }

        public Criteria andAnnex6NotEqualTo(String value) {
            addCriterion("annex6 <>", value, "annex6");
            return (Criteria) this;
        }

        public Criteria andAnnex6GreaterThan(String value) {
            addCriterion("annex6 >", value, "annex6");
            return (Criteria) this;
        }

        public Criteria andAnnex6GreaterThanOrEqualTo(String value) {
            addCriterion("annex6 >=", value, "annex6");
            return (Criteria) this;
        }

        public Criteria andAnnex6LessThan(String value) {
            addCriterion("annex6 <", value, "annex6");
            return (Criteria) this;
        }

        public Criteria andAnnex6LessThanOrEqualTo(String value) {
            addCriterion("annex6 <=", value, "annex6");
            return (Criteria) this;
        }

        public Criteria andAnnex6Like(String value) {
            addCriterion("annex6 like", value, "annex6");
            return (Criteria) this;
        }

        public Criteria andAnnex6NotLike(String value) {
            addCriterion("annex6 not like", value, "annex6");
            return (Criteria) this;
        }

        public Criteria andAnnex6In(List<String> values) {
            addCriterion("annex6 in", values, "annex6");
            return (Criteria) this;
        }

        public Criteria andAnnex6NotIn(List<String> values) {
            addCriterion("annex6 not in", values, "annex6");
            return (Criteria) this;
        }

        public Criteria andAnnex6Between(String value1, String value2) {
            addCriterion("annex6 between", value1, value2, "annex6");
            return (Criteria) this;
        }

        public Criteria andAnnex6NotBetween(String value1, String value2) {
            addCriterion("annex6 not between", value1, value2, "annex6");
            return (Criteria) this;
        }

        public Criteria andAnnex7IsNull() {
            addCriterion("annex7 is null");
            return (Criteria) this;
        }

        public Criteria andAnnex7IsNotNull() {
            addCriterion("annex7 is not null");
            return (Criteria) this;
        }

        public Criteria andAnnex7EqualTo(String value) {
            addCriterion("annex7 =", value, "annex7");
            return (Criteria) this;
        }

        public Criteria andAnnex7NotEqualTo(String value) {
            addCriterion("annex7 <>", value, "annex7");
            return (Criteria) this;
        }

        public Criteria andAnnex7GreaterThan(String value) {
            addCriterion("annex7 >", value, "annex7");
            return (Criteria) this;
        }

        public Criteria andAnnex7GreaterThanOrEqualTo(String value) {
            addCriterion("annex7 >=", value, "annex7");
            return (Criteria) this;
        }

        public Criteria andAnnex7LessThan(String value) {
            addCriterion("annex7 <", value, "annex7");
            return (Criteria) this;
        }

        public Criteria andAnnex7LessThanOrEqualTo(String value) {
            addCriterion("annex7 <=", value, "annex7");
            return (Criteria) this;
        }

        public Criteria andAnnex7Like(String value) {
            addCriterion("annex7 like", value, "annex7");
            return (Criteria) this;
        }

        public Criteria andAnnex7NotLike(String value) {
            addCriterion("annex7 not like", value, "annex7");
            return (Criteria) this;
        }

        public Criteria andAnnex7In(List<String> values) {
            addCriterion("annex7 in", values, "annex7");
            return (Criteria) this;
        }

        public Criteria andAnnex7NotIn(List<String> values) {
            addCriterion("annex7 not in", values, "annex7");
            return (Criteria) this;
        }

        public Criteria andAnnex7Between(String value1, String value2) {
            addCriterion("annex7 between", value1, value2, "annex7");
            return (Criteria) this;
        }

        public Criteria andAnnex7NotBetween(String value1, String value2) {
            addCriterion("annex7 not between", value1, value2, "annex7");
            return (Criteria) this;
        }

        public Criteria andAnnex8IsNull() {
            addCriterion("annex8 is null");
            return (Criteria) this;
        }

        public Criteria andAnnex8IsNotNull() {
            addCriterion("annex8 is not null");
            return (Criteria) this;
        }

        public Criteria andAnnex8EqualTo(String value) {
            addCriterion("annex8 =", value, "annex8");
            return (Criteria) this;
        }

        public Criteria andAnnex8NotEqualTo(String value) {
            addCriterion("annex8 <>", value, "annex8");
            return (Criteria) this;
        }

        public Criteria andAnnex8GreaterThan(String value) {
            addCriterion("annex8 >", value, "annex8");
            return (Criteria) this;
        }

        public Criteria andAnnex8GreaterThanOrEqualTo(String value) {
            addCriterion("annex8 >=", value, "annex8");
            return (Criteria) this;
        }

        public Criteria andAnnex8LessThan(String value) {
            addCriterion("annex8 <", value, "annex8");
            return (Criteria) this;
        }

        public Criteria andAnnex8LessThanOrEqualTo(String value) {
            addCriterion("annex8 <=", value, "annex8");
            return (Criteria) this;
        }

        public Criteria andAnnex8Like(String value) {
            addCriterion("annex8 like", value, "annex8");
            return (Criteria) this;
        }

        public Criteria andAnnex8NotLike(String value) {
            addCriterion("annex8 not like", value, "annex8");
            return (Criteria) this;
        }

        public Criteria andAnnex8In(List<String> values) {
            addCriterion("annex8 in", values, "annex8");
            return (Criteria) this;
        }

        public Criteria andAnnex8NotIn(List<String> values) {
            addCriterion("annex8 not in", values, "annex8");
            return (Criteria) this;
        }

        public Criteria andAnnex8Between(String value1, String value2) {
            addCriterion("annex8 between", value1, value2, "annex8");
            return (Criteria) this;
        }

        public Criteria andAnnex8NotBetween(String value1, String value2) {
            addCriterion("annex8 not between", value1, value2, "annex8");
            return (Criteria) this;
        }

        public Criteria andAnnex9IsNull() {
            addCriterion("annex9 is null");
            return (Criteria) this;
        }

        public Criteria andAnnex9IsNotNull() {
            addCriterion("annex9 is not null");
            return (Criteria) this;
        }

        public Criteria andAnnex9EqualTo(String value) {
            addCriterion("annex9 =", value, "annex9");
            return (Criteria) this;
        }

        public Criteria andAnnex9NotEqualTo(String value) {
            addCriterion("annex9 <>", value, "annex9");
            return (Criteria) this;
        }

        public Criteria andAnnex9GreaterThan(String value) {
            addCriterion("annex9 >", value, "annex9");
            return (Criteria) this;
        }

        public Criteria andAnnex9GreaterThanOrEqualTo(String value) {
            addCriterion("annex9 >=", value, "annex9");
            return (Criteria) this;
        }

        public Criteria andAnnex9LessThan(String value) {
            addCriterion("annex9 <", value, "annex9");
            return (Criteria) this;
        }

        public Criteria andAnnex9LessThanOrEqualTo(String value) {
            addCriterion("annex9 <=", value, "annex9");
            return (Criteria) this;
        }

        public Criteria andAnnex9Like(String value) {
            addCriterion("annex9 like", value, "annex9");
            return (Criteria) this;
        }

        public Criteria andAnnex9NotLike(String value) {
            addCriterion("annex9 not like", value, "annex9");
            return (Criteria) this;
        }

        public Criteria andAnnex9In(List<String> values) {
            addCriterion("annex9 in", values, "annex9");
            return (Criteria) this;
        }

        public Criteria andAnnex9NotIn(List<String> values) {
            addCriterion("annex9 not in", values, "annex9");
            return (Criteria) this;
        }

        public Criteria andAnnex9Between(String value1, String value2) {
            addCriterion("annex9 between", value1, value2, "annex9");
            return (Criteria) this;
        }

        public Criteria andAnnex9NotBetween(String value1, String value2) {
            addCriterion("annex9 not between", value1, value2, "annex9");
            return (Criteria) this;
        }

        public Criteria andAnnex10IsNull() {
            addCriterion("annex10 is null");
            return (Criteria) this;
        }

        public Criteria andAnnex10IsNotNull() {
            addCriterion("annex10 is not null");
            return (Criteria) this;
        }

        public Criteria andAnnex10EqualTo(String value) {
            addCriterion("annex10 =", value, "annex10");
            return (Criteria) this;
        }

        public Criteria andAnnex10NotEqualTo(String value) {
            addCriterion("annex10 <>", value, "annex10");
            return (Criteria) this;
        }

        public Criteria andAnnex10GreaterThan(String value) {
            addCriterion("annex10 >", value, "annex10");
            return (Criteria) this;
        }

        public Criteria andAnnex10GreaterThanOrEqualTo(String value) {
            addCriterion("annex10 >=", value, "annex10");
            return (Criteria) this;
        }

        public Criteria andAnnex10LessThan(String value) {
            addCriterion("annex10 <", value, "annex10");
            return (Criteria) this;
        }

        public Criteria andAnnex10LessThanOrEqualTo(String value) {
            addCriterion("annex10 <=", value, "annex10");
            return (Criteria) this;
        }

        public Criteria andAnnex10Like(String value) {
            addCriterion("annex10 like", value, "annex10");
            return (Criteria) this;
        }

        public Criteria andAnnex10NotLike(String value) {
            addCriterion("annex10 not like", value, "annex10");
            return (Criteria) this;
        }

        public Criteria andAnnex10In(List<String> values) {
            addCriterion("annex10 in", values, "annex10");
            return (Criteria) this;
        }

        public Criteria andAnnex10NotIn(List<String> values) {
            addCriterion("annex10 not in", values, "annex10");
            return (Criteria) this;
        }

        public Criteria andAnnex10Between(String value1, String value2) {
            addCriterion("annex10 between", value1, value2, "annex10");
            return (Criteria) this;
        }

        public Criteria andAnnex10NotBetween(String value1, String value2) {
            addCriterion("annex10 not between", value1, value2, "annex10");
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

        public Criteria andYjAgeLimitIsNull() {
            addCriterion("yj_age_limit is null");
            return (Criteria) this;
        }

        public Criteria andYjAgeLimitIsNotNull() {
            addCriterion("yj_age_limit is not null");
            return (Criteria) this;
        }

        public Criteria andYjAgeLimitEqualTo(String value) {
            addCriterion("yj_age_limit =", value, "yjAgeLimit");
            return (Criteria) this;
        }

        public Criteria andYjAgeLimitNotEqualTo(String value) {
            addCriterion("yj_age_limit <>", value, "yjAgeLimit");
            return (Criteria) this;
        }

        public Criteria andYjAgeLimitGreaterThan(String value) {
            addCriterion("yj_age_limit >", value, "yjAgeLimit");
            return (Criteria) this;
        }

        public Criteria andYjAgeLimitGreaterThanOrEqualTo(String value) {
            addCriterion("yj_age_limit >=", value, "yjAgeLimit");
            return (Criteria) this;
        }

        public Criteria andYjAgeLimitLessThan(String value) {
            addCriterion("yj_age_limit <", value, "yjAgeLimit");
            return (Criteria) this;
        }

        public Criteria andYjAgeLimitLessThanOrEqualTo(String value) {
            addCriterion("yj_age_limit <=", value, "yjAgeLimit");
            return (Criteria) this;
        }

        public Criteria andYjAgeLimitLike(String value) {
            addCriterion("yj_age_limit like", value, "yjAgeLimit");
            return (Criteria) this;
        }

        public Criteria andYjAgeLimitNotLike(String value) {
            addCriterion("yj_age_limit not like", value, "yjAgeLimit");
            return (Criteria) this;
        }

        public Criteria andYjAgeLimitIn(List<String> values) {
            addCriterion("yj_age_limit in", values, "yjAgeLimit");
            return (Criteria) this;
        }

        public Criteria andYjAgeLimitNotIn(List<String> values) {
            addCriterion("yj_age_limit not in", values, "yjAgeLimit");
            return (Criteria) this;
        }

        public Criteria andYjAgeLimitBetween(String value1, String value2) {
            addCriterion("yj_age_limit between", value1, value2, "yjAgeLimit");
            return (Criteria) this;
        }

        public Criteria andYjAgeLimitNotBetween(String value1, String value2) {
            addCriterion("yj_age_limit not between", value1, value2, "yjAgeLimit");
            return (Criteria) this;
        }

        public Criteria andRelationAdressIsNull() {
            addCriterion("relation_adress is null");
            return (Criteria) this;
        }

        public Criteria andRelationAdressIsNotNull() {
            addCriterion("relation_adress is not null");
            return (Criteria) this;
        }

        public Criteria andRelationAdressEqualTo(String value) {
            addCriterion("relation_adress =", value, "relationAdress");
            return (Criteria) this;
        }

        public Criteria andRelationAdressNotEqualTo(String value) {
            addCriterion("relation_adress <>", value, "relationAdress");
            return (Criteria) this;
        }

        public Criteria andRelationAdressGreaterThan(String value) {
            addCriterion("relation_adress >", value, "relationAdress");
            return (Criteria) this;
        }

        public Criteria andRelationAdressGreaterThanOrEqualTo(String value) {
            addCriterion("relation_adress >=", value, "relationAdress");
            return (Criteria) this;
        }

        public Criteria andRelationAdressLessThan(String value) {
            addCriterion("relation_adress <", value, "relationAdress");
            return (Criteria) this;
        }

        public Criteria andRelationAdressLessThanOrEqualTo(String value) {
            addCriterion("relation_adress <=", value, "relationAdress");
            return (Criteria) this;
        }

        public Criteria andRelationAdressLike(String value) {
            addCriterion("relation_adress like", value, "relationAdress");
            return (Criteria) this;
        }

        public Criteria andRelationAdressNotLike(String value) {
            addCriterion("relation_adress not like", value, "relationAdress");
            return (Criteria) this;
        }

        public Criteria andRelationAdressIn(List<String> values) {
            addCriterion("relation_adress in", values, "relationAdress");
            return (Criteria) this;
        }

        public Criteria andRelationAdressNotIn(List<String> values) {
            addCriterion("relation_adress not in", values, "relationAdress");
            return (Criteria) this;
        }

        public Criteria andRelationAdressBetween(String value1, String value2) {
            addCriterion("relation_adress between", value1, value2, "relationAdress");
            return (Criteria) this;
        }

        public Criteria andRelationAdressNotBetween(String value1, String value2) {
            addCriterion("relation_adress not between", value1, value2, "relationAdress");
            return (Criteria) this;
        }

        public Criteria andHouseNumIsNull() {
            addCriterion("house_num is null");
            return (Criteria) this;
        }

        public Criteria andHouseNumIsNotNull() {
            addCriterion("house_num is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNumEqualTo(Integer value) {
            addCriterion("house_num =", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumNotEqualTo(Integer value) {
            addCriterion("house_num <>", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumGreaterThan(Integer value) {
            addCriterion("house_num >", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_num >=", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumLessThan(Integer value) {
            addCriterion("house_num <", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumLessThanOrEqualTo(Integer value) {
            addCriterion("house_num <=", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumIn(List<Integer> values) {
            addCriterion("house_num in", values, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumNotIn(List<Integer> values) {
            addCriterion("house_num not in", values, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumBetween(Integer value1, Integer value2) {
            addCriterion("house_num between", value1, value2, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("house_num not between", value1, value2, "houseNum");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNull() {
            addCriterion("car_num is null");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNotNull() {
            addCriterion("car_num is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumEqualTo(Integer value) {
            addCriterion("car_num =", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotEqualTo(Integer value) {
            addCriterion("car_num <>", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThan(Integer value) {
            addCriterion("car_num >", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_num >=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThan(Integer value) {
            addCriterion("car_num <", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThanOrEqualTo(Integer value) {
            addCriterion("car_num <=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumIn(List<Integer> values) {
            addCriterion("car_num in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotIn(List<Integer> values) {
            addCriterion("car_num not in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumBetween(Integer value1, Integer value2) {
            addCriterion("car_num between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotBetween(Integer value1, Integer value2) {
            addCriterion("car_num not between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andBankLoanAmountIsNull() {
            addCriterion("bank_loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andBankLoanAmountIsNotNull() {
            addCriterion("bank_loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBankLoanAmountEqualTo(String value) {
            addCriterion("bank_loan_amount =", value, "bankLoanAmount");
            return (Criteria) this;
        }

        public Criteria andBankLoanAmountNotEqualTo(String value) {
            addCriterion("bank_loan_amount <>", value, "bankLoanAmount");
            return (Criteria) this;
        }

        public Criteria andBankLoanAmountGreaterThan(String value) {
            addCriterion("bank_loan_amount >", value, "bankLoanAmount");
            return (Criteria) this;
        }

        public Criteria andBankLoanAmountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_loan_amount >=", value, "bankLoanAmount");
            return (Criteria) this;
        }

        public Criteria andBankLoanAmountLessThan(String value) {
            addCriterion("bank_loan_amount <", value, "bankLoanAmount");
            return (Criteria) this;
        }

        public Criteria andBankLoanAmountLessThanOrEqualTo(String value) {
            addCriterion("bank_loan_amount <=", value, "bankLoanAmount");
            return (Criteria) this;
        }

        public Criteria andBankLoanAmountLike(String value) {
            addCriterion("bank_loan_amount like", value, "bankLoanAmount");
            return (Criteria) this;
        }

        public Criteria andBankLoanAmountNotLike(String value) {
            addCriterion("bank_loan_amount not like", value, "bankLoanAmount");
            return (Criteria) this;
        }

        public Criteria andBankLoanAmountIn(List<String> values) {
            addCriterion("bank_loan_amount in", values, "bankLoanAmount");
            return (Criteria) this;
        }

        public Criteria andBankLoanAmountNotIn(List<String> values) {
            addCriterion("bank_loan_amount not in", values, "bankLoanAmount");
            return (Criteria) this;
        }

        public Criteria andBankLoanAmountBetween(String value1, String value2) {
            addCriterion("bank_loan_amount between", value1, value2, "bankLoanAmount");
            return (Criteria) this;
        }

        public Criteria andBankLoanAmountNotBetween(String value1, String value2) {
            addCriterion("bank_loan_amount not between", value1, value2, "bankLoanAmount");
            return (Criteria) this;
        }

        public Criteria andOtherLiabilitiesAccountIsNull() {
            addCriterion("other_liabilities_account is null");
            return (Criteria) this;
        }

        public Criteria andOtherLiabilitiesAccountIsNotNull() {
            addCriterion("other_liabilities_account is not null");
            return (Criteria) this;
        }

        public Criteria andOtherLiabilitiesAccountEqualTo(String value) {
            addCriterion("other_liabilities_account =", value, "otherLiabilitiesAccount");
            return (Criteria) this;
        }

        public Criteria andOtherLiabilitiesAccountNotEqualTo(String value) {
            addCriterion("other_liabilities_account <>", value, "otherLiabilitiesAccount");
            return (Criteria) this;
        }

        public Criteria andOtherLiabilitiesAccountGreaterThan(String value) {
            addCriterion("other_liabilities_account >", value, "otherLiabilitiesAccount");
            return (Criteria) this;
        }

        public Criteria andOtherLiabilitiesAccountGreaterThanOrEqualTo(String value) {
            addCriterion("other_liabilities_account >=", value, "otherLiabilitiesAccount");
            return (Criteria) this;
        }

        public Criteria andOtherLiabilitiesAccountLessThan(String value) {
            addCriterion("other_liabilities_account <", value, "otherLiabilitiesAccount");
            return (Criteria) this;
        }

        public Criteria andOtherLiabilitiesAccountLessThanOrEqualTo(String value) {
            addCriterion("other_liabilities_account <=", value, "otherLiabilitiesAccount");
            return (Criteria) this;
        }

        public Criteria andOtherLiabilitiesAccountLike(String value) {
            addCriterion("other_liabilities_account like", value, "otherLiabilitiesAccount");
            return (Criteria) this;
        }

        public Criteria andOtherLiabilitiesAccountNotLike(String value) {
            addCriterion("other_liabilities_account not like", value, "otherLiabilitiesAccount");
            return (Criteria) this;
        }

        public Criteria andOtherLiabilitiesAccountIn(List<String> values) {
            addCriterion("other_liabilities_account in", values, "otherLiabilitiesAccount");
            return (Criteria) this;
        }

        public Criteria andOtherLiabilitiesAccountNotIn(List<String> values) {
            addCriterion("other_liabilities_account not in", values, "otherLiabilitiesAccount");
            return (Criteria) this;
        }

        public Criteria andOtherLiabilitiesAccountBetween(String value1, String value2) {
            addCriterion("other_liabilities_account between", value1, value2, "otherLiabilitiesAccount");
            return (Criteria) this;
        }

        public Criteria andOtherLiabilitiesAccountNotBetween(String value1, String value2) {
            addCriterion("other_liabilities_account not between", value1, value2, "otherLiabilitiesAccount");
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

        public Criteria andCustomerNumberIsNull() {
            addCriterion("customer_number is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberIsNotNull() {
            addCriterion("customer_number is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberEqualTo(String value) {
            addCriterion("customer_number =", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotEqualTo(String value) {
            addCriterion("customer_number <>", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberGreaterThan(String value) {
            addCriterion("customer_number >", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberGreaterThanOrEqualTo(String value) {
            addCriterion("customer_number >=", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberLessThan(String value) {
            addCriterion("customer_number <", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberLessThanOrEqualTo(String value) {
            addCriterion("customer_number <=", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberLike(String value) {
            addCriterion("customer_number like", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotLike(String value) {
            addCriterion("customer_number not like", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberIn(List<String> values) {
            addCriterion("customer_number in", values, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotIn(List<String> values) {
            addCriterion("customer_number not in", values, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberBetween(String value1, String value2) {
            addCriterion("customer_number between", value1, value2, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotBetween(String value1, String value2) {
            addCriterion("customer_number not between", value1, value2, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andReferredIsNull() {
            addCriterion("referred is null");
            return (Criteria) this;
        }

        public Criteria andReferredIsNotNull() {
            addCriterion("referred is not null");
            return (Criteria) this;
        }

        public Criteria andReferredEqualTo(String value) {
            addCriterion("referred =", value, "referred");
            return (Criteria) this;
        }

        public Criteria andReferredNotEqualTo(String value) {
            addCriterion("referred <>", value, "referred");
            return (Criteria) this;
        }

        public Criteria andReferredGreaterThan(String value) {
            addCriterion("referred >", value, "referred");
            return (Criteria) this;
        }

        public Criteria andReferredGreaterThanOrEqualTo(String value) {
            addCriterion("referred >=", value, "referred");
            return (Criteria) this;
        }

        public Criteria andReferredLessThan(String value) {
            addCriterion("referred <", value, "referred");
            return (Criteria) this;
        }

        public Criteria andReferredLessThanOrEqualTo(String value) {
            addCriterion("referred <=", value, "referred");
            return (Criteria) this;
        }

        public Criteria andReferredLike(String value) {
            addCriterion("referred like", value, "referred");
            return (Criteria) this;
        }

        public Criteria andReferredNotLike(String value) {
            addCriterion("referred not like", value, "referred");
            return (Criteria) this;
        }

        public Criteria andReferredIn(List<String> values) {
            addCriterion("referred in", values, "referred");
            return (Criteria) this;
        }

        public Criteria andReferredNotIn(List<String> values) {
            addCriterion("referred not in", values, "referred");
            return (Criteria) this;
        }

        public Criteria andReferredBetween(String value1, String value2) {
            addCriterion("referred between", value1, value2, "referred");
            return (Criteria) this;
        }

        public Criteria andReferredNotBetween(String value1, String value2) {
            addCriterion("referred not between", value1, value2, "referred");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIsNull() {
            addCriterion("enterprise_type is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIsNotNull() {
            addCriterion("enterprise_type is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeEqualTo(String value) {
            addCriterion("enterprise_type =", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotEqualTo(String value) {
            addCriterion("enterprise_type <>", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeGreaterThan(String value) {
            addCriterion("enterprise_type >", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_type >=", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLessThan(String value) {
            addCriterion("enterprise_type <", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLessThanOrEqualTo(String value) {
            addCriterion("enterprise_type <=", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLike(String value) {
            addCriterion("enterprise_type like", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotLike(String value) {
            addCriterion("enterprise_type not like", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIn(List<String> values) {
            addCriterion("enterprise_type in", values, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotIn(List<String> values) {
            addCriterion("enterprise_type not in", values, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeBetween(String value1, String value2) {
            addCriterion("enterprise_type between", value1, value2, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotBetween(String value1, String value2) {
            addCriterion("enterprise_type not between", value1, value2, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIsNull() {
            addCriterion("legal_representative is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIsNotNull() {
            addCriterion("legal_representative is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeEqualTo(String value) {
            addCriterion("legal_representative =", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotEqualTo(String value) {
            addCriterion("legal_representative <>", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeGreaterThan(String value) {
            addCriterion("legal_representative >", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative >=", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLessThan(String value) {
            addCriterion("legal_representative <", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLessThanOrEqualTo(String value) {
            addCriterion("legal_representative <=", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLike(String value) {
            addCriterion("legal_representative like", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotLike(String value) {
            addCriterion("legal_representative not like", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIn(List<String> values) {
            addCriterion("legal_representative in", values, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotIn(List<String> values) {
            addCriterion("legal_representative not in", values, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeBetween(String value1, String value2) {
            addCriterion("legal_representative between", value1, value2, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotBetween(String value1, String value2) {
            addCriterion("legal_representative not between", value1, value2, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificatNumberIsNull() {
            addCriterion("legal_person_certificat_number is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificatNumberIsNotNull() {
            addCriterion("legal_person_certificat_number is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificatNumberEqualTo(String value) {
            addCriterion("legal_person_certificat_number =", value, "legalPersonCertificatNumber");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificatNumberNotEqualTo(String value) {
            addCriterion("legal_person_certificat_number <>", value, "legalPersonCertificatNumber");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificatNumberGreaterThan(String value) {
            addCriterion("legal_person_certificat_number >", value, "legalPersonCertificatNumber");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificatNumberGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person_certificat_number >=", value, "legalPersonCertificatNumber");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificatNumberLessThan(String value) {
            addCriterion("legal_person_certificat_number <", value, "legalPersonCertificatNumber");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificatNumberLessThanOrEqualTo(String value) {
            addCriterion("legal_person_certificat_number <=", value, "legalPersonCertificatNumber");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificatNumberLike(String value) {
            addCriterion("legal_person_certificat_number like", value, "legalPersonCertificatNumber");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificatNumberNotLike(String value) {
            addCriterion("legal_person_certificat_number not like", value, "legalPersonCertificatNumber");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificatNumberIn(List<String> values) {
            addCriterion("legal_person_certificat_number in", values, "legalPersonCertificatNumber");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificatNumberNotIn(List<String> values) {
            addCriterion("legal_person_certificat_number not in", values, "legalPersonCertificatNumber");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificatNumberBetween(String value1, String value2) {
            addCriterion("legal_person_certificat_number between", value1, value2, "legalPersonCertificatNumber");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificatNumberNotBetween(String value1, String value2) {
            addCriterion("legal_person_certificat_number not between", value1, value2, "legalPersonCertificatNumber");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPositionIsNull() {
            addCriterion("legal_person_position is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPositionIsNotNull() {
            addCriterion("legal_person_position is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPositionEqualTo(String value) {
            addCriterion("legal_person_position =", value, "legalPersonPosition");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPositionNotEqualTo(String value) {
            addCriterion("legal_person_position <>", value, "legalPersonPosition");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPositionGreaterThan(String value) {
            addCriterion("legal_person_position >", value, "legalPersonPosition");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPositionGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person_position >=", value, "legalPersonPosition");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPositionLessThan(String value) {
            addCriterion("legal_person_position <", value, "legalPersonPosition");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPositionLessThanOrEqualTo(String value) {
            addCriterion("legal_person_position <=", value, "legalPersonPosition");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPositionLike(String value) {
            addCriterion("legal_person_position like", value, "legalPersonPosition");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPositionNotLike(String value) {
            addCriterion("legal_person_position not like", value, "legalPersonPosition");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPositionIn(List<String> values) {
            addCriterion("legal_person_position in", values, "legalPersonPosition");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPositionNotIn(List<String> values) {
            addCriterion("legal_person_position not in", values, "legalPersonPosition");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPositionBetween(String value1, String value2) {
            addCriterion("legal_person_position between", value1, value2, "legalPersonPosition");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPositionNotBetween(String value1, String value2) {
            addCriterion("legal_person_position not between", value1, value2, "legalPersonPosition");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeIsNull() {
            addCriterion("registration_time is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeIsNotNull() {
            addCriterion("registration_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeEqualTo(Date value) {
            addCriterion("registration_time =", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeNotEqualTo(Date value) {
            addCriterion("registration_time <>", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeGreaterThan(Date value) {
            addCriterion("registration_time >", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registration_time >=", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeLessThan(Date value) {
            addCriterion("registration_time <", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeLessThanOrEqualTo(Date value) {
            addCriterion("registration_time <=", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeIn(List<Date> values) {
            addCriterion("registration_time in", values, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeNotIn(List<Date> values) {
            addCriterion("registration_time not in", values, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeBetween(Date value1, Date value2) {
            addCriterion("registration_time between", value1, value2, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeNotBetween(Date value1, Date value2) {
            addCriterion("registration_time not between", value1, value2, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNull() {
            addCriterion("registered_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNotNull() {
            addCriterion("registered_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalEqualTo(Long value) {
            addCriterion("registered_capital =", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotEqualTo(Long value) {
            addCriterion("registered_capital <>", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThan(Long value) {
            addCriterion("registered_capital >", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThanOrEqualTo(Long value) {
            addCriterion("registered_capital >=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThan(Long value) {
            addCriterion("registered_capital <", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThanOrEqualTo(Long value) {
            addCriterion("registered_capital <=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIn(List<Long> values) {
            addCriterion("registered_capital in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotIn(List<Long> values) {
            addCriterion("registered_capital not in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalBetween(Long value1, Long value2) {
            addCriterion("registered_capital between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotBetween(Long value1, Long value2) {
            addCriterion("registered_capital not between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andActuallyRealizedCapitalIsNull() {
            addCriterion("actually_realized_capital is null");
            return (Criteria) this;
        }

        public Criteria andActuallyRealizedCapitalIsNotNull() {
            addCriterion("actually_realized_capital is not null");
            return (Criteria) this;
        }

        public Criteria andActuallyRealizedCapitalEqualTo(Long value) {
            addCriterion("actually_realized_capital =", value, "actuallyRealizedCapital");
            return (Criteria) this;
        }

        public Criteria andActuallyRealizedCapitalNotEqualTo(Long value) {
            addCriterion("actually_realized_capital <>", value, "actuallyRealizedCapital");
            return (Criteria) this;
        }

        public Criteria andActuallyRealizedCapitalGreaterThan(Long value) {
            addCriterion("actually_realized_capital >", value, "actuallyRealizedCapital");
            return (Criteria) this;
        }

        public Criteria andActuallyRealizedCapitalGreaterThanOrEqualTo(Long value) {
            addCriterion("actually_realized_capital >=", value, "actuallyRealizedCapital");
            return (Criteria) this;
        }

        public Criteria andActuallyRealizedCapitalLessThan(Long value) {
            addCriterion("actually_realized_capital <", value, "actuallyRealizedCapital");
            return (Criteria) this;
        }

        public Criteria andActuallyRealizedCapitalLessThanOrEqualTo(Long value) {
            addCriterion("actually_realized_capital <=", value, "actuallyRealizedCapital");
            return (Criteria) this;
        }

        public Criteria andActuallyRealizedCapitalIn(List<Long> values) {
            addCriterion("actually_realized_capital in", values, "actuallyRealizedCapital");
            return (Criteria) this;
        }

        public Criteria andActuallyRealizedCapitalNotIn(List<Long> values) {
            addCriterion("actually_realized_capital not in", values, "actuallyRealizedCapital");
            return (Criteria) this;
        }

        public Criteria andActuallyRealizedCapitalBetween(Long value1, Long value2) {
            addCriterion("actually_realized_capital between", value1, value2, "actuallyRealizedCapital");
            return (Criteria) this;
        }

        public Criteria andActuallyRealizedCapitalNotBetween(Long value1, Long value2) {
            addCriterion("actually_realized_capital not between", value1, value2, "actuallyRealizedCapital");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNull() {
            addCriterion("certificate_type is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("certificate_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(String value) {
            addCriterion("certificate_type =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(String value) {
            addCriterion("certificate_type <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(String value) {
            addCriterion("certificate_type >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_type >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(String value) {
            addCriterion("certificate_type <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(String value) {
            addCriterion("certificate_type <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLike(String value) {
            addCriterion("certificate_type like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotLike(String value) {
            addCriterion("certificate_type not like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<String> values) {
            addCriterion("certificate_type in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<String> values) {
            addCriterion("certificate_type not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(String value1, String value2) {
            addCriterion("certificate_type between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(String value1, String value2) {
            addCriterion("certificate_type not between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveStartDateIsNull() {
            addCriterion("business_license_effective_start_date is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveStartDateIsNotNull() {
            addCriterion("business_license_effective_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveStartDateEqualTo(Date value) {
            addCriterion("business_license_effective_start_date =", value, "businessLicenseEffectiveStartDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveStartDateNotEqualTo(Date value) {
            addCriterion("business_license_effective_start_date <>", value, "businessLicenseEffectiveStartDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveStartDateGreaterThan(Date value) {
            addCriterion("business_license_effective_start_date >", value, "businessLicenseEffectiveStartDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("business_license_effective_start_date >=", value, "businessLicenseEffectiveStartDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveStartDateLessThan(Date value) {
            addCriterion("business_license_effective_start_date <", value, "businessLicenseEffectiveStartDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveStartDateLessThanOrEqualTo(Date value) {
            addCriterion("business_license_effective_start_date <=", value, "businessLicenseEffectiveStartDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveStartDateIn(List<Date> values) {
            addCriterion("business_license_effective_start_date in", values, "businessLicenseEffectiveStartDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveStartDateNotIn(List<Date> values) {
            addCriterion("business_license_effective_start_date not in", values, "businessLicenseEffectiveStartDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveStartDateBetween(Date value1, Date value2) {
            addCriterion("business_license_effective_start_date between", value1, value2, "businessLicenseEffectiveStartDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveStartDateNotBetween(Date value1, Date value2) {
            addCriterion("business_license_effective_start_date not between", value1, value2, "businessLicenseEffectiveStartDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveEndDateIsNull() {
            addCriterion("business_license_effective_end_date is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveEndDateIsNotNull() {
            addCriterion("business_license_effective_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveEndDateEqualTo(Date value) {
            addCriterion("business_license_effective_end_date =", value, "businessLicenseEffectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveEndDateNotEqualTo(Date value) {
            addCriterion("business_license_effective_end_date <>", value, "businessLicenseEffectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveEndDateGreaterThan(Date value) {
            addCriterion("business_license_effective_end_date >", value, "businessLicenseEffectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("business_license_effective_end_date >=", value, "businessLicenseEffectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveEndDateLessThan(Date value) {
            addCriterion("business_license_effective_end_date <", value, "businessLicenseEffectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveEndDateLessThanOrEqualTo(Date value) {
            addCriterion("business_license_effective_end_date <=", value, "businessLicenseEffectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveEndDateIn(List<Date> values) {
            addCriterion("business_license_effective_end_date in", values, "businessLicenseEffectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveEndDateNotIn(List<Date> values) {
            addCriterion("business_license_effective_end_date not in", values, "businessLicenseEffectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveEndDateBetween(Date value1, Date value2) {
            addCriterion("business_license_effective_end_date between", value1, value2, "businessLicenseEffectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEffectiveEndDateNotBetween(Date value1, Date value2) {
            addCriterion("business_license_effective_end_date not between", value1, value2, "businessLicenseEffectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andLatestAnnualInspectionIsNull() {
            addCriterion("latest_annual_inspection is null");
            return (Criteria) this;
        }

        public Criteria andLatestAnnualInspectionIsNotNull() {
            addCriterion("latest_annual_inspection is not null");
            return (Criteria) this;
        }

        public Criteria andLatestAnnualInspectionEqualTo(Date value) {
            addCriterion("latest_annual_inspection =", value, "latestAnnualInspection");
            return (Criteria) this;
        }

        public Criteria andLatestAnnualInspectionNotEqualTo(Date value) {
            addCriterion("latest_annual_inspection <>", value, "latestAnnualInspection");
            return (Criteria) this;
        }

        public Criteria andLatestAnnualInspectionGreaterThan(Date value) {
            addCriterion("latest_annual_inspection >", value, "latestAnnualInspection");
            return (Criteria) this;
        }

        public Criteria andLatestAnnualInspectionGreaterThanOrEqualTo(Date value) {
            addCriterion("latest_annual_inspection >=", value, "latestAnnualInspection");
            return (Criteria) this;
        }

        public Criteria andLatestAnnualInspectionLessThan(Date value) {
            addCriterion("latest_annual_inspection <", value, "latestAnnualInspection");
            return (Criteria) this;
        }

        public Criteria andLatestAnnualInspectionLessThanOrEqualTo(Date value) {
            addCriterion("latest_annual_inspection <=", value, "latestAnnualInspection");
            return (Criteria) this;
        }

        public Criteria andLatestAnnualInspectionIn(List<Date> values) {
            addCriterion("latest_annual_inspection in", values, "latestAnnualInspection");
            return (Criteria) this;
        }

        public Criteria andLatestAnnualInspectionNotIn(List<Date> values) {
            addCriterion("latest_annual_inspection not in", values, "latestAnnualInspection");
            return (Criteria) this;
        }

        public Criteria andLatestAnnualInspectionBetween(Date value1, Date value2) {
            addCriterion("latest_annual_inspection between", value1, value2, "latestAnnualInspection");
            return (Criteria) this;
        }

        public Criteria andLatestAnnualInspectionNotBetween(Date value1, Date value2) {
            addCriterion("latest_annual_inspection not between", value1, value2, "latestAnnualInspection");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodIsNull() {
            addCriterion("business_period is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodIsNotNull() {
            addCriterion("business_period is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodEqualTo(Date value) {
            addCriterion("business_period =", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodNotEqualTo(Date value) {
            addCriterion("business_period <>", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodGreaterThan(Date value) {
            addCriterion("business_period >", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodGreaterThanOrEqualTo(Date value) {
            addCriterion("business_period >=", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodLessThan(Date value) {
            addCriterion("business_period <", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodLessThanOrEqualTo(Date value) {
            addCriterion("business_period <=", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodIn(List<Date> values) {
            addCriterion("business_period in", values, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodNotIn(List<Date> values) {
            addCriterion("business_period not in", values, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodBetween(Date value1, Date value2) {
            addCriterion("business_period between", value1, value2, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodNotBetween(Date value1, Date value2) {
            addCriterion("business_period not between", value1, value2, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodEndIsNull() {
            addCriterion("business_period_end is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodEndIsNotNull() {
            addCriterion("business_period_end is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodEndEqualTo(String value) {
            addCriterion("business_period_end =", value, "businessPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodEndNotEqualTo(String value) {
            addCriterion("business_period_end <>", value, "businessPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodEndGreaterThan(String value) {
            addCriterion("business_period_end >", value, "businessPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodEndGreaterThanOrEqualTo(String value) {
            addCriterion("business_period_end >=", value, "businessPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodEndLessThan(String value) {
            addCriterion("business_period_end <", value, "businessPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodEndLessThanOrEqualTo(String value) {
            addCriterion("business_period_end <=", value, "businessPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodEndLike(String value) {
            addCriterion("business_period_end like", value, "businessPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodEndNotLike(String value) {
            addCriterion("business_period_end not like", value, "businessPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodEndIn(List<String> values) {
            addCriterion("business_period_end in", values, "businessPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodEndNotIn(List<String> values) {
            addCriterion("business_period_end not in", values, "businessPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodEndBetween(String value1, String value2) {
            addCriterion("business_period_end between", value1, value2, "businessPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodEndNotBetween(String value1, String value2) {
            addCriterion("business_period_end not between", value1, value2, "businessPeriodEnd");
            return (Criteria) this;
        }

        public Criteria andCompaniesNumberIsNull() {
            addCriterion("companies_number is null");
            return (Criteria) this;
        }

        public Criteria andCompaniesNumberIsNotNull() {
            addCriterion("companies_number is not null");
            return (Criteria) this;
        }

        public Criteria andCompaniesNumberEqualTo(Integer value) {
            addCriterion("companies_number =", value, "companiesNumber");
            return (Criteria) this;
        }

        public Criteria andCompaniesNumberNotEqualTo(Integer value) {
            addCriterion("companies_number <>", value, "companiesNumber");
            return (Criteria) this;
        }

        public Criteria andCompaniesNumberGreaterThan(Integer value) {
            addCriterion("companies_number >", value, "companiesNumber");
            return (Criteria) this;
        }

        public Criteria andCompaniesNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("companies_number >=", value, "companiesNumber");
            return (Criteria) this;
        }

        public Criteria andCompaniesNumberLessThan(Integer value) {
            addCriterion("companies_number <", value, "companiesNumber");
            return (Criteria) this;
        }

        public Criteria andCompaniesNumberLessThanOrEqualTo(Integer value) {
            addCriterion("companies_number <=", value, "companiesNumber");
            return (Criteria) this;
        }

        public Criteria andCompaniesNumberIn(List<Integer> values) {
            addCriterion("companies_number in", values, "companiesNumber");
            return (Criteria) this;
        }

        public Criteria andCompaniesNumberNotIn(List<Integer> values) {
            addCriterion("companies_number not in", values, "companiesNumber");
            return (Criteria) this;
        }

        public Criteria andCompaniesNumberBetween(Integer value1, Integer value2) {
            addCriterion("companies_number between", value1, value2, "companiesNumber");
            return (Criteria) this;
        }

        public Criteria andCompaniesNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("companies_number not between", value1, value2, "companiesNumber");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumberIsNull() {
            addCriterion("credit_card_number is null");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumberIsNotNull() {
            addCriterion("credit_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumberEqualTo(String value) {
            addCriterion("credit_card_number =", value, "creditCardNumber");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumberNotEqualTo(String value) {
            addCriterion("credit_card_number <>", value, "creditCardNumber");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumberGreaterThan(String value) {
            addCriterion("credit_card_number >", value, "creditCardNumber");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("credit_card_number >=", value, "creditCardNumber");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumberLessThan(String value) {
            addCriterion("credit_card_number <", value, "creditCardNumber");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumberLessThanOrEqualTo(String value) {
            addCriterion("credit_card_number <=", value, "creditCardNumber");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumberLike(String value) {
            addCriterion("credit_card_number like", value, "creditCardNumber");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumberNotLike(String value) {
            addCriterion("credit_card_number not like", value, "creditCardNumber");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumberIn(List<String> values) {
            addCriterion("credit_card_number in", values, "creditCardNumber");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumberNotIn(List<String> values) {
            addCriterion("credit_card_number not in", values, "creditCardNumber");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumberBetween(String value1, String value2) {
            addCriterion("credit_card_number between", value1, value2, "creditCardNumber");
            return (Criteria) this;
        }

        public Criteria andCreditCardNumberNotBetween(String value1, String value2) {
            addCriterion("credit_card_number not between", value1, value2, "creditCardNumber");
            return (Criteria) this;
        }

        public Criteria andTissueTypesIsNull() {
            addCriterion("tissue_types is null");
            return (Criteria) this;
        }

        public Criteria andTissueTypesIsNotNull() {
            addCriterion("tissue_types is not null");
            return (Criteria) this;
        }

        public Criteria andTissueTypesEqualTo(String value) {
            addCriterion("tissue_types =", value, "tissueTypes");
            return (Criteria) this;
        }

        public Criteria andTissueTypesNotEqualTo(String value) {
            addCriterion("tissue_types <>", value, "tissueTypes");
            return (Criteria) this;
        }

        public Criteria andTissueTypesGreaterThan(String value) {
            addCriterion("tissue_types >", value, "tissueTypes");
            return (Criteria) this;
        }

        public Criteria andTissueTypesGreaterThanOrEqualTo(String value) {
            addCriterion("tissue_types >=", value, "tissueTypes");
            return (Criteria) this;
        }

        public Criteria andTissueTypesLessThan(String value) {
            addCriterion("tissue_types <", value, "tissueTypes");
            return (Criteria) this;
        }

        public Criteria andTissueTypesLessThanOrEqualTo(String value) {
            addCriterion("tissue_types <=", value, "tissueTypes");
            return (Criteria) this;
        }

        public Criteria andTissueTypesLike(String value) {
            addCriterion("tissue_types like", value, "tissueTypes");
            return (Criteria) this;
        }

        public Criteria andTissueTypesNotLike(String value) {
            addCriterion("tissue_types not like", value, "tissueTypes");
            return (Criteria) this;
        }

        public Criteria andTissueTypesIn(List<String> values) {
            addCriterion("tissue_types in", values, "tissueTypes");
            return (Criteria) this;
        }

        public Criteria andTissueTypesNotIn(List<String> values) {
            addCriterion("tissue_types not in", values, "tissueTypes");
            return (Criteria) this;
        }

        public Criteria andTissueTypesBetween(String value1, String value2) {
            addCriterion("tissue_types between", value1, value2, "tissueTypes");
            return (Criteria) this;
        }

        public Criteria andTissueTypesNotBetween(String value1, String value2) {
            addCriterion("tissue_types not between", value1, value2, "tissueTypes");
            return (Criteria) this;
        }

        public Criteria andSubordinateIndustryIsNull() {
            addCriterion("subordinate_industry is null");
            return (Criteria) this;
        }

        public Criteria andSubordinateIndustryIsNotNull() {
            addCriterion("subordinate_industry is not null");
            return (Criteria) this;
        }

        public Criteria andSubordinateIndustryEqualTo(String value) {
            addCriterion("subordinate_industry =", value, "subordinateIndustry");
            return (Criteria) this;
        }

        public Criteria andSubordinateIndustryNotEqualTo(String value) {
            addCriterion("subordinate_industry <>", value, "subordinateIndustry");
            return (Criteria) this;
        }

        public Criteria andSubordinateIndustryGreaterThan(String value) {
            addCriterion("subordinate_industry >", value, "subordinateIndustry");
            return (Criteria) this;
        }

        public Criteria andSubordinateIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("subordinate_industry >=", value, "subordinateIndustry");
            return (Criteria) this;
        }

        public Criteria andSubordinateIndustryLessThan(String value) {
            addCriterion("subordinate_industry <", value, "subordinateIndustry");
            return (Criteria) this;
        }

        public Criteria andSubordinateIndustryLessThanOrEqualTo(String value) {
            addCriterion("subordinate_industry <=", value, "subordinateIndustry");
            return (Criteria) this;
        }

        public Criteria andSubordinateIndustryLike(String value) {
            addCriterion("subordinate_industry like", value, "subordinateIndustry");
            return (Criteria) this;
        }

        public Criteria andSubordinateIndustryNotLike(String value) {
            addCriterion("subordinate_industry not like", value, "subordinateIndustry");
            return (Criteria) this;
        }

        public Criteria andSubordinateIndustryIn(List<String> values) {
            addCriterion("subordinate_industry in", values, "subordinateIndustry");
            return (Criteria) this;
        }

        public Criteria andSubordinateIndustryNotIn(List<String> values) {
            addCriterion("subordinate_industry not in", values, "subordinateIndustry");
            return (Criteria) this;
        }

        public Criteria andSubordinateIndustryBetween(String value1, String value2) {
            addCriterion("subordinate_industry between", value1, value2, "subordinateIndustry");
            return (Criteria) this;
        }

        public Criteria andSubordinateIndustryNotBetween(String value1, String value2) {
            addCriterion("subordinate_industry not between", value1, value2, "subordinateIndustry");
            return (Criteria) this;
        }

        public Criteria andBelongstoProvincesCitiesIsNull() {
            addCriterion("belongsto_provinces_cities is null");
            return (Criteria) this;
        }

        public Criteria andBelongstoProvincesCitiesIsNotNull() {
            addCriterion("belongsto_provinces_cities is not null");
            return (Criteria) this;
        }

        public Criteria andBelongstoProvincesCitiesEqualTo(String value) {
            addCriterion("belongsto_provinces_cities =", value, "belongstoProvincesCities");
            return (Criteria) this;
        }

        public Criteria andBelongstoProvincesCitiesNotEqualTo(String value) {
            addCriterion("belongsto_provinces_cities <>", value, "belongstoProvincesCities");
            return (Criteria) this;
        }

        public Criteria andBelongstoProvincesCitiesGreaterThan(String value) {
            addCriterion("belongsto_provinces_cities >", value, "belongstoProvincesCities");
            return (Criteria) this;
        }

        public Criteria andBelongstoProvincesCitiesGreaterThanOrEqualTo(String value) {
            addCriterion("belongsto_provinces_cities >=", value, "belongstoProvincesCities");
            return (Criteria) this;
        }

        public Criteria andBelongstoProvincesCitiesLessThan(String value) {
            addCriterion("belongsto_provinces_cities <", value, "belongstoProvincesCities");
            return (Criteria) this;
        }

        public Criteria andBelongstoProvincesCitiesLessThanOrEqualTo(String value) {
            addCriterion("belongsto_provinces_cities <=", value, "belongstoProvincesCities");
            return (Criteria) this;
        }

        public Criteria andBelongstoProvincesCitiesLike(String value) {
            addCriterion("belongsto_provinces_cities like", value, "belongstoProvincesCities");
            return (Criteria) this;
        }

        public Criteria andBelongstoProvincesCitiesNotLike(String value) {
            addCriterion("belongsto_provinces_cities not like", value, "belongstoProvincesCities");
            return (Criteria) this;
        }

        public Criteria andBelongstoProvincesCitiesIn(List<String> values) {
            addCriterion("belongsto_provinces_cities in", values, "belongstoProvincesCities");
            return (Criteria) this;
        }

        public Criteria andBelongstoProvincesCitiesNotIn(List<String> values) {
            addCriterion("belongsto_provinces_cities not in", values, "belongstoProvincesCities");
            return (Criteria) this;
        }

        public Criteria andBelongstoProvincesCitiesBetween(String value1, String value2) {
            addCriterion("belongsto_provinces_cities between", value1, value2, "belongstoProvincesCities");
            return (Criteria) this;
        }

        public Criteria andBelongstoProvincesCitiesNotBetween(String value1, String value2) {
            addCriterion("belongsto_provinces_cities not between", value1, value2, "belongstoProvincesCities");
            return (Criteria) this;
        }

        public Criteria andActualControllersIsNull() {
            addCriterion("actual_controllers is null");
            return (Criteria) this;
        }

        public Criteria andActualControllersIsNotNull() {
            addCriterion("actual_controllers is not null");
            return (Criteria) this;
        }

        public Criteria andActualControllersEqualTo(String value) {
            addCriterion("actual_controllers =", value, "actualControllers");
            return (Criteria) this;
        }

        public Criteria andActualControllersNotEqualTo(String value) {
            addCriterion("actual_controllers <>", value, "actualControllers");
            return (Criteria) this;
        }

        public Criteria andActualControllersGreaterThan(String value) {
            addCriterion("actual_controllers >", value, "actualControllers");
            return (Criteria) this;
        }

        public Criteria andActualControllersGreaterThanOrEqualTo(String value) {
            addCriterion("actual_controllers >=", value, "actualControllers");
            return (Criteria) this;
        }

        public Criteria andActualControllersLessThan(String value) {
            addCriterion("actual_controllers <", value, "actualControllers");
            return (Criteria) this;
        }

        public Criteria andActualControllersLessThanOrEqualTo(String value) {
            addCriterion("actual_controllers <=", value, "actualControllers");
            return (Criteria) this;
        }

        public Criteria andActualControllersLike(String value) {
            addCriterion("actual_controllers like", value, "actualControllers");
            return (Criteria) this;
        }

        public Criteria andActualControllersNotLike(String value) {
            addCriterion("actual_controllers not like", value, "actualControllers");
            return (Criteria) this;
        }

        public Criteria andActualControllersIn(List<String> values) {
            addCriterion("actual_controllers in", values, "actualControllers");
            return (Criteria) this;
        }

        public Criteria andActualControllersNotIn(List<String> values) {
            addCriterion("actual_controllers not in", values, "actualControllers");
            return (Criteria) this;
        }

        public Criteria andActualControllersBetween(String value1, String value2) {
            addCriterion("actual_controllers between", value1, value2, "actualControllers");
            return (Criteria) this;
        }

        public Criteria andActualControllersNotBetween(String value1, String value2) {
            addCriterion("actual_controllers not between", value1, value2, "actualControllers");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberIsNull() {
            addCriterion("fax_number is null");
            return (Criteria) this;
        }

        public Criteria andFaxNumberIsNotNull() {
            addCriterion("fax_number is not null");
            return (Criteria) this;
        }

        public Criteria andFaxNumberEqualTo(String value) {
            addCriterion("fax_number =", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberNotEqualTo(String value) {
            addCriterion("fax_number <>", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberGreaterThan(String value) {
            addCriterion("fax_number >", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberGreaterThanOrEqualTo(String value) {
            addCriterion("fax_number >=", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberLessThan(String value) {
            addCriterion("fax_number <", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberLessThanOrEqualTo(String value) {
            addCriterion("fax_number <=", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberLike(String value) {
            addCriterion("fax_number like", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberNotLike(String value) {
            addCriterion("fax_number not like", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberIn(List<String> values) {
            addCriterion("fax_number in", values, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberNotIn(List<String> values) {
            addCriterion("fax_number not in", values, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberBetween(String value1, String value2) {
            addCriterion("fax_number between", value1, value2, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberNotBetween(String value1, String value2) {
            addCriterion("fax_number not between", value1, value2, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberIsNull() {
            addCriterion("contact_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberIsNotNull() {
            addCriterion("contact_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberEqualTo(String value) {
            addCriterion("contact_phone_number =", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberNotEqualTo(String value) {
            addCriterion("contact_phone_number <>", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberGreaterThan(String value) {
            addCriterion("contact_phone_number >", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone_number >=", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberLessThan(String value) {
            addCriterion("contact_phone_number <", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("contact_phone_number <=", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberLike(String value) {
            addCriterion("contact_phone_number like", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberNotLike(String value) {
            addCriterion("contact_phone_number not like", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberIn(List<String> values) {
            addCriterion("contact_phone_number in", values, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberNotIn(List<String> values) {
            addCriterion("contact_phone_number not in", values, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberBetween(String value1, String value2) {
            addCriterion("contact_phone_number between", value1, value2, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("contact_phone_number not between", value1, value2, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressCitiesIsNull() {
            addCriterion("registered_address_cities is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressCitiesIsNotNull() {
            addCriterion("registered_address_cities is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressCitiesEqualTo(String value) {
            addCriterion("registered_address_cities =", value, "registeredAddressCities");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressCitiesNotEqualTo(String value) {
            addCriterion("registered_address_cities <>", value, "registeredAddressCities");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressCitiesGreaterThan(String value) {
            addCriterion("registered_address_cities >", value, "registeredAddressCities");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressCitiesGreaterThanOrEqualTo(String value) {
            addCriterion("registered_address_cities >=", value, "registeredAddressCities");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressCitiesLessThan(String value) {
            addCriterion("registered_address_cities <", value, "registeredAddressCities");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressCitiesLessThanOrEqualTo(String value) {
            addCriterion("registered_address_cities <=", value, "registeredAddressCities");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressCitiesLike(String value) {
            addCriterion("registered_address_cities like", value, "registeredAddressCities");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressCitiesNotLike(String value) {
            addCriterion("registered_address_cities not like", value, "registeredAddressCities");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressCitiesIn(List<String> values) {
            addCriterion("registered_address_cities in", values, "registeredAddressCities");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressCitiesNotIn(List<String> values) {
            addCriterion("registered_address_cities not in", values, "registeredAddressCities");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressCitiesBetween(String value1, String value2) {
            addCriterion("registered_address_cities between", value1, value2, "registeredAddressCities");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressCitiesNotBetween(String value1, String value2) {
            addCriterion("registered_address_cities not between", value1, value2, "registeredAddressCities");
            return (Criteria) this;
        }

        public Criteria andRegisteredZipCodeIsNull() {
            addCriterion("registered_zip_code is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredZipCodeIsNotNull() {
            addCriterion("registered_zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredZipCodeEqualTo(String value) {
            addCriterion("registered_zip_code =", value, "registeredZipCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredZipCodeNotEqualTo(String value) {
            addCriterion("registered_zip_code <>", value, "registeredZipCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredZipCodeGreaterThan(String value) {
            addCriterion("registered_zip_code >", value, "registeredZipCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("registered_zip_code >=", value, "registeredZipCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredZipCodeLessThan(String value) {
            addCriterion("registered_zip_code <", value, "registeredZipCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredZipCodeLessThanOrEqualTo(String value) {
            addCriterion("registered_zip_code <=", value, "registeredZipCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredZipCodeLike(String value) {
            addCriterion("registered_zip_code like", value, "registeredZipCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredZipCodeNotLike(String value) {
            addCriterion("registered_zip_code not like", value, "registeredZipCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredZipCodeIn(List<String> values) {
            addCriterion("registered_zip_code in", values, "registeredZipCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredZipCodeNotIn(List<String> values) {
            addCriterion("registered_zip_code not in", values, "registeredZipCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredZipCodeBetween(String value1, String value2) {
            addCriterion("registered_zip_code between", value1, value2, "registeredZipCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredZipCodeNotBetween(String value1, String value2) {
            addCriterion("registered_zip_code not between", value1, value2, "registeredZipCode");
            return (Criteria) this;
        }

        public Criteria andMainBusinessScopeIsNull() {
            addCriterion("main_business_scope is null");
            return (Criteria) this;
        }

        public Criteria andMainBusinessScopeIsNotNull() {
            addCriterion("main_business_scope is not null");
            return (Criteria) this;
        }

        public Criteria andMainBusinessScopeEqualTo(String value) {
            addCriterion("main_business_scope =", value, "mainBusinessScope");
            return (Criteria) this;
        }

        public Criteria andMainBusinessScopeNotEqualTo(String value) {
            addCriterion("main_business_scope <>", value, "mainBusinessScope");
            return (Criteria) this;
        }

        public Criteria andMainBusinessScopeGreaterThan(String value) {
            addCriterion("main_business_scope >", value, "mainBusinessScope");
            return (Criteria) this;
        }

        public Criteria andMainBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("main_business_scope >=", value, "mainBusinessScope");
            return (Criteria) this;
        }

        public Criteria andMainBusinessScopeLessThan(String value) {
            addCriterion("main_business_scope <", value, "mainBusinessScope");
            return (Criteria) this;
        }

        public Criteria andMainBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("main_business_scope <=", value, "mainBusinessScope");
            return (Criteria) this;
        }

        public Criteria andMainBusinessScopeLike(String value) {
            addCriterion("main_business_scope like", value, "mainBusinessScope");
            return (Criteria) this;
        }

        public Criteria andMainBusinessScopeNotLike(String value) {
            addCriterion("main_business_scope not like", value, "mainBusinessScope");
            return (Criteria) this;
        }

        public Criteria andMainBusinessScopeIn(List<String> values) {
            addCriterion("main_business_scope in", values, "mainBusinessScope");
            return (Criteria) this;
        }

        public Criteria andMainBusinessScopeNotIn(List<String> values) {
            addCriterion("main_business_scope not in", values, "mainBusinessScope");
            return (Criteria) this;
        }

        public Criteria andMainBusinessScopeBetween(String value1, String value2) {
            addCriterion("main_business_scope between", value1, value2, "mainBusinessScope");
            return (Criteria) this;
        }

        public Criteria andMainBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("main_business_scope not between", value1, value2, "mainBusinessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressCountiesIsNull() {
            addCriterion("business_address_counties is null");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressCountiesIsNotNull() {
            addCriterion("business_address_counties is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressCountiesEqualTo(String value) {
            addCriterion("business_address_counties =", value, "businessAddressCounties");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressCountiesNotEqualTo(String value) {
            addCriterion("business_address_counties <>", value, "businessAddressCounties");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressCountiesGreaterThan(String value) {
            addCriterion("business_address_counties >", value, "businessAddressCounties");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressCountiesGreaterThanOrEqualTo(String value) {
            addCriterion("business_address_counties >=", value, "businessAddressCounties");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressCountiesLessThan(String value) {
            addCriterion("business_address_counties <", value, "businessAddressCounties");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressCountiesLessThanOrEqualTo(String value) {
            addCriterion("business_address_counties <=", value, "businessAddressCounties");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressCountiesLike(String value) {
            addCriterion("business_address_counties like", value, "businessAddressCounties");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressCountiesNotLike(String value) {
            addCriterion("business_address_counties not like", value, "businessAddressCounties");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressCountiesIn(List<String> values) {
            addCriterion("business_address_counties in", values, "businessAddressCounties");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressCountiesNotIn(List<String> values) {
            addCriterion("business_address_counties not in", values, "businessAddressCounties");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressCountiesBetween(String value1, String value2) {
            addCriterion("business_address_counties between", value1, value2, "businessAddressCounties");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressCountiesNotBetween(String value1, String value2) {
            addCriterion("business_address_counties not between", value1, value2, "businessAddressCounties");
            return (Criteria) this;
        }

        public Criteria andLocalZipCodeIsNull() {
            addCriterion("local_zip_code is null");
            return (Criteria) this;
        }

        public Criteria andLocalZipCodeIsNotNull() {
            addCriterion("local_zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andLocalZipCodeEqualTo(String value) {
            addCriterion("local_zip_code =", value, "localZipCode");
            return (Criteria) this;
        }

        public Criteria andLocalZipCodeNotEqualTo(String value) {
            addCriterion("local_zip_code <>", value, "localZipCode");
            return (Criteria) this;
        }

        public Criteria andLocalZipCodeGreaterThan(String value) {
            addCriterion("local_zip_code >", value, "localZipCode");
            return (Criteria) this;
        }

        public Criteria andLocalZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("local_zip_code >=", value, "localZipCode");
            return (Criteria) this;
        }

        public Criteria andLocalZipCodeLessThan(String value) {
            addCriterion("local_zip_code <", value, "localZipCode");
            return (Criteria) this;
        }

        public Criteria andLocalZipCodeLessThanOrEqualTo(String value) {
            addCriterion("local_zip_code <=", value, "localZipCode");
            return (Criteria) this;
        }

        public Criteria andLocalZipCodeLike(String value) {
            addCriterion("local_zip_code like", value, "localZipCode");
            return (Criteria) this;
        }

        public Criteria andLocalZipCodeNotLike(String value) {
            addCriterion("local_zip_code not like", value, "localZipCode");
            return (Criteria) this;
        }

        public Criteria andLocalZipCodeIn(List<String> values) {
            addCriterion("local_zip_code in", values, "localZipCode");
            return (Criteria) this;
        }

        public Criteria andLocalZipCodeNotIn(List<String> values) {
            addCriterion("local_zip_code not in", values, "localZipCode");
            return (Criteria) this;
        }

        public Criteria andLocalZipCodeBetween(String value1, String value2) {
            addCriterion("local_zip_code between", value1, value2, "localZipCode");
            return (Criteria) this;
        }

        public Criteria andLocalZipCodeNotBetween(String value1, String value2) {
            addCriterion("local_zip_code not between", value1, value2, "localZipCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNull() {
            addCriterion("organization_code is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNotNull() {
            addCriterion("organization_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeEqualTo(String value) {
            addCriterion("organization_code =", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotEqualTo(String value) {
            addCriterion("organization_code <>", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThan(String value) {
            addCriterion("organization_code >", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("organization_code >=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThan(String value) {
            addCriterion("organization_code <", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThanOrEqualTo(String value) {
            addCriterion("organization_code <=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLike(String value) {
            addCriterion("organization_code like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotLike(String value) {
            addCriterion("organization_code not like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIn(List<String> values) {
            addCriterion("organization_code in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotIn(List<String> values) {
            addCriterion("organization_code not in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeBetween(String value1, String value2) {
            addCriterion("organization_code between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotBetween(String value1, String value2) {
            addCriterion("organization_code not between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNumberIsNull() {
            addCriterion("business_license_number is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNumberIsNotNull() {
            addCriterion("business_license_number is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNumberEqualTo(String value) {
            addCriterion("business_license_number =", value, "businessLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNumberNotEqualTo(String value) {
            addCriterion("business_license_number <>", value, "businessLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNumberGreaterThan(String value) {
            addCriterion("business_license_number >", value, "businessLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("business_license_number >=", value, "businessLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNumberLessThan(String value) {
            addCriterion("business_license_number <", value, "businessLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNumberLessThanOrEqualTo(String value) {
            addCriterion("business_license_number <=", value, "businessLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNumberLike(String value) {
            addCriterion("business_license_number like", value, "businessLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNumberNotLike(String value) {
            addCriterion("business_license_number not like", value, "businessLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNumberIn(List<String> values) {
            addCriterion("business_license_number in", values, "businessLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNumberNotIn(List<String> values) {
            addCriterion("business_license_number not in", values, "businessLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNumberBetween(String value1, String value2) {
            addCriterion("business_license_number between", value1, value2, "businessLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNumberNotBetween(String value1, String value2) {
            addCriterion("business_license_number not between", value1, value2, "businessLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andSpouseBirthdayIsNull() {
            addCriterion("spouse_birthday is null");
            return (Criteria) this;
        }

        public Criteria andSpouseBirthdayIsNotNull() {
            addCriterion("spouse_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseBirthdayEqualTo(Date value) {
            addCriterion("spouse_birthday =", value, "spouseBirthday");
            return (Criteria) this;
        }

        public Criteria andSpouseBirthdayNotEqualTo(Date value) {
            addCriterion("spouse_birthday <>", value, "spouseBirthday");
            return (Criteria) this;
        }

        public Criteria andSpouseBirthdayGreaterThan(Date value) {
            addCriterion("spouse_birthday >", value, "spouseBirthday");
            return (Criteria) this;
        }

        public Criteria andSpouseBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("spouse_birthday >=", value, "spouseBirthday");
            return (Criteria) this;
        }

        public Criteria andSpouseBirthdayLessThan(Date value) {
            addCriterion("spouse_birthday <", value, "spouseBirthday");
            return (Criteria) this;
        }

        public Criteria andSpouseBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("spouse_birthday <=", value, "spouseBirthday");
            return (Criteria) this;
        }

        public Criteria andSpouseBirthdayIn(List<Date> values) {
            addCriterion("spouse_birthday in", values, "spouseBirthday");
            return (Criteria) this;
        }

        public Criteria andSpouseBirthdayNotIn(List<Date> values) {
            addCriterion("spouse_birthday not in", values, "spouseBirthday");
            return (Criteria) this;
        }

        public Criteria andSpouseBirthdayBetween(Date value1, Date value2) {
            addCriterion("spouse_birthday between", value1, value2, "spouseBirthday");
            return (Criteria) this;
        }

        public Criteria andSpouseBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("spouse_birthday not between", value1, value2, "spouseBirthday");
            return (Criteria) this;
        }

        public Criteria andSpouseNameIsNull() {
            addCriterion("spouse_name is null");
            return (Criteria) this;
        }

        public Criteria andSpouseNameIsNotNull() {
            addCriterion("spouse_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseNameEqualTo(String value) {
            addCriterion("spouse_name =", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotEqualTo(String value) {
            addCriterion("spouse_name <>", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameGreaterThan(String value) {
            addCriterion("spouse_name >", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_name >=", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameLessThan(String value) {
            addCriterion("spouse_name <", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameLessThanOrEqualTo(String value) {
            addCriterion("spouse_name <=", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameLike(String value) {
            addCriterion("spouse_name like", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotLike(String value) {
            addCriterion("spouse_name not like", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameIn(List<String> values) {
            addCriterion("spouse_name in", values, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotIn(List<String> values) {
            addCriterion("spouse_name not in", values, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameBetween(String value1, String value2) {
            addCriterion("spouse_name between", value1, value2, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotBetween(String value1, String value2) {
            addCriterion("spouse_name not between", value1, value2, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseGenderIsNull() {
            addCriterion("spouse_gender is null");
            return (Criteria) this;
        }

        public Criteria andSpouseGenderIsNotNull() {
            addCriterion("spouse_gender is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseGenderEqualTo(String value) {
            addCriterion("spouse_gender =", value, "spouseGender");
            return (Criteria) this;
        }

        public Criteria andSpouseGenderNotEqualTo(String value) {
            addCriterion("spouse_gender <>", value, "spouseGender");
            return (Criteria) this;
        }

        public Criteria andSpouseGenderGreaterThan(String value) {
            addCriterion("spouse_gender >", value, "spouseGender");
            return (Criteria) this;
        }

        public Criteria andSpouseGenderGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_gender >=", value, "spouseGender");
            return (Criteria) this;
        }

        public Criteria andSpouseGenderLessThan(String value) {
            addCriterion("spouse_gender <", value, "spouseGender");
            return (Criteria) this;
        }

        public Criteria andSpouseGenderLessThanOrEqualTo(String value) {
            addCriterion("spouse_gender <=", value, "spouseGender");
            return (Criteria) this;
        }

        public Criteria andSpouseGenderLike(String value) {
            addCriterion("spouse_gender like", value, "spouseGender");
            return (Criteria) this;
        }

        public Criteria andSpouseGenderNotLike(String value) {
            addCriterion("spouse_gender not like", value, "spouseGender");
            return (Criteria) this;
        }

        public Criteria andSpouseGenderIn(List<String> values) {
            addCriterion("spouse_gender in", values, "spouseGender");
            return (Criteria) this;
        }

        public Criteria andSpouseGenderNotIn(List<String> values) {
            addCriterion("spouse_gender not in", values, "spouseGender");
            return (Criteria) this;
        }

        public Criteria andSpouseGenderBetween(String value1, String value2) {
            addCriterion("spouse_gender between", value1, value2, "spouseGender");
            return (Criteria) this;
        }

        public Criteria andSpouseGenderNotBetween(String value1, String value2) {
            addCriterion("spouse_gender not between", value1, value2, "spouseGender");
            return (Criteria) this;
        }

        public Criteria andSpouseDocumentTypeIsNull() {
            addCriterion("spouse_document_type is null");
            return (Criteria) this;
        }

        public Criteria andSpouseDocumentTypeIsNotNull() {
            addCriterion("spouse_document_type is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseDocumentTypeEqualTo(String value) {
            addCriterion("spouse_document_type =", value, "spouseDocumentType");
            return (Criteria) this;
        }

        public Criteria andSpouseDocumentTypeNotEqualTo(String value) {
            addCriterion("spouse_document_type <>", value, "spouseDocumentType");
            return (Criteria) this;
        }

        public Criteria andSpouseDocumentTypeGreaterThan(String value) {
            addCriterion("spouse_document_type >", value, "spouseDocumentType");
            return (Criteria) this;
        }

        public Criteria andSpouseDocumentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_document_type >=", value, "spouseDocumentType");
            return (Criteria) this;
        }

        public Criteria andSpouseDocumentTypeLessThan(String value) {
            addCriterion("spouse_document_type <", value, "spouseDocumentType");
            return (Criteria) this;
        }

        public Criteria andSpouseDocumentTypeLessThanOrEqualTo(String value) {
            addCriterion("spouse_document_type <=", value, "spouseDocumentType");
            return (Criteria) this;
        }

        public Criteria andSpouseDocumentTypeLike(String value) {
            addCriterion("spouse_document_type like", value, "spouseDocumentType");
            return (Criteria) this;
        }

        public Criteria andSpouseDocumentTypeNotLike(String value) {
            addCriterion("spouse_document_type not like", value, "spouseDocumentType");
            return (Criteria) this;
        }

        public Criteria andSpouseDocumentTypeIn(List<String> values) {
            addCriterion("spouse_document_type in", values, "spouseDocumentType");
            return (Criteria) this;
        }

        public Criteria andSpouseDocumentTypeNotIn(List<String> values) {
            addCriterion("spouse_document_type not in", values, "spouseDocumentType");
            return (Criteria) this;
        }

        public Criteria andSpouseDocumentTypeBetween(String value1, String value2) {
            addCriterion("spouse_document_type between", value1, value2, "spouseDocumentType");
            return (Criteria) this;
        }

        public Criteria andSpouseDocumentTypeNotBetween(String value1, String value2) {
            addCriterion("spouse_document_type not between", value1, value2, "spouseDocumentType");
            return (Criteria) this;
        }

        public Criteria andSpouseIdNumberIsNull() {
            addCriterion("spouse_id_number is null");
            return (Criteria) this;
        }

        public Criteria andSpouseIdNumberIsNotNull() {
            addCriterion("spouse_id_number is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseIdNumberEqualTo(String value) {
            addCriterion("spouse_id_number =", value, "spouseIdNumber");
            return (Criteria) this;
        }

        public Criteria andSpouseIdNumberNotEqualTo(String value) {
            addCriterion("spouse_id_number <>", value, "spouseIdNumber");
            return (Criteria) this;
        }

        public Criteria andSpouseIdNumberGreaterThan(String value) {
            addCriterion("spouse_id_number >", value, "spouseIdNumber");
            return (Criteria) this;
        }

        public Criteria andSpouseIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_id_number >=", value, "spouseIdNumber");
            return (Criteria) this;
        }

        public Criteria andSpouseIdNumberLessThan(String value) {
            addCriterion("spouse_id_number <", value, "spouseIdNumber");
            return (Criteria) this;
        }

        public Criteria andSpouseIdNumberLessThanOrEqualTo(String value) {
            addCriterion("spouse_id_number <=", value, "spouseIdNumber");
            return (Criteria) this;
        }

        public Criteria andSpouseIdNumberLike(String value) {
            addCriterion("spouse_id_number like", value, "spouseIdNumber");
            return (Criteria) this;
        }

        public Criteria andSpouseIdNumberNotLike(String value) {
            addCriterion("spouse_id_number not like", value, "spouseIdNumber");
            return (Criteria) this;
        }

        public Criteria andSpouseIdNumberIn(List<String> values) {
            addCriterion("spouse_id_number in", values, "spouseIdNumber");
            return (Criteria) this;
        }

        public Criteria andSpouseIdNumberNotIn(List<String> values) {
            addCriterion("spouse_id_number not in", values, "spouseIdNumber");
            return (Criteria) this;
        }

        public Criteria andSpouseIdNumberBetween(String value1, String value2) {
            addCriterion("spouse_id_number between", value1, value2, "spouseIdNumber");
            return (Criteria) this;
        }

        public Criteria andSpouseIdNumberNotBetween(String value1, String value2) {
            addCriterion("spouse_id_number not between", value1, value2, "spouseIdNumber");
            return (Criteria) this;
        }

        public Criteria andSpouseMobilePhoneIsNull() {
            addCriterion("spouse_mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andSpouseMobilePhoneIsNotNull() {
            addCriterion("spouse_mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseMobilePhoneEqualTo(String value) {
            addCriterion("spouse_mobile_phone =", value, "spouseMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSpouseMobilePhoneNotEqualTo(String value) {
            addCriterion("spouse_mobile_phone <>", value, "spouseMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSpouseMobilePhoneGreaterThan(String value) {
            addCriterion("spouse_mobile_phone >", value, "spouseMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSpouseMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_mobile_phone >=", value, "spouseMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSpouseMobilePhoneLessThan(String value) {
            addCriterion("spouse_mobile_phone <", value, "spouseMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSpouseMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("spouse_mobile_phone <=", value, "spouseMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSpouseMobilePhoneLike(String value) {
            addCriterion("spouse_mobile_phone like", value, "spouseMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSpouseMobilePhoneNotLike(String value) {
            addCriterion("spouse_mobile_phone not like", value, "spouseMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSpouseMobilePhoneIn(List<String> values) {
            addCriterion("spouse_mobile_phone in", values, "spouseMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSpouseMobilePhoneNotIn(List<String> values) {
            addCriterion("spouse_mobile_phone not in", values, "spouseMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSpouseMobilePhoneBetween(String value1, String value2) {
            addCriterion("spouse_mobile_phone between", value1, value2, "spouseMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSpouseMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("spouse_mobile_phone not between", value1, value2, "spouseMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSpouseUnitCodeIsNull() {
            addCriterion("spouse_unit_code is null");
            return (Criteria) this;
        }

        public Criteria andSpouseUnitCodeIsNotNull() {
            addCriterion("spouse_unit_code is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseUnitCodeEqualTo(String value) {
            addCriterion("spouse_unit_code =", value, "spouseUnitCode");
            return (Criteria) this;
        }

        public Criteria andSpouseUnitCodeNotEqualTo(String value) {
            addCriterion("spouse_unit_code <>", value, "spouseUnitCode");
            return (Criteria) this;
        }

        public Criteria andSpouseUnitCodeGreaterThan(String value) {
            addCriterion("spouse_unit_code >", value, "spouseUnitCode");
            return (Criteria) this;
        }

        public Criteria andSpouseUnitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_unit_code >=", value, "spouseUnitCode");
            return (Criteria) this;
        }

        public Criteria andSpouseUnitCodeLessThan(String value) {
            addCriterion("spouse_unit_code <", value, "spouseUnitCode");
            return (Criteria) this;
        }

        public Criteria andSpouseUnitCodeLessThanOrEqualTo(String value) {
            addCriterion("spouse_unit_code <=", value, "spouseUnitCode");
            return (Criteria) this;
        }

        public Criteria andSpouseUnitCodeLike(String value) {
            addCriterion("spouse_unit_code like", value, "spouseUnitCode");
            return (Criteria) this;
        }

        public Criteria andSpouseUnitCodeNotLike(String value) {
            addCriterion("spouse_unit_code not like", value, "spouseUnitCode");
            return (Criteria) this;
        }

        public Criteria andSpouseUnitCodeIn(List<String> values) {
            addCriterion("spouse_unit_code in", values, "spouseUnitCode");
            return (Criteria) this;
        }

        public Criteria andSpouseUnitCodeNotIn(List<String> values) {
            addCriterion("spouse_unit_code not in", values, "spouseUnitCode");
            return (Criteria) this;
        }

        public Criteria andSpouseUnitCodeBetween(String value1, String value2) {
            addCriterion("spouse_unit_code between", value1, value2, "spouseUnitCode");
            return (Criteria) this;
        }

        public Criteria andSpouseUnitCodeNotBetween(String value1, String value2) {
            addCriterion("spouse_unit_code not between", value1, value2, "spouseUnitCode");
            return (Criteria) this;
        }

        public Criteria andLastYearNetProfitIsNull() {
            addCriterion("last_year_net_profit is null");
            return (Criteria) this;
        }

        public Criteria andLastYearNetProfitIsNotNull() {
            addCriterion("last_year_net_profit is not null");
            return (Criteria) this;
        }

        public Criteria andLastYearNetProfitEqualTo(BigDecimal value) {
            addCriterion("last_year_net_profit =", value, "lastYearNetProfit");
            return (Criteria) this;
        }

        public Criteria andLastYearNetProfitNotEqualTo(BigDecimal value) {
            addCriterion("last_year_net_profit <>", value, "lastYearNetProfit");
            return (Criteria) this;
        }

        public Criteria andLastYearNetProfitGreaterThan(BigDecimal value) {
            addCriterion("last_year_net_profit >", value, "lastYearNetProfit");
            return (Criteria) this;
        }

        public Criteria andLastYearNetProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("last_year_net_profit >=", value, "lastYearNetProfit");
            return (Criteria) this;
        }

        public Criteria andLastYearNetProfitLessThan(BigDecimal value) {
            addCriterion("last_year_net_profit <", value, "lastYearNetProfit");
            return (Criteria) this;
        }

        public Criteria andLastYearNetProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("last_year_net_profit <=", value, "lastYearNetProfit");
            return (Criteria) this;
        }

        public Criteria andLastYearNetProfitIn(List<BigDecimal> values) {
            addCriterion("last_year_net_profit in", values, "lastYearNetProfit");
            return (Criteria) this;
        }

        public Criteria andLastYearNetProfitNotIn(List<BigDecimal> values) {
            addCriterion("last_year_net_profit not in", values, "lastYearNetProfit");
            return (Criteria) this;
        }

        public Criteria andLastYearNetProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_year_net_profit between", value1, value2, "lastYearNetProfit");
            return (Criteria) this;
        }

        public Criteria andLastYearNetProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_year_net_profit not between", value1, value2, "lastYearNetProfit");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalAssetsIsNull() {
            addCriterion("last_year_total_assets is null");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalAssetsIsNotNull() {
            addCriterion("last_year_total_assets is not null");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalAssetsEqualTo(BigDecimal value) {
            addCriterion("last_year_total_assets =", value, "lastYearTotalAssets");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalAssetsNotEqualTo(BigDecimal value) {
            addCriterion("last_year_total_assets <>", value, "lastYearTotalAssets");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalAssetsGreaterThan(BigDecimal value) {
            addCriterion("last_year_total_assets >", value, "lastYearTotalAssets");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalAssetsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("last_year_total_assets >=", value, "lastYearTotalAssets");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalAssetsLessThan(BigDecimal value) {
            addCriterion("last_year_total_assets <", value, "lastYearTotalAssets");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalAssetsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("last_year_total_assets <=", value, "lastYearTotalAssets");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalAssetsIn(List<BigDecimal> values) {
            addCriterion("last_year_total_assets in", values, "lastYearTotalAssets");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalAssetsNotIn(List<BigDecimal> values) {
            addCriterion("last_year_total_assets not in", values, "lastYearTotalAssets");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalAssetsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_year_total_assets between", value1, value2, "lastYearTotalAssets");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalAssetsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_year_total_assets not between", value1, value2, "lastYearTotalAssets");
            return (Criteria) this;
        }

        public Criteria andLastYearNetWorthIsNull() {
            addCriterion("last_year_net_worth is null");
            return (Criteria) this;
        }

        public Criteria andLastYearNetWorthIsNotNull() {
            addCriterion("last_year_net_worth is not null");
            return (Criteria) this;
        }

        public Criteria andLastYearNetWorthEqualTo(BigDecimal value) {
            addCriterion("last_year_net_worth =", value, "lastYearNetWorth");
            return (Criteria) this;
        }

        public Criteria andLastYearNetWorthNotEqualTo(BigDecimal value) {
            addCriterion("last_year_net_worth <>", value, "lastYearNetWorth");
            return (Criteria) this;
        }

        public Criteria andLastYearNetWorthGreaterThan(BigDecimal value) {
            addCriterion("last_year_net_worth >", value, "lastYearNetWorth");
            return (Criteria) this;
        }

        public Criteria andLastYearNetWorthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("last_year_net_worth >=", value, "lastYearNetWorth");
            return (Criteria) this;
        }

        public Criteria andLastYearNetWorthLessThan(BigDecimal value) {
            addCriterion("last_year_net_worth <", value, "lastYearNetWorth");
            return (Criteria) this;
        }

        public Criteria andLastYearNetWorthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("last_year_net_worth <=", value, "lastYearNetWorth");
            return (Criteria) this;
        }

        public Criteria andLastYearNetWorthIn(List<BigDecimal> values) {
            addCriterion("last_year_net_worth in", values, "lastYearNetWorth");
            return (Criteria) this;
        }

        public Criteria andLastYearNetWorthNotIn(List<BigDecimal> values) {
            addCriterion("last_year_net_worth not in", values, "lastYearNetWorth");
            return (Criteria) this;
        }

        public Criteria andLastYearNetWorthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_year_net_worth between", value1, value2, "lastYearNetWorth");
            return (Criteria) this;
        }

        public Criteria andLastYearNetWorthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_year_net_worth not between", value1, value2, "lastYearNetWorth");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalLiabilitiesIsNull() {
            addCriterion("last_year_total_liabilities is null");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalLiabilitiesIsNotNull() {
            addCriterion("last_year_total_liabilities is not null");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalLiabilitiesEqualTo(BigDecimal value) {
            addCriterion("last_year_total_liabilities =", value, "lastYearTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalLiabilitiesNotEqualTo(BigDecimal value) {
            addCriterion("last_year_total_liabilities <>", value, "lastYearTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalLiabilitiesGreaterThan(BigDecimal value) {
            addCriterion("last_year_total_liabilities >", value, "lastYearTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalLiabilitiesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("last_year_total_liabilities >=", value, "lastYearTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalLiabilitiesLessThan(BigDecimal value) {
            addCriterion("last_year_total_liabilities <", value, "lastYearTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalLiabilitiesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("last_year_total_liabilities <=", value, "lastYearTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalLiabilitiesIn(List<BigDecimal> values) {
            addCriterion("last_year_total_liabilities in", values, "lastYearTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalLiabilitiesNotIn(List<BigDecimal> values) {
            addCriterion("last_year_total_liabilities not in", values, "lastYearTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalLiabilitiesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_year_total_liabilities between", value1, value2, "lastYearTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andLastYearTotalLiabilitiesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_year_total_liabilities not between", value1, value2, "lastYearTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andEnterpriseMonthlyDebtIsNull() {
            addCriterion("enterprise_monthly_debt is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseMonthlyDebtIsNotNull() {
            addCriterion("enterprise_monthly_debt is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseMonthlyDebtEqualTo(BigDecimal value) {
            addCriterion("enterprise_monthly_debt =", value, "enterpriseMonthlyDebt");
            return (Criteria) this;
        }

        public Criteria andEnterpriseMonthlyDebtNotEqualTo(BigDecimal value) {
            addCriterion("enterprise_monthly_debt <>", value, "enterpriseMonthlyDebt");
            return (Criteria) this;
        }

        public Criteria andEnterpriseMonthlyDebtGreaterThan(BigDecimal value) {
            addCriterion("enterprise_monthly_debt >", value, "enterpriseMonthlyDebt");
            return (Criteria) this;
        }

        public Criteria andEnterpriseMonthlyDebtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("enterprise_monthly_debt >=", value, "enterpriseMonthlyDebt");
            return (Criteria) this;
        }

        public Criteria andEnterpriseMonthlyDebtLessThan(BigDecimal value) {
            addCriterion("enterprise_monthly_debt <", value, "enterpriseMonthlyDebt");
            return (Criteria) this;
        }

        public Criteria andEnterpriseMonthlyDebtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("enterprise_monthly_debt <=", value, "enterpriseMonthlyDebt");
            return (Criteria) this;
        }

        public Criteria andEnterpriseMonthlyDebtIn(List<BigDecimal> values) {
            addCriterion("enterprise_monthly_debt in", values, "enterpriseMonthlyDebt");
            return (Criteria) this;
        }

        public Criteria andEnterpriseMonthlyDebtNotIn(List<BigDecimal> values) {
            addCriterion("enterprise_monthly_debt not in", values, "enterpriseMonthlyDebt");
            return (Criteria) this;
        }

        public Criteria andEnterpriseMonthlyDebtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("enterprise_monthly_debt between", value1, value2, "enterpriseMonthlyDebt");
            return (Criteria) this;
        }

        public Criteria andEnterpriseMonthlyDebtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("enterprise_monthly_debt not between", value1, value2, "enterpriseMonthlyDebt");
            return (Criteria) this;
        }

        public Criteria andRecentTotalLiabilitiesIsNull() {
            addCriterion("recent_total_liabilities is null");
            return (Criteria) this;
        }

        public Criteria andRecentTotalLiabilitiesIsNotNull() {
            addCriterion("recent_total_liabilities is not null");
            return (Criteria) this;
        }

        public Criteria andRecentTotalLiabilitiesEqualTo(BigDecimal value) {
            addCriterion("recent_total_liabilities =", value, "recentTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andRecentTotalLiabilitiesNotEqualTo(BigDecimal value) {
            addCriterion("recent_total_liabilities <>", value, "recentTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andRecentTotalLiabilitiesGreaterThan(BigDecimal value) {
            addCriterion("recent_total_liabilities >", value, "recentTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andRecentTotalLiabilitiesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recent_total_liabilities >=", value, "recentTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andRecentTotalLiabilitiesLessThan(BigDecimal value) {
            addCriterion("recent_total_liabilities <", value, "recentTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andRecentTotalLiabilitiesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recent_total_liabilities <=", value, "recentTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andRecentTotalLiabilitiesIn(List<BigDecimal> values) {
            addCriterion("recent_total_liabilities in", values, "recentTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andRecentTotalLiabilitiesNotIn(List<BigDecimal> values) {
            addCriterion("recent_total_liabilities not in", values, "recentTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andRecentTotalLiabilitiesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recent_total_liabilities between", value1, value2, "recentTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andRecentTotalLiabilitiesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recent_total_liabilities not between", value1, value2, "recentTotalLiabilities");
            return (Criteria) this;
        }

        public Criteria andRecentBankLoanBalanceIsNull() {
            addCriterion("recent_bank_loan_balance is null");
            return (Criteria) this;
        }

        public Criteria andRecentBankLoanBalanceIsNotNull() {
            addCriterion("recent_bank_loan_balance is not null");
            return (Criteria) this;
        }

        public Criteria andRecentBankLoanBalanceEqualTo(BigDecimal value) {
            addCriterion("recent_bank_loan_balance =", value, "recentBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentBankLoanBalanceNotEqualTo(BigDecimal value) {
            addCriterion("recent_bank_loan_balance <>", value, "recentBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentBankLoanBalanceGreaterThan(BigDecimal value) {
            addCriterion("recent_bank_loan_balance >", value, "recentBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentBankLoanBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recent_bank_loan_balance >=", value, "recentBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentBankLoanBalanceLessThan(BigDecimal value) {
            addCriterion("recent_bank_loan_balance <", value, "recentBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentBankLoanBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recent_bank_loan_balance <=", value, "recentBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentBankLoanBalanceIn(List<BigDecimal> values) {
            addCriterion("recent_bank_loan_balance in", values, "recentBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentBankLoanBalanceNotIn(List<BigDecimal> values) {
            addCriterion("recent_bank_loan_balance not in", values, "recentBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentBankLoanBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recent_bank_loan_balance between", value1, value2, "recentBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentBankLoanBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recent_bank_loan_balance not between", value1, value2, "recentBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentTotalAssetsIsNull() {
            addCriterion("recent_total_assets is null");
            return (Criteria) this;
        }

        public Criteria andRecentTotalAssetsIsNotNull() {
            addCriterion("recent_total_assets is not null");
            return (Criteria) this;
        }

        public Criteria andRecentTotalAssetsEqualTo(BigDecimal value) {
            addCriterion("recent_total_assets =", value, "recentTotalAssets");
            return (Criteria) this;
        }

        public Criteria andRecentTotalAssetsNotEqualTo(BigDecimal value) {
            addCriterion("recent_total_assets <>", value, "recentTotalAssets");
            return (Criteria) this;
        }

        public Criteria andRecentTotalAssetsGreaterThan(BigDecimal value) {
            addCriterion("recent_total_assets >", value, "recentTotalAssets");
            return (Criteria) this;
        }

        public Criteria andRecentTotalAssetsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recent_total_assets >=", value, "recentTotalAssets");
            return (Criteria) this;
        }

        public Criteria andRecentTotalAssetsLessThan(BigDecimal value) {
            addCriterion("recent_total_assets <", value, "recentTotalAssets");
            return (Criteria) this;
        }

        public Criteria andRecentTotalAssetsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recent_total_assets <=", value, "recentTotalAssets");
            return (Criteria) this;
        }

        public Criteria andRecentTotalAssetsIn(List<BigDecimal> values) {
            addCriterion("recent_total_assets in", values, "recentTotalAssets");
            return (Criteria) this;
        }

        public Criteria andRecentTotalAssetsNotIn(List<BigDecimal> values) {
            addCriterion("recent_total_assets not in", values, "recentTotalAssets");
            return (Criteria) this;
        }

        public Criteria andRecentTotalAssetsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recent_total_assets between", value1, value2, "recentTotalAssets");
            return (Criteria) this;
        }

        public Criteria andRecentTotalAssetsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recent_total_assets not between", value1, value2, "recentTotalAssets");
            return (Criteria) this;
        }

        public Criteria andRecentGuaranteeAssetsIsNull() {
            addCriterion("recent_guarantee_assets is null");
            return (Criteria) this;
        }

        public Criteria andRecentGuaranteeAssetsIsNotNull() {
            addCriterion("recent_guarantee_assets is not null");
            return (Criteria) this;
        }

        public Criteria andRecentGuaranteeAssetsEqualTo(BigDecimal value) {
            addCriterion("recent_guarantee_assets =", value, "recentGuaranteeAssets");
            return (Criteria) this;
        }

        public Criteria andRecentGuaranteeAssetsNotEqualTo(BigDecimal value) {
            addCriterion("recent_guarantee_assets <>", value, "recentGuaranteeAssets");
            return (Criteria) this;
        }

        public Criteria andRecentGuaranteeAssetsGreaterThan(BigDecimal value) {
            addCriterion("recent_guarantee_assets >", value, "recentGuaranteeAssets");
            return (Criteria) this;
        }

        public Criteria andRecentGuaranteeAssetsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recent_guarantee_assets >=", value, "recentGuaranteeAssets");
            return (Criteria) this;
        }

        public Criteria andRecentGuaranteeAssetsLessThan(BigDecimal value) {
            addCriterion("recent_guarantee_assets <", value, "recentGuaranteeAssets");
            return (Criteria) this;
        }

        public Criteria andRecentGuaranteeAssetsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recent_guarantee_assets <=", value, "recentGuaranteeAssets");
            return (Criteria) this;
        }

        public Criteria andRecentGuaranteeAssetsIn(List<BigDecimal> values) {
            addCriterion("recent_guarantee_assets in", values, "recentGuaranteeAssets");
            return (Criteria) this;
        }

        public Criteria andRecentGuaranteeAssetsNotIn(List<BigDecimal> values) {
            addCriterion("recent_guarantee_assets not in", values, "recentGuaranteeAssets");
            return (Criteria) this;
        }

        public Criteria andRecentGuaranteeAssetsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recent_guarantee_assets between", value1, value2, "recentGuaranteeAssets");
            return (Criteria) this;
        }

        public Criteria andRecentGuaranteeAssetsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recent_guarantee_assets not between", value1, value2, "recentGuaranteeAssets");
            return (Criteria) this;
        }

        public Criteria andRecentEconomicLitigationCostsIsNull() {
            addCriterion("recent_economic_litigation_costs is null");
            return (Criteria) this;
        }

        public Criteria andRecentEconomicLitigationCostsIsNotNull() {
            addCriterion("recent_economic_litigation_costs is not null");
            return (Criteria) this;
        }

        public Criteria andRecentEconomicLitigationCostsEqualTo(BigDecimal value) {
            addCriterion("recent_economic_litigation_costs =", value, "recentEconomicLitigationCosts");
            return (Criteria) this;
        }

        public Criteria andRecentEconomicLitigationCostsNotEqualTo(BigDecimal value) {
            addCriterion("recent_economic_litigation_costs <>", value, "recentEconomicLitigationCosts");
            return (Criteria) this;
        }

        public Criteria andRecentEconomicLitigationCostsGreaterThan(BigDecimal value) {
            addCriterion("recent_economic_litigation_costs >", value, "recentEconomicLitigationCosts");
            return (Criteria) this;
        }

        public Criteria andRecentEconomicLitigationCostsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recent_economic_litigation_costs >=", value, "recentEconomicLitigationCosts");
            return (Criteria) this;
        }

        public Criteria andRecentEconomicLitigationCostsLessThan(BigDecimal value) {
            addCriterion("recent_economic_litigation_costs <", value, "recentEconomicLitigationCosts");
            return (Criteria) this;
        }

        public Criteria andRecentEconomicLitigationCostsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recent_economic_litigation_costs <=", value, "recentEconomicLitigationCosts");
            return (Criteria) this;
        }

        public Criteria andRecentEconomicLitigationCostsIn(List<BigDecimal> values) {
            addCriterion("recent_economic_litigation_costs in", values, "recentEconomicLitigationCosts");
            return (Criteria) this;
        }

        public Criteria andRecentEconomicLitigationCostsNotIn(List<BigDecimal> values) {
            addCriterion("recent_economic_litigation_costs not in", values, "recentEconomicLitigationCosts");
            return (Criteria) this;
        }

        public Criteria andRecentEconomicLitigationCostsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recent_economic_litigation_costs between", value1, value2, "recentEconomicLitigationCosts");
            return (Criteria) this;
        }

        public Criteria andRecentEconomicLitigationCostsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recent_economic_litigation_costs not between", value1, value2, "recentEconomicLitigationCosts");
            return (Criteria) this;
        }

        public Criteria andRecentNotBankLoanBalanceIsNull() {
            addCriterion("recent_not_bank_loan_balance is null");
            return (Criteria) this;
        }

        public Criteria andRecentNotBankLoanBalanceIsNotNull() {
            addCriterion("recent_not_bank_loan_balance is not null");
            return (Criteria) this;
        }

        public Criteria andRecentNotBankLoanBalanceEqualTo(BigDecimal value) {
            addCriterion("recent_not_bank_loan_balance =", value, "recentNotBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentNotBankLoanBalanceNotEqualTo(BigDecimal value) {
            addCriterion("recent_not_bank_loan_balance <>", value, "recentNotBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentNotBankLoanBalanceGreaterThan(BigDecimal value) {
            addCriterion("recent_not_bank_loan_balance >", value, "recentNotBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentNotBankLoanBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recent_not_bank_loan_balance >=", value, "recentNotBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentNotBankLoanBalanceLessThan(BigDecimal value) {
            addCriterion("recent_not_bank_loan_balance <", value, "recentNotBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentNotBankLoanBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recent_not_bank_loan_balance <=", value, "recentNotBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentNotBankLoanBalanceIn(List<BigDecimal> values) {
            addCriterion("recent_not_bank_loan_balance in", values, "recentNotBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentNotBankLoanBalanceNotIn(List<BigDecimal> values) {
            addCriterion("recent_not_bank_loan_balance not in", values, "recentNotBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentNotBankLoanBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recent_not_bank_loan_balance between", value1, value2, "recentNotBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andRecentNotBankLoanBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recent_not_bank_loan_balance not between", value1, value2, "recentNotBankLoanBalance");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalProfitsIsNull() {
            addCriterion("current_year_total_profits is null");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalProfitsIsNotNull() {
            addCriterion("current_year_total_profits is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalProfitsEqualTo(BigDecimal value) {
            addCriterion("current_year_total_profits =", value, "currentYearTotalProfits");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalProfitsNotEqualTo(BigDecimal value) {
            addCriterion("current_year_total_profits <>", value, "currentYearTotalProfits");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalProfitsGreaterThan(BigDecimal value) {
            addCriterion("current_year_total_profits >", value, "currentYearTotalProfits");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalProfitsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_year_total_profits >=", value, "currentYearTotalProfits");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalProfitsLessThan(BigDecimal value) {
            addCriterion("current_year_total_profits <", value, "currentYearTotalProfits");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalProfitsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_year_total_profits <=", value, "currentYearTotalProfits");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalProfitsIn(List<BigDecimal> values) {
            addCriterion("current_year_total_profits in", values, "currentYearTotalProfits");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalProfitsNotIn(List<BigDecimal> values) {
            addCriterion("current_year_total_profits not in", values, "currentYearTotalProfits");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalProfitsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_year_total_profits between", value1, value2, "currentYearTotalProfits");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalProfitsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_year_total_profits not between", value1, value2, "currentYearTotalProfits");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalIncomeIsNull() {
            addCriterion("current_year_total_income is null");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalIncomeIsNotNull() {
            addCriterion("current_year_total_income is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalIncomeEqualTo(BigDecimal value) {
            addCriterion("current_year_total_income =", value, "currentYearTotalIncome");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalIncomeNotEqualTo(BigDecimal value) {
            addCriterion("current_year_total_income <>", value, "currentYearTotalIncome");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalIncomeGreaterThan(BigDecimal value) {
            addCriterion("current_year_total_income >", value, "currentYearTotalIncome");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_year_total_income >=", value, "currentYearTotalIncome");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalIncomeLessThan(BigDecimal value) {
            addCriterion("current_year_total_income <", value, "currentYearTotalIncome");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_year_total_income <=", value, "currentYearTotalIncome");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalIncomeIn(List<BigDecimal> values) {
            addCriterion("current_year_total_income in", values, "currentYearTotalIncome");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalIncomeNotIn(List<BigDecimal> values) {
            addCriterion("current_year_total_income not in", values, "currentYearTotalIncome");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_year_total_income between", value1, value2, "currentYearTotalIncome");
            return (Criteria) this;
        }

        public Criteria andCurrentYearTotalIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_year_total_income not between", value1, value2, "currentYearTotalIncome");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview1IsNull() {
            addCriterion("enterprise_overview1 is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview1IsNotNull() {
            addCriterion("enterprise_overview1 is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview1EqualTo(String value) {
            addCriterion("enterprise_overview1 =", value, "enterpriseOverview1");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview1NotEqualTo(String value) {
            addCriterion("enterprise_overview1 <>", value, "enterpriseOverview1");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview1GreaterThan(String value) {
            addCriterion("enterprise_overview1 >", value, "enterpriseOverview1");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview1GreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_overview1 >=", value, "enterpriseOverview1");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview1LessThan(String value) {
            addCriterion("enterprise_overview1 <", value, "enterpriseOverview1");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview1LessThanOrEqualTo(String value) {
            addCriterion("enterprise_overview1 <=", value, "enterpriseOverview1");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview1Like(String value) {
            addCriterion("enterprise_overview1 like", value, "enterpriseOverview1");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview1NotLike(String value) {
            addCriterion("enterprise_overview1 not like", value, "enterpriseOverview1");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview1In(List<String> values) {
            addCriterion("enterprise_overview1 in", values, "enterpriseOverview1");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview1NotIn(List<String> values) {
            addCriterion("enterprise_overview1 not in", values, "enterpriseOverview1");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview1Between(String value1, String value2) {
            addCriterion("enterprise_overview1 between", value1, value2, "enterpriseOverview1");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview1NotBetween(String value1, String value2) {
            addCriterion("enterprise_overview1 not between", value1, value2, "enterpriseOverview1");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview2IsNull() {
            addCriterion("enterprise_overview2 is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview2IsNotNull() {
            addCriterion("enterprise_overview2 is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview2EqualTo(String value) {
            addCriterion("enterprise_overview2 =", value, "enterpriseOverview2");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview2NotEqualTo(String value) {
            addCriterion("enterprise_overview2 <>", value, "enterpriseOverview2");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview2GreaterThan(String value) {
            addCriterion("enterprise_overview2 >", value, "enterpriseOverview2");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview2GreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_overview2 >=", value, "enterpriseOverview2");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview2LessThan(String value) {
            addCriterion("enterprise_overview2 <", value, "enterpriseOverview2");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview2LessThanOrEqualTo(String value) {
            addCriterion("enterprise_overview2 <=", value, "enterpriseOverview2");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview2Like(String value) {
            addCriterion("enterprise_overview2 like", value, "enterpriseOverview2");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview2NotLike(String value) {
            addCriterion("enterprise_overview2 not like", value, "enterpriseOverview2");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview2In(List<String> values) {
            addCriterion("enterprise_overview2 in", values, "enterpriseOverview2");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview2NotIn(List<String> values) {
            addCriterion("enterprise_overview2 not in", values, "enterpriseOverview2");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview2Between(String value1, String value2) {
            addCriterion("enterprise_overview2 between", value1, value2, "enterpriseOverview2");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOverview2NotBetween(String value1, String value2) {
            addCriterion("enterprise_overview2 not between", value1, value2, "enterpriseOverview2");
            return (Criteria) this;
        }

        public Criteria andCustomerSizeIsNull() {
            addCriterion("customer_size is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSizeIsNotNull() {
            addCriterion("customer_size is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSizeEqualTo(String value) {
            addCriterion("customer_size =", value, "customerSize");
            return (Criteria) this;
        }

        public Criteria andCustomerSizeNotEqualTo(String value) {
            addCriterion("customer_size <>", value, "customerSize");
            return (Criteria) this;
        }

        public Criteria andCustomerSizeGreaterThan(String value) {
            addCriterion("customer_size >", value, "customerSize");
            return (Criteria) this;
        }

        public Criteria andCustomerSizeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_size >=", value, "customerSize");
            return (Criteria) this;
        }

        public Criteria andCustomerSizeLessThan(String value) {
            addCriterion("customer_size <", value, "customerSize");
            return (Criteria) this;
        }

        public Criteria andCustomerSizeLessThanOrEqualTo(String value) {
            addCriterion("customer_size <=", value, "customerSize");
            return (Criteria) this;
        }

        public Criteria andCustomerSizeLike(String value) {
            addCriterion("customer_size like", value, "customerSize");
            return (Criteria) this;
        }

        public Criteria andCustomerSizeNotLike(String value) {
            addCriterion("customer_size not like", value, "customerSize");
            return (Criteria) this;
        }

        public Criteria andCustomerSizeIn(List<String> values) {
            addCriterion("customer_size in", values, "customerSize");
            return (Criteria) this;
        }

        public Criteria andCustomerSizeNotIn(List<String> values) {
            addCriterion("customer_size not in", values, "customerSize");
            return (Criteria) this;
        }

        public Criteria andCustomerSizeBetween(String value1, String value2) {
            addCriterion("customer_size between", value1, value2, "customerSize");
            return (Criteria) this;
        }

        public Criteria andCustomerSizeNotBetween(String value1, String value2) {
            addCriterion("customer_size not between", value1, value2, "customerSize");
            return (Criteria) this;
        }

        public Criteria andSmallBusinessLogoIsNull() {
            addCriterion("small_business_logo is null");
            return (Criteria) this;
        }

        public Criteria andSmallBusinessLogoIsNotNull() {
            addCriterion("small_business_logo is not null");
            return (Criteria) this;
        }

        public Criteria andSmallBusinessLogoEqualTo(String value) {
            addCriterion("small_business_logo =", value, "smallBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andSmallBusinessLogoNotEqualTo(String value) {
            addCriterion("small_business_logo <>", value, "smallBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andSmallBusinessLogoGreaterThan(String value) {
            addCriterion("small_business_logo >", value, "smallBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andSmallBusinessLogoGreaterThanOrEqualTo(String value) {
            addCriterion("small_business_logo >=", value, "smallBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andSmallBusinessLogoLessThan(String value) {
            addCriterion("small_business_logo <", value, "smallBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andSmallBusinessLogoLessThanOrEqualTo(String value) {
            addCriterion("small_business_logo <=", value, "smallBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andSmallBusinessLogoLike(String value) {
            addCriterion("small_business_logo like", value, "smallBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andSmallBusinessLogoNotLike(String value) {
            addCriterion("small_business_logo not like", value, "smallBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andSmallBusinessLogoIn(List<String> values) {
            addCriterion("small_business_logo in", values, "smallBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andSmallBusinessLogoNotIn(List<String> values) {
            addCriterion("small_business_logo not in", values, "smallBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andSmallBusinessLogoBetween(String value1, String value2) {
            addCriterion("small_business_logo between", value1, value2, "smallBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andSmallBusinessLogoNotBetween(String value1, String value2) {
            addCriterion("small_business_logo not between", value1, value2, "smallBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andGroupClientsLogoIsNull() {
            addCriterion("group_clients_logo is null");
            return (Criteria) this;
        }

        public Criteria andGroupClientsLogoIsNotNull() {
            addCriterion("group_clients_logo is not null");
            return (Criteria) this;
        }

        public Criteria andGroupClientsLogoEqualTo(String value) {
            addCriterion("group_clients_logo =", value, "groupClientsLogo");
            return (Criteria) this;
        }

        public Criteria andGroupClientsLogoNotEqualTo(String value) {
            addCriterion("group_clients_logo <>", value, "groupClientsLogo");
            return (Criteria) this;
        }

        public Criteria andGroupClientsLogoGreaterThan(String value) {
            addCriterion("group_clients_logo >", value, "groupClientsLogo");
            return (Criteria) this;
        }

        public Criteria andGroupClientsLogoGreaterThanOrEqualTo(String value) {
            addCriterion("group_clients_logo >=", value, "groupClientsLogo");
            return (Criteria) this;
        }

        public Criteria andGroupClientsLogoLessThan(String value) {
            addCriterion("group_clients_logo <", value, "groupClientsLogo");
            return (Criteria) this;
        }

        public Criteria andGroupClientsLogoLessThanOrEqualTo(String value) {
            addCriterion("group_clients_logo <=", value, "groupClientsLogo");
            return (Criteria) this;
        }

        public Criteria andGroupClientsLogoLike(String value) {
            addCriterion("group_clients_logo like", value, "groupClientsLogo");
            return (Criteria) this;
        }

        public Criteria andGroupClientsLogoNotLike(String value) {
            addCriterion("group_clients_logo not like", value, "groupClientsLogo");
            return (Criteria) this;
        }

        public Criteria andGroupClientsLogoIn(List<String> values) {
            addCriterion("group_clients_logo in", values, "groupClientsLogo");
            return (Criteria) this;
        }

        public Criteria andGroupClientsLogoNotIn(List<String> values) {
            addCriterion("group_clients_logo not in", values, "groupClientsLogo");
            return (Criteria) this;
        }

        public Criteria andGroupClientsLogoBetween(String value1, String value2) {
            addCriterion("group_clients_logo between", value1, value2, "groupClientsLogo");
            return (Criteria) this;
        }

        public Criteria andGroupClientsLogoNotBetween(String value1, String value2) {
            addCriterion("group_clients_logo not between", value1, value2, "groupClientsLogo");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIsNull() {
            addCriterion("customer_manager is null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIsNotNull() {
            addCriterion("customer_manager is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerEqualTo(String value) {
            addCriterion("customer_manager =", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNotEqualTo(String value) {
            addCriterion("customer_manager <>", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerGreaterThan(String value) {
            addCriterion("customer_manager >", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerGreaterThanOrEqualTo(String value) {
            addCriterion("customer_manager >=", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerLessThan(String value) {
            addCriterion("customer_manager <", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerLessThanOrEqualTo(String value) {
            addCriterion("customer_manager <=", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerLike(String value) {
            addCriterion("customer_manager like", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNotLike(String value) {
            addCriterion("customer_manager not like", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIn(List<String> values) {
            addCriterion("customer_manager in", values, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNotIn(List<String> values) {
            addCriterion("customer_manager not in", values, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerBetween(String value1, String value2) {
            addCriterion("customer_manager between", value1, value2, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNotBetween(String value1, String value2) {
            addCriterion("customer_manager not between", value1, value2, "customerManager");
            return (Criteria) this;
        }

        public Criteria andInputUserIsNull() {
            addCriterion("input_user is null");
            return (Criteria) this;
        }

        public Criteria andInputUserIsNotNull() {
            addCriterion("input_user is not null");
            return (Criteria) this;
        }

        public Criteria andInputUserEqualTo(String value) {
            addCriterion("input_user =", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserNotEqualTo(String value) {
            addCriterion("input_user <>", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserGreaterThan(String value) {
            addCriterion("input_user >", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserGreaterThanOrEqualTo(String value) {
            addCriterion("input_user >=", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserLessThan(String value) {
            addCriterion("input_user <", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserLessThanOrEqualTo(String value) {
            addCriterion("input_user <=", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserLike(String value) {
            addCriterion("input_user like", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserNotLike(String value) {
            addCriterion("input_user not like", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserIn(List<String> values) {
            addCriterion("input_user in", values, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserNotIn(List<String> values) {
            addCriterion("input_user not in", values, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserBetween(String value1, String value2) {
            addCriterion("input_user between", value1, value2, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserNotBetween(String value1, String value2) {
            addCriterion("input_user not between", value1, value2, "inputUser");
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