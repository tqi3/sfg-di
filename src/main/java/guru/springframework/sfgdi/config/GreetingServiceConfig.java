package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Java configuration; this is a different way from putting "@Service" on top of those GreetingService classes, aka the stereotypical way.
// Always useful with third party libraries for bringing those things into the Spring context.
@Configuration
public class GreetingServiceConfig {
    @Bean
    ConstructorInjectedGreetingService constructorInjectedGreetingService() {
        return new ConstructorInjectedGreetingService();
    }

    @Bean
    //the name of the bean by default is the method name, aka "propertyInjectedGreetingService"
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }
}
