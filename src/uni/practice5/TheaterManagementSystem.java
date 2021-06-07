package uni.practice5;

import sun.awt.windows.WPrinterJob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TheaterManagementSystem {
    final static int THEATER_ROOM_NUM = 10;
    static boolean HasBeenLoggedIn = false;
    static int mode;
    static int TheaterRoomNumber;
    static Time StartTime;
    static Time EndTime;

    static void create_theater() {

    }

    public static void main(String[] args) throws IOException {
        MovieManager manager = new MovieManager("chnam", "1234");
        System.out.println("Log-in\n");
        System.out.println("ID : \n");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String ID = in.readLine();
        System.out.println("Password : \n");

        String password = in.readLine();

        if (manager.LogIn(ID, password)) {
            System.out.println("Log-in Success");
            HasBeenLoggedIn = true;
        } else {
            System.out.println("Log-in Fail");
        }

        Scanner stdin = new Scanner(System.in);
        String tempString = new String();
        int tempInt;
        Movie tempMovie = new Movie();
        boolean validInput = false;

        while (HasBeenLoggedIn == true) {
            System.out.println("수행할 작업을 선택해주세요.");
            System.out.println("1. 조회, 2, 영화추가, 3. 영화제거, 4. 종료");

            mode = stdin.nextInt();

            switch (mode) {
                case 1:
                    System.out.println("상영관 정보");
                    System.out.println("1 2 3 4 5 6 7 8 9 10");
                    System.out.println("조회할 상영관 : ");
                    TheaterRoomNumber = stdin.nextInt();
                    try {
                        manager.getTheater(TheaterRoomNumber).printTheaterInfo();
                    } catch (Exception e) {
                        System.out.println("상영 영화가 존재하지 않습니다.");
                    }
                    break;
                case 2:

                    System.out.println("상영관 : ");
                    TheaterRoomNumber = stdin.nextInt();

                    System.out.println("영화제목 : ");
                    tempString = in.readLine();
                    tempMovie.modifyTitle(tempString);

                    System.out.println("영화장르 ");
                    tempString = in.readLine();
                    tempMovie.modifyGenre(tempString);

                    while (validInput == false) {
                        System.out.println("영화관람등급(9, 12, 15, 18) : ");
                        tempInt = stdin.nextInt();
                        switch (tempInt) {
                            case 9:
                                tempMovie.modifyViewingClass(eVIEWING_CLASS.C9);
                                validInput = true;
                                break;
                            case 12:
                                tempMovie.modifyViewingClass(eVIEWING_CLASS.C12);
                                validInput = true;
                                break;
                            case 15:
                                tempMovie.modifyViewingClass(eVIEWING_CLASS.C15);
                                validInput = true;
                                break;
                            case 18:
                                tempMovie.modifyViewingClass(eVIEWING_CLASS.C18);
                                validInput = true;
                                break;
                            default:
                                System.out.println("Invalid class, try again");
                                break;
                        }
                    }
                    validInput = false;

                    int hour, minute;
                    while (validInput == false) {
                        System.out.println("영화 시작 시간(시간) : ");
                        hour = stdin.nextInt();
                        System.out.println("영화 시작 시간(분) : ");
                        minute = stdin.nextInt();

                        if (Time.isValidTime(hour, minute) == true){
                            manager.getTheater(TheaterRoomNumber).modifyStartTime(new Time(hour, minute));
                            validInput = true;
                        }
                        else {
                            System.out.println("Invalid time, try again");
                        }
                    }
                    validInput = false;

                    while (validInput == false) {
                        System.out.println("영화 종료 시간(시) : ");
                        hour = stdin.nextInt();
                        System.out.println("영화 종료 시간(분) : ");
                        minute = stdin.nextInt();

                        if (Time.isValidTime(hour, minute) == true) {
                            manager.getTheater(TheaterRoomNumber).modifyEndTime(new Time(hour, minute));
                            validInput = true;
                        } else {
                            System.out.println("Invalid time, try again");
                        }
                    }
                    validInput = false;

                    manager.insertMovie();
                    break;
                case 3:
                    S
            }

        }

    }
}
