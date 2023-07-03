import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {

    private final String sex;
    private final boolean expectedSex;


    public LionParametrizedTest(String sex, boolean expectedSex) {
        this.sex = sex;
        this.expectedSex = expectedSex;
    }

    @Parameterized.Parameters(name = "Пол животного.Тестовые данные: {0} {1}")
    public static Object[][] getSumData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesLionHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, null);

        boolean actual = lion.doesHaveMane();

        assertEquals("Пол льва не соответсвует заданным параметрам", expectedSex, actual);

    }
}
