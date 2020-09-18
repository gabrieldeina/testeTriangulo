public class Main {

	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo();
		int opcao = 1;
		
		do {
			
		double A = Console.readDouble("Informe o valor de A: ");
		double B = Console.readDouble("Informe o valor de B: ");
		double C = Console.readDouble("Informe o valor de C: ");

		System.out.println(triangulo.tipoTriangulo(A, B, C));
		
		opcao = Console.readInt("Deseja continuar? 1 SIM | 0 NÃO");	
		} while (opcao != 0);
	}

}