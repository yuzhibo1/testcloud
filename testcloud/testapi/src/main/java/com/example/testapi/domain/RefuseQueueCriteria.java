package com.example.testapi.domain;

import java.util.ArrayList;
import java.util.List;

public class RefuseQueueCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefuseQueueCriteria() {
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

        public Criteria andOrgCdeIsNull() {
            addCriterion("ORG_CDE is null");
            return (Criteria) this;
        }

        public Criteria andOrgCdeIsNotNull() {
            addCriterion("ORG_CDE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCdeEqualTo(String value) {
            addCriterion("ORG_CDE =", value, "orgCde");
            return (Criteria) this;
        }

        public Criteria andOrgCdeNotEqualTo(String value) {
            addCriterion("ORG_CDE <>", value, "orgCde");
            return (Criteria) this;
        }

        public Criteria andOrgCdeGreaterThan(String value) {
            addCriterion("ORG_CDE >", value, "orgCde");
            return (Criteria) this;
        }

        public Criteria andOrgCdeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CDE >=", value, "orgCde");
            return (Criteria) this;
        }

        public Criteria andOrgCdeLessThan(String value) {
            addCriterion("ORG_CDE <", value, "orgCde");
            return (Criteria) this;
        }

        public Criteria andOrgCdeLessThanOrEqualTo(String value) {
            addCriterion("ORG_CDE <=", value, "orgCde");
            return (Criteria) this;
        }

        public Criteria andOrgCdeLike(String value) {
            addCriterion("ORG_CDE like", value, "orgCde");
            return (Criteria) this;
        }

        public Criteria andOrgCdeNotLike(String value) {
            addCriterion("ORG_CDE not like", value, "orgCde");
            return (Criteria) this;
        }

        public Criteria andOrgCdeIn(List<String> values) {
            addCriterion("ORG_CDE in", values, "orgCde");
            return (Criteria) this;
        }

        public Criteria andOrgCdeNotIn(List<String> values) {
            addCriterion("ORG_CDE not in", values, "orgCde");
            return (Criteria) this;
        }

        public Criteria andOrgCdeBetween(String value1, String value2) {
            addCriterion("ORG_CDE between", value1, value2, "orgCde");
            return (Criteria) this;
        }

        public Criteria andOrgCdeNotBetween(String value1, String value2) {
            addCriterion("ORG_CDE not between", value1, value2, "orgCde");
            return (Criteria) this;
        }

