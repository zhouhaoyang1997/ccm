package pojo;

import java.util.ArrayList;
import java.util.List;

public class MemoryInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemoryInfoExample() {
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

        public Criteria andIpIdIsNull() {
            addCriterion("Ip_id is null");
            return (Criteria) this;
        }

        public Criteria andIpIdIsNotNull() {
            addCriterion("Ip_id is not null");
            return (Criteria) this;
        }

        public Criteria andIpIdEqualTo(String value) {
            addCriterion("Ip_id =", value, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdNotEqualTo(String value) {
            addCriterion("Ip_id <>", value, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdGreaterThan(String value) {
            addCriterion("Ip_id >", value, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdGreaterThanOrEqualTo(String value) {
            addCriterion("Ip_id >=", value, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdLessThan(String value) {
            addCriterion("Ip_id <", value, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdLessThanOrEqualTo(String value) {
            addCriterion("Ip_id <=", value, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdLike(String value) {
            addCriterion("Ip_id like", value, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdNotLike(String value) {
            addCriterion("Ip_id not like", value, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdIn(List<String> values) {
            addCriterion("Ip_id in", values, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdNotIn(List<String> values) {
            addCriterion("Ip_id not in", values, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdBetween(String value1, String value2) {
            addCriterion("Ip_id between", value1, value2, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdNotBetween(String value1, String value2) {
            addCriterion("Ip_id not between", value1, value2, "ipId");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Double value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Double value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Double value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Double value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Double value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Double> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Double> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Double value1, Double value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Double value1, Double value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andMemoryTotalIsNull() {
            addCriterion("Memory_Total is null");
            return (Criteria) this;
        }

        public Criteria andMemoryTotalIsNotNull() {
            addCriterion("Memory_Total is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryTotalEqualTo(Double value) {
            addCriterion("Memory_Total =", value, "memoryTotal");
            return (Criteria) this;
        }

        public Criteria andMemoryTotalNotEqualTo(Double value) {
            addCriterion("Memory_Total <>", value, "memoryTotal");
            return (Criteria) this;
        }

        public Criteria andMemoryTotalGreaterThan(Double value) {
            addCriterion("Memory_Total >", value, "memoryTotal");
            return (Criteria) this;
        }

        public Criteria andMemoryTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("Memory_Total >=", value, "memoryTotal");
            return (Criteria) this;
        }

        public Criteria andMemoryTotalLessThan(Double value) {
            addCriterion("Memory_Total <", value, "memoryTotal");
            return (Criteria) this;
        }

        public Criteria andMemoryTotalLessThanOrEqualTo(Double value) {
            addCriterion("Memory_Total <=", value, "memoryTotal");
            return (Criteria) this;
        }

        public Criteria andMemoryTotalIn(List<Double> values) {
            addCriterion("Memory_Total in", values, "memoryTotal");
            return (Criteria) this;
        }

        public Criteria andMemoryTotalNotIn(List<Double> values) {
            addCriterion("Memory_Total not in", values, "memoryTotal");
            return (Criteria) this;
        }

        public Criteria andMemoryTotalBetween(Double value1, Double value2) {
            addCriterion("Memory_Total between", value1, value2, "memoryTotal");
            return (Criteria) this;
        }

        public Criteria andMemoryTotalNotBetween(Double value1, Double value2) {
            addCriterion("Memory_Total not between", value1, value2, "memoryTotal");
            return (Criteria) this;
        }

        public Criteria andMemoryAvailableIsNull() {
            addCriterion("Memory_Available is null");
            return (Criteria) this;
        }

        public Criteria andMemoryAvailableIsNotNull() {
            addCriterion("Memory_Available is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryAvailableEqualTo(Double value) {
            addCriterion("Memory_Available =", value, "memoryAvailable");
            return (Criteria) this;
        }

        public Criteria andMemoryAvailableNotEqualTo(Double value) {
            addCriterion("Memory_Available <>", value, "memoryAvailable");
            return (Criteria) this;
        }

        public Criteria andMemoryAvailableGreaterThan(Double value) {
            addCriterion("Memory_Available >", value, "memoryAvailable");
            return (Criteria) this;
        }

        public Criteria andMemoryAvailableGreaterThanOrEqualTo(Double value) {
            addCriterion("Memory_Available >=", value, "memoryAvailable");
            return (Criteria) this;
        }

        public Criteria andMemoryAvailableLessThan(Double value) {
            addCriterion("Memory_Available <", value, "memoryAvailable");
            return (Criteria) this;
        }

        public Criteria andMemoryAvailableLessThanOrEqualTo(Double value) {
            addCriterion("Memory_Available <=", value, "memoryAvailable");
            return (Criteria) this;
        }

        public Criteria andMemoryAvailableIn(List<Double> values) {
            addCriterion("Memory_Available in", values, "memoryAvailable");
            return (Criteria) this;
        }

        public Criteria andMemoryAvailableNotIn(List<Double> values) {
            addCriterion("Memory_Available not in", values, "memoryAvailable");
            return (Criteria) this;
        }

        public Criteria andMemoryAvailableBetween(Double value1, Double value2) {
            addCriterion("Memory_Available between", value1, value2, "memoryAvailable");
            return (Criteria) this;
        }

        public Criteria andMemoryAvailableNotBetween(Double value1, Double value2) {
            addCriterion("Memory_Available not between", value1, value2, "memoryAvailable");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentIsNull() {
            addCriterion("Memory_Percent is null");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentIsNotNull() {
            addCriterion("Memory_Percent is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentEqualTo(Double value) {
            addCriterion("Memory_Percent =", value, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentNotEqualTo(Double value) {
            addCriterion("Memory_Percent <>", value, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentGreaterThan(Double value) {
            addCriterion("Memory_Percent >", value, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentGreaterThanOrEqualTo(Double value) {
            addCriterion("Memory_Percent >=", value, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentLessThan(Double value) {
            addCriterion("Memory_Percent <", value, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentLessThanOrEqualTo(Double value) {
            addCriterion("Memory_Percent <=", value, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentIn(List<Double> values) {
            addCriterion("Memory_Percent in", values, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentNotIn(List<Double> values) {
            addCriterion("Memory_Percent not in", values, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentBetween(Double value1, Double value2) {
            addCriterion("Memory_Percent between", value1, value2, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryPercentNotBetween(Double value1, Double value2) {
            addCriterion("Memory_Percent not between", value1, value2, "memoryPercent");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedIsNull() {
            addCriterion("Memory_Used is null");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedIsNotNull() {
            addCriterion("Memory_Used is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedEqualTo(Double value) {
            addCriterion("Memory_Used =", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedNotEqualTo(Double value) {
            addCriterion("Memory_Used <>", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedGreaterThan(Double value) {
            addCriterion("Memory_Used >", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedGreaterThanOrEqualTo(Double value) {
            addCriterion("Memory_Used >=", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedLessThan(Double value) {
            addCriterion("Memory_Used <", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedLessThanOrEqualTo(Double value) {
            addCriterion("Memory_Used <=", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedIn(List<Double> values) {
            addCriterion("Memory_Used in", values, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedNotIn(List<Double> values) {
            addCriterion("Memory_Used not in", values, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedBetween(Double value1, Double value2) {
            addCriterion("Memory_Used between", value1, value2, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedNotBetween(Double value1, Double value2) {
            addCriterion("Memory_Used not between", value1, value2, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryFreeIsNull() {
            addCriterion("Memory_Free is null");
            return (Criteria) this;
        }

        public Criteria andMemoryFreeIsNotNull() {
            addCriterion("Memory_Free is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryFreeEqualTo(Double value) {
            addCriterion("Memory_Free =", value, "memoryFree");
            return (Criteria) this;
        }

        public Criteria andMemoryFreeNotEqualTo(Double value) {
            addCriterion("Memory_Free <>", value, "memoryFree");
            return (Criteria) this;
        }

        public Criteria andMemoryFreeGreaterThan(Double value) {
            addCriterion("Memory_Free >", value, "memoryFree");
            return (Criteria) this;
        }

        public Criteria andMemoryFreeGreaterThanOrEqualTo(Double value) {
            addCriterion("Memory_Free >=", value, "memoryFree");
            return (Criteria) this;
        }

        public Criteria andMemoryFreeLessThan(Double value) {
            addCriterion("Memory_Free <", value, "memoryFree");
            return (Criteria) this;
        }

        public Criteria andMemoryFreeLessThanOrEqualTo(Double value) {
            addCriterion("Memory_Free <=", value, "memoryFree");
            return (Criteria) this;
        }

        public Criteria andMemoryFreeIn(List<Double> values) {
            addCriterion("Memory_Free in", values, "memoryFree");
            return (Criteria) this;
        }

        public Criteria andMemoryFreeNotIn(List<Double> values) {
            addCriterion("Memory_Free not in", values, "memoryFree");
            return (Criteria) this;
        }

        public Criteria andMemoryFreeBetween(Double value1, Double value2) {
            addCriterion("Memory_Free between", value1, value2, "memoryFree");
            return (Criteria) this;
        }

        public Criteria andMemoryFreeNotBetween(Double value1, Double value2) {
            addCriterion("Memory_Free not between", value1, value2, "memoryFree");
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