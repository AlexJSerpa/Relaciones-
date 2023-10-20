import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //R={(1,1),(1,2),(1,3),(1,4),(2,1),(2,2),(2,3),(2,4),(3,1),(3,2),(3,3),(3,4),(4,1),(4,2),(4,3),(4,4)
        //A*A

        String R = "{{1,2},{1,2},{2,2},{2,3}}";

        List<List<Integer>> listOfLists = new ArrayList<>();

        // Usa una expresión regular para extraer los pares de números
        Pattern pattern = Pattern.compile("\\{(\\d+),(\\d+)}");
        Matcher matcher = pattern.matcher(R);

        // Usa Sets para identificar elementos únicos en cada grupo
        Set<Integer> uniqueGroup1 = new HashSet<>();
        Set<Integer> uniqueGroup2 = new HashSet<>();

        while (matcher.find()) {
            int num1 = Integer.parseInt(matcher.group(1));
            int num2 = Integer.parseInt(matcher.group(2));

            listOfLists.add(Arrays.asList(num1, num2));

            uniqueGroup1.add(num1);
            uniqueGroup2.add(num2);
        }
        // Imprimir la lista de listas
        System.out.println(listOfLists);

        // Dimensiones de la matriz
        int[][] matrix = new int[uniqueGroup1.size()][uniqueGroup2.size()];


        Map<Integer, Integer> indexMapGroup1 = new LinkedHashMap<>();
        Map<Integer, Integer> indexMapGroup2 = new LinkedHashMap<>();

        int index = 0;
        for (Integer num : uniqueGroup1) {
            indexMapGroup1.put(num, index++);
        }

        index = 0;
        for (Integer num : uniqueGroup2) {
            indexMapGroup2.put(num, index++);
        }


        System.out.println(indexMapGroup1);
        System.out.println(indexMapGroup2);

        matcher.reset();
        while (matcher.find()) {
            int row = indexMapGroup1.get(Integer.parseInt(matcher.group(1)));
            int col = indexMapGroup2.get(Integer.parseInt(matcher.group(2)));
            matrix[row][col] = 1;
        }


        Iterator<Integer> it = uniqueGroup2.iterator();
        Iterator<Integer> it1 = uniqueGroup1.iterator();

        // Imprimir espacio vacío para esquina superior izquierda
        System.out.print("   ");

        // Imprimir encabezados (elementos de uniqueGroup2)
        while (it.hasNext()) {
            System.out.print(it.next() + "  ");
        }
        System.out.println();


        // Imprimir filas de la matriz con encabezados de uniqueGroup1
        for (int[] ints : matrix) {
            // Si hay un siguiente elemento en uniqueGroup2, imprímelo
            if (it1.hasNext()) {
                System.out.print(it1.next() + "-");
            }

            for (int anInt : ints) {
                System.out.print(" " + anInt + " ");
            }
            System.out.println();
        }


    }
}






