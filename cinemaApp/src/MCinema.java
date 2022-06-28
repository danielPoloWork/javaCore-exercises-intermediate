import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MCinema {

  public static void main(String[] args) {

    List<Room> roomList = setRoom();


    System.out.println("------------------------------");
    System.out.println("|        CINEMA  DANI         |");
    System.out.println("------------------------------");

    for (int a = 0; a < roomList.size(); a++) {
      RoomReservedSeats rs = new RoomReservedSeats(roomList.get(a).movieName, roomList.get(a).rowAmount);
      rs.printPreview(a + 1);
    }



  }

  private static List<Room> setRoom() {

    List<Room> rooms = new ArrayList<Room>();

    Room room01 = new Room("The lord of the rings: The fellowship of the ring", 15);
    Room room02 = new Room("Avatar", 10);
    Room room03 = new Room("Kill Bill", 5);
    Room room04 = new Room("Ted", 5);
    Room room05 = new Room("Aladdin", 5);
    Room room06 = new Room("Kung fu panda", 5);
    Room room07 = new Room("Blade Runner", 5);
    Room room08 = new Room("Interstellar", 5);
    Room room09 = new Room("47 Ronin", 5);
    Room room10 = new Room("Last Samurai", 5);

    rooms.add(room01);
    rooms.add(room02);
    rooms.add(room03);
    rooms.add(room04);
    rooms.add(room05);
    rooms.add(room06);
    rooms.add(room07);
    rooms.add(room08);
    rooms.add(room09);
    rooms.add(room10);



    return rooms;
  }
}
