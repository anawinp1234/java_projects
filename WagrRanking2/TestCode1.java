public class TestCode1 {
    public static void main(String[] args) {
        // String fullLine = "1,0,United States,Gordon Sargent,27.1886,1236.6690";
        // String fullLine =  "2,0,United States,Luke Clanton,31.0377,1229.3679";
        String fullLine =  "4,2,China,Wenyi Ding,22.6981,1192.9845";
    
        String[] field = fullLine.split(",");

        System.out.println(field[1]);
    }
}


