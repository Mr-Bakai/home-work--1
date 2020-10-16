public class Main {

    public static void main(String[] args) {
        Hero objectA = new Hero(30, 300, 10);

        Warrior objectB = new Warrior(TypeOfBoost.AGILITY_BOOST, new SuperAbility("Kick of a Jeki Chan", 5),
                20, 43, 300, 50);

        Warrior objectC = new Warrior(TypeOfBoost.HEAL_BOOST, new SuperAbility("punch of Bakai", 3),
                3, 30, 400, 50);



        System.out.println("\n############################");
        System.out.println(objectA.getInfo());
        System.out.println("\n############################");
        System.out.println(objectB.getInfo());

        System.out.println("\n############################");

        System.out.println(objectC.getInfo());

        System.out.println("\n############################");
        objectA.makeVictorySound(3, "THE SOKE");
        objectB.makeVictorySound("HAS GONE FROM GOVERNMENT ", 5);
        objectC.makeVictorySound("TAKE SOME GOOD REST MAN!");

    }
}
