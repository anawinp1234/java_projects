public class TestLoop {
    public static void main(String[] args) {
        String[] listOne = {"83,2,United States,Bailey Shoemaker,20.9433,834.4083", "507,3,Belgium,Diane Baillieux,7.3773,580.7290", "571,-6,United States,Bailey Davis,20.9433,567.6838", "1509,889,Australia,Jorjah Bailey,7.0000,439.8964", "2026,-110,England,Maria Toledo Bailey,17.6037,385.2070", "2972,-12,France,Laure Bailly Cergneux,7.0000,115.7142", "3025,-10,United States,Bailey Henley,7.0000,111.9971"};
        
        // int i = 0;
        // while (i < listOne.length) {
        //     // String[] listTwo = listOne[i].split(",");
        //     // System.out.println(listTwo[3]);
        //     String[] countries = listOne[i].split(",");
        //     System.out.println(countries[2]);
        //     i++;

        // }

        // for (int j = 0; j < listOne.length; j++) {
        //     String[] countries = listOne[j].split(",");
        //     System.out.println(countries[2]);
        // }

        for (String eachElement : listOne) {
            String[] listThree = eachElement.split(",");
        }


    }
}



