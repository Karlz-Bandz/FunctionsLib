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
    public void polymorphismMethod() {
        System.out.println("I'm a Hard class");
    }
}
