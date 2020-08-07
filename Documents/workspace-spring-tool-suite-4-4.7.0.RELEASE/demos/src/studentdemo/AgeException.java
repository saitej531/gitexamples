package studentdemo;

import java.util.*;

public class AgeException extends RuntimeException {
	
	
	String msg ;	
	public AgeException(){
	this.msg = "Invalid Age";
	}
	public String toString(){
	return msg;
	}
	}