package arraylist;

/*
    Лаврентьева Ирина ИКБО-13-17
    Вариант 1
*/

import java.util.*;

public class TestArrayList {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        menu(animals);

    }

    public static void menu(ArrayList<String> animals){
        int op;
        System.out.println("Что вы хотите сделать?\n1 - добавить животных\n2 - вывести список животных\n3 - удалить животное\n0 - завершить программу");
        op = in.nextInt();
        switch(op){
            case 1:
                addAnimals(animals);
                break;
            case 2:
                if(!animals.isEmpty())
                    showAnimals(animals);
                else
                    System.out.println("Список пуст");
                menu(animals);
                break;
            case 3:
                removeAnimal(animals);
                break;
            case 0:
                break;
            default: break;

        }

    }

    public static void addAnimals(ArrayList<String> animals) {
        String animal;
        int amount;
        System.out.println("Как много животных вы хотите добавить?");
        amount = in.nextInt();
        in.nextLine();
        for (int i = 0; i < amount; i++) {
            System.out.println("Введите название животного");
            animal = in.nextLine();
            animals.add(animal);
        }
        menu(animals);
    }

    public static void showAnimals(ArrayList<String> animals){
        for (String animal: animals){
            System.out.println(animal);
        }
        menu(animals);
    }

    public static void removeAnimal(ArrayList<String> animals){
        int op;
        System.out.println("Как вы хотите удалить элемент? 1 - по индексу, 2 - по имени, 3 - выйти в меню");
        op = in.nextInt();
        switch(op){
            case 1:
                int index;
                System.out.println("Введите индекс элемента");
                index = in.nextInt();
                animals.remove(index);
                removeAnimal(animals);
                break;
            case 2:
                String name;
                System.out.println("Введите название животного");
                in.nextLine();
                name = in.nextLine();
                if(animals.contains(name)){
                    animals.remove(name);
                    removeAnimal(animals);
                }
                else
                {
                    System.out.println("Животное не найдено");
                    removeAnimal(animals);
                }
                break;
            case 3:
                menu(animals);
                break;
            default: break;
        }
    }
}
