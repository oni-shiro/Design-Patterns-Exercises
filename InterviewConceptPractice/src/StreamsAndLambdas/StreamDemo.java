package StreamsAndLambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(2);
        ls.add(6);
        ls.add(5);
        ls.add(11);
        ls.add(9);


//        List<Integer> newLs = ls.stream().map(i -> i*i).collect(Collectors.toList());
        //sorts the results
        List<Integer> newLs = ls.stream().map(i -> i*i).sorted().collect(Collectors.toList());
        System.out.println(newLs);
    }



}
