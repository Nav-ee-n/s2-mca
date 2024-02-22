class program1{
    public static void main(String[] args){
    int n=10;
    int num1=0,num2=1,num3;
    System.out.println("Fibonacci Series");
    for(int i=0;i<n;i++)
    {
    System.out.println(num1);
    num3=num2+num1;
    num1=num2;
    num2=num3;
    }
    }
}
    
    