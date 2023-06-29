import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    Cat cat = new Cat(feline);

    @Test
    public void getCatSoundTest() {
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals("Кошка должна говорить Мяу", expected, actual);
    }

    @Test
    public void getCatFoodTest(){

    }


}
