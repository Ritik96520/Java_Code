public class Final_class {
    public final void display() {
        System.out.println("Execute final method.");
    }
    void run() {
        System.out.println("rest of method");
    }
}

class example extends Final_class {
     void run() {
        System.out.println("Execute the rest method.");
    }

    public static void main(String[] args) {
        example f = new example();
        f.display();
        f.run();
    }
}

