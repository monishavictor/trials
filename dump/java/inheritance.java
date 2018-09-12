class A {
  public void print() {
    System.out.println("In A");
  }
}

class B extends A {
  public void print() {
    System.out.println("In B");
  }
}

class C extends A {
  public void print() {
    System.out.println("In C");
  }
}

public class inheritance {

  public static void main(String[] args) {
    B b = new B();
    C c = new C();
    b = c;
    newPrint(b);
  }

  public static void newPrint(A a) {
    a.print();
  }


}
