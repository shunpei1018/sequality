// app/src/main/java/org/example/App.java
package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Calculate calculate = new Calculate();

        // 2と3の合計と平均
        int sum2_3 = calculate.sum(2, 3);
        double avg2_3 = calculate.average(2, 3);
        System.out.println("Sum of 2 and 3 is " + sum2_3 + ". Average is " + avg2_3 + ".");

        // 1から10の合計と平均
        int sum1_10 = calculate.sum(1, 10);
        double avg1_10 = calculate.average(1, 10);
        System.out.println("Sum of 1 to 10 is " + sum1_10 + ". Average is " + avg1_10 + ".");

        // 1から10の奇数・偶数の合計
        int oddSum = calculate.sumOdd(1, 10);
        int evenSum = calculate.sumEven(1, 10);
        System.out.println("Sum of odd of 1 to 10 is " + oddSum + ".");
        System.out.println("Sum of even of 1 to 10 is " + evenSum + ".");
    }
}