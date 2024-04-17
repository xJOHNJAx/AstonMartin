package Homework1;

import java.util.Calendar;

public class Automobile {
    private String brand;
    private String model;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            System.out.println("Некорректная марка автомобиля");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty()) {
            this.model = model;
        } else {
            System.out.println("Некорректная модель автомобиля");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1960 && year <= Calendar.getInstance().get(Calendar.YEAR)) {
            this.year = year;
        } else {
            System.out.println("Некорректный год выпуска автомобиля");
        }
    }
}


