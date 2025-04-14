package org.example.registrationform;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class registrationController {

    /* These are the fields*/
    @FXML
    private TextField zipCode, dateOfBrith, email, firstAndLastName;

    @FXML
    /* the add button responsible for all the fields validation*/
    private Button addBtn;

    //todo
    //First Name and Last Name: Minimum of 2 characters and maximum of 25 characters.
    //Date of Birth: Should be in MM/DD/YYYY format.
    //Email: Should accept only the Farmingdale valid email addresses.
    //Zip Code: Should be 5-digit numbers.

    //todo
    //Enable the "Add" button only if all fields contain valid data.
    //Otherwise it should remain disabled (grayed out).
    //if every entry is valid then, enable.

    @FXML
    void add(ActionEvent event) {

    }

}