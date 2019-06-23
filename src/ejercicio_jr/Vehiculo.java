package ejercicio_jr;

public abstract class Vehiculo implements Comparable<Vehiculo> {
    
    public String toString() {
        return "Marca: " + marca + " // Modelo: " + modelo + " // "; 
        }

    private String marca;
    private String modelo;
    private Double precio;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Vehiculo o) {
        if (this.getPrecio() > o.getPrecio()) {
            return -1;
        }
        if (this.getPrecio() < o.getPrecio()) {
            return 1;
        }
        return 0;
    }

}
