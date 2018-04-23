package com.grad.sensor.service;

import com.grad.sensor.domain.entity.Sensor;

import java.util.Map;

/**
 * Created by xiaoyiyun on 2018/4/23.
 */
public interface SensorService {

    // 获取所有传感器ip地址
    Map<String, String> getAllSensorIP();
}
