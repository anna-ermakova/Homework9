public class Main {
    public static void main(String[] args) {

        //Task 1

        System.out.println("Задание 1.");
        /*Напишите четыре строки:
    первая с именем firstName — для хранения имени;
    вторая с именем middleName — для хранения отчества;
    третья с именем lastName — для хранения фамилии;
    четвертая с именем fullName — для хранения Ф.И.О. сотрудника в формате "Фамилия Имя Отчество".
    Выведите в консоль фразу: “ФИО сотрудника — ….”
    В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.*/

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName + ".";
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();

        //Task 2

        System.out.println("Задание 2.");
        /* Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны Ф.И.О. сотрудников,
    полностью написанные заглавными буквами (верхним регистром).
    Напишите программу, которая изменит написание Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
    В качестве строки с исходными данными используйте строку fullName.
    Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …” */

        String fullNameForReporting = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета —" + fullNameForReporting);
        System.out.println();

        //Task 3

        System.out.println("Задание 3.");
        /* Система, в которой мы работаем, не принимает символ “ё”.
    Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
    В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
    Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
    Может потребоваться метод split() и метод contains().*/

        String fullName2 = "Иванов Семён Семёнович";
        /* String[] words = fullName2.split(" ");
        for (String i : words) {
            if (i.contains("ё")) {
                System.out.print("Данные ФИО сотрудника —  " + i.replace('ё', 'е'));
            } else {
                System.out.print("Данные ФИО сотрудника — " + i);
            }
        }*/

        System.out.print("Данные ФИО сотрудника — " + fullName2.replace("ё", "е"));
    }
}