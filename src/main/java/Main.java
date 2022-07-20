import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args){
        SQRService calcSqr = new SQRService();
        int ourMin = 200;
        int ourMax = 500;

        int result = calcSqr.calculate(ourMin,ourMax);
        System.out.println(result);
    }
}
