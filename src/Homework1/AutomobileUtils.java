package Homework1;

public class AutomobileUtils {
    public static final String DEFAULT_BRAND = "FORD";
    public static final String DEFAULT_MODEL = "MONDEO";
    public static final int DEFAULT_YEAR = 2002;

    public static void printClassLoader() {
        System.out.println("Класслоадер для класса Automobile: " + Automobile.class.getClassLoader());
    }
    public static void printClassName() {
        System.out.println("Имя класса: " + Automobile.class.getName());
    }
}
