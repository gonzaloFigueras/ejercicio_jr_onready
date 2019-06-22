package ejercicio_jr;

public class Moto extends Vehiculo{

    @Override
    public String toString() {
        return super.toString() + "Cilindrada: " + cilindrada + " // ";
    }
    
    

    private String cilindrada;
      
    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }    

}
