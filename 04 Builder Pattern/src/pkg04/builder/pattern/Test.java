/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.builder.pattern;

/**
 *
 * @author imkor
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book book1 = new Book.BookBuilder("1221", "IoT").authorName("Islam Kortam").build();
        Book book2 = new Book.BookBuilder("12123", "Embedded").price(15.7)
                .description("Embedded Book").build();
        
        System.out.println(book1);
        System.out.println(book2);
    }
    
}
