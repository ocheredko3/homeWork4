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
                    mas = "Ви вірно пароль 5 разів. Зверніться до адміністратора.";
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
