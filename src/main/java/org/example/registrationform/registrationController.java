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

    /* Regex patterns for validations*/

    //min 2 max 25 {2,25}, this makes sure we have every character [A-Za-z]
    private final String nameRegex = "^([A-Za-z]{2,25})\\s+([A-Za-z]{2,25})$";

    // MM/DD/YYYY format.
    private final String dobRegex = "^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/\\d{4}$";

    // +@farmingdale\.edu this makes sure that the user will enter the following "@farmingdale.edu".
    private final String emailRegex = "^[A-Za-z0-9+_.-]+@farmingdale\\.edu$";

    // 5-digit Zip Code.
    private final String zipRegex = "^\\d{5}$";

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
    public void initialize() {
        addBtn.setDisable(true); // first disabled, later if all true, enable!

    }

    @FXML
    void add(ActionEvent event) {

    }

}