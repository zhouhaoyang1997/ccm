package pojo;

import java.util.ArrayList;
import java.util.List;

public class CpuInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CpuInfoExample() {
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

        public Criteria andCpuUserIsNull() {
            addCriterion("Cpu_User is null");
            return (Criteria) this;
        }

        public Criteria andCpuUserIsNotNull() {
            addCriterion("Cpu_User is not null");
            return (Criteria) this;
        }

        public Criteria andCpuUserEqualTo(Double value) {
            addCriterion("Cpu_User =", value, "cpuUser");
            return (Criteria) this;
        }

        public Criteria andCpuUserNotEqualTo(Double value) {
            addCriterion("Cpu_User <>", value, "cpuUser");
            return (Criteria) this;
        }

        public Criteria andCpuUserGreaterThan(Double value) {
            addCriterion("Cpu_User >", value, "cpuUser");
            return (Criteria) this;
        }

        public Criteria andCpuUserGreaterThanOrEqualTo(Double value) {
            addCriterion("Cpu_User >=", value, "cpuUser");
            return (Criteria) this;
        }

        public Criteria andCpuUserLessThan(Double value) {
            addCriterion("Cpu_User <", value, "cpuUser");
            return (Criteria) this;
        }

        public Criteria andCpuUserLessThanOrEqualTo(Double value) {
            addCriterion("Cpu_User <=", value, "cpuUser");
            return (Criteria) this;
        }

        public Criteria andCpuUserIn(List<Double> values) {
            addCriterion("Cpu_User in", values, "cpuUser");
            return (Criteria) this;
        }

        public Criteria andCpuUserNotIn(List<Double> values) {
            addCriterion("Cpu_User not in", values, "cpuUser");
            return (Criteria) this;
        }

        public Criteria andCpuUserBetween(Double value1, Double value2) {
            addCriterion("Cpu_User between", value1, value2, "cpuUser");
            return (Criteria) this;
        }

        public Criteria andCpuUserNotBetween(Double value1, Double value2) {
            addCriterion("Cpu_User not between", value1, value2, "cpuUser");
            return (Criteria) this;
        }

        public Criteria andCpuSystemIsNull() {
            addCriterion("Cpu_System is null");
            return (Criteria) this;
        }

        public Criteria andCpuSystemIsNotNull() {
            addCriterion("Cpu_System is not null");
            return (Criteria) this;
        }

        public Criteria andCpuSystemEqualTo(Double value) {
            addCriterion("Cpu_System =", value, "cpuSystem");
            return (Criteria) this;
        }

        public Criteria andCpuSystemNotEqualTo(Double value) {
            addCriterion("Cpu_System <>", value, "cpuSystem");
            return (Criteria) this;
        }

        public Criteria andCpuSystemGreaterThan(Double value) {
            addCriterion("Cpu_System >", value, "cpuSystem");
            return (Criteria) this;
        }

        public Criteria andCpuSystemGreaterThanOrEqualTo(Double value) {
            addCriterion("Cpu_System >=", value, "cpuSystem");
            return (Criteria) this;
        }

        public Criteria andCpuSystemLessThan(Double value) {
            addCriterion("Cpu_System <", value, "cpuSystem");
            return (Criteria) this;
        }

        public Criteria andCpuSystemLessThanOrEqualTo(Double value) {
            addCriterion("Cpu_System <=", value, "cpuSystem");
            return (Criteria) this;
        }

        public Criteria andCpuSystemIn(List<Double> values) {
            addCriterion("Cpu_System in", values, "cpuSystem");
            return (Criteria) this;
        }

        public Criteria andCpuSystemNotIn(List<Double> values) {
            addCriterion("Cpu_System not in", values, "cpuSystem");
            return (Criteria) this;
        }

        public Criteria andCpuSystemBetween(Double value1, Double value2) {
            addCriterion("Cpu_System between", value1, value2, "cpuSystem");
            return (Criteria) this;
        }

        public Criteria andCpuSystemNotBetween(Double value1, Double value2) {
            addCriterion("Cpu_System not between", value1, value2, "cpuSystem");
            return (Criteria) this;
        }

        public Criteria andCpuIdleIsNull() {
            addCriterion("Cpu_Idle is null");
            return (Criteria) this;
        }

        public Criteria andCpuIdleIsNotNull() {
            addCriterion("Cpu_Idle is not null");
            return (Criteria) this;
        }

        public Criteria andCpuIdleEqualTo(Double value) {
            addCriterion("Cpu_Idle =", value, "cpuIdle");
            return (Criteria) this;
        }

        public Criteria andCpuIdleNotEqualTo(Double value) {
            addCriterion("Cpu_Idle <>", value, "cpuIdle");
            return (Criteria) this;
        }

        public Criteria andCpuIdleGreaterThan(Double value) {
            addCriterion("Cpu_Idle >", value, "cpuIdle");
            return (Criteria) this;
        }

        public Criteria andCpuIdleGreaterThanOrEqualTo(Double value) {
            addCriterion("Cpu_Idle >=", value, "cpuIdle");
            return (Criteria) this;
        }

        public Criteria andCpuIdleLessThan(Double value) {
            addCriterion("Cpu_Idle <", value, "cpuIdle");
            return (Criteria) this;
        }

