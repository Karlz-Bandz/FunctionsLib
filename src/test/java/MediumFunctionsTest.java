import org.junit.jupiter.api.Test;


public class MediumFunctionsTest {

    int[] myArr = {3,2,4,5,6,7,13};

    @Test
    public void TestMultiSquare(){
           MediumFunctions testMedium = new MediumFunctions(myArr);
           testMedium.multipleSquare(3);
    }
}
