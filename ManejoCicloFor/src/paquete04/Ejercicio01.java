/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

public class Ejercicio01 {

    public static void main(String[] args) {

        // Cadena acumuladora donde se guardará toda la salida
        String reporte = "";

        // Totales de cada columna (a, b, c, d)
        int totalA = 0;
        int totalB = 0;
        int totalC = 0;
        int totalD = 0;

        // Bucle desde 30 hasta 10
        for (int contador = 30; contador >= 10; contador--) {

            // a, b, c, d representan las 4 multiplicaciones
            int a = contador * 1;  // primera columna
            int b = contador * 2;  // segunda columna
            int c = contador * 3;  // tercera columna
            int d = contador * 4;  // cuarta columna

            // Acumular totales
            totalA += a;
            totalB += b;
            totalC += c;
            totalD += d;

            // Agregar la fila al reporte
            reporte = String.format("%s%d-%d-%d-%d%n", reporte, a, b, c, d);
        }

        // Agregar totales al final
        reporte = String.format("%sTotales = %d-%d-%d-%d%n",
                reporte, totalA, totalB, totalC, totalD);

        // Mostrar reporte
        System.out.print(reporte);
    }
}



        

        
    

    