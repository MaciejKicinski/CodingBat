public class WarmupOne {
    public static boolean sleepIn(boolean weekday, boolean vacation) {

        return !weekday || vacation ? true : false;
        //return (!weekday || vacation);
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        //return (aSmile && bSmile) ? true : !aSmile && !bSmile;
        return (aSmile && bSmile) || (!aSmile && !bSmile);
        //return (aSmile == bSmile);
    }

    public static int sumDouble(int a, int b) {

        return a == b ? (a + b) * 2 : a + b;
    }
}
