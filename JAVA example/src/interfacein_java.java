interface Diwali{
    void Light();
}
interface Colour extends Diwali{
    void Holi();
}
class InterfaceinJava implements Colour{
    public void Light(){
        System.out.println("Diwali is a festival of Light");
    }
    public void Holi(){
        System.out.println("Holi is a festival of colour");
    }
    public static void main(String args[]){
        InterfaceinJava j = new InterfaceinJava();
        j.Light();
        j.Holi();
    } }

