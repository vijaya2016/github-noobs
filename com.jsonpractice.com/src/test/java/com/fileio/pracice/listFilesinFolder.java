package com.fileio.pracice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class listFilesinFolder {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the path to folder to search for files");
 
		Scanner scanner = new Scanner(System.in);
 
		String folderPath = scanner.next();
 
		File folder = new File(folderPath);
 
		if (folder.isDirectory()) {
			File[] listOfFiles = folder.listFiles();
			if (listOfFiles.length < 1)
				System.out.println("There is no File inside Folder");
			else
				System.out.println("List of Files & Folder");
 
			for (File file : listOfFiles) {
                               if(!file.isDirectory())
				System.out.println(file.getCanonicalPath().toString());
			}
		}
 
		else
			System.out
					.println("There is no Folder @ given path :" + folderPath);
	}
}

