import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            input.add(scanner.nextLine());
        }
        for(int i = 0; i < input.size(); i++) {
            System.out.println(i + 1 + " " + input.get(i));
        }
    }
}