/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.com.osoma.aed.array;

import mz.com.osoma.aed.Deques;

/**
 *
 * @author feler
 */
public class DequeArray implements Deques {

    private int maxSize;
    private int[] arr;
    private int nItems;

    private int left;
    private int right;

    public DequeArray(int s) {
        maxSize = s;
        arr = new int[maxSize];
        nItems = 0;

        left = 1;
        right = 0;
    }

    @Override
    public int peekLeft() {
        return arr[left];
    }

    @Override
    public int peekRight() {
        return arr[right];
    }

    @Override
    public void insertLeft(int value) {
        if (!isFull()) {
            left--;
            if (left < 0) {
                left = maxSize - 1;
            }
            arr[left] = value;
            nItems++;
        } else {
            System.out.println("The Queue is full!");
        }
    }

    @Override
    public int removeLeft() {
        if (!isEmpty()) {
            int temp = arr[left];
            left++;
            if (left >= maxSize) {
                left = 0;
            }
            nItems--;
            return temp;
        } else {
            System.out.println("The Queue is empty!");
            return -1;
        }
    }

    @Override
    public void insertRight(int value) {
        if (!isFull()) {
            right++;
            if (right >= maxSize) {
                right = 0;
            }
            arr[right] = value;
            nItems++;
        } else {
            System.out.println("The Queue is full!");
        }
    }

    public int removeRight() {
        if (!isEmpty()) {
            int temp = arr[right];
            right--;
            if (right < 0) {
                right = maxSize - 1;
            }
            nItems--;
            return temp;
        } else {
            System.out.println("The Queue is empty!");
            return -1;
        }
    }

    @Override
    public Boolean isEmpty() {
        if (nItems == 0) {
            return true;
        } else {
            return false;
        }
    }

    
    public Boolean isFull() {
        if (nItems == maxSize) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return nItems;
    }

    @Override
    public String toString() {

        // Verificando se a Lista está vazia
        if (this.nItems == 0) {
            return "()";
        }
        StringBuilder builder = new StringBuilder("(");
        int index = left;
        // Percorrendo até o penúltimo elemento.
        for (int i = 0; i < this.nItems - 1; i++) {
            if (index >= maxSize) {
                index = 0;
            }

            builder.append(arr[index]);
            builder.append(", ");
            index++;
        }
        // último elemento
        builder.append(arr[index]);
        builder.append(")");
        return builder.toString();

    }

    public static void main(String[] args) {

        DequeArray deque = new DequeArray(5);

        deque.insertRight(5);
        System.out.println(deque);
        deque.insertLeft(3);
        System.out.println(deque);
        deque.insertLeft(7);
        System.out.println(deque);
        System.out.println(deque.peekLeft());
        System.out.println(deque.removeRight());
        System.out.println(deque.size());
        System.out.println(deque.removeRight());
        System.out.println(deque.removeLeft());
        System.out.println(deque);
        deque.insertLeft(6);
        System.out.println(deque);
        System.out.println(deque.peekRight());
        deque.insertLeft(8);
        System.out.println(deque);

    }

}
