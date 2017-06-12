package main;

/**
 * 
 * @author amaro
 *
 */
public class Triangle {
	
	
	private int[][] triangle;
	
	public Triangle(int[][] triangle){
		this.triangle = triangle;
	}
	
	/**
	 * Função que devolve a soma dos maiores valores de um triangulo (pela regra de adjacencia)
	 * @return
	 */
	public int somaDosMaiores(){
		
		
		int posicaoMaior = 0;
		int valor = 0;
		
		//Varre todas as linhas do triangulo (matriz)
		for(int x = 0; x < this.triangle.length; x ++){

			System.out.println("linha = "+x);
			
			//busca o maior naquela linha
			int maior = maiorNaLinha(x, posicaoMaior);
			System.out.println("maior = "+maior);
			
			//atualiza a soma com o maior da linha
			valor = valor + triangle[x][maior];
			
			//a posicao do maior da linha é atualizado
			posicaoMaior = maior;

		}
		
		System.out.println("Result = "+valor);
		return valor;
	}
	
	/**
	 * Função que retorna a posicao de maior valor na linha
	 * @param triangulo -- matriz
	 * @param linha -- linha que deve ser pesquisada
	 * @param maior -- posição do maior numero na linha anterior
	 * @return
	 */
	public int maiorNaLinha(int linha, int maior){
		
		//se for a primeira linha retorne o valor da primeira casa (so existe ele)
		if(maior == 0 && linha == 0){
			return 0;
		}
		
		//pegando a posição adjacentes ao maior anterior
		int posicao1 = this.triangle[linha][maior];
		int posicao2 = this.triangle[linha][maior+1];
		
		
		//retorna o maior
		if(posicao1 > posicao2){
			return maior;
		}
		
		return maior+1;
		
	}
	
	

}
