public class Main2 {
public static int indexOf(char[]array,char simvol) {
    for (int i=0;i<array.length;i++){
      if (array[i]==simvol){
            return i;
        }
    }
    return -1;
}
public static void main (String[] args){
    char[]array={'a','b','c','d','e'};
    char simvol='c';
    int index=indexOf(array,simvol);
    System.out.println("Индекс символа "+ index);

    }
//Описание:
//Метод возвращает индекс первого вхождения символа simvol в массиве. Если символ не найден, возвращает -1.
//Проходит по массиву слева направо, ищет первый символ, совпадающий с simvol.
// Если символ найден, возвращает его индекс. Если нет, возвращает -1.
}
