/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int total = 0;
        int soma = 0;
        int pares = 0;
        int impares = 0;
        int acimade100 = 0;
        int media;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>", "Programinha Java", JOptionPane.QUESTION_MESSAGE));
            soma += numero;
            if (numero != 0) {
                total++;
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            if (numero > 100) {
                acimade100++;
            }

        } while (numero != 0);
        media = soma / total;

        JOptionPane.showMessageDialog(null, "<html>RESULTADO COMPLETO<hr>"
                + "<br>Total de Valores: " + total
                + "<br>Total de Pares: " + pares
                + "<br>Total de Ímpares: " + impares
                + "<br>Total Somatório: " + soma
                + "<br>Valores acima de 100: " + acimade100
                + "<br>Média dos valores: " + media);
    }

}
