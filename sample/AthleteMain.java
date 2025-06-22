public class AthleteMain{
    public static void main(String[] args){
        Athlete leBonBon = new Athlete();
        leBonBon.setBrand("Nike Inc.");
        leBonBon.setName("Lebron James");

        Athlete mehsi = new Athlete();
        mehsi.setBrand("Adidas Inc.");
        mehsi.setName("Messi");

        System.out.println(mehsi.printName() + "'s" + " brand sponsor is " + mehsi.printBrand());
        System.out.println(leBonBon.printName() + "'s" + " brand sponsor is " + leBonBon.printBrand());


    }

}