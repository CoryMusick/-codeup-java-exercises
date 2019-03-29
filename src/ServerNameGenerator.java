public class ServerNameGenerator {
    public static String[] adjectives = {"Legendary", "big","cool","awesome","mediocre","sad", "disappointing","Super","Amazing","Mind-Blowing"};
    public static String[] nouns = {"toothbrush","cat","zebra","puma","ocelot","cow", "moose","mouse","flamingo","lion"};

    public static String generator(String[] array){
      return array[(int) (Math.random()* (array.length))];
    }

    public static String createName(String[] array1, String[] array2){
        String firstWord = generator(array1);
        String secondWord = generator(array2);

        return firstWord + "-" + secondWord;
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.println(createName(adjectives,nouns));
    }
}