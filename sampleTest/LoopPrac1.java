import java.util.ArrayList;
import java.util.Arrays;

public class LoopPrac1 {
    public static void main(String[] args) {
        String[] cities = {"Phoenix", "Moscow", "New York", "Chicago", "Nashville"};
        ArrayList<String> citiesArrList = new ArrayList<>();


        // for (String each : cities) {
        //     citiesArrList.add(each);
        // }
        // System.out.println(citiesArrList);


        // for (int i = 0; i < cities.length; i++) {
        //     citiesArrList.add(cities[i]);
        // }
        // System.out.println(citiesArrList);


        int j = 0;
        while (j < cities.length) {
            citiesArrList.add(cities[j]);
            j++;
        }
        System.out.println(citiesArrList);

    }
}