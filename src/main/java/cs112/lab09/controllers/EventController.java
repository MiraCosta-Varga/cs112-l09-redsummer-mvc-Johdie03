package cs112.lab09.controllers;

import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class EventController {
    //non FXML stuff
    private RevisedHistoricalEvent redSummerEvent;
    private String location;

    protected void initData(String location, RevisedHistoricalEvent historicalEvent){
    this.location = location;
    this.redSummerEvent = historicalEvent; //deep copy!

    locationLabel.setText(this.location);
    dataLabel.setText(this.redSummerEvent.getEventDay().toString());
    descriptionLabel.setText(this.redSummerEvent.getDescription());
    revisedDescriptionLabel.setText(this.redSummerEvent.getRevisedDescription());

    }


    //FXML stuff
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
    protected void onCloseButtonClicked(ActionEvent actionEvent){
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }



}
