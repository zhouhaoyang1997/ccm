package pojo;

import java.util.ArrayList;
import java.util.List;

public class NetInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NetInfoExample() {
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

        public Criteria andNetIobytessentIsNull() {
            addCriterion("Net_IoBytesSent is null");
            return (Criteria) this;
        }

        public Criteria andNetIobytessentIsNotNull() {
            addCriterion("Net_IoBytesSent is not null");
            return (Criteria) this;
        }

        public Criteria andNetIobytessentEqualTo(Double value) {
            addCriterion("Net_IoBytesSent =", value, "netIobytessent");
            return (Criteria) this;
        }

        public Criteria andNetIobytessentNotEqualTo(Double value) {
            addCriterion("Net_IoBytesSent <>", value, "netIobytessent");
            return (Criteria) this;
        }

        public Criteria andNetIobytessentGreaterThan(Double value) {
            addCriterion("Net_IoBytesSent >", value, "netIobytessent");
            return (Criteria) this;
        }

        public Criteria andNetIobytessentGreaterThanOrEqualTo(Double value) {
            addCriterion("Net_IoBytesSent >=", value, "netIobytessent");
            return (Criteria) this;
        }

        public Criteria andNetIobytessentLessThan(Double value) {
            addCriterion("Net_IoBytesSent <", value, "netIobytessent");
            return (Criteria) this;
        }

        public Criteria andNetIobytessentLessThanOrEqualTo(Double value) {
            addCriterion("Net_IoBytesSent <=", value, "netIobytessent");
            return (Criteria) this;
        }

        public Criteria andNetIobytessentIn(List<Double> values) {
            addCriterion("Net_IoBytesSent in", values, "netIobytessent");
            return (Criteria) this;
        }

        public Criteria andNetIobytessentNotIn(List<Double> values) {
            addCriterion("Net_IoBytesSent not in", values, "netIobytessent");
            return (Criteria) this;
        }

        public Criteria andNetIobytessentBetween(Double value1, Double value2) {
            addCriterion("Net_IoBytesSent between", value1, value2, "netIobytessent");
            return (Criteria) this;
        }

        public Criteria andNetIobytessentNotBetween(Double value1, Double value2) {
            addCriterion("Net_IoBytesSent not between", value1, value2, "netIobytessent");
            return (Criteria) this;
        }

        public Criteria andNetIobytesrecvIsNull() {
            addCriterion("Net_IoBytesRecv is null");
            return (Criteria) this;
        }

        public Criteria andNetIobytesrecvIsNotNull() {
            addCriterion("Net_IoBytesRecv is not null");
            return (Criteria) this;
        }

        public Criteria andNetIobytesrecvEqualTo(Double value) {
            addCriterion("Net_IoBytesRecv =", value, "netIobytesrecv");
            return (Criteria) this;
        }

        public Criteria andNetIobytesrecvNotEqualTo(Double value) {
            addCriterion("Net_IoBytesRecv <>", value, "netIobytesrecv");
            return (Criteria) this;
        }

        public Criteria andNetIobytesrecvGreaterThan(Double value) {
            addCriterion("Net_IoBytesRecv >", value, "netIobytesrecv");
            return (Criteria) this;
        }

        public Criteria andNetIobytesrecvGreaterThanOrEqualTo(Double value) {
            addCriterion("Net_IoBytesRecv >=", value, "netIobytesrecv");
            return (Criteria) this;
        }

        public Criteria andNetIobytesrecvLessThan(Double value) {
            addCriterion("Net_IoBytesRecv <", value, "netIobytesrecv");
            return (Criteria) this;
        }

        public Criteria andNetIobytesrecvLessThanOrEqualTo(Double value) {
            addCriterion("Net_IoBytesRecv <=", value, "netIobytesrecv");
            return (Criteria) this;
        }

        public Criteria andNetIobytesrecvIn(List<Double> values) {
            addCriterion("Net_IoBytesRecv in", values, "netIobytesrecv");
            return (Criteria) this;
        }

        public Criteria andNetIobytesrecvNotIn(List<Double> values) {
            addCriterion("Net_IoBytesRecv not in", values, "netIobytesrecv");
            return (Criteria) this;
        }

        public Criteria andNetIobytesrecvBetween(Double value1, Double value2) {
            addCriterion("Net_IoBytesRecv between", value1, value2, "netIobytesrecv");
            return (Criteria) this;
        }

