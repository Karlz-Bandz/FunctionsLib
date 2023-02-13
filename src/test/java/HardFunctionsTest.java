import org.junit.jupiter.api.Test;

public class HardFunctionsTest {


    private int[] myArr = {1,3,5,10,4};

    HardFunctions hardFunctionsTest = new HardFunctions(myArr);

    @Test
    public void setCornerOfTheTImerTest(){
        double solution = hardFunctionsTest.setCornerOfTheTimer(12,16);

        System.out.println(solution);
    }

    @Test
    public void quickSortTest(){
        int[] solution = hardFunctionsTest.quickSort(myArr, 1, 1);

        for(int x: solution){
            System.out.print(x + ", ");
        }
    }

    @Test
    public void firstNonRepetedCharacterTest(){
        Character solutionTest = hardFunctionsTest.firstNonRepetedCharacter("hello");
        Character solutionTest2 = hardFunctionsTest.firstNonRepetedCharacter("helo word!");

        Character expected = 'h';
        Character expected2 = null;

        assert solutionTest.equals(expected);
        assert solutionTest2 == expected2;
    }
}
