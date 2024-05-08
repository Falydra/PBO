import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Hello");
        strings.add("World");
        strings.add("!");
        strings.remove("Hello");
        for (String s : strings){
            System.out.println(s);
        }
    }
}