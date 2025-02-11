package hw02;

public class Task3 {
    public static void main(String[] args) {
        int allPirates = 13;
        int loot = 3483;

        int ownerLoot = loot / 2;
        int captainLoot = ownerLoot / 2;
        int piratesLoot = captainLoot / allPirates;
        captainLoot += piratesLoot;

        int jackVorobey = ownerLoot + captainLoot;

        System.out.println(ownerLoot);
        System.out.println(captainLoot);
        System.out.println(piratesLoot);
        System.out.println(jackVorobey);
    }
}
