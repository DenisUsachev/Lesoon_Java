package Lesson_2;
import java.util.logging.*;
import java.io.File;
public class API {
    public static void main(String[] args){

/*API (Application programming interface) — 
это контракт, который предоставляет программа. 
«Ко мне можно обращаться так и так, я обязуюсь 
делать то и это». 


Что такое API для нас на примерах:

1. Строки
2. Работа с файловой системой
3. Логирование
4. Импорт
5. Xml


Что такое API для нас: строки
Простой пример
Создать строку из 1 млн плюсиков. Как?
*/
        String str = "";
        for (int i = 0; i < 1_000_000; i++) {
             str += "+";
        }  // Запрос будет отрабатываться 41000 ms
        
        //Способ когда посмотрел документацию
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        } //Запрос будет отрабатываться 9 ms

/*Много изменений – String разбираем уже готовый материал
Много преобразований – StringBuilder (если компануем(собираем) материал)*/

//Работа с файловой системой

//File f1 = new File("file.txt"); - относительный путь
//File f2 = new File("/Users/sk/vscode/java_projects/file.txt"); - абсолютный путь

/*Работа с файловой системой. Файлы. Ошибки. 
        
Пример как должно выглядеть:
try {
    //Код, в котором может появиться ошибка
} catch (Exception e) {
    //Обработка, если ошибка случилась
}
finally {
    //Код, который выполнится в любом случае
}
разбор ситуации*/
        String line = "empty";
        try {
            String pathProject = System.getProperty("user.dir"); // путь к текущей папки из которой запускается проект
            String pathFile = pathProject.concat("/file.txt"); // указываем конкретный файл
            File f3 = new File(pathFile); // говорим что нужно создать файл f3 и связать его по текущему пути
            if (file.createNewFile()) {
                System.out.println("file.created");
            }else {
                System.out.println("file.existed");
            }               
        } catch (Exception e) {// если будет что-то не так
            System.out.println("catch"); // получим сообщение Exception
        }
        finally 
        { System.out.println("finally"); } //обязательном порядке показываает как работает этот код
    
//Логирование. Использование. Основы
/*Использование
Logger logger = Logger.getLogger()
Уровни важности
INFO, DEBUG, ERROR, WARNING и др.
Вывод
ConsoleHandler info = new ConsoleHandler();
log.addHandler(info);
Формат вывода: структурированный, абы как*
XMLFormatter, SimpleFormatter 


Пример:    */
        Logger logger = Logger.getLogger(Ex0043.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler (); // все ошибки будут выводиться на консоль
        logger.addHandler(ch);                     //аргумент для логера
        SimpleFormatter sFormat = new SimpleFormatter(); //для строк
        //XMLFormatter xml = new XMLFormatter(); // для сайтов
        ch.setFormatter(sFormat); // для строк
        //ch.setFormatter(xml);   // для сайтов
        logger.log(Level.WARNING, "Тестовое логирование"); // если хотем покащать уроветь опасности
        logger.info("Тестовое логирование"); // если хотим увидеть только ошибку




    }
}


