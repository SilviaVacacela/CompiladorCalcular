
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Feb 11 22:19:54 COT 2015
//----------------------------------------------------

package compilador_calcular;

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Feb 11 22:19:54 COT 2015
  */
public class AnalizadorSintactico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public AnalizadorSintactico() {super();}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\006\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\006\000\002\004\003\000\002\004\003" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\013\000\004\007\005\001\002\000\006\002\015\007" +
    "\005\001\002\000\004\006\007\001\002\000\006\002\uffff" +
    "\007\uffff\001\002\000\004\007\010\001\002\000\006\004" +
    "\011\005\013\001\002\000\006\002\ufffd\007\ufffd\001\002" +
    "\000\006\002\ufffe\007\ufffe\001\002\000\006\002\ufffc\007" +
    "\ufffc\001\002\000\006\002\001\007\001\001\002\000\004" +
    "\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\013\000\006\002\003\003\005\001\001\000\004\003" +
    "\013\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\004\011\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalizadorSintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalizadorSintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$AnalizadorSintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



  /*­­­­ Método para controlar los errores ­­­­*/
  public void report_error(String message, Object info) {
    StringBuffer m = new StringBuffer("Error");
    System.out.println("Mensaje: "+message);
    System.out.println("info: "+info.toString());
    if(info instanceof java_cup.runtime.Symbol) {
    java_cup.runtime.Symbol s=((java_cup.runtime.Symbol)info);
    /* Comprueba si el numero de línea es mayor o igual que cero */
    System.out.println(s);   
    if(s.left >= 0) {
    m.append(" en linea "+(s.left+1));
    /*Comprueba si el numero de columna es mayoro igual que cero */
    if (s.right >= 0)
        m.append(", y columna "+(s.right+1));
    }
    /*­­­­ Sección para controlar los errores­­­­*/
    if( info.toString().equals("#0") ){
      System.out.println("Revise que tenga el FIN DE LINEA, letra P o letra A");
    }
    if( info.toString().equals("#2") ){
       System.out.println("Revise que exista un NÚMERO antes del fin de linea(A)");
    }
    if( info.toString().equals("#3") ){
      System.out.println("Revise que exista un NÚMERO antes del fin de linea(P)");
    }
    if( info.toString().equals("#4") ){
      System.out.println("Revise que exista un NÚMERO antes del puntocoma");
    }
    if( info.toString().equals("#5") ){
    System.out.println("Ingrese dos NÚMERO separados por puntocoma,seguido P o A");
    }
    }
    m.append(" : "+message);
    System.err.println(m);
    }
    /*­­­­ Método para calcular el área o perímetro­­­­*/
    public void conversion(String a, Double b,Double h){
        Double r=0.0; 
        String result="";
	System.out.print("base"+b +";");    System.out.print("altura"+h +";");	
	if (a=="A"){ r=b*h; result="area"; }
	else if (a=="P"){ r=(2*b)+(2*h); result="perimetro"; }
	System.out.print(" El"+result+" es: "+r);	
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$AnalizadorSintactico$actions {
  private final AnalizadorSintactico parser;

  /** Constructor */
  CUP$AnalizadorSintactico$actions(AnalizadorSintactico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintactico$do_action(
    int                        CUP$AnalizadorSintactico$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintactico$parser,
    java.util.Stack            CUP$AnalizadorSintactico$stack,
    int                        CUP$AnalizadorSintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalizadorSintactico$result;

      /* select the action based on the action number */
      switch (CUP$AnalizadorSintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // medida ::= P 
            {
              Object RESULT =null;
		 RESULT="P"; 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("medida",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // medida ::= A 
            {
              Object RESULT =null;
		 RESULT="A"; 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("medida",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // linea ::= NUMBER PUNTOCOMA NUMBER medida 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)).right;
		Double b = (Double)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)).value;
		int hleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int hright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Double h = (Double)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		int mleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int mright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Object m = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		 parser.conversion(m.toString(), b,h);
 	System.out.println(m); 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("linea",1, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // programa ::= linea 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= programa EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		RESULT = start_val;
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$AnalizadorSintactico$parser.done_parsing();
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // programa ::= programa linea 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

