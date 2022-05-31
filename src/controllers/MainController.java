/*
* File: MainController.java
* Author: Tóth Júlia
* Copyright: 2022, Tóth Júlia
* Group: Szoft 1/n
* Date: 2021-09-03
* Github: https://github.com/haribomaci/
* Licenc: GNU GPL
*/

package controllers;

import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
        this.mainFrame.groupModel.addElement("Válasszon beosztást!");
        this.mainModel.groupList.forEach(group ->{
            this.mainFrame.groupModel.addElement(group.name);
        });
        this.setEvents();

    }
    private void setEvents(){
        this.mainFrame.groupCombo.addActionListener(e -> onActionGroupCombo());

    }
    private void onActionGroupCombo(){
        int index = this.mainFrame.groupCombo.getSelectedIndex();
        int selectedgroupId = index;
        this.mainFrame.workerModel.clear();
        this.mainModel.workerList.forEach(worker -> {
            if(selectedgroupId == worker.groupId){
            //System.out.println(student.name);
            this.mainFrame.workerModel.addElement(worker.name);


            }

        });
    }
    
}
