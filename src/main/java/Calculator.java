public class Calculator {
    public static int add(String string) {
        String[] inputNumbers = string.split(",");
        if (string.isEmpty())
        {
            return 0;
        }
        if (inputNumbers.length == 1) {
            return stringToInteger(string);
        }
        else if (!string.isEmpty()) {
            return doSum(inputNumbers);
        }
       return 0;
    }
    private static int doSum(String[] inputNumbers) {
        int sum = 0;
        for (int current =0; current< inputNumbers.length; current++){
            sum += stringToInteger(inputNumbers[current]);
        }
        return sum;
    }

    private static int stringToInteger(String input){
        return Integer.parseInt(input);
    }
}
