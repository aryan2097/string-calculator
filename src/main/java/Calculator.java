public class Calculator {
    public static int add(String string) {
        String[] inputNumbers = string.split(",");
        if (string.isEmpty())
        {
            return 0;
        }
        else if (inputNumbers.length == 1) {
            return stringToInteger(string);
        }
        else if (!string.isEmpty()) {
            return stringToInteger(inputNumbers[0]) + stringToInteger(inputNumbers[1]);
        }
       return 0;
    }

    private static int stringToInteger(String input){
        return Integer.parseInt(input);
    }
}
