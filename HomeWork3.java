package homework3;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("#1");
        /* 1. Написать функцию, которая принимает на вход 3 параметра - имя,
        фамилию и возраст и выводит их на экран построчно*/
        first("Oleksandr", "Svyryda", 19);

        System.out.println("#2");
        // *2. Вырезать из строки "Вход запрещен сегодня" второе слово и заменить его на "разрешен".
        System.out.println(exit("Вход запрещен сегодня!"));

        System.out.println("#3");
        // 3. Написать функцию для вычисления длины окружности, принимающую радиус
        double sum = circumference(12);
        System.out.println("Circumference = " + sum);

    }

    //1
    public static void first(String name, String surname, int age) {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
    }

    //2
    public static String exit(String a) {
        return a.replace("запрещен", "разрешен");
    }
    //3
    public static double circumference (double a){
        return 2 * 3.14159 * a;
    }

}
