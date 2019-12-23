package ru.energy778.demospringboot1.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
* класс для работы с настройками из application.yml
*/
@Component
@ConfigurationProperties("application")
public class ApplicationSettings {

    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}

