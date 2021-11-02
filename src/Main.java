public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditAmount1 = 1_000_000;
        // Сумма кредита в рублях
        int creditPeriod1 = 1;
        // Срок кредита в годах
        double percentYear1 = 9.99;
        // Фиксированная ставка 9,99%
        int monthlyPayment = service.calculate(creditAmount1, creditPeriod1);
        System.out.println("Сумма кредита: " + creditAmount1 + " руб.");
        System.out.println("Срок кредита: " + creditPeriod1 + " год");
        System.out.println("Процентная ставка: " + percentYear1 + "%");
        System.out.println("Ежемесячный платеж: " + monthlyPayment + " руб.");


        int creditAmount2 = 1_000_000;
        // Сумма кредита в рублях
        int creditPeriod2 = 2;
        // Срок кредита в годах
        double percentYear2 = 9.99;
        // Фиксированная ставка 9,99%
        int monthlyPayment2 = service.calculate(creditAmount2, creditPeriod2);
        System.out.println("Сумма кредита: " + creditAmount2 + " руб.");
        System.out.println("Срок кредита: " + creditPeriod2 + " года");
        System.out.println("Процентная ставка: " + percentYear2 + "%");
        System.out.println("Ежемесячный платеж: " + monthlyPayment2 + " руб.");


        int creditAmount3 = 1_000_000;
        // Сумма кредита в рублях
        int creditPeriod3 = 3;
        // Срок кредита в годах
        double percentYear3 = 9.99;
        // Фиксированная ставка 9,99%
        int monthlyPayment3 = service.calculate(creditAmount3, creditPeriod3);
        System.out.println("Сумма кредита: " + creditAmount3 + " руб.");
        System.out.println("Срок кредита: " + creditPeriod3 + " года");
        System.out.println("Процентная ставка: " + percentYear3 + "%");
        System.out.println("Ежемесячный платеж: " + monthlyPayment3 + " руб.");
    }
}