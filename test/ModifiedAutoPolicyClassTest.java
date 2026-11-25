
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ModifiedAutoPolicyClassTest {
ModifiedAutoPolicyClass modifiedAutoPolicyClass = new ModifiedAutoPolicyClass(343,"und", "NY");

    @Test
    public void testThatStateCanBeSet(){
        modifiedAutoPolicyClass.setState("NY");


        assertEquals("NY",modifiedAutoPolicyClass.getState());

    }
}
