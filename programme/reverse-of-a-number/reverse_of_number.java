import java.util.Scanner;

public class reverse_of_number {
    public static void main(String[] args) {
        int a,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        a = sc.nextInt();
        System.out.print("Output: ");
        while(a>0){
            n = a%10;
            System.out.print(n);
            a/=10;
        }
        sc.close();
    }
}
