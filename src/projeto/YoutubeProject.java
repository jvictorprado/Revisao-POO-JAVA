package projeto;

public class YoutubeProject {
    public static void main(String[] args) {
                    /*VIDEOS*/
        Video[] v = new Video[3];
        v[0] = new Video("Aula 01 - Maniqueismo");
        v[1] = new Video("Aula 02 - Descontinuidade da mente");
        v[2] = new Video("Aula 03 - Falácias");
        //System.out.println(v[0].toString());

                    /*USERS*/
        User[] u = new User[2];
        u[0] = new User("Cris", "F", 24,"Cris08");
        u[1] = new User("João", "M", 23,"JV23");
        //System.out.println(u[0].toString());


                    /*VIEWS*/
        View[] vis = new View[3];

        vis[0] = new View(u[1], v[0]);
        vis[0].rate();
        System.out.println(vis[0].toString());

        System.out.println("-----------------\n");

        vis[1] = new View(u[1], v[1]);
        vis[1].rate(80f);
        System.out.println(vis[1].toString());

        System.out.println("-----------------\n");

        vis[2] = new View(u[0], v[1]);
        vis[2].rate(10);
        System.out.println(vis[2].toString());
    }
}
