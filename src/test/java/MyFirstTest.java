import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

// the static import imports all the static methods in the class
// and there is no need to call a static method with class name.
// .* the imports all the static methods within the class
import static org.junit.Assert.*;


public class MyFirstTest {
    ArrayList<Integer> arrayList = new ArrayList<>();
    ArrayList<Integer> arrayList2 = new ArrayList<>();
    @Before
    public void setUpValue() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList2.add(1);
        arrayList2.add(2);
    }
    @Test
    public void testObjectSameness() {
        // this will fail right now
        assertSame(arrayList, arrayList2);
    }
    @Test
    public void additionMethodTest() {
        long input1 = 20;
        long input2 = 30;
        long expected = 50;

        assertEquals(expected, MathOperations.add(input1, input2));
    }
    @Test
    public void tipAppTest() {
        double cost = 22.56;
        double tip = 20;
        double expected = 4.51;

        assertEquals(expected, MathOperations.tip(cost, tip), 0.005);
    }
    @Test
    public void testArrayEquality() {
        int[] startArray = {1, 2, 3, 4, 5};
        int[] endArray = {2, 3, 4, 5, 6};

        assertArrayEquals(endArray, MathOperations.addOneToArray(startArray));
    }

    @Test
    public void checkStringEquality() {
        String expected = "codeup";
        String actual = "codeup";

        assertEquals(expected, actual);
    }

    List<String> languages = new ArrayList<>();
    List<String> moreLanguages = new ArrayList<>();

    @Before
    public void setAList() {
        languages.add("Amharic");
        languages.add("English");
        languages.add("Spanish");
        moreLanguages.add("Russian");
        moreLanguages.add("Portuguese");
        moreLanguages.add("Japanese");
    }
    @Test
    public void isArraysSame() {
        assertNotSame(languages, moreLanguages);
    }

    public static int[] numbers = {1, 2, 3};
    public static int[] otherNumbers = new int[3];
    @Before
    public void isArraysEqual() {
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
    }
    @Test
    public void arrayEquality() {
        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testIfInstanceIsNull() {
        Device phone = new Device();
        Device laptop = null;
        assertNull(null);
        assertNotNull(phone);
    }

    String language;
    @Before
    public void setUp() {
        language = "PHP";
    }
    @Test
    public void testIfLanguageIsContains() {
        // use assertTrue for this statement
        assertTrue(language.contains("H"));
        // use assertFalse for this statement
        assertFalse(language.contains("J"));
    }
}
class Device {}