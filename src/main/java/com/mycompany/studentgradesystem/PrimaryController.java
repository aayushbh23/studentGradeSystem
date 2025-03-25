package com.mycompany.studentgradesystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PrimaryController implements IExitable{

    // Primary Controller Code
    
    TextArea outputTextArea = this.outputTextArea;
    //outputTextArea.setWrapText(true);
    
    @FXML
    private void displayAllGrades(ActionEvent event){
        // 
    } 
    
    @FXML
    private void findStudentId(ActionEvent event){
        // 
    } 
    
    @FXML
    private void resultsInMarkRange(ActionEvent event){
        // 
    } 
    
    @FXML
    private void displayStatistics(ActionEvent event){
        // 
    } 
    
    @FXML
    private void clearButton(ActionEvent event){
        outputTextArea.clear();
    } 
    
    @FXML
    private void exitButtonClick(ActionEvent event){
        this.exitClick(); 
    }  
}
