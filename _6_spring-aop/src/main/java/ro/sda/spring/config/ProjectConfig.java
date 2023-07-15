package ro.sda.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ro.sda.spring.aspects.MathAspect;
import ro.sda.spring.services.MathService;

@ComponentScan(basePackages = {"ro.sda.spring.services"})
@Configuration
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public MathAspect aspect(){
        return new MathAspect();
    }

}
