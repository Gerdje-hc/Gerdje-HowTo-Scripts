public class TaxCalculator {
    public static void main(String[] args) {
        double grossMonthlyIncome = 2500;
        double grossYearlyIncome = grossMonthlyIncome * 12;

        double rsz = grossYearlyIncome * 0.1307;
        double taxableIncome = grossYearlyIncome - rsz;
        System.out.println("Bruto jaarsalaris: " + grossYearlyIncome);
        System.out.println("RSZ: " + rsz);
        System.out.println("Bruto belastbaar: " + taxableIncome);

        double totalTax = 0;
        totalTax += taxForBracket(taxableIncome, 0, 8_680, 0.25);
        totalTax += taxForBracket(taxableIncome, 8_680, 12_360, 0.30);
        totalTax += taxForBracket(taxableIncome, 12_360, 20_600, 0.40);
        totalTax += taxForBracket(taxableIncome, 20_600, 37_750, 0.45);
        totalTax += taxForBracket(taxableIncome, 37_750, Long.MAX_VALUE, 0.50);

        System.out.println("Bedrijfsvoorheffing: " + totalTax);
        System.out.println("Netto: " + (taxableIncome - totalTax));
    }

    static double taxForBracket(double income, double lower, double upper, double percentage) {
        double lim = Math.min(income, upper);
        double amount = Math.max(0, lim - lower);
        return amount * percentage;
    }
}
