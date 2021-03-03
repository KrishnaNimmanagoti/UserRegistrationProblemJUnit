import com.bridgelabz.exceptionHandling.MoodAnalyser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    MoodAnalyser mood;

    @Test
    public void testSadMood(){

        mood = new MoodAnalyser("I am in sad mood");

        System.out.println(mood.analyseMood());

    }

    @Test
    public void testHappyMood(){

        mood = new MoodAnalyser("I am in happy mood");

        System.out.println(mood.analyseMood());

    }

}
