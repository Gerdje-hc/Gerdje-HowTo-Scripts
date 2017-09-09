public class RandomNumberGenerator {
    public static void main(String[] args) {
        int min = 10;
        int max = 25;

        /*
         Let's do this 10 times in a row, it's easier to check
         our results.
         */
        for(int i=0; i<10; i++) {
            int r = random(min, max);
            System.out.println(r);
        }
    }

    /**
     * Generates a random number between min and max inclusive.
     * @param min The minimum bound.
     * @param max The maximum bound.
     * @return A random integer in the specified range.
     */
    public static int random(int min, int max) {
        return (int)(min + Math.random() * (1 + max - min));
    }
}