import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Button myButton = new Button();
        myButton.Click(); // Клик
        myButton.Click(); // Клик
        System.out.println("Итоговое количество кликов: " + myButton.clickCount);

        System.out.println("Задание 2");
        Balance balance = new Balance();

        balance.addLeft(10); // Добавляем 10 на левую чашу
        balance.addRight(15); // Добавляем 15 на правую чашу
        balance.result(); // Вывод: R (правая чаша перевесила)

        balance.addLeft(5); // Добавляем 5 на левую чашу
        balance.result(); // Вывод: = (чаши в равновесии)

        balance.addLeft(10); // Добавляем 10 на левую чашу
        balance.result(); // Вывод: L (леваяая чаша перевесила)

        System.out.println("Задание 3");
        Bell music = new Bell();
        music.sound();
        music.sound();
        music.sound();

        System.out.println("Задание 4");
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(4);
        separator.addNumber(5);

        List<Integer> evenNumbers = separator.even();
        List<Integer> oddNumbers = separator.odd();

        System.out.println("Чётные числа: " + evenNumbers);
        System.out.println("Нечётные числа: " + oddNumbers);

        System.out.println("Задание 5");
        Table table = new Table(3, 4);
        table.setValue(0, 0, 1);
        table.setValue(1, 1, 2);
        table.setValue(2, 2, 3);

        System.out.println("Значение в ячейке (1, 1): " + table.getValue(1, 1));
        System.out.println("Таблица:");
        System.out.println(table);

        System.out.println("Среднее значение: " + table.average());

        System.out.println("Задание 6");
        try {
            // Создаем фигуры
            Circle circle = new Circle(5);
            Rectangle rectangle = new Rectangle(4, 6);

            // Создаем цилиндры
            Cylinder cylinder1 = new Cylinder(circle, 10);
            Cylinder cylinder2 = new Cylinder(rectangle, 8);

            // Выводим информацию
            System.out.println(circle);
            System.out.println("Площадь круга: " + circle.area());
            System.out.println("Периметр круга: " + circle.perimeter());

            System.out.println(rectangle);
            System.out.println("Площадь прямоугольника: " + rectangle.area());
            System.out.println("Периметр прямоугольника: " + rectangle.perimeter());

            System.out.println(cylinder1);
            System.out.println("Объем цилиндра с круглым основанием: " + cylinder1.volume());

            System.out.println(cylinder2);
            System.out.println("Объем цилиндра с прямоугольным основанием: " + cylinder2.volume());

        }catch ( Exception e ) {
            System.out.println("Ошибка" + e.getMessage());
        }

    }








}


