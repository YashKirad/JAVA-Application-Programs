
  
  class mythread1
{
    public static void main(String Arg[])
    {
        System.out.println("Inside Main");

        Thread tobj = Thread.currentThread();

        System.out.println("Name of current thread is : "+tobj.getName());
    }
}