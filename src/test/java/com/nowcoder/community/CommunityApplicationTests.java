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
}
