package com.grad.sensor.domain.entity;

import java.util.Date;

/**
 * 传感器表对应实体类
 */
public class Sensor {

    private int id; // 主键id
    private String sensorName;  // 传感器型号
    private String sensorType;  // 检测数据类型
    private String sensorIP;    // 传感器IP地址 xx.xx.xx.xx.xx
    private int thresMax;   // 最大阈值
    private int thresMin;   // 最小阈值
    private String managers;    // 监控人 xx,xx,xx …… 员工号
    private Date createdDate;   // 记录创建时间
    private Date modifiedDate;    // 记录修改时间
    private int status; // 记录状态 1：正常 2：删除 默认1

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getSensorIP() {
        return sensorIP;
    }

    public void setSensorIP(String sensorIP) {
        this.sensorIP = sensorIP;
    }

    public int getThresMax() {
        return thresMax;
    }

    public void setThresMax(int thresMax) {
        this.thresMax = thresMax;
    }

    public int getThresMin() {
        return thresMin;
    }

    public void setThresMin(int thresMin) {
        this.thresMin = thresMin;
    }

    public String getManagers() {
        return managers;
    }

    public void setManagers(String managers) {
        this.managers = managers;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", sensorName='" + sensorName + '\'' +
                ", sensorType='" + sensorType + '\'' +
                ", sensorIP='" + sensorIP + '\'' +
                ", thresMax=" + thresMax +
                ", thresMin=" + thresMin +
                ", managers='" + managers + '\'' +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                ", status=" + status +
                '}';
    }
}