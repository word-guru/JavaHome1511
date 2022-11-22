package top.popov.testSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource(("classpath:Player.properties"))
public class Player {

    @Value("${Player.name}")
    private String name;
    @Value("${Player.volume}")
    private int volume;


    @Autowired
    @Qualifier("pop")
    public Music music;


    public Player(Music music){
        this.music = music;
    }

    public void init(){
        System.out.println("initialization");
    }

    public void destroy(){
        System.out.println("destruction");
    }
    public String playSong() {
       return music.getSong();
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return music.toString();
    }

    /* @Autowired
    private Pop music1;
    @Autowired
    private Rock music2;


    public void Player(Pop music1, Rock music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public Player(){}


    public void playSong() {
        System.out.println(music1.getSong());
        System.out.println(music2.getSong());
    }*/
}
