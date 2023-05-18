// // If class A needs to inherit Thread and a class as well, it cannot do because multiple inheritance is not supported in java.
// // Now, we know that Thread implements interface "Runnable" so, class A can implement "Runnable" instead of extending Thread by doing this
// // class A can extend other class if required and can implement more than one interface(supporting mutiple inheritance).

// class A implements Runnable
// {
//     public void run()
//     {
//         for(int i=0; i<10; i++)
//         {
//             System.out.println("Hi");
//         }
//     }
// }

// class B implements Runnable
// {
//     public void run()
//     {
//         for(int i=0; i<10; i++)
//         {
//             System.out.println("Hello");
//         }
//     }
// }

// public class RunnableVsThread
// {
//     public static void main(String a[])
//     {
//         // A obj1 = new A();
//         // B obj2 = new B();
        
// /*
//         "start" method is defined in "Threads" not "Runnable" so below code will not work directly.
//         obj1.start();
//         obj2.start();
// */

// //      We need to create Thread to use start method.
// //      Thread have multiple constructor, one of them is parameterized constructor which can take runnable object as it's parameter.
// //      We can write:
// //      A obj1 = new A();       as      Runnable obj1 = new A();
// //      B obj2 = new B();       as      Runnable obj2 = new B();

//         Runnable obj1 = new A();
//         Runnable obj2 = new B();

//         Thread t1 = new Thread(obj1);
//         Thread t2 = new Thread(obj2);

//         t1.start();
//         t2.start();
//     }    
// }


// Since Runnable is implemented as Functional Interface and we know that Lambda Expression can be used for Functional Interface.

public class RunnableVsThread
{
    public static void main(String a[])
    {
        Runnable obj1 = () ->
        {
            for(int i=0; i<10; i++)
            {
                System.out.println("Hi");
            }
        };
        Runnable obj2 = () ->
        {
            for(int i=0; i<10; i++)
            {
                System.out.println("Hello");
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }    
}