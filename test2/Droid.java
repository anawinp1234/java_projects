public class Droid {
    int batteryLevel;
    String name;
    
    public Droid(String droidName, int batteryLevel) {
        name = droidName;
        // droidName = "codey";
        batteryLevel = 100;
    }
    public String toString(String droidName){
        return "Hello, I am the droid that you created. My name is " + droidName + "!";
    }
    public void preformTask(String task){
        System.out.println(name + " is preforming task; " + task);
        batteryLevel = batteryLevel - 10;
    }
    public int energyReport(int batteryLevel){
      return batteryLevel - 36;
    }
    public static void main(String[] args) {
        Droid codeyDroid = new Droid("Codey", 100);
        System.out.println(codeyDroid.toString(codeyDroid.name));
        codeyDroid.preformTask("cleaning");
        System.out.println("Remaining battery level is: " + codeyDroid.energyReport(100));
    }
}