package com.lovelacetecnolgia.main;

import com.lovelacetecnolgia.model.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("João Silva" , 3000);
		
		System.out.println(funcionario.adiatamentoViagem(5,true));
		
	}

}
