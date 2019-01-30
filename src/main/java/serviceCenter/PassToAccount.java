package serviceCenter;

public class PassToAccount {

    int count;

    public String passToAccount(int password, int login) {
        String mas;

        for (; ; ) {
            count++;

            if (password != login) {
                mas = "Невірний пароль.Спробуйте ще раз.";
                if (password != login & count == 5) {
                    mas = "U input wrong password 5 time. Сontact your administrator";
                    break;
                }
                break;
            } else if (password == login) {
                mas = "Привіт!!!";
                break;
            }
        }
        return mas;

    }

}
