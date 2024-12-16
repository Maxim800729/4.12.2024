public class Main1 {
    public static char charAt(char[] arr, int index) {
        if (index >= 0 && index < arr.length) {
            return arr[index];
        } else {
            throw new IndexOutOfBoundsException("Индекс вне диапазона массива");
        }
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd' };

        try {
            int index = 3;
            char result = charAt(arr, index);
            System.out.println("Symvol na indexe" + index + " :" + result);
        } catch (
                IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
//Описание:
//Метод возвращает символ, находящийся по указанному индексу в массиве.
//Берет массив символов и индекс index, проверяет, существует ли символ на этом месте.
// Если индекс корректен, возвращает символ.

