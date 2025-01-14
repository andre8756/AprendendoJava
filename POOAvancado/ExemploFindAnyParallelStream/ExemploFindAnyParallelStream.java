package ExemploFindAnyParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ExemploFindAnyParallelStream {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			numeros.add(i);
		}
		
		//Utilizando parallelStream para encontrar um elemento qualquer em paralelo
		Optional<Integer> numeroQualquerAny = numeros.parallelStream()
				.filter(numero -> numero % 10 == 0)
				.findAny();
		
		Optional<Integer> primeiroNumero = numeros.parallelStream()
				.filter(numero -> numero % 10 == 0).findFirst();
		
		if (numeroQualquerAny.isPresent() && primeiroNumero.isPresent()) {
			System.out.println("Encontrado: "+numeroQualquerAny.get());
			System.out.println("Encontrado: "+primeiroNumero.get());
		} else {
			System.out.println("Nenhum número encontrado.");
		}
		
	}
}
