class fibonacci {

	public static void main(String[] args) {
		int valor1=0,valor2=1,resultado,iteracion=10;

		for (int inicio=0; inicio < iteracion; inicio++) {
			resultado=valor1+valor2;
			valor1=valor2;
			valor2=resultado;
			println(" "+resultado);
		}
	}
}