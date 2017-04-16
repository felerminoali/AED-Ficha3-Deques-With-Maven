/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.com.osoma.aed.linkedlist;

import mz.com.osoma.aed.Deques;
import mz.com.osoma.aed.array.DequeArray;

/**
 *
 * @author feler
 */
public class DequeLinkedList implements Deques{
    
    private DoublyLinked lista;
    
    public DequeLinkedList(){
        lista = new DoublyLinked();
    }

    @Override
    public int peekLeft() {
        return lista.pega(0);
    }

    @Override
    public int peekRight() {
        return lista.pega(lista.tamanho()-1);
    }

    @Override
    public void insertLeft(int value) {
        lista.adicionaNoComeco(value);
    }

    @Override
    public int removeLeft() {
        return lista.removeDoComeco();
    }

    @Override
    public void insertRight(int value) {
        lista.adicionaDoFim(value);
    }

    @Override
    public int removeRight() {
        return lista.removeDoFim();
    }

    @Override
    public Boolean isEmpty() {
        return lista.isEmpty();
    }


    @Override
    public int size() {
        return lista.tamanho();
    }
    
    @Override
    public String toString(){
        return lista.toString();
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
