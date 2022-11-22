package top.popov.testSpring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
@Scope("prototype")
public class Pop implements Music{
    @Override
    public String getSong() {
        return "Random pop song";
    }


}
