package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entidades.Funcionario;

public class Programa2 {

	public static void main(String[] args) {
		List<Funcionario> lista = new ArrayList<>();
		String path = "C:\\temp\\funcionarios.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String funcionariosCsv = br.readLine();
			while (funcionariosCsv != null) {
				String[] campos = funcionariosCsv.split(",");
				lista.add(new Funcionario(campos[0], Double.parseDouble(campos[1])));
				funcionariosCsv = br.readLine();
			}
			Collections.sort(lista);
			System.out.println("*** Funcionários ordenados por nome ***");
			for (Funcionario func : lista) {
				System.out.println(func.getNome() + ", " + func.getSalario());
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
