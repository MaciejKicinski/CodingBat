import java.util.HashMap;
import java.util.Map;

public class MapTwo {

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], 0);

        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            //map.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length())));
            map.put(s.substring(0, 1), s.substring(s.length() - 1));
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                int count = map.get(s);
                map.put(s, (count + 1));
            }
        }
        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {

            if (!map.containsKey(s.substring(0, 1))) {
                map.put(s.substring(0, 1), s);
            } else {
                String stringFromMap = map.get(s.substring(0, 1));
                map.put(s.substring(0, 1), stringFromMap + s);
            }
        }
        return map;
    }

    public String wordAppend(String[] strings) {
        String result = "";
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            int i = 0;
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                i = map.get(s) + 1;
                map.put(s, i);
                if (i % 2 == 0) {
                    result = result + s;
                }
            }
        }
        return result;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        Map<String, Integer> mapInteger = new HashMap<String, Integer>();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                mapInteger.put(s, 1);
            } else {
                mapInteger.put(s, mapInteger.get(s) + 1);
            }
            if (mapInteger.get(s) >= 2) {
                map.put(s, true);
            } else {
                map.put(s, false);
            }
        }
        return map;
    }

    public Map<String, Boolean> wordMultipleProperVersion(String[] strings) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, true);
            } else {
                map.put(s, false);
            }
        }
        return map;
    }

    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(key)) {
                //swap
                int pos = map.get(key);
                String tmp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = tmp;
            } else
                map.put(key, i);
        }
        return strings;
    }

    public static String[] firstSwap(String[] strings) {
        Map<String, Integer> mapNumberOfStrings = new HashMap<>();
        Map<String, Integer> mapPositionOfStrings = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            int count = 0;
            if (!mapNumberOfStrings.containsKey(key)) {
                mapNumberOfStrings.put(key, 1);
                mapPositionOfStrings.put(key, i);
            } else if (mapNumberOfStrings.containsKey(key)) {
                count = mapNumberOfStrings.get(key);
                if (count < 2) {
                    int pos = mapPositionOfStrings.get(key);
                    String tmp = strings[pos];
                    strings[pos] = strings[i];
                    strings[i] = tmp;
                    count = mapNumberOfStrings.get(key) + 1;
                    mapNumberOfStrings.put(key, count);
                }
            }
        }
        return strings;
    }
    
    public String[] firstSwap2(String[] strings) {
        String[] result=new String[strings.length];
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < strings.length; i++) {
            char c  = strings[i].charAt(0);
            if (map.containsKey(c)&&map.get(c)>=0)
            {
                int p=map.get(c);
                map.put(c,-1);

                result[i]=result[p];
                result[p]=strings[i];
            }
            else
            {
                result[i]=strings[i];
                if (!map.containsKey(c))
                    map.put(c,i);
            }
        }
        return result;
    }

}