public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int result = service.calculate(201);
        System.out.println( "Вам начислено " + result + " бонусных миль.");

    }
}
