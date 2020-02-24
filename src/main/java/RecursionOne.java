public class RecursionOne {

    public int factorial(int n) {
        if (n - 1 == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public int bunnyEars(int bunnies) {
        if (bunnies==0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }


}
