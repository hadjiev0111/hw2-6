package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("результат сочитания 8 и 9 = " + (new Calculator<Double>().plus(8D, 9D)));
        System.out.println("результат умножения 4 на 6 = " + new Calculator<Integer>().multyply(4, 6));
        System.out.println("результат вычитанния 1 из 3 = " + new Calculator<Float>().minus(1F, 3F));
        System.out.println("результат деления 5 на 6 = " + new Calculator<Double>().divigen(5D, 6D));

    }
}
