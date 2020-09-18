package Day4Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q1 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream(new File("story.txt"))){
			StringBuilder builder = new StringBuilder();
			int line;
			System.out.println("Byte formatted");
			while((line = fis.read())!= -1) {
				System.out.println(line + " ");
				builder.append(line);
			}
			System.out.println("Formatted data");
			System.out.println(builder.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
