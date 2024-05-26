package ExceptionIntro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Students {
    public int getScore(){
        System.out.println("Students score on this subjects");
        int score = 1/0;
        System.out.println("what is score");
        return score;
    }

    public void file1(){
        System.out.println("file staetd reading");
        try{
            File file = new File("file.txt");
        
            FileReader filereader = new FileReader(file);
            System.out.println("File reading done");
        }catch(FileNotFoundException ex){
            System.out.println("there is no file");
        }

    }

    public void file2() throws FileNotFoundException{
        System.out.println("file staetd reading");
    
        File file = new File("file.txt");
        FileReader filereader = new FileReader(file);

        System.out.println("File reading done");
    }
}
