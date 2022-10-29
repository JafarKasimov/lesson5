import java.util.Arrays;

public class Main {
    public static double positiveNumber;
    public static boolean isNegative = false;

    public static void main(String[] args) {

        double[] qi = {1.1, -2.2, 3.3, -4.4, 5.5, -6.6, 7.7, -8.8, 9.9, -10.10, 11.11, -12.12, 13.13, 14.14, -15.15};

        while (!isNegative){
            isNegative = true;
            for (int i = 1; i < qi.length ; i++) {
               if (qi[i] < qi[i-1]){
                   isNegative = false;
                   positiveNumber = qi[i];
                   qi[i] = qi[i-1];
                   qi[i-1] =positiveNumber;
               }
            }
        }
        System.out.println(Arrays.toString(qi));
    }
}

//  ДЗ на сообразительность:
//        ● Вам необходимо написать следующий алгоритм сортировки массива по
//        возрастанию: каждую итерацию выбирать самый минимальный элемент и смещать
//        его в начало. При этом каждую новую итерацию начинать сдвигаясь вправо, то
//        есть первый проход — с первого элемента, второй проход — со второго и т.д.
//        ● И при каждой итерации распечатывать текущее состояние массива
//        {-4, -2, 2, 3, 6, 8}
