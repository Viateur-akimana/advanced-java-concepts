import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<Integer> districts= new ArrayList<>();
        districts.add(56);
        districts.add(67);
        districts.add(68);
        districts.add(0,9);
//        Iterator i = districts.iterator();
//     while (i.hasNext()) {
//         System.out.println(i.next());
//     }
for (Integer dis:districts){
    System.out.println(dis);
}
    }
}