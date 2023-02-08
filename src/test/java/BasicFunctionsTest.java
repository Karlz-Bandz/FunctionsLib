import org.junit.jupiter.api.Test;

public class BasicFunctionsTest {

    int[] myArr = {9,3,4,5,7};
    BasicFunctions basicTest = new BasicFunctions(myArr);


    @Test
    public void findTheSecondLargestTest(){
        int secondLargest = basicTest.findTheSeondLargest();
        assert secondLargest == 7;
    }
}
