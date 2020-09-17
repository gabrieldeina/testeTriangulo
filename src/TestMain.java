import org.junit.Test;
import org.junit.Assert;
public class TestMain {
	
	Triangulo triangulo = new Triangulo();
	String resultado;
	
	@Test
	public void TC_01() {
		resultado = triangulo.tipoTriangulo(10, 10, 10);
		Assert.assertEquals("Triângulo Equilátero", resultado);
	}
	
	@Test
	public void TC_02() {
		resultado = triangulo.tipoTriangulo(5, 8, 7);
		Assert.assertEquals("Triângulo Escaleno", resultado);
	}
	
	@Test
	public void TC_03() {
		resultado = triangulo.tipoTriangulo(1, 2, 3);
		Assert.assertEquals("Não é um triângulo", resultado);
	}
	
	@Test
	public void TC_04() {
		resultado = triangulo.tipoTriangulo(2, 5, 10);
		Assert.assertEquals("Não é um triângulo", resultado);
	}
	
	@Test
	public void TC_05() {
		resultado = triangulo.tipoTriangulo(10, 10, 12);
		Assert.assertEquals("Triângulo Isósceles", resultado);
	}
	
	@Test
	public void TC_06() {
		resultado = triangulo.tipoTriangulo(10, 12, 10);
		Assert.assertEquals("Triângulo Isósceles", resultado);
	}
	
	@Test
	public void TC_07() {
		resultado = triangulo.tipoTriangulo(12, 10, 10);
		Assert.assertEquals("Triângulo Isósceles", resultado);
	}
	
	@Test
	public void TC_08() {
		resultado = triangulo.tipoTriangulo(0, 10, 10);
		Assert.assertEquals("Não é um triângulo", resultado);
	}
	
	@Test
	public void TC_09() {
		resultado = triangulo.tipoTriangulo(-1, 10, 10);
		Assert.assertEquals("Não é um triângulo", resultado);
	}
	
	@Test
	public void TC_10() {
		resultado = triangulo.tipoTriangulo(20, 10, 10);
		Assert.assertEquals("Não é um triângulo", resultado);
	}
	
	@Test
	public void TC_11() {
		resultado = triangulo.tipoTriangulo(10, 20, 10);
		Assert.assertEquals("Não é um triângulo", resultado);
	}
	
	@Test
	public void TC_12() {
		resultado = triangulo.tipoTriangulo(10, 5, 2);
		Assert.assertEquals("Não é um triângulo", resultado);
	}
	
	@Test
	public void TC_13() {
		resultado = triangulo.tipoTriangulo(2, 10, 5);
		Assert.assertEquals("Não é um triângulo", resultado);
	}
	
	@Test
	public void TC_14() {
		resultado = triangulo.tipoTriangulo(0, 0, 0);
		Assert.assertEquals("Não é um triângulo", resultado);
	}
	
	@Test
	public void TC_15() {
		resultado = triangulo.tipoTriangulo(2.5, 3.5, 5.5);
		Assert.assertEquals("Triângulo Escaleno", resultado);
	}
	
}
