package edu.umb.cs680.HW09.apfs;

public interface ApfsFSVisitor 
{
	public void visit(ApfsLink link);
	public void visit(ApfsDirectory dir);
	public void visit(ApfsFile file);
	
	public static void main(String [] args)
	{
		System.out.println("Apfs-FSVisitor Class Successfully Executed");
	}
}
