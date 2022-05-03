public class Main {


    public static void main(String[] args) {
        BonusService service = new BonusService();
        long actual1 = service.calculate(100000, true);
        long expected1 = 30;
        System.out.println("ОР: " + expected1 + ", ФР: " + actual1);

        long actual2 = service.calculate(10000, true);
        long expected2 = 3;
        System.out.println("ОР: " + expected2 + ", ФР: " + actual2);

        long actual3 = service.calculate(1, true);
        long expected3 = 3;
        System.out.println("ОР: " + expected3 + ", ФР: " + actual3);

        long actual4 = service.calculate(0, true);
        long expected4 = 3;
        System.out.println("ОР: " + expected4 + ", ФР: " + actual4);

        long actual5 = service.calculate(10000, false);
        long expected5 = 3;
        System.out.println("ОР: " + expected5 + ", ФР: " + actual5);

        long actual6 = service.calculate(100000, false);
        long expected6 = 3;
        System.out.println("ОР: " + expected6 + ", ФР: " + actual6);

        long actual7 = service.calculate(0, false);
        long expected7 = 3;
        System.out.println("ОР: " + expected7 + ", ФР: " + actual7);

    }
}