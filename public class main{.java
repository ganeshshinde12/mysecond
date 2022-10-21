 class hello{
   
        static int num1=100;
        static int num2=200;
        static {
            num1 += 1;  //number1= number1+1=101
            num2 += 1;  // 201
        
    }
    public static void main(String [] args){
        num1 += 5;   //307
        num2 += 10;    //512
        System.out.println(num1+num2);
        
    }
    static {
        num1 += 200;   //302
        num2 += 300;   //502
    }
}