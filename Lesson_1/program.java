package Lesson_1;
import java.util.Scanner;
public class program {
    public static void main(String[] args) { //просто написать 'main' (принимает массив строк)
        System.out.println("world");        // просто написать 'sysout'
/*  
    Типы данных:
    boolean - Логический тип данных (возвращает True или False)
    int, short, long и т.д. - Целочисленные типы данных (1, 3, 5, 8, 10)
    float, double - Вещественные типы данных (для float = 2.7f - обязательно надо поставить 'f', double = 3.1415D обязательно надо поставить 'D')
    Char - Символьные типы данных ('*', '/', '+', '-')

    Создание переменной:
    <тип> <идентификатор> = <значение>;


Основы: классы-обертки
Примитив |  Обертка
int      |  Integer
short    |  Short
long     |  Long
byte     |  Byte
float    |  Float
double   |  Double
char     |  Character
boolean  |  Boolean 

    Пример:      

public class Program {
    public static void main(String[] args) {        */
        int f = 21_43_56; // Не влияющий разделитель для больших чисел
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
        int a = 123;
        a = a-- - --a;
        System.out.println(a); // 2
    
/*  Массивы одномерные:
public class Program {
    public static void main(String[] args) {        */
        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        //явное инифиализация через {}
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5
    
/*   Массивы многомерные:
public class Program {
    public static void main(String[] args) {        */
        int[] arr[] = new int[3][5];
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();

/* Ввод данных строк:
import java.util.Scanner;
public class program {
    public static void main(String[] args) {        */
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();

/* Ввод данных чисел:
import java.util.Scanner;
public class program {
    public static void main(String[] args) {        */        
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt(); // с проверкой(если можно сканер преобразовать в число, тогда выводить)
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        iScanner.close();

/* Форматирование строк:
public class Program {
    public static void main(String[] args) {   */
        int a = 1, b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d \n", a, b, c); // Если кладём в переменную
        System.out.printf("%d + %d = %d \n", a, b, c); // Если на вывод
        System.out.println(res);
/* 
Виды спецификаторов 
%d: целочисленных значений
%x: для вывода шестнадцатеричных чисел
%f: для вывода чисел с плавающей точкой
%e: для вывода чисел в экспоненциальной форме,
например, 3.1415e+01
%c: для вывода одиночного символа
%s: для вывода строковых значений


Управляющие конструкции:
тернарный оператор

public class program {
    public static void main(String[] args) {              */
        int a = 1;
        int b = 2;
        int min = a < b ? a : b; // Если а < b вернутся a ':' иначе b
        System.out.println(min);

/*   Оператор выбора(switch case):
import java.util.Scanner;
public class program {
    public static void main(String[] args) {    */
        int mounth = value;
        String text = "";
        switch (mounth) {
            case 1:
            text = "Autumn";
            break;
        // ....
        default:
            text = "mistake";
            break;
        }
        System.out.println(text);
        iScanner.close();
//for :   (Работает только для коллекций)
/*public class Program {
    public static void main(String[] args) {   */
        int arr[] = new int[10];
        for (int item : arr) {
        System.out.printf("%d ", item);
        }
        System.out.println();        
        }
    }
}