        public Criteria andNetIobytesrecvNotBetween(Double value1, Double value2) {
            addCriterion("Net_IoBytesRecv not between", value1, value2, "netIobytesrecv");
            return (Criteria) this;
        }

        public Criteria andNetIopacketssentIsNull() {
            addCriterion("Net_IoPacketsSent is null");
            return (Criteria) this;
        }

        public Criteria andNetIopacketssentIsNotNull() {
            addCriterion("Net_IoPacketsSent is not null");
            return (Criteria) this;
        }

        public Criteria andNetIopacketssentEqualTo(Double value) {
            addCriterion("Net_IoPacketsSent =", value, "netIopacketssent");
            return (Criteria) this;
        }

        public Criteria andNetIopacketssentNotEqualTo(Double value) {
            addCriterion("Net_IoPacketsSent <>", value, "netIopacketssent");
            return (Criteria) this;
        }

        public Criteria andNetIopacketssentGreaterThan(Double value) {
            addCriterion("Net_IoPacketsSent >", value, "netIopacketssent");
            return (Criteria) this;
        }

        public Criteria andNetIopacketssentGreaterThanOrEqualTo(Double value) {
            addCriterion("Net_IoPacketsSent >=", value, "netIopacketssent");
            return (Criteria) this;
        }

        public Criteria andNetIopacketssentLessThan(Double value) {
            addCriterion("Net_IoPacketsSent <", value, "netIopacketssent");
            return (Criteria) this;
        }

        public Criteria andNetIopacketssentLessThanOrEqualTo(Double value) {
            addCriterion("Net_IoPacketsSent <=", value, "netIopacketssent");
            return (Criteria) this;
        }

        public Criteria andNetIopacketssentIn(List<Double> values) {
            addCriterion("Net_IoPacketsSent in", values, "netIopacketssent");
            return (Criteria) this;
        }

        public Criteria andNetIopacketssentNotIn(List<Double> values) {
            addCriterion("Net_IoPacketsSent not in", values, "netIopacketssent");
            return (Criteria) this;
        }

        public Criteria andNetIopacketssentBetween(Double value1, Double value2) {
            addCriterion("Net_IoPacketsSent between", value1, value2, "netIopacketssent");
            return (Criteria) this;
        }

        public Criteria andNetIopacketssentNotBetween(Double value1, Double value2) {
            addCriterion("Net_IoPacketsSent not between", value1, value2, "netIopacketssent");
            return (Criteria) this;
        }

        public Criteria andNetIopacketsrecvIsNull() {
            addCriterion("Net_IoPacketsRecv is null");
            return (Criteria) this;
        }

        public Criteria andNetIopacketsrecvIsNotNull() {
            addCriterion("Net_IoPacketsRecv is not null");
            return (Criteria) this;
        }

        public Criteria andNetIopacketsrecvEqualTo(Double value) {
            addCriterion("Net_IoPacketsRecv =", value, "netIopacketsrecv");
            return (Criteria) this;
        }

        public Criteria andNetIopacketsrecvNotEqualTo(Double value) {
            addCriterion("Net_IoPacketsRecv <>", value, "netIopacketsrecv");
            return (Criteria) this;
        }

        public Criteria andNetIopacketsrecvGreaterThan(Double value) {
            addCriterion("Net_IoPacketsRecv >", value, "netIopacketsrecv");
            return (Criteria) this;
        }

        public Criteria andNetIopacketsrecvGreaterThanOrEqualTo(Double value) {
            addCriterion("Net_IoPacketsRecv >=", value, "netIopacketsrecv");
            return (Criteria) this;
        }

        public Criteria andNetIopacketsrecvLessThan(Double value) {
            addCriterion("Net_IoPacketsRecv <", value, "netIopacketsrecv");
            return (Criteria) this;
        }

        public Criteria andNetIopacketsrecvLessThanOrEqualTo(Double value) {
            addCriterion("Net_IoPacketsRecv <=", value, "netIopacketsrecv");
            return (Criteria) this;
        }

        public Criteria andNetIopacketsrecvIn(List<Double> values) {
            addCriterion("Net_IoPacketsRecv in", values, "netIopacketsrecv");
            return (Criteria) this;
        }

        public Criteria andNetIopacketsrecvNotIn(List<Double> values) {
            addCriterion("Net_IoPacketsRecv not in", values, "netIopacketsrecv");
            return (Criteria) this;
        }

