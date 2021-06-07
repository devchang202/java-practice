package uni.practice5;

import com.sun.corba.se.impl.logging.InterceptorsSystemException;

public class MovieManager {
    final static int THEATER_ROOM_NUM = 10;
    private TheaterRoom[] Theater;
    private String ID;
    private String Password;

    {
        Theater = new TheaterRoom[THEATER_ROOM_NUM];
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
            System.out.println("The room number is out of range");
            return;
        }
        Theater[RoomNumber - 1].modifyMovieOnAir(movie);
        Theater[RoomNumber - 1].modifyRoomNumber(RoomNumber);
        Theater[RoomNumber - 1].modifyStartTime(StartTime);
        Theater[RoomNumber - 1].modifyEndTime(EndTime);
    }

    void deleteMovie(int RoomNumber) {
        if (Theater[RoomNumber - 1].getRoomNumber() == 0) {
            System.out.println("상영중인 영화가 없습니다.");
        } else {
            Theater[RoomNumber - 1] = new TheaterRoom(0);
        }
    }

    void printAllTheater() {
        for (int i = 0; i < THEATER_ROOM_NUM; i++) {
            switch (Theater[i].getRoomNumber()) {
                case 0:
//                    System.out.println(" 상영관에서 상옇하는 영화가 없습니다.");
                    break;
                default:
                    Theater[i].printTheaterInfo();
                    break;
            }
        }
    }
}
