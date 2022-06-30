package runnable;

import dataObject.RoomDTO;
import dataObject.RoomReservedSeatsDTO;
import java.util.ArrayList;
import java.util.List;

public class CinemaRNB {

  public static void main(String[] args) {

    List<RoomDTO> roomList = setRoom();


    System.out.println("------------------------------");
    System.out.println("|        CINEMA  DANI         |");
    System.out.println("------------------------------");

    for (int a = 0; a < roomList.size(); a++) {
      RoomReservedSeatsDTO rs = new RoomReservedSeatsDTO(roomList.get(a).movieName, roomList.get(a).rowAmount);
      rs.printPreview(a + 1);
    }



  }

  private static List<RoomDTO> setRoom() {

    List<RoomDTO> rooms = new ArrayList<RoomDTO>();

    RoomDTO room01 = new RoomDTO("The lord of the rings: The fellowship of the ring", 15);
    RoomDTO room02 = new RoomDTO("Avatar", 10);
    RoomDTO room03 = new RoomDTO("Kill Bill", 5);
    RoomDTO room04 = new RoomDTO("Ted", 5);
    RoomDTO room05 = new RoomDTO("Aladdin", 5);
    RoomDTO room06 = new RoomDTO("Kung fu panda", 5);
    RoomDTO room07 = new RoomDTO("Blade Runner", 5);
    RoomDTO room08 = new RoomDTO("Interstellar", 5);
    RoomDTO room09 = new RoomDTO("47 Ronin", 5);
    RoomDTO room10 = new RoomDTO("Last Samurai", 5);

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
