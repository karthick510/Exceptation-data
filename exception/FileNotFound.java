package com.onesoft.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {
	public static void main (String [] args) throws IOException {
		try {
			File f=new File("C:\\Users\\HP\\Desktop\\Coomunication\\class.txt");
			FileReader fr=new FileReader (f);
			int temp=0;
			while ((temp=fr.read())!=-1) {
				System.out.print((char) (temp));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
