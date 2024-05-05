package Homework4;

public class Main {
    public static void main(String[] args) {
        MyData myData = new MyData("Денис", "Гончаров", 35, "illnino1313@mail.ru");
        myData.serializeToFile("myData.ser");
        MyData loadedData = MyData.deserializeFromFile("myData.ser");
        System.out.println(loadedData);
    }
}