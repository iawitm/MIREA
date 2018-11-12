package deque;

/*Лаврентьева Ирина ИКБО-13-17*/

import java.util.*;

public class DequeTest {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        ArrayDeque<Integer> firstDeque  = new ArrayDeque<Integer>();
        ArrayDeque<Integer> secondDeque = new ArrayDeque<Integer>();
        //int firstDeckElements[] = {2,4,6,8,0};
        //int secondDeckElements[] = {1,3,5,7,9};
        int card;
        System.out.println("Введите карты из первой колоды");
        for (int i=0;i<5;i++){
            card = in.nextInt();
            firstDeque.add(card);
        }
        System.out.println("Введите карты из второй колоды");
        for (int i = 0; i<5; i++){
            card = in.nextInt();
            secondDeque.add(card);
        }
        int counter = 0;
        while((!firstDeque.isEmpty())&(!secondDeque.isEmpty())&(counter!=106)){
            if ((firstDeque.getFirst() == 0)&(secondDeque.getFirst() == 9)){
                firstDeque.addLast(secondDeque.getFirst());
                firstDeque.addLast(firstDeque.getFirst());
            }
            if ((firstDeque.getFirst() == 9)&(secondDeque.getFirst() == 0)){
                secondDeque.addLast(firstDeque.getFirst());
                secondDeque.addLast(secondDeque.getFirst());
            }
            if ((firstDeque.getFirst() != 0)&(secondDeque.getFirst() != 9)&&(firstDeque.getFirst() != 9)&(secondDeque.getFirst() != 0)) {
                if (firstDeque.getFirst() > secondDeque.getFirst()) {
                    firstDeque.addLast(secondDeque.getFirst());
                    firstDeque.addLast(firstDeque.getFirst());
                }
                if (firstDeque.getFirst() < secondDeque.getFirst()) {
                    secondDeque.addLast(firstDeque.getFirst());
                    secondDeque.addLast(secondDeque.getFirst());
                }
            }
            firstDeque.removeFirst();
            secondDeque.removeFirst();
            counter++;
        }

        if (counter!=106) {
            if (!firstDeque.isEmpty())
                System.out.println("first " + counter);
            else
                System.out.println("second " + counter);
        }
        else{
            System.out.println("botva");
        }
    }

}
