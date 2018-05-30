package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Lamba {
    public static void main(String[] args) {




    }
    public static void showMe(Function<String, String >nameAtor, String name){
        System.out.println(nameAtor.apply(name));

    }

}
