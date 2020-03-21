public class Heroes extends Player {
    public Heroes(int intelligence, int agility, int strength, int HP, int MP) {
        super(intelligence, agility, strength, HP, MP);
    }

   public int getDefense(int defense, int attack){
        if (this.agility < attack){
            return this.HP - (defense - attack);
        }
        else {
            return this.HP + (defense - attack);
        }
   }

   public int getHeal(int heal){
        if ((HP+heal) > 3000){
            return HP;
        }
        else {
            return HP + heal;
        }
   }

   public int getHP(){
        return this.HP;
   }

   public void setHP(int hp){
        this.HP = hp;
   }

    @Override
    public int attack() {
        return (strength * 3)-5;
    }

    @Override
    public int defense() {
        return agility * 6;
    }

    @Override
    public int heal() {
        return intelligence * 3;
    }
}
