package com.jesh.employee.service;

public class InfoResponse {

    private String application;
    private String environment;
    private String version;

    public InfoResponse(String application, String environment, String version) {
        this.application = application;
        this.environment = environment;
        this.version = version;
    }

    public String getApplication() {
        return application;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getVersion() {
        return version;
    }
}
