/*
* File: Worker.java
* Author: Tóth Júlia
* Copyright: 2022, Tóth Júlia
* Group: Szoft 1/n
* Date: 2022-05-31
* Github: https://github.com/haribomaci/
* Licenc: GNU GPL
*/

package models;

public class Worker {
    public int id;
    public String name;
    public int groupId;
    public Worker(int id, String name, int groupId) {
        this.id = id;
        this.name = name;
        this.groupId = groupId;
    }
    
}

