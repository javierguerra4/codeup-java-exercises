public class Fighter {
    public String name;
    public int hitPoints;
    public int maxDamage;

    public void printStats(){
        System.out.println(name + " has " + hitPoints + " hit points and can do " + maxDamage + " damage.");
    }

    public void battleRoar(){
        System.out.println("I am " + name + ", prepare to be defeated!");
    }
    public int attackRoll(){
        return D20.roll20();
    }
}



