import org.junit.jupiter.api.Test;


public class MediumFunctionsTest {

    int[] myArr = {3,2,4,5,6,7,13};
    MediumFunctions testMedium = new MediumFunctions(myArr);

    @Test
    public void TestMultiSquare(){
        testMedium.multipleSquare(3);
    }

    @Test
    public void TestFindLargestPalindrome(){
        String actual = testMedium.findLargestPalindrome("karolo2");
        String expected = "olo";
        assert expected.equals(actual);
        System.out.println(actual);
    }

    @Test
    public void TestSumAllEvenNumbers(){
        int testSum = testMedium.sumAllEvenNumbers(myArr);
        int expected = 12;
        assert expected == testSum;
        System.out.println(testSum);
    }
}
