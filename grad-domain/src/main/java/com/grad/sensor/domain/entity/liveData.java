package com.grad.sensor.domain.entity;

import java.util.Date;

/**
 * 即时数据表对应实体类
 */
public class LiveData {

    private int id; // 主键id
    private int value;  // 即时数据值
    private int offset; // 偏移量
    private int sensorId;   // 对应传感器id
    private Date createdDate;   // 记录创建时间
    private Date modifiedDate;    // 记录修改时间
    private int status; // 记录状态 1：正常 2：删除 默认1

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getSensorId() {
        return sensorId;
    }

    public void setSensorId(int sensorId) {
        this.sensorId = sensorId;
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
        return "LiveData{" +
                "id=" + id +
                ", value=" + value +
                ", offset=" + offset +
                ", sensorId=" + sensorId +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                ", status=" + status +
                '}';
    }
}