        public Criteria andCpuIdleLessThanOrEqualTo(Double value) {
            addCriterion("Cpu_Idle <=", value, "cpuIdle");
            return (Criteria) this;
        }

        public Criteria andCpuIdleIn(List<Double> values) {
            addCriterion("Cpu_Idle in", values, "cpuIdle");
            return (Criteria) this;
        }

        public Criteria andCpuIdleNotIn(List<Double> values) {
            addCriterion("Cpu_Idle not in", values, "cpuIdle");
            return (Criteria) this;
        }

        public Criteria andCpuIdleBetween(Double value1, Double value2) {
            addCriterion("Cpu_Idle between", value1, value2, "cpuIdle");
            return (Criteria) this;
        }

        public Criteria andCpuIdleNotBetween(Double value1, Double value2) {
            addCriterion("Cpu_Idle not between", value1, value2, "cpuIdle");
            return (Criteria) this;
        }

        public Criteria andCpuInterruptIsNull() {
            addCriterion("Cpu_interrupt is null");
            return (Criteria) this;
        }

        public Criteria andCpuInterruptIsNotNull() {
            addCriterion("Cpu_interrupt is not null");
            return (Criteria) this;
        }

        public Criteria andCpuInterruptEqualTo(Double value) {
            addCriterion("Cpu_interrupt =", value, "cpuInterrupt");
            return (Criteria) this;
        }

        public Criteria andCpuInterruptNotEqualTo(Double value) {
            addCriterion("Cpu_interrupt <>", value, "cpuInterrupt");
            return (Criteria) this;
        }

        public Criteria andCpuInterruptGreaterThan(Double value) {
            addCriterion("Cpu_interrupt >", value, "cpuInterrupt");
            return (Criteria) this;
        }

        public Criteria andCpuInterruptGreaterThanOrEqualTo(Double value) {
            addCriterion("Cpu_interrupt >=", value, "cpuInterrupt");
            return (Criteria) this;
        }

        public Criteria andCpuInterruptLessThan(Double value) {
            addCriterion("Cpu_interrupt <", value, "cpuInterrupt");
            return (Criteria) this;
        }

        public Criteria andCpuInterruptLessThanOrEqualTo(Double value) {
            addCriterion("Cpu_interrupt <=", value, "cpuInterrupt");
            return (Criteria) this;
        }

        public Criteria andCpuInterruptIn(List<Double> values) {
            addCriterion("Cpu_interrupt in", values, "cpuInterrupt");
            return (Criteria) this;
        }

        public Criteria andCpuInterruptNotIn(List<Double> values) {
            addCriterion("Cpu_interrupt not in", values, "cpuInterrupt");
            return (Criteria) this;
        }

        public Criteria andCpuInterruptBetween(Double value1, Double value2) {
            addCriterion("Cpu_interrupt between", value1, value2, "cpuInterrupt");
            return (Criteria) this;
        }

        public Criteria andCpuInterruptNotBetween(Double value1, Double value2) {
            addCriterion("Cpu_interrupt not between", value1, value2, "cpuInterrupt");
            return (Criteria) this;
        }

        public Criteria andCpuDpcIsNull() {
            addCriterion("Cpu_Dpc is null");
            return (Criteria) this;
        }

        public Criteria andCpuDpcIsNotNull() {
            addCriterion("Cpu_Dpc is not null");
            return (Criteria) this;
        }

        public Criteria andCpuDpcEqualTo(Double value) {
            addCriterion("Cpu_Dpc =", value, "cpuDpc");
            return (Criteria) this;
        }

        public Criteria andCpuDpcNotEqualTo(Double value) {
            addCriterion("Cpu_Dpc <>", value, "cpuDpc");
            return (Criteria) this;
        }

        public Criteria andCpuDpcGreaterThan(Double value) {
            addCriterion("Cpu_Dpc >", value, "cpuDpc");
            return (Criteria) this;
        }

        public Criteria andCpuDpcGreaterThanOrEqualTo(Double value) {
            addCriterion("Cpu_Dpc >=", value, "cpuDpc");
            return (Criteria) this;
        }

        public Criteria andCpuDpcLessThan(Double value) {
            addCriterion("Cpu_Dpc <", value, "cpuDpc");
            return (Criteria) this;
        }

        public Criteria andCpuDpcLessThanOrEqualTo(Double value) {
            addCriterion("Cpu_Dpc <=", value, "cpuDpc");
            return (Criteria) this;
        }

        public Criteria andCpuDpcIn(List<Double> values) {
            addCriterion("Cpu_Dpc in", values, "cpuDpc");
            return (Criteria) this;
        }

        public Criteria andCpuDpcNotIn(List<Double> values) {
            addCriterion("Cpu_Dpc not in", values, "cpuDpc");
            return (Criteria) this;
        }

        public Criteria andCpuDpcBetween(Double value1, Double value2) {
            addCriterion("Cpu_Dpc between", value1, value2, "cpuDpc");
            return (Criteria) this;
        }

        public Criteria andCpuDpcNotBetween(Double value1, Double value2) {
            addCriterion("Cpu_Dpc not between", value1, value2, "cpuDpc");
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