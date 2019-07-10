package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;


public class Arquivo {
	
    private String path;
    
    public Arquivo(String path){
    	this.path=path;
    
    } 
 
    public void grava(String txt) throws IOException {
    	System.out.println(txt);
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path,true));
        buffWrite.append(txt);
        buffWrite.newLine();
        buffWrite.close();
    }
    public String[] leitor(String path) throws IOException {
    	String[] array = null;
    	int i=0;
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                array[i]= linha;
                i++;
 
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
        return array;
    }
    
    public void gravaProprio() throws IOException {
    	LeArquivos le = new LeArquivos();
    	Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String data = sdf.format(cal.getTime());

		le.le();
		File[] arquivos = le.listaArquivos();
		

		
			for (int i = 0; i < arquivos.length; i++) {
				System.out.println(arquivos[i]);
				this.grava("proprio;" + arquivos[i] + ";" + data);

			}
    }
 
}