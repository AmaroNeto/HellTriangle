package main;

public class Main {
	
	public static void main(String[] args) {
		
		int[][] values = {{6},{3,5},{9,7,1},{4,6,8,4}};
		
		
		Triangle triangle = new Triangle(values);
		triangle.somaDosMaiores();
    	
	}

}
