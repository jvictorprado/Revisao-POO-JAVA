package UEC;

import java.util.Random;

public class Fight {
    private Fighter challenger;
    private Fighter challenged;
    private int rounds;
    private boolean approved;

    public void markFight(Fighter f1, Fighter f2) {
        if ((f1.getCategory().equals(f2.getCategory())) && (f1 != f2)) {
            this.approved = true;
            this.challenger = f1;
            this.challenged = f2;
/*          this.setApproved(true);
            this.setChallenger(f1);
            this.setChallenged(f2);*/
        } else {
            this.approved = false;
            this.challenger = null;
            this.challenged = null;

            /*this.setApproved(false);
            this.setChallenger(null);
            this.setChallenged(null);
*/
        }
    }

    public void combat() {
        if (isApproved()) {
            System.out.println("Challenger");
            this.challenger.presentation();
            System.out.println("----------------------------");
            System.out.println("Challenged");
            this.challenged.presentation();

            Random aleatory = new Random();
            int winner = aleatory.nextInt(3);


            switch (winner) {
                case 0:
                    this.challenger.draw();
                    this.challenged.draw();
                    System.out.println("It's a draw!");
                    break;
                case 1:
                    this.challenger.win();
                    this.challenged.lose();
                    System.out.println("The fighter '" + this.challenger.getName() + "' won!");
                    break;
                case 2:
                    this.challenged.win();
                    this.challenger.lose();
                    System.out.println("The fighter '" + this.challenged.getName() + "' won!");
                    break;
            }
        } else {
            System.out.println("Impossible to schedule the fight");
        }
    }

    public Fighter getChallenger() {
        return challenger;
    }

    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }

    public Fighter getChallenged() {
        return challenged;
    }

    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
