// app/src/main/java/org/example/Calculate.java
package org.example;

public class Calculate {

    // 2つの数とその間の数の合計を求める
    public int sum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    // 2つの数とその間の数の平均値を計算する
    public double average(int start, int end) {
        int sum = sum(start, end);
        double count = end - start + 1;
        return (double) sum / count;
    }

    // 2つの数とその間の数について奇数の合計を求める
    public int sumOdd(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    // 2つの数とその間の数について偶数の合計を求める
    public int sumEven(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}