
public class AppWagrFavPlyrs {
    public static void main(String[] args) {
        String[] favoritePlayers = {"Connor Willi", "Mahant", "Luke Potter", "Pongsap"};
        WagrFileIO obj = new WagrFileIO("WagrRanking8:7.csv");
        obj.favPlayersMeth(favoritePlayers);
    }
}

