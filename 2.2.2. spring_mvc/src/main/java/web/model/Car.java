package web.model;

public class Car {
    private String name;
    private String color;
    private int sinceYear;

    public Car(String name, String color, int sinceYear) {
        this.name = name;
        this.color = color;
        this.sinceYear = sinceYear;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSinceYear() {
        return sinceYear;
    }

    public void setSinceYear(int sinceYear) {
        this.sinceYear = sinceYear;
    }

}
