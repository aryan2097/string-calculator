public class Calculator {


    public static int add(String string) throws Exception {
        String[] inputNumbers = modifiedString(string).split(delimiter(string));

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
    private static int doSum(String[] inputNumbers) throws Exception {
        Integer[] arr = new Integer[inputNumbers.length];
        int sum = 0;
        for (int current =0; current< inputNumbers.length; current++){
            int integerValue = stringToInteger(inputNumbers[current]);
            sum += integerValue;
            arr[current] = integerValue;
        }
        checkNegativeException(arr);
        return sum;
    }

    private static int stringToInteger(String input){
        return Integer.parseInt(input);
    }

    private static String modifiedString(String input){
        if (input.startsWith("//")){
            return input.substring(4);
        }
        else return input;
    }

    private static String delimiter(String input){
        if (input.startsWith("//")){
            return input.substring(2,3);
        }
        else return ",|\n";
    }

    private static void checkNegativeException(Integer[] arr) throws Exception {
        String negativeNumbers = new String();
        for (int i=0; i< arr.length; i++ )
        {
            if (arr[i]<0){
                negativeNumbers = negativeNumbers.concat(Integer.toString(arr[i])).concat(" ");
            }
        }
        if(!negativeNumbers.isEmpty()){
            throw new Exception("Negatives not allowed " + negativeNumbers);
        }
    }
}
