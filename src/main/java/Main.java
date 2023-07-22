import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberOfPeople;
        Check check = new Check();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        while (true){
            System.out.println("Введите количество людей, на которых необходимо разделить счет!");
            try{
                numberOfPeople = scanner.nextInt();
                if(numberOfPeople > 1){
                    break;
                }
                else{
                    System.out.println("Некорректное число людей, введите значение больше 1!");
                }
            } catch (InputMismatchException e){
                System.out.println("Некорректное число людей, введите ЦЕЛОЕ число больше 1!");
                scanner.next();
            }
        }
        check.addDish(scanner);
        check.printCheck();
        check.calculateIndividualPrice(numberOfPeople);
    }
}