public class Game {
    public void runGame() {
        Character player = new Character(100, 10, 10, 5);
        Character Dummy = new Character(50, 0, 5, 0);
        while(Dummy.getHP() > 0) {
            player.Attack(Dummy);
            String str = String.format("Player attacks Dummy! Dummy's new HP is %s", Dummy.getHP());
            System.out.println(str);
        }
        System.out.println("Dummy is dead");
    }
}
