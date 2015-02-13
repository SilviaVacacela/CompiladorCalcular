package compilador_calcular;
import java_cup.runtime.*;

%%
%class AnalizadorLexico
%cup
%line
%column
%ignorecase
%eofval{
	return new Symbol(sym.EOF,new String("Fin del archivo"));
%eofval}
D=[0-9]+("."[0-9]+)?
white=[ ,\n,\r\n ]

%%
{white} {/*Ignore*/}
"//".* {/*Ignore*/}

"p" {return new Symbol(sym.P, yychar, yyline, yytext());}
"a" {return new Symbol(sym.A, yychar, yyline, yytext());}
";" {return new Symbol(sym.PUNTOCOMA, yychar, yyline, yytext());}
{D} {return new Symbol(sym.NUMBER, yychar, yyline, new Double(yytext()));}
. {System.out.println("Caracter ilegal: " + yytext());}


