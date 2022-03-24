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
public class FileReaderAdapter implements IRead{
    WordFileReader wordReader;
    public FileReaderAdapter(String fileFormat){
        fileFormat = fileFormat.toLowerCase();
        switch(fileFormat){
            case "doc":
                wordReader = new DocReader();
                break;
            case "docx":
                wordReader = new DocxReader();
                break;
            default:
                System.out.println("Not a supported Format");
                break;
        }
    }

    @Override
    public void read(String fileName, String fileFormat) {
        fileFormat = fileFormat.toLowerCase();
        switch(fileFormat){
            case "doc":
                wordReader.readDoc(fileName);
                break;
            case "docx":
                wordReader.readDocx(fileName);
                break;
            default:
                System.out.println("Not a supported Format");
                break;
        }
    }
    
}
