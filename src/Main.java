public class Main {
    public static void main(String[] args) {
        Carro c1 =  new Carro ("verde", 850, 250, 80, 200);
        System.out.println(c1);

        for(int i=0; i<3; i++){
            c1.andarFrente();
            System.out.println(c1);
        }
    }
}