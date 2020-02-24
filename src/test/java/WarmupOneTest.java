import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarmupOneTest {

    //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    //We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    @Test
    void sleepInTest() {
        //given
        //when
        boolean b1 = WarmupOne.sleepIn(false, false);
        boolean b2 = WarmupOne.sleepIn(true, false);
        boolean b3 = WarmupOne.sleepIn(false, true);
        //then
        assertAll(
                () -> assertEquals(true, b1),
                () -> assertEquals(false, b2),
                () -> assertEquals(true, b3)
        );
    }

    //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    //We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
    @Test
    void monkeyTroubleTest() {
        //given
        //when
        boolean b1 = WarmupOne.monkeyTrouble(true, true);
        boolean b2 = WarmupOne.monkeyTrouble(false, false);
        boolean b3 = WarmupOne.monkeyTrouble(true, false);
        //then
        assertAll(
                () -> assertEquals(true, b1),
                () -> assertEquals(true, b2),
                () -> assertEquals(false, b3)
        );
    }

    //Given two int values, return their sum. Unless the two values are the same, then return double their sum.
    @Test
    void sumDoubleTest() {
        //given

        //when
        int i1 = WarmupOne.sumDouble(1, 2);
        int i2 = WarmupOne.sumDouble(3, 2);
        int i3 = WarmupOne.sumDouble(2, 2);
        //then
        assertAll(
                () -> assertEquals(3, i1),
                () -> assertEquals(5, i2),
                () -> assertEquals(8, i3)
        );
    }

    //Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

    @Test
    void diff21Test() {
        //given
        int number1 = 19;
        int number2 = 10;
        int number3 = 21;
        //when
        int i1 = WarmupOne.diff21(number1);
        int i2 = WarmupOne.diff21(number2);
        int i3 = WarmupOne.diff21(number3);
        //then
        assertAll(
                () -> assertEquals(2, i1),
                () -> assertEquals(11, i2),
                () -> assertEquals(0, i3)
        );
    }

    //We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
    //We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.


    @Test
    void parrotTroubleTest() {
        //given
        boolean isItTaking1 = true;
        int hour1 = 6;
        boolean isItTaking2 = true;
        int hour2 = 7;
        boolean isItTaking3 = false;
        int hour3 = 6;
        //when
        boolean b1 = WarmupOne.parrotTrouble(isItTaking1, hour1);
        boolean b2 = WarmupOne.parrotTrouble(isItTaking2, hour2);
        boolean b3 = WarmupOne.parrotTrouble(isItTaking3, hour3);
        //then
        assertAll(
                () -> assertEquals(true, b1),
                () -> assertEquals(false, b2),
                () -> assertEquals(false, b3)
        );
    }

    //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    @Test
    void makes10Test() {
        //given
        int a1 = 9;
        int b1 = 10;
        int a2 = 9;
        int b2 = 9;
        int a3 = 1;
        int b3 = 9;
        //when
        boolean ab1 = WarmupOne.makes10(a1, b1);
        boolean ab2 = WarmupOne.makes10(a2, b2);
        boolean ab3 = WarmupOne.makes10(a3, b3);
        //then
        assertAll(
                () -> assertEquals(true, ab1),
                () -> assertEquals(false, ab2),
                () -> assertEquals(true, ab3)
        );
    }

    @Test
    void shouldExchangeFirstAndLastChars() {

        String code = WarmupOne.frontBack("code");
        System.out.println(code);
    }

    @Test
    void shouldAddTwoFirstChartAtFrontAndBackOfString() {
        //given
        final String str1 = "kitten";
        String str2 = "ha";
        String str3 = "abc";
        //when
        assertAll(
                () -> assertEquals("kikittenki", WarmupOne.front22(str1)),
                () -> assertEquals("hahaha", WarmupOne.front22(str2)),
                () -> assertEquals("ababcab", WarmupOne.front22(str3))
        );
        //then
    }

    @Test
    void shouldReturnTrueIfStraingStartsWithHi() {
    String str1 = "hi there";
    String str2 = "hi";
    String str3 = "hello hi";

    //when
        assertAll(
                ()-> assertEquals(true,WarmupOne.startHi(str1)),
                ()-> assertEquals(true,WarmupOne.startHi(str2)),
                ()-> assertEquals(false,WarmupOne.startHi(str3))
        );
        System.out.println(WarmupOne.loneTeen(1,9));
    }
}
