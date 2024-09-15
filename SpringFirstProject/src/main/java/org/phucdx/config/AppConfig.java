package org.phucdx.config;

import org.phucdx.Desktop;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class AppConfig {
//    @Bean(name = {"com1", "desktop1", "phucdx1"})
    @Bean
    public Desktop desktop() {
        return new Desktop();
    }
}
