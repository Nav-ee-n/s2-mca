class program4{
    public static void main(String[] args){
        int num=4,fact=1;
        System.out.println("Factorial");
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}