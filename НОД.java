/* Наибольший общий делитель (НОД) 14.08.b02 
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        while(!(a == b)) {
            if(a > b) a = a - b;
            if(b > a) b = b - a;
        }
        System.out.println(a);
    }
}