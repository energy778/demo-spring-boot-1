package ru.energy778.demospringboot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.energy778.demospringboot1.config.ApplicationSettings;

/**
 * класс, использующий класс настроек из application.yml
 */
@Component
public class AboutInfoLoader{

    private final String version;

    @Autowired
    public AboutInfoLoader(ApplicationSettings settings){
        this.version = settings.getVersion();
    }

    public String getVersion() {
        return version;
    }

}
