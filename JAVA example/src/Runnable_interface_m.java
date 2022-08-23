
class Runnable1 implements Runnable{
    public void run(){
        int i = 0;
        while(i<6){
            System.out.println("I am a thread 1 = " + i);
            i++;
        }
    } }
class Runnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<6) {
            System.out.println("I am a thread 2 = " + i);
            i++;
        }
    } }
public class Runnable_interface_m {
    public static void main(String[] args) {
        Runnable1 bull1 = new Runnable1();
        Thread gh1 = new Thread(bull1);

        Runnable2 let2 = new Runnable2();
        Thread hg2 = new Thread(let2);

        gh1.start();
        hg2.start();
    }
}