import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Warmup1 {

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
}
