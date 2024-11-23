package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import cs112.lab09.models.Date;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;


import java.io.IOException;

public class MapController {
    //Note: redundance in methods!

    @FXML
    protected void onSanFranciscoCaButtonClick() throws IOException {
        //get FXML file for popup window (even-view.fxml)
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApplication.class.getResource("event-view.fxml"));
        Parent eventViewParent = loader.load();

        //pass data to controller for that view!
        EventController eventController = loader.getController();
        eventController.initData("San Francisco, CA",
                new RevisedHistoricalEvent(
                        "a minor riot between Black and white soldiers occured in the presidio in San Francisco",
                        new Date(5,15,1919),
                        "a minor riot between Black and white soldiers occured in the Presidio in San Francisco after a ...",
                        "https://cdr.lib.unc.edu/downloads/1c18dm56?locale=en")
                        );


        //create a new stage for my popup window
        Stage popupStage = new Stage();

        //extra step: change modality of window
        popupStage.initModality(Modality.APPLICATION_MODAL);

        //set scene
        popupStage.setScene(new Scene(eventViewParent));

        //show scene
        popupStage.show();

    }

    @FXML
    protected void onBrisbeeAzButtonClick() throws IOException {
        //get FXML file for popup window (even-view.fxml)
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApplication.class.getResource("event-view.fxml"));
        Parent eventViewParent = loader.load();

        //pass data to controller for that view!
        EventController eventController = loader.getController();
        eventController.initData("San Francisco, CA",
                new RevisedHistoricalEvent(
                        "Local police in Bisbee, Arizona attacked the 10th U.S. Cavalry, an African-American unit known as the...",
                        new Date(7,13,1919),
                        "Although Sorces are limited, the attack occured on the eve of celebrations meant to honor returning soldiers ...",
                        "https://cdr.lib.unc.edu/downloads/1c18dm56?locale=en")
        );

        //create a new stage for my popup window
        Stage popupStage = new Stage();

        //extra step: change modality of window
        popupStage.initModality(Modality.APPLICATION_MODAL);

        //set scene
        popupStage.setScene(new Scene(eventViewParent));

        //show scene
        popupStage.show();

    }


}
