/** Clase Geometria
 La vamos a usar para realizar
 diversos cálculos de geometria
 @author Manuel
 @author Manolo
 @version 1.0
*/

public class Geometria {

	public static final double PI = 3.1416;
	
	/** Metodo calcularAreaCuadrado
	 que nos calcula el area del cuadrado 
	 dado el lado
	 @param lado de tipo doble, lado que define el cuadrado
	 @return area del cuadrado, de tipo doble
	*/	

	public static double calcularAreaCuadrado (double lado){
		return lado * lado;
	}
	
	/** Metodo calcularAreaRectangulo
         que nos calcula el area del rectangulo
         dado base y altura
         @param base de tipo doble, base del rectangulo 
         @param altura de tipo doble, altura del rectangulo
	 @return area del rectangulo, de tipo doble
        */

	
	
	public static double calcularAreaRectangulo (double base, double altura){
	return base * altura;
	}

/** Metodo calcularAreaTriangulo
         que nos calcula el area del triangulo
         dado base y altura
         @param altura de tipo doble,
	 @param base de tipo doble 
         @return area del triangulo, de tipo doble
        */



	public static double calcularAreaTriangulo (double base, double altura){
	return base * altura / 2.0 ;
	}

/** Metodo calcularAreaCirculo
         que nos calcula el area del circulo 
         dado el lado
         @param radio de tipo doble 
         @return area del circulo, de tipo doble
        */



	public static double calcularAreaCirculo(double radio){
	return radio * radio * PI ;
	} 
}
