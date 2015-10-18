package wczytywanie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class WczytywaniePliku {
	 public static void main(String[] args) {

			WczytywaniePliku obj = new WczytywaniePliku();
			obj.run();

		  }

		  public void run() {

			String csvFile = "src/plikz1.csv";
			BufferedReader br = null;
			String line = "";
			String cvsSplitBy = ",";

			try {

				br = new BufferedReader(new FileReader(csvFile));
				while ((line = br.readLine()) != null) {

				        // use comma as separator
					String[] country = line.split(cvsSplitBy);

					System.out.println("Country [imie= " + country[0] 
		                                 + " , name=" + country[1] + "]");

				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}

			System.out.println("koniec");
		  }

		}