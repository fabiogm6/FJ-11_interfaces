class Circulo implements AreaCalculavel {

	private int raio;

	public Circulo(int raio) {
		this.raio = raio;
	}

	public double calculaArea() {
		return this.raio * Math.PI;
	}

}
