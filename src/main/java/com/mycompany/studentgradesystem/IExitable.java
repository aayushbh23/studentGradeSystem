/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.studentgradesystem;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 *
 * @author 12157470
 */
public interface IExitable {
    @FXML
    default void exitClick(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to Exit?");
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
              Platform.exit();
            }
        });
     }
}
