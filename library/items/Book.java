package library.items;

public class Book {
    private String name;
    private int pages;
    private int currentPage = 1;

    public Book(String n, int pages) {
        this.name = n;
        this.pages = pages;
    }

    public int page() {
        return this.currentPage;
    }

    public Book nextPage() {
        this.currentPage++;

        return this;
    }

    public Book nextPage(int next) {
        this.currentPage += next;

        return this;
    }

    public Book close() {
        this.currentPage = 1;

        return this;
    }

    public String getName() {
        return this.name;
    }

    public int countPages() {
        return this.pages;
    }

    public int keepPages() {
        return this.pages - this.currentPage;
    }

    public String keepPagesInPercent() {
        float percent = (float) this.keepPages() * 100 / this.countPages(); // 16.4% => 16%

        return percent+"%";
    }

    public String pagesInPercent() {
        float percent = (float) (this.countPages() - this.keepPages()) * 100 / this.countPages();

        return percent+"%";
    }
}
