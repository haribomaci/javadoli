package controllers;

import models.MainModel;
import models.Worker;
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
        this.mainModel.workerList.forEach(student -> {
            if(selectedgroupId == .groupId){
            //System.out.println(student.name);
            this.mainFrame.workerModel.addElement(student.name);


            }

        });
    }
    
}
