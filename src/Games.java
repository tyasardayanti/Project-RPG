import java.util.Scanner;
import java.util.Random;

public class Games {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("WELCOME TO THE GAME");
        Thread.sleep(1500);
        System.out.println("Choose your hero:");
        Thread.sleep(1000);
        System.out.println("1. Aphrodite");
        Thread.sleep(1000);
        System.out.println("2. Hera");
        Thread.sleep(1000);
        System.out.println("3. Luna");
        Thread.sleep(1000);
        Scanner scanner = new Scanner(System.in);
        Heroes player = null;
        Enemy musuh = null;
        int pilihan;
        int pilihanmove;
        Random rand = new Random();
        int random = rand.nextInt(1000);
        int randommove;

        int attack;
        int defense;
        int heal;
        int hp_sisa, hp;
        int mp;

        int flag = 1;
        int flagmove = 1;
        int enemyislife = 1;
        int heroislife = 1;

        while (flag==1){
            pilihan = scanner.nextInt();

            if (pilihan==1){
                player = new Heroes(10, 50, 50, 1700, 850);
                flag = 0;
                System.out.println("You got Aphrodite as your hero!");
            }
            else if (pilihan==2){
                player = new Heroes(30, 40, 60, 1800, 900);
                flag = 0;
                System.out.println("You got Hera as your hero!");
            }
            else if (pilihan==3){
                player = new Heroes(50, 30, 70, 1900, 950);
                flag = 0;
                System.out.println("You got Luna as your hero!");
            }
            else {
                System.out.println("Choose between 1-3");
            }
        }


        if (random%2==0 & random%4==0){
            // Dionysus
            System.out.println("Your enemy is Dionysus");
            musuh = new Enemy(20, 30, 40, 1550, 750);
        }
        else if (random%2==0){
            // Zeus
            System.out.println("Your enemy is Zeus");
            musuh = new Enemy(40, 30, 50, 1870, 850);
        }
        else if (random%2==1){
            //Artemis
            System.out.println("Your enemy is Artemis");
            musuh = new Enemy(60, 30, 50,1400, 600);
        }

        Thread.sleep(1500);
        System.out.println("Start new game");
        Thread.sleep(1500);
        System.out.println("Choose your move: ");
        Thread.sleep(1000);
        System.out.println("1. Attack");
        Thread.sleep(1000);
        System.out.println("2. Defense");
        Thread.sleep(1000);
        System.out.println("3. Heal");
        Thread.sleep(1000);


        while(enemyislife==1 && heroislife==1){
            while (flagmove==1) {
                pilihanmove = scanner.nextInt();
                if (pilihanmove == 1) {
                    attack = player.attack();
                    hp_sisa = musuh.getAttack(attack);
                    musuh.setHP(hp_sisa);
                    hp = player.getHP();
                    System.out.println("You already attack your enemy!");
                    System.out.println("Your enemy remain HP is " + hp_sisa);
                    System.out.println("Your remain HP is " + hp);
                    flagmove = 0;
                    if (hp_sisa <= 0){
                        enemyislife=0;
                    }
                } else if (pilihanmove == 2) {
                    attack = musuh.attack();
                    defense = player.defense();
                    hp_sisa = player.getDefense(defense, attack);
                    player.setHP(hp_sisa);
                    hp = musuh.getHP();
                    System.out.println("You defense from attack");
                    System.out.println("Your enemy remain HP is " + hp);
                    System.out.println("Your remain HP is " + hp_sisa);

                    flagmove = 0;
                } else if (pilihanmove == 3) {
                    heal = player.heal();
                    hp_sisa = player.getHeal(heal);
                    player.setHP(hp_sisa);
                    hp = musuh.getHP();
                    System.out.println("You healed from attack");
                    System.out.println("Your enemy remain HP is " + hp);
                    System.out.println("Your remain HP is " + hp_sisa);
                    flagmove = 0;
                }
                else {
                    System.out.println("Choose between 1-3");

                }
            }

            randommove = rand.nextInt(100);
            if (randommove%2==0 & random%4==0){
                // Attack
                System.out.println("Your enemy attacking you!!!!");
                musuh.attack();
            }
            else if (randommove%2==0){
                // Defense
                System.out.println("Your enemy is defended from your attack");
                musuh.defense();
            }
            else if (randommove%2==1){
                //Heal
                System.out.println("Your enemy is healed from your attack");
                musuh.heal();
            }
            flagmove = 1;
        }


    }

}
