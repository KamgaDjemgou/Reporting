package org.ensak.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;


public class PagePrincipaleController implements Initializable {
    private static final String COLORED_STYLE = "-fx-background-color:#FF8C00";
    private static final String NORMAL_STYLE = "-fx-background-color:#073763";
    public Button goEmployes;
    public Button goProcedures;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        onHoverAction(goEmployes);
        onHoverAction(goProcedures);
    }

    public void onEmployes(ActionEvent actionEvent) {
    }

    public void onProcedures(ActionEvent actionEvent) {
    }

    public static void onHoverAction(Button button){
        button.addEventHandler(MouseEvent.MOUSE_ENTERED,
                e -> button.setStyle(COLORED_STYLE));

        button.addEventHandler(MouseEvent.MOUSE_EXITED,
                e -> button.setStyle(NORMAL_STYLE));
    }

    public void onDownload(ActionEvent actionEvent) {

    }
}
