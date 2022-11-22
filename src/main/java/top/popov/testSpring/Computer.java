package top.popov.testSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    public Player player;
    @Autowired
    public Computer (Player player){
        this.player = player;
    }

    @Override
    public String toString() {
        return "Computer player playing" +
                 player.playSong();
    }
}
