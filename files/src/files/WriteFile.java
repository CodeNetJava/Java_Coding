package files;

import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.List;

import java.io.IOException;
import java.nio.file.Files;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		
		Path pathOfFileToWrite = Paths.get("./resources/sauWrite.txt");
		
		List <String> list = List.of("sau","didi","diu","family");
		
		Files.write(pathOfFileToWrite, list);
	}

}
