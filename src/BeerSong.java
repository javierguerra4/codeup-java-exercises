public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        while (beerNum > 0){
            System.out.println( beerNum + " bottles of beer on the wall,");
            System.out.println( beerNum + " bottles of beer,");
            System.out.println( "take one down, pass it around,");
            System.out.println( beerNum + " bottles of beer on the wall.");
            beerNum = beerNum - 1;
        }
        if (beerNum == 0){
            System.out.println("No more bottles of beer on the wall!");
        }
    }
}
