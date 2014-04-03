def fibonacci() {
	(0..10).each {
		println fibo(it)
	}
}

def fibo(n){ n < 2 ? n : fibo(n-2)+fibo(n-1) }

fibonacci()