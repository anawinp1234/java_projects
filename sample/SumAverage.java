import java.util.ArrayList;

public class SumAverage {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();

        // numberList.add(1);
        // numberList.add(2);
        // numberList.add(3);
        // numberList.add(4);

        for (int i = 1; i < 5; i++) {
            numberList.add(i);
        }


        System.out.println(numberList);
        System.out.println(numberList.size());
        System.out.println();
        int sum = 0;

        for (int i = 0; i < numberList.size(); i++ ) {

            System.out.println("i is now " + i);

            System.out.println("pre sum is " + sum);
            
            // sum = sum + numberList.get(i);
            sum += numberList.get(i);
        
            System.out.println("post sum is " + sum);
            System.out.println();
        
        }

        System.out.println("total sum: " + sum);
       
    }
    
}    

// sum = sum + numberList.get(1);
// sum = sum + numberList.get(2);
// sum = sum + numberList.get(3);

// for (int i = 1; i <= 1; i++) {
//     sum = sum + numberList.get(0);
//     sum = sum + numberList.get(1);
//     sum = sum + numberList.get(2);
//     sum = sum + numberList.get(3);

// }
// for (int sum = 0; sum == ((numberList) numberList).sum(); sum++) {
    
