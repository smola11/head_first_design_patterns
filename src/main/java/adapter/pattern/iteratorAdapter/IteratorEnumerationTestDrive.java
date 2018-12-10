package adapter.pattern.iteratorAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class IteratorEnumerationTestDrive {

    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>(Arrays.asList(args));
        Enumeration<?> enumeration= new IteratorEnumerationAdapter(list.iterator());
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
