/* 1. Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список. */

import java.util.LinkedList;

public class task4_1 {
    public static void main(String[] args) {
        LinkedList<String> multipleElem = new LinkedList<String>();
        multipleElem.add("Hello World!");
        multipleElem.add("My name is Aleks");
        multipleElem.add("I am a GeekBrains student");
        System.out.println("Элементы до перестановки: "+ multipleElem);
        multipleElem = reverseLinkedList(multipleElem);
        System.out.println("Элементы после перестановки: "+ multipleElem);
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> list) {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = list.size() - 1; i >= 0; i--) {
            revLinkedList.add(list.get(i));
        }
        return revLinkedList;
    }
}