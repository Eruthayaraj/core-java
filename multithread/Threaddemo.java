package multithread;

public class Threaddemo {

    public static void main(String[] args) throws InterruptedException {
        Runnable obj1=() ->{
                        for(int i=0;i<10;i++){
                            System.out.println("hii");
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    

        };
        Runnable obj2=() ->{
            for(int i=0;i<10;i++){
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        

};
           
            
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        Thread.sleep(5);
        t2.start();

            }
    
    }

// class A implements Runnable{
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("hii");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// class B implements Runnable{
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }