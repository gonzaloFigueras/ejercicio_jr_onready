package ejercicio_jr;

public class Auto extends Vehiculo {

    public String toString() {
        return super.toString() + "Puertas: " + puertas + " // ";
    }

    private String puertas;

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }   
}
