import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Arrays {
    public static void main(String[] args) {
        ArrayList<Integer>friendAge = new ArrayList<Integer>();
        friendAge.add(0, 12);
        friendAge.add(1, 23);
        friendAge.add(2, 15);
        friendAge.add(3, 34);

        friendAge.set(3, 46);

        System.out.println("The number of items in this array is " + friendAge.size() + ".");
        System.out.println(friendAge.indexOf(15));
    }


    public static Collection<? extends String> asList(String string, String string2, String string3, String string4,
            String string5, String string6, String string7, String string8, String string9) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asList'");
    }
}
