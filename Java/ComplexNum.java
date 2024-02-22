import java.util.Scanner;
public class ComplexNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,i1,i2;
        System.out.println("Enter the real part of first complex number : ");
        a=sc.nextInt();
        System.out.println("Enter the imaginary part of first complex number : ");
        i1=sc.nextInt();
        System.out.println("Enter the real part of second complex number : ");
        b=sc.nextInt();
        System.out.println("Enter the imaginary part of second complex number : ");
        i2=sc.nextInt();

        int p=a+b;
        int q=i1+i2;
        

        System.out.println("Sum : "+p+" + i"+q);
        sc.close();

    }
}