        public Criteria andPrdIdIsNull() {
            addCriterion("PRD_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrdIdIsNotNull() {
            addCriterion("PRD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrdIdEqualTo(String value) {
            addCriterion("PRD_ID =", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdNotEqualTo(String value) {
            addCriterion("PRD_ID <>", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdGreaterThan(String value) {
            addCriterion("PRD_ID >", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_ID >=", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdLessThan(String value) {
            addCriterion("PRD_ID <", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdLessThanOrEqualTo(String value) {
            addCriterion("PRD_ID <=", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdLike(String value) {
            addCriterion("PRD_ID like", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdNotLike(String value) {
            addCriterion("PRD_ID not like", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdIn(List<String> values) {
            addCriterion("PRD_ID in", values, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdNotIn(List<String> values) {
            addCriterion("PRD_ID not in", values, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdBetween(String value1, String value2) {
            addCriterion("PRD_ID between", value1, value2, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdNotBetween(String value1, String value2) {
            addCriterion("PRD_ID not between", value1, value2, "prdId");
            return (Criteria) this;
        }

        public Criteria andApplCdeIsNull() {
            addCriterion("APPL_CDE is null");
            return (Criteria) this;
        }

        public Criteria andApplCdeIsNotNull() {
            addCriterion("APPL_CDE is not null");
            return (Criteria) this;
        }

        public Criteria andApplCdeEqualTo(String value) {
            addCriterion("APPL_CDE =", value, "applCde");
            return (Criteria) this;
        }

        public Criteria andApplCdeNotEqualTo(String value) {
            addCriterion("APPL_CDE <>", value, "applCde");
            return (Criteria) this;
        }

        public Criteria andApplCdeGreaterThan(String value) {
            addCriterion("APPL_CDE >", value, "applCde");
            return (Criteria) this;
        }

        public Criteria andApplCdeGreaterThanOrEqualTo(String value) {
            addCriterion("APPL_CDE >=", value, "applCde");
            return (Criteria) this;
        }

        public Criteria andApplCdeLessThan(String value) {
            addCriterion("APPL_CDE <", value, "applCde");
            return (Criteria) this;
        }

        public Criteria andApplCdeLessThanOrEqualTo(String value) {
            addCriterion("APPL_CDE <=", value, "applCde");
            return (Criteria) this;
        }

        public Criteria andApplCdeLike(String value) {
            addCriterion("APPL_CDE like", value, "applCde");
            return (Criteria) this;
        }

        public Criteria andApplCdeNotLike(String value) {
            addCriterion("APPL_CDE not like", value, "applCde");
            return (Criteria) this;
        }

        public Criteria andApplCdeIn(List<String> values) {
            addCriterion("APPL_CDE in", values, "applCde");
            return (Criteria) this;
        }

        public Criteria andApplCdeNotIn(List<String> values) {
            addCriterion("APPL_CDE not in", values, "applCde");
            return (Criteria) this;
        }

        public Criteria andApplCdeBetween(String value1, String value2) {
            addCriterion("APPL_CDE between", value1, value2, "applCde");
            return (Criteria) this;
        }

        public Criteria andApplCdeNotBetween(String value1, String value2) {
            addCriterion("APPL_CDE not between", value1, value2, "applCde");
            return (Criteria) this;
        }

        public Criteria andIdTypIsNull() {
            addCriterion("ID_TYP is null");
            return (Criteria) this;
        }

        public Criteria andIdTypIsNotNull() {
            addCriterion("ID_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypEqualTo(String value) {
            addCriterion("ID_TYP =", value, "idTyp");
            return (Criteria) this;
        }

        public Criteria andIdTypNotEqualTo(String value) {
            addCriterion("ID_TYP <>", value, "idTyp");
            return (Criteria) this;
        }

        public Criteria andIdTypGreaterThan(String value) {
            addCriterion("ID_TYP >", value, "idTyp");
            return (Criteria) this;
        }

        public Criteria andIdTypGreaterThanOrEqualTo(String value) {
            addCriterion("ID_TYP >=", value, "idTyp");
            return (Criteria) this;
        }

        public Criteria andIdTypLessThan(String value) {
            addCriterion("ID_TYP <", value, "idTyp");
            return (Criteria) this;
        }

        public Criteria andIdTypLessThanOrEqualTo(String value) {
            addCriterion("ID_TYP <=", value, "idTyp");
            return (Criteria) this;
        }

        public Criteria andIdTypLike(String value) {
            addCriterion("ID_TYP like", value, "idTyp");
            return (Criteria) this;
        }

        public Criteria andIdTypNotLike(String value) {
            addCriterion("ID_TYP not like", value, "idTyp");
            return (Criteria) this;
        }

        public Criteria andIdTypIn(List<String> values) {
            addCriterion("ID_TYP in", values, "idTyp");
            return (Criteria) this;
        }

        public Criteria andIdTypNotIn(List<String> values) {
            addCriterion("ID_TYP not in", values, "idTyp");
            return (Criteria) this;
        }

        public Criteria andIdTypBetween(String value1, String value2) {
            addCriterion("ID_TYP between", value1, value2, "idTyp");
            return (Criteria) this;
        }

        public Criteria andIdTypNotBetween(String value1, String value2) {
            addCriterion("ID_TYP not between", value1, value2, "idTyp");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("ID_NO =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("ID_NO <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("ID_NO >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("ID_NO <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("ID_NO <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("ID_NO like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("ID_NO not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("ID_NO in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("ID_NO not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("ID_NO between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("ID_NO not between", value1, value2, "idNo");
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

        public Criteria andApplDtIsNull() {
            addCriterion("APPL_DT is null");
            return (Criteria) this;
        }

        public Criteria andApplDtIsNotNull() {
            addCriterion("APPL_DT is not null");
            return (Criteria) this;
        }

        public Criteria andApplDtEqualTo(String value) {
            addCriterion("APPL_DT =", value, "applDt");
            return (Criteria) this;
        }

        public Criteria andApplDtNotEqualTo(String value) {
            addCriterion("APPL_DT <>", value, "applDt");
            return (Criteria) this;
        }

        public Criteria andApplDtGreaterThan(String value) {
            addCriterion("APPL_DT >", value, "applDt");
            return (Criteria) this;
        }

        public Criteria andApplDtGreaterThanOrEqualTo(String value) {
            addCriterion("APPL_DT >=", value, "applDt");
            return (Criteria) this;
        }

        public Criteria andApplDtLessThan(String value) {
            addCriterion("APPL_DT <", value, "applDt");
            return (Criteria) this;
        }

        public Criteria andApplDtLessThanOrEqualTo(String value) {
            addCriterion("APPL_DT <=", value, "applDt");
            return (Criteria) this;
        }

        public Criteria andApplDtLike(String value) {
            addCriterion("APPL_DT like", value, "applDt");
            return (Criteria) this;
        }

        public Criteria andApplDtNotLike(String value) {
            addCriterion("APPL_DT not like", value, "applDt");
            return (Criteria) this;
        }

        public Criteria andApplDtIn(List<String> values) {
            addCriterion("APPL_DT in", values, "applDt");
            return (Criteria) this;
        }

        public Criteria andApplDtNotIn(List<String> values) {
            addCriterion("APPL_DT not in", values, "applDt");
            return (Criteria) this;
        }

        public Criteria andApplDtBetween(String value1, String value2) {
            addCriterion("APPL_DT between", value1, value2, "applDt");
            return (Criteria) this;
        }

        public Criteria andApplDtNotBetween(String value1, String value2) {
            addCriterion("APPL_DT not between", value1, value2, "applDt");
            return (Criteria) this;
        }

        public Criteria andRefuseDtIsNull() {
            addCriterion("REFUSE_DT is null");
            return (Criteria) this;
        }

        public Criteria andRefuseDtIsNotNull() {
            addCriterion("REFUSE_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRefuseDtEqualTo(String value) {
            addCriterion("REFUSE_DT =", value, "refuseDt");
            return (Criteria) this;
        }

        public Criteria andRefuseDtNotEqualTo(String value) {
            addCriterion("REFUSE_DT <>", value, "refuseDt");
            return (Criteria) this;
        }

        public Criteria andRefuseDtGreaterThan(String value) {
            addCriterion("REFUSE_DT >", value, "refuseDt");
            return (Criteria) this;
        }

        public Criteria andRefuseDtGreaterThanOrEqualTo(String value) {
            addCriterion("REFUSE_DT >=", value, "refuseDt");
            return (Criteria) this;
        }

        public Criteria andRefuseDtLessThan(String value) {
            addCriterion("REFUSE_DT <", value, "refuseDt");
            return (Criteria) this;
        }

        public Criteria andRefuseDtLessThanOrEqualTo(String value) {
            addCriterion("REFUSE_DT <=", value, "refuseDt");
            return (Criteria) this;
        }

        public Criteria andRefuseDtLike(String value) {
            addCriterion("REFUSE_DT like", value, "refuseDt");
            return (Criteria) this;
        }

        public Criteria andRefuseDtNotLike(String value) {
            addCriterion("REFUSE_DT not like", value, "refuseDt");
            return (Criteria) this;
        }

        public Criteria andRefuseDtIn(List<String> values) {
            addCriterion("REFUSE_DT in", values, "refuseDt");
            return (Criteria) this;
        }

        public Criteria andRefuseDtNotIn(List<String> values) {
            addCriterion("REFUSE_DT not in", values, "refuseDt");
            return (Criteria) this;
        }

        public Criteria andRefuseDtBetween(String value1, String value2) {
            addCriterion("REFUSE_DT between", value1, value2, "refuseDt");
            return (Criteria) this;
        }

        public Criteria andRefuseDtNotBetween(String value1, String value2) {
            addCriterion("REFUSE_DT not between", value1, value2, "refuseDt");
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