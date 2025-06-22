import javax.print.DocFlavor.STRING;

/**
 * Start
 */
public class Start {

    public static void main(String[] args) {
        String str1 = "doodooo";
        System.out.println("--------------------------");
        
        Golfer g = new Golfer();
        g.name = "Tiger";
        g.swing();        
        
        System.out.println("--------------------------");
        // Golfer g2 = new Golfer();
        // g2.name = "Rory";
        // g2.swing();
        Golfer g2 = new Golfer(name = "Rory");
        

        System.out.println("--------------------------");
        System.out.println("i'm in Main class");
        System.out.println(str1);
    }
}

