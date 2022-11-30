module com.myfx.myfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.myfx.sikacard to javafx.fxml;
    exports com.myfx.sikacard;
    exports com.myfx.sikacard.Controllers;
    exports com.myfx.sikacard.Controllers.Admin;
    exports com.myfx.sikacard.Controllers.Client;
    exports com.myfx.sikacard.Views;
    exports com.myfx.sikacard.Models;
    opens com.myfx.sikacard.Controllers to javafx.fxml;
}