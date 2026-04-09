import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                uniqueNumbers.add(scanner.nextInt());
            }
        }
        
        int count = 0;
        for (Integer num : uniqueNumbers) {
            System.out.print(num);
            count++;
            if (count < uniqueNumbers.size()) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}