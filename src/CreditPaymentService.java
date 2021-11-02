public class CreditPaymentService {
    public int calculate (int creditAmount, int creditPeriod) {
        double percentYear = 9.99;
        // Фиксированная ставка 9,99%
        // Формула для расчета аннуитетного ежемесячного платежа по кредиту:
        // Платеж = (Сумма кредита * (Процентная ставка / (12 * 100%)) /
        // (1 - (1 + (Процентная ставка / (12 * 100%))^срок кредитования в годах * 12 * (-1)
        double percentMonth = (double) percentYear / 100 / 12;
        // Процентная ставка / (12 * 100%)
        // Рассчитываем процентную ставку за месяц
        double a = (double) creditAmount * percentMonth;
        // Сумма кредита * Процентная ставка за месяц
        int power = (int) creditPeriod * (-12);
        // Срок кредитования в годах * 12 * (-1)
        // Рассчитываем степень
        double c = (double) 1 + percentMonth;
        // 1 + Процентная ставка за месяц
        double d = (double) Math.pow(c, power);
        // (1 + Процентная ставка за месяц)^срок кредитования в годах * 12 * (-1)
        double e = (double) 1 - d;
        // 1 - ((1 + Процентная ставка за месяц)^срок кредитования в годах * 12 * (-1))
        int monthlyPayment = (int) (a / e);
        // (Сумма кредита * Процентная ставка за месяц) /
        // (1 - ((1 + Процентная ставка за месяц)^срок кредитования в годах * 12 * (-1)))
        return monthlyPayment;
        }
}
