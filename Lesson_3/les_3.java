/* ПЛАН:
1. Тип, который может быть чем угодно
2. Обобщения
3. Массивы и их проблемы
4. Самая «простая» коллекция
5. Функционал
6. Куда двигаться дальше 


Object
Тип данных Object – «всему голова»
Упаковка – любой тип можно положить в переменную типа Object
Распаковка – преобразование Object-переменной в нужный тип
Иерархия типов – любой тип «ниже» Object’а

*/
//package Lesson_3;
/* 
public class les_3{
    public static void main(String[] args) {
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(1.2, 2.1));
}
    static Object Sum(Object a, Object b) {

        if (a instanceof Double && b instanceof Double) { // Если "a" является типом дабл и "b" является типом дабл, то: 
            return (Object)((Double) a + (Double) b);     // ((дабл) a складываем с (дубл) b) -> засовываем в object и возвращаем
        } else if(a instanceof Integer && b instanceof Integer) {
            return (Object)((Integer) a + (Integer) b);
        } else return 0;
    }
}
*/ 
/*Иерархия коллекций. List
List – пронумерованный набор элементов.
Пользователь этого интерфейса имеет точный контроль над тем, 
где в списке вставляется каждый элемент.
Пользователь может обращаться к элементам по их целочисленному 
индексу (позиции в списке) и искать элементы в списке. */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
public class les_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(10); // создаем числовой массив  с указание сколько элементов будет находиться
        list.add(1); 
        list.add(123);
        for (Object o : list) {
            System.out.println(o);
        }
    

/*Коллекции. Функционал 

методы:
add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
get(pos) – возвращает элемент из списка по указанной позиции
indexOf(item) – первое вхождение или -1
lastIndexOf(item) – последнее вхождение или -1
remove(pos) – удаление элемента на указанной позиции и его возвращение
set(int pos, T item) – gjvtoftn значение item элементу, который находится
на позиции pos
void sort(Comparator) – сортирует набор данных по правилу
subList(int start, int end) – получение набора данных от позиции start до end


                    Использование типа StringBuilder*/

        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = { day, month, year };
        List<StringBuilder> d = Arrays.asList(date); // преобразовали массив в список
        System.out.println(d); // [29, 9, 1990]
        date[1] = new StringBuilder("09"); //мы можеи  поменять  значение month после добавленея его в массив data и вызвав его по индексу
        System.out.println(d); // [29, 09, 1990]


/*
clear() – очистка списка
toString() – «конвертация» списка в строку
Arrays.asList – преобразует массив в список
containsAll(col) – проверяет включение всех элементов из col
removeAll(col) – удаляет элементы, имеющиеся в col
retainAll(col) – оставляет элементы, имеющиеся в col
toArray() – конвертация списка в массив Object’ов
toArray(type array) – конвертация списка в массив type
List.copyOf(col) – возвращает копию списка на основе имеющегося
List.of(item1, item2,...) – возвращает неизменяемый список */

//Нельзя удалять элемент из неизменяемого списка!!! Если нужно что-то удалять, то проще воспользоваться


        List<Integer> list1 = List.of(1, 12, 123, 1234, 12345);
        for (int item : list1) {  // именное переменной перебора(item) : имя коллекции
            System.out.println(item); 
        }
        Iterator<Integer> col = list1.iterator();
        while (col.hasNext()) { //пока col(есть).hasNext(следующий элемент)
            System.out.println(col.next()); //выведи его
        }
    }
}
