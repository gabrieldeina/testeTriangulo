public class Triangulo {

	public String tipoTriangulo(double a, double b, double c) {

		if (a <= 0 || b <= 0 || c <= 0) {
			return "Não é um triângulo";
		}
		if (a + b > c && a + c > b && b + c > a) {
			if (a == b && a == c) {
				return "Triângulo Equilátero";
			} else if (a == b || a == c || c == b) {
				return "Triângulo Isósceles";
			} else {
				return "Triângulo Escaleno";
			}
		}
		return "Não é um triângulo";
	}
}
