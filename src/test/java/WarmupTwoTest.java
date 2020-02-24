import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarmupTwoTest {

    // Given a string and a non-negative int n, return a larger string that is n copies of the original string.
    @Test
    public void stringTimesTest() {
        //given
        String h = "Hi";
        int a1 = 1;
        int a2 = 2;
        int a3 = 3;
        //when
        String s1 = WarmupTwo.stringTimes(h, a1);
        String s2 = WarmupTwo.stringTimes(h, a2);
        String s3 = WarmupTwo.stringTimes(h, a3);
        //then
        assertAll(
                () -> assertEquals("Hi", s1),
                () -> assertEquals("HiHi", s2),
                () -> assertEquals("HiHiHi", s3)
        );

    }
}
