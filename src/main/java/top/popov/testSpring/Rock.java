package top.popov.testSpring;

import org.springframework.stereotype.Component;

@Component
public class Rock implements Music{
    @Override
    public String getSong() {
        return "SOAD";
    }
}
