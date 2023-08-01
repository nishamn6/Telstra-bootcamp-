import java.io.IOException;

class InvalidAgeException extends RuntimeException
{
    String msg;

    public InvalidAgeException(String msg)
    {
        super();
        this.msg=msg;
    }
    public String getMsg()
    {
        return msg;
    }
}
class Customer
{
    public void checkEligibility(int age)
    {
         if(age>=18)
        System.out.println("you are eligible to vote");
    
    else
       throw new InvalidAgeException("age is less ,minimum should be 18");
    }
}
public class UserDefinedException 
{
    public static void main(String[] args) throws IOException
{
     
    Customer customer = new Customer();

    try
{
    customer.checkEligibility(27);
    }
    catch (InvalidAgeException e)
    {
        System.out.println(e.getMsg());
    }
    
}
}
-----------------------------------------------------------------------------------------------------------------------------------------

import java.io.IOException;

class InvalidAgeException extends RuntimeException
{
    String msg;

    public InvalidAgeException(String msg)
    {
        super();
        this.msg=msg;
    }
    public String getMsg()
    {
        return msg;
    }
}
class Customer2
{
    public void checkEligibility(int age) throws
    {
         if(age>=18)
        System.out.println("you are eligible to vote");
    
    else
       throw new InvalidAgeException("age is not a valid");
    }
}
public class UserDefinedCheckedException
 {
        public static void main(String[] args) throws IOException
{
     
    Customer2 customer = new Customer2();
    try
{
    customer.checkEligibility(27);
    }
    catch (InvalidAgeException e)
    {
        System.out.println(e.getMsg());
    }
    
}
    
}
-------------------------------------------------------------------------------------------------------------------------

import java.io.IOException;

class User
{
    //throwing unchecked exception(throwing at runtime)

    public void checkEligibility(int age)
    {
        if(age>=18)
        System.out.println("you are eligible to vote");
    
    else
       throw new ArithmeticException("you are not eligible for vote");
}
    //throwing unchecked exception(throwing at compiletime)

       public void checkEligibility2(int age) throws IOException
       {
          if(age>=18)
        System.out.println("you are eligible to vote");
    
    else
       throw new IOException("you are not eligible for vote");
       }
}
public class ThrowDemo
{
    public static void main(String[] args) throws IOException
{
     
    User user = new User();
    try
{
    user.checkEligibility(67);
    user.checkEligibility2(34);
    }
    catch (Exception e)
    {
        System.out.println("some thing went wrong");
    }
}
} 

-------------------------------------------------------------------------------------------------------------------------------
public class Demo1
 {
    public static void main(String[] args)
{
        int sum=0;
        for (int i=1;i<=5;i++)
        {
            sum=sum+1;
        }
        System.out.println("sum="+sum);
    }
    
}
------------------------------------------------------------------------------------------------------------------------------------

import java.util.ArrayList;

public class ArrayListDemo
 {
    public static void main(String[] args)
    {
        ArrayList obj = new ArrayList();
        System.out.println("size of arraylist before adding : " + obj.size());

        obj.add(1);
        obj.add("hello");
        obj.add(12.45);
        obj.add("hi");

         System.out.println("size of arraylist after adding : " + obj.size());
         
          System.out.println("element of the list" + obj);

            obj.set(2,"java");
           System.out.println("element of the list" + obj);

            obj.remove(2);
           System.out.println("after remove" + obj);

           System.out.println("element contains :" + obj.contains("hello"));

            obj.clear();;
           System.out.println("after clear : " + obj);

    }
    
}
---------------------------------------------------------------------------------------------------------------------------------------

