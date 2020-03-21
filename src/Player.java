public abstract class Player {
    protected int intelligence;
    protected int agility;
    protected int strength;
    protected int HP;
    protected int MP;

    public Player(int intelligence, int agility, int strength, int HP, int MP) {
        this.intelligence = intelligence;
        this.agility = agility;
        this.strength = strength;
        this.HP = HP;
        this.MP = MP;
    }

    public abstract int attack();
    public abstract int defense();
    public abstract int heal();

}
