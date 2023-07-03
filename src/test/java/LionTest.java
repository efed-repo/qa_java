import com.example.FelineInterface;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    FelineInterface felineInterface;

    @Test (expected = Exception.class)
    public void unSuccessSexLionTest() throws Exception {
        Lion lion = new Lion("Львенок", felineInterface);

    }

    @Test
    public void getLionKittensTest() throws Exception {
        Mockito.when(felineInterface.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", felineInterface);

        int actualKittens = lion.getKittens();

        assertEquals("Количество котят должно быть равно 1", 1, actualKittens);
    }

    @Test
    public void getLionFood() throws Exception {
        Mockito.when(felineInterface.getFood("Хищник"))
                .thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самка", felineInterface);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        List<String> actualFood = lion.getFood();

        assertEquals(expectedFood, actualFood);
    }

}
