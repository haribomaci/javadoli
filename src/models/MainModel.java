/*
* File: MainModel.java
* Author: Tóth Júlia
* Copyright: 2022, Tóth Júlia
* Group: Szoft 1/n
* Date: 2022-05-31
* Github: https://github.com/haribomaci/
* Licenc: GNU GPL
*/

package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {
    Beo[] groupArray = {
        new Beo(1, "Szerelő"),
        new Beo(2, "Postás"),
        new Beo(3, "Takarító"),
        new Beo(4, "Informatikus"),
        new Beo(5, "Újságíró"),
        new Beo(6, "Tanár"),
        new Beo(7, "Szakács"),
        new Beo(8, "Gépész"),
        new Beo(9, "Eladó"),
        new Beo(10, "Búvár"),

    };
    public Vector<Beo> groupList = new Vector<>(Arrays.asList(groupArray));
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

