package Lesson_5;
import java.util.*;
public class HashMap_FUN {
   public static void main(String[] args) {

      //HashMap
      
      Map<Integer, String> db = new HashMap<>(); //Map - ключевой интерфейс, <Ключ, значение> 
      db.put(1, "один"); System.out.println(db);
      db.put(2, "два"); System.out.println(db);
      db.put(3, "три"); System.out.println(db);
      db.put(31, "три один"); System.out.println(db);
      db.put(13, "один три"); System.out.println(db);
      db.put(null, "!null"); System.out.println(db); //null - пустая ссылка
      db.put(null, null); System.out.println(db);
/*
put(K,V) – добавить пару если или изменить значение,если ключ имеется.
putIfAbsent(K,V) – произвести добавление если ключ не найден.
get(K) - получение значения по указанному ключу.
remove(K) – удаляет пару по указанному ключу.
containsValue(V) – проверка наличия значения.
containsKey(V) – проверка наличия ключа.
keySet() – возвращает множество ключей.
values() – возвращает набор значений.
 */
      //Работа с парами
      db.putIfAbsent(1, "один");
      db.put(2, "два");
      db.put(3, "три");
      System.out.println(db);
      for (var item : db.entrySet()) { // entrySet - получить итератор, у которого есть возможность считать ключ и значение 
         System.out.printf("[%d: %s]\n", item.getKey(), item.getValue()); //getKey- получить ключ, getValue-получить значние
      }

      Map<Integer,String> map1 = new HashMap<>();
      Map<Integer,String> map2 = new HashMap<>(9);
      Map<Integer,String> map3 = new HashMap<>(9, 1.0f); // 9 элементов на добавлени и удвоит количество элементов вдвое при 100 % занятости 
/*
Хэш-функции и хэш-таблицы
Прямое связывание (хэширование с цепочками)
Хэширование с открытой адресацией
Теория графов:
● деревья построенные на списках
● бинарные деревья
● сбалансированные деревья
● *алгоритм балансировки дерева
● ** красно-черные деревья, деревья поиска
 */
   }

   // !!!TreeMap!!!
   
   {
   TreeMap<Integer,String> tMap = new TreeMap<>();
   tMap.put(1,"один"); System.out.println(tMap);
   // {1=один}
   tMap.put(6,"шесть"); System.out.println(tMap);
   // {1=один, 6=шесть}
   tMap.put(4,"четыре"); System.out.println(tMap);
   // {1=один, 4=четыре, 6=шесть}
   tMap.put(3,"три"); System.out.println(tMap);
   // {1=один, 3=три, 4=четыре, 6=шесть}
   tMap.put(2,"два"); System.out.println(tMap);
   // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}

/*

Методы, на которые нужно обратить внимание
   put(K,V) – добавить пару если или изменить значение,если ключ имеется.
   get(K) - получение значения по указанному ключу.
   remove(K) – удаляет пару по указанному ключу.
   descendingMap() - как получить только сами ключи 
   descendingKeySet(V) - полечение значений в обратном порядке
   tailMap() - больше чем
   headMap() - меньше чем
   lastEntry() - 
   firstEntry() -


   !!!LinkedHashMap!!!
   «Старший брат» коллекции HashMap, который все помнит…
   Помнит порядок добавления элементов ➜ более медлительный

   !!!HashTable!!!
   «Устаревший брат» коллекции HashMap, 
   который не знает про null
 */
   }
}

