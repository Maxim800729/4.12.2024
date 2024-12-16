//
public class Main6 {
    // Метод для удаления начальных и конечных пробелов в массиве символов
    public static char[] trim(char[] arr) {
        int start = 0, end = arr.length - 1;

        // Найти первый не пробельный символ с начала массива
        while (start < arr.length && arr[start] == ' ') {
            start++;
        }

        // Найти первый не пробельный символ с конца массива
        while (end >= 0 && arr[end] == ' ') {
            end--;
        }

        // Если весь массив состоит из пробелов, возвращаем пустой массив
        if (start > end) {
            return new char[0];
        }

        // Создаем новый массив для результата
        char[] result = new char[end - start + 1];
        for (int i = start; i <= end; i++) {
            result[i - start] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        // Пример использования метода
        char[] input = {' ', ' ', 'H', 'e', 'l', 'l', 'o', ' ', ' ', 'W', 'o', 'r', 'l', 'd', ' ', ' '};
        char[] output = trim(input);

        // Вывод результата
        System.out.println("Исходный массив: \"" + new String(input) + "\"");
        System.out.println("Обрезанный массив: \"" + new String(output) + "\"");
    }
}


