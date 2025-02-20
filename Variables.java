public class Variables {
    public static void main(String[] args) {
        int a = 3, b = 4;
        int temp;

        temp = a;
        a = b;  
        b = temp;

        System.out.println("a = " + a + "\nb = " + b);
     

    }
}
