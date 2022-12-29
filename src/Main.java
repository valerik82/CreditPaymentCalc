public class Main {
    public static void main(String[] args) {
        MonthlyPaymentService calculate = new MonthlyPaymentService();

        System.out.println();
        System.out.println("1ый вариант");
        System.out.println("Ваш ежемесячный платеж: " + (int)calculate.calculate (9.99,12,1_000_000) + " Руб.");

        System.out.println();
        System.out.println("2ой вариант");
        System.out.println("Ваш ежемесячный платеж: " + (int)calculate.calculate (9.99,24,1_000_000) + " Руб.");


        System.out.println();
        System.out.println("3ий вариант");
        System.out.println("Ваш ежемесячный платеж: " + (int)calculate.calculate (9.99,36,1_000_000) + " Руб.");


    }

}