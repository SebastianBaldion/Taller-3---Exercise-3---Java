
package taller3.exercise3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Sebastian Baldion
 */
public class Taller3Exercise3 {

    public static void main(String[] args) {
                Random r = new Random();
        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> ParPos = new ArrayList<Integer>();
        ArrayList<Integer> ParNeg = new ArrayList<Integer>();
        ArrayList<Integer> ImpPos = new ArrayList<Integer>();
        ArrayList<Integer> ImpNeg = new ArrayList<Integer>();
        System.out.println("Ingrese un valor");
        int m = leer.nextInt();
        int n;
        int Matriz[][] = new int[m][m];
        System.out.println("Matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                Matriz[i][j] = (int) (r.nextFloat() * 100);
                n = (int) (r.nextFloat() * 2);
                if (n == 0) {
                    Matriz[i][j] *= -1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if(Matriz[i][j]<0){
                    if(Math.abs(Matriz[i][j])%2==0){
                        ParNeg.add(Matriz[i][j]);
                    } else {
                        ImpNeg.add(Matriz[i][j]);
                    }
                } else {
                    if(Matriz[i][j]%2==0){
                        ParPos.add(Matriz[i][j]);
                    } else {
                        ImpPos.add(Matriz[i][j]);
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("" + Matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.print("\nNumeros Pares:\n"+ "Postivos:");
        for (int i = 0; i < ParPos.size(); i++) {
            System.out.print("" +ParPos.get(i)+"\t");
        }
        System.out.print("\nNegativos:");
        for (int i = 0; i < ParNeg.size(); i++) {
            System.out.print(""+ParNeg.get(i)+"\t");
        }
        System.out.println("");
        System.out.print("\nNumeros Impares:\n" + "Postivos:");
        for (int i = 0; i < ImpPos.size(); i++) {
            System.out.print(""+ImpPos.get(i)+"\t");
        }
        System.out.print("\nNegativos:");
        for (int i = 0; i < ImpNeg.size(); i++) {
            System.out.print(""+ImpNeg.get(i)+"\t");
        }
    }
}
