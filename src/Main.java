import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list=Arrays.asList("aBc","d","ef");
       List<String> mapList= list.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(mapList);


        }
    }
