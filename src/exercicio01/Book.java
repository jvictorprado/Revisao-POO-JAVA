package exercicio01;

public class Book implements Publication {
    private String title;
    private String writer;
    private int totPages;
    private int currentPage;
    private boolean open;
    private Person reader;

    public Book(String title, String writer, int totPages, Person reader) {
        this.title = title;
        this.writer = writer;
        this.totPages = totPages;
        this.reader = reader;
        this.open = false;
        this.currentPage = 0;
    }

    public String details() {
        return "Book{" +
                "title='" + title + '\'' +
                ",\n writer='" + writer + '\'' +
                ",\n totPages=" + totPages +
                ",\n currentPage=" + currentPage +
                ",\n open=" + open +
                ",\n reader=" + reader.getName() +
                '}';
    }

    @Override
    public void open() {
        this.open = true;
    }

    @Override
    public void close() {
        this.open = false;
    }

    @Override
    public void flipThrough(int p) {
        if (p > this.totPages) {
            this.currentPage = 0;
        } else {
            this.currentPage = p;
        }

    }

    @Override
    public void nextPage() {
        this.currentPage++;
    }

    @Override
    public void backPage() {
        this.currentPage--;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getTotPages() {
        return totPages;
    }

    public void setTotPages(int totPages) {
        this.totPages = totPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Person getReader() {
        return reader;
    }

    public void setReader(Person reader) {
        this.reader = reader;
    }
}
