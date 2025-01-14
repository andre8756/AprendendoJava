package SummaryStatistics;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Aluno> alunos = Arrays.asList(
				new Aluno("Alice", LocalDate.of(2002, 10, 20)),
				new Aluno("Bob", LocalDate.of(1980, 8, 9)),
				new Aluno("Carlos", LocalDate.of(2003, 01, 28)),
				new Aluno("David", LocalDate.of(2003, 05, 12)),
				new Aluno("Maria", LocalDate.of(2005, 12, 25))
				);
				
		IntSummaryStatistics stats = alunos.stream()
                .mapToInt(Aluno::getIdade)
                .summaryStatistics();
		
		System.out.println("Idade média: " + stats.getAverage());
		System.out.println("Idade mínima: " + stats.getMin());
		System.out.println("Idade máxima: " + stats.getMax());
		System.out.println("Total de alunos: " + stats.getCount());
		
	}
}
