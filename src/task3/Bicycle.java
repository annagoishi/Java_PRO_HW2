package task3;
//Напишите класс Велосипед  с минимум пятью полями. В программе создайте 3 разных велосипеда
// (например, шоссейный, горный, детский) и выведите каждый из них в консоль.
//Создайте массив из этих велосипедов. С помощью Arrays.toString() превратите массив в строку и
// выведите в консоль. Запустите программу.
//Вернитесь в объявление класса велосипед. Переопределите метод toString, чтобы он выводил полное
// описание велосипеда по его полям.
//Перейдите в код метода Arrays.toString() и посмотрите на его реализацию.

import java.util.Arrays;

public class Bicycle {
    private String model;
    private int wheelSize;
    private String type;
    private int gears;
    private String color;

    public Bicycle(String model, int wheelSize, String type, int gears, String color) {
        this.model = model;
        this.wheelSize = wheelSize;
        this.type = type;
        this.gears = gears;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "model='" + model + '\'' +
                ", wheelSize=" + wheelSize +
                ", type='" + type + '\'' +
                ", gears=" + gears +
                ", color=" + color +
                '}';
    }
    public static void main(String[] args) {
        Bicycle roadBike = new Bicycle("Road Bike", 28, "Road", 18, "black");
        Bicycle mountainBike = new Bicycle("Mountain Bike", 26, "Mountain", 21, "green");
        Bicycle kidsBike = new Bicycle("Kids Bike", 16, "Kids", 6, "yellow");

        Bicycle[] bicycles = {roadBike, mountainBike, kidsBike};

        for (Bicycle bicycle : bicycles) {
            System.out.println(bicycle);
        }

        System.out.println(Arrays.toString(bicycles));
    }
}