        public Criteria andNetIopacketsrecvBetween(Double value1, Double value2) {
            addCriterion("Net_IoPacketsRecv between", value1, value2, "netIopacketsrecv");
            return (Criteria) this;
        }

        public Criteria andNetIopacketsrecvNotBetween(Double value1, Double value2) {
            addCriterion("Net_IoPacketsRecv not between", value1, value2, "netIopacketsrecv");
            return (Criteria) this;
        }

        public Criteria andNetIoerrinIsNull() {
            addCriterion("Net_IoErrin is null");
            return (Criteria) this;
        }

        public Criteria andNetIoerrinIsNotNull() {
            addCriterion("Net_IoErrin is not null");
            return (Criteria) this;
        }

        public Criteria andNetIoerrinEqualTo(Double value) {
            addCriterion("Net_IoErrin =", value, "netIoerrin");
            return (Criteria) this;
        }

        public Criteria andNetIoerrinNotEqualTo(Double value) {
            addCriterion("Net_IoErrin <>", value, "netIoerrin");
            return (Criteria) this;
        }

        public Criteria andNetIoerrinGreaterThan(Double value) {
            addCriterion("Net_IoErrin >", value, "netIoerrin");
            return (Criteria) this;
        }

        public Criteria andNetIoerrinGreaterThanOrEqualTo(Double value) {
            addCriterion("Net_IoErrin >=", value, "netIoerrin");
            return (Criteria) this;
        }

        public Criteria andNetIoerrinLessThan(Double value) {
            addCriterion("Net_IoErrin <", value, "netIoerrin");
            return (Criteria) this;
        }

        public Criteria andNetIoerrinLessThanOrEqualTo(Double value) {
            addCriterion("Net_IoErrin <=", value, "netIoerrin");
            return (Criteria) this;
        }

        public Criteria andNetIoerrinIn(List<Double> values) {
            addCriterion("Net_IoErrin in", values, "netIoerrin");
            return (Criteria) this;
        }

        public Criteria andNetIoerrinNotIn(List<Double> values) {
            addCriterion("Net_IoErrin not in", values, "netIoerrin");
            return (Criteria) this;
        }

        public Criteria andNetIoerrinBetween(Double value1, Double value2) {
            addCriterion("Net_IoErrin between", value1, value2, "netIoerrin");
            return (Criteria) this;
        }

        public Criteria andNetIoerrinNotBetween(Double value1, Double value2) {
            addCriterion("Net_IoErrin not between", value1, value2, "netIoerrin");
            return (Criteria) this;
        }

        public Criteria andNetIoerroutIsNull() {
            addCriterion("Net_IoErrout is null");
            return (Criteria) this;
        }

        public Criteria andNetIoerroutIsNotNull() {
            addCriterion("Net_IoErrout is not null");
            return (Criteria) this;
        }

        public Criteria andNetIoerroutEqualTo(Double value) {
            addCriterion("Net_IoErrout =", value, "netIoerrout");
            return (Criteria) this;
        }

        public Criteria andNetIoerroutNotEqualTo(Double value) {
            addCriterion("Net_IoErrout <>", value, "netIoerrout");
            return (Criteria) this;
        }

        public Criteria andNetIoerroutGreaterThan(Double value) {
            addCriterion("Net_IoErrout >", value, "netIoerrout");
            return (Criteria) this;
        }

        public Criteria andNetIoerroutGreaterThanOrEqualTo(Double value) {
            addCriterion("Net_IoErrout >=", value, "netIoerrout");
            return (Criteria) this;
        }

        public Criteria andNetIoerroutLessThan(Double value) {
            addCriterion("Net_IoErrout <", value, "netIoerrout");
            return (Criteria) this;
        }

        public Criteria andNetIoerroutLessThanOrEqualTo(Double value) {
            addCriterion("Net_IoErrout <=", value, "netIoerrout");
            return (Criteria) this;
        }

        public Criteria andNetIoerroutIn(List<Double> values) {
            addCriterion("Net_IoErrout in", values, "netIoerrout");
            return (Criteria) this;
        }

        public Criteria andNetIoerroutNotIn(List<Double> values) {
            addCriterion("Net_IoErrout not in", values, "netIoerrout");
            return (Criteria) this;
        }

