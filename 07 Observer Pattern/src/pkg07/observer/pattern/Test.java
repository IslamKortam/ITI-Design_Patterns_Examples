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
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Department hr = new HRDepartment();
        Department tech = new TechnicalDepartment();
        
        HiringDepartment hiringDepartment = new HiringDepartment();
        
        hiringDepartment.registerObserver((IObserver) hr);
        hiringDepartment.registerObserver((IObserver) tech);
        
        Employee e1 = new Employee("Islam Kortam", 1000);
        Employee e2 = new Employee("Alaa Mahmoud", 2000);
        
        hiringDepartment.hire(e1);
        hiringDepartment.hire(e2);
        hiringDepartment.fire(e1);
    }
    
}
