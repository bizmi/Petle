package task2;

import jdk.dynalink.linker.GuardedInvocationTransformer;

import javax.print.DocFlavor;
import java.io.LineNumberInputStream;
import java.io.StringBufferInputStream;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static javafx.scene.input.KeyCode.DIGIT0;
import static javafx.scene.input.KeyCode.T;

public class Mab {
    public static void main(String[] args) {


        IntStream.range(0 ,100)
                .filter(s->s%2 !=0)
                .mapToObj(String::valueOf)
                .forEach(System.out::println);



        }










        }



