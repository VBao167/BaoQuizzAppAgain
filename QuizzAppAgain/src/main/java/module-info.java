module com.knvb.quizzappagain {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.knvb.quizzappagain to javafx.fxml;
    exports com.knvb.quizzappagain;
}
