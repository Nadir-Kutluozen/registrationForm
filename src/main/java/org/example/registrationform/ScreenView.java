package org.example.registrationform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;



public class ScreenView {

    @FXML
    public Label userNamelabel;

    public void setUserName(String userName) {
        userNamelabel.setText(userName);
    }
}
