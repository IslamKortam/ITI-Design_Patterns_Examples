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
public class Book {
    private String ISBN;
    private String title;
    private String authorName;
    private int chaptersCount;
    private int pagesCount;
    private double price;
    private String description;

    public Book(BookBuilder builder) {
        this.ISBN = builder.ISBN;
        this.title = builder.title;
        this.authorName = builder.authorName;
        this.chaptersCount = builder.chaptersCount;
        this.pagesCount = builder.pagesCount;
        this.price = builder.price;
        this.description = builder.description;
    }
    
    @Override
    public String toString(){
        String book = "{ISBN:" + ISBN + ",title:" + title + ",authorName:" + authorName + ",chaptersCount:" + chaptersCount + ",pagesCount:" + pagesCount + ",price:" + price + ",description:" + description + "}";
        return book;
    }
    
    public static class BookBuilder{
        private String ISBN;
        private String title;
        private String authorName;
        private int chaptersCount;
        private int pagesCount;
        private double price;
        private String description; 

        public BookBuilder(String ISBN, String title) {
            this.ISBN = ISBN;
            this.title = title;
        }

        public BookBuilder authorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        public BookBuilder chaptersCount(int chaptersCount) {
            this.chaptersCount = chaptersCount;
            return this;
        }

        public BookBuilder pagesCount(int pagesCount) {
            this.pagesCount = pagesCount;
            return this;
        }

        public BookBuilder price(double price) {
            this.price = price;
            return this;
        }

        public BookBuilder description(String description) {
            this.description = description;
            return this;
        }
    
        public Book build(){
            return new Book(this);
        }
    
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getChaptersCount() {
        return chaptersCount;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
    
    
}
