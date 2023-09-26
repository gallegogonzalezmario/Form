module es.ieslosmontecillos.form {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.form to javafx.fxml;
    exports es.ieslosmontecillos.form;
}