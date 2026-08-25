public class Main
{
   public static int sod(int i)
   {
       int s=0;
       while(i>0)
       {
           s=s+(i%10);
           i=i/10;
       }
       return s;
       
   }
   
   public static boolean prime(int i)
   {
       for(int j=2;j<i;j++)
       {
           if (i%j==0)
           return false;
       }
       return true;
   }
    
    public static void main(String args[])
    {
        for(int i=100;i<999;i++)
        { int s=sod(i);
            if(prime(i) && prime(s))
            System.out.print(i+" ");
        }
    }
    
}