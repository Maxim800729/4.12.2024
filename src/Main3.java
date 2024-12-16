//
public class Main3 {
    public static int lastIndexOf(char[]array,char simvol){
        for(int i= array.length-1;i>=0;i--){
            if (array[i]==simvol){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        char[] array = {'a','b','c','d','e'};
        char simvol ='b';
        int lastIndexOfindex=lastIndexOf(array,simvol);
        System.out.println("Последний Индекс символа "+ lastIndexOfindex);
    }
//Описание:
//Метод возвращает индекс последнего вхождения символа simvol в массиве.
// Если символ не найден, возвращает -1.
//Проходит по массиву справа налево, ищет последний символ, совпадающий с simvol.
// Если символ найден, возвращает его индекс. Если нет, возвращает -1.
}
