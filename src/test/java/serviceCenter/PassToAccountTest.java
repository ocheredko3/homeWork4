package serviceCenter;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PassToAccountTest {
    int j = 1;

    @Test
    public void testPassToAccountWrong() {
        PassToAccount passToAccount = new PassToAccount();
        Assert.assertEquals("Невірний пароль.Спробуйте ще раз.", passToAccount.passToAccount(2, j));
    }

    @Test

    public void testPassToAccountCorrect() {
        PassToAccount passToAccount = new PassToAccount();
        Assert.assertEquals("Привіт!!!", passToAccount.passToAccount(1, j));
    }

    @Test

    public void testPassToAccountWasBlocked() {
        PassToAccount passToAccount = new PassToAccount();
        for (int i = 2; i <= 8; i++) {

            if (i == 6) {
                Assert.assertEquals("U input wrong password 5 time. Сontact your administrator", passToAccount.passToAccount(i, j));
            } else Assert.assertEquals("Невірний пароль.Спробуйте ще раз.", passToAccount.passToAccount(i, j));
        }
    }
}