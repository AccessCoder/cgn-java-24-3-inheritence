package de.neuefische;

import java.util.Objects;

public class MusicInstrument {

    private String manufacturer;
    private String model;
    private double price;

    public MusicInstrument(String manufacturer, String model, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }

    public void playMusic(){
        System.out.println("How does an instrument sounds?");
    }


    @Override
    public String toString() {
        return "MusicInstrument{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicInstrument that = (MusicInstrument) o;
        return Double.compare(that.price, price) == 0 && Objects.equals(manufacturer, that.manufacturer) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, price);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
