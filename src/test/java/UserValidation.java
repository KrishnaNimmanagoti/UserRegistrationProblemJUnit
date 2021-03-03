import com.bridgelabz.uservalidation.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserValidation {

    UserRegistration user;
    boolean result;
    String[] allEmails;

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
        result = user.checkEmail("abc111@abc.com");
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
        result = user.checkPassword("abc@yahoo.com");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    @Test
    public void testPasswordSad() {
        result = user.checkPassword("krishna123A@@SasD");
        System.out.println(result);
        Assertions.assertFalse(result);
    }

    @Test
    public void testAllEmailsHappy() {

         allEmails = new String[]{"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
                                    "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com",
                                        "abc+100@gmail.com"};

//        "abc@.com.my", "abc@gmail.com.aa.au", ".abc@com.com", "abc+100@gmail.com"

        for (String emailIDs: allEmails) {

            result = user.checkEmail(emailIDs);
            System.out.println(result);
            Assertions.assertTrue(result);

        }
    }

    @Test
    public void testAllInValidEmails() {

        allEmails = new String[]{"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
                                    ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com",
                                    "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

        for (String emailIDs: allEmails) {

            result = user.checkEmail(emailIDs);
            System.out.println(result);
            Assertions.assertFalse(result);

        }
    }

}
