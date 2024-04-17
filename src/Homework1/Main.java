package Homework1;

public class Main {
    public static void main(String[] args) {
        Automobile automobile = new Automobile();
        automobile.setBrand("Volvo");
        automobile.setModel("XC90");
        automobile.setYear(2022);

        AutomobileUtils.printClassLoader();
        AutomobileUtils.printClassName();
    }
}
