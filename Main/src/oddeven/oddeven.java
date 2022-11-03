package oddeven;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class oddeven{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.
                              asList(5,63,88,56,33,67,92, 99);
        List<Integer> oddNumbers = numbers.stream().
                                    filter(o -> o % 2 != 0).
                                     collect(Collectors.toList());
        System.out.println("Odd number are::"+oddNumbers);
        List<Integer> number = Arrays.
                asList(5,63,88,56,33,67,92, 99);
List<Integer> evenNumbers = numbers.stream().
                      filter(o -> o % 2 == 0).
                       collect(Collectors.toList());
System.out.println("Even no are::"+evenNumbers);
    }
}