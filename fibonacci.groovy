class fibonacci {

	public static void main(String[] args) {
		def valor1=0,valor2=1,resultado,iteracion=10

		for (inicio in 1 .. iteracion) {
			resultado=valor1+valor2
			valor1=valor2
			valor2=resultado
			println(" "+resultado)
		}
	}
}