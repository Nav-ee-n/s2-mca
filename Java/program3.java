class program3{
    public static void main(String[] args){
        int num=999,rem=0,rev=0;
        int num1=num;
        while(num>0){
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        if(num1==rev){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}