import java.util.Scanner;

class ComplexNumber1{
    double real,imaginary;

    public ComplexNumber1(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public ComplexNumber1 add(ComplexNumber1 other){
        double newReal=this.real+other.real;
        double newImaginary=this.imaginary+other.imaginary;
        return new ComplexNumber1(newReal, newImaginary);
    }
    public String toString(){
        return real+" + "+ imaginary+"i";
    }
}
public class ComplexNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the real part of first complex number : ");
        double real1=sc.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number : ");
        double imaginary1=sc.nextDouble();

        System.out.print("Enter the real part of the second imaginary number : ");
        double real2=sc.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number : ");
        double imaginary2=sc.nextDouble();

        ComplexNumber1 num1=new ComplexNumber1(real1, imaginary1);
        ComplexNumber1 num2=new ComplexNumber1(real2, imaginary2);

        ComplexNumber1 sum=num1.add(num2);
        System.out.println("Sum : "+ sum);
        sc.close();

        
    }
}