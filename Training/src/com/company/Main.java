package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Пупа и Лупа пошли за зарплатой");
        int a = 10;
        double b = 100 + 50;
        String newName = "Dima";

        System.out.println(a + b + " newName");

        Test number1 = new Test();
        number1.setA(13);
        Test number2 = new Test();
        number2.setB(45);
        Test name1 = new Test();
        name1.setNewName(" Dima");

        System.out.println(number1.getA() + number2.getB() + name1.getNewName());


    }
}
