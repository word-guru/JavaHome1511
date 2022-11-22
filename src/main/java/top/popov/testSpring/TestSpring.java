package top.popov.testSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);

       /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContex.xml");*/

       /* Player player = context.getBean("player", Player.class);*/
/*
        Pop pop1 = context.getBean("pop", Pop.class);
        Pop pop2 = context.getBean("pop", Pop.class);

        System.out.println(pop1 == pop2);*/

       /* player.playSong();
        context.close();

        System.out.println();
        System.out.println();

        System.out.println( player.getName());
        System.out.println(player.getVolume());*/


        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer);


    }
}
