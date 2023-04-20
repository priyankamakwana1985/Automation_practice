package AssignmentModule3;

//Write a Java Program to create one thread by implementing Runnable interface in Class.

class t1 implements Runnable{
    @Override
    public void run()
    
    {
    System.out.println("Thread is running");
    }
}

public class Program17
{
 public static void main(String[] args) 
 
 {
      t1 obj1 = new t1(); 
      Thread t = new Thread(obj1); 
      t.start();
 }
 
}
