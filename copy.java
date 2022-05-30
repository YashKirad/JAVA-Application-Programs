import java.lang.*;

class Employee  implements Cloneable
{
    public int EID;
    public String Ename;
    public int Esalary;

   public Employee(int id , String str, int no)
   {
      this.EID = id;
      this.Ename = str;
      this.Esalary = no;
   }
 
    public Object  clone() throws CloneNotSupportedException
   {
        return super.clone();
   }
}


class copy
{
    public static void main(String A[])throws Exception
   {
       Employee eobj = new Employee(51,"Yash",21000); 												
      System.out.println("EID :"+eobj.EID+"Name : "+eobj.Ename+"Salary :"+eobj.Esalary);  

      Employee eobjx = (Employee)eobj.clone();
     System.out.println("EID :"+eobjx.EID+"Name : "+eobjx.Ename+ "Salary :"+eobjx.Esalary);  

       eobj.Ename = "Kirad";
      System.out.println("EID :"+eobjx.EID+"Name : "+eobjx.Ename+"Salary :"+eobjx.Esalary);
    }
}









