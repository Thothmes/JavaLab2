import java.util.Scanner;

public class Main {
    static Main r = new Main();
    static Scanner n = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("""
                ЛАБОРАТОРНАЯ РАБОТА №2
                ВЫПОЛНИЛ - КУЛАКОВ МАКСИМ ИТ-6 (ПМИ-10/2023)
                ВАРИАНТ 7
                
                Задания 1,2 - задания 3,4 темы 1
                Задание 3 - задание 4 темы 2
                Задание 4 - задание 4 темы 3
                Задание 5 - задание 4 темы 4
                Задание 6 - задание 4 темы 5
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
            else if ( 0 < choisenum && choisenum < 6){
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
                System.out.print(changeTime(sec));
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
                break;

            case 4:
                System.out.println("""
                        Текст задания 4 темы 3
                        
                        Сотрудники и отделы.
                        Измените решение, полученное в задаче 2.4 таким образом, чтобы имея ссылку на сотрудника,
                        можно было бы узнать список всех сотрудников этого отдела.
                        
                        """);

                Worker Rabotnik = DepWorkMod1();
                Departament Dep =  Rabotnik.Dep;
                for (int i = 0; i < Dep.Workers.length; i++) {
                    System.out.print("Работник " + Dep.Workers[i].Name + " работает в " + Dep.DepName + " отделе" + "\n");
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
                    System.out.println("Введите время в секундах: ");
                    int sec2 = n.nextInt();
                    System.out.print(changeTime(sec2));
                }
                else if (num == 2){
                    System.out.println("Введите часы: ");
                    int hrs = n.nextInt();
                    System.out.println("Введите минуты: ");
                    int min = n.nextInt();
                    System.out.println("Введите секунды: ");
                    int secunds = n.nextInt();
                    if ((hrs < 0 || hrs >= 24 || min < 0 || min >= 60 || secunds < 0 || secunds >= 60)) {
                        System.out.print("Данные некорректны");
                    }
                    else {
                        Time NewTime = new Time(hrs, min, secunds);
                        System.out.print(NewTime);
                    }
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
                System.out.println("Введите время в секундах: ");
                int sec3 = n.nextInt();
                Time NewTime = changeTime(sec3);
                System.out.println("Выберите, что хотите узнать: 1 - часы, 2 - минуты, 3 - секунды: ");
                int num1 = n.nextInt();
                if (num1 == 1) {
                    System.out.print(NewTime.getHours());
                }
                else if (num1 == 2) {
                    System.out.print(NewTime.getMinutes());
                }
                else if (num1 == 3) {
                    System.out.print(NewTime.getSeconds());
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

        public Time changeTime(int x) {
            int sec = x % 60;
            /*System.out.println(sec);*/
            x = ((x - sec) / 60);
            int min = x % 60;
            /*System.out.println(min);*/
            x = ((x - min) / 60);
            int hrs = x % 24;
            /*System.out.println(hrs);*/
            Time NewTime = new Time(hrs, min, sec);
            return NewTime;
        }

        public void DepWork() {

            Departament kontora = new Departament("IT");
            Worker Biba = new Worker("Козлов", kontora);
            Worker Boba = new Worker("Петров", kontora);
            Worker Buba = new Worker("Сидоров",kontora);
            kontora.DepLead = Biba.Name;
            PrintInfo(Biba, kontora);
            PrintInfo(Boba, kontora);
            PrintInfo(Buba, kontora);
        }

    public void PrintInfo(Worker X, Departament Y) {

        if (X.Name != Y.DepLead) {
            System.out.print(X.Name + " работает в отделе " + Y.DepName + ", начальник которого " + Y.DepLead + "\n");
        }

        if (X.Name == Y.DepLead) {
            System.out.print(X.Name + " начальник отдела " + Y.DepName + "\n");
        }
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
        kontora.Workers = ListWorkers;
        return Biba;
    }
}
