package org.phucdx.config;

import org.phucdx.Alien;
import org.phucdx.Computer;
import org.phucdx.Desktop;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Configurable
public class AppConfig {
    @Bean
    public Alien alien(Computer com) {
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return obj;
    }

//    @Bean(name = {"com1", "desktop1", "phucdx1"})
    @Bean
//    @Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    }
}
