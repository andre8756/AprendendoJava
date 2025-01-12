package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> numerosPares = numeros.stream().
											filter(n -> n%2 == 0).
											collect(Collectors.toList());
		
		System.out.println(numeros); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(numerosPares); // Output: [2, 4, 6, 8, 10]
		
		
		
		//---------------Lista de nomes------------------
		
		List<String> nomes = Arrays.asList("André", "Carlos", "João", "Iasmim", "Maria");
		
		nomes.stream().sorted().limit(3).filter(n -> n.startsWith("A")).map(n -> n.toUpperCase()).forEach(System.out::println);
		
		// Output:
		// ANDRÉ
		
		nomes.stream().forEach(nome -> System.out.println("Olá "+nome+"!"));
		
		// Output:
		// Olá, André!
		// Olá, Carlos!
		// Olá, João!
		// Olá, Iasmim!
		// Olá, Maria!
		
		//-----------------Palavras---------------------
		
		List<String> palavras = Arrays.asList("Java", "Stream", "Operacoes", "Intermediarias");
		
		List<Integer> tamanhos = palavras.stream().map(s -> s.length()).collect(Collectors.toList());
		
		System.out.println(tamanhos);
		
		// Output: [4, 6, 11, 14]
		
	}

}
