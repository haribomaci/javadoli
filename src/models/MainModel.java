package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {
    beo[] groupArray = {
        new beo(1, "Szerelő"),
        new beo(2, "Postás"),
        new beo(3, "Takarító"),
        new beo(4, "Informatikus"),
        new beo(5, "Újságíró"),
        new beo(6, "Tanár"),
        new beo(7, "Szakács"),
        new beo(8, "Gépész"),
        new beo(9, "Eladó"),
        new beo(10, "Búvár"),

    };
    public Vector<beo> groupList = new Vector<>(Arrays.asList(groupArray));
    Worker[]workerArray={//csináltunk egy listát és definiáltuk hogy mi van benne
        new Worker(1, "Takáts Máté", 5),
        new Worker(2, "Sípos Zoltán", 4),
        new Worker(3, "Ferencz Attila", 5),
        new Worker(4, "Bognár Mónika", 6),
        new Worker(5, "Kiss Éva", 9),
        new Worker(6, "Nagy Maja", 3),
        new Worker(7, "Afgócs Dávid", 3),
        new Worker(8, "Ölbey Vajk", 4),
        new Worker(9, "Kőrösi Virág", 10),
        new Worker(10, "Dudás Zsófia", 6),


    };
    public Vector<Worker>workerList = new Vector<>(Arrays.asList(workerArray));
    
}

