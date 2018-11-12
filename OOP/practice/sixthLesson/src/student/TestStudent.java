package student;

/*Лаврентьева Ирина ИКБО-13-17 Вариант 1, быстрая сортировка*/

import java.util.Scanner;

public class TestStudent {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = enterNum();
        Student[] students = new Student[n];
        enterArray(students);
        System.out.println("Введенный массив:");
        showArray(students);
        quickSort(students, 0, students.length-1);
        System.out.println("Отсортированный массив:");
        showArray(students);
    }

    public static int enterNum() {
        int n;
        System.out.println("Введите количество студентов. 1<n<=100");
        n = in.nextInt();
        if ((n > 1) & (n <= 100))
            return n;
        else {
            System.out.println("Количество введено неверно. Попробуйте еще раз");
            return enterNum();

        }
    }

    public static Student createStudent(){
        Student student;
        int age, iDNumber;
        String surname;
        System.out.println("Введите фамилию");
        in.nextLine();
        surname = in.nextLine();
        System.out.println("Введите возраст");
        age = in.nextInt();
        System.out.println("Введите ID");
        iDNumber = in.nextInt();
        student = new Student(surname, age, iDNumber);
        System.out.println();
        return student;
    }

    //Функция ввода массива
    public static void enterArray(Student students[]) {

        for (int i = 0; i < students.length; i++) {
            System.out.println("Введите информацию для "+(i+1)+"-го студента");
            students[i] = createStudent();
        }
        System.out.println();
    }

    //Функция вывода массива на экран
    public static void showArray(Student students[]) {
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].getSurname() + " "+students[i].getAge()+" "+students[i].getiDNumber());
            System.out.println();
        }
        System.out.println();
    }

    public static void quickSort(Student students[], int low, int high) {
        if (students.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int opora = students[middle].getiDNumber();
        int i = low, j = high;
        while (i <= j) {
            while (students[i].getiDNumber() < opora) {
                i++;
            }

            while (students[j].getiDNumber() > opora) {
                j--;
            }
            if (i <= j) {//меняем местами
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(students, low, j);

        if (high > i)
            quickSort(students, i, high);
    }

}
