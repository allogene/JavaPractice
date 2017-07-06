package com.doug;

public class Main {


    public static void main(String[] args) {
/*    Dimensions dimensions = new Dimensions(20,20,5);
	Case theCase = new Case("220","Dell","120",dimensions);

	Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new  Resolution(2540, 1440));
	Motherboard motherboard = new Motherboard("83-200","Asus","v2.44",4,6);

	PC pc = new PC(theCase,theMonitor,motherboard);

	pc.powerUp();
*/

		Door door = new Door("Front", "brown", "solid", 150, 250);
		Window window = new Window("Front Right", "Single Pane", 200, 150);
		Wall wall1 = new Wall(1, 1, 1, "East", "Artic Blue", "Solid", door, window);

		Room room = new Room("Study", "Wood", 4, wall1);

		String roomName = room.getName();
		System.out.println("Room Name = " + roomName);
		room.wall1.openDoor(40);
		room.wall1.paintWall(1,"Brown","Solid");

	}

}
