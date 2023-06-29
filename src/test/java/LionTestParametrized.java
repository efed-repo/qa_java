import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTestParametrized {

    private final String sex;
    private final boolean expectedSex;


    public LionTestParametrized(String sex, boolean expectedSex) {
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
    public void doesLionHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, null);
        boolean expected = expectedSex;

        boolean actual = lion.doesHaveMane();

        assertEquals("Пол льва не соответсвует заданным параметрам",expected, actual);

    }
}
