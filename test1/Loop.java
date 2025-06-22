class Foo { 
    public int m = 10; 
    public Foo(int m) { 
        this.m = m; 
    } 
public static void main(String[] args) {

    Foo u = new Foo(8), v = new Foo(6);
    u = v;
    v.m = 3;
    System.out.println(u.m);
}
}