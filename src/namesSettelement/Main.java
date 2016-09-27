package namesSettelement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Main extends NamesSettelement{
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\names.txt");
		List<Human> humanlist = readFromFile(file);
		HumanComparator comparator = new HumanComparator();
		humanlist.sort(comparator);

		FileWriter fileWriter = new FileWriter("C:\\namesABC.txt");
		PrintWriter out = new PrintWriter(fileWriter);
		out.println("Abc sorrend a nevekbõl, illetve kor alapján: ");
		out.println(humanlist);
		out.println("Összesen: ");
		out.println(count(humanlist));
		out.flush();
		out.close();
		fileWriter.close();
		System.out.println("Nevek rendezve!");
	}

}
