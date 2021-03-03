import com.bridgelabz.uservalidation.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserValidation {

    UserRegistration user;

    @BeforeEach
    public void setup(){

        user = new UserRegistration();

    }
    @Test
    public void testFirstName(){

        boolean isValid;

        isValid = user.checkFirstName("Krishna");

        System.out.println(isValid);

        Assertions.assertTrue(isValid);

    }

    @Test
    public void testLastName(){

        boolean isValid;

        isValid = user.checkLastName("Krishna");

        System.out.println(isValid);

        Assertions.assertTrue(isValid);

    }

    @Test
    public void testEmail(){

        boolean isValid;

        isValid = user.checkEmail("Krishna@gmail.com");

        System.out.println(isValid);

        Assertions.assertTrue(isValid);

    }

    @Test
    public void testMobileNum(){

        boolean isValid;

        isValid = user.checkMobileNum("7569918165");

        System.out.println(isValid);

        Assertions.assertTrue(isValid);

    }

    @Test
    public void testPassword(){

        boolean isValid;

        isValid = user.checkPassword("krishnahfy");

        System.out.println(isValid);

        Assertions.assertTrue(isValid);

    }

}
