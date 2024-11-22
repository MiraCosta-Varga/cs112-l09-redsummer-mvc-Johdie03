package cs112.lab09.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;


public class EventController {

    @FXML
    private Button closeButton;
    @FXML
    private Label locationLabel;
    @FXML
    private Label dataLabel;
    @FXML
    private Label descriptionLabel;
    @FXML
    private Label revisedDescriptionLabel;

    @FXML
    protected void onCloseButtonClicked(){
        System.out.println ("closed window with button!");
    }



}
