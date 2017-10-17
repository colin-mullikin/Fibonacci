package com.gohealth.fibonacci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author <a href="mailto:cmullikin@gohealth.com">Colin Mullikin</a>
 */
@RunWith(Parameterized.class)
public class FibonacciTest {

    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
            {-1,0},{0,0}, {1,1}, {2,1}, {3,2}, {4,3}, {5,5}, {6,8}, {7,13}, {8,21}
        });
    }

    @Parameter
    public int fInput;

    @Parameter(1)
    public int fExpected;


    @Test
    public void test() {
        assertEquals(fExpected, Fibonacci.fib(fInput));
    }

//    @Test
//    public void fibTest(){
//        int result = Application.fib(3);
//        assertEquals(2,result);
//    }
//
//    @Test
//    public void fibNegativeTest(){
//        int result = Application.fib(-2);
//        assertEquals(0,result);
//    }
//
//    @Test
//    public void fibZeroTest(){
//        int result = Application.fib(0);
//        assertEquals(0,result);
//    }
}
