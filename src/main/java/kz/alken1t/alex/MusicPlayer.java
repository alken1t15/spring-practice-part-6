package kz.alken1t.alex;


import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        int randomNumber = (int) (Math.random() * 3);
        System.out.println("Playing: " + musicList.get(randomNumber).getSong());
    }

}