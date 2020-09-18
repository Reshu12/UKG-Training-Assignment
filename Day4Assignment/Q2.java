package Day4Assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new FileWriter(new File("story2.txt")))) {
			System.out.println("Enter text:");
			String line = null;
			while (!(line = br.readLine()).equals("\n")) {
				bw.write(line + "\n");
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
