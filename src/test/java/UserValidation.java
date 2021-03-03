import com.bridgelabz.uservalidation.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserValidation {

    UserRegistration user;
    boolean result;

    @BeforeEach
    public void setup(){

        user = new UserRegistration();

    }
    @Test
    public void testFirstNameHappy(){
        result = user.checkFirstName("Krishna");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    @Test
    public void testFirstNameSad(){
        result = user.checkFirstName("Kr");
        System.out.println(result);
        Assertions.assertFalse(result);
    }

    @Test
    public void testLastNameHappy(){
        result = user.checkLastName("Krishna");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    @Test
    public void testLastNameSad(){
        result = user.checkLastName("Kr");
        System.out.println(result);
        Assertions.assertFalse(result);
    }

    @Test
    public void testEmailHappy(){
        result = user.checkEmail("Krishna@gmail.com");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    @Test
    public void testEmailSad(){
        result = user.checkEmail("Krishnagmail.com");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
  
    @Test
    public void testMobileNumHappy() {
        result = user.checkMobileNum("7569918165");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    @Test
    public void testMobileNumSad() {
        result = user.checkMobileNum("007569918165");
        System.out.println(result);
        Assertions.assertFalse(result);
    }

    @Test
    public void testPasswordHappy() {
        result = user.checkPassword("krishna123AS@asD");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    @Test
    public void testPasswordSad() {
        result = user.checkPassword("krishna123A@@SasD");
        System.out.println(result);
        Assertions.assertFalse(result);
    }

}
