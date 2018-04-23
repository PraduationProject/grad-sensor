package com.grad.sensor.service.impl;

import com.grad.sensor.domain.entity.Sensor;
import com.grad.sensor.manager.SensorManager;
import com.grad.sensor.service.SensorService;
import com.sun.javafx.collections.MappingChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaoyiyun on 2018/4/23.
 */
@Service
public class SensorServiceImpl implements SensorService {

    @Autowired
    private SensorManager sensorManager;

    public Map<String, String> getAllSensorIP() {
        List<Sensor> sensorList = sensorManager.getAllSensorIP();
        if (sensorList == null) {
            return null;
        }
        Map<String, String> sensorMap = new HashMap<String, String>();
        for (Sensor sensor : sensorList) {
            sensorMap.put(sensor.getSensorName(), sensor.getSensorIP());
        }
        return sensorMap;
    }
}