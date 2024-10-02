//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[]numbers = {5,8,9,4,10};
        myMethod(numbers);
        }

    }
public static int [] myMethod(int[]array){
        for(int i=0;i< array.length-1;i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[i] < array[j + 1]) {
                    return array;
                }
            }
        }}


      //  Return Метод тузунуз параметрине массив кабыл алсын.
          //      Метод массивдин ичиндеги сандарды кемуу тартибинде сорттоп кайтарып берсин.

