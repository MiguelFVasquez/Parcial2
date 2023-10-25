module com.example.programacion3_parcial2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;


    opens co.edu.uniquindio.pr3.parcial2.application to javafx.fxml, javafx.graphics;
    opens co.edu.uniquindio.pr3.parcial2.model to javafx.base;
    opens co.edu.uniquindio.pr3.parcial2.viewControllers to javafx.fxml;
    exports co.edu.uniquindio.pr3.parcial2.model;
}