public class Enemy extends Player {
    public Enemy(int intelligence, int agility, int strength, int HP, int MP) {
        super(intelligence, agility, strength, HP, MP);
    }

    public int getHP(){
        return this.HP;
    }

    public void setHP(int hp){
        this.HP = hp;
    }

    public int getAttack(int attack){
        HP = this.HP - attack;
        return HP;
    }

    @Override
    public int attack() {
        return (strength * 2)+10;
    }

    @Override
    public int defense() {
        return HP;
    }

    @Override
    public int heal() {
        return HP;
    }
}
