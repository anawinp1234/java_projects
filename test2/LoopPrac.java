import java.util.ArrayList;
import java.util.Arrays;

public class LoopPrac {
    public static void main(String[] args) {
        String[] cities = {"Phoenix", "Moscow", "New York", "Chicago", "Nashville"};
        ArrayList<String> citiesArrList = new ArrayList<>();


        for (String each : cities) {
            citiesArrList.add(each);
        }
        System.out.println(citiesArrList);
    }
}