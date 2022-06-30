package runnable;

import dataObject.RoomDTA;
import dataObject.RoomReservedSeatsDTA;
import java.util.ArrayList;
import java.util.List;

public class CinemaRNB {

  public static void main(String[] args) {

    List<RoomDTA> roomList = setRoom();


    System.out.println("------------------------------");
    System.out.println("|        CINEMA  DANI         |");
    System.out.println("------------------------------");

    for (int a = 0; a < roomList.size(); a++) {
      RoomReservedSeatsDTA rs = new RoomReservedSeatsDTA(roomList.get(a).movieName, roomList.get(a).rowAmount);
      rs.printPreview(a + 1);
    }



  }

  private static List<RoomDTA> setRoom() {

    List<RoomDTA> rooms = new ArrayList<RoomDTA>();

    RoomDTA room01 = new RoomDTA("The lord of the rings: The fellowship of the ring", 15);
    RoomDTA room02 = new RoomDTA("Avatar", 10);
    RoomDTA room03 = new RoomDTA("Kill Bill", 5);
    RoomDTA room04 = new RoomDTA("Ted", 5);
    RoomDTA room05 = new RoomDTA("Aladdin", 5);
    RoomDTA room06 = new RoomDTA("Kung fu panda", 5);
    RoomDTA room07 = new RoomDTA("Blade Runner", 5);
    RoomDTA room08 = new RoomDTA("Interstellar", 5);
    RoomDTA room09 = new RoomDTA("47 Ronin", 5);
    RoomDTA room10 = new RoomDTA("Last Samurai", 5);

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
