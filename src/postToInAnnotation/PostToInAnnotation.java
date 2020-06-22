package postToInAnnotation;

import java.util.ArrayList;
import java.util.Scanner;

public class PostToInAnnotation
{

  static String inString;
  private static String outString;
  public String queue;
  
  public static void main( String[] args )
  {
    System.out.println("Ingrese una cadena en notacion postfija: ");
    Scanner teclado = new Scanner(System.in);
    
    inString = teclado.nextLine();
    
    System.out.println("la cadena postfija es: " + inString);
    
    if( inString.isEmpty() ) {
      System.out.println("Cadena invalida");
    }else {
      changePostToInString(inString);
      System.out.println("la cadena infija es: " + outString);
    }
  }
  
  static void changePostToInString(String inString){
    
    char[] postArray = inString.toCharArray(); 
    ArrayList  inArray = new ArrayList ();
    ArrayList  opArray = new ArrayList ();
    
    for(int i = 0 ; i < inString.length() ; i++) {
      if (Character.isDigit(postArray[i])) {
        inArray.add( postArray[i] );
      }else {
        if(postArray[i] != ',') {
          opArray.add( postArray[i] );
        }
      }
    }
    System.out.println("operadores: " + opArray.toString());
    outString = inArray.toString();
    
  }

}
;