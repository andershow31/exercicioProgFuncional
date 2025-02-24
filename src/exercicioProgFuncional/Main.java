package exercicioProgFuncional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o caminho do arquivo: ");
		//o arquivo de testes é: src\exercicioProgFuncional\in.txt
		String pathName = sc.nextLine();
		List<Product> list = new ArrayList<>();
		try(BufferedReader bf = new BufferedReader(new FileReader(pathName))){
			
			
			String line = bf.readLine();
			while(line != null) {
				String[] lineSplit = line.split(",");
				list.add(new Product(lineSplit[0], lineSplit[1], Double.parseDouble(lineSplit[2])));
				line = bf.readLine();
			}
			//list.forEach(elemento -> System.out.println(elemento));
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Entre com o salário médio: ");
		double limit = sc.nextDouble();

		System.out.println("Email de pessoas que tem o salário menor que " + limit);
		List<String> getEmailtoMain = list.stream()
				.filter(n -> n.getPrice()<=limit)
				.map(p -> p.getEmail())
				.collect(Collectors.toList());// esta linha transforma novamente para lista, caso contrário fica difícil de imprimir
		System.out.println(getEmailtoMain);
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Pessoas que começam com a letra M: ");
		List<String> getFirstLetter = list.stream()
				.filter(n -> n.getName().toUpperCase().charAt(0) == 'M')
				.map(z->z.getName())
				.collect(Collectors.toList());
		getFirstLetter.forEach(elemento -> System.out.println(elemento));
		
		sc.close();

	}

}
