public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 50;
        double height = 1.69;
        int index = service.calculate(weight, height); // Передаём значения переменных в метод
        if (index <= 25) {
            System.out.println("Индекс массы вашего тела равен: " + index + " Так держать, показатель в норме");
        } else {
            System.out.println("Ты мой пирожок, к сожалению твой индекс массы тела: " + index);
        }
    }
}