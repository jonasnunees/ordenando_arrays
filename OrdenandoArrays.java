import java.util.Arrays;

public class OrdenandoArrays{

    public static void main(String[] args) {
        
        int[] numeros = {
            1789, 2035, 1899, 1456, 2013,
            1458, 2458, 1254, 1472, 2365,
            2789, 2165, 1457, 2456};

        String[] linguagens = {
            "Java", "Python", "PHP",
            "C#", "C Programming", "C++"};

        // Arrays com os Números
        System.out.println("Array Original: " + Arrays.toString(numeros));

        // ordenar os valores em ordem crescente
        Arrays.sort(numeros);

        System.out.println("Array ordenado: " + Arrays.toString(numeros));

        // Imprindo uma linha vazia para separação
        System.out.println();

        // Arrays com os nomes das linguagens de programação
        System.out.println("Array original: " + Arrays.toString(linguagens));

        Arrays.sort(linguagens);

        System.out.println("Array ordenado: " + Arrays.toString(linguagens));

    }
}