
public class AppBigMoves {
    public static void main(String[] args) {
        WagrFileIO obj = new WagrFileIO("WagrRanking8:7.csv");
        obj.biggestMovesTopPlyrs(20, 200);
    }
}
