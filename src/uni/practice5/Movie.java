package uni.practice5;


public class Movie {
    String Title;
    String Genre;
    eVIEWING_CLASS ViewingClass;

    Movie() {
        this("", "", eVIEWING_CLASS.C9);
    }

    Movie(String title, String genre, eVIEWING_CLASS c) {
        this.Title = title;
        this.Genre = genre;
        this.ViewingClass = c;
    }
    void modifyTitle(String title) {
        this.Title = title;
    }

    void modifyGenre(String genre) {
        this.Genre = genre;
    }
    void modifyViewingClass(eVIEWING_CLASS c) {
            this.ViewingClass = c;
    }

    String getTitle() {
        return this.Title;
    }

    String getGenre(){
        return this.Genre;
    }

    eVIEWING_CLASS getViewingClass() {
        return this.ViewingClass;
    }
}
