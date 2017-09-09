public class HarmonicSum {
    public static void main(String[] args) {
        int n = 20;
        double sum = 0;
        for(int i=1; i < n; i++) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
