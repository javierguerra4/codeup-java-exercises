public class FighterTest {
    public static void main(String[] args) {
        Fighter arata = new Fighter();
        arata.name = "Arata";
        arata.hitPoints = 17;
        arata.maxDamage = 14;
        System.out.println("arata attacks and rolls a " + arata.attackRoll());

    }
}
