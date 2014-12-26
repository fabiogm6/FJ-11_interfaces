public class Teste {

	public static void main(String[] args) {
		AreaCalculavel r = new Retangulo(3, 2);
		System.out.println(r.calculaArea());
		
		AreaCalculavel c = new Circulo(3);
		System.out.println(Math.round(c.calculaArea())  );
		
		AreaCalculavel q = new Quadrado(3);
		System.out.println(q.calculaArea());
	}

}
