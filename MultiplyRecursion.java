import java.util.Scanner;
public class MultiplyRecursion {
    static int multiply(int a, int b) {
        if (b==0)
            return 0;
        if (b>0)
            return a + multiply(a,b-1);
        return -multiply(a,-b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Product= "+ multiply(a, b));
        sc.close();
    }
}