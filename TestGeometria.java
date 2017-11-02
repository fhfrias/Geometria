public class TestGeometria {
	public static void main(String[] args){
	
	double areaCuadrado = Geometria.calcularAreaCuadrado(2.155);
	System.out.println("Área del cuadrado es: " + areaCuadrado);

	double areaRectangulo = Geometria.calcularAreaRectangulo(12.5,5.2);
	System.out.println("El area del rectangulo es : " + areaRectangulo);
	

	double areaTriangulo = Geometria.calcularAreaTriangulo (12.3,3.6);
	System.out.println("El area del triangulo es : " + areaTriangulo);
	
	double areaCirculo = Geometria.calcularAreaCirculo (2.5);
	System.out.println("El area del circulo es : " + areaCirculo);
	}

}
