import java.util.Scanner;

public class Main {
    static Main r = new Main();
    static Scanner n = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("""
                ЛАБОРАТОРНАЯ РАБОТА №2
                ВЫПОЛНИЛ - КУЛАКОВ МАКСИМ ИТ-6 (ПМИ-10/2023)
                ВАРИАНТ 2
                
                Задания 1,2 - задания 3,4 темы 1
                Задания 3 - задания 4 темы 2
                Задания 4 - задания 4 темы 3
                Задания 5 - задания 4 темы 4
                Задания 6 - задания 4 темы 5
                Что-бы выйти - введите 0
                
                Чтобы просмотреть интересующее вас задание - введите его номер.
                """);
        r.choise();
    }

    public void choise() {
        while(true){
            System.out.println("\nВведите число для выбора дальнейшего действия:");
            int choisenum = n.nextInt();
            if (choisenum == 0) {
                System.out.println("\nРабота программы завершена!");
                break;
            }
            else if ( 0 < choisenum && choisenum < 21){
                System.out.println(tasks(choisenum));
            }
            else{
                System.out.print("\nВведите число в указанном диапазоне");
            }
        }
    }

    public String tasks(int args) {

        switch (args) {

            case 1:
                System.out.println("""
                        Текст задания 3 темы 1
                        
                        Имена.
                        Создайте сущность Имя, которая описывается тремя параметрами: Фамилия, Личное имя,
                        Отчество. Имя может быть приведено к строковому виду, включающему традиционное
                        представление всех трех параметров: Фамилия Имя Отчество (например “Иванов Иван
                        Иванович”). Необходимо предусмотреть возможность того, что какой-либо из параметров может
                        быть не задан, и в этом случае он не учитывается при приведении к текстовому виду.
                        Необходимо создать следующие имена:
                         Клеопатра
                         Пушкин Александр Сергеевич
                         Маяковский Владимир
                        Обратите внимание, что при выводе на экран, не заданные параметры никак не участвуют в
                        образовании строки.
                        
                        """);
                System.out.println("Результат работы: ");
                CreatePersons();
                break;

            case 2:
                System.out.println("""
                        Текст задания 4 темы 1
                        
                        Время.
                        Создайте сущность Время, которое будет описывать текущее время суток в 24-х часовом
                        формате. Время описывается числом секунд, прошедшим с начала суток. Время может быть
                        приведено к текстовой форме следующего формата: “ЧЧ:ММ:СС”. Например,если время задано как
                        12000, то текстовая форма будет “3:20:00”. Если общее время превышает 24 часа, то отображаться
                        в текстовом виде должно только то время, которое прошло с начала последних суток, например
                        91800, это не 25:30:00, а 1:30:00.
                        Необходимо создать и вывести на экран текстовую форму для следующих вариантов времени:
                         10 секунд
                         10000 секунд
                         100000 секунд
                        
                        """);
                System.out.println("Введите время в секундах");
                int sec = n.nextInt();
                Time NewTime1 = new Time(sec);
                System.out.println("Результат работы: ");
                System.out.print(NewTime1);
                break;

            case 3:
                System.out.println("""
                        Текст задания 4 темы 2
                        
                        Сотрудники и отделы.
                        Создайте сущность Сотрудник, которая описывается именем (в строковой форме) и отделом, в
                        котором сотрудник работает, причем у каждого отдела есть название и начальник, который
                        также является Сотрудником. Сотрудник может быть приведен к текстовой форме вида: “Имя
                        работает в отделе Название, начальник которого Имя”. В случае если сотрудник является
                        руководителем отдела, то текстовая форма должна быть “Имя начальник отдела Название”.
                        Необходимо выполнить следующие задачи:
                        1. Создать Сотрудников Петрова, Козлова, Сидорова работающих в отделе IT.
                        2. Сделать Козлова начальником IT отдела.
                        3. Вывести на экран текстовое представление всех трех Сотрудников (у всех троих должен
                        оказаться один и тот же отдел и начальник).
                        
                        """);
                DepWork();
                System.out.println("Результат работы: ");
                break;

            case 4:
                System.out.println("""
                        Текст задания 4 темы 3
                        
                        Сотрудники и отделы.
                        Измените решение, полученное в задаче 2.4 таким образом, чтобы имея ссылку на сотрудника,
                        можно было бы узнать список всех сотрудников этого отдела.
                        
                        """);

                Worker Rabotnik = DepWorkMod1();
                Departament Dep = Rabotnik.getDep();
                Worker[] List = Dep.getWorkers();
                for (int i = 0; i < List.length; i++) {
                    Worker rabochiy = List[i];
                    System.out.print("Работник " + rabochiy.getName() + " работает в " + Dep.getDepName() + " отделе" + "\n");
                }
                break;

            case 5:
                System.out.println("""
                        Текст задания 4 темы 4
                        
                        Создаем Время.
                        Измените сущность Время из задачи 1.4. Новые требования включают:
                         Время можно создать указав количество секунд с начала суток
                         Время можно создать указав количество часов, минут, секунд текущего времени.
                         Гарантируйте, что операция присвоения в инициализаторах будет использована не более
                        одного раза
                        Необходимо создать и вывести на экран текстовую форму для следующих вариантов времени:
                        1. 10000 секунд
                        2. 2 часа, 3 минуты, 5 секунд
                        
                        """);

                System.out.print("Выберите режим работы. 1 - ввести секунды, 2 - ввести часы, минуты, секунды: ");
                int num = n.nextInt();
                if (num == 1){
                    System.out.println("Введите время в секундах");
                    int sec2 = n.nextInt();
                    Time NewTime2 = new Time(sec2);
                    System.out.println("Результат работы: ");
                    System.out.print(NewTime2);
                }
                else if (num == 2){
                    System.out.println("Введите часы: ");
                    int hrs = n.nextInt();
                    System.out.println("Введите минуты: ");
                    int min = n.nextInt();
                    System.out.println("Введите секунды: ");
                    int sec2 = n.nextInt();
                    Time NewTime2 = new Time(hrs, min, sec2);
                    System.out.print(NewTime2);
                }
                else {
                    System.out.println("Вы ввели неуказанное в режимах число");
                }
                break;

            case 6:
                System.out.println("""
                        Текст задания 4 темы 5
                        
                        Сколько сейчас времени?
                        Измените сущность Время из задачи 4.4.Добавьте ей возможность возвращать следующие сведения:
                         Какой сейчас час (целое число)
                         Сколько минут прошло с начала текущего часа (целое число)
                         Сколько секунд прошло с начала текущей минуты (целое число)
                        Необходимо выполнить следующие задачи:
                        1. Вывести на экран сколько часов соответствуют времени 34056
                        2. Вывести на экран сколько минут соответствуют времени 4532
                        3. Вывести на экран сколько секунд соответствуют времени 123
                        
                        """);
                Time NewTime3 = task4();
                System.out.println("Выберите, что хотите узнать: 1 - часы, 2 - минуты, 3 - секунды: ");
                int num1 = n.nextInt();
                if (num1 == 1) {
                    System.out.print(NewTime3.getHours());
                }
                else if (num1 == 2) {
                    System.out.print(NewTime3.getMinutes());
                }
                else if (num1 == 3) {
                    System.out.print(NewTime3.getSeconds());
                }
                else {
                    System.out.print("Вы ввели непредусмотренное число");
                }
                break;
        }
        return "";
    }

        public void CreatePersons() {

            PersonName person1 = new PersonName("Клеопатра");
            PersonName person2 = new PersonName("Александр", "Пушкин", "Сергеевич");
            PersonName person3 = new PersonName("Владимир", "Маяковский");
            System.out.print(person1);
            System.out.print(person2);
            System.out.print(person3);
        }

        public void DepWork() {

            Departament kontora = new Departament("IT");
            Worker Biba = new Worker("Козлов", kontora);
            Worker Boba = new Worker("Петров", kontora);
            Worker Buba = new Worker("Сидоров",kontora);
            Biba.setDepLead(true);
            System.out.print(Biba);
            System.out.print(Boba);
            System.out.print(Buba);
        }

    public Worker DepWorkMod1(){
        Worker[] ListWorkers = new Worker[3];
        Departament kontora = new Departament("IT");
        Worker Biba = new Worker("Козлов", kontora);
        ListWorkers[0] = Biba;
        Worker Boba = new Worker("Петров", kontora);
        ListWorkers[1] = Boba;
        Worker Buba = new Worker("Сидоров",kontora);
        ListWorkers[2] = Buba;
        kontora.setWorkers(ListWorkers);
        return Biba;
    }

    public Time task4() {
        System.out.print("Выберите режим работы. 1 - ввести секунды, 2 - ввести часы, минуты, секунды: ");
        int num = n.nextInt();
        if (num == 1){
            System.out.println("Введите время в секундах");
            int sec2 = n.nextInt();
            return new Time(sec2);
        }
        else if (num == 2){
            System.out.println("Введите часы: ");
            int hrs = n.nextInt();
            System.out.println("Введите минуты: ");
            int min = n.nextInt();
            System.out.println("Введите секунды: ");
            int sec2 = n.nextInt();
            return new Time(hrs, min, sec2);
        }
        else {
            System.out.println("Вы ввели неуказанное в режимах число");
            return null;
        }
    }
}