package edu.umb.cs680.hw6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;



public class FileTest {

	static LocalDateTime localTime = LocalDateTime.now();

	Directory root = new Directory(null, "root", 0, localTime);
	Directory apps = new Directory(root, "Apps", 0, localTime);
	Directory bin = new Directory(root, "bin", 0, localTime);
	Directory home = new Directory(root, "home", 0, localTime);
	Directory pictures = new Directory(root, "pictures", 0, localTime);



	File x = new File(apps, "x",20, localTime);
	File y = new File(bin, "y", 40, localTime);
	File a = new File(pictures, "a", 60, localTime);
	File b = new File(pictures, "b", 80, localTime);
	File c = new File(home, "c", 90, localTime);


	private String[] dirToStringArray(Directory d) {
		String parentName = null;
		Directory parent = d.getParent();
		if (parent != null) {
			parentName = parent.getName();
		}
		String[] directorystring = { Boolean.toString(d.isDirectory()), d.getName(), Integer.toString(d.getSize()),
				d.getCreationTime().toString(),parentName, Integer.toString(d.countChildren()),Integer.toString(d.getTotalSize()) };
		return directorystring;
	}

	@Test
	public void checkDirectory() {
		assertFalse(x.isDirectory());
		assertFalse(y.isDirectory());
		assertFalse(a.isDirectory());
		assertFalse(b.isDirectory());
		assertFalse(c.isDirectory());
		assertTrue(root.isDirectory());
		assertTrue(bin.isDirectory());
		assertTrue(apps.isDirectory());
		assertTrue(home.isDirectory());
		assertTrue(pictures.isDirectory());
	}

	@Test
	public void checkFiles() {
		assertTrue(x.isFile());
		assertTrue(y.isFile());
		assertTrue(a.isFile());
		assertTrue(b.isFile());
		assertTrue(c.isFile());
		assertFalse(root.isFile());
		assertFalse(apps.isFile());
		assertFalse(bin.isFile());
		assertFalse(pictures.isFile());
	}


}