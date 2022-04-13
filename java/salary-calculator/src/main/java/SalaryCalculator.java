public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        double mul = (daysSkipped > 5) ? 0.85 : 1;
        return mul;
    }

    public int multiplierPerProductsSold(int productsSold) {
        int mul = (productsSold > 20) ? 13 : 10;
        return mul;
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000 * multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold);
        double cap = salary > 2000.00 ? 2000.00 : salary;
        return cap;
    } 
}
