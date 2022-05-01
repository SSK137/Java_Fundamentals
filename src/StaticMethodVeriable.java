public class StaticMethodVeriable {
    //Declare Static veriables
    static int a = 3;
    static int b;
    // declare method as static
    static void Method(int x) {
        System.out.println("x ="+x);
        System.out.println("a = "+a);
        System.out.println("b = "+b);


    }
    public static void main(String[] args){
        Method(42);
    }
}
