
class SonuA extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<4)
        {
            System.out.println("I am read a book (Thread A) i = " + i);
            System.out.println("I so happy");
            i++;
        }
    }
}
class raviB extends Thread{
    @Override
    public void run(){
        int k =0;
        while(k<4){
            System.out.println("I am playing video game(Thread B) k = "  + k);
            System.out.println("I am sad!");
            k++;
        }
    }
}class vikashC extends Thread{
    @Override
    public void run(){
        int j =0;
        while(j<4){
            System.out.println("I am running in the fild(Thread C) j = " + j);
            System.out.println("I am so confuse");
            j++;
        }
    }
}
public class multi_threading {
    public static void main(String[] args) {
       /* SonuA t1 = new SonuA();
        raviB t2 = new raviB();//Use two method another create a obj then call
        vikashC t3 = new vikashC();
        t1.start();
        t2.start();
        t3.start();*/
       new SonuA().start(); // and second  method is direct call start method with the help of constructer
       new raviB().start();
       new vikashC().start();

    }
}
