import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTestParametrized {

    Feline feline = new Feline();
    private final int actualKittensCount;
    private final int expectedKittensCount;

    public FelineTestParametrized(int actualKittensCount, int expectedKittensCount) {
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
    public void getFelineKittensWithParamsTest() {
        int expectedCount = expectedKittensCount;

        int actualCount = feline.getKittens(actualKittensCount);

        assertEquals("Количество котят должно быть " + expectedKittensCount, expectedCount, actualCount);
    }
}
