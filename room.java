public class room{
int roomNum;
String roomName;
String desc;
String puzzle;
public room(int initRoomNum, String initRoomName, String initDesc, String initPuzzle) {
    roomNum = initRoomNum;
    roomName = initRoomName;
    desc = initDesc;
    puzzle = initPuzzle;
    boolean complete = false;
}
public void setComplete(){
    complete = true;
    puzzle = "You may pass through this room freely";
}
public int getRoomNum(){
    return roomNum;
}
public String getDesc(){
    return desc;
}
public String getPuzzle(){
    return puzzle;
}
}
