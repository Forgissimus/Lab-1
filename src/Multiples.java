public class Multiples {
    static void main() {
        int numMultiples = 0;
        int i = 1;
        while (i < 1000) {
            if (i % 5 == 0) {
                numMultiples = numMultiples + 1;
            } else if (i % 3 == 0) {
                numMultiples = numMultiples + 1;
            }
            i = i + 1;
        }
        System.out.println(numMultiples);
    }
}
