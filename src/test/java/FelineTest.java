import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void getFelineFamilyTest() {
        String expected = "Кошачьи";

        String actual = feline.getFamily();

        assertEquals("Семейство должно быть Кошачьи", expected, actual);
    }

    @Test
    public void getFelineKittensWithoutParamsTest() {
        int actual = feline.getKittens();

        assertEquals("Количество котят должно быть = 1", 1, actual);
    }

    @Test
    public void getFelineMeatTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        List<String> actualFood = feline.eatMeat();

        assertEquals(expectedFood, actualFood);
    }
}
