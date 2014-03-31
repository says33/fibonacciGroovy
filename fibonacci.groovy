class fibonacci {

	public static void main(String[] args) {
		def valor1=0,valor2=1,resultado,iteracion=10

		(1..iteracion).each {
			resultado=valor1+valor2
			valor1=valor2
			valor2=resultado
			println(" "+resultado)
		}
	}
}