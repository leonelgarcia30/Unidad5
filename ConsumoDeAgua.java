/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumodeagua;

/**
 *
 * @author Leonel García
 */
public class ConsumoDeAgua {

  

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] agua = {
            {100, 50, 30, 120, 60},
            {32, 122, 46, 80, 90},
            {45, 100, 56, 26, 36},
            {60, 110, 72, 33, 40},};
        int[] consumoCasa = ConsumoDeAgua.sumarcasa(agua, 4, 5);
        for (int a : consumoCasa) {
            System.out.println(a);
        }
        int[] consumodia = ConsumoDeAgua.consumodia(agua);
        for (int o : consumodia) {
            System.out.println(o);
        }
    }
      public static int[] sumarcasa(int[][]agua, int casa, int dia){
        int[] consumocasa = new int [casa];
        for (int i = 0; i < casa; i++) {
            int suma = 0;
            for (int j = 0; j < dia; j++) {
                suma += agua [i][j];
            }
            consumocasa[i] = suma;
        }
        return consumocasa;
    }
 public static int[] consumodia(int [][] agua){
        int casa = agua.length;
        int dia = agua.length;
        int [] consumodia = new int [dia];
        for (int j = 0; j < agua.length; j++) {
            int suma = 0;
            for (int i = 0; i < agua.length; i++) {
                suma += agua[i][j];

            }
            consumodia[j] = suma;
        }
        return consumodia;
    }

}
   


