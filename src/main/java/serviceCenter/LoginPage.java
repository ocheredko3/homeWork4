package serviceCenter;

import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Увійти як: \n 1) Директор;\n 2) Адміністратор; \n 3) Клієнт; \n 4) Інженер;");

        int login;
        int count = 0;
        int pass;
        login = scan.nextInt();

        switch (login) {
            case 1:
                if (login == 1) {
                    System.out.println("U logged in how Boss");
                    break;
                }
            case 2:
                if (login == 2) {
                    System.out.println("u logged in how Admin");
                    break;
                }
            case 3:
                if (login == 3) {
                    System.out.println("U logged in how Customer ");
                    break;
                }
            case 4:
                if (login == 4) {
                    System.out.println("U logged in how Engineer");
                    break;
                }
        }
        System.out.println("Введіть пароль: ");
        do {
            count++;
            pass = scan.nextInt();
            PassToAccount pass1 = new PassToAccount();
            System.out.println(pass1.passToAccount(pass, login));
            if (pass != 1 & count == 5) {
                System.out.println("U input wrong password 5 time. Сontact your administrator");
                break;
            }

        } while (pass != login);
    }
}

