public class largestN {
    public static void main(String[] args) 
    {
        int a = 12;
        int b = 45;
        int c = 33;

        int largest;

        if (a >= b && a >= c) 
        {
            largest = a;
        } 
        else if (b >= a && b >= c)
         {
            largest = b;
        }
         else 
         {
            largest = c;
        }

        System.out.println("The largest number is: " + largest);
    }
}
