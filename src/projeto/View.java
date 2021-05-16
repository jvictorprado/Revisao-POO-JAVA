package projeto;

public class View {
    private User viewer;
    private Video movie;

    public View(User viewer, Video movie) {
        this.viewer = viewer;
        this.movie = movie;
        this.viewer.setTotWatched(this.viewer.getTotWatched() + 1);
        this.movie.setViews(this.movie.getViews() + 1);
    }

    public void rate() {
        this.movie.setRating(5);
    }

    public void rate(int grade) {
        this.movie.setRating(grade);
    }

    public void rate(float percent) {
        int tot;
        if (percent <= 20) {
            tot = 3;
        } else if (percent <= 50) {
            tot = 5;
        } else if (percent <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.movie.setRating(tot);
    }

    public User getViewer() {
        return viewer;
    }

    public void setViewer(User viewer) {
        this.viewer = viewer;
    }

    public Video getMovie() {
        return movie;
    }

    public void setMovie(Video movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "View{" +
                "viewer=" + viewer +
                ", movie=" + movie +
                '}';
    }
}
