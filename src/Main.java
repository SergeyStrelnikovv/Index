public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double theWeight = 95;
        double growth = 1.75 * 1.75;
        double out = service.calculate(theWeight, growth);
        System.out.println("Ваш ИМТ " + out);
    }
}