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
    public int[] quickSort(int[] arr, int START, int n) {

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                int first = arr[arr.length - 1];
                int second = arr[i];
                arr[i] = first;
                arr[arr.length - 1] = second;
            }
        }



        return arr;
    }

    @Override
    public double setCornerOfTheTimer(double hour, double minutes) {

        double minutesDegrees = 6 * minutes;
        double hourDegrees = 30 * hour + (minutes * 30.0 / 60);

        double solution = Math.abs(hourDegrees - minutesDegrees);

        return solution;
    }

    @Override
    public void polymorphismMethod() {
        System.out.println("I'm a Hard class");
    }
}
