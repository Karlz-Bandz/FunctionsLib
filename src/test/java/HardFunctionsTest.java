import org.junit.jupiter.api.Test;

import java.util.Random;


public class HardFunctionsTest {

    int size = 50000;

    private int[] myArr = {6,1,8,4,5,2,7,3,9,22,34,11,10,99,14,20,21,34,55,17};
    private int[] myArr2 = {1,4,5,2,3};

    Random rand = new Random();



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



        int[] longTestArr = new int[size];

        for(int i = 0; i < size; i++){
            longTestArr[i] = rand.nextInt(101);
        }

        System.out.println("Basic");
        long start = System.currentTimeMillis();
        int[] solutionTest = hardFunctionsTest.basicSort(longTestArr);
        long time = System.currentTimeMillis() - start;
        System.out.println(time);

        System.out.println();

//        for(int x: solutionTest){
//            System.out.print(x + ", ");
//        }
//        System.out.println();
    }

    @Test
    public void quickSortTest(){


        int[] longTestArr = new int[size];

        for(int i = 0; i < size; i++){
            longTestArr[i] = rand.nextInt(101);
        }

        System.out.println("Quick");
        long start = System.currentTimeMillis();
        int[] solution = hardFunctionsTest.quickSort(longTestArr);
        long time = System.currentTimeMillis() - start;

        System.out.println(time);

//        for(int x: solution){
//            System.out.print(x + ", ");
//        }
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
