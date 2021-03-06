package edu.umb.cs680.HW09.apfs;

import java.time.LocalDateTime;

import edu.umb.cs680.HW09.fs.*;

public class Apfs extends FileSystem
{
	private static Apfs instance = null;
	private ApfsDirectory root;
	
	public static Apfs getApfsFileSystem() 
	{
		if (instance == null)
			instance = new Apfs();
		return instance;
	}
	
	protected FSElement createDefaultRoot() 
	{
		LocalDateTime localTime = LocalDateTime.now();
		root = new ApfsDirectory(null, "root", 0, localTime, "ApfsFile", localTime);
		return root;
	}
	
	public ApfsDirectory getRootDir() 
	{
		return root;
	}

	public static void main(String [] args)
	{
		System.out.println("Apfs Class Successfully Executed");
	}
}