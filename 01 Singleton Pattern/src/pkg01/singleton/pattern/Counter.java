/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.singleton.pattern;

/**
 *
 * @author imkor
 */
public class Counter {
    //Lazy Intialization Implementation
    private static Counter instance = new Counter();
    
    private int count;
    
    //Private Constructor
    private Counter(){
        count = 0;
    }
    
    public void increment(){
        count++;
    }
    
    public void decrement(){
        count--;
    }
    
    public int getCount(){
        return count;
    }
    
    public static Counter getInstance(){
        return instance;
    }
}
