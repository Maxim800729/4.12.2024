public class Main{


public static int length(char[] arr){
    int count=0;
    for (char c:arr){
        count++;
    }
    return count;
};
public static void main(String[]args){
    char[]arr={'a','b','c','d','e'};
    int result=length(arr);
    System.out.println("длина массива = " +result);
}
//Описание: Метод возвращает длину массива символов arr.
//Считает количество символов в массиве arr и возвращает это значение.
//
//
}

