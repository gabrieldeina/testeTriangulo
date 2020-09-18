public class Triangulo {

	public String tipoTriangulo(double a, double b, double c) {

		if (a <= 0 || b <= 0 || c <= 0) {
			return "N�o � um tri�ngulo";
		}
		if (a + b > c && a + c > b && b + c > a) {
			if (a == b && a == c) {
				return "Tri�ngulo Equil�tero";
			} else if (a == b || a == c || c == b) {
				return "Tri�ngulo Is�sceles";
			} else {
				return "Tri�ngulo Escaleno";
			}
		}
		return "N�o � um tri�ngulo";
	}
}
