package org.example.registrationform;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

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

    /**
     * initialize() disables the btn first, then add all the
     * FocusListener to the textfields.
     */
    @FXML
    public void initialize() {
        addBtn.setDisable(true); // first disabled, later if all true, enable!

        addFocusListener(firstAndLastName, nameRegex);
        addFocusListener(dateOfBrith, dobRegex);
        addFocusListener(email, emailRegex);
        addFocusListener(zipCode, zipRegex);

    }

    /**
     * addFocusListener - add listener so that when we lose focus,
     * we can indicate that there is an error occurred.
     * @param field the selected TextField
     * @param regex regex pattern
     */
    private void addFocusListener(TextField field, String regex) {
        field.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) { // When the field loses focus.
                if (!field.getText().matches(regex)) {
                    field.setStyle("-fx-background-color: #ffcccc;");
                } else {
                    // Clear the error style if the input is valid.
                    field.setStyle(null);
                }
                // After each validation
                validateForm();
            }
        });
    }

    /**
     * validateForm - checks all the patterns and if true, enable the add btn.
     */
    private void validateForm() {
        boolean namesValid = firstAndLastName.getText().matches(nameRegex);
        boolean dobValid = dateOfBrith.getText().matches(dobRegex);
        boolean emailValid = email.getText().matches(emailRegex);
        boolean zipValid = zipCode.getText().matches(zipRegex);

        // Enable the Add button if everything is true!
        addBtn.setDisable(!(namesValid && dobValid && emailValid && zipValid));
    }
    /**
     * Handles the Add button action.
     *
     * @param event The ActionEvent
     * @throws IOException if the FXML file is not loading.
     */
    @FXML
    void add(ActionEvent event) throws IOException {
        // Load the new FXML file.
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/registrationForm/screen-view.fxml"));
        Parent root = loader.load();
        ScreenView screenViewController = loader.getController();

        screenViewController.setUserName(firstAndLastName.getText());
        screenViewController.setEmail(email.getText());
        screenViewController.setDate(dateOfBrith.getText());
        screenViewController.setZipCode(zipCode.getText());

        Scene newScene = new Scene(root);
        Stage currentStage = (Stage) addBtn.getScene().getWindow();
        currentStage.setScene(newScene);
        currentStage.setTitle("new page!");
    }

}