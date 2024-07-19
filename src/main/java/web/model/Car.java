package web.model;

public class Car {
    private String stamp; // марка
    private String model; // модель
    private int year;     // год

    public Car(String stamp, String model, int year) {
        this.stamp = stamp;
        this.model = model;
        this.year = year;
    }
    public String getStamp() {
        return stamp;
    }
    public void setStamp(String stamp) {
        this.stamp = stamp;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

}
