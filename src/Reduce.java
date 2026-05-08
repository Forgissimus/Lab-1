public class Reduce {
    static void main() {
        int i = 100;
        int steps = 0;
        while (i > 0) {

            if (i % 2 == 0) {
                i = i / 2;

            } else {
               i = i - 1;
            }
            steps = steps + 1;
        }
        System.out.println(steps);
    }
}
