package ua.skalskyi.springcourset;

public class MusicPlayerT {
    private MusicT musicT;

    public MusicPlayerT(MusicT musicT) {
        this.musicT = musicT;
    }

    public void playMusicT(){
        System.out.println("Playing: " + musicT.getSongT());
    }
}
