import java.util.Scanner;

public class BerburuRumah2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double annualSalary = scanner.nextDouble();
        double portionSaved = scanner.nextDouble();
        double totalCost = scanner.nextDouble();

        final double portionDownpayment = 0.25;
        double currentSavings = 0;
        double monthlySalary = annualSalary / 12;
        double r = 0.04;
        int numberOfMonths = 0;
        while (currentSavings < portionDownpayment * totalCost) {
            currentSavings += currentSavings * (r/12);//baris 16 dan 17 ditukar dan membagi r dengan 12 karena setahun 12 bulan
            currentSavings += portionSaved * monthlySalary;

            
            numberOfMonths++;
        }
        System.out.println(numberOfMonths);
    }
}