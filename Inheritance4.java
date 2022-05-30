import java.lang.*;
 
/* class object
   {
     //contents
   } */

 class Base				//class Base extends Object
{
    public int i;
    public int j;

    public void fun()
    {
      System.out.println("Inside Base fun");
    }
 
}

  class Derived extends Base			//class Derived : public Base
{
    public int x;
    public int y;

   public void gun()
   {
    System.out.println("Inside Derived gun");
   }
}

   class Derivedx extends Derived
{
      public int a;
     
     public void sun()
     {
       System.out.println("Inisde Derived sun");
     }
}
   class Inheritance4
{
         public static void main(String point[])
      {
         System.out.println("Inside static main");
         Derivedx dobj = new Derivedx();
  
         dobj.sun();
      }
}





