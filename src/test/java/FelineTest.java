import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest {

    Feline feline = new Feline();
    private final int actualKittensCount;
    private final int expectedKittensCount;

    public FelineTest(int actualKittensCount, int expectedKittensCount) {
        this.actualKittensCount = actualKittensCount;
        this.expectedKittensCount = expectedKittensCount;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getKittensCount() {
        return new Object[][]{
                {1, 1},
                {4, 4},
                {2, 2},
        };
    }

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
    public void getFelineKittensWithParamsTest() {
        int actualCount = feline.getKittens(actualKittensCount);
        int expectedCount = expectedKittensCount;
        assertEquals(expectedCount, expectedCount);
    }

    @Test
    public void getFelineMeatTest (){

    }
}
