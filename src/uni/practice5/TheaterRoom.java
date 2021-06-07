package uni.practice5;

public class TheaterRoom {
    private int RoomNumber;
    private Movie MovieOnAir;
    private Time StartTime;
    private Time EndTime;

    TheaterRoom() {
        this(0,
                new Movie(),
                new Time(),
                new Time());
    }

    TheaterRoom(int RoomNumber){
        this(RoomNumber,
                new Movie(),
                new Time(),
                new Time());
    }
    TheaterRoom(int RoomNumber, Movie MovieOnAir, Time StartTime, Time EndTime) {
        this.RoomNumber = RoomNumber;
        this.MovieOnAir = MovieOnAir;
        this.StartTime = StartTime;
        this.EndTime = EndTime;
    }
    void modifyRoomNumber(int roomNumber) {
        this.RoomNumber = roomNumber;
    }

    void modifyMovieOnAir(Movie title) {

        this.MovieOnAir = title;
    }

    void modifyStartTime(Time time) {
        this.StartTime = time;
    }

    void modifyEndTime(Time time) {
        this.EndTime = time;
    }

    int getRoomNumber() {
        return RoomNumber;
    }

    Movie getMovieOnAir() {
        return MovieOnAir;
    }

    Time getStartTime() {
        return StartTime;
    }

    Time getEndTime() {
        return EndTime;
    }

    boolean isAllocatedRoom(int RoomNumebr) {
        if (RoomNumebr < 0 && RoomNumebr > MovieManager.THEATER_ROOM_NUM) {
            System.out.println("The room number is out of range");
            return false;
        }

        switch (this.RoomNumber) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    void printTheaterInfo() {
        System.out.println("상영관 : " + this.RoomNumber);
        System.out.println("영화제목 : " + this.MovieOnAir.getTitle());
        System.out.println("영화장르 : " + this.MovieOnAir.getGenre());
        System.out.println("영화관람등급 : " + this.MovieOnAir.getViewingClass().getValue());
        System.out.println("영화상영시간 : " + this.StartTime.getDurationFrom(this.EndTime));
        System.out.println();
    }
}
