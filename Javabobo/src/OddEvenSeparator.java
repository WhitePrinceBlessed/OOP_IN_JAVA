import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    private List<Integer> numberList = new ArrayList<>();

    // Добавляем число в список
    public void addNumber(int number) {
        numberList.add(number);
    }

    // Возвращает список чётных чисел
    public List<Integer> even() {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numberList) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    // Возвращает список нечётных чисел
    public List<Integer> odd() {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : numberList) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }
}