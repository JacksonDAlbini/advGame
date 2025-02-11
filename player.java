public class player{
String name;
int health;
int roomId;
boolean key1 = false;
boolean key2 = false;
public player(String initName){
    name = initName;
    int health = 100;
    int roomId = 1;
    boolean key1 = false;
    boolean key2 = false;
}
public String getName(){
    return name;
}
public void setName(String newName){
    name = newName;
}
public int getHealth(){
    return health;
}
public void setHealth(int newHealth){
    health = newHealth;
}
public int getRoomId(){
    return roomId;
}
public void setRoomId(int newRoomId){
    roomId = newRoomId;
}
public void setKey1(){
    key1 = true;
}
public void setKey2(){
    key2 = true;
}
}
