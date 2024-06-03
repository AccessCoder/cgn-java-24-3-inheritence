package de.neuefische;

import java.util.Objects;

public class Violin extends MusicInstrument{


    private int stringAmount;
    private static String color = "Blue";

    public Violin(String manufacturer, String model, double price, int stringAmount) {
        super(manufacturer, model, price);
        this.stringAmount = stringAmount;
    }

    @Override
    public void playMusic(){
        System.out.println("Violin Sounds");
    }
    public int getStringAmount() {
        return stringAmount;
    }

    public void setStringAmount(int stringAmount) {
        this.stringAmount = stringAmount;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Violin.color = color;
    }

    @Override
    public String toString() {
        return "Violin{" +
                "stringAmount=" + stringAmount +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Violin violin = (Violin) o;
        return stringAmount == violin.stringAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stringAmount);
    }
}
