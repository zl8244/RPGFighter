public class Character {
    private double HP;
    private double ATK;
    private double DEF;
    private double LCK;

    public Character(double HP, double ATK, double DEF, double LCK) {
        this.HP = HP;
        this.ATK = ATK;
        this.DEF = DEF;
        this.LCK = LCK;
    }

    public double getHP() {
        return this.HP;
    }

    public void Attack(Character target) {
        double atkValue = ATK;
        atkValue += critCalc(LCK);
        target.takeDamage(atkValue);
    }

    public double critCalc(double luck) {
        double random = 100 * Math.random();
        if(random <= LCK) {
            return ATK;
        }
        return 0;
    }

    public void takeDamage(double dmg) {
        double takenDmg = dmg - DEF;
        HP = (takenDmg > 0)? HP - takenDmg : HP;
    }
}
