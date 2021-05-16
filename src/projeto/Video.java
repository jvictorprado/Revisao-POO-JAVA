package projeto;

public class Video implements VideoActions {
    private String title;
    private boolean playing;
    private int views, likes;
    private float rating;

    public Video(String title) {
        this.title = title;
        this.rating = 1;
        this.views = 0;
        this.likes = 0;
        this.playing = false;
    }

    @Override
    public void play() {
        this.playing = true;
    }

    @Override
    public void pause() {
        this.playing = false;
    }

    @Override
    public void like() {
        this.likes++;
    }

    @Override
    public String toString() {
        return "Video{\n" +
                "title='" + title + '\'' +
                ", \nplaying=" + playing +
                ", \nrating=" + rating +
                ", \nviews=" + views +
                ", \nlikes=" + likes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getRating() {
        return this.rating;
    }

    public void setRating(int pRating) {
        if (this.views > 1) {
            float newRating = ((this.rating + pRating) / this.views);
            this.rating = newRating;
        } else {
            this.rating = pRating;
        }
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

}
