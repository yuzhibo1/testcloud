package com.example.springmybatis2.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersCriteria() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordHashIsNull() {
            addCriterion("password_hash is null");
            return (Criteria) this;
        }

        public Criteria andPasswordHashIsNotNull() {
            addCriterion("password_hash is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordHashEqualTo(String value) {
            addCriterion("password_hash =", value, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashNotEqualTo(String value) {
            addCriterion("password_hash <>", value, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashGreaterThan(String value) {
            addCriterion("password_hash >", value, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashGreaterThanOrEqualTo(String value) {
            addCriterion("password_hash >=", value, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashLessThan(String value) {
            addCriterion("password_hash <", value, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashLessThanOrEqualTo(String value) {
            addCriterion("password_hash <=", value, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashLike(String value) {
            addCriterion("password_hash like", value, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashNotLike(String value) {
            addCriterion("password_hash not like", value, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashIn(List<String> values) {
            addCriterion("password_hash in", values, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashNotIn(List<String> values) {
            addCriterion("password_hash not in", values, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashBetween(String value1, String value2) {
            addCriterion("password_hash between", value1, value2, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashNotBetween(String value1, String value2) {
            addCriterion("password_hash not between", value1, value2, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andConfirmedIsNull() {
            addCriterion("confirmed is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedIsNotNull() {
            addCriterion("confirmed is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedEqualTo(Boolean value) {
            addCriterion("confirmed =", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedNotEqualTo(Boolean value) {
            addCriterion("confirmed <>", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedGreaterThan(Boolean value) {
            addCriterion("confirmed >", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("confirmed >=", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedLessThan(Boolean value) {
            addCriterion("confirmed <", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedLessThanOrEqualTo(Boolean value) {
            addCriterion("confirmed <=", value, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedIn(List<Boolean> values) {
            addCriterion("confirmed in", values, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedNotIn(List<Boolean> values) {
            addCriterion("confirmed not in", values, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedBetween(Boolean value1, Boolean value2) {
            addCriterion("confirmed between", value1, value2, "confirmed");
            return (Criteria) this;
        }

        public Criteria andConfirmedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("confirmed not between", value1, value2, "confirmed");
            return (Criteria) this;
        }

        public Criteria andNacknameIsNull() {
            addCriterion("nackname is null");
            return (Criteria) this;
        }

        public Criteria andNacknameIsNotNull() {
            addCriterion("nackname is not null");
            return (Criteria) this;
        }

        public Criteria andNacknameEqualTo(String value) {
            addCriterion("nackname =", value, "nackname");
            return (Criteria) this;
        }

        public Criteria andNacknameNotEqualTo(String value) {
            addCriterion("nackname <>", value, "nackname");
            return (Criteria) this;
        }

        public Criteria andNacknameGreaterThan(String value) {
            addCriterion("nackname >", value, "nackname");
            return (Criteria) this;
        }

        public Criteria andNacknameGreaterThanOrEqualTo(String value) {
            addCriterion("nackname >=", value, "nackname");
            return (Criteria) this;
        }

        public Criteria andNacknameLessThan(String value) {
            addCriterion("nackname <", value, "nackname");
            return (Criteria) this;
        }

        public Criteria andNacknameLessThanOrEqualTo(String value) {
            addCriterion("nackname <=", value, "nackname");
            return (Criteria) this;
        }

        public Criteria andNacknameLike(String value) {
            addCriterion("nackname like", value, "nackname");
            return (Criteria) this;
        }

        public Criteria andNacknameNotLike(String value) {
            addCriterion("nackname not like", value, "nackname");
            return (Criteria) this;
        }

        public Criteria andNacknameIn(List<String> values) {
            addCriterion("nackname in", values, "nackname");
            return (Criteria) this;
        }

        public Criteria andNacknameNotIn(List<String> values) {
            addCriterion("nackname not in", values, "nackname");
            return (Criteria) this;
        }

        public Criteria andNacknameBetween(String value1, String value2) {
            addCriterion("nackname between", value1, value2, "nackname");
            return (Criteria) this;
        }

        public Criteria andNacknameNotBetween(String value1, String value2) {
            addCriterion("nackname not between", value1, value2, "nackname");
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

        public Criteria andChatheadIsNull() {
            addCriterion("chathead is null");
            return (Criteria) this;
        }

        public Criteria andChatheadIsNotNull() {
            addCriterion("chathead is not null");
            return (Criteria) this;
        }

        public Criteria andChatheadEqualTo(String value) {
            addCriterion("chathead =", value, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadNotEqualTo(String value) {
            addCriterion("chathead <>", value, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadGreaterThan(String value) {
            addCriterion("chathead >", value, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadGreaterThanOrEqualTo(String value) {
            addCriterion("chathead >=", value, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadLessThan(String value) {
            addCriterion("chathead <", value, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadLessThanOrEqualTo(String value) {
            addCriterion("chathead <=", value, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadLike(String value) {
            addCriterion("chathead like", value, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadNotLike(String value) {
            addCriterion("chathead not like", value, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadIn(List<String> values) {
            addCriterion("chathead in", values, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadNotIn(List<String> values) {
            addCriterion("chathead not in", values, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadBetween(String value1, String value2) {
            addCriterion("chathead between", value1, value2, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadNotBetween(String value1, String value2) {
            addCriterion("chathead not between", value1, value2, "chathead");
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