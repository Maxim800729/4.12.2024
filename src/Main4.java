public class Main4 {
    public static char[] toUpperCase(char[] arr){
        char[]result = new char[arr.length];
        for (int i=0;i<arr.length;i++){
            char ch = arr[i];
            if (ch>='a'&& ch<='z'){
                result[i] = (char)(ch-32);
            }
            else {
                result[i]=ch;
            }
        }
        return result;
    }
    public static void main(String[]args){
        char[]input={'a','b','c','d','e'};
        char[]output=toUpperCase(input);
        System.out.println("Исходный массив :"+new String(input));
        System.out.println("Массив в верхнем регистре :"+new String(output));
    }
//Описание:
//Метод возвращает новый массив символов, где все буквы преобразованы в верхний регистр.
//Для каждой буквы в массиве проверяет, является ли она строчной (например, a-z).
// Если да, то заменяет её на соответствующую заглавную (например, A-Z).
//Если символ не является буквой, он остается неизменным.
}
