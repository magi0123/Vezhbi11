package Treta;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		XmlCreator xml = new XmlCreator();
		List<Student> s = new ArrayList<Student>();
		s.add(new Student("Petar", "Petrovski", 100));
		s.add(new Student("Filip", "Filevski", 105));
		xml.createXMLFile("xml.xml", s);
	}
}
