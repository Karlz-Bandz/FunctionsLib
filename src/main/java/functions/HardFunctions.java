package functions;

import Interfaces.HardInterface;


public class HardFunctions extends MediumFunctions implements HardInterface {

    public HardFunctions(int[] myArr) {
        super(myArr);
    }


    @Override
    public Character firstNonRepetedCharacter(String word) {

        Character solution = null;

        for(int i = 0; i < word.length() - 1; i++){
            if(word.charAt(i) == word.charAt(i+1)){
                while(i != 0){
                    i--;
                    if(word.charAt(i) == ' '){
                        solution = word.charAt(++i);
                        break;
                    }
                }
                solution = word.charAt(i);
                break;
            }
        }
        return solution;
    }

    @Override
    public int[] quickSort(int[] arr) {

        int n = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                int first = arr[arr.length - 1];
                int second = arr[i];
                arr[i] = first;
                arr[arr.length - 1] = second;
            }
        }

        int pointer = 0;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[arr.length - 1]){
                int y = arr[i];
                int z = arr[pointer];

                arr[i] = z;
                arr[pointer] = y;
                pointer++;
            }
        }

        int pivot = arr[arr.length - 1];
        int changeNumber = arr[pointer];

        arr[pointer] = pivot;
        arr[arr.length - 1] = changeNumber;

        int[] arrSecondSort1 = new int[pointer];
        int[] arrSecondSort2 = new int[arr.length-pointer];

        for(int i = 0; i < arrSecondSort1.length; i++){
            arrSecondSort1[i] = arr[i];
        }



        for(int i = 0; i < arrSecondSort2.length; i++){
            arrSecondSort2[i] = arr[pointer];
            pointer++;

        }

        basicSort(arrSecondSort1);
        basicSort(arrSecondSort2);

        int[] solution = new int[arrSecondSort1.length + arrSecondSort2.length];

        int position = 0;

        for(int x: arrSecondSort1){
            solution[position] = x;
            position++;
        }
        for(int x: arrSecondSort2){
            solution[position] = x;
            position++;
        }


        return solution;
    }


    @Override
    public double setCornerOfTheTimer(double hour, double minutes) {

        double minutesDegrees = 6 * minutes;
        double hourDegrees = 30 * hour + (minutes * 30.0 / 60);

        double solution = Math.abs(hourDegrees - minutesDegrees);

        return solution;
    }

    @Override
    public String polymorphismMethod() {
        return "I'm a Hard class";
    }
}
