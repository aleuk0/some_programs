/* ����஢�� ���� �ᥫ �� 䠩�� 13.11.03
1. ����� ��� 䠩�� � ���᮫�.
2. ������ �� ���� ����� �ᥫ.
3. �뢥�� �� ���᮫� ⮫쪮 ���, �����஢���� �� �����⠭��.
�ਬ�� �����:
5
8
11
3
2
10
�ਬ�� �뢮��:
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
        Scanner scannFromFile = new Scanner(new FileReader(br.readLine()));  //� scanner ����, InputStream �⠥� �����
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