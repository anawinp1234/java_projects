import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        ListIterator<String> iterator = list.listIterator();
        iterator.next();  
        iterator.remove(); 
        iterator.next(); 
        iterator.next(); 
        iterator.remove();
        
        System.out.println(list);
    }
}