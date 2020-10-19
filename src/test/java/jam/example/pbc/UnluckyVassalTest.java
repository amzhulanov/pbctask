package jam.example.pbc;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;

class UnluckyVassalTest {

    @Test
    void prepareDataForKingTest() {
        UnluckyVassal unluckyVassal=new UnluckyVassal();
        assertThat(unluckyVassal.prepareDataForKing(Arrays.asList("служанка Аня","управляющий Семен Семеныч, крестьянин Федя, доярка Нюра")).isEmpty()).isFalse();
    }
}