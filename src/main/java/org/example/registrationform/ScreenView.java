package org.example.registrationform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;



public class ScreenView {

    @FXML
    public Label userNamelabel;
    public Label email, date, zipCode;

    public void setUserName(String userNameLabel) {
        userNamelabel.setText(userNameLabel);
    }
    public void setEmail(String emailLabel) {
        email.setText(emailLabel);
    }
    public void setDate(String dateLabel) {
        date.setText(dateLabel);
    }
    public void setZipCode(String zipCodeLabel) {
        zipCode.setText(zipCodeLabel);
    }
}
