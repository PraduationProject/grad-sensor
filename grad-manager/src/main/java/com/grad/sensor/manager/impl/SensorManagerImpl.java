package com.grad.sensor.manager.impl;

import com.grad.sensor.dao.SensorDao;
import com.grad.sensor.domain.entity.Sensor;
import com.grad.sensor.manager.SensorManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by xiaoyiyun on 2018/4/23.
 */
@Component
public class SensorManagerImpl implements SensorManager {

    @Autowired
    private SensorDao sensorDao;

    // 获取所有传感器ip地址
    public List<Sensor> getAllSensorIP() {
        return sensorDao.getAllSensorIP();
    }
}