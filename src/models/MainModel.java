package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {
    Group[] groupArray = {
        new Group(1, "11a"),
        new Group(2, "9a"),
        new Group(3, "10a"),
        new Group(4, "9b"),
        new Group(5, "10b"),

    };
    public Vector<Group> groupList = new Vector<>(Arrays.asList(groupArray));
    Worker[]workerArray={//csináltunk egy listát és definiáltuk hogy mi van benne
        new Worker(),
        new Worker(),
        new Worker(),
        new Worker(),
        new Worker(),
        new Worker(),
        new Worker(),
        new Worker(),

    };
    public Vector<Worker>workerList = new Vector<>(Arrays.asList(workerArray));
    
}

