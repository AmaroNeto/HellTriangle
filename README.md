# HellTriangle

- Autor: Amaro
- Linguagem: Java
- Ferramenta: Eclipse


Este git é a resposta para o desafio da HellTriangle, ele foi feito em Java no eclipse.


## Execução
Para execultar é só compilar o arquivo Main.java

Nele é execultado a classe Triangle.

A classe Triangle tem duas funções:

- SomadosMaiores: retorna a soma dos maiores números no triângulo de acordo com a regra do desafio.
- MaiorNaLinha: retorna o maior posição na linha de acordo com o maior da posição anterior

Com essas duas funções se consegue o resultado do desafio.
//No codigo tem uma explicação do passo a passo.

Se quizer alterar o trinagulo ou testar com outros valores é só passar um trinagulo (matriz multidimencional) no construtor. Exemplo:

```
//Altere esses valores para um triângulo valido
int[][] values = {{6},{3,5},{9,7,1},{4,6,8,4}};


Triangle triangle = new Triangle(values);
int result = triangle.somaDosMaiores();

System.out.println("result = "+result);
```

##Teste

Eu utilizei testes unitarios para testar as funções da Classe Triangle, eles estão no arquivo HellTriangleTest.java.

PS: Para execulta é necessario a biblioteca JUnit (min 4).
