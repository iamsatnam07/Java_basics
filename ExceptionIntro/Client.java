package ExceptionIntro;

import java.io.FileNotFoundException;

public class Client {
    public static void main(String [] agrs){
        Students st = new Students();
        //st.getScore();
        // System.out.println("Score: " + st.getScore());
        //st.file1();
        try{

            System.out.println("File started reading");
            st.file2();
            System.out.println("reading is done");
        }catch(FileNotFoundException ex){
            System.out.println("There is no file");
        }
    }

}
