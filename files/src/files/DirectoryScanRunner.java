package files;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
// "." means current directory i.e here files
		Path currentDirectory = Paths.get(".");

// all the 	directories in files project	
		Files.list(currentDirectory).forEach(System.out::println);

// all the 	directories in files project go 4 inside directories
	    //Files.walk(currentDirectory, 4).forEach(System.out::println);
	    
// find files of specific types	    
	/*Predicate<? super Path> predicate = pathObj -> String.valueOf(pathObj).contains(".java"); //return Object of type path
	Files.walk(currentDirectory, 3).filter(predicate).forEach(System.out::println);*/

// find files of specific types	
	/*BiPredicate<Path, BasicFileAttributes> matcher = (pathObj,BasicFileAttributesObj) -> String.valueOf(pathObj).contains(".java") ;
	Files.find(currentDirectory, 3, matcher).forEach(System.out::println);*/
		
// all the 	directories in files project	
		/*BiPredicate<Path, BasicFileAttributes> matcher = (pathObj,BasicFileAttributesObj) -> BasicFileAttributesObj.isDirectory() ;
		Files.find(currentDirectory, 3, matcher).forEach(System.out::println);*/
		
	}

}
