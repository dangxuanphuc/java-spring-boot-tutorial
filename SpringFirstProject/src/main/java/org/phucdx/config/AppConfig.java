package org.phucdx.config;

import org.phucdx.Desktop;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class AppConfig {
    @Bean
    public Desktop desktop() {
        return new Desktop();
    }
}
