package pojo;

import java.util.ArrayList;
import java.util.List;

public class DiskInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiskInfoExample() {
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

        public Criteria andDiskTotalIsNull() {
            addCriterion("Disk_Total is null");
            return (Criteria) this;
        }

        public Criteria andDiskTotalIsNotNull() {
            addCriterion("Disk_Total is not null");
            return (Criteria) this;
        }

        public Criteria andDiskTotalEqualTo(Double value) {
            addCriterion("Disk_Total =", value, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskTotalNotEqualTo(Double value) {
            addCriterion("Disk_Total <>", value, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskTotalGreaterThan(Double value) {
            addCriterion("Disk_Total >", value, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("Disk_Total >=", value, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskTotalLessThan(Double value) {
            addCriterion("Disk_Total <", value, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskTotalLessThanOrEqualTo(Double value) {
            addCriterion("Disk_Total <=", value, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskTotalIn(List<Double> values) {
            addCriterion("Disk_Total in", values, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskTotalNotIn(List<Double> values) {
            addCriterion("Disk_Total not in", values, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskTotalBetween(Double value1, Double value2) {
            addCriterion("Disk_Total between", value1, value2, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskTotalNotBetween(Double value1, Double value2) {
            addCriterion("Disk_Total not between", value1, value2, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskUsedIsNull() {
            addCriterion("Disk_Used is null");
            return (Criteria) this;
        }

        public Criteria andDiskUsedIsNotNull() {
            addCriterion("Disk_Used is not null");
            return (Criteria) this;
        }

        public Criteria andDiskUsedEqualTo(Double value) {
            addCriterion("Disk_Used =", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedNotEqualTo(Double value) {
            addCriterion("Disk_Used <>", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedGreaterThan(Double value) {
            addCriterion("Disk_Used >", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedGreaterThanOrEqualTo(Double value) {
            addCriterion("Disk_Used >=", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedLessThan(Double value) {
            addCriterion("Disk_Used <", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedLessThanOrEqualTo(Double value) {
            addCriterion("Disk_Used <=", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedIn(List<Double> values) {
            addCriterion("Disk_Used in", values, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedNotIn(List<Double> values) {
            addCriterion("Disk_Used not in", values, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedBetween(Double value1, Double value2) {
            addCriterion("Disk_Used between", value1, value2, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedNotBetween(Double value1, Double value2) {
            addCriterion("Disk_Used not between", value1, value2, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskFreeIsNull() {
            addCriterion("Disk_Free is null");
            return (Criteria) this;
        }

        public Criteria andDiskFreeIsNotNull() {
            addCriterion("Disk_Free is not null");
            return (Criteria) this;
        }

        public Criteria andDiskFreeEqualTo(Double value) {
            addCriterion("Disk_Free =", value, "diskFree");
            return (Criteria) this;
        }

        public Criteria andDiskFreeNotEqualTo(Double value) {
            addCriterion("Disk_Free <>", value, "diskFree");
            return (Criteria) this;
        }

        public Criteria andDiskFreeGreaterThan(Double value) {
            addCriterion("Disk_Free >", value, "diskFree");
            return (Criteria) this;
        }

        public Criteria andDiskFreeGreaterThanOrEqualTo(Double value) {
            addCriterion("Disk_Free >=", value, "diskFree");
            return (Criteria) this;
        }

        public Criteria andDiskFreeLessThan(Double value) {
            addCriterion("Disk_Free <", value, "diskFree");
            return (Criteria) this;
        }

        public Criteria andDiskFreeLessThanOrEqualTo(Double value) {
            addCriterion("Disk_Free <=", value, "diskFree");
            return (Criteria) this;
        }

        public Criteria andDiskFreeIn(List<Double> values) {
            addCriterion("Disk_Free in", values, "diskFree");
            return (Criteria) this;
        }

        public Criteria andDiskFreeNotIn(List<Double> values) {
            addCriterion("Disk_Free not in", values, "diskFree");
            return (Criteria) this;
        }

        public Criteria andDiskFreeBetween(Double value1, Double value2) {
            addCriterion("Disk_Free between", value1, value2, "diskFree");
            return (Criteria) this;
        }

        public Criteria andDiskFreeNotBetween(Double value1, Double value2) {
            addCriterion("Disk_Free not between", value1, value2, "diskFree");
            return (Criteria) this;
        }

        public Criteria andDiskPercentIsNull() {
            addCriterion("Disk_Percent is null");
            return (Criteria) this;
        }

        public Criteria andDiskPercentIsNotNull() {
            addCriterion("Disk_Percent is not null");
            return (Criteria) this;
        }

        public Criteria andDiskPercentEqualTo(Double value) {
            addCriterion("Disk_Percent =", value, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskPercentNotEqualTo(Double value) {
            addCriterion("Disk_Percent <>", value, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskPercentGreaterThan(Double value) {
            addCriterion("Disk_Percent >", value, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskPercentGreaterThanOrEqualTo(Double value) {
            addCriterion("Disk_Percent >=", value, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskPercentLessThan(Double value) {
            addCriterion("Disk_Percent <", value, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskPercentLessThanOrEqualTo(Double value) {
            addCriterion("Disk_Percent <=", value, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskPercentIn(List<Double> values) {
            addCriterion("Disk_Percent in", values, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskPercentNotIn(List<Double> values) {
            addCriterion("Disk_Percent not in", values, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskPercentBetween(Double value1, Double value2) {
            addCriterion("Disk_Percent between", value1, value2, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskPercentNotBetween(Double value1, Double value2) {
            addCriterion("Disk_Percent not between", value1, value2, "diskPercent");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadcountIsNull() {
            addCriterion("Disk_IoReadCount is null");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadcountIsNotNull() {
            addCriterion("Disk_IoReadCount is not null");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadcountEqualTo(Double value) {
            addCriterion("Disk_IoReadCount =", value, "diskIoreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadcountNotEqualTo(Double value) {
            addCriterion("Disk_IoReadCount <>", value, "diskIoreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadcountGreaterThan(Double value) {
            addCriterion("Disk_IoReadCount >", value, "diskIoreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadcountGreaterThanOrEqualTo(Double value) {
            addCriterion("Disk_IoReadCount >=", value, "diskIoreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadcountLessThan(Double value) {
            addCriterion("Disk_IoReadCount <", value, "diskIoreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadcountLessThanOrEqualTo(Double value) {
            addCriterion("Disk_IoReadCount <=", value, "diskIoreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadcountIn(List<Double> values) {
            addCriterion("Disk_IoReadCount in", values, "diskIoreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadcountNotIn(List<Double> values) {
            addCriterion("Disk_IoReadCount not in", values, "diskIoreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadcountBetween(Double value1, Double value2) {
            addCriterion("Disk_IoReadCount between", value1, value2, "diskIoreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadcountNotBetween(Double value1, Double value2) {
            addCriterion("Disk_IoReadCount not between", value1, value2, "diskIoreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskIowritecountIsNull() {
            addCriterion("Disk_IoWriteCount is null");
            return (Criteria) this;
        }

        public Criteria andDiskIowritecountIsNotNull() {
            addCriterion("Disk_IoWriteCount is not null");
            return (Criteria) this;
        }

        public Criteria andDiskIowritecountEqualTo(Double value) {
            addCriterion("Disk_IoWriteCount =", value, "diskIowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskIowritecountNotEqualTo(Double value) {
            addCriterion("Disk_IoWriteCount <>", value, "diskIowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskIowritecountGreaterThan(Double value) {
            addCriterion("Disk_IoWriteCount >", value, "diskIowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskIowritecountGreaterThanOrEqualTo(Double value) {
            addCriterion("Disk_IoWriteCount >=", value, "diskIowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskIowritecountLessThan(Double value) {
            addCriterion("Disk_IoWriteCount <", value, "diskIowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskIowritecountLessThanOrEqualTo(Double value) {
            addCriterion("Disk_IoWriteCount <=", value, "diskIowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskIowritecountIn(List<Double> values) {
            addCriterion("Disk_IoWriteCount in", values, "diskIowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskIowritecountNotIn(List<Double> values) {
            addCriterion("Disk_IoWriteCount not in", values, "diskIowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskIowritecountBetween(Double value1, Double value2) {
            addCriterion("Disk_IoWriteCount between", value1, value2, "diskIowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskIowritecountNotBetween(Double value1, Double value2) {
            addCriterion("Disk_IoWriteCount not between", value1, value2, "diskIowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadbytesIsNull() {
            addCriterion("Disk_IoReadBytes is null");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadbytesIsNotNull() {
            addCriterion("Disk_IoReadBytes is not null");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadbytesEqualTo(Double value) {
            addCriterion("Disk_IoReadBytes =", value, "diskIoreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadbytesNotEqualTo(Double value) {
            addCriterion("Disk_IoReadBytes <>", value, "diskIoreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadbytesGreaterThan(Double value) {
            addCriterion("Disk_IoReadBytes >", value, "diskIoreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadbytesGreaterThanOrEqualTo(Double value) {
            addCriterion("Disk_IoReadBytes >=", value, "diskIoreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadbytesLessThan(Double value) {
            addCriterion("Disk_IoReadBytes <", value, "diskIoreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadbytesLessThanOrEqualTo(Double value) {
            addCriterion("Disk_IoReadBytes <=", value, "diskIoreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadbytesIn(List<Double> values) {
            addCriterion("Disk_IoReadBytes in", values, "diskIoreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadbytesNotIn(List<Double> values) {
            addCriterion("Disk_IoReadBytes not in", values, "diskIoreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadbytesBetween(Double value1, Double value2) {
            addCriterion("Disk_IoReadBytes between", value1, value2, "diskIoreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadbytesNotBetween(Double value1, Double value2) {
            addCriterion("Disk_IoReadBytes not between", value1, value2, "diskIoreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskIowritebytesIsNull() {
            addCriterion("Disk_IoWriteBytes is null");
            return (Criteria) this;
        }

        public Criteria andDiskIowritebytesIsNotNull() {
            addCriterion("Disk_IoWriteBytes is not null");
            return (Criteria) this;
        }

        public Criteria andDiskIowritebytesEqualTo(Double value) {
            addCriterion("Disk_IoWriteBytes =", value, "diskIowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskIowritebytesNotEqualTo(Double value) {
            addCriterion("Disk_IoWriteBytes <>", value, "diskIowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskIowritebytesGreaterThan(Double value) {
            addCriterion("Disk_IoWriteBytes >", value, "diskIowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskIowritebytesGreaterThanOrEqualTo(Double value) {
            addCriterion("Disk_IoWriteBytes >=", value, "diskIowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskIowritebytesLessThan(Double value) {
            addCriterion("Disk_IoWriteBytes <", value, "diskIowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskIowritebytesLessThanOrEqualTo(Double value) {
            addCriterion("Disk_IoWriteBytes <=", value, "diskIowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskIowritebytesIn(List<Double> values) {
            addCriterion("Disk_IoWriteBytes in", values, "diskIowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskIowritebytesNotIn(List<Double> values) {
            addCriterion("Disk_IoWriteBytes not in", values, "diskIowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskIowritebytesBetween(Double value1, Double value2) {
            addCriterion("Disk_IoWriteBytes between", value1, value2, "diskIowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskIowritebytesNotBetween(Double value1, Double value2) {
            addCriterion("Disk_IoWriteBytes not between", value1, value2, "diskIowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadtimeIsNull() {
            addCriterion("Disk_IoReadTime is null");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadtimeIsNotNull() {
            addCriterion("Disk_IoReadTime is not null");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadtimeEqualTo(Double value) {
            addCriterion("Disk_IoReadTime =", value, "diskIoreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadtimeNotEqualTo(Double value) {
            addCriterion("Disk_IoReadTime <>", value, "diskIoreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadtimeGreaterThan(Double value) {
            addCriterion("Disk_IoReadTime >", value, "diskIoreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadtimeGreaterThanOrEqualTo(Double value) {
            addCriterion("Disk_IoReadTime >=", value, "diskIoreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadtimeLessThan(Double value) {
            addCriterion("Disk_IoReadTime <", value, "diskIoreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadtimeLessThanOrEqualTo(Double value) {
            addCriterion("Disk_IoReadTime <=", value, "diskIoreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadtimeIn(List<Double> values) {
            addCriterion("Disk_IoReadTime in", values, "diskIoreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadtimeNotIn(List<Double> values) {
            addCriterion("Disk_IoReadTime not in", values, "diskIoreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadtimeBetween(Double value1, Double value2) {
            addCriterion("Disk_IoReadTime between", value1, value2, "diskIoreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskIoreadtimeNotBetween(Double value1, Double value2) {
            addCriterion("Disk_IoReadTime not between", value1, value2, "diskIoreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskIowritetimeIsNull() {
            addCriterion("Disk_IoWriteTime is null");
            return (Criteria) this;
        }

        public Criteria andDiskIowritetimeIsNotNull() {
            addCriterion("Disk_IoWriteTime is not null");
            return (Criteria) this;
        }

        public Criteria andDiskIowritetimeEqualTo(Double value) {
            addCriterion("Disk_IoWriteTime =", value, "diskIowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskIowritetimeNotEqualTo(Double value) {
            addCriterion("Disk_IoWriteTime <>", value, "diskIowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskIowritetimeGreaterThan(Double value) {
            addCriterion("Disk_IoWriteTime >", value, "diskIowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskIowritetimeGreaterThanOrEqualTo(Double value) {
            addCriterion("Disk_IoWriteTime >=", value, "diskIowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskIowritetimeLessThan(Double value) {
            addCriterion("Disk_IoWriteTime <", value, "diskIowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskIowritetimeLessThanOrEqualTo(Double value) {
            addCriterion("Disk_IoWriteTime <=", value, "diskIowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskIowritetimeIn(List<Double> values) {
            addCriterion("Disk_IoWriteTime in", values, "diskIowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskIowritetimeNotIn(List<Double> values) {
            addCriterion("Disk_IoWriteTime not in", values, "diskIowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskIowritetimeBetween(Double value1, Double value2) {
            addCriterion("Disk_IoWriteTime between", value1, value2, "diskIowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskIowritetimeNotBetween(Double value1, Double value2) {
            addCriterion("Disk_IoWriteTime not between", value1, value2, "diskIowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadcountIsNull() {
            addCriterion("Disk_SIoReadCount is null");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadcountIsNotNull() {
            addCriterion("Disk_SIoReadCount is not null");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadcountEqualTo(Double value) {
            addCriterion("Disk_SIoReadCount =", value, "diskSioreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadcountNotEqualTo(Double value) {
            addCriterion("Disk_SIoReadCount <>", value, "diskSioreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadcountGreaterThan(Double value) {
            addCriterion("Disk_SIoReadCount >", value, "diskSioreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadcountGreaterThanOrEqualTo(Double value) {
            addCriterion("Disk_SIoReadCount >=", value, "diskSioreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadcountLessThan(Double value) {
            addCriterion("Disk_SIoReadCount <", value, "diskSioreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadcountLessThanOrEqualTo(Double value) {
            addCriterion("Disk_SIoReadCount <=", value, "diskSioreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadcountIn(List<Double> values) {
            addCriterion("Disk_SIoReadCount in", values, "diskSioreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadcountNotIn(List<Double> values) {
            addCriterion("Disk_SIoReadCount not in", values, "diskSioreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadcountBetween(Double value1, Double value2) {
            addCriterion("Disk_SIoReadCount between", value1, value2, "diskSioreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadcountNotBetween(Double value1, Double value2) {
            addCriterion("Disk_SIoReadCount not between", value1, value2, "diskSioreadcount");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritecountIsNull() {
            addCriterion("Disk_SIoWriteCount is null");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritecountIsNotNull() {
            addCriterion("Disk_SIoWriteCount is not null");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritecountEqualTo(Double value) {
            addCriterion("Disk_SIoWriteCount =", value, "diskSiowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritecountNotEqualTo(Double value) {
            addCriterion("Disk_SIoWriteCount <>", value, "diskSiowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritecountGreaterThan(Double value) {
            addCriterion("Disk_SIoWriteCount >", value, "diskSiowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritecountGreaterThanOrEqualTo(Double value) {
            addCriterion("Disk_SIoWriteCount >=", value, "diskSiowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritecountLessThan(Double value) {
            addCriterion("Disk_SIoWriteCount <", value, "diskSiowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritecountLessThanOrEqualTo(Double value) {
            addCriterion("Disk_SIoWriteCount <=", value, "diskSiowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritecountIn(List<Double> values) {
            addCriterion("Disk_SIoWriteCount in", values, "diskSiowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritecountNotIn(List<Double> values) {
            addCriterion("Disk_SIoWriteCount not in", values, "diskSiowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritecountBetween(Double value1, Double value2) {
            addCriterion("Disk_SIoWriteCount between", value1, value2, "diskSiowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritecountNotBetween(Double value1, Double value2) {
            addCriterion("Disk_SIoWriteCount not between", value1, value2, "diskSiowritecount");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadbytesIsNull() {
            addCriterion("Disk_SIoReadBytes is null");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadbytesIsNotNull() {
            addCriterion("Disk_SIoReadBytes is not null");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadbytesEqualTo(Double value) {
            addCriterion("Disk_SIoReadBytes =", value, "diskSioreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadbytesNotEqualTo(Double value) {
            addCriterion("Disk_SIoReadBytes <>", value, "diskSioreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadbytesGreaterThan(Double value) {
            addCriterion("Disk_SIoReadBytes >", value, "diskSioreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadbytesGreaterThanOrEqualTo(Double value) {
            addCriterion("Disk_SIoReadBytes >=", value, "diskSioreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadbytesLessThan(Double value) {
            addCriterion("Disk_SIoReadBytes <", value, "diskSioreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadbytesLessThanOrEqualTo(Double value) {
            addCriterion("Disk_SIoReadBytes <=", value, "diskSioreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadbytesIn(List<Double> values) {
            addCriterion("Disk_SIoReadBytes in", values, "diskSioreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadbytesNotIn(List<Double> values) {
            addCriterion("Disk_SIoReadBytes not in", values, "diskSioreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadbytesBetween(Double value1, Double value2) {
            addCriterion("Disk_SIoReadBytes between", value1, value2, "diskSioreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadbytesNotBetween(Double value1, Double value2) {
            addCriterion("Disk_SIoReadBytes not between", value1, value2, "diskSioreadbytes");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritebytesIsNull() {
            addCriterion("Disk_SIoWriteBytes is null");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritebytesIsNotNull() {
            addCriterion("Disk_SIoWriteBytes is not null");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritebytesEqualTo(Double value) {
            addCriterion("Disk_SIoWriteBytes =", value, "diskSiowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritebytesNotEqualTo(Double value) {
            addCriterion("Disk_SIoWriteBytes <>", value, "diskSiowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritebytesGreaterThan(Double value) {
            addCriterion("Disk_SIoWriteBytes >", value, "diskSiowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritebytesGreaterThanOrEqualTo(Double value) {
            addCriterion("Disk_SIoWriteBytes >=", value, "diskSiowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritebytesLessThan(Double value) {
            addCriterion("Disk_SIoWriteBytes <", value, "diskSiowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritebytesLessThanOrEqualTo(Double value) {
            addCriterion("Disk_SIoWriteBytes <=", value, "diskSiowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritebytesIn(List<Double> values) {
            addCriterion("Disk_SIoWriteBytes in", values, "diskSiowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritebytesNotIn(List<Double> values) {
            addCriterion("Disk_SIoWriteBytes not in", values, "diskSiowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritebytesBetween(Double value1, Double value2) {
            addCriterion("Disk_SIoWriteBytes between", value1, value2, "diskSiowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritebytesNotBetween(Double value1, Double value2) {
            addCriterion("Disk_SIoWriteBytes not between", value1, value2, "diskSiowritebytes");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadtimeIsNull() {
            addCriterion("Disk_SIoReadTime is null");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadtimeIsNotNull() {
            addCriterion("Disk_SIoReadTime is not null");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadtimeEqualTo(Double value) {
            addCriterion("Disk_SIoReadTime =", value, "diskSioreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadtimeNotEqualTo(Double value) {
            addCriterion("Disk_SIoReadTime <>", value, "diskSioreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadtimeGreaterThan(Double value) {
            addCriterion("Disk_SIoReadTime >", value, "diskSioreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadtimeGreaterThanOrEqualTo(Double value) {
            addCriterion("Disk_SIoReadTime >=", value, "diskSioreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadtimeLessThan(Double value) {
            addCriterion("Disk_SIoReadTime <", value, "diskSioreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadtimeLessThanOrEqualTo(Double value) {
            addCriterion("Disk_SIoReadTime <=", value, "diskSioreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadtimeIn(List<Double> values) {
            addCriterion("Disk_SIoReadTime in", values, "diskSioreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadtimeNotIn(List<Double> values) {
            addCriterion("Disk_SIoReadTime not in", values, "diskSioreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadtimeBetween(Double value1, Double value2) {
            addCriterion("Disk_SIoReadTime between", value1, value2, "diskSioreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskSioreadtimeNotBetween(Double value1, Double value2) {
            addCriterion("Disk_SIoReadTime not between", value1, value2, "diskSioreadtime");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritetimeIsNull() {
            addCriterion("Disk_SIoWriteTime is null");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritetimeIsNotNull() {
            addCriterion("Disk_SIoWriteTime is not null");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritetimeEqualTo(Double value) {
            addCriterion("Disk_SIoWriteTime =", value, "diskSiowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritetimeNotEqualTo(Double value) {
            addCriterion("Disk_SIoWriteTime <>", value, "diskSiowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritetimeGreaterThan(Double value) {
            addCriterion("Disk_SIoWriteTime >", value, "diskSiowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritetimeGreaterThanOrEqualTo(Double value) {
            addCriterion("Disk_SIoWriteTime >=", value, "diskSiowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritetimeLessThan(Double value) {
            addCriterion("Disk_SIoWriteTime <", value, "diskSiowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritetimeLessThanOrEqualTo(Double value) {
            addCriterion("Disk_SIoWriteTime <=", value, "diskSiowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritetimeIn(List<Double> values) {
            addCriterion("Disk_SIoWriteTime in", values, "diskSiowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritetimeNotIn(List<Double> values) {
            addCriterion("Disk_SIoWriteTime not in", values, "diskSiowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritetimeBetween(Double value1, Double value2) {
            addCriterion("Disk_SIoWriteTime between", value1, value2, "diskSiowritetime");
            return (Criteria) this;
        }

        public Criteria andDiskSiowritetimeNotBetween(Double value1, Double value2) {
            addCriterion("Disk_SIoWriteTime not between", value1, value2, "diskSiowritetime");
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