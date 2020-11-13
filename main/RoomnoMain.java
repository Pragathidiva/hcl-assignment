package main;

import day2assignment.Roomno;

public class RoomnoMain {

	public static void main(String[] args) {
		Roomno roomno = new Roomno() ;
		roomno.setRoomno(123);
		roomno.setRoomtype("2 sharing room");
		roomno.setRoomarea(500);
		roomno.setWashingmachine("LG machine");
		System.out.println("Room no. :" +roomno.getRoomno());
		System.out.println("Room type. :" +roomno.getRoomtype());
		System.out.println("Room area. :" +roomno.getRoomarea());
		System.out.println("Washing machine. :" +roomno.getWashingmachine());
	}

}
