import java.lang.*;

  final class Base
{
   public void fun()
   {
     System.out.println("Base fun");
    }    
}

/*   class Derived extends Base	not allowed
{

}	*/

 class Final3
{
     public static void main(String arg[])
     {
         Base bobj;
         bobj = new Base();
         bobj.fun();
      }
}