package com.github.playground.dubbo.server.dubbo.service;

import com.github.playground.dubbo.server.dubbo.api.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Dubbo: Hello " + name;
    }
}