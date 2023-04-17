package naresh.pkg;

public class Progression {
    protected  long current;
//Constructs a progression starting at zero
    public Progression() {
        current=0;
    }
//Constructs a progression with given start value
    public Progression(long start) {
        this.current = start;
    }


    //Returns the next value of the progression

    public long nextValue(){
        long answer = current;
        advance();
        return answer;
    }
//Advances the current value to the next value of the progression
    protected void advance(){
        current++;
    }

    //Prints the next n values of the progression, separated by spaces
    public void printProgression(int n){
        System.out.print(nextValue()+" ");
        for(int i=1;i<n;i++){
            System.out.print(nextValue()+" ");
        }
        System.out.println();
    }

}
