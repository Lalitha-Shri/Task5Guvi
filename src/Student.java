import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    public  static void main(String[] a)
    {
        List<String> list=new ArrayList<>();
        list= Arrays.asList("Anand","bobby","anadhi","catherine");
        List<String> filteredlist=list.stream().filter(name->name.charAt(0)=='a' || name.charAt(0)=='A').collect(Collectors.toList());
        System.out.println(filteredlist);
    }
}
