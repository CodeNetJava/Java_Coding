package paths.com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsJava {

	public static void main(String[] args) throws IOException{

        // find the path of the current directory
		//"." -> gives current path

		Path currentPath = Paths.get(".");
		Path Path1 = Paths.get("G:\\JAVA_Projects");
		
		// all the directories in current folder
		// list(path) -> List all the directories in the given path
	//	Files.list(Path1).forEach(System.out::println);
		
		// walk(path, depth) -> 
		//list all the inside directories upto 4(depth = any int value) level;
	//	Files.walk(Path1, 4).forEach(System.out::println);
		
		//Find perticular types of the files in given folder
		//method 1
	//	Files.walk(Path1, 4).filter(e -> String.valueOf(e).contains(".java")).forEach(System.out::println);
		//method 2
	//	Files.find(Path1, 4, (pathobj, basicFilesAttributes) ->String.valueOf(pathobj).contains(".java")).forEach(System.out::println);
	
		//find all the directories in the given path
		Files.find(Path1, 4, (pathobj, basicFilesAttribute) -> basicFilesAttribute.isDirectory()).forEach(System.out::println);
	}

}
