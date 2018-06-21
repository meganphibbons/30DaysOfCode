import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Day14 {
  	private int[] elements;
  	public int maximumDifference;
  	
  	public Day14(int[] a) {
  		elements = a;
  	}
  	
  	public void computeDifference() {
  		for(int i = 0; i < elements.length; i++) {
  			for(int j = 0; j < elements.length; j++) {
  				if(Math.abs(i - j) > maximumDifference) {
  					maximumDifference = Math.abs(i - j);
  				}
  			}
  		}
  	}
  	
}