import java.util.InputMismatchException;
import java.util.Scanner;

public class Check {
    String checkText = "Добавленные товары:";
    private double totalCost;


    PriceFormatter priceFormatter = new PriceFormatter();


    public void addDish(Scanner scanner){
        double currentDishCost;
        while (true) {
            System.out.println("Введите название блюда");
            checkText = checkText + "\n" + scanner.next();
            System.out.println("Введите стоимость блюда");

            while (true){
                    try{
                        currentDishCost = scanner.nextDouble();
                        if(currentDishCost > 0){
                            break;
                        }
                        else {
                            System.out.println("Некорректная стоимость, введите стоимость заново!");
                        }
                    } catch (InputMismatchException e){
                        System.out.println("Некорректное значение стоимости, введите числовое значение в формате \"рубли.копейки\" !");
                        scanner.next();
                    }
                }

            totalCost += currentDishCost;
            checkText = checkText + String.format(": %.2f ", currentDishCost) + priceFormatter.format(currentDishCost);
            System.out.println("Товар успешно добавлен!");
            System.out.println("Введите \"Завершить\" чтобы завершить добавление блюд.\nВведите любое другое значение, чтобы продолжить введение блюд.");
            if(scanner.next().equalsIgnoreCase("завершить")){
                break;
            }
        }
    }
    public void calculateIndividualPrice(int numberOfPeople){
        System.out.println(String.format("Сумма на одного человека: %.2f ", totalCost / numberOfPeople) + priceFormatter.format(totalCost / numberOfPeople));
    }

    public void printCheck(){
        System.out.println(checkText);
    }

}
