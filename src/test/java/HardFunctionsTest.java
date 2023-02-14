import org.junit.jupiter.api.Test;



public class HardFunctionsTest {


    private int[] myArr = {6,1,8,4,5,2,7,3,9,22,34,11,10,99,14,20,21,34,55,17};
    private int[] myArr2 = {1,4,5,2,3};

    HardFunctions hardFunctionsTest = new HardFunctions(myArr);

    @Test
    public void setCornerOfTheTImerTest(){
        System.out.println();
        double solution = hardFunctionsTest.setCornerOfTheTimer(12,16);

        System.out.println(solution);
        System.out.println();
    }

    @Test
    public void SortProcedureTest(){

        System.out.println("Basic");
        long start = System.nanoTime();
        int[] solutionTest = hardFunctionsTest.basicSort(myArr, myArr.length);
        long time = System.nanoTime() - start;

        System.out.println(time);


        int[] solutionTest2 = hardFunctionsTest.basicSort(myArr2, myArr2.length);

        for (int x: solutionTest2){
            System.out.print(x + ", ");
        }
        System.out.println();

        for(int x: solutionTest){
            System.out.print(x + ", ");

        }
        System.out.println();
    }

    @Test
    public void quickSortTest(){
        long start = System.nanoTime();
        int[] solution = hardFunctionsTest.quickSort(myArr);
        long time = System.nanoTime() - start;

        System.out.println(time);

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
