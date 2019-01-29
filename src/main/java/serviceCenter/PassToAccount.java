package serviceCenter;

public class PassToAccount {

    int count;
    public String passToAccount(int password,int login) {
        String mas;

        for (; ; ) {
            count++;

            if (password != login) {
                mas = "Wrong password.Try again";
                if (password != login & count == 5) {
                    mas = "U input wrong password 5 time. Сontact your administrator";
                    break;
                }
                break;
            } else if (password == login) {
                mas = "Hello!!! Lets work";
                break;
            }
        }
        return mas;

    }

}
