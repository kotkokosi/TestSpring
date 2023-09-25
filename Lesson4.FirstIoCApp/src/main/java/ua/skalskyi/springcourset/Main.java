package ua.skalskyi.springcourset;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicT musicT = context.getBean("musicBeanT", MusicT.class);

        MusicPlayerT musicPlayerT = new MusicPlayerT(musicT);

        musicPlayerT.playMusicT();
    }
}
