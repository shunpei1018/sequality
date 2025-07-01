// app/src/test/java/org/example/CalculateTest.java
package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculateTest {
    private Calculate calculate;

    @Before
    public void setUp() {
        calculate = new Calculate();
    }

    @Test
    public void testSum() {
        // 1から10の合計が55であることをテスト
        assertEquals(55, calculate.sum(1, 10));
        // 境界値のテスト
        assertEquals(5, calculate.sum(2, 3));
    }

    @Test
    public void testAverage() {
        // 1から10の平均が5.5であることをテスト
        // doubleの比較には誤差許容範囲(delta)を指定する
        assertEquals(5.5, calculate.average(1, 10), 0.001);
    }

    @Test
    public void testSumOdd() {
        // 1から10の奇数の合計が25であることをテスト
        assertEquals(25, calculate.sumOdd(1, 10));
    }

    @Test
    public void testSumEven() {
        // 1から10の偶数の合計が30であることをテスト
        assertEquals(30, calculate.sumEven(1, 10));
    }
}