package de.neuefische;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Violin violin = new Violin("Test", "Test", 400.50, 4);

//        violin.playMusic();
//
//        Piano piano = new Piano("Test", "Test", 12000);
//
//        piano.playMusic();
//
//        Violin[] violins = {violin};
//        Piano[] pianos = {piano};
//
//        MusicInstrument[] musicStore = {piano, violin};
//
//        soundCheck(violin);
//        soundCheck(piano);

        Violin violin2 = new Violin("Test", "Test", 400.50, 4);



    }

    public static void soundCheck(MusicInstrument musicInstrument){
        musicInstrument.playMusic();
    }
}