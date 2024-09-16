package org.phucdx.config;

import org.phucdx.Alien;
import org.phucdx.Computer;
import org.phucdx.Desktop;
import org.phucdx.Laptop;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configurable
public class AppConfig {
    @Bean
    public Alien alien(Computer com) { // @Qualifier("laptop")
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return obj;
    }

//    @Bean(name = {"com1", "desktop1", "phucdx1"})
    @Bean
//    @Scope("prototype")
    @Primary
    public Desktop desktop() {
        return new Desktop();
    }

    @Bean
    public Laptop laptop() {
        return new Laptop();
    }
}
