/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semiproyecto;


public class ContadorReportes {
    private static int totalClientesAtendidos = 0;
    private static double[] tiempoTotalPorCaja = new double[3];
    private static int[] clientesPorCaja = new int[3];

    public static void registrarAtencion(int cajaIndex, double tiempoAtencion) {
        totalClientesAtendidos++;
        clientesPorCaja[cajaIndex]++;
        tiempoTotalPorCaja[cajaIndex] += tiempoAtencion;
    }

    public static int getTotalClientesAtendidos() {
        return totalClientesAtendidos;
    }

    public static int getCajaConMasClientes() {
        int maxIndex = 0;
        for (int i = 1; i < clientesPorCaja.length; i++) {
            if (clientesPorCaja[i] > clientesPorCaja[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static double getPromedioCaja(int cajaIndex) {
        if (clientesPorCaja[cajaIndex] == 0) return 0;
        return tiempoTotalPorCaja[cajaIndex] / clientesPorCaja[cajaIndex];
    }

    public static double getPromedioGeneral() {
        double total = 0;
        for (int i = 0; i < tiempoTotalPorCaja.length; i++) {
            total += tiempoTotalPorCaja[i];
        }
        return totalClientesAtendidos == 0 ? 0 : total / totalClientesAtendidos;
    }

    public static int getCajaConMejorPromedio() {
        int mejorCaja = -1;
        double mejorPromedio = Double.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            double prom = getPromedioCaja(i);
            if (clientesPorCaja[i] > 0 && prom < mejorPromedio) {
                mejorPromedio = prom;
                mejorCaja = i;
            }
        }
        return mejorCaja;
    }
}
