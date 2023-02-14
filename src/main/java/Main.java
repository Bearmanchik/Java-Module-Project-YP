// dev branch for Y.Practicum
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = 0;
        String name;
        double cost;
        double finalCost;

        while (countPeople < 2) {
            System.out.println("На скольких людей разделить счет?");
            countPeople = scanner.nextInt();
            if (countPeople < 2){
                System.out.println("Ошибка! Введено некорректное количество людей");// ваш код начнется здесь
            }
        }

        System.out.println("Укажите имя товара");
        name = scanner.next();
        System.out.println("Укажите цену товара");
        cost = scanner.nextDouble();
        Calculator product = new Calculator(name, cost);
        System.out.println("Товар успешно добавлен!");
        while (true){
            System.out.println("Хотите ли вы добавить ещё один товар?");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("завершить")){
                break;
            }else {
                System.out.println("Укажите имя товара");
                name = scanner.next();
                product.fullProductName((name));
                System.out.println("Укажите цену товара");
                cost = scanner.nextDouble();
                product.fullProductCost(cost);
                System.out.println("Товар успешно добавлен!");
            }

        }
        System.out.println("Добавленные товары:\n" + product.name);
        String format ="Цена на человека %.2f ";
        finalCost = product.cost/countPeople;
        System.out.print(String.format(format, finalCost));
        Formatter formatCost = new Formatter();
        formatCost.format(finalCost);

        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости

    }
}

