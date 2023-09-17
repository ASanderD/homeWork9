public class Main {
    public static void main(String[] args) { // метод main
        System.out.println("task 1");
        task1(); // вызов метода task1()
        System.out.println("task 2");
        task2(); // вызов метода task2()
        System.out.println("task 3");
        task3(); // вызов метода task3()
        System.out.println("task 4");
        task4(); // вызов метода task4()
    }

    public static int[] generateRandomArray() { // объявление метода сгенерировать массив
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray(); // объявление массива и вызов метода сгенерировать массив
        double sum = 0; // создание переменной для подсчета суммы трат
        for (final int randomArr : arr) { // цикл foreach для прохода всех элементов массива
            sum += randomArr; // сумма всех трат
            //System.out.println(randomArr); // вывод в консоль элементов массива (использовалась для проверки)
        }
        System.out.println(sum); // вывод в консоль результата по заданию
    }

    public static void task2() {
        int[] arr = generateRandomArray(); // объявление массива и вызов метода сгенерировать массив
        int maxValue = arr[0]; // объявление переменной для расчета максимального значения
        int minValue = arr[0]; // объявление переменной для расчета минимального значения
        for (final int randomArr : arr) { // цикл foreach для прохода всех элементов массива
            if (randomArr > maxValue) { //условный оператор сравнения элементов массива для нахождения максимального значения
                maxValue = randomArr; // присвоение в переменную maxValue наибольшего значения элементов массива
            }
            if (randomArr < minValue) { //условный оператор сравнения элементов массива для нахождения минимального значения
                minValue = randomArr; // присвоение в переменную minValue наименьшего значения элементов массива
            }
            //System.out.println(randomArr); // вывод в консоль элементов массива (использовалась для проверки)
        }
        System.out.println("Минимальная сумма трат за день составила " + minValue + " рублей. Максимальная сумма трат за день составила " + maxValue + " рублей"); // вывод в консоль результата по заданию
    }

    public static void task3() {
        int[] arr = generateRandomArray(); // объявление массива и вызов метода сгенерировать массив
        double sum = 0; //объявление переменной для расчета суммы элементов массива
        double mid = 0; //объявление переменной для расчета среднего значения элементов массива
        for (int randomArr : arr) { // цикл foreach для прохода всех элементов массива
            sum += randomArr; // расчет суммы элементов массива
        }
        System.out.printf("Сумма трат за месяц %.2f рублей.\n", sum); // вывод значения суммы элементов массива (для наглядности)
        mid = sum / arr.length; // расчет среднего значения
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.\n", mid); // вывод в консоль результата по заданию
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'}; // объявление символьного массива с инициализацией
        for (int i = reverseFullName.length - 1; i >= 0; i--) { //добавил код по заданию, но и свой вариант не стал удалять)/
            System.out.printf("%s", reverseFullName[i]);
        }
        System.out.println(" ");

        for (int i = 0; i < reverseFullName.length / 2; i++) { // цикл для прохода половины элементов массива
            char temp; // объявление переменной для хранения элементов массива
            temp = reverseFullName[reverseFullName.length - i - 1]; // присвоение переменной temp значения последнего элемента исходного массива
            reverseFullName[reverseFullName.length - i - 1] = reverseFullName[i]; // присвоение последнему элементу исходного массива значения первого элемента
            reverseFullName[i] = temp; // присвоение значения переменной temp первому элементу массива
        }
        System.out.println(reverseFullName); // вывод в консоль результата по заданию
    }
}

