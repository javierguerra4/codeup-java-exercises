public class BeerSong {
    public static void main(String[] args) {
//        int beerNum = 99;
//        while (beerNum > 0){
//            System.out.println( beerNum + " bottles of beer on the wall,");
//            System.out.println( beerNum + " bottles of beer,");
//            System.out.println( "take one down, pass it around,");
//            System.out.println( beerNum + " bottles of beer on the wall.");
//            beerNum = beerNum - 1;
//        }
//        if (beerNum == 0){
//            System.out.println("No more bottles of beer on the wall!");
//        }

        int beerNum = 99;
        String word = "bottles";
        while (beerNum > 0){
            if (beerNum == 1);{
                word ="bottle";
            }
            System.out.println( beerNum + " " + word + " of beer on the wall");
            System.out.println( beerNum + " " + word + " of beer.");
            System.out.println( "take one down");
            System.out.println( "pass it around");
            beerNum = beerNum - 1;
        }
        if (beerNum > 0){
            System.out.println( beerNum + " " + word + " of beer on the wall");
        } else{
            System.out.println("No more bottles of beer on the wall");
        }

    }
}
