package ejercicio_jr;

import java.util.ArrayList;
import java.text.DecimalFormat;
public class Concesionaria implements Interfaz {
    
    DecimalFormat formateador = new DecimalFormat("####.##");
    
    ArrayList<Vehiculo> vehiculos = new ArrayList();
    
    public void listar() {
        
                     
        Auto coche = new Auto();
        Auto coche1 = new Auto();
        Moto moto = new Moto();
        Moto moto1 = new Moto();
        
        coche.setMarca("Peugeot");
        coche.setModelo("206");
        coche.setPrecio(200000.00);
        coche.setPuertas("4");
        
        coche1.setMarca("Peugeot");
        coche1.setModelo("208");
        coche1.setPrecio(250000.00);
        coche1.setPuertas("5");
        
        moto.setMarca("Honda");
        moto.setModelo("Titan");
        moto.setPrecio(60000.00);
        moto.setCilindrada("125c");
        
        moto1.setMarca("Yamaha");
        moto1.setModelo("YBR");
        moto1.setPrecio(80500.50);
        moto1.setCilindrada("160c");
        
        vehiculos.add(coche);
        vehiculos.add(coche1);
        vehiculos.add(moto);
        vehiculos.add(moto1);
        
    }
    
    public void mostrar() {
        
       int i;
        String patron = " $ ###,###,###.00";
        DecimalFormat formateo = new DecimalFormat(patron);
        for (i=0; i<vehiculos.size(); i++){
            String precioAMostrar = formateo.format(vehiculos.get(i).getPrecio());
            System.out.println (vehiculos.get(i).toString() + "Precio: " + precioAMostrar);
}
        
    }
    
    public void mostratMasCaro() {
        
        Vehiculo mayorPrecio = null;
        if (!vehiculos.isEmpty()) {
            mayorPrecio = vehiculos.get(0);
        }
        for (int i = 1; i < vehiculos.size(); i++) {
            if (mayorPrecio.getPrecio() < vehiculos.get(i).getPrecio()) {
                mayorPrecio = vehiculos.get(i);
            }
        }
        System.out.println("Vehículo más caro : " + mayorPrecio.getMarca() + " " + mayorPrecio.getModelo());
    }
    
    public void mostrarMasBarato() {
        
        Vehiculo menorPrecio = null;
        if (!vehiculos.isEmpty()) {
            menorPrecio = vehiculos.get(0);
        }
        for (int i = 1; i < vehiculos.size(); i++) {
            if (menorPrecio.getPrecio() > vehiculos.get(i).getPrecio()) {
                menorPrecio = vehiculos.get(i);
            }
        }
        System.out.println("Vehículo más barato : " + menorPrecio.getMarca() + " " + menorPrecio.getModelo());
    }
    
    public void mostrarConY() {
        
        String patron = " $ ###,###,###.00";
        DecimalFormat formateo = new DecimalFormat(patron);
            
        for (int i = 1; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getModelo().contains("Y")) {
                String precioAMostrar = formateo.format(vehiculos.get(i).getPrecio());
                System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + vehiculos.get(i).getMarca() + " " + vehiculos.get(i).getModelo() + " " +  precioAMostrar);
            }
        }
    }
   
    public void mostrarOrdenado() {
        System.out.println("Vehiculos ordenados por precio de Mayor a Menor: ");
        
        for (int i = 0; i < vehiculos.size(); i++) {
            
            System.out.println(vehiculos.get(i).getMarca() + " " + vehiculos.get(i).getModelo());
        }
        
    }
    
    public void textoANumero(){
    
        String patron = " $ ###.###,## ";
        double valor = 200000.00;
        
        DecimalFormat miFormato = new DecimalFormat(patron);
        String output = miFormato.format(valor);
        System.out.println(valor + " " + patron + " " + output);
    }
    
}
