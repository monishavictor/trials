class Thread2 implements Runnable{  
  public void run(){  
    for(int i=1;i<5;i++){  
      try{
        Thread.sleep(500);
      } catch(InterruptedException e){
        System.out.println(e);
      }  
      System.out.println(i);  
    }  
  } 
  public static void main(String args[]){  
    Thread2 m1=new Thread2();
    Thread2 m2 = new Thread2();
    Thread2 m3 = new Thread2();
    Thread t1 =new Thread(m1);  
    Thread t2 =new Thread(m2);  
    Thread t3 =new Thread(m3);  
    // t1.start();
    // t2.start();

    // m1.run();
    // m2.run();

    t1.start();  
    try {  
      t1.join();  
    } catch(Exception e) {
      System.out.println(e);
    }

    t2.start();  
    t3.start();  
  }  
}  