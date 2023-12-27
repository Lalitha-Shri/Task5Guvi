import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter1 {
    public  static void main(String[] a)
    {
        List<String> list=new ArrayList<>();
        list= Arrays.asList("abc","","bc","efg","abcd","","jkl");
        List<String> filterlist=list.stream().filter(name-> !name.isBlank()).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(filterlist);
    }
}
