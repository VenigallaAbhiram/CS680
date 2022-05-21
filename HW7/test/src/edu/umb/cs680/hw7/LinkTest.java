package edu.umb.cs680.hw7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;



public class LinkTest {

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
	Link xlink = new Link(home, "xlink",0, localTime, bin );
	Link ylink = new Link(pictures, "ylink",0, localTime,y );

    @Test
    public void verifyLinks() {
    	 assertFalse(x.isLink());
         assertFalse(y.isLink());
         assertFalse(a.isLink());
         assertFalse(b.isLink());
         assertFalse(c.isLink());
         assertTrue(xlink.isLink());
         assertTrue(ylink.isLink());
        assertFalse(root.isLink());
        assertFalse(apps.isLink());
        assertFalse(bin.isLink());
        assertFalse(home.isLink());
        assertFalse(pictures.isLink());
       
    }

    @Test
	public void checkdirectory() {
		assertFalse(xlink.isDirectory());
		assertFalse(ylink.isDirectory());
	}
    
    @Test
    public void checkxlink() {
        assertEquals(bin, xlink.getTarget());
    }

    @Test
    public void checkylink() {
        assertEquals(y, ylink.getTarget());
    }

}