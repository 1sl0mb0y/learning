import org.example.Generics;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItems;

public class TestGenerics {
    @Test
    public void givenArrayOfIntegers_thanListOfStringReturnedOK() {
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<String> stringList = Generics.fromArrayToList2(intArray, Object::toString);
        assertThat(stringList, hasItems("1", "2", "3", "4", "5"));
    }
}
