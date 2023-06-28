import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {


    private final String sex;

    private final boolean expectedSex;

    public LionTest(String sex, boolean expectedSex) {
        this.sex = sex;
        this.expectedSex = expectedSex;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void SuccessSexLionTest() throws Exception {
        Lion lion = new Lion(sex);
        boolean expected = expectedSex;
        assertEquals("Пол льва не соответсвует заданным параметрам", expected, lion.doesHaveMane());
    }

    @Test
    public void UnSuccessSexLionTest () throws Exception {
        Lion lion = new Lion("Львенок");
        String expected = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals("Пол льва не соответсвует заданным параметрам", expected, lion.doesHaveMane());

    }

}
