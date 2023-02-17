import functions.BasicFunctions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BasicFunctionsTest {

    int[] myArr = {9,3,4,5,7};
    BasicFunctions basicTest = new BasicFunctions(myArr);


    @Test
    public void findTheSecondLargestTest(){
        int secondLargest = basicTest.findTheSeondLargest();
        assert secondLargest == 7;
    }

    @Test
    public void changeStringForIntArrayTest(){
        String testWord = "23Karel4k3";

        int[] expectedArray = {2,3,4,3};
        int[] testArraySolution = basicTest.changeStringForIntArray(testWord);

        for(int x: testArraySolution){
            System.out.println(x);
        }

        assert Arrays.equals(expectedArray, testArraySolution);
    }
}
