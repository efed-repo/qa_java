import com.example.Lion;
import static org.junit.Assert.assertEquals;

public class LionTest {

    //@Test
    public void UnSuccessSexLionTest() throws Exception {
        Lion lion = new Lion("Львенок");
        String expected = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals("Пол льва не соответсвует заданным параметрам", expected, lion.doesHaveMane());

    }

}
