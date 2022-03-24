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
public interface ISubect {
    public abstract void registerObserver(IObserver observer);
    public abstract void removeObservdr(IObserver observer);
    public abstract void notifyObservers();
}
