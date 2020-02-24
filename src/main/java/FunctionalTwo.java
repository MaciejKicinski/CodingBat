import java.util.List;
import java.util.stream.Collectors;

public class FunctionalTwo {
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }

    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }

    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n >= 13 && n <= 19);
        return nums;
    }

    public List<String> noZ(List<String> strings) {
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }

    public List<String> noLong(List<String> strings) {
        strings.removeIf(n -> n.length() >= 4);
        return strings;
    }

    public List<String> no34(List<String> strings) {
        strings.removeIf(n -> n.length() == 3 || n.length() == 4);
        return strings;
    }

    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .map(n -> n + "y")
                .filter(n -> !n.contains("yy"))
                .collect(Collectors.toList());
    }

    public List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .filter(n -> n % 10 != 2)
                .collect(Collectors.toList());
    }

    public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n + 10)
                .filter(n -> (n % 10 != 5) )
                .filter(n -> (n % 10 != 6) )

                .collect(Collectors.toList());
    }

}
