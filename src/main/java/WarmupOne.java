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

    public static int diff21(int n) {
        return n <= 21 ? 21 - n : (n - 21) * 2;
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking == true && (hour < 7 || hour > 20);
    }

    public static boolean makes10(int a1, int b1) {

        return a1 == 10 || b1 == 10 || (a1 + b1) == 10;
    }

    public static boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (((a < 0 && b > 0) || (a > 0 && b < 0)) && negative == false) {
            return true;
        } else if ((a < 0 && b < 0) && negative == true) {
            return true;
        } else
            return false;

//        if (negative) {
//            return (a < 0 && b < 0);
//        }
//        else {
//            return ((a < 0 && b > 0) || (a > 0 && b < 0));
//        }
    }

    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 2).equals("not")) {
            return str;
        }
        return "not " + str;
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {

        if (isWeekend == true && cigars >= 40) {
            return true;
        }

        return cigars >= 40 && cigars <= 60;
    }

    public static String missingChar(String str, int n) {
        StringBuilder strB = new StringBuilder(str);
        return strB.deleteCharAt(n).toString();
    }

    public static String frontBack(String str) {
        if (str.length() > 1) {
            char front = str.charAt(0);
            char back = str.charAt(str.length() - 1);
            String middel = str.substring(1, str.length() - 1);
            return back + middel + front;
        } else
            return str;
    }

    public static String front3(String str) {
        if (str.length() >= 3) {
            String cut = str.substring(0, 3);
            return cut + cut + cut;
        } else
            return str + str + str;
    }

    public static String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

    public static boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }


    public static String front22(String str) {
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }
        String front = str.substring(0, take);
        return front + str + front;

    }

    public static boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        } else
            return (str.substring(0, 2)).equals("hi");
    }

    public boolean icyHot(int temp1, int temp2) {
        if (temp1 < 0 && temp2 > 100) {
            return true;
        } else if (temp1 > 100 && temp2 < 0) {
            return true;
        } else
            return false;
    }

    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    public boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));
    }

    public static boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    public String delDel(String str) {
        if (str.length() >= 4 && (str.substring(1, 4)).equals("del")) {
            return str.charAt(0) + str.substring(4, str.length());
        } else
            return str;
    }

    public boolean mixStart(String str) {
        return str.length() > 2 && (str.substring(1, 3).equals("ix"));
    }

    public String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }

    public int intMax(int a, int b, int c) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        if (max > c) {
            return max;
        } else {
            return c;
        }
    }

    public int close10(int a, int b) {
        int aDiff = Math.abs(10 - a);
        int bDiff = Math.abs(10 - b);
        if (a == b || aDiff == bDiff) {
            return 0;
        }
        if (aDiff < bDiff) {
            return a;
        } else {
            return b;
        }
    }

    public boolean in3050(int a, int b) {

        if (a >= 30 && b >= 30 && a <= 40 && b <= 40) {
            return true;
        }
        if (a >= 40 && b >= 40 && a <= 50 && b <= 50) {
            return true;
        }
        return false;
    }

    public int max1020(int a, int b) {
        // First make it so the bigger value is in a
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        if (count >= 1 && count <= 3) {
            return true;
        }
        return false;
    }

    public boolean lastDigit(int a, int b) {
        if ((a % 10) == (b % 10)) {
            return true;
        }
        return false;
    }

    public String endUp(String str) {
        if (str.length() > 3) {
            String front = str.substring(0, str.length() - 3);
            String back = str.substring(str.length() - 3, str.length());
            return front + back.toUpperCase();
        }
        return str.toUpperCase();
    }

    public String everyNth(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i += n) {
            result = result + str.charAt(i);
        }
        return result;
    }


}