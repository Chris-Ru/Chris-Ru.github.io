package src.week3.nsorts;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;

public class Insertions {
    private static ArrayList<Integer> inputArray = new ArrayList<Integer>();

    public static ArrayList<Integer> getInputArray() {
        return inputArray;
    }

    //Just for the display purpose
    public Insertions(ArrayList<Integer> inputArray){
        Insertions.inputArray = inputArray;
    }

    public static void sortGivenArray(){
        for(int i=1;i<inputArray.size();i++){

            int key = inputArray.get(i);

            for(int j= i-1;j>=0;j--){
                if(key<inputArray.get(j)){
                    // Shifting Each Element to its right as key is less than the existing element at current index
                    inputArray.set(j+1,inputArray.get(j));

                    // Special case scenario when all elements are less than key, so placing key value at 0th Position
                    if(j==0){
                        inputArray.set(0, key);
                    }
                }else{
                    // Putting Key value after element at current index as Key value is no more less than the existing element at current index
                    inputArray.set(j+1,key);
                    break; // You need to break the loop to save un necessary iteration
                }
            }
        }
    }


    public static void sort(ArrayList<Integer> a){
        Insertions is = new Insertions(a);
    }
}