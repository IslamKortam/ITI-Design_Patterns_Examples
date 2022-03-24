/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05;
/**
 *
 * @author imkor
 */
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PdfReader reader = new PdfReader();
        reader.read("file1", "PDF");
        reader.read("file2", "Doc");
        reader.read("file3", "Docx");
    }
}
