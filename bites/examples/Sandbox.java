package bites.examples;

// remember to import
import java.util.ArrayList;
import java.util.Arrays;

public class Sandbox {
    public static void main(String[] args) {

//        ARRAYLIST

        ArrayList<Integer> reallyGreatNumbers = new ArrayList<>();
        reallyGreatNumbers.add(3);
        reallyGreatNumbers.add(5);
        reallyGreatNumbers.add(7);
        reallyGreatNumbers.add(11);
        System.out.println(reallyGreatNumbers);
        reallyGreatNumbers.set(0, 11);

        System.out.println(reallyGreatNumbers);
        System.out.println(reallyGreatNumbers.get(0));

        reallyGreatNumbers.remove(0);
        System.out.println(reallyGreatNumbers.get(0));
        System.out.println(reallyGreatNumbers);



//        Array  (fixed length)
        String[] names = new String[3];
        names[0] = "mark";
        names[1] = "pedro";
        names[2] = "nicole";
        System.out.println(names[0]);
//        to print the entire array convert the object to string remember to import
        System.out.println(Arrays.toString(names));
//        Define the fixed length by what you add here so once you create this instance it will always have that length
//        no more no less if there are not enough names they will be replaced by null
//        this list below has a length of 5
        String[] populatedNames = {"Mark", "Jose", "Pedro", "Pipa", null};
        System.out.println(populatedNames[1]);
        System.out.println(Arrays.toString(populatedNames));
//        to remove an item
        populatedNames[1] = null;
        System.out.println(populatedNames[1]);
        System.out.println(Arrays.toString(populatedNames));
    }
}
