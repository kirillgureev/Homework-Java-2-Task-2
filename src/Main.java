public class Main {
    public static void main(String[] args) {
        int accountBalance = 759;
        int depositAmount = 1_400;
        if (depositAmount > 1_000) {
            int i = depositAmount / 100;
            int p = accountBalance + depositAmount + i;
            System.out.println("Вам начисленно " + i + " бонусов" +
                    " и Ваш баланс составляет " + p + " рублей");
        } else {
            int x = 0;
            int y = accountBalance + depositAmount + x;
            System.out.println("Вам начисленно " + x + " бонусов" +
                    " и Ваш баланс составляет " + y + " рублей");
        }
    }
}