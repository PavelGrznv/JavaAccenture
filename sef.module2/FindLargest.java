public class FindLargest{
    public static void main1(String[] args) { 
        int a= 10;
        int b= 20;
        int c= 30;
        int largest = a;
        if (b>largest){
            largest = b;
        }
        if (c>largest){
            largest = c;
        }
        System.out.println("The largest number is: " + largest);
    }
   /* public static void main2(String[] args) { 
        int a= 50;
        int b= 40;
        if (a>b){
            System.out.println("The largest number is: " + a);
        } else {
            System.out.println("The largest number is: " + b);
        }
       
    }*/
}