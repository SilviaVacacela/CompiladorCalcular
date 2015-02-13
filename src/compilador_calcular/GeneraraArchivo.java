/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador_calcular;
import java.io.File;
import java.io.FileInputStream;
import java_cup.parser;

public class GeneraraArchivo {
    public static void main(String[] args) {
        //generar el analizador lexico
        String path = "E:/Unl/9no Modulo/Compiladores/Programar/java-Jflex/"
        + "Compilador_Calcular/src/compilador_calcular/AnalizadorLexico.flex";
        generarLexer(path);

        //Generar el Analizador sintactico
        String archivo[] = new String[5];
        archivo[0] = "-destdir";
        archivo[1] = "src" + File.separator + "compilador_calcular";
        archivo[2] = "-parser";
        archivo[3] = "AnalizadorSintactico";//nombre archivo a generarse.java
        archivo[4] = "src"+File.separator +"compilador_calcular"+
                        File.separator+"AnalizadorSintactico.cup";
        try {
            java_cup.Main.main(archivo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void generarLexer(String path) {
        File file = new File(path);
        jflex.Main.generate(file);
    }
}


