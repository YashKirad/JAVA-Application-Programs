import java.lang.*;
import java.util.*;

 class Marvellous
{
    public int Arr[];

   public Marvellous(int size)
    {
       Arr = new int[size];
    }  

   public void Accept()
   {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number :");

         for(int i = 0; i<this.Arr.length;i++)
         {
            this.Arr[i] = sobj.nextInt();
          }           
    }
}

  class Demo extends Thread
{
   public void run()			
    {
        
    }
}
  class Mythread7
{
    public static void main(String A[]) 
   {
        Marvellous mobj1 = new Marvellous(5);
        Marvellous mobj2 = new Marvellous(8);
    }
}