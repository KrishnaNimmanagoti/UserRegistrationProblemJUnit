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

}
