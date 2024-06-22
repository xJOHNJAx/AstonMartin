package Homework3;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static List<String> findData(List<Data> data, List<Data> data2) {
        return Stream.of(data2)
                .flatMap(Collection::stream)
                .collect(Collectors.partitioningBy(d -> data.stream()
                        .anyMatch(x -> x.code().equals(d.code()) && x.version().equals(d.version()))))
                .get(false)
                .stream()
                .map(Data::code)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public record Data(String code, String version) {}

    public static void main(String[] args) {
        List<Data> dataList = Arrays.asList(new Data("22", "1"),
                new Data("11", "3"),
                new Data("33", "1"));
        List<Data> dataList2 = Arrays.asList(new Data("11", "3"),
                new Data("22", "3"),
                new Data("33", "2"));

        System.out.println(findData(dataList, dataList2));
    }
}
