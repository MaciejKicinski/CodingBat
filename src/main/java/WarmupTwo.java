public class WarmupTwo {


    public static String stringTimes(String str, int n) {
        StringBuilder s = new StringBuilder();
        for (int i= 0;i<=n-1;i++){
            s.append(str);
        }
        return s.toString();
    }
}
