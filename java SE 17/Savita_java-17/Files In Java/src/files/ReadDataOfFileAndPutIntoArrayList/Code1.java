package files.ReadDataOfFileAndPutIntoArrayList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code1 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("G:\\JAVA_Projects\\sau.txt");
		List<String> list = Files.readAllLines(path);
        System.out.println(list);
        
        ArrayList <List> listx = new ArrayList<List>();
        
        for(String s: list) {
        	
        	String[] s1 = s.split(" ");
        	var v = Arrays.asList(s1);
        	listx.add(v);
        }
        
        System.out.println(listx);
        
       var v3 =  listx.get(2).get(4);
       System.out.println(v3);
        }}
