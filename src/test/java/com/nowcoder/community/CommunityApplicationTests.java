package com.nowcoder.community;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class CommunityApplicationTests {

    @Test
    public void contextLoads() {
        assertEquals(8, quickPowIterative(2, 3));
        assertEquals(1, quickPowIterative(2, 0));
        assertEquals(0, quickPowIterative(0, 5));
        assertEquals(-8, quickPowIterative(-2, 3));
        assertEquals(8, quickPowRecursive(2, 3));
        assertEquals(1, quickPowRecursive(2, 0));
        assertEquals(0, quickPowRecursive(0, 5));
        assertEquals(-8, quickPowRecursive(-2, 3));
    }

    // 实现一个快速幂计算的方法
    public long quickPowIterative(long base, long exponent) {
        long result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result *= base;
            }
            base *= base;
            exponent >>= 1;
        }
        return result;
    }
    public long quickPowRecursive(long base, long exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        long half = quickPowRecursive(base, exponent / 2);
        if (exponent % 2 == 0) {
            return half * half;
        } else {
            return half * half * base;
        }
    }


}
