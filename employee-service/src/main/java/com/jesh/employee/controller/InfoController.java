package com.jesh.employee.controller;

import com.jesh.employee.service.InfoResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @Value("${APP_NAME:employee-service}")
    private String application;

    @Value("${APP_ENVIRONMENT:Local}")
    private String environment;

    @Value("${BUILD_NUMBER:local}")
    private String version;

    @GetMapping("/api/v1/info")
    public InfoResponse info() {

        return new InfoResponse(
                application,
                environment,
                version
        );
    }
}
