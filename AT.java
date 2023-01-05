public class AT{
    
    public static void main(String[] args) {
        
        int resultado = 0;
        resultado = suma( 4, 2, 6);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        System.out.println(miCoche.puertas);

    }

    public static int suma(int a, int b , int c) {
        return a + b + c;
    }
}

class Coche{

    public int puertas = 4;

    public void dd(){
        this.puertas++;
    }

}