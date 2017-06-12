package main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HellTriangleTest {
	
	Triangle triangle;
	

    @Before
    public void initObjects() {
    	
    	//Inicializando os dados
    	int[][] values = {{6},{3,5},{9,7,1},{4,6,8,4}};
    	triangle = new Triangle(values);
    	
    }
	
	@Test
	public void testeSomaMaiores(){
		
		//Soma dos maiores
		Assert.assertEquals(triangle.somaDosMaiores(), 26, 0);
		
	}
	
	@Test
	public void testeMaiorLinha(){
		
		
		//Maior na linha
		Assert.assertEquals(triangle.maiorNaLinha(2, 1), 1, 0);
	}
	

}
