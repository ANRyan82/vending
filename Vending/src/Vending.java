import java.util.Scanner;
public class Vending {
    public static void main(String[] args) {
        int twixPrice = 75;
        int marsPrice = 80;
        int snickersPrice = 95;
        int bonAquaPrice = 45;

        boolean isCanBuy = false; //���� - ����� �� ������? �� ��������� ���

        System.out.println("������� ������ � ����������� �������: ");
        int moneyAmount = new Scanner(System.in).nextInt();

        if (moneyAmount >= twixPrice){ // ��������� ������� � ������� else if
            System.out.println("�� ������ ������ �������� �����!");
            isCanBuy = true;
            if (moneyAmount % 3 == 0){// ���� ������� ����� �� 3, �� ������� ���������� ������� ��������� �������
                System.out.println("�� �������� ���������� ����� �� 100 �. ���������� � ��������������.");
            }
        }
        if (moneyAmount >= marsPrice){
            System.out.println("�� ������ ������ �������� �����!");
            isCanBuy = true;
        }
        if (moneyAmount >= snickersPrice){
            System.out.println("�� ������ ������ �������� ��������!");
            isCanBuy = true;
        }
        if (moneyAmount >= bonAquaPrice){
            System.out.println("�� ������ ������ ��������� �������!");
            isCanBuy = true;
        }
        if (isCanBuy == false) {
            System.out.println("� ��� ������������ �����!");
        }
    }
}
