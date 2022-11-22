

package top.popov.testSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan("top.golubev.testSpring")
public class Configuration {

    @Bean
    public Pop pop(){
        return new Pop();
    }
    @Bean
    public Rock rock(){
        return new Rock();
    }
    @Bean
    public Player player(){
        return new Player(pop());
    }

}
