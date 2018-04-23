package com.grad.sensor.manager;

import com.grad.sensor.domain.entity.Sensor;

import java.util.List;

/**
 * Created by xiaoyiyun on 2018/4/23.
 */
public interface SensorManager {

    // 获取所有传感器ip地址
    List<Sensor> getAllSensorIP();
}
