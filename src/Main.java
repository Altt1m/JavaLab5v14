public class Main
{
    public static void main(String[] args)
    {
        StringBuilder input = new StringBuilder("I have numbers 2.55 and 6.31. Plus, I have 0.8 and 8.");
        System.out.println("How it was: " + input);
        StringBuilder sortedInput = Sorting.sortNumbers(input);
        System.out.println("How it is now: " + sortedInput);

        // 2 Додати елемент у початок списку
        // 3 Додати елемент у позицію індексу
        // 10 Отримати кількість входжень елемента у список
        // 12 Створити масив з елементів списку.
        // 15 Відсортувати список за зменшенням деякого атрибуту
        // 20 Визначити кількість елементів з певним значенням деякого атрибуту

        SortedCollection linkedList = new SortedCollection(); // Створення колекції
        linkedList.addFirst(sortedInput); // Додавання першого елементу (2)

        // Створення інших елементів та їх додавання у середину (3)
        StringBuilder input2 = new StringBuilder("I have numbers 3.14 and 7.99. Plus, I have 0.5 and 9.");
        StringBuilder sortedInput2 = Sorting.sortNumbers(input2);
        linkedList.addAtIndex(1, sortedInput2);
        StringBuilder input3 = new StringBuilder("I have numbers 1.23 and 4.56. Plus, I have 0.75 and 8.");
        StringBuilder sortedInput3 = Sorting.sortNumbers(input3);
        linkedList.addAtIndex(2, sortedInput3);
        StringBuilder input4 = new StringBuilder("I have numbers 3.33 and 5.55. Plus, I have 0.5 and 6.");
        StringBuilder sortedInput4 = Sorting.sortNumbers(input4);
        linkedList.addAtIndex(1, sortedInput4);
        linkedList.addAtIndex(4, sortedInput4);
        StringBuilder input5 = new StringBuilder("I have numbers 2.71 and 8.96. Plus, I have 1.8 and 7.");
        StringBuilder sortedInput5 = Sorting.sortNumbers(input5);
        linkedList.addAtIndex(5, sortedInput5);

        // Кількість входжень sortedInput4 у колекцію (10)
        System.out.println("\nSorted input #4 occurrences: " + linkedList.countOccurrences(sortedInput4));

        // Створення масиву з елементів колекції і отримання елементу (12)
        System.out.println("\nString under index 5 is: " + linkedList.toArray()[5]);

        // Сортування за зменшенням першого знайденого числа (15)
        linkedList.sortByFirstNumber(); // Сортування
        System.out.println("\nString under index 0 is: " + linkedList.toArray()[0]);
        System.out.println("String under index 1 is: " + linkedList.toArray()[1]);
        System.out.println("String under index 2 is: " + linkedList.toArray()[2]);

        // Кількість елементів, що мають першим значенням 0.5 (20)
        System.out.println("\n0.5 is first number for " + linkedList.countItemsWithAttribute(0.5) + " strings");


    }
}