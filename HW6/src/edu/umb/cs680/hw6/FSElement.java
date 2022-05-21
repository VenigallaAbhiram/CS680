package edu.umb.cs680.hw6;

import java.time.LocalDateTime;

public class FSElement {

	protected LocalDateTime creationTime;
	protected int size;
    protected String name;
    protected Directory parent;

    public FSElement(Directory parent, String name, int size, LocalDateTime creationTime) {
    	this.creationTime = creationTime;
    	this.size = size;
        this.name = name;
        this.parent = parent;     
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public Directory getParent() {
        return parent;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }


    public boolean isDirectory(){
        return false;
    }

    public boolean isFile() {
        return false;
    }

}