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
public interface IObserver {
    public abstract void notifyMe(String msg, Employee emp);
}
