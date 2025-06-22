import java.util.ArrayList;

public class TestStringFormat {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = s1.format("%4s", s1);
        System.out.println(s2);


        String s3 = "A   B";
        String s4 = s3.replace(" ", "");
        System.out.println(s4);

        System.out.print("\033[H\033[2J");
        
        ArrayList<String> arrList1 = new ArrayList<>();
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Gordon Sargent            ");
        strList.add("Ian Gilligan              ");
        strList.add("PPIan Gilligan              ");
        strList.add("Ian Gilligan              ");
        strList.add("Ian Gilligan              ");
        strList.add("zzzz              ");
        strList.add("TTGordon Sargent            ");
        strList.add("Gordon Sargent            ");
        strList.add("Gordon SLargent            ");
        
        
        for (String eachElem : strList) {
            // System.out.println(eachElem);

            if (arrList1.contains(eachElem)) {
                continue;
            } else {
                arrList1.add(eachElem);
            }
        }
        System.out.println(arrList1);

    }



}
