public class Quote {
  public String name;
  public String quote;

  public void printQuote(){
      System.out.println("Here is the quote: " + quote + " by: " + name);

    }
    public int randomNumber(){
        return Random1_4.randomOne();
    }
}






//    Create a Quote class with a RandomQuote method.
//    The method should generate a random number from 1 to 4.
//    Depending on the result, the method should return a different quote.
//    Now edit your animal class from the previous exercise so instead of an appropriate animal noise it makes a random quote.
//    Test your animal class and verify that it now emits a random quote instead of an animal-appropriate noise.
