public class NumToWordsUsingMethod {
    public static void main(String[] args) {
        int number = 1;
        printWord(number);
    }

    public static void printWord(int number) {
        String word;

        switch (number) {
            case 1:  word = "one";   break;
            case 2:  word = "two";   break;
            case 3:  word = "three"; break;
            case 4:  word = "four";  break;
            case 5:  word = "five";  break;
            case 6:  word = "six";   break;
            case 7:  word = "seven"; break;
            case 8:  word = "eight"; break;
            case 9:  word = "nine";  break;
            case 10: word = "ten";   break;
            default: word = "number out of range";
        }
        if (number >= 1 && number <= 10) {
            System.out.println("The number in words is: " + word);
        } else {
            System.out.println(word);
        }
    }
}