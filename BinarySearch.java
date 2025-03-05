import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // Lista de números
        int[] myList = {87, 21, 45, 93, 34}; 
        
        // Ordena a lista para a busca binária funcionar
        Arrays.sort(myList);

        // Cria um scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário um número para pesquisa
        System.out.print("Digite o número para pesquisar: ");
        int numberToSearch = scanner.nextInt(); // Lê o número digitado pelo usuário

        // Chama a função de busca binária e exibe o resultado
        int result = binarySearch(myList, numberToSearch);
        
        if (result != -1) {
            System.out.println("Número encontrado na posição: " + result);
        } else {
            System.out.println("Número não encontrado.");
        }

        scanner.close(); // Fecha o scanner
    }

    // Função de busca binária
    public static int binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int guess = list[mid];

            if (guess == item) {
                return mid; // Encontrou o número
            } else if (guess > item) {
                high = mid - 1; // O número está à esquerda
            } else {
                low = mid + 1; // O número está à direita
            }
        }
        return -1; // Não encontrou o número
    }
}
