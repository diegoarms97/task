public class Main {
    public static void main(String[] args) {

        //suma de numeros
        System.out.println("la suma es: "+sumar(5,56));

        //instancia coche
        Coche Ferrari= new Coche();
        Ferrari.getPuertas();
        Ferrari.set_puertas(3);
        Ferrari.getPuertas();


    }
    //Funcion sumar numeros
    private static int sumar(int a, int b){
        int r=a+ 87;
        return r;
    }


}
//Clase coche
class Coche{
    public int puertas;
    public Coche(){
        puertas=8;
    };

    public void getPuertas() {
        System.out.println("El coche tiene "+puertas+" puertas");
    }

    public int set_puertas(int puertas_menos){
        System.out.println("se le quita "+puertas_menos+" puertas");
        puertas+=puertas_menos;

        return puertas;
    }


}