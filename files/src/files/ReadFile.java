package files;

import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.List;

import java.io.IOException;
import java.nio.file.Files;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		Path pathOfFileToRead = Paths.get("./resources/sau.txt");
		
		//read all lines
		Files.readAllLines(pathOfFileToRead).forEach(System.out::println);

		//keep lines in list and print list format
	    List <String> list = Files.readAllLines(pathOfFileToRead);
		System.out.println(list);
		
		//go through all lines here we get stream an we perform lots of operation on it
		// map only lowercase letters lines 
		//filter lines that contains 'a' letter
		Files.lines(pathOfFileToRead).map(String::toLowerCase).filter(e -> e.contains("a")).
		forEach(System.out::println);
		
	
	}

}
