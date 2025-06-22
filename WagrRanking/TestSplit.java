import java.util.ArrayList;

public class TestSplit {
    public static void main(String[] args) {
        String s1 = "qwertyuiopqwe,rtyuiopqwertysnkfh,kahs,ikfhsahfkhsakfii,k";
        String[] letters = s1.split(",");
        
        System.out.println(letters[2]);



        ArrayList<String> letters2 = new ArrayList<>();
        for (String x : letters) {
            letters2.add(x);
        }
        System.out.println(letters2);
    }
}
