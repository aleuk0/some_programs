/* Сортировка четных чисел из файла 13.11.03
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scannFromFile = new Scanner(new FileReader(br.readLine()));  //со scanner короче, InputStream читает байты
        List<Integer> list = new ArrayList<Integer>();

        while (scannFromFile.hasNextInt()) {
            int s = scannFromFile.nextInt();
            if (s % 2 == 0) list.add(s);
        }

        br.close();
        scannFromFile.close();

        Collections.sort(list);
		
        for (int i : list) System.out.println(i);
    }
}