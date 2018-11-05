
//import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Password {

    static int m, n = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Source a = new Source();

        TreeSet<Integer> s = new TreeSet<Integer>(); // обьявляем массив обьектов INTEGER
        int[] arr2 = new int[a.arr1.length]; //создали новый массив 

        System.out.println(" Введите код: "); //наполнялем массив вводом с клавиатуры
        for (int i = 0; i < a.arr1.length; i++) {

            arr2[i] = scan.nextInt();
            s.add(arr2[i]);

        }

//        for (int j : s) {
//            for (int i = 0; i < a.arr1.length; i++) {
//                if (j == a.arr1[i]) {
//                    m = m + 1;
//                }
//            }
//        }
        for (int i = 0; i < s.size(); i++) {  //перебираем каждый элемент множества s
            for (int j = 0; j < a.arr1.length; j++) {  //перебираем каждый элемент массива arr1
                if (s.remove(a.arr1[j])) {
                    m = m + 1;
                }
            }
        }
        System.out.println(m + " цифр правильно пристуствуют");

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < a.arr1.length; j++) {
                if ((arr2[i] == a.arr1[j]) && i == j) {
                    n = n + 1;
                }
            }
        }
        System.out.println(n + " цифр находятся на правильных местах");
    }

}
