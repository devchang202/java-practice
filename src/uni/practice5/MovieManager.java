package uni.practice5;

public class MovieManager {
    final static int THEATER_ROOM_NUM = 10;
    private TheaterRoom[] Theater;
    private String ID;
    private String Password;

    {
        for (int i = 0; i < THEATER_ROOM_NUM; i++) {
            Theater[i] = new TheaterRoom();
        }
    }

    MovieManager() {
        this("", "");
    }

    MovieManager(String ID, String Password) {
        this.ID = ID;
        this.Password = Password;
    }

    void modifyID (String ID){
        this.ID = ID;
    }

    void Password(String Password) {
        this.Password = Password;
    }

    boolean LogIn(String ID, String Password) {
        if (this.ID.equals(ID) && this.Password.equals(Password)) {
            return true;
        }

        return false;
    }

    TheaterRoom getTheater(int RoomNumber) {
        if (RoomNumber < 1 || RoomNumber > THEATER_ROOM_NUM) {
            System.out.println("The room number is out of range");
            return null;
        }
        return Theater[RoomNumber - 1];
    }

    void insertMovie(int RoomNumber, Movie movie, Time StartTime, Time EndTime) {
        if (RoomNumber < 1 || RoomNumber > THEATER_ROOM_NUM) {
            return;
        }
        Theater[RoomNumber - 1].modifyMovieOnAir(movie);
        Theater[RoomNumber - 1].modifyRoomNumber(RoomNumber);
        Theater[RoomNumber - 1].modifyStartTime(StartTime);
        Theater[RoomNumber - 1].modifyEndTime(EndTime);
    }

    void deleteMovie(TheaterRoom[] Theater, int RoomNumber) {
        Theater[RoomNumber - 1] = new TheaterRoom(RoomNumber);
    }

    void printAllTheater() {
        for (int i = 0; i < THEATER_ROOM_NUM; i++) {
            switch (Theater[i].getRoomNumber()) {
                case 0:
                    System.out.println("해당 상영관에서 상옇하는 영화가 없습니다.");
                    break;
                default:
                    Theater[i].printTheaterInfo();
                    System.out.println();
                    break;
            }
        }
    }
}
