
import java.io.*;
import java.util.*;

// Histograma_:

/* Escriu un programa que donat un vector que guarda els pesos de 20 persones (valors enters positius entre 50 i 100), escrigui per pantalla un histograma que representi el nombre de persones per cada pes especificat. Consideracions:

A l'histograma només apareixeran els pesos amb una o més persones.
El vector de pesos s'ha de definir en el codi, NO cal preguntar-los a l'usuari.
Els vector de pesos no està ordenat. PISTA: usar el mètode Arrays.sort(...) per ordenar-lo.
Exemple:

pesos[20]={55,61,65,70,55,61,65,70,61,70,61,70,70,65,65,65,65,65,65,65}

Histograma
55 -- 61 ---- 65 --------- 70 -----

Input Format

Entrada de 20 nombres enters (no han d'estar ordenats).

Constraints

NO n'hi ha.

Output Format

Histograma amb la representació dels pesos

Sample Input 0

55 61 65 70 55 61 65 70 61 70 61 70 70 65 65 65 65 65 65 65
Sample Output 0

55 --
61 ----
65 ---------
70 -----

 */



public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        System.out.print(array[0]+ " -");

        for (int i = 1; i < array.length; i++)
        {
            if (array[i] != array[i-1])
            {
                System.out.println("");
                System.out.print(array[i] + " -");
            }

            else
            {
                System.out.print("-");
            }
        }
    }
}
