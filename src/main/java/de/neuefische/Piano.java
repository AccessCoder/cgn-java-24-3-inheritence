package de.neuefische;

public class Piano extends MusicInstrument{


    public Piano(String manufacturer, String model, double price) {
        super(manufacturer, model, price);
    }


    public void playTest(){
        System.out.println("testing");
    }
    @Override
    public void playMusic(){
        System.out.println("Piano Sounds");
    }

    @Override
    public String toString() {
        return "Piano{} " + super.toString();
    }


}
