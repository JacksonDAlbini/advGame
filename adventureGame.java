import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class adventureGame{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        File room = new File("room.txt");
        try {
            scan = new Scanner (room);
        } catch(FileNotFoundException e) {
            System.out.println("Oops");
        } 
        while (scan.hasNextLine()){
            
        }
        //ROOMS
        ArrayList<room> rooms = new ArrayList<room>();
        room room1 = new room(1, "Starting Room",
        "You see a door to one side of the room and a large vent on the ohter side.",
        "The door is unlocked, and there is a handle on the vent. Which way do you go?");
        rooms.add(room1);
        room room2 = new room(2, "Doll Room",
        "You walk into a dark room with strange dolls hanging from the ceiling.",
        "You see a doll that misteriously starts to speak: I am made of water, but die when I'm in it. What am I?");
        rooms.add(room2);
        room room3 = new room(3, "Art room", 
        "You walk into a room with many paintings, you see a painting of an ice cube.",
        "Do you want to turn around or break the painting?");
        rooms.add(room3);
        room room4 = new room(4, "Hallway", 
        "You navigate through a hallway, you see paintings, its like their eyes follow you.", 
        "You find a door, do you open it or turn around?");
        rooms.add(room4);
        room room5 = new room(5, "Library", 
        "You walk into an old, dark library, you see a book on the table.", 
        "The book fits into slot in the wall, do you chose the blue, black, or red slot?");
        rooms.add(room5);
        room room6 = new room(6, "Dining Room", 
        "You walk into the dining room, you see a table set for dinner.", 
        "You see a door with a keyhole, and a door to the lounge, you have to move on.");
        rooms.add(room6);
        room room7 = new room(7, "Dungeon", 
        "You fall into a dark dungeon, you see a key on the ground.", 
        "You pocket the key, but it looks like the only way out is a ladder up.");
        rooms.add(room7);
        room room8 = new room(8, "Study", 
        "You walk into the study, you find a book on the table.", 
        "The book reads: I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?");
        rooms.add(room8);
        room room9 = new room(9, "Lounge", 
        "You walk into the study, you see creepy artifact spread throughout the room.", 
        "You can see a door with a large keyhole, and a door to the study.");
        rooms.add(room9);
        room room10 = new room(10, "Cage Room", 
        "You unlock the door and fins a room with three cages, you wonder what theyre for.",
        "You find a key in one of the cages, do you take it or leave it?");
        rooms.add(room10);
        room room11 = new room(11, "Bedroom", 
        "You creep into the bedroom, you see a lady sleeping in the bed.", 
        "You do your best to sneak past, do you tip toe or run for it?");
        rooms.add(room11);
        room room12 = new room(12, "Exit Door", 
        "You sneak past the lady to the door, you see a small keyhole.", 
        "If you have the key, you may pass through this door.");
        rooms.add(room12);
        //PLAYER
        player player1 = new player("Player Name");
        System.out.println("Welcome to the Adventure Game!");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        player1.setName(name);
        System.out.println("Hello " + player1.getName() + "!");
        System.out.println("You wake up in a dark room, you see a door to one side of the room and a large vent on the other side.");
        System.out.println("Which way do you go?");
        System.out.println("1. Door");
        System.out.println("2. Vent");
        int choice = scan.nextInt();
    }
}