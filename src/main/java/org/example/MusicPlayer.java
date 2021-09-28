package org.example;

public class MusicPlayer {
    Music music;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void PlayMusic(){
        System.out.println("Playing " + music.getSong());
    }
}
