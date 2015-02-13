/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador_calcular;
import java.io.FileInputStream;

public class Generarprincipal {

    public static void main(String[] args) {
        try {
        AnalizadorSintactico p = new AnalizadorSintactico(
        new AnalizadorLexico(new java.io.InputStreamReader(new FileInputStream(
        "E:/Unl/9no Modulo/Compiladores/Programar/java-Jflex/"
        + "Compilador_Calcular/src/compilador_calcular/datos.txt"))));
        p.parse();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

