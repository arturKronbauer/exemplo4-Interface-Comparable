package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa1 {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String nome = br.readLine();
			while (nome != null) {
				lista.add(nome);
				System.out.println(nome);
				nome = br.readLine();
			}
			Collections.sort(lista);
			System.out.println("*** Nomes ordenados ***");
			for (String s : lista) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
