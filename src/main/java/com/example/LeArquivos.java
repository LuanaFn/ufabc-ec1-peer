package com.example;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LeArquivos {
	
	private File f;
	private File[] arquivos; 
	private String[] nomes ;
	private String estados[][] = new String[9999][9999];

	public void le() {
		f = new File("C:/Users/henrique.batista/eclipse-workspace/teste");
		arquivos = f.listFiles();
		nomes = f.list();
//		System.out.println(f+"////"+arquivos+"////"+nomes);
	}
	public void imprime() {
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
			System.out.println(arquivos[i]);
		
		}
	}
	
	public File[] listaArquivos() {
		return arquivos;
	}
	
	public String[][] retornaEstado(File[] arquivos,String nomePeer) {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String data = sdf.format(cal.getTime());
		for (int i = 0; i < arquivos.length; i++) {
			estados[i][0] = arquivos[i].toString();
			estados[i][1] = nomePeer;
			estados[i][2] = data;
			
		}
		return estados;
		
	}
	
}
