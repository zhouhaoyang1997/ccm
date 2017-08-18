package pojo;

import java.util.ArrayList;
import java.util.List;

public class SummaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SummaryExample() {
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

        public Criteria andClusterIsNull() {
            addCriterion("Server is null");
            return (Criteria) this;
        }

        public Criteria andClusterIsNotNull() {
            addCriterion("Server is not null");
            return (Criteria) this;
        }

        public Criteria andClusterEqualTo(String value) {
            addCriterion("Server =", value, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterNotEqualTo(String value) {
            addCriterion("Server <>", value, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterGreaterThan(String value) {
            addCriterion("Server >", value, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterGreaterThanOrEqualTo(String value) {
            addCriterion("Server >=", value, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterLessThan(String value) {
            addCriterion("Server <", value, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterLessThanOrEqualTo(String value) {
            addCriterion("Server <=", value, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterLike(String value) {
            addCriterion("Server like", value, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterNotLike(String value) {
            addCriterion("Server not like", value, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterIn(List<String> values) {
            addCriterion("Server in", values, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterNotIn(List<String> values) {
            addCriterion("Server not in", values, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterBetween(String value1, String value2) {
            addCriterion("Server between", value1, value2, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterNotBetween(String value1, String value2) {
            addCriterion("Server not between", value1, value2, "cluster");
            return (Criteria) this;
        }

        public Criteria andServerIpIsNull() {
            addCriterion("Server_Ip is null");
            return (Criteria) this;
        }

        public Criteria andServerIpIsNotNull() {
            addCriterion("Server_Ip is not null");
            return (Criteria) this;
        }

        public Criteria andServerIpEqualTo(String value) {
            addCriterion("Server_Ip =", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotEqualTo(String value) {
            addCriterion("Server_Ip <>", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpGreaterThan(String value) {
            addCriterion("Server_Ip >", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpGreaterThanOrEqualTo(String value) {
            addCriterion("Server_Ip >=", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLessThan(String value) {
            addCriterion("Server_Ip <", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLessThanOrEqualTo(String value) {
            addCriterion("Server_Ip <=", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLike(String value) {
            addCriterion("Server_Ip like", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotLike(String value) {
            addCriterion("Server_Ip not like", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpIn(List<String> values) {
            addCriterion("Server_Ip in", values, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotIn(List<String> values) {
            addCriterion("Server_Ip not in", values, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpBetween(String value1, String value2) {
            addCriterion("Server_Ip between", value1, value2, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotBetween(String value1, String value2) {
            addCriterion("Server_Ip not between", value1, value2, "serverIp");
            return (Criteria) this;
        }

        public Criteria andBootTimeIsNull() {
            addCriterion("Boot_Time is null");
            return (Criteria) this;
        }

        public Criteria andBootTimeIsNotNull() {
            addCriterion("Boot_Time is not null");
            return (Criteria) this;
        }

        public Criteria andBootTimeEqualTo(Double value) {
            addCriterion("Boot_Time =", value, "bootTime");
            return (Criteria) this;
        }

        public Criteria andBootTimeNotEqualTo(Double value) {
            addCriterion("Boot_Time <>", value, "bootTime");
            return (Criteria) this;
        }

        public Criteria andBootTimeGreaterThan(Double value) {
            addCriterion("Boot_Time >", value, "bootTime");
            return (Criteria) this;
        }

        public Criteria andBootTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("Boot_Time >=", value, "bootTime");
            return (Criteria) this;
        }

        public Criteria andBootTimeLessThan(Double value) {
            addCriterion("Boot_Time <", value, "bootTime");
            return (Criteria) this;
        }

        public Criteria andBootTimeLessThanOrEqualTo(Double value) {
            addCriterion("Boot_Time <=", value, "bootTime");
            return (Criteria) this;
        }

        public Criteria andBootTimeIn(List<Double> values) {
            addCriterion("Boot_Time in", values, "bootTime");
            return (Criteria) this;
        }

        public Criteria andBootTimeNotIn(List<Double> values) {
            addCriterion("Boot_Time not in", values, "bootTime");
            return (Criteria) this;
        }

        public Criteria andBootTimeBetween(Double value1, Double value2) {
            addCriterion("Boot_Time between", value1, value2, "bootTime");
            return (Criteria) this;
        }

        public Criteria andBootTimeNotBetween(Double value1, Double value2) {
            addCriterion("Boot_Time not between", value1, value2, "bootTime");
            return (Criteria) this;
        }

        public Criteria andCpuCountIsNull() {
            addCriterion("Cpu_Count is null");
            return (Criteria) this;
        }

        public Criteria andCpuCountIsNotNull() {
            addCriterion("Cpu_Count is not null");
            return (Criteria) this;
        }

        public Criteria andCpuCountEqualTo(Double value) {
            addCriterion("Cpu_Count =", value, "cpuCount");
            return (Criteria) this;
        }

        public Criteria andCpuCountNotEqualTo(Double value) {
            addCriterion("Cpu_Count <>", value, "cpuCount");
            return (Criteria) this;
        }

        public Criteria andCpuCountGreaterThan(Double value) {
            addCriterion("Cpu_Count >", value, "cpuCount");
            return (Criteria) this;
        }

        public Criteria andCpuCountGreaterThanOrEqualTo(Double value) {
            addCriterion("Cpu_Count >=", value, "cpuCount");
            return (Criteria) this;
        }

        public Criteria andCpuCountLessThan(Double value) {
            addCriterion("Cpu_Count <", value, "cpuCount");
            return (Criteria) this;
        }

        public Criteria andCpuCountLessThanOrEqualTo(Double value) {
            addCriterion("Cpu_Count <=", value, "cpuCount");
            return (Criteria) this;
        }

        public Criteria andCpuCountIn(List<Double> values) {
            addCriterion("Cpu_Count in", values, "cpuCount");
            return (Criteria) this;
        }

        public Criteria andCpuCountNotIn(List<Double> values) {
            addCriterion("Cpu_Count not in", values, "cpuCount");
            return (Criteria) this;
        }

        public Criteria andCpuCountBetween(Double value1, Double value2) {
            addCriterion("Cpu_Count between", value1, value2, "cpuCount");
            return (Criteria) this;
        }

        public Criteria andCpuCountNotBetween(Double value1, Double value2) {
            addCriterion("Cpu_Count not between", value1, value2, "cpuCount");
            return (Criteria) this;
        }

        public Criteria andCpuLogicalIsNull() {
            addCriterion("Cpu_Logical is null");
            return (Criteria) this;
        }

        public Criteria andCpuLogicalIsNotNull() {
            addCriterion("Cpu_Logical is not null");
            return (Criteria) this;
        }

        public Criteria andCpuLogicalEqualTo(Double value) {
            addCriterion("Cpu_Logical =", value, "cpuLogical");
            return (Criteria) this;
        }

        public Criteria andCpuLogicalNotEqualTo(Double value) {
            addCriterion("Cpu_Logical <>", value, "cpuLogical");
            return (Criteria) this;
        }

        public Criteria andCpuLogicalGreaterThan(Double value) {
            addCriterion("Cpu_Logical >", value, "cpuLogical");
            return (Criteria) this;
        }

        public Criteria andCpuLogicalGreaterThanOrEqualTo(Double value) {
            addCriterion("Cpu_Logical >=", value, "cpuLogical");
            return (Criteria) this;
        }

        public Criteria andCpuLogicalLessThan(Double value) {
            addCriterion("Cpu_Logical <", value, "cpuLogical");
            return (Criteria) this;
        }

        public Criteria andCpuLogicalLessThanOrEqualTo(Double value) {
            addCriterion("Cpu_Logical <=", value, "cpuLogical");
            return (Criteria) this;
        }

        public Criteria andCpuLogicalIn(List<Double> values) {
            addCriterion("Cpu_Logical in", values, "cpuLogical");
            return (Criteria) this;
        }

        public Criteria andCpuLogicalNotIn(List<Double> values) {
            addCriterion("Cpu_Logical not in", values, "cpuLogical");
            return (Criteria) this;
        }

        public Criteria andCpuLogicalBetween(Double value1, Double value2) {
            addCriterion("Cpu_Logical between", value1, value2, "cpuLogical");
            return (Criteria) this;
        }

        public Criteria andCpuLogicalNotBetween(Double value1, Double value2) {
            addCriterion("Cpu_Logical not between", value1, value2, "cpuLogical");
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