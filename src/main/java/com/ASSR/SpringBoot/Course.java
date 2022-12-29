package com.ASSR.SpringBoot;


public class Course {

	//Constructor
	//getter
	//toString Method
private long id;
private String Name;
private String Author;




public Course(long id, String name, String author) {
	super();
	this.id = id;
	Name = name;
	Author = author;
}
public long getId() {
	return id;
}
public String getName() {
	return Name;
}
public String getAuthor() {
	return Author;
}
@Override
public String toString() {
	return "Course [id=" + id + ", Name=" + Name + ", Author=" + Author + "]";
}
}
