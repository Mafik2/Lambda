package com.company;

public class Main {

    public static void main(String[] args) {
        LambdaList<Integer> numbers = new LambdaList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);
        numbers.add(12);
        System.out.println(numbers.all(i -> i < 3));
        System.out.println(numbers.any(i -> i == 5));
        System.out.println(numbers.get(0));
        System.out.println(numbers.max((i, j) -> i - j));
        System.out.println(numbers.min((i, j) -> i - j));
        System.out.println(numbers.map(i -> i * 2).get(2));

    }
}
