package edu.umb.cs680.hw6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

public class FileSystemTest {
	static LocalDateTime localTime = LocalDateTime.now();
	@Test
	public void checkfilesystemvalue() {
		assertNotNull(FileSystem.getFileSystem());
	}

	@Test
	public void checkfilesystem() {
		FileSystem firstfile = FileSystem.getFileSystem();
		FileSystem secondfile = FileSystem.getFileSystem();
		assertSame(firstfile, secondfile);
	}

}