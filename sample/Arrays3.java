public class Arrays3 {
    public static void main(String[] args) {
        String[] countries = {"USA", "France", "Brazil", "China", "Japan"};
        int [] num = {1, 2, 245968, 1, -228293};


        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println(sum);

        // for (String x : countries) {
        //     System.out.println(x);
        // }
        

    }
}
