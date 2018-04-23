package com.grad.sensor.dao;

import com.grad.sensor.domain.entity.Sensor;

import java.util.List;

/**
 * 传感器接口Dao层
 **/
public interface SensorDao {

    // 获取所有传感器ip地址
    List<Sensor> getAllSensorIP();

}
