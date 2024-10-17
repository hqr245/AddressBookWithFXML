module es.ieslosmontecillos.addressbookwithfxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.addressbookwithfxml to javafx.fxml;
    exports es.ieslosmontecillos.addressbookwithfxml;
}