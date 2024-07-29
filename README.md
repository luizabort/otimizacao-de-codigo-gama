# Desafio
## Desafio de Otimização/Desempenho de Código
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

Foi proposto um desafio bônus para otimizar o desempenho de um código fornecido. Nele, deveriam ser exibidos os pares de números que, ao serem somados, tenham um resultado específico.

O código fornecido segue abaixo:

```
public class SomaPares {

public static void main(String[] args) {
    int[] numeros = {1, 4, 5, 2, 7, 9, -1};
    int valor_soma = 6;

    for (int i = 0; i < numeros.length; i++) {
    for (int j = i + 1; j < numeros.length; j++) {
        if (numeros[i] + numeros[j] == valor_soma) {
        System.out.println("Pares: (" + numeros[i] + ", " + numeros[j] + ")");
        }
    }
 }
}
}
```

### Modificações:
A modificação principal foi no tempo de resposta. No código fornecido, devido à presença de dois for, era necessário percorrer o array duas vezes a fim de comparar os elementos e sua soma. Isso se torna um impecilho quando consideramos um array grande.

Optou-se por utilizar a técnica dos Dois Ponteiros. 

1. Primeiramente, o array foi ordenado por ordem crescente com auxílio da função Arrays.sort(), que recebeu o array "numeros" como parâmetro. 
2. Após, definiu-se duas variáveis, left e right. A primeira recebeu como valor 0 e a segunda recebeu como valor o número de elementos do array - 1 (extremidades).  As mesmas serão movidas para encontrar os pares.
3. Compara-se primeiro os números das extremidades, verificando sua soma (soma). Se a soma deles for igual à soma desejada (valorSoma), encontramos um par. Assim o left é incrementado e o right decrementado.
4. Se a soma for menor, incrementa-se o ponteiro left para aumentar o valor. Caso contrário, decrementa-se o ponteiro right para reduzir seu valor.
   
Exemplo: No array {-1,2,3,4,6,8}, se o valorSoma for 7, o par (-1, 8) é validado; left++ e right--, apontando agora para 2 e 6, respectivamente. No entanto, a soma desses dois números é maior do que 7. Então, left permanece em 2 e right--.

> Com essa técnica, o array é percorrido apenas uma vez, reduzindo o tempo de resposta do código. Este método é simples e muito eficiente, funcionando também para arrays com muitos elementos.


