package com.sau.readString.writeString;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadStringWriteStringAPI {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("resources/file.txt");
		String fileContent = Files.readString(path);
		System.out.println(fileContent);
		
		Path NewPath = Paths.get("resources/Newfile.txt");
		Path file2 = Files.writeString(NewPath, fileContent+"sql");
		 fileContent = Files.readString(file2);
		System.out.println(fileContent);

	}

}
