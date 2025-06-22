import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        int[] numsArr = {1, 1, 1, 1, 2, 0, 1, 1, 1, 1, 1, 7, 0, 0, 0, 0, 0, 0, 4, 14, 0, -2, -1, 0, 0, 0, 0, 8, -1, 1, -2, -2, -1, -1, 0, 3, 0, 0, 2, 0, 1, 1, 1, 1, 1, 11, 6, 0, -2, -1, 0, -2, 8, 1, -1, 4, -1, -6, 3, -1, 3, 1, 2, 4, 1, 3, 0, 5, 5, 5, 5, 6, 6, 17, -4, -4, 3, 4, -9, -3, 0, 2, 2, 3, 7, -3, 1, -2, 23, 0, 3, 3, 0, -5, 1, 3, 1, 2, 5, 2, 5, 6, 6, 1, 6, -5, 3, -11, -6};

        String ageS = Integer.toString(34);
        System.out.println(ageS);
        System.out.println(Integer.toString(34));
        

        ArrayList<String> nums = new ArrayList<>();
        for (int eachElem : numsArr) {
            String eachElemS = Integer.toString(eachElem);
            nums.add(eachElemS);
        }
        System.out.println(nums);




        ArrayList<Integer> numsInt = new ArrayList<>();
        numsInt.add(1);
        numsInt.add(9);
        numsInt.add(4);
        numsInt.add(5);
        numsInt.add(54);
        numsInt.add(62);
        numsInt.add(3);
        numsInt.add(10);
        System.out.println(numsInt);

        ArrayList<Integer> indexTracker = new ArrayList<>();


        //find the 1st biggest
        int returnedMaxInt = Collections.max(numsInt);
        int indexBig = numsInt.indexOf(returnedMaxInt);
        // System.out.println(indexBig);
        // System.out.println(numsInt.get(indexBig));
        indexTracker.add(indexBig);

        //find the second biggest
        //have to set the biggest to zero then use max again
        numsInt.set(indexBig, 0);
        System.out.println(numsInt);
        int secondMax = Collections.max(numsInt);
        int secondMaxIndex = numsInt.indexOf(secondMax);
        // System.out.println(secondMaxIndex);
        // System.out.println(numsInt.get(secondMaxIndex));
        indexTracker.add(secondMaxIndex);



        System.out.println(indexTracker);
        //now i can use this tracker to loop thru the name of players

        



    }
}


