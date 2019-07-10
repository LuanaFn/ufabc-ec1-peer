package com.example;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LeArquivos {
	
	private File f;
	private File[] arquivos; 
	private String[] nomes ;

	public void le() {
		f = new File("/teste");
		arquivos = f.listFiles();
		nomes = f.list();
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
		String[][] estados = null ;
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String data = sdf.format(cal.getTime());
		for (int i = 0; i < arquivos.length; i++) {
			estados[i][0] = arquivos[i].toString();
			estados[i][1] = nomePeer;
			estados[i][2] = data;
			
		}
		return estados;
		
	}
	
}
