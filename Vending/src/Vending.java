import java.util.Scanner;
public class Vending {
    public static void main(String[] args) {
        int twixPrice = 75;
        int marsPrice = 80;
        int snickersPrice = 95;
        int bonAquaPrice = 45;

        boolean isCanBuy = false; //флаг - можно ли купить? по умолчанию нет

        System.out.println("Введите деньги в вендинговый автомат: ");
        int moneyAmount = new Scanner(System.in).nextInt();

        if (moneyAmount >= twixPrice){ // связанные условия с помощью else if
            System.out.println("Вы можете купить батончик Твикс!");
            isCanBuy = true;
            if (moneyAmount % 3 == 0){// если делится число на 3, то выводим выполнимое условие следующей строкой
                System.out.println("Вы выиграли счастливый билет на 100 р. Обратитесь к администратору.");
            }
        }
        if (moneyAmount >= marsPrice){
            System.out.println("Вы можете купить батончик Марса!");
            isCanBuy = true;
        }
        if (moneyAmount >= snickersPrice){
            System.out.println("Вы можете купить батончик Сникерса!");
            isCanBuy = true;
        }
        if (moneyAmount >= bonAquaPrice){
            System.out.println("Вы можете купить бутылочку БонАква!");
            isCanBuy = true;
        }
        if (isCanBuy == false) {
            System.out.println("У вас недостаточно денег!");
        }
    }
}
