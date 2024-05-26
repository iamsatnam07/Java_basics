package StreamsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args){
        // example1();
        example2();
    }

    public static void example(){
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6));

        Stream<Integer> stream = list.stream();

        stream.forEach((ele)-> {
            System.out.println(ele);
        });
    }

    public static void example1(){
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6));

        Stream<Integer> stream = list.stream();

        stream
            .map((ele)-> ele*ele)
            .forEach((ele)-> {
            System.out.println(ele);
        });
    }
    /*  Printout value we need to terminal operations */
    public static void example2(){
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6));

        Stream<Integer> stream = list.stream();

        stream
            .filter((ele)-> ele%2==0)
            .map((ele)-> ele*ele)  // Intermediate operations
            .forEach((ele)-> {     // Terminal operations
            System.out.println(ele);
        });
    }

}
