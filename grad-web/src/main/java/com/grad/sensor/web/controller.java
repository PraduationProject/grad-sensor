package com.grad.sensor.web;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.grad.sensor.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by xiaoyiyun on 2018/4/23.
 */
@Controller
@RequestMapping("/sensor")
public class controller {

    @Resource
    private SensorService sensorService;

    @RequestMapping("/getAllSensorIP")
    @ResponseBody
    public Map getAllSensorIP(HttpServletRequest request, HttpServletResponse response) {
        Map<String, String> sensorMap = sensorService.getAllSensorIP();
        return sensorMap;
    }
}
