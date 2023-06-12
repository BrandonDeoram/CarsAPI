package com.example.CarsAPI.Car;

public class Car {
    private Integer id;
    private String make;
    private String model;
    private String type;
    private String trim;
    private String color;
    private String engine;
    private Integer year;
    private Integer horsepower;

    public Car() {
    }

    public Car(String make, String model, String type, String trim, String color, String engine, Integer year, Integer horsepower) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.trim = trim;
        this.color = color;
        this.engine = engine;
        this.year = year;
        this.horsepower = horsepower;
    }

    public Car(Integer id, String make, String model, String type, String trim, String color, String engine, Integer year, Integer horsepower) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.type = type;
        this.trim = trim;
        this.color = color;
        this.engine = engine;
        this.year = year;
        this.horsepower = horsepower;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", trim='" + trim + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", year=" + year +
                ", horsepower=" + horsepower +
                '}';
    }
}
