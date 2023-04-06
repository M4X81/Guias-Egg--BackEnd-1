package ejercicios.guia.pkg5;

/*
 * Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia 
traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
sus filas por columnas (o viceversa).
 */

/**
 *
 * @author Max
 */
public class Eje5_Cl10 {
   
    public static void main(String[] args) {
              
        int[][] matriz = {{0, 1, -2}, {-1, 0, 3}, {2, -3, 0}};
        int n = matriz.length;

        System.out.println("Matriz normal:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t"); 
//con el comando "barra t" agrego una tabulacion al ingreso de los numeros de la matriz para separarlos
            }
            System.out.println();
        }
 System.out.println("Matriz traspuesta:");
        int[][] traspuesta = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                traspuesta[i][j] = matriz[j][i];
                System.out.print(traspuesta[i][j] + "\t");
            }
             System.out.println();
        }

        // Verifico si la matriz es antisimétrica
        boolean esAntisimetrica = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    esAntisimetrica = false;
                }
            }
        }

        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }
}

