import functions.MediumFunctions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


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

    @Test
    public void TestTargetNumbers(){
        int[] arr = testMedium.targetNumbers(myArr, 8);

        for(int x: arr){
            System.out.println(x);
        }

        assert arr[0] == 1;
        assert arr[1] == 4;
    }

    @Test
    public void TestMergeWithNoDuplicates(){
        int[] testArr1 = {0,3,4,23,2};
        int[] testArr2 = {0,4,22,23};

        int[] expectedArr = {0, 2, 3, 4, 22, 23};

        int[] testMethod = testMedium.mergeWithNoDuplicates(testArr1, testArr2);

        assert Arrays.equals(testMethod, expectedArr);
    }
}
