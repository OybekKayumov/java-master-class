public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        // player.name = "Tim";
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
        //* Remaining health = 10

        player.health = 200;

        player.loseHealth(11);
        System.out.println("Remaining health = " + player.healthRemaining());
        //* Remaining health = 189
    }
}
