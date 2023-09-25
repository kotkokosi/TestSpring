package ua.skalskyi.springcourset;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringT {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        MusicT musicT = context.getBean("musicBeanT", MusicT.class);
//        MusicPlayerT musicPlayerT = new MusicPlayerT(musicT);

        MusicPlayerT musicPlayerT = context.getBean("musicPlayerBeanT", MusicPlayerT.class);

        musicPlayerT.playMusicT();

        context.close();
    }
}
