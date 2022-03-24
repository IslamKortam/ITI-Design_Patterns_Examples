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
public class PdfReader implements IRead, IReadPDF {

    @Override
    public void read(String fileName, String fileFormat){
        fileFormat = fileFormat.toLowerCase();
        switch(fileFormat){
            case "pdf":
                readPDF(fileName);
                break;
            case "doc":
            case "docx":
                FileReaderAdapter adapter = new FileReaderAdapter(fileFormat);
                adapter.read(fileName, fileFormat);
                break;
            default:
                System.out.println("Not a supported Format");
                break;
        }
    }

    @Override
    public void readPDF(String fileName) {
        System.out.println("Reading file: " + fileName + " in PDF Format");
    }
    
}
