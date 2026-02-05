package mutableStrings;
public class Strings {
    public static void main(String[] args) {
        String jumbled = "Jyothsna1Is1From1CSE1Batch-I";
        // words = {Jyothsna, Is, From, CSE, Batch-I};
        String[] words = jumbled.split("1");
        System.out.println(words[3]);
        String str = "gsssietw";
        System.out.println(str.toUpperCase());
        System.out.println(str);
    }
}
