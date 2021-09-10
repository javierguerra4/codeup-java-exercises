public class QuoteTest {
    public static void main(String[] args) {
        Quote first = new Quote();
        first.name = "Famous person";
        first.quote = "This is a famous quote.";
        first.printQuote();
        System.out.println("This is the random number " + first.randomNumber());
//        System.out.println();
    }
}
