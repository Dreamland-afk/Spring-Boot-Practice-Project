package com.dreamquest.practice.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Person {
    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



public class StreamClass {

    private static  long counter;

    private static void wasCalled() {
        counter++;
    }
    public static void main(String[] args) throws IOException {

        List<Person>
        people = new ArrayList<>();

        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 28));
        people.add(new Person("David", 35));
        people.add(new Person("Jack",
                22));
        people.add(new Person("Frank", 40));
        people.add(new Person("Grace", 27));
        people.add(new Person("Henry", 32));
        people.add(new Person("Isabella", 29));
        people.add(new Person("Jack", 30));

        int number[] = {1,2,3,4,5,6,7,7,8};

        List<Integer> collect7 = Arrays.stream(number).boxed().collect(Collectors.collectingAndThen(Collectors.groupingBy(Function.identity(), Collectors.counting()), m -> m.entrySet().stream().filter(entr -> entr.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList())));

        Set<Integer> collect8 = Arrays.stream(number).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println("Collection7: "+collect7);
        System.out.println("Collection8: "+collect8);
        IntStream sum = Arrays.stream(number);
        System.out.println(sum);

//        Arrays.stream(number).boxed()

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(10);
        numbers1.add(20);
        numbers1.add(30);
        numbers1.add(40);
        numbers1.add(50);

        int sum1 = numbers1.stream().mapToInt(num -> num).max().orElse(0);
        Integer i = numbers1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println("2nd Height"+ i);
        OptionalDouble average = numbers1.stream().mapToInt(Integer::intValue).average();
        System.out.println(average.getAsDouble());

        String name = "Suukdeb is very very good boy";
        Stream.of(name).flatMap(str -> Stream.of(str.split(" "))).forEach(System.out::println);
        Optional<String> reduce = Stream.of(name).flatMap(str -> Arrays.stream(str.split(" "))).reduce(BinaryOperator.minBy((a, b) -> b.length() - a.length()));
        System.out.println("Reduce"+reduce);
        Map<String, Optional<String>> collect3 = Stream.of(name).flatMap(str -> Arrays.stream(str.split(" "))).collect(Collectors.groupingBy(Function.identity(), Collectors.reducing((a, b) -> a)));

        long count = Stream.of(name).flatMap(str -> Stream.of(str.split(" "))).count();
        System.out.println("Words in a sentance: "+count);

        System.out.println("collect3: "+collect3);


        System.out.println(sum1);

        List<String> words = Arrays.asList("swapnadeep", "abir", "Sayan","Sayan","Swapnadeep","Rahul");
        words.stream().filter(str -> str.startsWith("a")).map(String::toUpperCase).forEach(System.out::println);
        words.stream().filter(s -> s.length() > 5).distinct().forEach(System.out::println);
        List<String> collect2 = words.stream().sorted(Comparator.comparing(String::toUpperCase,Comparator.reverseOrder())).toList();
        System.out.println("C2"+collect2);
//        Collections.reverse(collect2);

        List<Integer> collect = numbers1.stream().sorted((a,b) -> b-a).collect(Collectors.toList());
        System.out.println(collect);

        Map<Integer, List<String>> collect1 = people.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));
        System.out.println(collect1);


        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6,
                        7, 8, 9)
        );

        List<Integer> collect4 = listOfLists.stream().flatMap(Collection::stream).toList();
        System.out.println("Collect4: "+collect4);


        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 1);

        List<Integer> collect5 = Stream.of(list1, list2).flatMap(Collection::stream).collect(Collectors.collectingAndThen(Collectors.groupingBy(Function.identity(), Collectors.counting()), m -> m.entrySet().stream().filter(entr -> entr.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList())));

        System.out.println("collect5 : "+collect5);

        Map<String, Integer> map = Map.of("a", 1, "b", 2, "c", 3);
        System.out.println(map);
        List<Integer> collect6 = map.values().stream().collect(Collectors.toCollection(LinkedList::new));
        System.out.println("collect6: "+collect6);

        ////
////        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
////        counter = 0;
////        Optional<String> stringStream = list.stream().filter(element -> {
////            System.out.println("filter() was called for element: " + element);
////            wasCalled();
////            return element.contains("2");
////        }).map(item -> {
////            System.out.println(" Map executed");
////
////           return item;
////        }).findFirst();
////
////        System.out.println("Count is: "+ counter);
//
//
//        Set<String> isContain = new HashSet<>();
//        Predicate<String> predicate = (String) -> {
//
//            if(isContain.contains(String))
//                return true;
//            else {
//                isContain.add(String);
//                return false;
//            }
//        };
//
//        Map<String,Integer> wordMap = new HashMap<>();
//
//
////
//        List<String> words = Arrays.asList("swapnadeep", "abir", "Sayan","Sayan","Swapnadeep","Rahul");
//        List<String> words1 = Arrays.asList("swapnadeep", "abir", "Sayan","Sayan","Swapnadeep","Rahul");
//        List<Integer> Numberlist = Arrays.asList(1, 2, 3, 4, 5, 6, 3);
////
//        words.stream();
//        Stream.of(words);
//
////         words.stream().map(str -> {
////
////            str = str.toLowerCase();
////            if (wordMap.containsKey(str)) {
////                wordMap.put(str, wordMap.get(str) + 1);
////
////            } else {
////                wordMap.put(str, 1);
////            }
////            return str;
////        }).forEach(str ->{});
//////        System.out.println(count);
////        System.out.println(wordMap);
////
//        Map<String, Long> collect = words.stream().map(String::toLowerCase).collect(Collectors.groupingBy(str -> str, Collectors.counting()));
////        System.out.println(collect);
//
//        int[] num = {1,2,3,45,643,12,21};
//
//
//
//        Arrays.stream(num).sorted().skip(2).forEach(System.out::println);
//
//        Arrays.stream(num).so
//
////        System.out.println(max.getAsInt());
//
//        List<String> collect = Stream.of(words1, words).flatMap(List::stream).collect(Collectors.toList());
//
//        System.out.println(collect);
//
////        Stream.
//
//        File a = new File("Test.txt");
//        FileWriter fileWriter = new FileWriter(a, true);
//
//        List<Path> files = List.of(
//                Paths.get("I:\\Code Workspace\\Spring workspace\\practice\\practice\\src\\main\\java\\com\\dreamquest\\practice\\test\\DemoA.java"),
//                Paths.get("I:\\Code Workspace\\Spring workspace\\practice\\practice\\src\\main\\java\\com\\dreamquest\\practice\\test\\DemoB.java")
//        );
//
//
//
//
//        files.stream().flatMap( path -> {
//            try {
//                return Files.lines(path);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }).forEach( str -> {
//            try {
//                fileWriter.append(str);
////                fileWriter.append("\n");
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        fileWriter.flush();

    }
}
