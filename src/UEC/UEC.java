package UEC;

public class UEC {
    public static void main(String[] args) {
        try {
            Fighter f[] = new Fighter[5];
            f[0] = new Fighter("Pretty Boy", "France", 31, 1.75f, 78.9f, 11, 2, 1);
            f[1] = new Fighter("Putscript", "Brasil", 29, 1.68f, 67.8f, 14, 2, 3);
            f[2] = new Fighter("Dead Code", "Australia", 28, 1.93f, 88.6f, 13, 0, 2);
            f[3] = new Fighter("UFOcCobol", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
            f[4] = new Fighter("MaqX", "Canada", 29, 1.58f, 62.8f, 10, 1, 3);


            Fight firstFight = new Fight();

            firstFight.markFight(f[1], f[3]);
            firstFight.combat();

            f[1].status();
            f[4].status();


            /*f[5] = new Fighter("Todo errado", "EUA", 27, 1.86f, 88.2f, 2, 1, 2);*/
        } catch (ArrayIndexOutOfBoundsException e) {
            //e.getMessage();
            e.printStackTrace();
        }
    }
}
