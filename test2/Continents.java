public class Continents {
    // This program will print out a Continent or somthing i dont really know
    public static void main(String[] args) {
        int continent = 5;
        switch (continent) {
        case 1:
            System.out.println ("North America: Mexico City, Mexico");
            break;
        case 2:
            System.out.println("South America: Sao Paulo, Brazil");
            break;
        case 3:
            System.out.println("Europe: Moscow, Russia");
            break;
        case 4:
            System.out.println("Africa: Lagos, Nigeria");
            break;
        case 5:
            System.out.println("Asia: Shanghai, China");
            break;
        case 6:
            System.out.println("Australia: Sydney, Australia");
            break;
        case 7:
            System.out.println("Antarctica: McMurdo Station, US");
            break;
        default:
            System.out.println("Undefined continent!");
        }
    }
}