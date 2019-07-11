package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Estado {
	private String[][] estadoGeral;
	
	public Estado(String [][] estado) {
		this.estadoGeral = estado;
	}
	
	public void atualizaEstado(String[][] estadoNovo) throws ParseException {
		// falta colocar os estados que nao tinham antes e deletar os que nao tem mais 
		for (int i = 0; i < estadoNovo.length; i++) {
			for (int j = 0; j < estadoGeral.length; j++) {
				if(estadoGeral[j][1]==estadoNovo[i][1]) {
					if(estadoGeral[j][0]==estadoNovo[i][0]) {
						SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						Date datageral = formato.parse(estadoGeral[j][2]);
						Date datanovo = formato.parse(estadoNovo[j][2]);
						if(datanovo.compareTo(datageral) < 0) {
							estadoGeral[j] = estadoNovo[i];
						}
					}
				}
			}
			
		}
		
	}

}
