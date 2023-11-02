import java.util.LinkedList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortedCollection
{
    private LinkedList<StringBuilder> collection = new LinkedList<>(); // Створення списку

    // Метод 2: Додати елемент у початок списку
    public void addFirst(StringBuilder obj)
    {
        collection.addFirst(obj);
    }

    // Метод 3: Додати елемент у позицію індексу
    public void addAtIndex(int index, StringBuilder obj)
    {
        collection.add(index, obj);
    }

    // Метод 10: Отримати кількість входжень елемента у список
    public int countOccurrences(StringBuilder obj)
    {
        return Collections.frequency(collection, obj);
    }

    // Метод 12: Створити масив з елементів списку
    public StringBuilder[] toArray()
    {
        return collection.toArray(new StringBuilder[0]);
    }

    // Метод 15: Відсортувати список за зменшенням деякого атрибуту
    public void sortByFirstNumber()
    {
        Collections.sort(collection, (sb1, sb2) ->
        {
            double num1 = findFirstNumber(sb1);
            double num2 = findFirstNumber(sb2);
            return Double.compare(num2, num1);
        });
    }

    private double findFirstNumber(StringBuilder text)  // Пошук першого числа
    {
        Pattern pattern = Pattern.compile("-?\\d+\\.?\\d*");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            String numberStr = matcher.group();
            return Double.parseDouble(numberStr);
        }
        return 0.0;
    }

    // Метод 20: Визначити кількість елементів з певним значенням деякого атрибуту
    public int countItemsWithAttribute(double value)
    {
        int count = 0;
        for (StringBuilder obj : collection)
        {
            double num = findFirstNumber(obj);
            if (num == value)
            {
                count++;
            }
        }
        return count;
    }
}

