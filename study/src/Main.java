import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Õı≈Û∑…
 * @version 1.0
 * @date 2023-07-10  0:17
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaaa","bbbbb","cccc");
        list.forEach(System.out::println);

        Collections.sort(list,((o1, o2) -> o2.compareTo(o1)));
        list.forEach(System.out::println);
        List<String> list2 = new ArrayList<>();
        list2 = list.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
        list2.forEach(System.out::println);


        List<Integer> list1 = new ArrayList<>();

        list1 = list.stream().map(s -> s.length()).collect(Collectors.toList());

        list1.forEach(System.out::println);

        int sum = list1.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);

        Map<Integer,List<String>> groups = new HashMap<>();
        for (String s : list){
            if(!groups.containsKey(s.length())){
                groups.put(s.length(),new ArrayList<>());
            }
            groups.get(s.length()).add(s);
        }
        System.out.println(groups);

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        System.out.println(arrayList);
        arrayList.add(1,3);
        System.out.println(arrayList);
    }
}
