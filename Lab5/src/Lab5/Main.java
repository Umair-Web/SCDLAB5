package Lab5;

public class Main extends Thread 


//{
//		public void run()
//		{
//		System.out.println("Thread is running...");
//		}
//		public static void main(String args[])
//		{
//		Main t1=new Main();
//		
//		t1.start();
//		}
//		}


//{ public void run(){ for(int i=1;i<5;i++){
//try{Thread.sleep(200);}catch(InterruptedException e){System.out.println(e);}
//System.out.println(i);
//}
//}
//public static void main(String args[]){ Main t1=new Main();
//Main t2=new Main();
//
//
//t1.start();
//t2.start();
//}
//}


{
public void run()
{
for(int i=1; i<5; i++)
{
try
{
// thread to sleep for 500 milliseconds
sleep(500); System.out.println(Thread.currentThread().getName());
}catch(InterruptedException e){System.out.println(e);} System.out.println(i);
}
}
public static void main(String args[])
{
// creating three threads 
Main t1=new Main ();
Main t2=new Main ();
Main t3=new Main ();
// call run() method
t1.start();
t2.start();
t3.start();
// stop t3 thread
t3.stop();
System.out.println("Thread t3 is stopped");
}
}

