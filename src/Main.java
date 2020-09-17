public class Main {

	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo();

		double A = Console.readDouble("Informe o valor de A: ");
		double B = Console.readDouble("Informe o valor de B: ");
		double C = Console.readDouble("Informe o valor de C: ");

		System.out.println(triangulo.tipoTriangulo(A, B, C));
	}

}
