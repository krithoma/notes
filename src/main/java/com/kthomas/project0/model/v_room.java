package com.kthomas.project0.model;

public class v_room {
    //Room objects instantiated here.

    int roomID;
    boolean isSpawnable;
    int whoNorthDoor;
    int whoSouthDoor;
    int whoEastDoor;
    int whoWestDoor;
    String roomdesc;

    //Will need handles to objects stored, if present.
    //Will need handles to entities stored, if present.

    public v_room(int id, boolean spawn, int north, int south, int east, int west, String desc) {

        roomID = id;
        isSpawnable = spawn;
        whoNorthDoor = north;
        whoSouthDoor = south;
        whoEastDoor = east;
        whoWestDoor = west;
        roomdesc = desc;

    }

    public int getRoomID() {
        return roomID;
    }

    public boolean isSpawnable() {
        return isSpawnable;
    }

    public int getWhoNorthDoor() {
        return whoNorthDoor;
    }

    public int getWhoSouthDoor() {
        return whoSouthDoor;
    }

    public int getWhoEastDoor() {
        return whoEastDoor;
    }

    public int getWhoWestDoor() {
        return whoWestDoor;
    }

    public String getRoomdesc() {
        return roomdesc;
    }

}
