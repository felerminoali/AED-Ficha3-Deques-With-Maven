/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.com.osoma.aed;

/**
 *
 * @author feler
 */
public interface Deques {
    
    public int peekLeft();
    
     public int peekRight();
     
     public void insertLeft(int value);
     
     public int removeLeft();
     
     public void insertRight(int value);
     
     public int removeRight();
     
     public Boolean isEmpty();
     
 
     public int size();
}
