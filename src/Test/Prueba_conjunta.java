

package Test;

import Dominio.Prueba;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Prueba_conjunta {

    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {

        int nroMovimientos, cantidadMovimiento;

        System.out.println("¿Cuantos Movimientos Resea Realizar?");
        nroMovimientos = datos.nextInt();
        Prueba[] Prueba = new Prueba[nroMovimientos+1];
        generarMovimientos(nroMovimientos, Prueba);
        DistanciaTotal(nroMovimientos,Prueba);
    }

    public static void generarMovimientos(int n, Prueba p[]) {
        String direccion = "";
        int x = 0;
        int y = 0;
        int i = 0;
        int aux;
        int valor = 0;
        p[0] = new Prueba(x, y);
        for (i = 1; i < n+1; i++) {
            System.out.println("Introducir el Valor de Movimiento Nro." + i + ":");
            valor = datos.nextInt();
            direccion = direccion();
            //System.out.println(direccion);
            if (direccion == "IzquierdA") {
                x = p[i-1].getX();
                x = x-valor;
            }
            else if (direccion == "DerechA") {
                x = p[i-1].getX();
                x= x+valor;
            }

            else if (direccion == "ArribA") {
                y = p[i-1].getY() ;
                y = y+valor;
            }
            if (direccion == "AbajO") {
                y = p[i-1].getY();
                y = y-valor;
            }
            
            p[i] = new Prueba(x, y);
            System.out.println("Nueva Direccion: "+ direccion);
            System.out.println("Nuevas Coordenadas: " + x +" "+ y);        
        }
    }

    public static String direccion() {
        String[] direcciones = {"IzquierdA", "DerechA", "ArribA", "AbajO"};
        int numAleatorio = numeroAleatorio(0, direcciones.length - 1);
        
        return direcciones[numAleatorio];
    }
public static int numeroAleatorio(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
public static void distanciaTotal(int n, Prueba p[]){
        
    
    }

public static void DistanciaTotal(int n, Punto p[]){
        int distancia_x=0;
        int distancia_y=0;
        double distancia_total=0;
        for (int i =0; i < n; i++) {
            distancia_x = p[i+1].getX()-p[i].getX();
            double d_xf = Math.pow(distancia_x, 2);
            distancia_y = p[i+1].getY()-p[i].getY();
            double d_yf = Math.pow(distancia_y, 2);      
            distancia_total = distancia_total + Math.sqrt(d_xf + d_yf);
       }
       System.out.println("LA DISTANTACIA TOTAL ES: " + distancia_total); 
        }

    private static void DistanciaTotal(int nroMovimientos, Prueba[] Prueba) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
    


        

