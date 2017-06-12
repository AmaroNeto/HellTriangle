package main;

import java.util.Scanner;

public class Dev {
	
	public static void main(String[] args) {

		/*int[][] triangulo = new int[4][4];
		triangulo[0][0] = 6;
		triangulo[1][0] = 3;
		triangulo[1][1] = 5;
		triangulo[2][0] = 9;
		triangulo[2][1] = 7;
		triangulo[2][2] = 1;
		triangulo[3][0] = 4;
		triangulo[3][1] = 6;
		triangulo[3][2] = 8;
		triangulo[3][3] = 4;*/
		
		int[][] triangulo = {{6},{3,5},{9,7,1},{4,6,8,4}};
		
		int posicaoMaior = 0;
		int valor = 0;
		
		//Varre todas as linhas do triangulo (matriz)
		for(int x = 0; x < triangulo.length; x ++){

			System.out.println("linha = "+x);
			
			//busca o maior naquela linha
			int maior = maior(triangulo, x, posicaoMaior);
			System.out.println("maior = "+maior);
			
			//atualiza a soma com o maior da linha
			valor = valor + triangulo[x][maior];
			
			//a posicao do maior da linha é atualizado
			posicaoMaior = maior;

		}
		
		System.out.println("result : "+valor);
		
	}
	
	/**
	 * Função que retorna a posicao de maior valor na linha
	 * @param triangulo -- matriz
	 * @param linha -- linha que deve ser pesquisada
	 * @param maior -- posição do maior numero na linha anterior
	 * @return
	 */
	public static int maior(int[][] triangulo, int linha, int maior){
		
		//se for a primeira linha retorne o valor da primeira casa (so existe ele)
		if(maior == 0 && linha == 0){
			return 0;
		}
		
		//pegando a posição adjacentes ao maior anterior
		int posicao1 = triangulo[linha][maior];
		int posicao2 = triangulo[linha][maior+1];
		
		
		//retorna o maior
		if(posicao1 > posicao2){
			return maior;
		}
		
		return maior+1;
		
	}
	
	

}
