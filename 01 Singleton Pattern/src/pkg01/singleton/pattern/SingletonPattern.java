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
public class SingletonPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Counter c1 = Counter.getInstance();
        Counter c2 = Counter.getInstance();
        
        c1.increment();
        c2.increment();
        
        System.out.println("C1 count: " + c1.getCount());
        System.out.println("C2 count: " + c2.getCount());
        
        System.out.println("(C1 == c2)?: " + (c1 == c2) );
    }
    
}
