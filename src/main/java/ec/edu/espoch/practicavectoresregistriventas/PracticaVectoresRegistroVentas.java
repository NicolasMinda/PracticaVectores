package ec.edu.espoch.practicavectoresregistriventas;

import java.util.Scanner;

public class PracticaVectoresRegistroVentas {

    public static void main(String[] args) {
        
        Scanner entrada =new Scanner(System.in);
        int []ventas=new int[7];
        int valorTotal=0;
        int valorMaximo=0;
        double ventasSuperiorPromedio=0.0;
        double promedio=0.0;
        //Solicitar al usuario las ventas
        System.out.println("Ingrese los valores de las ventas");
        for (int i = 0; i < ventas.length; i++) {
            ventas[i]=entrada.nextInt();
            valorTotal=valorTotal+ventas[i];
            
        }
        promedio=(valorTotal/ventas.length);
        for (int i = 0; i < ventas.length; i++) {
            //System.out.println("Venta"+i+ ":" +ventas[i]);
            if(ventas[i]> valorMaximo){
                valorMaximo=ventas[i];
            }
            
            if(ventas[i] >promedio){
                ventasSuperiorPromedio++;
            }
              
        }
        System.out.println("valor total :"+valorTotal);
        System.out.println("Promedio :"+promedio);
        System.out.println("Valor maximo: "+ valorMaximo);
        System.out.println("Dias superior promedio: "+ventasSuperiorPromedio);

    }
}
