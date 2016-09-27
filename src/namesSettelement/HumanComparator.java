	package namesSettelement;

import java.util.Comparator;

public class HumanComparator implements Comparator<Human> {

	public int compare(Human o1, Human o2) {
		int name = o1.getName().compareTo(o2.getName());

		if (name != 0) {
			return name;
		}
		int age = o1.getAge() - o2.getAge();

		return age;
	}
}
