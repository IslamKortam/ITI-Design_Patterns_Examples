/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.observer.pattern;

/**
 *
 * @author imkor
 */
public class TechnicalDepartment extends Department implements IObserver{
    @Override
    public void notifyMe(String msg, Employee emp) {
        System.out.println("Technical Department Notfied of with msg: ");
        System.out.println(msg + emp.getName());
        System.out.println("____________________");
    }
    
}
