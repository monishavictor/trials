class myThread implements Runnable {
  private Thread t;
  private String threadName;

  myThread(String threadName) {
    this.threadName = threadName;
  }

  public void run() {
    while(true) {
      System.out.print(threadName);
    }
  }

  public void start() {
    if( t == null ) {
      t = new Thread(this, threadName);
      t.start();
    }
  }
}

public class ThreadEx {
  public static void main(String args[]) {
    myThread A = new myThread("A");
    myThread B = new myThread("B");

    B.start();
    A.start();
  }
}