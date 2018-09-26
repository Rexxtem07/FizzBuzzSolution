package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;


public class SolutionTest {
    @Test
    public void testSolution() {
        //test data
        //situation of "Fizz"
        String three = "Fizz";
        String six = "Fizz";

        //situation of "Buzz"
        String five = "Buzz";
        String ten = "Buzz";

        //situation of "FizzBuzz"
        String fifteen = "FizzBuzz";

        //situation of normal
        String one = "1";
        String four = "4";
        String thirteen ="13";



        Solution solution = new Solution();
        List<String> result = solution.fizzBuzz(100);

        //Check that if 3 are equal with "Fizz"
        assertEquals(three, result.get(2));
        //Check that if 6 are equal with "Fizz"
        assertEquals(six, result.get(5));
        //Check that if 5 are equal with "Buzz"
        assertEquals(five, result.get(4));
        //Check that if 10 are equal with "Buzz"
        assertEquals(ten, result.get(9));
        //Check that if 15 are equal with "FizzBuzz"
        assertEquals(fifteen, result.get(14));
        //Check that if 1 are storage originally
        assertEquals(one, result.get(0));
        //Check that if 4 are storage originally
        assertEquals(four, result.get(3));
        //Check that if 13 are storage originally
        assertEquals(thirteen, result.get(12));

        System.out.println("Test1 Passed");
    }

    @Test
    public void testSolution2() {
        //test data
        //situation of "Fizz"
        String three = "Fizz";
        String six = "Fizz";
        String thirteen ="Fizz";
        String thirtyOne= "Fizz";

        //situation of "Buzz"
        String five = "Buzz";
        String ten = "Buzz";
        String twentyFive = "Buzz";
        String fiftyTwo ="Buzz";

        //situation of "FizzBuzz"
        String fifteen = "FizzBuzz";
        String thirtyFive = "FizzBuzz";
        String fiftyThree="FizzBuzz";
        String fiftyFour="FizzBuzz";

        //situation of normal
        String one = "1";
        String four = "4";

        Solution solution = new Solution();
        List<String> result = solution.fizzBuzz2(100);

        //Check that if 3 are equal with "Fizz"
        assertEquals(three, result.get(2));
        //Check that if 6 are equal with "Fizz"
        assertEquals(six, result.get(5));
        //Check that if 13 are equal with "Fizz"
        assertEquals(thirteen, result.get(12));
        //Check that if 31 are equal with "Fizz"
        assertEquals(thirtyOne, result.get(30));

        //Check that if 5 are equal with "Buzz"
        assertEquals(five, result.get(4));
        //Check that if 10 are equal with "Buzz"
        assertEquals(ten, result.get(9));
        //Check that if 25 are equal with "Buzz"
        assertEquals(twentyFive, result.get(24));
        //Check that if 52 are equal with "Buzz"
        assertEquals(fiftyTwo, result.get(51));

        //Check that if 15 are equal with "FizzBuzz"
        assertEquals(fifteen, result.get(14));
        //Check that if 35 are equal with "FizzBuzz"
        assertEquals(thirtyFive, result.get(34));
        //Check that if 53 are equal with "FizzBuzz"
        assertEquals(fiftyThree, result.get(52));
        //Check that if 54 are equal with "FizzBuzz"
        assertEquals(fiftyFour, result.get(53));

        //Check that if 1 are storage originally
        assertEquals(one, result.get(0));
        //Check that if 4 are storage originally
        assertEquals(four, result.get(3));


        System.out.println("Test2 Passed");
    }
}
