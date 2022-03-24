/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.observer.pattern;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author imkor
 */
public class HiringDepartment extends Department implements ISubect{
    private Vector<Employee> employees;
    private Vector<IObserver> observers;
    
    private String notificationMsg;
    private Employee lastModifiedEmployee;
    
    public HiringDepartment(){
        employees = new Vector<Employee>();
        observers = new Vector<IObserver>();
    }
    
    public void hire(Employee e){
        employees.add(e);
        this.notificationMsg = "New Employee is hired, Emplyee name: ";
        this.lastModifiedEmployee = e;
        notifyObservers();
    }
    public void fire(Employee e){
        employees.remove(e);
        this.notificationMsg = "Employee is Fired, Emplyee name: ";
        this.lastModifiedEmployee = e;
        notifyObservers();
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObservdr(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer : observers){
            observer.notifyMe(notificationMsg, lastModifiedEmployee);
        }
    }
}
