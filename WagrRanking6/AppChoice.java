
import java.util.Scanner;

public class AppChoice {
    public static void main(String[] args) {
       WagrFileIO objIO = new WagrFileIO("WagrRanking8:7.csv"); 
        Scanner input = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        Scanner namesArr = new Scanner(System.in);
        Scanner topMove = new Scanner(System.in);
        Scanner topRank = new Scanner(System.in);
        Scanner moveChoice = new Scanner(System.in);
        boolean inputCondition = true;
        while (inputCondition) {
        
        System.out.println("1. Find one particular player: \n2. List of favorite players: \n3. Top Ten: \n4. Biggest Moves: \n5. Quit");
        System.out.print("Choose a number or quit: ");
        switch (input.nextLine()) {
            case "1":
            System.out.print("\033[H\033[2J");  // clear the console
            System.out.print("Enter name of player: ");
            objIO.findOnePlyer2(name.nextLine());
            System.out.println();
                break;
                
                case "2":
                System.out.print("\033[H\033[2J");  // clear the console
                String[] favoritePlayers = {"Connor Williams", 
                                            "Mahanth", 
                                            "Luke Potter", 
                                            "Pongsapak", 
                                            "Prieto", 
                                            "Kiko",
                                            "Mjaaseth",
                                            "Johnny Walker"};
                System.out.println("Favorite Players: ");
                objIO.favPlayersMeth(favoritePlayers);
                System.out.println();
                break;
                
                case "3":
                System.out.print("\033[H\033[2J");  // clear the console
                objIO.topTen(true);
                System.out.println();
                break;
                
                case "4":
                System.out.print("\033[H\033[2J");  // clear the console
                System.out.print("Please enter the top Moves: ");
                int tm = topMove.nextInt();
                System.out.print("Please enter number of top players: ");
                int tr = topRank.nextInt();
                System.out.print("1. Abs \n2. Up \n3. Down \nChoose an option: ");
                int move = moveChoice.nextInt();
                String moveMode = "";
                if (move == 1) {
                    moveMode = "moveAbs";
                } else if (move == 2) {
                    moveMode = "moveUp";
                } else if (move == 3) {
                    moveMode = "moveDown";
                }
                objIO.biggestMovesTopPlyrs(tm, tr, moveMode);
                System.out.println();
                break;

                case "5":
                System.out.println("Bye...");
                inputCondition = false;
                break;

                default:
                System.out.print("\033[H\033[2J");  // clear the console
                System.out.println("Please choose again");
                break;
            }
        }
        input.close();
        name.close();
        namesArr.close();
        topMove.close();
        topRank.close();
    }
}