        public Criteria andNetIoerroutBetween(Double value1, Double value2) {
            addCriterion("Net_IoErrout between", value1, value2, "netIoerrout");
            return (Criteria) this;
        }

        public Criteria andNetIoerroutNotBetween(Double value1, Double value2) {
            addCriterion("Net_IoErrout not between", value1, value2, "netIoerrout");
            return (Criteria) this;
        }

        public Criteria andNetIodropinIsNull() {
            addCriterion("Net_IoDropin is null");
            return (Criteria) this;
        }

        public Criteria andNetIodropinIsNotNull() {
            addCriterion("Net_IoDropin is not null");
            return (Criteria) this;
        }

        public Criteria andNetIodropinEqualTo(Double value) {
            addCriterion("Net_IoDropin =", value, "netIodropin");
            return (Criteria) this;
        }

        public Criteria andNetIodropinNotEqualTo(Double value) {
            addCriterion("Net_IoDropin <>", value, "netIodropin");
            return (Criteria) this;
        }

        public Criteria andNetIodropinGreaterThan(Double value) {
            addCriterion("Net_IoDropin >", value, "netIodropin");
            return (Criteria) this;
        }

        public Criteria andNetIodropinGreaterThanOrEqualTo(Double value) {
            addCriterion("Net_IoDropin >=", value, "netIodropin");
            return (Criteria) this;
        }

        public Criteria andNetIodropinLessThan(Double value) {
            addCriterion("Net_IoDropin <", value, "netIodropin");
            return (Criteria) this;
        }

        public Criteria andNetIodropinLessThanOrEqualTo(Double value) {
            addCriterion("Net_IoDropin <=", value, "netIodropin");
            return (Criteria) this;
        }

        public Criteria andNetIodropinIn(List<Double> values) {
            addCriterion("Net_IoDropin in", values, "netIodropin");
            return (Criteria) this;
        }

        public Criteria andNetIodropinNotIn(List<Double> values) {
            addCriterion("Net_IoDropin not in", values, "netIodropin");
            return (Criteria) this;
        }

        public Criteria andNetIodropinBetween(Double value1, Double value2) {
            addCriterion("Net_IoDropin between", value1, value2, "netIodropin");
            return (Criteria) this;
        }

        public Criteria andNetIodropinNotBetween(Double value1, Double value2) {
            addCriterion("Net_IoDropin not between", value1, value2, "netIodropin");
            return (Criteria) this;
        }

        public Criteria andNetIodropoutIsNull() {
            addCriterion("Net_IoDropout is null");
            return (Criteria) this;
        }

        public Criteria andNetIodropoutIsNotNull() {
            addCriterion("Net_IoDropout is not null");
            return (Criteria) this;
        }

        public Criteria andNetIodropoutEqualTo(Double value) {
            addCriterion("Net_IoDropout =", value, "netIodropout");
            return (Criteria) this;
        }

        public Criteria andNetIodropoutNotEqualTo(Double value) {
            addCriterion("Net_IoDropout <>", value, "netIodropout");
            return (Criteria) this;
        }

        public Criteria andNetIodropoutGreaterThan(Double value) {
            addCriterion("Net_IoDropout >", value, "netIodropout");
            return (Criteria) this;
        }

        public Criteria andNetIodropoutGreaterThanOrEqualTo(Double value) {
            addCriterion("Net_IoDropout >=", value, "netIodropout");
            return (Criteria) this;
        }

        public Criteria andNetIodropoutLessThan(Double value) {
            addCriterion("Net_IoDropout <", value, "netIodropout");
            return (Criteria) this;
        }

        public Criteria andNetIodropoutLessThanOrEqualTo(Double value) {
            addCriterion("Net_IoDropout <=", value, "netIodropout");
            return (Criteria) this;
        }

        public Criteria andNetIodropoutIn(List<Double> values) {
            addCriterion("Net_IoDropout in", values, "netIodropout");
            return (Criteria) this;
        }

        public Criteria andNetIodropoutNotIn(List<Double> values) {
            addCriterion("Net_IoDropout not in", values, "netIodropout");
            return (Criteria) this;
        }

        public Criteria andNetIodropoutBetween(Double value1, Double value2) {
            addCriterion("Net_IoDropout between", value1, value2, "netIodropout");
            return (Criteria) this;
        }

        public Criteria andNetIodropoutNotBetween(Double value1, Double value2) {
            addCriterion("Net_IoDropout not between", value1, value2, "netIodropout");
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