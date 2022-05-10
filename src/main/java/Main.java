public class Main {


    public static void main(String[] args) {
        BonusService service = new BonusService();
        long actual1 = service.calculate(100000, true);
        long expected1 = 30;
        System.out.println("ОР: " + expected1 + ", ФР: " + actual1);

        long actual2 = service.calculate(10000, true);
        long expected2 = 3;
        System.out.println("ОР: " + expected2 + ", ФР: " + actual2);
    }
}