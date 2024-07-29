import java.util.Arrays;

public class SomaPares {
    public static void main(String[] args) {
      int[] numeros = {1, 4, 5, 2, 7, 9, -1};
      int valorSoma = 6;
  
      // Ordena o array
      Arrays.sort(numeros);

      // Array ordenado:
      // numeros = {-1, 1, 2, 4, 5, 7, 9};
  
      // Usa dois ponteiros para encontrar os pares
      int left = 0;
      int right = numeros.length - 1;
  
      while (left < right) {
        int soma = numeros[left] + numeros[right];
        if (soma == valorSoma) {
          System.out.println("Pares: (" + numeros[left] + ", " + numeros[right] + ")");
          left++;
          right--;
        } else if (soma < valorSoma) {
          left++;
        } else {
          right--;
        }
      }
    }
  }
  