import java.util.Scanner;

class product1 {
    int pcode;
    String pname;
    Double price;
    
    public void readdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter pcode : ");
        this.pcode=sc.nextInt();
        System.out.println("Enter pname : ");
        this.pname=sc.next();
        System.out.println("Enter price : ");
        this.price=sc.nextDouble();

       sc.close();
    }
}
public class Product
{
    public static void main(String[] args) {
        product1 p1=new product1();
        product1 p2=new product1();
        product1 p3=new product1();
        
        p1.readdata();
        p2.readdata();
        p3.readdata();


        if(p1.price>p2.price && p1.price>p3.price)
            System.out.println("product 1 price is greater");
        
        else if(p2.price>p1.price && p2.price>p3.price)
            System.out.println("product 2 price is greater");
        
        else
            System.out.println("product 3 price is greater");
        
        
    }
    

}
