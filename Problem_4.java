import java.util.*;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputList = new ArrayList<>();

        System.out.println("Enter the numbers:");
        String inputLine = scanner.nextLine();

        String[] inputArray = inputLine.replaceAll("\\s+", "").split(",");
        for (String s : inputArray) {
            inputList.add(Integer.parseInt(s));
        }
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        for (int num : inputList) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ":" +result.get(i)+",");
        }


    }
}
