/* doesn't work with source level 1.8:
module com.mycompany.studentgradesystem {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.studentgradesystem to javafx.fxml;
    exports com.mycompany.studentgradesystem;
}
*/
