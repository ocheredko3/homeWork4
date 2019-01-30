package serviceCenter;

import employees.*;

import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Увійти як: \n 1) Директор;\n 2) Адміністратор; \n 3) Клієнт; \n 4) Інженер;");

        int login;
        int count = 0;
        int pass;
        login = scan.nextInt();
        System.out.println("Введіть пароль: ");

        pass = getPass(scan, login, count);


        if (login == 1 & pass == 1) {
            bossRealization(scan);

        } else if (login == 2 & pass == 2) {
            adminRealization(scan);
        } else if (login == 3 & pass == 3) {
            customerRealization(scan);

        } else if (login == 4 & pass == 4) {
            engineerRealization(scan);
        }
    }

    private static int getPass(Scanner scan, int login, int count) {
        int pass;
        do {
            count++;
            pass = scan.nextInt();
            PassToAccount pass1 = new PassToAccount();
            System.out.println(pass1.passToAccount(pass, login));

            if (pass != 1 & count == 5) {
                System.out.println("Ви вірно пароль 5 разів. Зверніться до адміністратора.");
                break;
            }

        } while (pass != login);
        return pass;
    }

    private static void engineerRealization(Scanner scan) {
        System.out.println("Ви увійшли в систему, як Інженер. Виберіть подальші дії : " +
                "\n 1)Переглянути всі пристрої \n 2)Переглянути зарплату \n 3)Ремонтувати пристрій \n 4)Перемістити пристрій на інший склад");
        int engineerJob = scan.nextInt();
        EngineerOfServiceCenter engineer = new EngineerOfServiceCenter("Kiev","Інженер","2010/12/10","",
                9000,"Петров Сергій","+380999999899","Kiev,Solomyanska 7");
        if(engineerJob==1)engineer.viewAllDevice();
        else if(engineerJob==2)engineer.getSalary();
        else if(engineerJob==3)engineer.work();
        else if(engineerJob==4)engineer.changeDevicePosition();
    }

    private static void customerRealization(Scanner scan) {
        CustomerOfServiceCenter customer = new CustomerOfServiceCenter("Лікарня","клієнт","","",
                5000,"Степаненко Ігор","+380676767765","Київ,Богомольця 3");
        System.out.println("Ви увійшли в систему, як" +customer.getInitials()+"\n."+customer.getPosition()+" Виберіть подальші дії : " +
                "\n 1)Віддати на  ремонт\n 2)Забрати з ремонту \n 3)Заплатити за ремонт");
        int customerJob = scan.nextInt();
        if (customerJob==1)customer.giveDevice();
        else if (customerJob==2)customer.takeDevice();
        else if (customerJob==3)customer.payForRepairedDevice();
    }

    private static void adminRealization(Scanner scan) {
        Employee admin = new AdminOfServiceCenter("Kiev","Адміністратор","2010/12/10",
                "",8000,"Ivanov Stepan","+380505050555","Kiev, Pobedy 76");
        System.out.println("Ви увійшли в систему, як "+admin.getInitials()+ ".\n"+admin.getPosition() +" Виберіть подальші дії : " +
                "\n 1)Переглянути всіх клієнтів \n 2)Прийняти пристрій в ремонт \n 3)Віддати відремонтований пристрій \n 4)Перемістити пристрій на інший склад ");
        int adminJob = scan.nextInt();
        if (adminJob==1) ((AdminOfServiceCenter) admin).viewAllDevice();
        else if (adminJob==2)((AdminOfServiceCenter) admin).takeDevice();
        else if (adminJob==3)((AdminOfServiceCenter) admin).takeDevice();
        else if (adminJob==4)((AdminOfServiceCenter) admin).changeDevicePosition();
    }

    private static void bossRealization(Scanner scan) {
        BossOfServicesCenter boss = new BossOfServicesCenter("Київ", "Директор", "2010/12/1", "",
                10000, "Sidorov Ivan", "+380939393939", "Kiev,Pobedy 76");
        System.out.println("Ви увійшли в систему, як " + boss.getInitials() + ".\n" + boss.getPosition() + "  Виберіть подальші дії :" +
                " \n 1)Бугалтерія \n 2)Відділ кадрів \n 3)Адміністрування");
        int bossJob = scan.nextInt();
        if (bossJob == 1) {
            System.out.println("Бугалтерія:\n 1)Переглянути надходження \n 2)Заплатити податки \n 3)Заплатити зарплатню \n 4)Збільшити зарплату на 10%");
            int accountant = scan.nextInt();
            if (accountant == 1) boss.viewAllIncome();
            else if (accountant == 2) boss.payTax();
            else if (accountant == 3) boss.paySalary();
            else if (accountant == 4) boss.increaseSalary();
        } else if (bossJob == 2) {
            System.out.println("Відділ кадрів: \n 1)Найняти співробітника \n 2)Звільнити співробітника \n 3)Переглянути всіх співробітників");
            int hr = scan.nextInt();
            if (hr == 1) boss.hireAnEmployee();
            else if (hr == 2) boss.fireAnEmployee();
            else if (hr == 3) boss.viewAllEmployee();
        } else if (bossJob == 3) {
            System.out.println("Адміністрування офісу: 1)Орендувати офіс \n 2)Встановити ІД СЦ " +
                    "\n 3)Встановити контакти СЦ \n 4)Встановити адресу СЦ \n 5)Встановити робочий графік СЦ");
            int adminSC = scan.nextInt();
            if (adminSC == 1) boss.officeRent();
            else if (adminSC == 2) boss.setIdServiceCenter();
            else if (adminSC == 3) boss.setContactOfServiceCenter();
            else if (adminSC == 4) boss.setAddressOfServiceCenter();
            else if (adminSC == 5) boss.setWorkTimeOfServiceCenter();
        }
    }

}


