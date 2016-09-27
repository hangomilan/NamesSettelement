package namesSettelement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class NamesSettelement {

	public static List<Human> readFromFile(File file) {
		BufferedReader reader = null;
		List<Human> humanlist = new ArrayList<Human>();
		try {
			
			reader = new BufferedReader(new FileReader(file));
			String read = null;
			
			while ((read = reader.readLine()) != null) {
				String[] splited = read.split(",");
				Human human = new Human(splited[0], Integer.parseInt(splited[1]));
				humanlist.add(human);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return humanlist;
	}

	public static int count(List<Human> humans) {
		Set<String> set = new HashSet<String>();
		for (Human human : humans) {
			set.add(human.getName());
		}
		return set.size();
	}

}