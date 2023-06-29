import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void getFelineFamilyTest() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals("Семейство должно быть Кошачьи", expected, actual);
    }

    @Test
    public void getFelineKittensWithoutParamsTest() {
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals("Количество котят должно быть = 1", expected, actual);
    }

    @Test
    public void getFelineMeatTest() throws Exception {
        List<String> actualFood = feline.eatMeat();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, actualFood);

    }
}
